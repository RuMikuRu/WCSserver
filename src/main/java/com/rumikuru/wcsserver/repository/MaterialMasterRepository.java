package com.rumikuru.wcsserver.repository;

import com.rumikuru.wcsserver.model.Sku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialMasterRepository extends JpaRepository<Sku, Long> {
}
