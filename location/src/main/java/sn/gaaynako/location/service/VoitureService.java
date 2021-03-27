package sn.gaaynako.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.gaaynako.location.entity.Voiture;
import sn.gaaynako.location.repository.VoitureRepository;

import java.util.Optional;

@Service
public class VoitureService {
    @Autowired
    private VoitureRepository voitureRepository;
    public Voiture saveVoiture (Voiture voiture){
        return voitureRepository.save(voiture);
    }
    public Optional<Voiture> findByMarque(Long idVoiture){
        return voitureRepository.findById(idVoiture);
    }
    public Voiture findByMarqueAndModele(String marque,String modele){
        return voitureRepository.findByMarqueAndModele(marque,modele);
    }
}
