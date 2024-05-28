package Examen3aEVAU.models;

import java.util.Objects;

public class Vehiculo {
    private final String matricula;
    private final String marca;
    private final String modelo;
    private String color;
    private final double precioPorDia;
    private boolean alquilado;
    private Cliente cliente;
    private int numDiasAlquilado;

    private static final double IVA = 0.21;

    public Vehiculo(String matricula, String marca, String modelo, String color, double precioPorDia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precioPorDia = precioPorDia;
        this.alquilado = false;
        this.cliente = null;
        this.numDiasAlquilado = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumDiasAlquilado() {
        return numDiasAlquilado;
    }

    public double alquilar(Cliente cliente, int dias) {
        if (!alquilado) {
            this.alquilado = true;
            this.cliente = cliente;
            this.numDiasAlquilado = dias;
            return precioPorDia * dias * (1 + IVA);
        }
        return 0;
    }

    public void desalquilar() {
        if (alquilado) {
            this.alquilado = false;
            this.cliente = null;
            this.numDiasAlquilado = 0;
        }
    }

    @Override
    public String toString() {
        String clienteInfo = cliente != null ? cliente.getDni() + ", " + cliente.getNombre() : "ninguno";
        return String.format("Vehiculo: matricula: %s, marca: %s, modelo: %s, color: %s, precio sin iva: %.2f, está alquilado? %b, dni y nombre del cliente: %s, numDiasAlquilado: %d",
                matricula, marca, modelo, color, precioPorDia, alquilado, clienteInfo, numDiasAlquilado);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return matricula.equals(vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
