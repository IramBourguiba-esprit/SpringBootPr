package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long IdReservation;

    LocalDate DateDebut;
    LocalDate DateFin;

    @Enumerated(EnumType.STRING)
    StatutReservation Statut;
}
