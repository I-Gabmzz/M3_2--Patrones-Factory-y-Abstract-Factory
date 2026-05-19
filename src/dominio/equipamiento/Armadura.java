package dominio.equipamiento;

import dominio.personajes.Personaje;

public interface Armadura {

    int getDefensa();

    String getNombre();

    void proteger(Personaje portador, int daño);
}