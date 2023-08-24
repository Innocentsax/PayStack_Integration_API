package dev.InnocentUdo.PayStack.Controller;

import dev.InnocentUdo.PayStack.Model.dto.CreatePlanDto;
import dev.InnocentUdo.PayStack.Model.dto.InitializePaymentDto;
import dev.InnocentUdo.PayStack.Model.response.CreatePlanResponse;
import dev.InnocentUdo.PayStack.Model.response.InitializePaymentResponse;
import dev.InnocentUdo.PayStack.Model.response.PaymentVerificationResponse;
import dev.InnocentUdo.PayStack.service.PaystackService;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        value = "/paystack",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class PaystackController {

    private final PaystackService paystackService;

    public PaystackController(PaystackService paystackService) {
        this.paystackService = paystackService;
    }

    @PostMapping("/createplan")
    public CreatePlanResponse createPlan(@Validated @RequestBody CreatePlanDto createPlanDto) throws Exception {
        return paystackService.createPlan(createPlanDto);
    }

    @PostMapping("/initializepayment")
    public InitializePaymentResponse initializePayment(@Validated @RequestBody InitializePaymentDto initializePaymentDto) throws Throwable {
        return paystackService.initializePayment(initializePaymentDto);
    }

    @GetMapping("/verifypayment/{reference}/{plan}/{id}")
    public PaymentVerificationResponse paymentVerification(@PathVariable(value = "reference") String reference,
                                                           @PathVariable(value = "plan") String plan,
                                                           @PathVariable(value = "id") Long id) throws Exception {
        if (reference.isEmpty() || plan.isEmpty()) {
            throw new Exception("reference, plan and id must be provided in path");
        }
        return paystackService.paymentVerification(reference, plan, id);
    }
}

