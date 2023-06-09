package com.hevlar.orderbook.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Data
public class OrderEntity {
    @Id
    @GeneratedValue
    Long OrderId;

    String instrumentId;
    Integer quantity;
    BigDecimal price;
    ZonedDateTime entryDate;
    @ManyToOne
    @JoinColumn
    OrderBookEntity orderBook;
}
