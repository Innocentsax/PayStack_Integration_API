
package com.example.paystackimpl;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "first_name",
    "last_name",
    "email",
    "customer_code",
    "phone",
    "metadata",
    "risk_action",
    "international_format_phone"
})
public class Customer {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("first_name")
    private Object firstName;
    @JsonProperty("last_name")
    private Object lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("customer_code")
    private String customerCode;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("metadata")
    private Object metadata;
    @JsonProperty("risk_action")
    private String riskAction;
    @JsonProperty("international_format_phone")
    private Object internationalFormatPhone;

}
