package com.rumikuru.wcsserver.controller;

import com.rumikuru.wcsserver.model.SkuGroups;
import com.rumikuru.wcsserver.service.GroupMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/groupMaster")
public class GroupMaster {
    @Autowired
    private GroupMasterService groupMasterService;

    @GetMapping("/all")
    public ResponseEntity<List<SkuGroups>> getAll(){
        return ResponseEntity.ok(groupMasterService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<SkuGroups>> getFromId(@PathVariable String id){
        return ResponseEntity.ok(groupMasterService.getFromId(id));
    }
    @PostMapping("/add")
    public ResponseEntity<Optional<SkuGroups>> postGroup(@RequestBody SkuGroups newSkuGroups){
        return ResponseEntity.ok(groupMasterService.add(newSkuGroups));
    }
}
