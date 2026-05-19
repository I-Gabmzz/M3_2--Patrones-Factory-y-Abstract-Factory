package dominio.equipamiento;

import dominio.personajes.Personaje;

public class ArmaduraEscamasDragon implements Armadura {

    private final String nombre;
    private final int defensa;

    public ArmaduraEscamasDragon() {
        this.nombre = "Armadura de escamas de dragón";
        this.defensa = 35;
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