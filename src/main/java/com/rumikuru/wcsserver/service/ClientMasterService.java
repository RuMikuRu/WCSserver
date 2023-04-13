package com.rumikuru.wcsserver.service;

import com.rumikuru.wcsserver.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClientMasterService {

    List<Client> getAll();

    Client postClient(Client newClient);

    Optional<Client> getFromId(String id);
    Client replaceClient(String id, Client newClient);
}
