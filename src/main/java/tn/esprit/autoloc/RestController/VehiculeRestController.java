package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Vehicule;
import tn.esprit.autoloc.Services.IVehicule;
import java.util.List;

@RestController
@RequestMapping("/api/vehicule")
@RequiredArgsConstructor

public class VehiculeRestController {
    private final IVehicule iVehicule;

    @PostMapping("/addVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule v){
        return iVehicule.addVehicule(v);
    }

    @GetMapping("/getAllVehicules")
    public List<Vehicule> retrieveVehicules(){
        return iVehicule.retrieveVehicule();
    }

    @GetMapping("/getVehiculeByid/{id}")
    public Vehicule retrieveVehiculeByid(@PathVariable Long id){
        return iVehicule.retrieveById(id);
    }

    @DeleteMapping("/deleteVehiculeByid/{id}")
    public void deleteVehiculeByid(@PathVariable Long id){
        iVehicule.deleteVehicule(id);
    }
}
