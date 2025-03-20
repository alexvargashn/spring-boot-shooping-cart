package com.shoppingcart.application.service;

import com.shoppingcart.domain.model.Product;
import com.shoppingcart.domain.service.ProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductUseCase {

    private final ProductService productService;

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    public Product getProductById(Long id) {
        return productService.getProductById(id);
    }
}
