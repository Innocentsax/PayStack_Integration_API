package dev.InnocentUdo.PayStack.service;

import dev.InnocentUdo.PayStack.Model.dto.CreatePlanDto;
import dev.InnocentUdo.PayStack.Model.dto.InitializePaymentDto;
import dev.InnocentUdo.PayStack.Model.response.CreatePlanResponse;
import dev.InnocentUdo.PayStack.Model.response.InitializePaymentResponse;
import dev.InnocentUdo.PayStack.Model.response.PaymentVerificationResponse;

public interface PaystackService {
    CreatePlanResponse createPlan(CreatePlanDto createPlanDto) throws Exception;
    InitializePaymentResponse initializePayment(InitializePaymentDto initializePaymentDto);
    PaymentVerificationResponse paymentVerification(String reference, String plan, Long id) throws Exception;
}

