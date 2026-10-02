package tn.esprit.autoloc.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdClient;

    String nom;
    String prenom;
    String email;
    String telephone;
    String numPermis;
    LocalDate DateInscription;



}
