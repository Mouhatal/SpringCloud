package sn.gaaynako.paiement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.gaaynako.paiement.entity.Client;
import sn.gaaynako.paiement.repository.ClientRepository;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public Client saveClient (Client client){
        return clientRepository.save(client);
    }
    public Optional<Client> findById(Long idClient){
        return clientRepository.findById(idClient);
    }
}
