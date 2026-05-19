package dominio.personajes;

import java.util.concurrent.ThreadLocalRandom;

public class Guerrero extends PersonajeBase {

    public Guerrero(String nombre) {
        this(nombre, generarFuerza());
    }

    private Guerrero(String nombre, int fuerza) {
        super(
                nombre,
                "Guerrero",
                100,
                "Fuerza",
                fuerza,
                "Fuerza",
                fuerza
        );
    }

    private static int generarFuerza() {
        return ThreadLocalRandom.current().nextInt(15, 21);
    }
}