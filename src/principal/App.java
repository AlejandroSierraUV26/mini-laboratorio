package principal;

import logica.Gato;
import logica.Pais_Origen;
import logica.Perro;
import logica.Raza;
import logica.Vacunas;

public class App {
    public static void main(String[] args) throws Exception {
        Perro perro1 = new Perro("Kira", (byte)4, (byte)5, (byte)2, 5000000, Raza.Labradores, Pais_Origen.Colombia, Vacunas.rabia,"Dorado");
        perro1.MostrarDatos();
        Gato gato1 = new Gato("Mia", (byte)4, (byte)5, (byte)2, 5000000, Raza.Labradores, Pais_Origen.Colombia, Vacunas.rabia,"Dorado");
        gato1.MostrarDatos();
        
    }
}
