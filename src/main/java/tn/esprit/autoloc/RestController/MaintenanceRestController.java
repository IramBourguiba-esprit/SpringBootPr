package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Maintenance;
import tn.esprit.autoloc.Services.IMaintenance;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api/maintenance")
@RequiredArgsConstructor
@Tag(name = "Maintenance Management", description = "API de gestion des maintenances")
public class MaintenanceRestController {
    private final IMaintenance iMaintenance;

    @Operation(summary = "Ajouter une maintenance")
    @PostMapping("/addMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance m){
        return iMaintenance.addMaintenance(m);
    }

    @Operation(summary = "Lister toutes les maintenances")
    @GetMapping("/getAllMaintenances")
    public List<Maintenance> retrieveMaintenances(){
        return iMaintenance.retrieveMaintenance();
    }

    @Operation(summary = "Récupérer une maintenance")
    @GetMapping("/getMaintenanceByid/{id}")
    public Maintenance retrieveMaintenanceByid(@PathVariable Long id){
        return iMaintenance.retrieveById(id);
    }

    @Operation(summary = "Supprimer un maintenance")
    @DeleteMapping("/deleteMaintenanceByid/{id}")
    public void deleteMaintenanceByid(@PathVariable Long id){
        iMaintenance.deleteMaintenance(id);
    }

    @Operation(summary = "Modifier une maintenance")
    @PutMapping("/updateMaintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance m){
        return iMaintenance.updateMaintenance(m);
    }
}
