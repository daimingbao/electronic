package com.electronic.model;

import java.math.BigDecimal;

public class OrderItem extends OrderItemKey {
    private BigDecimal dealPrice;
    
    private String message;

    public BigDecimal getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(BigDecimal dealPrice) {
        this.dealPrice = dealPrice;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}