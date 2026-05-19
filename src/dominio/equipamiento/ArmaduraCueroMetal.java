package dominio.equipamiento;

import dominio.personajes.Personaje;

public class ArmaduraCueroMetal implements Armadura {

    private final String nombre;
    private final int defensa;

    public ArmaduraCueroMetal() {
        this.nombre = "Armadura de cuero y metal";
        this.defensa = 30;
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