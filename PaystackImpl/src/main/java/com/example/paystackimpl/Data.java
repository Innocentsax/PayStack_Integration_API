
package com.example.paystackimpl;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "authorization_url",
    "access_code",
    "reference"
})
public class Data {
    @JsonProperty("authorization_url")
    private String authorizationUrl;
    @JsonProperty("access_code")
    private String accessCode;
    @JsonProperty("reference")
    private String reference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("authorization_url")
    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    @JsonProperty("authorization_url")
    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    @JsonProperty("access_code")
    public String getAccessCode() {
        return accessCode;
    }

    @JsonProperty("access_code")
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
