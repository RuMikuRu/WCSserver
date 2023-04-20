package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "SHIPMENT")
@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String shipment_NMB;
    private Date date_to_handling;
    @OneToOne
    @JoinColumn(name = "client_master_id", nullable = false)
    private Client carrier_id;
    @OneToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;
    @OneToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

}
