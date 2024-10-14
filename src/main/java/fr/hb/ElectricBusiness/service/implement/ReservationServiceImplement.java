package fr.hb.ElectricBusiness.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.hb.ElectricBusiness.business.Lieu;
import fr.hb.ElectricBusiness.business.Reservation;
import fr.hb.ElectricBusiness.repository.ReservationRepository;
import fr.hb.ElectricBusiness.service.ReservationService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReservationServiceImplement implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> recupererReservations() {
        return reservationRepository.findAll();
    }
    
	@Override
	public boolean deleteReservation(Long id) {
		Reservation reservation = reservationRepository.findById(id).orElse(null);
		if (reservation == null) {
			return false;
		}
		reservationRepository.delete(reservation);
		return true;
	}
}
