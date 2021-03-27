package sn.gaaynako.paiement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.gaaynako.paiement.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
