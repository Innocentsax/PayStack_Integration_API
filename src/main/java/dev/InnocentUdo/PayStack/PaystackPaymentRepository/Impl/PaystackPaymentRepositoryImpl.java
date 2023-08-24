package dev.InnocentUdo.PayStack.PaystackPaymentRepository.Impl;

import dev.InnocentUdo.PayStack.Model.Domain.PaymentPaystack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaystackPaymentRepositoryImpl extends JpaRepository<PaymentPaystack, Long> {
}

