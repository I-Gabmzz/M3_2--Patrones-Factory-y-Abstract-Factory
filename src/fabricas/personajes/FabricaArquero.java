package fabricas.personajes;

import dominio.personajes.Arquero;
import dominio.personajes.Personaje;

public class FabricaArquero implements FabricaPersonajes {

    // Factory Method: crea un Arquero sin exponer la clase concreta al menú principal.
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Arquero(nombre);
    }
}