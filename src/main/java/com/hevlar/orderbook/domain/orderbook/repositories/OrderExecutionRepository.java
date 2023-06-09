package com.hevlar.orderbook.domain.orderbook.repositories;

import com.hevlar.orderbook.domain.orderbook.entities.OrderExecution;

import java.util.List;

public interface OrderExecutionRepository {
    List<OrderExecution> listOrderExecutions();
    void addOrderExecution(OrderExecution orderExecution);
}
