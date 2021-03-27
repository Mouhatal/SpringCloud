package sn.gaaynako.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.gaaynako.location.entity.Modele;
import sn.gaaynako.location.repository.ModeleRepository;

import java.util.Optional;

@Service
public class ModeleService {
    @Autowired
    private ModeleRepository modeleRepository;
    public Modele saveModele (Modele modele){
        return modeleRepository.save(modele);
    }
    public Optional<Modele> findById(Long idModele){
        return modeleRepository.findById(idModele);
    }
}
