package Examen3aEVAU.ui;

import Examen3aEVAU.models.*;
import Examen3aEVAU.services.ClienteService;
import Examen3aEVAU.services.EmpleadoService;
import Examen3aEVAU.services.VehiculoService;

import java.util.Scanner;

public class Renting {
    private static final VehiculoService vehiculoService = new VehiculoService();
    private static final ClienteService clienteService = new ClienteService();
    private static final EmpleadoService empleadoService = new EmpleadoService();

    public static void main(String[] args) {
        cargarDatosIniciales();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Entrar.");
            System.out.println("2. Salir.");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (opcion == 1) {
                System.out.print("Introduzca usuario: ");
                String usuario = scanner.nextLine();
                System.out.print("Introduzca contraseña: ");
                String contraseña = scanner.nextLine();

                Empleado empleado = empleadoService.buscarEmpleadoPorUsuario(usuario);

                if (empleado == null) {
                    System.out.println("Usuario no existe");
                } else if (!empleado.validarContraseña(contraseña)) {
                    System.out.println("Contraseña incorrecta");
                } else {
                    System.out.println("Login OK");
                    menuPrincipal(scanner);
                }
            } else if (opcion == 2) {
                break;
            }
        }
    }

    private static void menuPrincipal(Scanner scanner) {
        while (true) {
            System.out.println("1. Añadir Vehículo.");
            System.out.println("2. Eliminar Vehículo.");
            System.out.println("3. Mostrar Todos");
            System.out.println("4. Mostrar Alquilados");
            System.out.println("5. Mostrar No Alquilados");
            System.out.println("6. Alquilar");
            System.out.println("7. Desalquilar");
            System.out.println("8. Mostrar Clientes");
            System.out.println("9. Salir.");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    añadirVehiculo(scanner);
                    break;
                case 2:
                    eliminarVehiculo(scanner);
                    break;
                case 3:
                    mostrarTodos();
                    break;
                case 4:
                    mostrarAlquilados();
                    break;
                case 5:
                    mostrarNoAlquilados();
                    break;
                case 6:
                    alquilar(scanner);
                    break;
                case 7:
                    desalquilar(scanner);
                    break;
                case 8:
                    mostrarClientes();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void añadirVehiculo(Scanner scanner) {
        System.out.print("Introduce la matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Introduce la marca: ");
        String marca = scanner.nextLine();
        System.out.print("Introduce el modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Introduce el color: ");
        String color = scanner.nextLine();
        System.out.print("Introduce el precio por día (sin IVA): ");
        double precioPorDia = scanner.nextDouble();

        Vehiculo vehiculo = new Vehiculo(matricula, marca, modelo, color, precioPorDia);

        if (vehiculoService.añadirVehiculo(vehiculo)) {
            System.out.println("Vehículo añadido correctamente.");
        } else {
            System.out.println("Ya existe un vehículo con esa matrícula.");
        }
    }

    private static void eliminarVehiculo(Scanner scanner) {
        System.out.print("Introduce la matrícula: ");
        String matricula = scanner.nextLine();

        if (vehiculoService.eliminarVehiculo(matricula)) {
            System.out.println("Vehículo eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el vehículo.");
        }
    }

    private static void mostrarTodos() {
        for (Vehiculo vehiculo : vehiculoService.mostrarTodos()) {
            System.out.println(vehiculo);
        }
    }

    private static void mostrarAlquilados() {
        for (Vehiculo vehiculo : vehiculoService.mostrarAlquilados()) {
            System.out.println(vehiculo);
        }
    }

    private static void mostrarNoAlquilados() {
        for (Vehiculo vehiculo : vehiculoService.mostrarNoAlquilados()) {
            System.out.println(vehiculo);
        }
    }

    private static void alquilar(Scanner scanner) {
        System.out.print("Introduce la matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Introduce el DNI del cliente: ");
        String dni = scanner.nextLine();
        System.out.print("Introduce el número de días: ");
        int dias = scanner.nextInt();

        Cliente cliente = clienteService.buscarClientePorDni(dni);
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        if (vehiculoService.alquilarVehiculo(matricula, cliente, dias)) {
            System.out.println("Vehículo alquilado correctamente.");
        } else {
            System.out.println("No se pudo alquilar el vehículo.");
        }
    }

    private static void desalquilar(Scanner scanner) {
        System.out.print("Introduce la matrícula: ");
        String matricula = scanner.nextLine();

        if (vehiculoService.desalquilarVehiculo(matricula)) {
            System.out.println("Vehículo desalquilado correctamente.");
        } else {
            System.out.println("No se pudo desalquilar el vehículo.");
        }
    }

    private static void mostrarClientes() {
        for (Cliente cliente : clienteService.mostrarClientes()) {
            System.out.println(cliente);
        }
    }

    private static void cargarDatosIniciales() {
        Vehiculo vehiculo1 = new Vehiculo("1111AAA", "Audi", "A5", "Negro", 200.0);
        Vehiculo vehiculo2 = new Vehiculo("2222888", "Seat", "Ibiza", "Gris", 100.0);
        Vehiculo vehiculo3 = new Vehiculo("3333CCC", "Ford", "Focus", "Azul", 75.5);
        Vehiculo vehiculo4 = new Vehiculo("4444DDD", "Volkswagen", "Polo", "Blanco", 60.5);

        vehiculoService.añadirVehiculo(vehiculo1);
        vehiculoService.añadirVehiculo(vehiculo2);
        vehiculoService.añadirVehiculo(vehiculo3);
        vehiculoService.añadirVehiculo(vehiculo4);

        Empleado empleado1 = new Empleado("12345678A", "Ana Iglesias", "profesorAna");
        empleadoService.añadirEmpleado(empleado1);

        Cliente cliente1 = new Cliente("11111111A", "Juan López", "Villanueva de la Cañada");
        Cliente cliente2 = new Cliente("22222222B", "Marina Pinteño", "Cádiz");
        Cliente cliente3 = new Cliente("33333333C", "Amanda García", "Valladolid");
        Cliente cliente4 = new Cliente("44444444D", "Rafael Caro", "Devon");
        Cliente cliente5 = new Cliente("55555555E", "Manuel Ceballos", "Sanlúcar");

        clienteService.añadirCliente(cliente1);
        clienteService.añadirCliente(cliente2);
        clienteService.añadirCliente(cliente3);
        clienteService.añadirCliente(cliente4);
        clienteService.añadirCliente(cliente5);
    }
}
