package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class DeliveryDetails{
    private Integer line_num;
    private String line_sku_id;
    private Integer line_doc_qty;
    private String line_comments;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
