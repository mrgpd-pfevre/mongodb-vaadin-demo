package com.example;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sys_Reference",
        "sys-Title",
        "sys_CurrentResourceId"
})
public abstract class MoovappsViewResponseValue {
    @JsonProperty("sys_Reference")
    protected String sysReference;
    @JsonProperty("sys_Title")
    protected String sysTitle;
    @JsonProperty("sys_CurrentResourceId")
    protected Integer sysCurrentResourceId;
    @JsonIgnore
    protected Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sys_Reference")
    public String getSysReference() {
        return sysReference;
    }

    @JsonProperty("sys_Reference")
    public void setSysReference(String sysReference) {
        this.sysReference = sysReference;
    }

    @JsonProperty("sys_Title")
    public String getSysTitle() {
        return sysTitle;
    }

    @JsonProperty("sys_Title")
    public void setSysTitle(String sysTitle) {
        this.sysTitle = sysTitle;
    }

    @JsonProperty("sys_CurrentResourceId")
    public Integer getSysCurrentResourceId() {
        return sysCurrentResourceId;
    }

    @JsonProperty("sys_CurrentResourceId")
    public void setSysCurrentResourceId(Integer sysCurrentResourceId) {
        this.sysCurrentResourceId = sysCurrentResourceId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public abstract String display();
}
