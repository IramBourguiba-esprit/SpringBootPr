package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Maintenance;

import java.util.List;

public interface IMaintenance {
    Maintenance addMaintenance(Maintenance maintenance);
    void deleteMaintenance(long id);
    List<Maintenance> retrieveMaintenance();
    Maintenance retrieveById(long id);
    Maintenance updateMaintenance(Maintenance maintenance);
}