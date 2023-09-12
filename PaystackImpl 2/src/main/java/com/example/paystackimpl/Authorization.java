
package com.example.paystackimpl;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "authorization_code",
    "bin",
    "last4",
    "exp_month",
    "exp_year",
    "channel",
    "card_type",
    "bank",
    "country_code",
    "brand",
    "reusable",
    "signature",
    "account_name"
})
public class Authorization {

    @JsonProperty("authorization_code")
    private String authorizationCode;
    @JsonProperty("bin")
    private String bin;
    @JsonProperty("last4")
    private String last4;
    @JsonProperty("exp_month")
    private String expMonth;
    @JsonProperty("exp_year")
    private String expYear;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("card_type")
    private String cardType;
    @JsonProperty("bank")
    private String bank;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("reusable")
    private Boolean reusable;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("account_name")
    private Object accountName;
}
