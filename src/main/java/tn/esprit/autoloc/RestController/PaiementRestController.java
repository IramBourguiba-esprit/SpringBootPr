package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Services.IPaiement;

import java.util.List;

@RestController
@RequestMapping("/api/paiement")
@RequiredArgsConstructor

public class PaiementRestController {
    private final IPaiement iPaiement;

    @PostMapping("/addPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement p){
        return iPaiement.addPaiement(p);
    }

    @GetMapping("/getAllPaiements")
    public List<Paiement> retrievePaiements(){
        return iPaiement.retrievePaiement();
    }

    @GetMapping("/getPaiementByid/{id}")
    public Paiement retrievePaiementByid(@PathVariable Long id){
        return iPaiement.retrieveById(id);
    }

    @DeleteMapping("/deletePaiementByid/{id}")
    public void deletePaiementByid(@PathVariable Long id){
        iPaiement.deletePaiement(id);
    }
}
