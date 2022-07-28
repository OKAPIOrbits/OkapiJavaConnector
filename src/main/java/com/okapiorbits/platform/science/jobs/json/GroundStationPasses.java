
package com.okapiorbits.platform.science.jobs.json;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GroundStationPasses
 * <p>
 * Ground station passes of a named satellite over one or multiple ground stations
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "spacecraft",
    "passes"
})
public class GroundStationPasses {

    /**
     * The name of the spacecraft as contained in the public SpaceTrack ("TLE") catalogue
     * (Required)
     * 
     */
    @JsonProperty("spacecraft")
    @JsonPropertyDescription("The name of the spacecraft as contained in the public SpaceTrack (\"TLE\") catalogue")
    private String spacecraft;
    /**
     * Note that these are expected to be in timely order
     * (Required)
     * 
     */
    @JsonProperty("passes")
    @JsonPropertyDescription("Note that these are expected to be in timely order")
    private List<PassWindow> passes = new ArrayList<PassWindow>();

    /**
     * The name of the spacecraft as contained in the public SpaceTrack ("TLE") catalogue
     * (Required)
     * 
     */
    @JsonProperty("spacecraft")
    public String getSpacecraft() {
        return spacecraft;
    }

    /**
     * The name of the spacecraft as contained in the public SpaceTrack ("TLE") catalogue
     * (Required)
     * 
     */
    @JsonProperty("spacecraft")
    public void setSpacecraft(String spacecraft) {
        this.spacecraft = spacecraft;
    }

    /**
     * Note that these are expected to be in timely order
     * (Required)
     * 
     */
    @JsonProperty("passes")
    public List<PassWindow> getPasses() {
        return passes;
    }

    /**
     * Note that these are expected to be in timely order
     * (Required)
     * 
     */
    @JsonProperty("passes")
    public void setPasses(List<PassWindow> passes) {
        this.passes = passes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GroundStationPasses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spacecraft");
        sb.append('=');
        sb.append(((this.spacecraft == null)?"<null>":this.spacecraft));
        sb.append(',');
        sb.append("passes");
        sb.append('=');
        sb.append(((this.passes == null)?"<null>":this.passes));
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
        result = ((result* 31)+((this.passes == null)? 0 :this.passes.hashCode()));
        result = ((result* 31)+((this.spacecraft == null)? 0 :this.spacecraft.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroundStationPasses) == false) {
            return false;
        }
        GroundStationPasses rhs = ((GroundStationPasses) other);
        return (((this.passes == rhs.passes)||((this.passes!= null)&&this.passes.equals(rhs.passes)))&&((this.spacecraft == rhs.spacecraft)||((this.spacecraft!= null)&&this.spacecraft.equals(rhs.spacecraft))));
    }

}
