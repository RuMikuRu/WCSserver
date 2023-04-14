package com.rumikuru.wcsserver.repository;

import com.rumikuru.wcsserver.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientMasterRepository extends JpaRepository<Client,Long> {
   Client save(Client client);
}
