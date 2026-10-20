package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Equipement;
import tn.esprit.autoloc.Services.IEquipement;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api/equipement")
@RequiredArgsConstructor
@Tag(name = "Equipement Management", description = "API de gestion des equipements")
public class EquipementRestController {
    private final IEquipement iEquipement;

    @Operation(summary = "Ajouter un equipement")
    @PostMapping("/addEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement e){
        return iEquipement.addEquipement(e);
    }

    @Operation(summary = "Lister tous les equipements")
    @GetMapping("/getAllEquipements")
    public List<Equipement> retrieveEquipements(){
        return iEquipement.retrieveEquipement();
    }

    @Operation(summary = "Récupérer un equipement")
    @GetMapping("/getEquipementByid/{id}")
    public Equipement retrieveEquipementByid(@PathVariable Long id){
        return iEquipement.retrieveById(id);
    }

    @Operation(summary = "Supprimer un equipement")
    @DeleteMapping("/deleteEquipementByid/{id}")
    public void deleteEquipementByid(@PathVariable Long id){
        iEquipement.deleteEquipement(id);
    }

    @Operation(summary = "Modifier un equipement")
    @PutMapping("/updateEquipement")
    public Equipement updateEquipement(@RequestBody Equipement e){
        return iEquipement.updateEquipement(e);
    }
}
