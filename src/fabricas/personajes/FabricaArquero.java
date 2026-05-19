package fabricas.personajes;

import dominio.personajes.Arquero;
import dominio.personajes.Personaje;

public class FabricaArquero implements FabricaPersonajes {

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Arquero(nombre);
    }
}