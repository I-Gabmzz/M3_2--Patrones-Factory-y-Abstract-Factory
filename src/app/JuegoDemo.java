package app;

import dominio.personajes.Personaje;
import fabricas.equipamiento.FabricaEquipamiento;
import interfaz.MenuJugador;
import servicios.EquipadorPersonaje;
import servicios.SimuladorCombate;

public class JuegoDemo {

    public static void main(String[] args) {
        // Clase principal: coordina el flujo completo del programa.
        MenuJugador menu = new MenuJugador();
        EquipadorPersonaje equipador = new EquipadorPersonaje();
        SimuladorCombate simuladorCombate = new SimuladorCombate();

        // Factory Method: creación del personaje seleccionado por el usuario.
        Personaje personaje = menu.crearPersonajeDesdeMenu();

        System.out.println();
        System.out.println("--- PERSONAJE CREADO ---");
        personaje.mostrarInfo();

        // Abstract Factory: selección de la familia completa de equipamiento.
        FabricaEquipamiento fabricaEquipamiento = menu.seleccionarEquipamientoDesdeMenu();

        // Se equipa al personaje y se muestran sus estadísticas actualizadas.
        equipador.equipar(personaje, fabricaEquipamiento);

        // Se realiza una prueba básica de combate contra un Goblin.
        simuladorCombate.simularCombate(personaje);

        menu.cerrar();
    }
}