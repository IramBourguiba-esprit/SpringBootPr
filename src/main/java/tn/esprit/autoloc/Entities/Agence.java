package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "agence")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "agence")
    private Set<Employe> employeSet = new HashSet<>();

    @OneToMany(mappedBy = "agence")
    private Set<Vehicule> vehiculeSet = new HashSet<>();
}