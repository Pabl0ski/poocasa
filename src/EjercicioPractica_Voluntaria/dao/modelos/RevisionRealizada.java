package EjercicioPractica_Voluntaria.dao.modelos;

import EjercicioPractica_Voluntaria.dao.modelos.Revision;

public class RevisionRealizada {
    private Revision revision;
    private int anio;

    public RevisionRealizada(Revision revision){
        this.revision=revision;
        double precio = 0; //ponemos 0 para indicar que no se ha hecho revision. Cuado se haga revision, se cambiara su valir: setPrecio(452)
    }
}
