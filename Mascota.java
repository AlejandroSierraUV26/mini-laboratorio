package logica;

public class Mascota {
    private String nombre;
    private byte numero_patas = 4;
    private byte años;
    private byte cantidad_vacunas;
    private int precio;
    private Raza raza;
    private Pais_Origen pais_origen;
    private Vacunas vacuna;
    private String color;
    public Mascota(String nombre,byte numero_patas,byte años,byte cantidad_vacunas, 
                   int precio,Raza raza,Pais_Origen pais_origen,
                   Vacunas vacuna,String color){
                    this.nombre = nombre;
                    this.numero_patas =numero_patas;
                    this.años = años;
                    this.cantidad_vacunas = cantidad_vacunas;
                    this.precio = precio;
                    this.raza = raza;
                    this.pais_origen = pais_origen;
                    this.vacuna = vacuna;
                    this.color = color;

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
    public void setCantidad_vacunas(byte cantidad_vacunas) {
        this.cantidad_vacunas = cantidad_vacunas;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(byte precio) {
        this.precio = precio;
    }
    public Raza getRaza() {
        return raza;
    }
    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    public Pais_Origen getPais_origen() {
        return pais_origen;
    }
    public void setPais_origen(Pais_Origen pais_origen) {
        this.pais_origen = pais_origen;
    }
    public Vacunas getVacuna() {
        return vacuna;
    }
    public void setVacuna(Vacunas vacuna) {
        this.vacuna = vacuna;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
