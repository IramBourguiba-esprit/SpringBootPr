package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Services.IPaiement;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api/paiement")
@RequiredArgsConstructor
@Tag(name = "Paiement Management", description = "API de gestion des paiements")
public class PaiementRestController {
    private final IPaiement iPaiement;

    @Operation(summary = "Ajouter un paiement")
    @PostMapping("/addPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement p){
        return iPaiement.addPaiement(p);
    }

    @Operation(summary = "Lister tous les paiements")
    @GetMapping("/getAllPaiements")
    public List<Paiement> retrievePaiements(){
        return iPaiement.retrievePaiement();
    }

    @Operation(summary = "Récupérer un paiement")
    @GetMapping("/getPaiementByid/{id}")
    public Paiement retrievePaiementByid(@PathVariable Long id){
        return iPaiement.retrieveById(id);
    }

    @Operation(summary = "Supprimer un paiement")
    @DeleteMapping("/deletePaiementByid/{id}")
    public void deletePaiementByid(@PathVariable Long id){
        iPaiement.deletePaiement(id);
    }

    @Operation(summary = "Modifier un paiement")
    @PutMapping("/updatePaiement")
    public Paiement updatePaiement(@RequestBody Paiement p){
        return iPaiement.updatePaiement(p);
    }
}
