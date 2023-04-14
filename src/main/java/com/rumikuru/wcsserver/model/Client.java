package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "ClientMaster")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String fax;
    private String is_client;
    private String is_manufacturer;
    private String is_holder;
    private String is_supplier;
}
