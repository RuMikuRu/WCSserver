package com.rumikuru.wcsserver.model;

import lombok.Data;

@Data
public class DeliveryResultDetail {
    private Integer line_num;
    private String line_sku_id;
    private Integer line_DOC_QTY;
    private Integer line_RCY_QTY;
    private String line_category;

}
