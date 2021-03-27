package sn.gaaynako.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.gaaynako.location.entity.Marque;
import sn.gaaynako.location.service.MarqueService;

import java.util.Optional;

@RestController
@RequestMapping("/marque")
public class MarqueController {
    @Autowired
    private MarqueService marqueService;
    @PostMapping("/addMarque")
    public Marque save(@RequestBody Marque marque) {
        return marqueService.saveMarque(marque);
    }
    @RequestMapping("/getOneMarque/{idMarque}")
    public Optional<Marque> getById(@PathVariable Long idMarque) {
        return marqueService.findById(idMarque);
    }
}
