package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Agence;

import java.util.List;

public interface IAgence {
    Agence addAgence(Agence agence); //signature de la methode: ki ya3tiwhelna fl énoncé manbadlou fiha chay
    void deleteAgence(long id);
    List<Agence> retrieveAgence();
    Agence retrieveById(long id);
    Agence updateAgence(Agence agence);
}
