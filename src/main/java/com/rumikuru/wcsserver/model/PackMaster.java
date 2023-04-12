package com.rumikuru.wcsserver.model;

import lombok.Data;

@Data
public class PackMaster {
    private String sku_id; //Взаимосвязан с Sku.id
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
