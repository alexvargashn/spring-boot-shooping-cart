package com.shoppingcart.infrastructure.controller;

import com.shoppingcart.application.dto.PaymentDto;
import com.shoppingcart.application.service.PaymentUseCase;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentUseCase paymentUseCase;

    public PaymentController(PaymentUseCase paymentUseCase) {
        this.paymentUseCase = paymentUseCase;
    }

    @PostMapping("/{orderId}")
    public ResponseEntity<PaymentDto> payOrder(@PathVariable UUID orderId) {
        return ResponseEntity.ok(paymentUseCase.simulatePayment(orderId));
    }
}
