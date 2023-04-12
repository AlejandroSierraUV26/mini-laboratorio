package principal;

import javax.swing.JOptionPane;
import logica.Gato;
import logica.Pais_Origen;
import logica.Perro;
import logica.Raza;
import logica.Vacunas;
public class App {
    public static void Insertar_Mascota() {
        System.out.println("Bienvenido a nuestra veterinaria");
        System.out.println("Esta Opcion sera para ingresar su mascota");
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
    public static void main(String[] args) throws Exception {
        String opcion ="";
        opcion = JOptionPane.showInputDialog("Ingrese que opcion desea: ", null);
        switch(opcion){
            case "1":
                Insertar_Mascota();
                break;
            case "2":
                Actualizar_Mascota();
                break;
            case "3":
                Eliminar_Mascota();
                break;
            case "4":
                Buscar_Mascota();
                break;
            case "5":
                Listar_Todas_Mascotas();
                break;
        }
        

        System.out.println("\n\n");
        Perro perro1 = new Perro("Kira", (byte)4, (byte)5, (byte)2, 5000000, Raza.Labradores, Pais_Origen.Colombia, Vacunas.rabia,"Dorado");
        perro1.MostrarDatos();
        Gato gato1 = new Gato("Mia", (byte)4, (byte)5, (byte)2, 5000000, Raza.Labradores, Pais_Origen.Colombia, Vacunas.rabia,"Dorado");
        gato1.MostrarDatos();
        
    }
}
