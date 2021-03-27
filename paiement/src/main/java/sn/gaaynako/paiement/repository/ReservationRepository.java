package sn.gaaynako.paiement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.gaaynako.paiement.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
