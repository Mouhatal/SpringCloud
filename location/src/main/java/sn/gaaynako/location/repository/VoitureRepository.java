package sn.gaaynako.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.gaaynako.location.entity.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long> {
    public Voiture findByMarqueAndModele(String marque,String modele);
}
