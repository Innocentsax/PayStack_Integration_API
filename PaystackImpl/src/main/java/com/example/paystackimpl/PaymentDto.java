package com.example.paystackimpl;

import lombok.Data;

@Data
public class PaymentDto {
    private double amount;
    private String email;
    private String currency;
    private String reference;
    private String callbackUrl;
}
