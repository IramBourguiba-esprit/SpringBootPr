package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Repositories.PaiementRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaiementServiceImpl implements IPaiement {

    private final PaiementRepository paiementRepo;

    @Override
    public Paiement addPaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }

    @Override
    public void deletePaiement(long id) {
        paiementRepo.deleteById(id);
    }

    @Override
    public List<Paiement> retrievePaiement() {
        return paiementRepo.findAll();
    }

    @Override
    public Paiement retrieveById(long id) {
        return paiementRepo.findById(id).orElse(null);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }
}