package logica;

public class Perro extends Mascota{
    public Perro(String nombre,byte numero_patas,byte años,byte cantidad_vacunas, 
    int precio,Raza raza,Pais_Origen pais_origen,
    Vacunas vacuna,String color){
        super(nombre,numero_patas,años,cantidad_vacunas,precio,raza,pais_origen, vacuna, color);
    }

    public void MostrarDatos(){
        System.out.println("Nombre: " + getNombre()+"\n" 
                        +  "Numero de patas : " + getNumero_patas()+"\n"
                        +  "Años : "+ getAños() +"\n"
                        +  "Cantidad de Vacunas : " + getCantidad_vacunas()+ "\n"
                        +  "Precio : "+ getPrecio() +"\n"
                        +  "Raza : " + getRaza() +"\n"
                        +  "Pais Origen : " + getPais_origen() +"\n"                
                        +  "Vacunas : "+ getVacuna() +"\n"
                        +  "Color Pelage : "+ getColor()); 
    }
}
