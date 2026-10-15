package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Equipement;
import tn.esprit.autoloc.Repositories.AgenceRepository;
import tn.esprit.autoloc.Repositories.EquipementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipement{
    private final EquipementRepository equipementRepo;

    @Override
    public Equipement addEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public void deleteEquipement(long id) {
        equipementRepo.deleteById(id);
    }

    @Override
    public List<Equipement> retrieveEquipement() {
        return equipementRepo.findAll();
    }

    @Override
    public Equipement retrieveById(long id) {
        return equipementRepo.findById(id).orElseThrow(null);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }
}
