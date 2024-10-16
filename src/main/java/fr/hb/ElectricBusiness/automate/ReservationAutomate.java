package fr.hb.ElectricBusiness.automate;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import fr.hb.ElectricBusiness.business.Reservation;
import fr.hb.ElectricBusiness.service.BorneService;
import fr.hb.ElectricBusiness.service.ReservationService;
import lombok.AllArgsConstructor;

//@Component
@AllArgsConstructor
public class ReservationAutomate {

    private ReservationService reservationService;
    private BorneService borneService;

    @Scheduled(cron="0 0 * * * *")
    private void ajouterReservation() {
        reservationService.ajouterReservation(new Reservation(borneService.getBorne(4L)));
    }
}
