package com.hevlar.orderbook.infrastructure.repository;

import com.hevlar.orderbook.infrastructure.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEntityRepository extends JpaRepository<OrderEntity, Long> {
}
