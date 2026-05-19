package dominio.personajes;

import java.util.concurrent.ThreadLocalRandom;

public class Guerrero extends PersonajeBase {

    public Guerrero(String nombre) {
        super(
                nombre,
                "Guerrero",
                100,
                "Fuerza",
                generarFuerza(),
                "Fuerza",
                0
        );
    }

    private static int generarFuerza() {
        return ThreadLocalRandom.current().nextInt(15, 21);
    }
}