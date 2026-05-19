package dominio.personajes;

import java.util.concurrent.ThreadLocalRandom;

public class Arquero extends PersonajeBase {

    public Arquero(String nombre) {
        this(nombre, generarPunteria());
    }

    private Arquero(String nombre, int punteria) {
        super(
                nombre,
                "Arquero",
                100,
                "Puntería",
                punteria,
                "Puntería",
                punteria
        );
    }

    private static int generarPunteria() {
        return ThreadLocalRandom.current().nextInt(70, 91);
    }
}