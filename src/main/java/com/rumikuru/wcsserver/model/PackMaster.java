package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PackMaster")
public class PackMaster {
    @OneToOne
    @JoinColumn(name = "SKU_id", nullable = false)
    private Sku sku_id; //Взаимосвязан с Sku.id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String pack_id;
    private String description;
    private String barcode;
    private String pack_type; // мб сделать enum??
    private Integer width;
    private Integer length;
    private Integer height;
    private Integer weight;
    private Integer weight_brutto;
    private Integer is_main;
    private Integer is_shipable;
    private String nested_pac_id;
    private Integer nested_pack_qty;
}
