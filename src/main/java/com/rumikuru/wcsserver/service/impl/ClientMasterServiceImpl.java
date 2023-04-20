package com.rumikuru.wcsserver.service.impl;

import com.rumikuru.wcsserver.model.Client;
import com.rumikuru.wcsserver.repository.ClientMasterRepository;
import com.rumikuru.wcsserver.service.ClientMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientMasterServiceImpl implements ClientMasterService {
    @Autowired
    ClientMasterRepository repository;

    @Override
    public List<Client> getAll() {
        return (List<Client>) repository.findAll();
    }

    @Override
    public void postClient(Client newClient) {
        repository.save(newClient);
       // return newClient;
    }

    @Override
    public Optional<Client> getFromId(String id) {
        return repository.findById(Long.valueOf(id));
    }

    @Override
    public Client replaceClient(String id, Client newClient) {
        return repository.findById(Long.valueOf(id))
                .map(client -> {
                    client.setName(newClient.getName());
                    client.setIs_client(newClient.getIs_client());
                    client.setFax(newClient.getFax());
                    client.setEmail(newClient.getEmail());
                    client.setAddress(newClient.getAddress());
                    client.setIs_holder(newClient.getIs_holder());
                    client.setIs_manufacturer(newClient.getIs_manufacturer());
                    client.setPhone(client.getPhone());
                    client.setIs_supplier(client.getIs_supplier());
                    return repository.save(client);
                }).orElseGet(()->{
                    newClient.setClientId(Long.valueOf(id));
                    return repository.save(newClient);
                });
    }

    @Override
    public void delete(String valueOf) {
        repository.deleteById(Long.valueOf(valueOf));
    }
}
