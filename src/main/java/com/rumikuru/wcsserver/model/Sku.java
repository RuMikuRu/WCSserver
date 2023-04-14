package com.rumikuru.wcsserver.model;

import com.rumikuru.wcsserver.controller.GroupMaster;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SKU")
public class Sku {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String description;
    private String upc;
    private String manufacturer;
    private String country;
    @OneToOne
    @JoinColumn(name = "GroupMaster_id_group")
    private SkuGroups group_id;
    private char is_kit;
}
