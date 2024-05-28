package EjerciciosColecciones.Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OperacionesArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce números enteros (0 para terminar):");

        int numero;
        while ((numero = scanner.nextInt()) != 0) {
            numeros.add(numero);
        }

        // a) Indicar si el array tiene o no elementos
        if (numeros.isEmpty()) {
            System.out.println("El array no tiene elementos.");
        } else {
            System.out.println("El array tiene elementos.");
            System.out.println("Hay " + numeros.size() + " elementos.");

            // b) Mostrar los números que se han almacenado en una línea
            System.out.print("Números en una línea: ");
            for (Integer num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();

            // c) Mostrar los números que se han almacenado en una línea diferente
            System.out.println("Números en líneas diferentes:");
            for (Integer num : numeros) {
                System.out.println(num);
            }

            // d) Mostrar la suma de los números
            int suma = 0;
            for (Integer num : numeros) {
                suma += num;
            }
            System.out.println("La suma de los números es: " + suma);

            // e) Mostrar la media aritmética
            double media = suma / (double) numeros.size();
            System.out.println("La media aritmética es: " + media);

            // f) Muéstralos ordenados (de menor a mayor)
            ArrayList<Integer> numerosOrdenados = new ArrayList<>(numeros);
            Collections.sort(numerosOrdenados);
            System.out.print("Números ordenados (de menor a mayor): ");
            for (Integer num : numerosOrdenados) {
                System.out.print(num + " ");
            }
            System.out.println();

            // g) Encuentra el número 10 y si está di en que posición está
            int posicion = numeros.indexOf(10);
            if (posicion != -1) {
                System.out.println("El número 10 está en la posición: " + posicion);
            } else {
                System.out.println("El número 10 no está en la lista.");
            }

            // h) Muéstralos ordenados de mayor a menor
            Collections.sort(numerosOrdenados, Collections.reverseOrder());
            System.out.print("Números ordenados (de mayor a menor): ");
            for (Integer num : numerosOrdenados) {
                System.out.print(num + " ");
            }
            System.out.println();

            // i) Muestra el máximo y el mínimo
            int max = Collections.max(numeros);
            int min = Collections.min(numeros);
            System.out.println("El número máximo es: " + max);
            System.out.println("El número mínimo es: " + min);
        }

        scanner.close();
    }
}
