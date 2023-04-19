package logica;

import java.util.ArrayList;

public class Mascota {
    private String nombre;
    private byte numero_patas = 4;
    private byte años;
    private static byte cantidad_vacunas;
    private int precio;
    private String raza;
    private Pais_Origen pais_origen;
    ArrayList <Vacuna> vacunas;
    private String color;
    public Mascota(String nombre,byte numero_patas,byte años, 
                   int precio,String raza,Pais_Origen pais_origen,
                   String color){
                    this.nombre = nombre;
                    this.numero_patas =numero_patas;
                    this.años = años;
                    this.precio = precio;
                    this.raza = raza;
                    this.pais_origen = pais_origen;
                    vacunas = new ArrayList<Vacuna>(); 
                    this.color = color;

    }
    
    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(ArrayList<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public byte getNumero_patas() {
        return numero_patas;
    }
    public void setNumero_patas(byte numero_patas) {
        this.numero_patas = numero_patas;
    }
    public byte getAños() {
        return años;
    }
    public void setAños(byte años) {
        this.años = años;
    }
    public byte getCantidad_vacunas() {
        return cantidad_vacunas;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(byte precio) {
        this.precio = precio;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Pais_Origen getPais_origen() {
        return pais_origen;
    }
    public void setPais_origen(Pais_Origen pais_origen) {
        this.pais_origen = pais_origen;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void insertarInyeccion(Vacuna vacuna){
        vacunas.add(vacuna);
        cantidad_vacunas++;
    }   
    public byte cantidad_vacunas(){
        return cantidad_vacunas;
    }
    public void imprimirVacunas(){
        System.out.println("-----------------------------------------------------------------");
        for(int i = 0; i < vacunas.size(); i++){
            System.out.println("-"+vacunas.get(i).getNombre());
        }
        System.out.println("-----------------------------------------------------------------");
    }
    public void MostrarDatos(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Datos Mascotas                          ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("            Nombre: " + getNombre()+"                            \n" 
                        +  "            Numero de patas : " + getNumero_patas()+"            \n"
                        +  "            Años : "+ getAños() +"                               \n"
                        +  "            Cantidad de Vacunas : " + getCantidad_vacunas()+ "   \n"
                        +  "            Precio : "+ getPrecio() +"                           \n"
                        +  "            Raza : " + getRaza() +"                              \n"
                        +  "            Pais Origen : " + getPais_origen() +"                \n"                
                        +  "            Color Pelage : "+ getColor()+"                       "); 
        System.out.println("----------------------------------------------------------------");
    }

}
