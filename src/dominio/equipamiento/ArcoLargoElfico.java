package dominio.equipamiento;

import dominio.personajes.Personaje;

public class ArcoLargoElfico implements Arma {

    private final String nombre;
    private final int daño;

    public ArcoLargoElfico() {
        this.nombre = "Arco largo élfico";
        this.daño = 35;
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
        System.out.println(portador.getNombre() + " dispara con " + nombre + " hacia " + objetivo.getNombre() + ".");
        objetivo.recibirDaño(portador.getDañoAtaque());
    }
}