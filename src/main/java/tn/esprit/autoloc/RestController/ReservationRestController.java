package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Reservation;
import tn.esprit.autoloc.Services.IReservation;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
@RequiredArgsConstructor

public class ReservationRestController {
    private final IReservation iReservation;

    @PostMapping("/addReservation")
    public Reservation ajouterReservation(@RequestBody Reservation r){
        return iReservation.addReservation(r);
    }

    @GetMapping("/getAllReservations")
    public List<Reservation> retrieveReservations(){
        return iReservation.retrieveReservation();
    }

    @GetMapping("/getReservationByid/{id}")
    public Reservation retrieveReservationByid(@PathVariable Long id){
        return iReservation.retrieveById(id);
    }

    @DeleteMapping("/deleteReservationByid/{id}")
    public void deleteReservationByid(@PathVariable Long id){
        iReservation.deleteReservation(id);
    }
}
