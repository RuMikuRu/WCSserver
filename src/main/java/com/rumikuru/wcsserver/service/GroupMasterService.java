package com.rumikuru.wcsserver.service;

import com.rumikuru.wcsserver.controller.GroupMaster;
import com.rumikuru.wcsserver.model.SkuGroups;

import java.util.List;
import java.util.Optional;

public interface GroupMasterService {
    List<SkuGroups> getAll();

    Optional<SkuGroups> getFromId(String id);

    Optional<SkuGroups> add(SkuGroups newSkuGroups);
}
