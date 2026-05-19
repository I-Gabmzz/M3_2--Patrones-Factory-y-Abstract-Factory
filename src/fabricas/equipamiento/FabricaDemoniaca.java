package fabricas.equipamiento;

import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;
import dominio.equipamiento.ArmaduraEscamasDragon;
import dominio.equipamiento.EspadaFuegoInfernal;

public class FabricaDemoniaca implements FabricaEquipamiento {

    // Abstract Factory: crea el arma correspondiente a la familia demoníaca.
    @Override
    public Arma crearArma() {
        return new EspadaFuegoInfernal();
    }

    // Abstract Factory: crea la armadura correspondiente a la misma temática.
    @Override
    public Armadura crearArmadura() {
        return new ArmaduraEscamasDragon();
    }

    @Override
    public String getTematica() {
        return "Demoníaco";
    }

    @Override
    public String getBonusDescripcion() {
        return "+25 Daño mágico";
    }

    @Override
    public String getEstadisticaBonus() {
        return "Daño mágico";
    }

    @Override
    public int getValorBonus() {
        return 25;
    }
}