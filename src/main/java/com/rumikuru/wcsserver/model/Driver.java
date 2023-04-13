package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DRIVER")
public class Driver {
    private String driver_name;
    private String driver_pass_num;
    private String driver_license;
    private String driver_phone;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
}
