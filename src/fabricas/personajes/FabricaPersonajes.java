package fabricas.personajes;

import dominio.personajes.Personaje;

public interface FabricaPersonajes {

    Personaje crearPersonaje(String nombre);
}