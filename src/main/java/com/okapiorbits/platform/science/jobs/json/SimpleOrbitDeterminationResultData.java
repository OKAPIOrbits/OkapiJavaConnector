
package com.okapiorbits.platform.science.jobs.json;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SimpleOrbitDeterminationResultData
 * <p>
 * The orbit determination result with an associated status from the process.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "od_result",
    "tracklet_ids",
    "status"
})
public class SimpleOrbitDeterminationResultData {

    /**
     * OdResult
     * <p>
     * An orbit determination result as an array of state vectors and keplerian elements.
     * 
     */
    @JsonProperty("od_result")
    @JsonPropertyDescription("An orbit determination result as an array of state vectors and keplerian elements.")
    private OdResult odResult;
    /**
     * An array of tracklet_ids of tracklets involved in creating the OD.
     * 
     */
    @JsonProperty("tracklet_ids")
    @JsonPropertyDescription("An array of tracklet_ids of tracklets involved in creating the OD.")
    private List<String> trackletIds = new ArrayList<String>();
    /**
     * Status
     * <p>
     * A request to execute an orbit propagation with an arbitrary orbit propagator
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A request to execute an orbit propagation with an arbitrary orbit propagator")
    private Status status;

    /**
     * OdResult
     * <p>
     * An orbit determination result as an array of state vectors and keplerian elements.
     * 
     */
    @JsonProperty("od_result")
    public OdResult getOdResult() {
        return odResult;
    }

    /**
     * OdResult
     * <p>
     * An orbit determination result as an array of state vectors and keplerian elements.
     * 
     */
    @JsonProperty("od_result")
    public void setOdResult(OdResult odResult) {
        this.odResult = odResult;
    }

    /**
     * An array of tracklet_ids of tracklets involved in creating the OD.
     * 
     */
    @JsonProperty("tracklet_ids")
    public List<String> getTrackletIds() {
        return trackletIds;
    }

    /**
     * An array of tracklet_ids of tracklets involved in creating the OD.
     * 
     */
    @JsonProperty("tracklet_ids")
    public void setTrackletIds(List<String> trackletIds) {
        this.trackletIds = trackletIds;
    }

    /**
     * Status
     * <p>
     * A request to execute an orbit propagation with an arbitrary orbit propagator
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * A request to execute an orbit propagation with an arbitrary orbit propagator
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SimpleOrbitDeterminationResultData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("odResult");
        sb.append('=');
        sb.append(((this.odResult == null)?"<null>":this.odResult));
        sb.append(',');
        sb.append("trackletIds");
        sb.append('=');
        sb.append(((this.trackletIds == null)?"<null>":this.trackletIds));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.trackletIds == null)? 0 :this.trackletIds.hashCode()));
        result = ((result* 31)+((this.odResult == null)? 0 :this.odResult.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimpleOrbitDeterminationResultData) == false) {
            return false;
        }
        SimpleOrbitDeterminationResultData rhs = ((SimpleOrbitDeterminationResultData) other);
        return ((((this.trackletIds == rhs.trackletIds)||((this.trackletIds!= null)&&this.trackletIds.equals(rhs.trackletIds)))&&((this.odResult == rhs.odResult)||((this.odResult!= null)&&this.odResult.equals(rhs.odResult))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
