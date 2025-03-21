package com.shoppingcart.application.dto;

import com.shoppingcart.domain.model.PaymentStatus;

import java.util.List;
import java.util.UUID;

public class PaymentDto {

    private UUID orderId;
    private PaymentStatus status;
    private Double total;
    private List<PaymentItemDto> items;

    public PaymentDto(UUID orderId, PaymentStatus status, Double total, List<PaymentItemDto> items) {
        this.orderId = orderId;
        this.status = status;
        this.total = total;
        this.items = items;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public Double getTotal() {
        return total;
    }

    public List<PaymentItemDto> getItems() {
        return items;
    }
}
