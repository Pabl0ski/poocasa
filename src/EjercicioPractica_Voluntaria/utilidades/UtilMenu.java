package EjercicioPractica_Voluntaria.utilidades;

import EjercicioPractica_Voluntaria.dao.modelos.Coche;
import EjercicioPractica_Voluntaria.dao.modelos.Directivo;
import EjercicioPractica_Voluntaria.dao.modelos.Revision;
import EjercicioPractica_Voluntaria.dao.modelos.RevisionRealizada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static EjercicioPractica_Voluntaria.utilidades.Constantes.*;

public class UtilMenu {
    private static Scanner sc;
    private static ArrayList<Directivo> directivos;
    private static ArrayList<Coche> coches;
    private static ArrayList<Revision> revisiones;

    public UtilMenu(ArrayList<Directivo> directivos, ArrayList<Coche> coches, ArrayList<Revision> revisiones){
        sc = new Scanner(System.in);
        this.directivos = directivos;
        this.coches = coches;
        this.revisiones = revisiones;
    }

    public static void mostrarMenu(Scanner sc){
        System.out.println(MENU_DE_OPCIONES);

        System.out.println("Ingrese opcion:");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                mostrarDatosDirectivos();
                break;
            case 2:
                mostrarDatosCocches();
                break;
            case 3:
                mostrarRevisionesDisponibles();
                break;
            case 4:
                indicarRevisionCoches();
                break;
            case 5:
                pasarRevision();
                break;
            case 6:
                calcularSueldoTotal();
                break;
            case 7:
                precioMediaRevisionCoche();
                break;
            case 8:
                mostrarCochesPorTaller();
                break;
            case 9:
                System.out.println(MENSAJE_DESPEDIDA);
                System.exit(0);
                break;
            default:
                System.out.println(MENSAJE_ERROR_MENU);
        }
    }

    private static void mostrarDatosDirectivos(){
        //Implementar la lógica para mostrar datos de directivos
        Collections.sort(directivos, Comparator.comparing(Directivo::getDni).reversed());
        for (Coche coche : coches){
            System.out.println(coche);
        }
    }

    private static void mostrarDatosCocches(){
        //implementar la logica para mostrar datos de coches
        for (Coche coche : coches){
            System.out.println(coche);
        }
    }

    private static void mostrarRevisionesDisponibles(){
       //implementar la logica para mostrar revisiones disponibles
        for (Revision revision : revisiones){
            System.out.println(revision);
        }
    }

    private static void indicarRevisionCoches(){
        //imiplementar la logica para indicar que un coche necesita revision
        System.out.println("Ingrese la matricual del coche que necesita revisión: ");
        String matricula = sc.nextLine();

        Coche coche = null;
        for (Coche c : coches){
            if ((c.getMatricula().equals(matricula))){
                coche = c;
            }
        }

        if (coche != null) {
            System.out.println("Revisiones disponibles:");
            int contador = 1;
            for (Revision revision : revisiones){
                System.out.println(contador+ ". " +revision);
                contador++;
            }
            System.out.println("Seleccione la revision que desea realizar (ingrese el numero correspondiente):");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion >= 1 && opcion <= revisiones.size()){
                Revision seleccionada = revisiones.get(opcion -1);

                if (coche.getDineroDisponibleParaRevisiones()<seleccionada.getMaxCoches()){
                    RevisionRealizada revRealizada = new RevisionRealizada(seleccionada);
                    coche.getRevisionRealizadas().add(revRealizada);
                    seleccionada.incrementarCochesHaciendoRevision();
                    System.out.println("Revision programada exitosamente");
                }else {
                    System.out.println("No se pudo programar la revision para este coche.");
                }
            }else System.out.println("Opcion invalida. Por favor, seleccione un neumro de revision valido");
        }else System.out.println(MEMSAJE_ERRO_NOEXISTE);
    }

    private static void pasarRevision(){
        //imiplementar la logica para pasar una revision a un coche
    }

    private static void calcularSueldoTotal(){
        //Implementar la ligica para calcular el sueldo total de directivos y empleados
    }

    private static void precioMediaRevisionCoche(){
        //Implementar la logiaca para calcular la media de precios de revisiones de un coche
    }

    private static void mostrarCochesPorTaller(){
        //Implementar la logica para mostrar los coches que han pasado por un taller
    }
}
