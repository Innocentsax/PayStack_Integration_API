package dev.InnocentUdo.PayStack.Model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InitializePaymentDto {

    @NotNull(message = "Amount cannot be null")
    @JsonProperty("amount")
    private String amount;

    @NotNull(message = "Email cannot be null")
    @JsonProperty("email")
    private String email;

    @NotNull(message = "Currency cannot be null")
    @JsonProperty("currency")
    private String currency;

    @NotNull(message = "Plan cannot be null")
    @JsonProperty("plan")
    private String plan;

    @NotNull(message = "Channels cannot be null")
    @JsonProperty("channels")
    private String[] channels;
}

