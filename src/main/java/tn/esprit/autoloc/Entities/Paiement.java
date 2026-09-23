package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdPaiement;

    BigDecimal Montant;
    LocalDate DatePaiement;

    @Enumerated(EnumType.STRING)
    ModePaiement ModePaiement;
}
