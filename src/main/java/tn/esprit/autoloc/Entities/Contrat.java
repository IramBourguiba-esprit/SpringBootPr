package tn.esprit.autoloc.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdContrat;

    LocalDate DateSignature;
    BigDecimal MontantTotal;
    Boolean Valide;
}
