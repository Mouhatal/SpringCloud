package sn.gaaynako.paiement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.gaaynako.paiement.entity.Client;
import sn.gaaynako.paiement.service.ClientService;

import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @PostMapping("/addClient")
    public Client save(@RequestBody Client client) {
        return clientService.saveClient(client);
    }
    @RequestMapping("/getOneClient/{idClient}")
    public Optional<Client> getById(@PathVariable Long idClient) {
        return clientService.findById(idClient);
    }
}
