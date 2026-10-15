package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Maintenance;
import tn.esprit.autoloc.Repositories.MaintenanceRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MaintenanceServiceImpl implements IMaintenance {

    private final MaintenanceRepository maintenanceRepo;

    @Override
    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }

    @Override
    public void deleteMaintenance(long id) {
        maintenanceRepo.deleteById(id);
    }

    @Override
    public List<Maintenance> retrieveMaintenance() {
        return maintenanceRepo.findAll();
    }

    @Override
    public Maintenance retrieveById(long id) {
        return maintenanceRepo.findById(id).orElse(null);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }
}