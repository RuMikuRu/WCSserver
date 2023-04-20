package com.rumikuru.wcsserver.service.impl;

import com.rumikuru.wcsserver.model.Sku;
import com.rumikuru.wcsserver.repository.MaterialMasterRepository;
import com.rumikuru.wcsserver.service.MaterialMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialMasterServiceImpl implements MaterialMasterService {
    @Autowired
    MaterialMasterRepository repository;
    @Override
    public List<Sku> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Sku> getFromId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<Sku> postSku(Sku newSku) {
        repository.save(newSku);
        return Optional.of(newSku);
    }

    @Override
    public Optional<Sku> putSku(Long id, Sku newSku) {
        return Optional.of(repository.findById(Long.valueOf(id))
                .map(sku -> {
                    sku.setName(newSku.getName());
                    sku.setIs_kit(newSku.getIs_kit());
                    sku.setId(newSku.getId());
                    sku.setCountry(newSku.getCountry());
                    sku.setUpc(newSku.getUpc());
                    sku.setDescription(newSku.getDescription());
                    sku.setGroup_id(newSku.getGroup_id());
                    sku.setManufacturer(sku.getManufacturer());
                    return repository.save(sku);
                }).orElseGet(() -> {
                    newSku.setId(String.valueOf(id));
                    return repository.save(newSku);
                }));
    }

    @Override
    public void deleteSku(Long id) {
        repository.deleteById(id);
    }
}
