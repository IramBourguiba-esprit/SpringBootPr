package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Reservation;
import tn.esprit.autoloc.Repositories.ReservationRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements IReservation {

    private final ReservationRepository reservationRepo;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public void deleteReservation(long id) {
        reservationRepo.deleteById(id);
    }

    @Override
    public List<Reservation> retrieveReservation() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation retrieveById(long id) {
        return reservationRepo.findById(id).orElse(null);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }
}