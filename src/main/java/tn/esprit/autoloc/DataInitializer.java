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

        Vehicule v1 = new Vehicule(
                null,
                "123-TUN-4567",
                "Renault",
                "Clio",
                CategorieVehicule.CITADINE,
                new BigDecimal("85.00"),
                StatutVehicule.DISPONIBLE
        );

        Vehicule v2 = new Vehicule(
                null,
                "789-TUN-1234",
                "Peugeot",
                "3008",
                CategorieVehicule.SUV,
                new BigDecimal("150.00"),
                StatutVehicule.DISPONIBLE
        );

        Vehicule v3 = new Vehicule(
                null,
                "456-TUN-7890",
                "Volkswagen",
                "Golf",
                CategorieVehicule.BERLINE,
                new BigDecimal("120.00"),
                StatutVehicule.LOUE
        );

        vehiculeRepository.save(v1);
        vehiculeRepository.save(v2);
        vehiculeRepository.save(v3);

        System.out.println(vehiculeRepository.count() + " véhicules insérés en base de données");
    }
}