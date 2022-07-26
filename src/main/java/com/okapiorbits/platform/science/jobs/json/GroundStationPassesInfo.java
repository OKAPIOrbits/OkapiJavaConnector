
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GroundStationPassesInfo
 * <p>
 * Ground station passes information (= ground station passes, nested into additional information) of a named satellite over one or multiple ground stations
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ground_station_passes_id",
    "spacecraft",
    "object_id",
    "start_epoch",
    "stop_epoch",
    "passes"
})
public class GroundStationPassesInfo {

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     * 
     */
    @JsonProperty("ground_station_passes_id")
    @JsonPropertyDescription("A Universally-Unique Identifier, as used by OKAPI:Orbits")
    private String groundStationPassesId;
    /**
     * The name of the spacecraft as contained in the public SpaceTrack ("TLE") catalogue
     * (Required)
     * 
     */
    @JsonProperty("spacecraft")
    @JsonPropertyDescription("The name of the spacecraft as contained in the public SpaceTrack (\"TLE\") catalogue")
    private String spacecraft;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("object_id")
    private Object objectId;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("start_epoch")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private Date startEpoch;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("stop_epoch")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private Date stopEpoch;
    /**
     * PassWindowMillis
     * <p>
     * Pass Window including pass start and end epochs (with milliseconds).
     * (Required)
     * 
     */
    @JsonProperty("passes")
    @JsonPropertyDescription("Pass Window including pass start and end epochs (with milliseconds).")
    private PassWindowMillis passes;

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     * 
     */
    @JsonProperty("ground_station_passes_id")
    public String getGroundStationPassesId() {
        return groundStationPassesId;
    }

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     * 
     */
    @JsonProperty("ground_station_passes_id")
    public void setGroundStationPassesId(String groundStationPassesId) {
        this.groundStationPassesId = groundStationPassesId;
    }

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
     * 
     * (Required)
     * 
     */
    @JsonProperty("object_id")
    public Object getObjectId() {
        return objectId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("object_id")
    public void setObjectId(Object objectId) {
        this.objectId = objectId;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("start_epoch")
    public Date getStartEpoch() {
        return startEpoch;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("start_epoch")
    public void setStartEpoch(Date startEpoch) {
        this.startEpoch = startEpoch;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("stop_epoch")
    public Date getStopEpoch() {
        return stopEpoch;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("stop_epoch")
    public void setStopEpoch(Date stopEpoch) {
        this.stopEpoch = stopEpoch;
    }

    /**
     * PassWindowMillis
     * <p>
     * Pass Window including pass start and end epochs (with milliseconds).
     * (Required)
     * 
     */
    @JsonProperty("passes")
    public PassWindowMillis getPasses() {
        return passes;
    }

    /**
     * PassWindowMillis
     * <p>
     * Pass Window including pass start and end epochs (with milliseconds).
     * (Required)
     * 
     */
    @JsonProperty("passes")
    public void setPasses(PassWindowMillis passes) {
        this.passes = passes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GroundStationPassesInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("groundStationPassesId");
        sb.append('=');
        sb.append(((this.groundStationPassesId == null)?"<null>":this.groundStationPassesId));
        sb.append(',');
        sb.append("spacecraft");
        sb.append('=');
        sb.append(((this.spacecraft == null)?"<null>":this.spacecraft));
        sb.append(',');
        sb.append("objectId");
        sb.append('=');
        sb.append(((this.objectId == null)?"<null>":this.objectId));
        sb.append(',');
        sb.append("startEpoch");
        sb.append('=');
        sb.append(((this.startEpoch == null)?"<null>":this.startEpoch));
        sb.append(',');
        sb.append("stopEpoch");
        sb.append('=');
        sb.append(((this.stopEpoch == null)?"<null>":this.stopEpoch));
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
        result = ((result* 31)+((this.spacecraft == null)? 0 :this.spacecraft.hashCode()));
        result = ((result* 31)+((this.passes == null)? 0 :this.passes.hashCode()));
        result = ((result* 31)+((this.groundStationPassesId == null)? 0 :this.groundStationPassesId.hashCode()));
        result = ((result* 31)+((this.startEpoch == null)? 0 :this.startEpoch.hashCode()));
        result = ((result* 31)+((this.objectId == null)? 0 :this.objectId.hashCode()));
        result = ((result* 31)+((this.stopEpoch == null)? 0 :this.stopEpoch.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroundStationPassesInfo) == false) {
            return false;
        }
        GroundStationPassesInfo rhs = ((GroundStationPassesInfo) other);
        return (((((((this.spacecraft == rhs.spacecraft)||((this.spacecraft!= null)&&this.spacecraft.equals(rhs.spacecraft)))&&((this.passes == rhs.passes)||((this.passes!= null)&&this.passes.equals(rhs.passes))))&&((this.groundStationPassesId == rhs.groundStationPassesId)||((this.groundStationPassesId!= null)&&this.groundStationPassesId.equals(rhs.groundStationPassesId))))&&((this.startEpoch == rhs.startEpoch)||((this.startEpoch!= null)&&this.startEpoch.equals(rhs.startEpoch))))&&((this.objectId == rhs.objectId)||((this.objectId!= null)&&this.objectId.equals(rhs.objectId))))&&((this.stopEpoch == rhs.stopEpoch)||((this.stopEpoch!= null)&&this.stopEpoch.equals(rhs.stopEpoch))));
    }

}
