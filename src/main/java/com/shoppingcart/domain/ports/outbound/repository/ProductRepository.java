package com.shoppingcart.domain.ports.outbound.repository;

import java.util.List;

import com.shoppingcart.domain.model.Product;

public interface ProductRepository {
    List<Product> getAllProducts();

    Product getProductById(Long id);
}
