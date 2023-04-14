package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "GroupMaster")
public class SkuGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id_group;
    private String name;
    @OneToOne
    @JoinColumn(name = "SKU_id", nullable = false)
    private Sku parantId;
}
