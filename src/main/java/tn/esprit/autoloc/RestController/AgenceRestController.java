package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Services.IAgence;

import java.util.List;

@RestController
@RequestMapping("/api/agence")
@RequiredArgsConstructor
public class AgenceRestController {

    private final IAgence iagence;

    @PostMapping("/addAgence")
    public Agence ajouterAgence(@RequestBody Agence a){
        return iagence.addAgence(a);
    }

    @GetMapping("/getAllAgences")
    public List<Agence> retrieveAgences(){
        return iagence.retrieveAgence();
    }

    @GetMapping("/getAgenceByid/{id}")
    public Agence retrieveAgenceByid(@PathVariable Long id){
        return iagence.retrieveById(id);
    }

    @DeleteMapping("/deleteAgenceByid/{id}")
    public void deleteAgenceByid(@PathVariable Long id){
        iagence.deleteAgence(id);
    }


}
