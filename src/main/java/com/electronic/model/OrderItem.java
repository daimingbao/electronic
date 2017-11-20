package com.electronic.model;

import java.math.BigDecimal;

public class OrderItem extends OrderItemKey {
    private BigDecimal dealPrice;

    public BigDecimal getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(BigDecimal dealPrice) {
        this.dealPrice = dealPrice;
    }
}