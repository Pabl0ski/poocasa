package Examen3aEVAU.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private final String ciudad;
    private final List<Vehiculo> vehiculosAlquilados;

    public Cliente(String dni, String nombre, String ciudad) {
        super(dni, nombre);
        this.ciudad = ciudad;
        this.vehiculosAlquilados = new ArrayList<>();
    }

    public String getCiudad() {
        return ciudad;
    }

    public List<Vehiculo> getVehiculosAlquilados() {
        return vehiculosAlquilados;
    }

    public void alquilarVehiculo(Vehiculo vehiculo) {
        vehiculosAlquilados.add(vehiculo);
    }

    public void devolverVehiculo(Vehiculo vehiculo) {
        vehiculosAlquilados.remove(vehiculo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Cliente con DNI y nombre: %s, vive en %s y ha alquilado %d coches que son: ",
                super.toString(), ciudad, vehiculosAlquilados.size()));
        for (Vehiculo vehiculo : vehiculosAlquilados) {
            sb.append(vehiculo.getMatricula()).append(" ");
        }
        return sb.toString();
    }
}