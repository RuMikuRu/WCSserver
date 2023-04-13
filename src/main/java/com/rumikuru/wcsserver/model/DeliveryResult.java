package com.rumikuru.wcsserver.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
@Data
public class DeliveryResult {
    private String inc_Id;
    private Date received_Date;

    DeliveryResult(String inc_Id, Date received_Date){
        this.inc_Id = inc_Id;
        this.received_Date = received_Date;
    }
}
