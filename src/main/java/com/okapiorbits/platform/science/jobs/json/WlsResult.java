
package com.okapiorbits.platform.science.jobs.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WlsResult
 * <p>
 * Meta information on the result from the weighted least squares statistical orbit determination.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rms",
    "iterations",
    "converged",
    "accepted_residuals"
})
public class WlsResult {

    /**
     * The root mean square from error from the weighted least squares process
     * (Required)
     * 
     */
    @JsonProperty("rms")
    @JsonPropertyDescription("The root mean square from error from the weighted least squares process")
    private Double rms;
    /**
     * The number of iterations until the WLS process was terminated
     * (Required)
     * 
     */
    @JsonProperty("iterations")
    @JsonPropertyDescription("The number of iterations until the WLS process was terminated")
    private Integer iterations;
    /**
     * Flag that indicates whether the WLS process has converged or was stopped by the maximum allowed number of iterations
     * (Required)
     * 
     */
    @JsonProperty("converged")
    @JsonPropertyDescription("Flag that indicates whether the WLS process has converged or was stopped by the maximum allowed number of iterations")
    private Boolean converged;
    /**
     * Relative number of accepted residuals. accepted_residuals x 100 = percent of accepted residuals.
     * 
     */
    @JsonProperty("accepted_residuals")
    @JsonPropertyDescription("Relative number of accepted residuals. accepted_residuals x 100 = percent of accepted residuals.")
    private Double acceptedResiduals;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The root mean square from error from the weighted least squares process
     * (Required)
     * 
     */
    @JsonProperty("rms")
    public Double getRms() {
        return rms;
    }

    /**
     * The root mean square from error from the weighted least squares process
     * (Required)
     * 
     */
    @JsonProperty("rms")
    public void setRms(Double rms) {
        this.rms = rms;
    }

    /**
     * The number of iterations until the WLS process was terminated
     * (Required)
     * 
     */
    @JsonProperty("iterations")
    public Integer getIterations() {
        return iterations;
    }

    /**
     * The number of iterations until the WLS process was terminated
     * (Required)
     * 
     */
    @JsonProperty("iterations")
    public void setIterations(Integer iterations) {
        this.iterations = iterations;
    }

    /**
     * Flag that indicates whether the WLS process has converged or was stopped by the maximum allowed number of iterations
     * (Required)
     * 
     */
    @JsonProperty("converged")
    public Boolean getConverged() {
        return converged;
    }

    /**
     * Flag that indicates whether the WLS process has converged or was stopped by the maximum allowed number of iterations
     * (Required)
     * 
     */
    @JsonProperty("converged")
    public void setConverged(Boolean converged) {
        this.converged = converged;
    }

    /**
     * Relative number of accepted residuals. accepted_residuals x 100 = percent of accepted residuals.
     * 
     */
    @JsonProperty("accepted_residuals")
    public Double getAcceptedResiduals() {
        return acceptedResiduals;
    }

    /**
     * Relative number of accepted residuals. accepted_residuals x 100 = percent of accepted residuals.
     * 
     */
    @JsonProperty("accepted_residuals")
    public void setAcceptedResiduals(Double acceptedResiduals) {
        this.acceptedResiduals = acceptedResiduals;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WlsResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rms");
        sb.append('=');
        sb.append(((this.rms == null)?"<null>":this.rms));
        sb.append(',');
        sb.append("iterations");
        sb.append('=');
        sb.append(((this.iterations == null)?"<null>":this.iterations));
        sb.append(',');
        sb.append("converged");
        sb.append('=');
        sb.append(((this.converged == null)?"<null>":this.converged));
        sb.append(',');
        sb.append("acceptedResiduals");
        sb.append('=');
        sb.append(((this.acceptedResiduals == null)?"<null>":this.acceptedResiduals));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.rms == null)? 0 :this.rms.hashCode()));
        result = ((result* 31)+((this.converged == null)? 0 :this.converged.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.iterations == null)? 0 :this.iterations.hashCode()));
        result = ((result* 31)+((this.acceptedResiduals == null)? 0 :this.acceptedResiduals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WlsResult) == false) {
            return false;
        }
        WlsResult rhs = ((WlsResult) other);
        return ((((((this.rms == rhs.rms)||((this.rms!= null)&&this.rms.equals(rhs.rms)))&&((this.converged == rhs.converged)||((this.converged!= null)&&this.converged.equals(rhs.converged))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.iterations == rhs.iterations)||((this.iterations!= null)&&this.iterations.equals(rhs.iterations))))&&((this.acceptedResiduals == rhs.acceptedResiduals)||((this.acceptedResiduals!= null)&&this.acceptedResiduals.equals(rhs.acceptedResiduals))));
    }

}
