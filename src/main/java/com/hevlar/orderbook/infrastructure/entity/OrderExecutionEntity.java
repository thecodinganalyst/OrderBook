package com.hevlar.orderbook.infrastructure.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class OrderExecutionEntity {
    @Id
    @GeneratedValue
    Long orderExecutionId;
    Integer quantity;
    BigDecimal price;
    @ManyToOne
    @JoinColumn
    OrderBookEntity orderBook;
}
