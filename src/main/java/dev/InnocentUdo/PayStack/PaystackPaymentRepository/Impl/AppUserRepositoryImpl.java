package dev.InnocentUdo.PayStack.PaystackPaymentRepository.Impl;

import dev.InnocentUdo.PayStack.Model.Domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepositoryImpl extends JpaRepository<AppUser, Long> {
}

