package com.shoppingcart.domain.ports.outbound.repository;

import com.shoppingcart.domain.model.Payment;

public interface PaymentRepository {
    Payment save(Payment payment);
    
} 
