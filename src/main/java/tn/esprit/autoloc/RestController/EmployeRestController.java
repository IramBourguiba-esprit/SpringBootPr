package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Employe;
import tn.esprit.autoloc.Services.IEmploye;

import java.util.List;

@RestController
@RequestMapping("/api/employe")
@RequiredArgsConstructor

public class EmployeRestController {
    private final IEmploye iEmploye;

    @PostMapping("/addEmploye")
    public Employe ajouterEmploye(@RequestBody Employe e){
        return iEmploye.addEmploye(e);
    }

    @GetMapping("/getAllEmployes")
    public List<Employe> retrieveEmployes(){
        return iEmploye.retrieveEmploye();
    }

    @GetMapping("/getEmployeByid/{id}")
    public Employe retrieveEmployeByid(@PathVariable Long id){
        return iEmploye.retrieveById(id);
    }

    @DeleteMapping("/deleteEmployeByid/{id}")
    public void deleteEmployeByid(@PathVariable Long id){
        iEmploye.deleteEmploye(id);
    }
}
