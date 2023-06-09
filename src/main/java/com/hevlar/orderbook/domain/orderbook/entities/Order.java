package com.hevlar.orderbook.domain.orderbook.entities;

import com.hevlar.orderbook.domain.orderbook.valueobjects.OrderType;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Order{
    String instrumentId;
    Integer quantity;
    OrderType orderType;
    ZonedDateTime entryDate;
    BigDecimal price;

    private Order(String instrumentId, Integer quantity, OrderType orderType, ZonedDateTime entryDate, BigDecimal price) {
        this.instrumentId = instrumentId;
        this.quantity = quantity;
        this.orderType = orderType;
        this.entryDate = entryDate;
        this.price = price;
    }

    public static Order marketOrder(String instrumentId, Integer quantity, ZonedDateTime entryDate){
        return new Order(instrumentId, quantity, OrderType.MarketOrder, entryDate, null);
    }

    public static Order limitOrder(String instrumentId, Integer quantity, ZonedDateTime entryDate, BigDecimal price){
        return new Order(instrumentId, quantity, OrderType.LimitOrder, entryDate, price);
    }

    public String getInstrumentId() {
        return this.instrumentId;
    }

    public ZonedDateTime getEntryDate() {
        return this.entryDate;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Boolean isLimitOrder() {
        return orderType == OrderType.LimitOrder;
    }

    public Boolean isMarketOrder() {
        return orderType == OrderType.MarketOrder;
    }
}
