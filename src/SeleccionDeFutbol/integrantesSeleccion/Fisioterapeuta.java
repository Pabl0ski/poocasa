package SeleccionDeFutbol.integrantesSeleccion;

import SeleccionDeFutbol.SeleccionFutbol;

public class Fisioterapeuta extends SeleccionFutbol {

    public Fisioterapeuta(int id, String nombre, String apellido, int edad){
        super(id, nombre, apellido, edad);
    }
    @Override
    public void entrenar() {
        System.out.println("Tratando a los futbolistas");
    }

    // Método propio
    public void masaje() {
        System.out.println("Aplicando un masaje como fisioterapeuta...");
    }
}
