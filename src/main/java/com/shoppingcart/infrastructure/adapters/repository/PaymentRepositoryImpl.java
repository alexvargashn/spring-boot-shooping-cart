package com.shoppingcart.infrastructure.adapters.repository;

import com.shoppingcart.domain.model.Payment;
import com.shoppingcart.domain.ports.outbound.repository.PaymentRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {

    private final Map<UUID, Payment> inMemoryStore = new HashMap<>();

    @Override
    public Payment save(Payment payment) {
        inMemoryStore.put(payment.getOrderId(), payment);
        return payment;
    }
}
