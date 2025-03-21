package com.shoppingcart.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shoppingcart.domain.ports.outbound.repository.OrderRepository;
import com.shoppingcart.domain.ports.outbound.repository.PaymentRepository;
import com.shoppingcart.domain.ports.outbound.repository.ProductRepository;
import com.shoppingcart.domain.service.PaymentService;
import com.shoppingcart.domain.service.ProductService;

@Configuration
public class BeanConfig {
    
    @Bean
    public ProductService productService(ProductRepository productRepository) {
        return new ProductService(productRepository);
    }

    @Bean
    public PaymentService paymentService(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        return new PaymentService(orderRepository, paymentRepository);
    }

}
