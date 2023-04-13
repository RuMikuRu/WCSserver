package com.rumikuru.wcsserver.controller;


import com.rumikuru.wcsserver.model.Client;
import com.rumikuru.wcsserver.service.ClientMasterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientMaster {
    ClientMasterService clientMasterService;

    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAll(){
        return ResponseEntity.ok(clientMasterService.getAll());
    }
    @PostMapping("/add")
    public ResponseEntity<Client> postClient(@RequestBody Client newClient){
        return ResponseEntity.ok((Client) clientMasterService.postClient(newClient));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Client>> getFromId(@PathVariable String id){
        return ResponseEntity.ok(clientMasterService.getFromId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<Client>> putFromId(@PathVariable String id, @RequestBody Client newClient){
        return ResponseEntity.ok(Optional.ofNullable(clientMasterService.replaceClient(id, newClient)));
    }
}
