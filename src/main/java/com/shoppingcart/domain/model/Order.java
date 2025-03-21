package com.shoppingcart.domain.model;

import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id;
    private List<OrderItem> items;
    private Double total;

    public Order(UUID id, List<OrderItem> items, Double total) {
        this.id = id;
        this.items = items;
        this.total = total;
    }

    public UUID getId() {
        return id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Double getTotal() {
        return total;
    }
}
