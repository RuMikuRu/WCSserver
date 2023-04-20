package com.rumikuru.wcsserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "ORDER_DETAILS")
@Entity
public class OrderDetail {
    private Integer line_num;
    @OneToOne
    @JoinColumn(name = "SKU_id", nullable = false)
    private Sku line_sku_id;

    private char line_category;
    private Integer line_doc_qty;
    private String line_comments;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
