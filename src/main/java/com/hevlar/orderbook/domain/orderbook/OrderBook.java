package com.hevlar.orderbook.domain.orderbook;

import com.hevlar.orderbook.domain.orderbook.entities.Order;
import com.hevlar.orderbook.domain.orderbook.entities.OrderExecution;
import com.hevlar.orderbook.domain.orderbook.exceptions.OrderBookClosedException;
import com.hevlar.orderbook.domain.orderbook.repositories.OrderBookRepository;
import com.hevlar.orderbook.domain.orderbook.repositories.OrderExecutionRepository;
import com.hevlar.orderbook.domain.orderbook.repositories.OrderRepository;
import com.hevlar.orderbook.domain.orderbook.valueobjects.OrderBookStatus;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

public class OrderBook {

    OrderBookRepository orderBookRepository;
    OrderRepository orderRepository;
    OrderExecutionRepository orderExecutionRepository;
    Long OrderBookId;
    OrderBookStatus status;

    public OrderBook(OrderBookRepository orderBookRepository, OrderRepository orderRepository, OrderExecutionRepository orderExecutionRepository){
        this.orderBookRepository = orderBookRepository;
        this.orderRepository = orderRepository;
        this.orderExecutionRepository = orderExecutionRepository;
        this.status = OrderBookStatus.Open;
    }

    public List<Order> getOrderList() {
        return orderRepository.listOrders();
    }

    public OrderBookStatus getStatus() {
        return status;
    }

    public void addMarketOrder(String instrumentId, Integer quantity, ZonedDateTime entryDate) throws OrderBookClosedException {
        if(!canAddOrder()) throw new OrderBookClosedException();
        Order marketOrder = Order.marketOrder(instrumentId, quantity, entryDate);
        orderRepository.addOrder(marketOrder);
    }

    public void addLimitOrder(String instrumentId, Integer quantity, ZonedDateTime entryDate, BigDecimal price) throws OrderBookClosedException {
        if(!canAddOrder()) throw new OrderBookClosedException();
        Order limitOrder = Order.limitOrder(instrumentId, quantity, entryDate, price);
        orderRepository.addOrder(limitOrder);
    }

    public Boolean canAddOrder() {
        return status == OrderBookStatus.Open;
    }

    public void close() {
        status = OrderBookStatus.Closed;
    }

    public void addExecution(OrderExecution execution) {
        orderExecutionRepository.addOrderExecution(execution);
    }

    public List<OrderExecution> listExecutions() {
        return orderExecutionRepository.listOrderExecutions();
    }
}
