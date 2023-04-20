package com.rumikuru.wcsserver.controller;


import com.rumikuru.wcsserver.model.Client;
import com.rumikuru.wcsserver.service.ClientMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/client")
public class ClientMaster {
    @Autowired
    private ClientMasterService clientMasterService;

    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAll(){
        return ResponseEntity.ok(clientMasterService.getAll());
    }
    @PostMapping("/add")
    public void postClient(@RequestBody Client newClient){
        clientMasterService.postClient(newClient);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Client>> getFromId(@PathVariable Long id){
        return ResponseEntity.ok(clientMasterService.getFromId(String.valueOf(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<Client>> putFromId(@PathVariable Long id, @RequestBody Client newClient){
        return ResponseEntity.ok(Optional.ofNullable(clientMasterService.replaceClient(String.valueOf(id), newClient)));
    }

    @DeleteMapping("/{id}")
    public void deleteFromId(@PathVariable Long id){
        clientMasterService.delete(String.valueOf(id));
    }
}
