package sn.gaaynako.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.gaaynako.location.entity.Carburant;
import sn.gaaynako.location.repository.CarburantRepository;

import java.util.Optional;

@Service
public class CarburantService {

    @Autowired
    private CarburantRepository carburantRepository;
    public Carburant saveCarburant(Carburant carburant){
        return carburantRepository.save(carburant);
    }
    public Optional<Carburant> findById(Long idCarburant){
        return carburantRepository.findById(idCarburant);
    }
}


