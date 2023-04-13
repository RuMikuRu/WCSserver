package com.rumikuru.wcsserver.model;

import lombok.Data;

import java.util.Date;

@Data
public class OrderResult {
    private String order_id;
    private Date date_shipped;
    private Integer line_QTY;
    private String line_comments;

    OrderResult(String order_id){
        this.order_id = order_id;
        //TODO сделать поиск по id и вставлять сюда информацию
    }
}
