package com.hevlar.orderbook.infrastructure.repository;

import com.hevlar.orderbook.infrastructure.entity.OrderBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderBookEntityRepository extends JpaRepository<OrderBookEntity, Long> {
}
