
package com.okapiorbits.platform.science.jobs.json;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OdResult
 * <p>
 * An orbit determination result as an array of state vectors and keplerian elements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wls_result",
    "ephemerides",
    "excluded_measurements"
})
public class OdResult {

    /**
     * WlsResult
     * <p>
     * Meta information on the result from the weighted least squares statistical orbit determination.
     * 
     */
    @JsonProperty("wls_result")
    @JsonPropertyDescription("Meta information on the result from the weighted least squares statistical orbit determination.")
    private WlsResult wlsResult;
    @JsonProperty("ephemerides")
    private List<SimpleSodResult> ephemerides = new ArrayList<SimpleSodResult>();
    @JsonProperty("excluded_measurements")
    private List<SimpleExcludedMeasurements> excludedMeasurements = new ArrayList<SimpleExcludedMeasurements>();

    /**
     * WlsResult
     * <p>
     * Meta information on the result from the weighted least squares statistical orbit determination.
     * 
     */
    @JsonProperty("wls_result")
    public WlsResult getWlsResult() {
        return wlsResult;
    }

    /**
     * WlsResult
     * <p>
     * Meta information on the result from the weighted least squares statistical orbit determination.
     * 
     */
    @JsonProperty("wls_result")
    public void setWlsResult(WlsResult wlsResult) {
        this.wlsResult = wlsResult;
    }

    @JsonProperty("ephemerides")
    public List<SimpleSodResult> getEphemerides() {
        return ephemerides;
    }

    @JsonProperty("ephemerides")
    public void setEphemerides(List<SimpleSodResult> ephemerides) {
        this.ephemerides = ephemerides;
    }

    @JsonProperty("excluded_measurements")
    public List<SimpleExcludedMeasurements> getExcludedMeasurements() {
        return excludedMeasurements;
    }

    @JsonProperty("excluded_measurements")
    public void setExcludedMeasurements(List<SimpleExcludedMeasurements> excludedMeasurements) {
        this.excludedMeasurements = excludedMeasurements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OdResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wlsResult");
        sb.append('=');
        sb.append(((this.wlsResult == null)?"<null>":this.wlsResult));
        sb.append(',');
        sb.append("ephemerides");
        sb.append('=');
        sb.append(((this.ephemerides == null)?"<null>":this.ephemerides));
        sb.append(',');
        sb.append("excludedMeasurements");
        sb.append('=');
        sb.append(((this.excludedMeasurements == null)?"<null>":this.excludedMeasurements));
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
        result = ((result* 31)+((this.ephemerides == null)? 0 :this.ephemerides.hashCode()));
        result = ((result* 31)+((this.wlsResult == null)? 0 :this.wlsResult.hashCode()));
        result = ((result* 31)+((this.excludedMeasurements == null)? 0 :this.excludedMeasurements.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OdResult) == false) {
            return false;
        }
        OdResult rhs = ((OdResult) other);
        return ((((this.ephemerides == rhs.ephemerides)||((this.ephemerides!= null)&&this.ephemerides.equals(rhs.ephemerides)))&&((this.wlsResult == rhs.wlsResult)||((this.wlsResult!= null)&&this.wlsResult.equals(rhs.wlsResult))))&&((this.excludedMeasurements == rhs.excludedMeasurements)||((this.excludedMeasurements!= null)&&this.excludedMeasurements.equals(rhs.excludedMeasurements))));
    }

}
