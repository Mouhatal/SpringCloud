package sn.gaaynako.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.gaaynako.location.entity.Carburant;
import sn.gaaynako.location.service.CarburantService;

import java.util.Optional;

@RestController
@RequestMapping("/carburant")
public class CarburantController {
    @Autowired
    private CarburantService carburantService;
    @PostMapping("/addCarburant")
    public Carburant save(@RequestBody Carburant carburant) {
        return carburantService.saveCarburant(carburant);
    }
    @RequestMapping("/getOneCarburant/{idCarburant}")
    public Optional<Carburant> getById(@PathVariable Long idCarburant) {
        return carburantService.findById(idCarburant);
    }
}
