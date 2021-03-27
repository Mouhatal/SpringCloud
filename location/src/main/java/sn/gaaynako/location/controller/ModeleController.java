package sn.gaaynako.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.gaaynako.location.entity.Modele;
import sn.gaaynako.location.service.ModeleService;

import java.util.Optional;

@RestController
@RequestMapping("/modele")
public class ModeleController {
    @Autowired
    private ModeleService modeleService;
    @PostMapping("/addModele")
    public Modele save(@RequestBody Modele modele) {
        return modeleService.saveModele(modele);
    }
    @RequestMapping("/getOneModele/{idModele}")
    public Optional<Modele> getById(@PathVariable Long idModele) {
        return modeleService.findById(idModele);
    }
}
