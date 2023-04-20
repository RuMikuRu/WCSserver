package com.rumikuru.wcsserver.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
@Data
public class DeliveryResult {
    @JoinColumn(name = "incomings_id")
    private String inc_Id;
    @JoinColumn(name = "incomings_date_to_ship")
    private Date received_Date;
}
