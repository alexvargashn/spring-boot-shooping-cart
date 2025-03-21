package com.shoppingcart.application.service;

import com.shoppingcart.domain.model.Order;
import com.shoppingcart.domain.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderUseCase {

    private final OrderService orderService;

    public OrderUseCase(OrderService orderService) {
        this.orderService = orderService;
    }

    public Order createOrder(Order order) {
        return orderService.createOrder(order);
    }

    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    public Order getOrderById(UUID id) {
        return orderService.getOrderById(id);
    }
}
