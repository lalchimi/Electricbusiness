package fr.hb.ElectricBusiness.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.hb.ElectricBusiness.business.Reservation;

@Service
public interface ReservationService {
    List<Reservation> recupererReservations();

	Reservation ajouterReservation(Reservation reservation);

	boolean deleteReservation(Long id);

	Reservation recupererReservation(Long id);
}
