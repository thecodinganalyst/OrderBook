package com.hevlar.orderbook.application.controller;

import com.hevlar.orderbook.domain.orderbook.entities.Order;
import com.hevlar.orderbook.domain.orderbook.service.OrderBookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/OrderBooks/{orderBookId}/orders")
public class OrderController {

    OrderBookService orderBookService;

    public OrderController(OrderBookService orderBookService){
        this.orderBookService = orderBookService;
    }
    @PostMapping
    public void addOrder(@PathVariable("orderBookId") Long orderBookId, @RequestBody Order order){
        this.orderBookService.addOrder(orderBookId, order);
    }
}
