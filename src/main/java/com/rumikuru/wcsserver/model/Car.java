package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CAR")
public class Car {
    @Id
    @Column(name = "id")
    private Long id;
    private String truck_type;
    private String truck_plate;
    private String trailer_plate;

}
