package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Services.IAgence;
import tn.esprit.autoloc.Services.IClient;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
@Tag(name = "Client Management", description = "API de gestion des clients")
public class ClientRestController {

    private final IClient iclient;

    @Operation(summary = "Ajouter un client")
    @PostMapping("/addClient")
    public Client ajouterClient(@RequestBody Client c){
        return iclient.addClient(c);
    }

    @Operation(summary = "Lister tout les clients")
    @GetMapping("/getAllClients")
    public List<Client> retrieveClients(){
        return iclient.retrieveClient();
    }

    @Operation(summary = "Récpérer un client")
    @GetMapping("/getClientByid/{id}")
    public Client retrieveClientByid(@PathVariable Long id){
        return iclient.retrieveById(id);
    }

    @Operation(summary = "supprimer un client")
    @DeleteMapping("/deleteClientByid/{id}")
    public void deleteClientByid(@PathVariable Long id){
        iclient.deleteClient(id);
    }

    @Operation(summary = "Modifier un client")
    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client c){
        return iclient.updateClient(c);
    }



}
