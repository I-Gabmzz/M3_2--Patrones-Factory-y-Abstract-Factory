package dominio.equipamiento;

import dominio.personajes.Personaje;

public class TunicaHojasArbol implements Armadura {

    private final String nombre;
    private final int defensa;

    public TunicaHojasArbol() {
        this.nombre = "Túnica de hojas de árbol";
        this.defensa = 20;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void proteger(Personaje portador, int daño) {
        System.out.println(nombre + " protege a " + portador.getNombre() + " y reduce el daño en " + defensa + ".");
    }
}