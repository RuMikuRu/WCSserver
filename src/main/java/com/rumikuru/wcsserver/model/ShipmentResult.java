package com.rumikuru.wcsserver.model;

import lombok.Data;

import java.util.Date;

@Data
public class ShipmentResult {
    private String shipment_NMB;
    private Date date_to_handling;
    private String carrier_id;
    private Driver driver;
    private  Car car;

}
