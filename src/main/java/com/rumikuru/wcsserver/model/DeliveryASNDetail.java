package com.rumikuru.wcsserver.model;

import lombok.Data;

@Data
public class DeliveryASNDetail {
    private String load_name;
    private String load_sku_id;
    private String load_pack_id;
    private Integer load_units;
    private char load_category;
    private char load_is_container;
    private String load_location;

}
