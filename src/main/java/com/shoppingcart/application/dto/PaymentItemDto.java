package com.shoppingcart.application.dto;

public class PaymentItemDto {
    private Long productId;
    private Integer quantity;

    public PaymentItemDto(Long productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
