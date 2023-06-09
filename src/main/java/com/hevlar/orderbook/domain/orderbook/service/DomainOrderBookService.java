package com.hevlar.orderbook.domain.orderbook.service;

import com.hevlar.orderbook.domain.orderbook.OrderBook;
import com.hevlar.orderbook.domain.orderbook.entities.Order;
import com.hevlar.orderbook.domain.orderbook.entities.OrderExecution;
import com.hevlar.orderbook.domain.orderbook.repositories.OrderBookRepository;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainOrderBookService implements OrderBookService{

    OrderBookRepository orderBookRepository;

    public DomainOrderBookService(OrderBookRepository orderBookRepository){
        this.orderBookRepository = orderBookRepository;
    }
    @Override
    public List<OrderBook> listOrderBooks() {
        return orderBookRepository.listOrderBooks();
    }

    @Override
    public OrderBook getOrderBook(Long orderBookId) {
        return orderBookRepository.getOrderBook(orderBookId);
    }

    @Override
    public OrderBook createOrderBook(Order order) {
        return null;
    }

    @Override
    public void addOrder(Long orderBookId, Order order) {

    }

    @Override
    public void closeOrderBook(Long orderBookId) {

    }

    @Override
    public void addExecution(Long orderBookId, OrderExecution execution) {

    }
}
