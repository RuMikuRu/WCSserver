package com.rumikuru.wcsserver.repository;

import com.rumikuru.wcsserver.model.SkuGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMasterRepository extends JpaRepository<SkuGroups,String> {
}
