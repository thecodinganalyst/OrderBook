package com.hevlar.orderbook.domain.orderbook.repositories;

import com.hevlar.orderbook.domain.orderbook.entities.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> listOrders();

    void addOrder(Order order);
}
