package com.hevlar.orderbook.domain.orderbook.entities;

import java.math.BigDecimal;

public class OrderExecution {

    Integer quantity;
    BigDecimal price;

    public OrderExecution(Integer quantity, BigDecimal price){
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
