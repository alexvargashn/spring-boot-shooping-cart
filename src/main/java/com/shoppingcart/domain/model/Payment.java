package com.shoppingcart.domain.model;

import java.util.UUID;

public class Payment {

    private UUID orderId;
    private PaymentStatus status;

    public Payment(UUID orderId, PaymentStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
