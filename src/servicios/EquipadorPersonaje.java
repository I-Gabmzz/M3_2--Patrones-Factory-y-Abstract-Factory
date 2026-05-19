package servicios;

import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;
import dominio.personajes.Personaje;
import fabricas.equipamiento.FabricaEquipamiento;

public class EquipadorPersonaje {

    public void equipar(Personaje personaje, FabricaEquipamiento fabricaEquipamiento) {
        // Se crean arma y armadura desde la misma fábrica para mantener la temática.
        Arma arma = fabricaEquipamiento.crearArma();
        Armadura armadura = fabricaEquipamiento.crearArmadura();

        // Se equipa al personaje con los objetos creados por Abstract Factory.
        personaje.equipar(arma, armadura);

        // Se aplica el bonus de estadística definido por la temática seleccionada.
        personaje.aplicarBonus(
                fabricaEquipamiento.getEstadisticaBonus(),
                fabricaEquipamiento.getValorBonus()
        );

        mostrarEquipamientoObtenido(arma, armadura);
        mostrarPersonajeEquipado(personaje, fabricaEquipamiento);
    }

    private void mostrarEquipamientoObtenido(Arma arma, Armadura armadura) {
        System.out.println();
        System.out.println("--- EQUIPAMIENTO OBTENIDO ---");
        System.out.println("Arma: " + arma.getNombre() + " (Daño: " + arma.getDaño() + ")");
        System.out.println("Armadura: " + armadura.getNombre() + " (Defensa: " + armadura.getDefensa() + ")");
    }

    private void mostrarPersonajeEquipado(Personaje personaje, FabricaEquipamiento fabricaEquipamiento) {
        int base = personaje.getValorBaseEstadisticaAtaque();
        int bonus = fabricaEquipamiento.getValorBonus();
        int finalEstadistica = personaje.getValorEstadisticaAtaque();
        int dañoArma = personaje.getArma().getDaño();

        System.out.println();
        System.out.println("--- " + personaje.getNombre() + " EQUIPADO ---");
        System.out.println("Temática: " + fabricaEquipamiento.getTematica());
        System.out.println("Bonus aplicado: " + fabricaEquipamiento.getBonusDescripcion());
        System.out.println("Vida: " + personaje.getVida());

        System.out.println(
                personaje.getNombreEstadisticaAtaque()
                        + ": "
                        + finalEstadistica
                        + " (" + base + " + " + bonus + ")"
        );

        System.out.println(
                "Daño de ataque: "
                        + personaje.getDañoAtaque()
                        + " (" + dañoArma + " + " + finalEstadistica + ")"
        );
    }
}