package com.shoppingcart.infrastructure.adapters.repository;

import com.shoppingcart.domain.model.Order;
import com.shoppingcart.domain.ports.outbound.repository.OrderRepository;
import com.shoppingcart.infrastructure.adapters.repository.interfaces.OrderJpaRepository;
import com.shoppingcart.infrastructure.entity.OrderEntity;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderJpaRepository jpaRepository;

    public OrderRepositoryImpl(OrderJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Order save(Order order) {
        return jpaRepository.save(OrderEntity.fromDomain(order)).toDomain();
    }

    @Override
    public List<Order> findAll() {
        return jpaRepository.findAll().stream().map(OrderEntity::toDomain).collect(Collectors.toList());
    }

    @Override
    public Order findById(UUID id) {
        return jpaRepository.findById(id).map(OrderEntity::toDomain).orElse(null);
    }
}
