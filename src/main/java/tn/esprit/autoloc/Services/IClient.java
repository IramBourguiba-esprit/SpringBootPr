package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Entities.Client;

import java.util.List;

public interface IClient {
    Client addClient(Client client);
    void deleteClient(long id);
    List<Client> retrieveClient();
    Client retrieveById(long id);
    Client updateClient(Client client);
}
