package fabricas.equipamiento;

import dominio.equipamiento.Arma;
import dominio.equipamiento.Armadura;

public interface FabricaEquipamiento {

    Arma crearArma();

    Armadura crearArmadura();

    String getTematica();

    String getBonusDescripcion();

    String getEstadisticaBonus();

    int getValorBonus();
}