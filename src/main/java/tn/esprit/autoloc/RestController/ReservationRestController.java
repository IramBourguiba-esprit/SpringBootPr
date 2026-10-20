package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Reservation;
import tn.esprit.autoloc.Services.IReservation;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api/reservation")
@RequiredArgsConstructor
@Tag(name = "Reservation Management", description = "API de gestion des reservations")
public class ReservationRestController {
    private final IReservation iReservation;

    @Operation(summary = "Ajouter une réservation")
    @PostMapping("/addReservation")
    public Reservation ajouterReservation(@RequestBody Reservation r){
        return iReservation.addReservation(r);
    }

    @Operation(summary = "Lister toutes les réservations")
    @GetMapping("/getAllReservations")
    public List<Reservation> retrieveReservations(){
        return iReservation.retrieveReservation();
    }

    @Operation(summary = "Récupérer une réservation")
    @GetMapping("/getReservationByid/{id}")
    public Reservation retrieveReservationByid(@PathVariable Long id){
        return iReservation.retrieveById(id);
    }

    @Operation(summary = "Supprimer une réservation")
    @DeleteMapping("/deleteReservationByid/{id}")
    public void deleteReservationByid(@PathVariable Long id){
        iReservation.deleteReservation(id);
    }

    @Operation(summary = "Modifier une réservation")
    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation r){
        return iReservation.updateReservation(r);
    }
}
