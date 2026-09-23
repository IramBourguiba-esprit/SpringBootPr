package tn.esprit.autoloc.Entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdEmploye;

    String Nom;
    String Prenom;

    @Enumerated(EnumType.STRING)
    RoleEmploye Role;
}
