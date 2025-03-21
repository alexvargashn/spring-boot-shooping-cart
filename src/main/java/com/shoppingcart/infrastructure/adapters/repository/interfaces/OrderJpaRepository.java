package com.shoppingcart.infrastructure.adapters.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.infrastructure.entity.OrderEntity;

import java.util.UUID;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, UUID> {
}
