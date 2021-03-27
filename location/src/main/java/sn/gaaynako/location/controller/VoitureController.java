package sn.gaaynako.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.gaaynako.location.entity.Voiture;
import sn.gaaynako.location.service.VoitureService;


import java.util.Optional;

@RestController
@RequestMapping("/voiture")
public class VoitureController {
    @Autowired
    private VoitureService voitureService;
    @PostMapping("/addVoiture")
    public Voiture save(@RequestBody Voiture voiture) {
        return voitureService.saveVoiture(voiture);
    }
    @RequestMapping("/getOneVoiture/{marque}/{modele}")
    public Voiture getByMarqueAndModele(@PathVariable String marque,@PathVariable String modele) {
        return voitureService.findByMarqueAndModele(marque,modele);
    }
}
