package fr.hb.ElectricBusiness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.hb.ElectricBusiness.service.ReservationService;

public class ReservationController {

    private ReservationService reservationService;

    @GetMapping({"/", "/index", "/reservations"})
    public ModelAndView getReservations() {
        ModelAndView mav = new ModelAndView("reservations");
        mav.addObject("reservations", reservationService.recupererReservations());
        return mav;
    }
}
