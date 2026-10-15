package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Employe;

import java.util.List;

public interface IEmploye {
    Employe addEmploye(Employe employe); //signature de la methode: ki ya3tiwhelna fl énoncé manbadlou fiha chay
    void deleteEmploye(long id);
    List<Employe> retrieveEmploye();
    Employe retrieveById(long id);
    Employe updateEmploye(Employe employe);
}

