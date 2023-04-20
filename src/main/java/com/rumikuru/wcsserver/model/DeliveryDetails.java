package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class DeliveryDetails{
    private Integer line_num;
    @OneToOne
    @JoinColumn(name="SKU_id", nullable = false)
    private Sku line_sku_id;
    private Integer line_doc_qty;
    private String line_comments;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
