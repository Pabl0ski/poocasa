package EjercicioPractica_Voluntaria.dao;

import EjercicioPractica_Voluntaria.dao.modelos.Persona;

import java.util.ArrayList;

public class PersonaDao {
    private static ArrayList<Persona> personas = new ArrayList<>();

    private ArrayList<Persona> getPersonas() {return personas;}
    public void setPersonas(ArrayList<Persona> personas){PersonaDao.personas = personas;}
}
