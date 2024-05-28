package SeleccionDeFutbol.integrantesSeleccion;

import SeleccionDeFutbol.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {
    public Entrenador(int id, String nombre, String apellidos, int edad){
        super(id, nombre, apellidos, edad);
    }

    //Implementacion del metodo abstracto entrenar
    @Override
    public void entrenar() {
        System.out.println("Dando instrucciones como entrenador");
    }

    // Método propio
    public void planificar() {
        System.out.println("Planificando la estrategia como entrenador...");
    }
}
