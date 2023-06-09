package com.hevlar.orderbook.domain.orderbook.exceptions;

public class OrderBookClosedException extends Exception{
    @Override
    public String getMessage() {
        return "Order book is closed, no orders can be added";
    }
}
