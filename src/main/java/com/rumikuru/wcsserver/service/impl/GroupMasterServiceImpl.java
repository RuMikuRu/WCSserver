package com.rumikuru.wcsserver.service.impl;

import com.rumikuru.wcsserver.controller.GroupMaster;
import com.rumikuru.wcsserver.model.SkuGroups;
import com.rumikuru.wcsserver.repository.GroupMasterRepository;
import com.rumikuru.wcsserver.service.GroupMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupMasterServiceImpl implements GroupMasterService {
    @Autowired
    GroupMasterRepository repository;

    @Override
    public List<SkuGroups> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<SkuGroups> getFromId(String id) {
        return repository.findById(id);
    }

    @Override
    public Optional<SkuGroups> add(SkuGroups newSkuGroups) {
        repository.save(newSkuGroups);
        return Optional.of(newSkuGroups);
    }
}
