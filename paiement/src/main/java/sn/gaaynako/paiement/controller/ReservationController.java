package sn.gaaynako.paiement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.gaaynako.paiement.entity.Reservation;
import sn.gaaynako.paiement.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @PostMapping("/addReservation")
    public Reservation save(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }
}
