package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Contrat;
import tn.esprit.autoloc.Services.IContrat;

import java.util.List;

@RestController
@RequestMapping("/api/Contrat")
@RequiredArgsConstructor

public class ContratRestController {
    private final IContrat iContrat;

    @PostMapping("/addContrat")
    public Contrat ajouterContrat(@RequestBody Contrat c){
        return iContrat.addContrat(c);
    }

    @GetMapping("/getAllContrats")
    public List<Contrat> retrieveContrats(){
        return iContrat.retrieveContrat();
    }

    @GetMapping("/getContratByid/{id}")
    public Contrat retrieveContratByid(@PathVariable Long id){
        return iContrat.retrieveById(id);
    }

    @DeleteMapping("/deleteContratByid/{id}")
    public void deleteContratByid(@PathVariable Long id){
        iContrat.deleteContrat(id);
    }
}
