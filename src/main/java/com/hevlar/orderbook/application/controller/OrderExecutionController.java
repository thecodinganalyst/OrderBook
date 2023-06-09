package com.hevlar.orderbook.application.controller;

import com.hevlar.orderbook.domain.orderbook.entities.OrderExecution;
import com.hevlar.orderbook.domain.orderbook.service.OrderBookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/OrderBooks/{orderBookId}/executions")
public class OrderExecutionController {

    OrderBookService orderBookService;

    public OrderExecutionController(OrderBookService orderBookService){
        this.orderBookService = orderBookService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void addExecution(@PathVariable("orderBookId") Long orderBookId, @RequestBody OrderExecution orderExecution){
        this.orderBookService.addExecution(orderBookId, orderExecution);
    }
}
