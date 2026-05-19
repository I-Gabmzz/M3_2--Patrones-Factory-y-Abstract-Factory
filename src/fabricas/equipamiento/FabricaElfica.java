package fabricas.equipamiento;

import dominio.equipamiento.ArcoLargoElfico;
import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;
import dominio.equipamiento.TunicaHojasArbol;

public class FabricaElfica implements FabricaEquipamiento {

    @Override
    public Arma crearArma() {
        return new ArcoLargoElfico();
    }

    @Override
    public Armadura crearArmadura() {
        return new TunicaHojasArbol();
    }

    @Override
    public String getTematica() {
        return "Élfico";
    }

    @Override
    public String getBonusDescripcion() {
        return "+20 Puntería";
    }

    @Override
    public String getEstadisticaBonus() {
        return "Puntería";
    }

    @Override
    public int getValorBonus() {
        return 20;
    }
}