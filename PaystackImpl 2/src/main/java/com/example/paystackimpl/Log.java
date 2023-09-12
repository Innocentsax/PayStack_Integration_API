
package com.example.paystackimpl;

import java.util.LinkedHashMap;
import java.util.List;
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
    "start_time",
    "time_spent",
    "attempts",
    "errors",
    "success",
    "mobile",
    "input",
    "history"
})
public class Log {
    @JsonProperty("start_time")
    private Long startTime;
    @JsonProperty("time_spent")
    private Long timeSpent;
    @JsonProperty("attempts")
    private Long attempts;
    @JsonProperty("errors")
    private Long errors;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("mobile")
    private Boolean mobile;
    @JsonProperty("input")
    private List<Object> input;
    @JsonProperty("history")
    private List<History> history;

}
