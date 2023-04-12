package com.rumikuru.wcsserver.model;

import lombok.Data;

import java.util.Date;

@Data
public class Shipment {
    private String shipment_NMB;
    private Date date_to_handling;
    private String carrier_id;
    private String driver_name;
    private String driver_pass_num;
    private String driver_license;
    private String driver_phone;
    private String truck_type;
    private String truck_plate;
    private String trailer_plate;

}
