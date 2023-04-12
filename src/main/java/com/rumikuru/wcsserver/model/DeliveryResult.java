package com.rumikuru.wcsserver.model;

import lombok.Data;

import java.util.Date;

@Data
public class DeliveryResult {
    private String inc_id;
    private Date received_date;
}
