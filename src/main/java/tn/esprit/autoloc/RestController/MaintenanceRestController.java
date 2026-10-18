package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Maintenance;
import tn.esprit.autoloc.Services.IMaintenance;

import java.util.List;

@RestController
@RequestMapping("/api/maintenance")
@RequiredArgsConstructor
public class MaintenanceRestController {
    private final IMaintenance iMaintenance;

    @PostMapping("/addMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance m){
        return iMaintenance.addMaintenance(m);
    }

    @GetMapping("/getAllMaintenances")
    public List<Maintenance> retrieveMaintenances(){
        return iMaintenance.retrieveMaintenance();
    }

    @GetMapping("/getMaintenanceByid/{id}")
    public Maintenance retrieveMaintenanceByid(@PathVariable Long id){
        return iMaintenance.retrieveById(id);
    }

    @DeleteMapping("/deleteMaintenanceByid/{id}")
    public void deleteMaintenanceByid(@PathVariable Long id){
        iMaintenance.deleteMaintenance(id);
    }
}
