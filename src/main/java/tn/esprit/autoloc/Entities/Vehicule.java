package tn.esprit.autoloc.Entities;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdVehicule;

    String immatriculation;
    String marque;
    String modele;

    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;

    BigDecimal tarifJournalier;

    @Enumerated
    StatutVehicule statut;





}
