public class Perro {
    private String nombre;
    private Raza raza;
    private byte edad;
    public Perro(){

    }
    public Perro(String nombre,Raza raza,byte edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Raza getRaza() {
        return raza;
    }
    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    public byte getEdad() {
        return edad;
    }
    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
}
