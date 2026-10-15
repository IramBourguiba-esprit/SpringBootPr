package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Repositories.AgenceRepository;

import java.util.List;
@RequiredArgsConstructor //fi 3oudh ma nhot constructeur walla //@allargsconstructor ama lezm nzid m3aha private finale esmRepo + na3yih nom
@Service // BEAN qui indique que c'est un service
public class AgenceServiceImpl implements IAgence{

    private final AgenceRepository agenceRepo;

    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public void deleteAgence(long id) {
        agenceRepo.deleteById(id);
    }

    @Override
    public List<Agence> retrieveAgence() {
        return agenceRepo.findAll();
    }

    @Override
    public Agence retrieveById(long id) {
        return agenceRepo.findById(id).orElseThrow(null);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepo.save(agence);
    }
}
