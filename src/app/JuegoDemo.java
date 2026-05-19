package app;

import dominio.personajes.Personaje;
import fabricas.equipamiento.FabricaEquipamiento;
import interfaz.MenuJugador;
import servicios.EquipadorPersonaje;
import servicios.SimuladorCombate;

public class JuegoDemo {

    public static void main(String[] args) {
        MenuJugador menu = new MenuJugador();
        EquipadorPersonaje equipador = new EquipadorPersonaje();
        SimuladorCombate simuladorCombate = new SimuladorCombate();

        Personaje personaje = menu.crearPersonajeDesdeMenu();

        System.out.println();
        System.out.println("--- PERSONAJE CREADO ---");
        personaje.mostrarInfo();

        FabricaEquipamiento fabricaEquipamiento = menu.seleccionarEquipamientoDesdeMenu();

        equipador.equipar(personaje, fabricaEquipamiento);

        simuladorCombate.simularCombate(personaje);

        menu.cerrar();
    }
}