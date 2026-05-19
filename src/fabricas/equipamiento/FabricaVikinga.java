package fabricas.equipamiento;

import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;
import dominio.equipamiento.ArmaduraCueroMetal;
import dominio.equipamiento.HachaDosManos;

public class FabricaVikinga implements FabricaEquipamiento {

    @Override
    public Arma crearArma() {
        return new HachaDosManos();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraCueroMetal();
    }

    @Override
    public String getTematica() {
        return "Vikingo";
    }

    @Override
    public String getBonusDescripcion() {
        return "+15 Fuerza";
    }

    @Override
    public String getEstadisticaBonus() {
        return "Fuerza";
    }

    @Override
    public int getValorBonus() {
        return 15;
    }
}