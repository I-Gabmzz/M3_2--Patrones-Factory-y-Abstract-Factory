package interfaz;

import dominio.personajes.Personaje;
import fabricas.equipamiento.FabricaDemoniaca;
import fabricas.equipamiento.FabricaElfica;
import fabricas.equipamiento.FabricaEquipamiento;
import fabricas.equipamiento.FabricaVikinga;
import fabricas.personajes.FabricaArquero;
import fabricas.personajes.FabricaGuerrero;
import fabricas.personajes.FabricaMago;
import fabricas.personajes.FabricaPersonajes;

import java.util.Scanner;

public class MenuJugador {

    private final Scanner scanner;

    public MenuJugador() {
        scanner = new Scanner(System.in);
    }

    public Personaje crearPersonajeDesdeMenu() {
        mostrarEncabezado();

        System.out.println("Selecciona tu clase:");
        System.out.println("1. Guerrero (Fuerza bruta)");
        System.out.println("2. Mago (Poder arcano)");
        System.out.println("3. Arquero (Precisión letal)");

        int opcion = leerOpcion("Opción: ", 1, 3);
        FabricaPersonajes fabrica = obtenerFabricaPersonaje(opcion);

        System.out.print("Ingresa el nombre de tu personaje: ");
        String nombre = scanner.nextLine();

        while (nombre.trim().isEmpty()) {
            System.out.print("El nombre no puede estar vacío. Ingresa otro nombre: ");
            nombre = scanner.nextLine();
        }

        return fabrica.crearPersonaje(nombre);
    }

    public FabricaEquipamiento seleccionarEquipamientoDesdeMenu() {
        System.out.println();
        System.out.println("Selecciona tu estilo de equipamiento:");
        System.out.println("1. Vikingo (+15 Fuerza)");
        System.out.println("2. Élfico (+20 Puntería)");
        System.out.println("3. Demoníaco (+25 Daño mágico)");

        int opcion = leerOpcion("Opción: ", 1, 3);
        return obtenerFabricaEquipamiento(opcion);
    }

    public void cerrar() {
        scanner.close();
    }

    private void mostrarEncabezado() {
        System.out.println("=== GUILD QUEST STUDIOS - CREADOR DE PERSONAJES ===");
        System.out.println();
    }

    private int leerOpcion(String mensaje, int minimo, int maximo) {
        int opcion;

        while (true) {
            System.out.print(mensaje);

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion >= minimo && opcion <= maximo) {
                    return opcion;
                }
            } else {
                scanner.nextLine();
            }

            System.out.println("Opción inválida. Intenta nuevamente.");
        }
    }

    private FabricaPersonajes obtenerFabricaPersonaje(int opcion) {
        switch (opcion) {
            case 1:
                return new FabricaGuerrero();
            case 2:
                return new FabricaMago();
            case 3:
                return new FabricaArquero();
            default:
                throw new IllegalArgumentException("Opción de personaje no válida.");
        }
    }

    private FabricaEquipamiento obtenerFabricaEquipamiento(int opcion) {
        switch (opcion) {
            case 1:
                return new FabricaVikinga();
            case 2:
                return new FabricaElfica();
            case 3:
                return new FabricaDemoniaca();
            default:
                throw new IllegalArgumentException("Opción de equipamiento no válida.");
        }
    }
}