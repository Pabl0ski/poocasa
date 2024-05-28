package EjercicioPractica_Voluntaria.dao.modelos;

public class Directivo  extends Persona{
    private double sueldo;
    private int anosExperiencia;

    public Directivo(String dni, String nombre, double sueldo, int anosExperiencia) {
        super(dni, nombre);
        this.sueldo=sueldo;
        this.anosExperiencia=anosExperiencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "DNI='" + getDni() + '\'' +
                ", Nombre='" + getNombre() +'\'' +
                "sueldo=" + sueldo +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }
}
