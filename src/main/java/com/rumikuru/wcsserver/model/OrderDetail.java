package com.rumikuru.wcsserver.model;

import lombok.Data;

@Data
public class OrderDetail {
    private Integer line_num;
    private String line_sku_id;
    private char line_category;
    private Integer line_doc_qty;
    private String line_comments;
}
