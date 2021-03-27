package sn.gaaynako.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.gaaynako.location.entity.Marque;
import sn.gaaynako.location.repository.MarqueRepository;


import java.util.Optional;

@Service
public class MarqueService {
    @Autowired
    private MarqueRepository marqueRepository;
    public Marque saveMarque (Marque marque){
        return marqueRepository.save(marque);
    }
    public Optional<Marque> findById(Long idMarque){
        return marqueRepository.findById(idMarque);
    }
}
