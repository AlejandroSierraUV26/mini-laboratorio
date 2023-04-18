package logica;

public class Gato extends Mascota{
    public Gato(String nombre,byte numero_patas,byte años,byte cantidad_vacunas, 
    int precio,String raza,Pais_Origen pais_origen,String color){
        super(nombre,numero_patas,años,precio,raza,pais_origen,color);
    }
    public void MostrarDatos(){
        System.out.println("Nombre: " + getNombre()+"\n" 
                        +  "Numero de patas : " + getNumero_patas()+"\n"
                        +  "Años : "+ getAños() +"\n"
                        +  "Cantidad de Vacunas : " + getCantidad_vacunas()+ "\n"
                        +  "Precio : "+ getPrecio() +"\n"
                        +  "Raza : " + getRaza() +"\n"
                        +  "Pais Origen : " + getPais_origen() +"\n"                
                        +  "Color Pelage : "+ getColor()); 
    }
}
