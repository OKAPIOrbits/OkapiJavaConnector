
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RiskAtTca
 * <p>
 * An array of collision probabilities in relation to the times to TCA.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time_to_tca",
    "collision_probability"
})
public class RiskAtTca {

    /**
     * in seconds
     * 
     */
    @JsonProperty("time_to_tca")
    @JsonPropertyDescription("in seconds")
    private Double timeToTca;
    @JsonProperty("collision_probability")
    private Double collisionProbability;

    /**
     * in seconds
     * 
     */
    @JsonProperty("time_to_tca")
    public Double getTimeToTca() {
        return timeToTca;
    }

    /**
     * in seconds
     * 
     */
    @JsonProperty("time_to_tca")
    public void setTimeToTca(Double timeToTca) {
        this.timeToTca = timeToTca;
    }

    @JsonProperty("collision_probability")
    public Double getCollisionProbability() {
        return collisionProbability;
    }

    @JsonProperty("collision_probability")
    public void setCollisionProbability(Double collisionProbability) {
        this.collisionProbability = collisionProbability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RiskAtTca.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeToTca");
        sb.append('=');
        sb.append(((this.timeToTca == null)?"<null>":this.timeToTca));
        sb.append(',');
        sb.append("collisionProbability");
        sb.append('=');
        sb.append(((this.collisionProbability == null)?"<null>":this.collisionProbability));
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
        result = ((result* 31)+((this.collisionProbability == null)? 0 :this.collisionProbability.hashCode()));
        result = ((result* 31)+((this.timeToTca == null)? 0 :this.timeToTca.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RiskAtTca) == false) {
            return false;
        }
        RiskAtTca rhs = ((RiskAtTca) other);
        return (((this.collisionProbability == rhs.collisionProbability)||((this.collisionProbability!= null)&&this.collisionProbability.equals(rhs.collisionProbability)))&&((this.timeToTca == rhs.timeToTca)||((this.timeToTca!= null)&&this.timeToTca.equals(rhs.timeToTca))));
    }

}
