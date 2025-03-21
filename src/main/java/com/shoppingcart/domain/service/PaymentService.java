package com.shoppingcart.domain.service;

import com.shoppingcart.application.dto.PaymentDto;
import com.shoppingcart.application.dto.PaymentItemDto;
import com.shoppingcart.domain.model.Payment;
import com.shoppingcart.domain.model.PaymentStatus;
import com.shoppingcart.domain.ports.outbound.repository.OrderRepository;
import com.shoppingcart.domain.ports.outbound.repository.PaymentRepository;

import java.util.List;
import java.util.UUID;

public class PaymentService {

    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;

    public PaymentService(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository   = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    public PaymentDto processPayment(UUID orderId) {
        var order = orderRepository.findById(orderId);
        if (order == null) {
            return new PaymentDto(orderId, PaymentStatus.FAILED, 0.0, List.of());
        }

        var payment = new Payment(orderId, PaymentStatus.SUCCESS);
        paymentRepository.save(payment);

        var items = order.getItems().stream()
                .map(i -> new PaymentItemDto(i.getProductId(), i.getQuantity()))
                .toList();

        return new PaymentDto(orderId, payment.getStatus(), order.getTotal(), items);
    }
}

