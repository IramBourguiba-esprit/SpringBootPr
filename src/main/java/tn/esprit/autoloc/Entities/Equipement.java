package tn.esprit.autoloc.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdEquipement;

    String Libelle;

}
