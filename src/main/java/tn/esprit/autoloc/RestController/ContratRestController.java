package tn.esprit.autoloc.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Contrat;
import tn.esprit.autoloc.Services.IContrat;

import java.util.List;

@RestController
@RequestMapping("/api/Contrat")
@RequiredArgsConstructor
@Tag(name = "Contrat Management", description = "API de gestion des contrats")
public class ContratRestController {
    private final IContrat iContrat;

    @Operation(summary = "Ajouter un contrat")
    @PostMapping("/addContrat")
    public Contrat ajouterContrat(@RequestBody Contrat c){
        return iContrat.addContrat(c);
    }

    @Operation(summary = "Lister tous les contrats")
    @GetMapping("/getAllContrats")
    public List<Contrat> retrieveContrats(){
        return iContrat.retrieveContrat();
    }

    @Operation(summary = "Récupérer un contrat")
    @GetMapping("/getContratByid/{id}")
    public Contrat retrieveContratByid(@PathVariable Long id){
        return iContrat.retrieveById(id);
    }

    @Operation(summary = "Supprimer un contrat")
    @DeleteMapping("/deleteContratByid/{id}")
    public void deleteContratByid(@PathVariable Long id){
        iContrat.deleteContrat(id);
    }

    @Operation(summary = "Modifier un contrat")
    @PutMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat c){
        return iContrat.updateContrat(c);
    }
}
