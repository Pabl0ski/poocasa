package Examen3aEVAU.models;

public class Persona {
    private final String dni;
    private final String nombre;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return String.format("DNI: %s, Nombre: %s", dni, nombre);
    }
}
