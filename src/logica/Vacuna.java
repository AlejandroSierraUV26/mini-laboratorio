package logica;

public class Vacuna {
    private String nombre;
    private byte unidades;
    public Vacuna(String nombre, byte unidades) {
        this.nombre = nombre;
        this.unidades = unidades;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public byte getUnidades() {
        return unidades;
    }
    public void setUnidades(byte unidades) {
        this.unidades = unidades;
    }
    
}
