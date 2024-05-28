package Examen3aEVAU.services;

import Examen3aEVAU.models.Vehiculo;
import Examen3aEVAU.models.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VehiculoService {
    private final List<Vehiculo> vehiculos;

    public VehiculoService() {
        vehiculos = new ArrayList<>();
    }

    public boolean añadirVehiculo(Vehiculo vehiculo) {
        if (!vehiculos.contains(vehiculo)) {
            vehiculos.add(vehiculo);
            return true;
        }
        return false;
    }

    public boolean eliminarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula) && !vehiculo.isAlquilado()) {
                vehiculos.remove(vehiculo);
                return true;
            }
        }
        return false;
    }

    public List<Vehiculo> mostrarTodos() {
        List<Vehiculo> sortedList = new ArrayList<>(vehiculos);
        sortedList.sort(Comparator.comparing(Vehiculo::getMarca));
        return sortedList;
    }

    public List<Vehiculo> mostrarAlquilados() {
        List<Vehiculo> alquilados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.isAlquilado()) {
                alquilados.add(vehiculo);
            }
        }
        alquilados.sort(Comparator.comparing(Vehiculo::getMatricula));
        return alquilados;
    }

    public List<Vehiculo> mostrarNoAlquilados() {
        List<Vehiculo> noAlquilados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (!vehiculo.isAlquilado()) {
                noAlquilados.add(vehiculo);
            }
        }
        noAlquilados.sort(Comparator.comparing(Vehiculo::getMatricula));
        return noAlquilados;
    }

    public boolean alquilarVehiculo(String matricula, Cliente cliente, int dias) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula) && !vehiculo.isAlquilado()) {
                double totalPagar = vehiculo.alquilar(cliente, dias);
                cliente.alquilarVehiculo(vehiculo);
                System.out.printf("Vehículo alquilado por %s y el total a pagar es %.2f €\n", cliente.getNombre(), totalPagar);
                return true;
            }
        }
        return false;
    }

    public boolean desalquilarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula) && vehiculo.isAlquilado()) {
                vehiculo.desalquilar();
                return true;
            }
        }
        return false;
    }
}