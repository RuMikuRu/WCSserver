package com.rumikuru.wcsserver.service;

import com.rumikuru.wcsserver.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientMasterService {

    List<Client> getAll();

    Client postClient(Client newClient);
}
