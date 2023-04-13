package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "ClientMaster")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
