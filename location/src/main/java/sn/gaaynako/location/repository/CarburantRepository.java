package sn.gaaynako.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.gaaynako.location.entity.Carburant;

@Repository
public interface CarburantRepository extends JpaRepository<Carburant,Long> {
}
