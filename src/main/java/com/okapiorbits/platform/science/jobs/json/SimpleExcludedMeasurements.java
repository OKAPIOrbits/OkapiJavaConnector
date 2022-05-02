
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
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
 * SimpleExcludedMeasurements
 * <p>
 * The execlued measurements from the statistical orbit determination process.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tracklet_id",
    "epochGd",
    "component",
    "measurement",
    "residual",
    "residual_std"
})
public class SimpleExcludedMeasurements {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tracklet_id")
    private Double trackletId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("epochGd")
    private Date epochGd;
    /**
     * the measurement component, e.g. range, angle_1, angle_2, range-rate, x, y, z, ...
     * (Required)
     * 
     */
    @JsonProperty("component")
    @JsonPropertyDescription("the measurement component, e.g. range, angle_1, angle_2, range-rate, x, y, z, ...")
    private String component;
    /**
     * the measurement value
     * (Required)
     * 
     */
    @JsonProperty("measurement")
    @JsonPropertyDescription("the measurement value")
    private Double measurement;
    /**
     * the residual
     * (Required)
     * 
     */
    @JsonProperty("residual")
    @JsonPropertyDescription("the residual")
    private Double residual;
    /**
     * the residual standard deviation (1-sigma)
     * (Required)
     * 
     */
    @JsonProperty("residual_std")
    @JsonPropertyDescription("the residual standard deviation (1-sigma)")
    private Double residualStd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tracklet_id")
    public Double getTrackletId() {
        return trackletId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tracklet_id")
    public void setTrackletId(Double trackletId) {
        this.trackletId = trackletId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("epochGd")
    public Date getEpochGd() {
        return epochGd;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("epochGd")
    public void setEpochGd(Date epochGd) {
        this.epochGd = epochGd;
    }

    /**
     * the measurement component, e.g. range, angle_1, angle_2, range-rate, x, y, z, ...
     * (Required)
     * 
     */
    @JsonProperty("component")
    public String getComponent() {
        return component;
    }

    /**
     * the measurement component, e.g. range, angle_1, angle_2, range-rate, x, y, z, ...
     * (Required)
     * 
     */
    @JsonProperty("component")
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * the measurement value
     * (Required)
     * 
     */
    @JsonProperty("measurement")
    public Double getMeasurement() {
        return measurement;
    }

    /**
     * the measurement value
     * (Required)
     * 
     */
    @JsonProperty("measurement")
    public void setMeasurement(Double measurement) {
        this.measurement = measurement;
    }

    /**
     * the residual
     * (Required)
     * 
     */
    @JsonProperty("residual")
    public Double getResidual() {
        return residual;
    }

    /**
     * the residual
     * (Required)
     * 
     */
    @JsonProperty("residual")
    public void setResidual(Double residual) {
        this.residual = residual;
    }

    /**
     * the residual standard deviation (1-sigma)
     * (Required)
     * 
     */
    @JsonProperty("residual_std")
    public Double getResidualStd() {
        return residualStd;
    }

    /**
     * the residual standard deviation (1-sigma)
     * (Required)
     * 
     */
    @JsonProperty("residual_std")
    public void setResidualStd(Double residualStd) {
        this.residualStd = residualStd;
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
        sb.append(SimpleExcludedMeasurements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("trackletId");
        sb.append('=');
        sb.append(((this.trackletId == null)?"<null>":this.trackletId));
        sb.append(',');
        sb.append("epochGd");
        sb.append('=');
        sb.append(((this.epochGd == null)?"<null>":this.epochGd));
        sb.append(',');
        sb.append("component");
        sb.append('=');
        sb.append(((this.component == null)?"<null>":this.component));
        sb.append(',');
        sb.append("measurement");
        sb.append('=');
        sb.append(((this.measurement == null)?"<null>":this.measurement));
        sb.append(',');
        sb.append("residual");
        sb.append('=');
        sb.append(((this.residual == null)?"<null>":this.residual));
        sb.append(',');
        sb.append("residualStd");
        sb.append('=');
        sb.append(((this.residualStd == null)?"<null>":this.residualStd));
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
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.residualStd == null)? 0 :this.residualStd.hashCode()));
        result = ((result* 31)+((this.trackletId == null)? 0 :this.trackletId.hashCode()));
        result = ((result* 31)+((this.epochGd == null)? 0 :this.epochGd.hashCode()));
        result = ((result* 31)+((this.residual == null)? 0 :this.residual.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.measurement == null)? 0 :this.measurement.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimpleExcludedMeasurements) == false) {
            return false;
        }
        SimpleExcludedMeasurements rhs = ((SimpleExcludedMeasurements) other);
        return ((((((((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component)))&&((this.residualStd == rhs.residualStd)||((this.residualStd!= null)&&this.residualStd.equals(rhs.residualStd))))&&((this.trackletId == rhs.trackletId)||((this.trackletId!= null)&&this.trackletId.equals(rhs.trackletId))))&&((this.epochGd == rhs.epochGd)||((this.epochGd!= null)&&this.epochGd.equals(rhs.epochGd))))&&((this.residual == rhs.residual)||((this.residual!= null)&&this.residual.equals(rhs.residual))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.measurement == rhs.measurement)||((this.measurement!= null)&&this.measurement.equals(rhs.measurement))));
    }

}
