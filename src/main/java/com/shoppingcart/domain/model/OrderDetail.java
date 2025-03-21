package com.shoppingcart.domain.model;

public class OrderDetail {

    private Long productId;
    private String productName;
    private Double unitPrice;
    private Integer quantity;

    public OrderDetail(Long productId, String productName, Double unitPrice, Integer quantity) {
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
