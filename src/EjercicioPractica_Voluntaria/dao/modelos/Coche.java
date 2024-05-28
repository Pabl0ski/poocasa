package EjercicioPractica_Voluntaria.dao.modelos;

import java.util.ArrayList;

public class Coche {
    private ArrayList<RevisionRealizada> revisionRealizadas;
    private int dineroDisponibleParaRevisiones;
    private String matricula;


    public Coche (String matricula, int dineroDisponibleParaRevisiones){
        this.revisionRealizadas=new ArrayList<>();
        this.matricula = matricula;
        this.dineroDisponibleParaRevisiones  = dineroDisponibleParaRevisiones;
    }


    public ArrayList<RevisionRealizada> getRevisionRealizadas() {
        return revisionRealizadas;
    }

    public void setRevisionRealizadas(ArrayList<RevisionRealizada> revisionRealizadas) {
        this.revisionRealizadas = revisionRealizadas;
    }

    public int getDineroDisponibleParaRevisiones() {
        return dineroDisponibleParaRevisiones;
    }

    public void setDineroDisponibleParaRevisiones(int dineroDisponibleParaRevisiones) {
        this.dineroDisponibleParaRevisiones = dineroDisponibleParaRevisiones;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


}
