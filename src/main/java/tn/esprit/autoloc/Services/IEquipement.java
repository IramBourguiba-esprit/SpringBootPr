package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Equipement;

import java.util.List;

public interface IEquipement {
    Equipement addEquipement(Equipement equipement); //signature de la methode: ki ya3tiwhelna fl énoncé manbadlou fiha chay
    void deleteEquipement(long id);
    List<Equipement> retrieveEquipement();
    Equipement retrieveById(long id);
    Equipement updateEquipement(Equipement equipement);
}

