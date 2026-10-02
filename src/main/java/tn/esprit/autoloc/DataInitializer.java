package tn.esprit.autoloc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tn.esprit.autoloc.Entities.CategorieVehicule;
import tn.esprit.autoloc.Entities.StatutVehicule;
import tn.esprit.autoloc.Entities.Vehicule;
import tn.esprit.autoloc.Repositories.VehiculeRepository;

import java.math.BigDecimal;

@Component
public class DataInitializer implements CommandLineRunner {
    private final VehiculeRepository vehiculeRepository;

    public DataInitializer(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (vehiculeRepository.count() > 0) {
            System.out.println("Des véhicules existent déjà");
            return;
        }

        Vehicule v1 = Vehicule.builder()
                .immatriculation("123-TUN-4567")
                .marque("Renault")
                .modele("Clio")
                .categorie(CategorieVehicule.CITADINE)
                .tarifJournalier(new BigDecimal("85.00"))
                .statut(StatutVehicule.DISPONIBLE)
                .build();



        vehiculeRepository.save(v1);

        System.out.println(vehiculeRepository.count() + " véhicules insérés en base de données");
    }
}