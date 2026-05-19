package dominio.equipamiento;

import dominio.personajes.Personaje;

public class HachaDosManos implements Arma {

    private final String nombre;
    private final int daño;

    public HachaDosManos() {
        this.nombre = "Hacha de dos manos";
        this.daño = 45;
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
        System.out.println(portador.getNombre() + " usa " + nombre + " contra " + objetivo.getNombre() + ".");
        objetivo.recibirDaño(portador.getDañoAtaque());
    }
}