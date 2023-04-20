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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_master_id", nullable = false)
    private Client supplier_id; //INCOMINGS.SUPPLIER_ID, ссылка на справочник контрагентов, найденная по CLIENT.SDID
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_master_is_holder")
    private Client holder_id; //INCOMINGS.HOLDER_ID, ссылка на справочник контрагентов, найденная по CLIENT.SDID
    private Date date_to_ship;
    private String comments;

}
