package sn.gaaynako.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.gaaynako.location.entity.Modele;

@Repository
public interface ModeleRepository extends JpaRepository<Modele,Long> {
}
