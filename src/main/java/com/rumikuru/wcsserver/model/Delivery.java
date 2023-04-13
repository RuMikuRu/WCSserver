package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "INCOMINGS")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String inc_id;//INCOMINGS.SDID
    private String supplier_id; //INCOMINGS.SUPPLIER_ID, ссылка на справочник контрагентов, найденная по CLIENT.SDID
    private String holder_id; //INCOMINGS.HOLDER_ID, ссылка на справочник контрагентов, найденная по CLIENT.SDID
    private Date date_to_ship;
    private String comments;

}
