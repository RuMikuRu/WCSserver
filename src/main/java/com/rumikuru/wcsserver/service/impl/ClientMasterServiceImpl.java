package com.rumikuru.wcsserver.service.impl;

import com.rumikuru.wcsserver.model.Client;
import com.rumikuru.wcsserver.repository.ClientMasterRepository;
import com.rumikuru.wcsserver.service.ClientMasterService;

import java.util.List;

public class ClientMasterServiceImpl implements ClientMasterService {
    ClientMasterRepository repository;

    @Override
    public List<Client> getAll() {
        return (List<Client>) repository.findAll();
    }

    @Override
    public Client postClient(Client newClient) {
        repository.save(newClient);
        return newClient;
    }
}
