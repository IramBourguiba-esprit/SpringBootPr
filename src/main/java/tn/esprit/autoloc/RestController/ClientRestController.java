package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Services.IAgence;
import tn.esprit.autoloc.Services.IClient;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ClientRestController {

    private final IClient iclient;

    @PostMapping("/addClient")
    public Client ajouterClient(@RequestBody Client c){
        return iclient.addClient(c);
    }

    @GetMapping("/getAllClients")
    public List<Client> retrieveClients(){
        return iclient.retrieveClient();
    }

    @GetMapping("/getClientByid/{id}")
    public Client retrieveClientByid(@PathVariable Long id){
        return iclient.retrieveById(id);
    }

    @DeleteMapping("/deleteClientByid/{id}")
    public void deleteClientByid(@PathVariable Long id){
        iclient.deleteClient(id);
    }



}
