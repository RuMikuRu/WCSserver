package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String shipment_NMB;
    @OneToOne
    @JoinColumn(name = "client_master_id", nullable = false)
    private Client client_id;
    @OneToOne
    @JoinColumn(name = "client_master_is_holder", nullable = false)
    private Client holder_id;
    private String shipping_address;
    private char type;
    private Date date_to_ship;
    private String comments;
    private char can_be_merged;
    private String extension_NMB;
    private String direction_code;
    private String direction_title;
    private Date delivery_date;
    private Time date_delivered;
}
