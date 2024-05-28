package Examen3aEVAU.services;

import Examen3aEVAU.models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private final List<Cliente> clientes;

    public ClienteService() {
        clientes = new ArrayList<>();
    }

    public boolean añadirCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    public Cliente buscarClientePorDni(String dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> mostrarClientes() {
        return new ArrayList<>(clientes);
    }
}