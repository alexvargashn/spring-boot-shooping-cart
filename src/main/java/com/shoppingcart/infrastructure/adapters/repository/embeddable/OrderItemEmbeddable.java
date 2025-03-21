package com.shoppingcart.infrastructure.adapters.repository.embeddable;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderItemEmbeddable {

    private Long productId;
    private Integer quantity;

    public OrderItemEmbeddable() {
    }

    public OrderItemEmbeddable(Long productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters and setters

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
