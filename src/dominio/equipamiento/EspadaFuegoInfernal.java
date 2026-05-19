package dominio.equipamiento;

import dominio.personajes.Personaje;

public class EspadaFuegoInfernal implements Arma {

    private final String nombre;
    private final int daño;

    public EspadaFuegoInfernal() {
        this.nombre = "Espada de fuego infernal";
        this.daño = 50;
    }

    @Override
    public int getDaño() {
        return daño;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void usar(Personaje portador, Personaje objetivo) {
        System.out.println(portador.getNombre() + " ataca con " + nombre + " a " + objetivo.getNombre() + ".");
        objetivo.recibirDaño(portador.getDañoAtaque());
    }
}