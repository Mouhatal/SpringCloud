package sn.gaaynako.paiement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sn.gaaynako.paiement.dto.VoitureDto;
import sn.gaaynako.paiement.entity.Reservation;
import sn.gaaynako.paiement.repository.ReservationRepository;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private RestTemplate restTemplate;
    public Reservation saveReservation(Reservation reservation){
        String responseTest = "";
        VoitureDto voitureDto = restTemplate.getForObject("http://LOCATION-SERVICE/voiture/getOneVoiture/{marque}/{modele}",
                                                                VoitureDto.class,
                                                                reservation.getMarque(),
                                                                reservation.getModele());
        reservation.setMarque(voitureDto.getMarque());
        reservation.setModele(voitureDto.getModele());
        System.out.println("RESPOOOOOOOONSE : "+voitureDto);
        return reservationRepository.save(reservation);
    }
}
