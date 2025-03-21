package com.shoppingcart.infrastructure.entity;

import com.shoppingcart.domain.model.Order;
import com.shoppingcart.domain.model.OrderItem;
import com.shoppingcart.infrastructure.adapters.repository.embeddable.OrderItemEmbeddable;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    private UUID id;

    @ElementCollection
    @CollectionTable(name = "order_items", joinColumns = @JoinColumn(name = "order_id"))
    private List<OrderItemEmbeddable> items;

    private Double total;

    public static OrderEntity fromDomain(Order order) {
        OrderEntity entity = new OrderEntity();
        entity.id = order.getId();
        entity.total = order.getTotal();
        entity.items = order.getItems().stream()
                .map(item -> new OrderItemEmbeddable(item.getProductId(), item.getQuantity()))
                .collect(Collectors.toList());
        return entity;
    }

    public Order toDomain() {
        return new Order(this.id, this.items.stream().map(i -> new OrderItem(i.getProductId(), i.getQuantity()))
                .collect(Collectors.toList()), this.total);
    }

    // Getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<OrderItemEmbeddable> getItems() {
        return items;
    }

    public void setItems(List<OrderItemEmbeddable> items) {
        this.items = items;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
