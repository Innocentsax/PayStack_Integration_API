package com.example.paystackimpl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final WebClient webClient;

    public PaymentService() {
        this.webClient = WebClient.builder()
                .baseUrl("https://api.paystack.co")
                .defaultHeader(HttpHeaders.AUTHORIZATION,"Bearer sk_test_cd7c0f64d9aa4c1b2b9b31a004e96d7a88fb6bd2")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }


    public ResponseEntity<PaystackResponse> initializeTransaction(PaymentDto paymentDto) {
        PaystackResponse todo = webClient
                .post()
                .uri("/transaction/initialize")
                .bodyValue(paymentDto)
                .retrieve()
                .bodyToMono(PaystackResponse.class).block();
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    public ResponseEntity<Paystackimpl> verifyTransaction() {
        Paystackimpl response = webClient
                .get()
                .uri("/transaction/verify/Ref-12345")
                .retrieve()
                .bodyToMono(Paystackimpl.class).block();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
