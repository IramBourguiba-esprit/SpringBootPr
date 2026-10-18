package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Repositories.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClient {

    private final ClientRepository clientRepo;

    @Override
    public Client addClient(Client client) {
        return clientRepo.save(client);//w9eft houni
    }

    @Override
    public void deleteClient(long id) {
         clientRepo.deleteById(id);
    }

    @Override
    public List<Client> retrieveClient() {
        return clientRepo.findAll();
    }

    @Override
    public Client retrieveById(long id) {
        return clientRepo.findById(id).orElse(null);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepo.save(client);
    }
}
