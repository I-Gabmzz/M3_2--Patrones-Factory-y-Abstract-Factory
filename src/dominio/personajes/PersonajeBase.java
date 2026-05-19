package dominio.personajes;

import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;

public abstract class PersonajeBase implements Personaje {

    private final String nombre;
    private final String clasePersonaje;

    private int nivel;
    private int vida;

    private final String nombreAtributoEspecial;
    private final int valorBaseAtributoEspecial;
    private int valorAtributoEspecial;

    private final String nombreEstadisticaAtaque;
    private final int valorBaseEstadisticaAtaque;
    private int valorEstadisticaAtaque;

    private String nombreBonusExtra;
    private int valorBonusExtra;

    private Arma arma;
    private Armadura armadura;

    protected PersonajeBase(
            String nombre,
            String clasePersonaje,
            int vidaBase,
            String nombreAtributoEspecial,
            int valorAtributoEspecial,
            String nombreEstadisticaAtaque,
            int valorEstadisticaAtaque
    ) {
        this.nombre = nombre;
        this.clasePersonaje = clasePersonaje;
        this.nivel = 1;
        this.vida = vidaBase;

        this.nombreAtributoEspecial = nombreAtributoEspecial;
        this.valorBaseAtributoEspecial = valorAtributoEspecial;
        this.valorAtributoEspecial = valorAtributoEspecial;

        this.nombreEstadisticaAtaque = nombreEstadisticaAtaque;
        this.valorBaseEstadisticaAtaque = valorEstadisticaAtaque;
        this.valorEstadisticaAtaque = valorEstadisticaAtaque;

        this.nombreBonusExtra = "";
        this.valorBonusExtra = 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public String getClasePersonaje() {
        return clasePersonaje;
    }

    @Override
    public String getNombreAtributoEspecial() {
        return nombreAtributoEspecial;
    }

    @Override
    public int getValorAtributoEspecial() {
        return valorAtributoEspecial;
    }

    @Override
    public int getValorBaseAtributoEspecial() {
        return valorBaseAtributoEspecial;
    }

    @Override
    public String getNombreEstadisticaAtaque() {
        return nombreEstadisticaAtaque;
    }

    @Override
    public int getValorEstadisticaAtaque() {
        return valorEstadisticaAtaque;
    }

    @Override
    public int getValorBaseEstadisticaAtaque() {
        return valorBaseEstadisticaAtaque;
    }

    @Override
    public Arma getArma() {
        return arma;
    }

    @Override
    public Armadura getArmadura() {
        return armadura;
    }

    @Override
    public boolean estaVivo() {
        return vida > 0;
    }

    @Override
    public void recibirDaño(int daño) {
        int defensa = 0;

        if (armadura != null) {
            armadura.proteger(this, daño);
            defensa = armadura.getDefensa();
        }

        int dañoReal = Math.max(0, daño - defensa);
        vida = Math.max(0, vida - dañoReal);

        System.out.println(nombre + " recibe " + dañoReal + " de daño.");
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + "...");
        objetivo.recibirDaño(getDañoAtaque());
    }

    @Override
    public void subirNivel() {
        nivel++;
        vida += 20;
        valorAtributoEspecial += 5;
        valorEstadisticaAtaque += 5;

        System.out.println(nombre + " subió al nivel " + nivel + ".");
    }

    @Override
    public void aplicarBonus(String nombreEstadistica, int bonus) {
        if (sonMismaEstadistica(nombreEstadistica, nombreAtributoEspecial)) {
            valorAtributoEspecial += bonus;

            if (sonMismaEstadistica(nombreAtributoEspecial, nombreEstadisticaAtaque)) {
                valorEstadisticaAtaque += bonus;
            }

            return;
        }

        if (sonMismaEstadistica(nombreEstadistica, nombreEstadisticaAtaque)) {
            valorEstadisticaAtaque += bonus;
            return;
        }

        nombreBonusExtra = nombreEstadistica;
        valorBonusExtra += bonus;
    }

    @Override
    public void equipar(Arma arma, Armadura armadura) {
        this.arma = arma;
        this.armadura = armadura;
    }

    @Override
    public int getDañoAtaque() {
        int dañoArma = arma != null ? arma.getDaño() : 0;
        return dañoArma + valorEstadisticaAtaque;
    }

    @Override
    public String getResumenInfo() {
        StringBuilder resumen = new StringBuilder();

        resumen.append(nombre)
                .append(" el ")
                .append(clasePersonaje)
                .append(" - Nivel ")
                .append(nivel)
                .append(" | Vida: ")
                .append(vida)
                .append(" | ")
                .append(nombreAtributoEspecial)
                .append(": ")
                .append(valorAtributoEspecial);

        if (!sonMismaEstadistica(nombreAtributoEspecial, nombreEstadisticaAtaque)) {
            resumen.append(" | ")
                    .append(nombreEstadisticaAtaque)
                    .append(": ")
                    .append(valorEstadisticaAtaque);
        }

        if (!nombreBonusExtra.isEmpty()) {
            resumen.append(" | ")
                    .append(nombreBonusExtra)
                    .append(": +")
                    .append(valorBonusExtra);
        }

        return resumen.toString();
    }

    @Override
    public void mostrarInfo() {
        System.out.println(getResumenInfo());

        if (arma != null && armadura != null) {
            System.out.println("Arma equipada: " + arma.getNombre());
            System.out.println("Armadura equipada: " + armadura.getNombre());
            System.out.println("Daño de ataque: " + getDañoAtaque());
        }
    }

    private boolean sonMismaEstadistica(String estadisticaA, String estadisticaB) {
        return estadisticaA.equalsIgnoreCase(estadisticaB);
    }
}