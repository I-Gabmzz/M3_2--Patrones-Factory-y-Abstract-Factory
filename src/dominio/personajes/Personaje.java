package dominio.personajes;

import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;

public interface Personaje {

    String getNombre();

    int getNivel();

    int getVida();

    void recibirDaño(int daño);

    void atacar(Personaje objetivo);

    void subirNivel();

    String getClasePersonaje();

    void mostrarInfo();

    String getResumenInfo();

    String getNombreAtributoEspecial();

    int getValorAtributoEspecial();

    int getValorBaseAtributoEspecial();

    String getNombreEstadisticaAtaque();

    int getValorEstadisticaAtaque();

    int getValorBaseEstadisticaAtaque();

    void aplicarBonus(String nombreEstadistica, int bonus);

    void equipar(Arma arma, Armadura armadura);

    Arma getArma();

    Armadura getArmadura();

    int getDañoAtaque();

    boolean estaVivo();
}