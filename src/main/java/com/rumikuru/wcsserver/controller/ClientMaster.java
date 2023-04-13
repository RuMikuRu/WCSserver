package com.rumikuru.wcsserver.controller;


import com.rumikuru.wcsserver.model.Client;
import com.rumikuru.wcsserver.service.ClientMasterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
