package fabricas.personajes;

import dominio.personajes.Mago;
import dominio.personajes.Personaje;

public class FabricaMago implements FabricaPersonajes {

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Mago(nombre);
    }
}