package com.shoppingcart.infrastructure.adapters.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shoppingcart.domain.model.Product;
import com.shoppingcart.domain.ports.outbound.repository.ProductRepository;
import com.shoppingcart.infrastructure.client.FakeStoreApiClient;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final FakeStoreApiClient fakeStoreApiClient;

    public ProductRepositoryImpl(FakeStoreApiClient fakeStoreApiClient) {
        this.fakeStoreApiClient = fakeStoreApiClient;
    }

    @Override
    public List<Product> getAllProducts() {
        return fakeStoreApiClient.getAllProducts();
    }

    @Override
    public Product getProductById(Long id) {
        return fakeStoreApiClient.getProductById(id);
    }
}