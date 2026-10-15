package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Vehicule;
import tn.esprit.autoloc.Repositories.VehiculeRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculeServiceImpl implements IVehicule {

    private final VehiculeRepository vehiculeRepo;

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public void deleteVehicule(long id) {
        vehiculeRepo.deleteById(id);
    }

    @Override
    public List<Vehicule> retrieveVehicule() {
        return vehiculeRepo.findAll();
    }

    @Override
    public Vehicule retrieveById(long id) {
        return vehiculeRepo.findById(id).orElse(null);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }
}