package com.shoppingcart.domain.ports.outbound.repository;

import com.shoppingcart.domain.model.Order;

import java.util.List;
import java.util.UUID;

public interface OrderRepository {
    Order save(Order order);

    List<Order> findAll();

    Order findById(UUID id);
}
