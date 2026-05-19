package servicios;

import dominio.personajes.Goblin;
import dominio.personajes.Personaje;

public class SimuladorCombate {

    public void simularCombate(Personaje personaje) {
        Personaje goblin = new Goblin();

        System.out.println();
        System.out.println("¡COMBATE DE PRUEBA!");
        System.out.println(personaje.getNombre() + " ataca a un " + goblin.getNombre() + "...");

        if (personaje.getArma() != null) {
            personaje.getArma().usar(personaje, goblin);
        } else {
            personaje.atacar(goblin);
        }

        if (goblin.estaVivo()) {
            System.out.println(goblin.getNombre() + " sobrevivió con " + goblin.getVida() + " puntos de vida.");
        } else {
            System.out.println("¡Golpe crítico! " + goblin.getNombre() + " ha sido derrotado.");
        }
    }
}