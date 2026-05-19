package dominio.personajes;

import java.util.concurrent.ThreadLocalRandom;

public class Arquero extends PersonajeBase {

    public Arquero(String nombre) {
        super(
                nombre,
                "Arquero",
                100,
                "Puntería",
                generarPunteria(),
                "Puntería",
                0
        );
    }

    private static int generarPunteria() {
        return ThreadLocalRandom.current().nextInt(70, 91);
    }
}