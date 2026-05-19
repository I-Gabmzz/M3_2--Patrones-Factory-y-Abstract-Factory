package fabricas.personajes;

import dominio.personajes.Mago;
import dominio.personajes.Personaje;

public class FabricaMago implements FabricaPersonajes {

    // Factory Method: crea un Mago usando la interfaz general de personajes.
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Mago(nombre);
    }
}