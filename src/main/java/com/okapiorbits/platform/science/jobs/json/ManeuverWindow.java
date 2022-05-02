
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ManueverWindow
 * <p>
 * Maneuver Window including maneuver start and end epochs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "start_epoch",
    "end_epoch"
})
public class ManeuverWindow {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("start_epoch")
    private Date startEpoch;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("end_epoch")
    private Date endEpoch;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("start_epoch")
    public Date getStartEpoch() {
        return startEpoch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("start_epoch")
    public void setStartEpoch(Date startEpoch) {
        this.startEpoch = startEpoch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("end_epoch")
    public Date getEndEpoch() {
        return endEpoch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("end_epoch")
    public void setEndEpoch(Date endEpoch) {
        this.endEpoch = endEpoch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ManeuverWindow.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startEpoch");
        sb.append('=');
        sb.append(((this.startEpoch == null)?"<null>":this.startEpoch));
        sb.append(',');
        sb.append("endEpoch");
        sb.append('=');
        sb.append(((this.endEpoch == null)?"<null>":this.endEpoch));
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
        result = ((result* 31)+((this.startEpoch == null)? 0 :this.startEpoch.hashCode()));
        result = ((result* 31)+((this.endEpoch == null)? 0 :this.endEpoch.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManeuverWindow) == false) {
            return false;
        }
        ManeuverWindow rhs = ((ManeuverWindow) other);
        return (((this.startEpoch == rhs.startEpoch)||((this.startEpoch!= null)&&this.startEpoch.equals(rhs.startEpoch)))&&((this.endEpoch == rhs.endEpoch)||((this.endEpoch!= null)&&this.endEpoch.equals(rhs.endEpoch))));
    }

}
