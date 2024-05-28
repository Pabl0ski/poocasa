package EjercicioPractica_Voluntaria.dao;

import EjercicioPractica_Voluntaria.dao.modelos.Coche;
import EjercicioPractica_Voluntaria.service.coche;

import java.util.ArrayList;

public class CocheDao {
    private static ArrayList<coche> misCoches = new ArrayList<>();

    public ArrayList<Coche> getMisCoches(){
        ArrayList<Coche> MisCoches = null;
        return MisCoches;
    }

    public void setMisCoches (ArrayList<coche> coches) {
        CocheDao.misCoches=coches;
    }
}
