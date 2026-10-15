package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Paiement;

import java.util.List;

public interface IPaiement {
    Paiement addPaiement(Paiement paiement);
    void deletePaiement(long id);
    List<Paiement> retrievePaiement();
    Paiement retrieveById(long id);
    Paiement updatePaiement(Paiement paiement);
}