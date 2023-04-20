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

    @Override
    public Optional<SkuGroups> putGroup(String id, SkuGroups newSkuGroups) {
        return Optional.of(repository.findById(String.valueOf(Long.valueOf(id)))
                .map(skuGroups -> {
                    skuGroups.setName(newSkuGroups.getName());
                    skuGroups.setId_group(newSkuGroups.getId_group());
                    skuGroups.setParantId(newSkuGroups.getParantId());
                    return repository.save(skuGroups);
                }).orElseGet(() -> {
                    newSkuGroups.setId_group(String.valueOf(Long.valueOf(id)));
                    return repository.save(newSkuGroups);
                }));
    }

    @Override
    public void deleteGroup(String id) {
        repository.deleteById(id);
    }

}
