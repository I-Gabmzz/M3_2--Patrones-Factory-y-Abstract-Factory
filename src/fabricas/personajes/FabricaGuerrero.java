package fabricas.personajes;

import dominio.personajes.Guerrero;
import dominio.personajes.Personaje;

public class FabricaGuerrero implements FabricaPersonajes {

    // Factory Method: crea un Guerrero sin que el cliente instancie la clase directamente.
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Guerrero(nombre);
    }
}