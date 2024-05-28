package SeleccionDeFutbol.integrantesSeleccion;

import SeleccionDeFutbol.SeleccionFutbol;

public class Jugador extends SeleccionFutbol {
    //Atributos propios de jugador
    private int dorsal;
    private String demarcacion;


    //constructor
    public Jugador(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion){
        super(id, nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }



    //implementacion del metodo abstracto entrenar
    @Override
    public void entrenar() {
        System.out.println("Realiza un entrenamiento la clase jugar");
    }

    //Subescritura del método partidofutbol

    @Override
    public void partidoFutbol() {
        System.out.println("Juega el partido la clase Jugador");
    }

    //Metodo propio
    public void entrevista(){
        System.out.println("Tiene una entrevista");
    }
}
