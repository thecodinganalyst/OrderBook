package com.hevlar.orderbook.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class OrderBookEntity {
    @Id
    @GeneratedValue
    Long OrderBookId;

    @Column
    Integer status;

    @OneToMany(mappedBy = "orderBook", cascade = CascadeType.ALL)
    List<OrderEntity> orderList;

    @OneToMany(mappedBy = "orderBook", cascade = CascadeType.ALL)
    List<OrderExecutionEntity> orderExecutionEntityList;
}
