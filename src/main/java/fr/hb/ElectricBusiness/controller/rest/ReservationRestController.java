package fr.hb.ElectricBusiness.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.hb.ElectricBusiness.business.Reservation;
import fr.hb.ElectricBusiness.service.ReservationService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/reservations")
@AllArgsConstructor
public class ReservationRestController {

    private final ReservationService reservationService;

    @GetMapping("")
    public List<Reservation> getReservations() {
        return reservationService.recupererReservations();
    }
}
