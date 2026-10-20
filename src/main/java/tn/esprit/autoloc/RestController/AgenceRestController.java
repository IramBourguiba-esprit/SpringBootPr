package tn.esprit.autoloc.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Services.IAgence;

import java.util.List;

@RestController
@RequestMapping("/api/agence")
@RequiredArgsConstructor
@Tag(name = "Agence Management", description = "API de gestion des agences")

public class AgenceRestController {

    private final IAgence iagence;

    @Operation(summary = "Ajouter une agence")
    @PostMapping("/addAgence")
    public Agence ajouterAgence(@RequestBody Agence a){
        return iagence.addAgence(a);
    }

    @Operation(summary = "Lister toutes les agences")
    @GetMapping("/getAllAgences")
    public List<Agence> retrieveAgences(){
        return iagence.retrieveAgence();
    }

    @Operation(summary = "Récupérer une agence")
    @GetMapping("/getAgenceByid/{id}")
    public Agence retrieveAgenceByid(@PathVariable Long id){
        return iagence.retrieveById(id);
    }

    @Operation(summary = "Supprimer une agence")
    @DeleteMapping("/deleteAgenceByid/{id}")
    public void deleteAgenceByid(@PathVariable Long id){
        iagence.deleteAgence(id);
    }

    @Operation(summary = "Modifier une agence")
    @PutMapping("/updateAgence")
    public Agence updateAgence(@RequestBody Agence a){
        return iagence.updateAgence(a);
    }


}
