package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Vehicule;
import tn.esprit.autoloc.Services.IVehicule;
import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api/vehicule")
@RequiredArgsConstructor
@Tag(name = "Vehicule Management", description = "API de gestion des vehicules")
public class VehiculeRestController {
    private final IVehicule iVehicule;

    @Operation(summary = "Ajouter une véhicule")
    @PostMapping("/addVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule v){
        return iVehicule.addVehicule(v);
    }

    @Operation(summary = "Lister toutes les véhicules")
    @GetMapping("/getAllVehicules")
    public List<Vehicule> retrieveVehicules(){
        return iVehicule.retrieveVehicule();
    }

    @Operation(summary = "Récupérer une véhicule")
    @GetMapping("/getVehiculeByid/{id}")
    public Vehicule retrieveVehiculeByid(@PathVariable Long id){
        return iVehicule.retrieveById(id);
    }

    @Operation(summary = "Supprimer une véhicule")
    @DeleteMapping("/deleteVehiculeByid/{id}")
    public void deleteVehiculeByid(@PathVariable Long id){
        iVehicule.deleteVehicule(id);
    }

    @Operation(summary = "Modifier une véhicule")
    @PutMapping("/updateVehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule v){
        return iVehicule.updateVehicule(v);
    }
}
