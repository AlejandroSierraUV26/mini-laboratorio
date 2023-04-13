package principal;

import javax.swing.JOptionPane;
import logica.Gato;
import logica.Pais_Origen;
import logica.Perro;
import logica.Raza;
import logica.Vacunas;
public class App {
    public static void Insertar_Mascota() {
        String nombre,color;
        byte numero_patas, años, cantidad_vacunas;
        int precio,opcion,opcion_animal;
        Raza raza;
        Pais_Origen pais_origen;
        Vacunas vacuna;
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre de su mascota");
        color = JOptionPane.showInputDialog(null,"Ingrese el color de su mascota");
        numero_patas = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese el numero de piernas de su mascota"));
        años = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese el año de su mascota"));
        cantidad_vacunas = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese la cantidad de vacunas de su mascota"));
        precio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de su mascota"));
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que raza es su animal"));
        switch(opcion){
            case 1:raza = Raza.Labradores;break;
            case 2:raza = Raza.Pastor;break;
            case 3:raza = Raza.Pub;break;
            case 4:raza = Raza.Tacita;break;
            default: raza = null;break;
        }
        opcion = 0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que pais de origen es su animal"));
        switch(opcion){
            case 1:pais_origen = Pais_Origen.Alemania;break;
            case 2:pais_origen = Pais_Origen.Colombia;break;
            case 3:pais_origen = Pais_Origen.USA;break;
            case 4:pais_origen = Pais_Origen.España;break;
            case 5:pais_origen = Pais_Origen.Inglaterra;break;
            default:pais_origen =null;break;
        }
        //Puede ser una o pueden ser varias.
        //Por ahora solo van a ser una
        if(cantidad_vacunas >0){
            opcion = 0;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que vacuna tiene su animal"));
            switch(opcion){
                case 1:vacuna = Vacunas.distemper;break;
                case 2:vacuna = Vacunas.malota;break;
                case 3:vacuna = Vacunas.moquillo;break;
                case 4:vacuna = Vacunas.parvovirus;break;
                default:vacuna =null;break;
            }
        }
        else{
            vacuna = null;
        }

        opcion_animal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que mascota:\n1. Perro \n2. Gato"));
        if(opcion_animal == 1){        
            Perro perro1 = new Perro(nombre,numero_patas,años,cantidad_vacunas,precio,raza,pais_origen,vacuna,color);
            perro1.MostrarDatos();
            JOptionPane.showMessageDialog(null, "Usted eligio Perro", null, 0);
        }
        
    }
    public static void Actualizar_Mascota() {
        System.out.println("Esta Opcion Actualizara los datos de su mascota");
    }
    public static void Eliminar_Mascota() {
        System.out.println("Esta Opcion Eliminara a su mascota de la veterinaria");
    }
    public static void Buscar_Mascota() {
        System.out.println("Esta Opcion sera para Buscar su mascota, dando sus datos.|");
    }
    public static void Listar_Todas_Mascotas() {
        System.out.println("Esta Opcion sera para Mostrar todos las mascotas existentes");
    }
    public static void Opciones_Funcionales() {
        System.out.println("Opcion 1: Que mascota tienen la vacuna malota");
        System.out.println("Opcion 2: Cual es el top 5 de las mascotas más costosas");
        System.out.println("Opcion 3: Que mascotas no tienen país de origen en latinoamérica");
    }
    public static void VacunaMalota(){
        System.out.println("Muestra que mascotas tienen la vacuna malota");
    }
    public static void Mayor_Precio_Mascotas(){
        System.out.println("Muestra el top 5 de las mascotas mas costosas");
    }
    public static void Lista_Origen_Mascotas(){
        System.out.println("Lista origen mascotas");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestra veterinaria");
        String opcion ="",opcion2 ="";
        opcion = JOptionPane.showInputDialog("Seleccione la opcion que desea: \n1. Insertar mascota\n2. Actualizar mascota\n3. Eliminar mascota\n4. Buscar mascota por nombre\n5. Listar todas las mascotas", null);
        switch(opcion){
            case "1":Insertar_Mascota();break;
            case "2":Actualizar_Mascota();break;
            case "3":Eliminar_Mascota();break;
            case "4":Buscar_Mascota();break;
            case "5":Listar_Todas_Mascotas();break;
            default:
            break;
        }
        opcion2 = JOptionPane.showInputDialog("Seleccione la opcion que desea: \n1. Qué mascotas tienen la vacuna malota\n2. Cual es el top 5 de las mascotas más costosas.\n3. Que mascotas no tienen país de origen en latinoamérica.", null);
        switch (opcion2) {
            case "1":VacunaMalota();break;
            case "2":Mayor_Precio_Mascotas();break;
            case "3":Lista_Origen_Mascotas();break;
            default:
                break;
        }
        
        /*
        System.out.println("\n\n");
        Perro perro1 = new Perro("Kira", (byte)4, (byte)5, (byte)2, 5000000, Raza.Labradores, Pais_Origen.Colombia, Vacunas.rabia,"Dorado");
        perro1.MostrarDatos();
        Gato gato1 = new Gato("Mia", (byte)4, (byte)5, (byte)2, 5000000, Raza.Labradores, Pais_Origen.Colombia, Vacunas.rabia,"Dorado");
        gato1.MostrarDatos();
         */
    }
}
