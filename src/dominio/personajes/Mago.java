package dominio.personajes;

import java.util.concurrent.ThreadLocalRandom;

public class Mago extends PersonajeBase {

    public Mago(String nombre) {
        super(
                nombre,
                "Mago",
                100,
                "Mana",
                generarMana(),
                "Daño mágico",
                20
        );
    }

    private static int generarMana() {
        return ThreadLocalRandom.current().nextInt(50, 101);
    }
}