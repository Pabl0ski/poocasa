package EjerciciosColecciones.Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        gestionarAlumnos();
    }

    public static void gestionarAlumnos() {
        // a) Crear un ArrayList de String con 10 elementos alumno1, alumno2, ..., alumno10
        ArrayList<String> alumnos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            alumnos.add("alumno" + i);
        }

        // b) Añadir un nuevo elemento que se llame alumno3 a la posición 2 del ArrayList
        alumnos.add(2, "alumno3");

        // c) Imprimir lo que hay utilizando un Iterator, ¿hay alguno repetido?
        System.out.println("Lista de alumnos:");
        Iterator<String> iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // d) Mostrar el número de alumnos que hay
        System.out.println("Número de alumnos: " + alumnos.size());

        // e) Eliminar el primer elemento (posición 0)
        alumnos.remove(0);

        // f) Eliminar todos los elementos del ArrayList que sean “alumno3”
        iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("alumno3")) {
                iterator.remove();
            }
        }

        // g) Imprimir de nuevo el contenido del ArrayList
        System.out.println("Lista de alumnos después de eliminar:");
        iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // h) Mostrar de nuevo el número de elementos que tiene
        System.out.println("Número de alumnos después de eliminar: " + alumnos.size());
    }
}
