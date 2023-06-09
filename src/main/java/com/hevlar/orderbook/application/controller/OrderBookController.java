package com.hevlar.orderbook.application.controller;

import com.hevlar.orderbook.domain.orderbook.OrderBook;
import com.hevlar.orderbook.domain.orderbook.entities.Order;
import com.hevlar.orderbook.domain.orderbook.service.OrderBookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/OrderBooks")
public class OrderBookController {

    OrderBookService orderBookService;

    public OrderBookController(OrderBookService orderBookService){
        this.orderBookService = orderBookService;
    }

    @GetMapping
    public List<OrderBook> orderBookList(){
        return orderBookService.listOrderBooks();
    }

    @GetMapping(value = "/{orderBookId}")
    public OrderBook getOrderBook(@PathVariable("orderBookId") Long orderBookId){
        return orderBookService.getOrderBook(orderBookId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderBook createOrderBook(@RequestBody Order order){
        return orderBookService.createOrderBook(order);
    }

    @PatchMapping(value = "/orderBookId/close")
    public void closeOrderBook(@PathVariable("orderBookId") Long orderBookId){
        orderBookService.closeOrderBook(orderBookId);
    }

}
