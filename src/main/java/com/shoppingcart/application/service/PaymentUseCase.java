package com.shoppingcart.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.shoppingcart.application.dto.PaymentDto;
import com.shoppingcart.domain.service.PaymentService;

@Service
public class PaymentUseCase {

    private final PaymentService paymentService;

    public PaymentUseCase(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentDto simulatePayment(UUID orderId) {
        return paymentService.processPayment(orderId);
    }
}
