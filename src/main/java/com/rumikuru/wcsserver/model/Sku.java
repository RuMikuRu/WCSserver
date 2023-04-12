package com.rumikuru.wcsserver.model;

import lombok.Data;

@Data
public class Sku {
    private String id;
    private String name;
    private String description;
    private String upc;
    private String manufacturer;
    private String country;
    private String group_id;
    private char is_kit;
}
