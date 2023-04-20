package com.rumikuru.wcsserver.controller;

import com.rumikuru.wcsserver.model.Sku;
import com.rumikuru.wcsserver.service.MaterialMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/materialMaster")
public class MaterialMaster {
    @Autowired
    private MaterialMasterService materialMasterService;

    @GetMapping("/all")
    public ResponseEntity<Optional<List<Sku>>> getAll(){
        return ResponseEntity.ok(Optional.ofNullable(materialMasterService.getAll()));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Optional<Sku>>> getFromId(@PathVariable Long id){
        return ResponseEntity.ok(Optional.ofNullable(materialMasterService.getFromId(id)));
    }

    @PostMapping("/add")
    public ResponseEntity<Optional<Sku>> postSku(@RequestBody Sku newSku){
        return ResponseEntity.ok(materialMasterService.postSku(newSku));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<Sku>> putSku(@PathVariable Long id, @RequestBody Sku newSku){
        return ResponseEntity.ok(materialMasterService.putSku(id, newSku));
    }

    @DeleteMapping("/{id}")
    public void deleteSku(@PathVariable Long id){
        materialMasterService.deleteSku(id);
    }
}
