package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Employe;
import tn.esprit.autoloc.Services.IEmploye;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/employe")
@RequiredArgsConstructor
@Tag(name = "Employe Management", description = "API de gestion des employes")
public class EmployeRestController {
    private final IEmploye iEmploye;

    @Operation(summary = "Ajouter un employe")
    @PostMapping("/addEmploye")
    public Employe ajouterEmploye(@RequestBody Employe e){
        return iEmploye.addEmploye(e);
    }

    @Operation(summary = "Lister tous les employes")
    @GetMapping("/getAllEmployes")
    public List<Employe> retrieveEmployes(){
        return iEmploye.retrieveEmploye();
    }

    @Operation(summary = "Récupérer un employe")
    @GetMapping("/getEmployeByid/{id}")
    public Employe retrieveEmployeByid(@PathVariable Long id){
        return iEmploye.retrieveById(id);
    }

    @Operation(summary = "Supprimer un employe")
    @DeleteMapping("/deleteEmployeByid/{id}")
    public void deleteEmployeByid(@PathVariable Long id){
        iEmploye.deleteEmploye(id);
    }

    @Operation(summary = "Modifier un employe")
    @PutMapping("/updateEmploye")
    public Employe updateEmploye(@RequestBody Employe e){
        return iEmploye.updateEmploye(e);
    }
}
