package com.shoppingcart.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppingcart.domain.model.Product;
import com.shoppingcart.domain.ports.outbound.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }
}
