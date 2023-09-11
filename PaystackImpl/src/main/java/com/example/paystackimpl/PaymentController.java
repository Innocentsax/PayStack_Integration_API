package com.example.paystackimpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class PaymentController {
    private final WebClient webClient;

    public PaymentController() {
        this.webClient = WebClient.builder()
                .baseUrl("https://api.paystack.co")
                .defaultHeader(HttpHeaders.AUTHORIZATION,"Bearer sk_test_cd7c0f64d9aa4c1b2b9b31a004e96d7a88fb6bd2")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @PostMapping("/initializeTransaction")
    public ResponseEntity<PaystackResponse> initializeTransaction(@RequestBody PaymentDto paymentDto) {
        PaystackResponse todo = webClient
                .post()
                .uri("/transaction/initialize")
                .bodyValue(paymentDto)
                .retrieve()
                .bodyToMono(PaystackResponse.class).block();
        log.info(String.valueOf(todo));
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }





}
