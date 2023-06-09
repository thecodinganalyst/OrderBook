package com.hevlar.orderbook.domain.orderbook.repositories;

import com.hevlar.orderbook.domain.orderbook.OrderBook;
import com.hevlar.orderbook.domain.orderbook.service.OrderBookService;

import java.util.List;

public interface OrderBookRepository {
    List<OrderBook> listOrderBooks();

    OrderBook getOrderBook(Long orderBookId);
    void save(OrderBook orderBook);
}
