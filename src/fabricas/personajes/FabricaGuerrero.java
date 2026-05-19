package fabricas.personajes;

import dominio.personajes.Guerrero;
import dominio.personajes.Personaje;

public class FabricaGuerrero implements FabricaPersonajes {

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Guerrero(nombre);
    }
}