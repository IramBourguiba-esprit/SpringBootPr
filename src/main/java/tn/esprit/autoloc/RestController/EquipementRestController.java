package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Equipement;
import tn.esprit.autoloc.Services.IEquipement;

import java.util.List;

@RestController
@RequestMapping("/api/equipement")
@RequiredArgsConstructor

public class EquipementRestController {
    private final IEquipement iEquipement;

    @PostMapping("/addEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement e){
        return iEquipement.addEquipement(e);
    }

    @GetMapping("/getAllEquipements")
    public List<Equipement> retrieveEquipements(){
        return iEquipement.retrieveEquipement();
    }

    @GetMapping("/getEquipementByid/{id}")
    public Equipement retrieveEquipementByid(@PathVariable Long id){
        return iEquipement.retrieveById(id);
    }

    @DeleteMapping("/deleteEquipementByid/{id}")
    public void deleteEquipementByid(@PathVariable Long id){
        iEquipement.deleteEquipement(id);
    }
}
