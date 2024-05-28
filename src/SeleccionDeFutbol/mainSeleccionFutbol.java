package SeleccionDeFutbol;

import SeleccionDeFutbol.integrantesSeleccion.Entrenador;
import SeleccionDeFutbol.integrantesSeleccion.Fisioterapeuta;
import SeleccionDeFutbol.integrantesSeleccion.Jugador;

import java.util.ArrayList;

public class mainSeleccionFutbol {
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> seleccion = new ArrayList<>();

        //Crear objetos de tipo seleccionfutbol
        SeleccionFutbol lopetegui = new Entrenador(1, "Julen", "Lopetegui", 50);
        SeleccionFutbol ramos = new Jugador(2, "Sergio", "Ramos", 35, 4, "Defensa");
        SeleccionFutbol martinez = new Fisioterapeuta(3, "Juan", "Martinez", 40);

        //Añadir los objetos al arraylist
        seleccion.add(lopetegui);
        seleccion.add(ramos);
        seleccion.add(martinez);

        //mostrar informacion para cada objeto en el arraylist
        for (SeleccionFutbol integrante : seleccion){
            System.out.println("Nombre: " +integrante.getNombre()+ " " +integrante.getApellidos());
            integrante.concentrarse();
            integrante.viajar();

            //Verificar si el objeto es de tipo jugador para mostrar su entrenamineto y partido de futbol
            if (integrante instanceof Jugador){
                ((Jugador) integrante).entrenar();
                ((Jugador) integrante).partidoFutbol();
            }

            //Verificar si el objeto es de tipo jugadro para mostrar su entrevista
            if (integrante instanceof Jugador){
                ((Jugador) integrante).entrevista();
            }

            //Verificar si e objeto es de tipo Fisioterapeuta para mostrar su masaje
            if (integrante instanceof Fisioterapeuta){
                ((Fisioterapeuta) integrante).masaje();
            }

            // Verificar si el objeto es de tipo Entrenador para mostrar su planificación
            if (integrante instanceof Entrenador) {
                ((Entrenador) integrante).planificar();
            }

            System.out.println();
        }

    }
}
