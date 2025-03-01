package EjercicioPractica_Voluntaria.dao.modelos;

import EjercicioPractica_Voluntaria.dao.PersonaDao;

public class Persona {
    private String dni;
    private String nombre;

    public Persona(String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
