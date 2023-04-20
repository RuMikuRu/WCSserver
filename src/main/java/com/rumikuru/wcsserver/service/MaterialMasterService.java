package com.rumikuru.wcsserver.service;

import com.rumikuru.wcsserver.model.Sku;

import java.util.List;
import java.util.Optional;

public interface MaterialMasterService {
    List<Sku> getAll();

    Optional<Sku> getFromId(Long id);

    Optional<Sku> postSku(Sku newSku);

    Optional<Sku> putSku(Long id, Sku newSku);

    void deleteSku(Long id);
}
