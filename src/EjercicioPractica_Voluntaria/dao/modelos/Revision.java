package EjercicioPractica_Voluntaria.dao.modelos;

public class Revision {
    private String nombreTaller;
    private String nombreRevision;
    private int maxCoches;

    private int cochesHaciendoRevision;

    public Revision(String nombreTaller, String nombreRevision, int maxCoches){
        this.nombreTaller = nombreTaller;
        this.nombreRevision = nombreRevision;
        this.maxCoches = maxCoches;

        //el atributo, auque no no s lo pida el enunciado es conveniente para llevar a cuenta de cuantos coches hay en reivsion, en ese taller para no pasarnos del maximo.
        //pero no nos interesa que esté en el constructor como parametro ya que para intanciar una revision no hacce falta.
        this.cochesHaciendoRevision = 0;
    }

    public int getMaxCoches() {
        return maxCoches;
    }

    public void setMaxCoches(int maxCoches) {
        this.maxCoches = maxCoches;
    }

    public int getCochesHaciendoRevision() {
        return cochesHaciendoRevision;
    }

    public void setCochesHaciendoRevision(int cochesHaciendoRevision) {
        this.cochesHaciendoRevision = cochesHaciendoRevision;
    }

    public void incrementarCochesHaciendoRevision(){
        cochesHaciendoRevision++;
    }

    public void decrementarCochesHaciendoRevision(){
        cochesHaciendoRevision--;
    }


}
