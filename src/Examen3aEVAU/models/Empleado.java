package Examen3aEVAU.models;

public class Empleado extends Persona {
    private final String usuario;
    private final String contraseña;

    public Empleado(String dni, String nombre, String usuario) {
        super(dni, nombre);
        this.usuario = usuario;
        this.contraseña = "1234";
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean validarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }

    @Override
    public String toString() {
        return String.format("Empleado con DNI y nombre: %s, tiene como usuario: %s", super.toString(), usuario);
    }
}
