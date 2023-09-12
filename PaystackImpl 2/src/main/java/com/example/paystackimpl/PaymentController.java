package com.example.paystackimpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;


    @PostMapping("/initializeTransaction")
    public ResponseEntity<PaystackResponse> initializeTransaction(@RequestBody PaymentDto paymentDto) {
        return paymentService.initializeTransaction(paymentDto);
    }

    @GetMapping("/verify-transaction")
    public ResponseEntity<?> verifyTransaction() {
       return paymentService.verifyTransaction();
    }

}
