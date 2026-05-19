package fabricas.equipamiento;

import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;
import dominio.equipamiento.ArmaduraEscamasDragon;
import dominio.equipamiento.EspadaFuegoInfernal;

public class FabricaDemoniaca implements FabricaEquipamiento {

    @Override
    public Arma crearArma() {
        return new EspadaFuegoInfernal();
    }

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