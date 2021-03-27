package sn.gaaynako.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.gaaynako.location.entity.Marque;

@Repository
public interface MarqueRepository extends JpaRepository<Marque,Long> {
}
