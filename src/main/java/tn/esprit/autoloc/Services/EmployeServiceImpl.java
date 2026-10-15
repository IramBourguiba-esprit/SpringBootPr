package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Employe;
import tn.esprit.autoloc.Repositories.EmployeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmploye{

    private final EmployeRepository employeRepo;

    @Override
    public Employe addEmploye(Employe employe) {
        return employeRepo.save(employe);
    }

    @Override
    public void deleteEmploye(long id) {
        employeRepo.deleteById(id);
    }

    @Override
    public List<Employe> retrieveEmploye() {
        return employeRepo.findAll();
    }

    @Override
    public Employe retrieveById(long id) {
        return employeRepo.findById(id).orElse(null);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepo.save(employe);
    }
}
