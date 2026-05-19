package fabricas.equipamiento;

import dominio.equipamiento.ArcoLargoElfico;
import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;
import dominio.equipamiento.TunicaHojasArbol;

public class FabricaElfica implements FabricaEquipamiento {

    // Abstract Factory: crea el arma correspondiente a la familia élfica.
    @Override
    public Arma crearArma() {
        return new ArcoLargoElfico();
    }

    // Abstract Factory: crea la armadura correspondiente a la misma temática.
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