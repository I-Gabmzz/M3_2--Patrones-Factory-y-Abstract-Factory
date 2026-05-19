package fabricas.equipamiento;

import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;
import dominio.equipamiento.ArmaduraCueroMetal;
import dominio.equipamiento.HachaDosManos;

public class FabricaVikinga implements FabricaEquipamiento {

    // Abstract Factory: crea el arma correspondiente a la familia vikinga.
    @Override
    public Arma crearArma() {
        return new HachaDosManos();
    }

    // Abstract Factory: crea la armadura correspondiente a la misma temática.
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