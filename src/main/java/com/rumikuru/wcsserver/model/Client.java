package com.rumikuru.wcsserver.model;

import lombok.Data;

@Data
public class Client {
    private String clientId;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String fax;
    private char is_client;
    private char is_manufacturer;
    private char is_holder;
    private char is_supplier;
}
