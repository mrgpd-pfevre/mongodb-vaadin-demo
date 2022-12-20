package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoovappsResponse {
    @JsonProperty("id")
    public Integer id;

    public MoovappsResponse() {
    }
    public MoovappsResponse(Integer id) {
        this.id = id;
    }
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }
    public MoovappsResponse(MoovappsViewResponseValue responseValue) {
        if (responseValue == null)
            return;
        else
            id=responseValue.getSysCurrentResourceId();
    }

    @Override
    public String toString() {
        return "Moovapps Id: "+id;
    }
}
