package com.hevlar.orderbook.domain.orderbook.service;

import com.hevlar.orderbook.domain.orderbook.OrderBook;
import com.hevlar.orderbook.domain.orderbook.entities.Order;
import com.hevlar.orderbook.domain.orderbook.entities.OrderExecution;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderBookService {
    List<OrderBook> listOrderBooks();
    OrderBook getOrderBook(Long orderBookId);
    OrderBook createOrderBook(Order order);
    void addOrder(Long orderBookId, Order order);
    void closeOrderBook(Long orderBookId);
    void addExecution(Long orderBookId, OrderExecution execution);

}
