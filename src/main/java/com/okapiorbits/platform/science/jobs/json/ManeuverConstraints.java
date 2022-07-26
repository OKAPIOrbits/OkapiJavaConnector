
package com.okapiorbits.platform.science.jobs.json;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ManueverConstraints
 * <p>
 * Maneuver Constraints
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "max_thrust_duration",
    "thrust_output",
    "min_thrust_duration",
    "in_sun_constraint",
    "min_time_in_sun",
    "use_min_time_till_pass",
    "min_time_till_pass",
    "maneuver_windows",
    "use_offset_cdm_and_earliest_maneuver",
    "offset_cdm_and_earliest_maneuver",
    "use_ground_station_passes"
})
public class ManeuverConstraints {

    /**
     * The maximum duration the thruster can operate at a time in Seconds
     * 
     */
    @JsonProperty("max_thrust_duration")
    @JsonPropertyDescription("The maximum duration the thruster can operate at a time in Seconds")
    private Double maxThrustDuration;
    /**
     * Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001
     * 
     */
    @JsonProperty("thrust_output")
    @JsonPropertyDescription("Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001")
    private Double thrustOutput;
    /**
     * Minimum amount of time that the thruster will fire continuously. (in seconds)
     * 
     */
    @JsonProperty("min_thrust_duration")
    @JsonPropertyDescription("Minimum amount of time that the thruster will fire continuously. (in seconds)")
    private Double minThrustDuration;
    /**
     * Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric maneuvres are enabled, as well, symmetric maneuvres are not created.
     * 
     */
    @JsonProperty("in_sun_constraint")
    @JsonPropertyDescription("Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric maneuvres are enabled, as well, symmetric maneuvres are not created.")
    private Boolean inSunConstraint;
    /**
     * Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in seconds).
     * 
     */
    @JsonProperty("min_time_in_sun")
    @JsonPropertyDescription("Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in seconds).")
    private Double minTimeInSun;
    /**
     * Enables use of the parameter to consider minimum time between cdm insertion epoch and next ground station pass.
     * 
     */
    @JsonProperty("use_min_time_till_pass")
    @JsonPropertyDescription("Enables use of the parameter to consider minimum time between cdm insertion epoch and next ground station pass.")
    private Boolean useMinTimeTillPass;
    /**
     * Minimum time required between CDM insertion epoch and the upcoming ground station pass (in seconds).
     * 
     */
    @JsonProperty("min_time_till_pass")
    @JsonPropertyDescription("Minimum time required between CDM insertion epoch and the upcoming ground station pass (in seconds).")
    private Double minTimeTillPass = 3600.0D;
    /**
     * Definition of multiple maneuver windows. Note that these are expected to be in timely order
     * 
     */
    @JsonProperty("maneuver_windows")
    @JsonPropertyDescription("Definition of multiple maneuver windows. Note that these are expected to be in timely order")
    private List<ManeuverWindow> maneuverWindows = new ArrayList<ManeuverWindow>();
    /**
     * Enables use of offset between CDM insertion epoch and earliest maneuver epoch.
     * 
     */
    @JsonProperty("use_offset_cdm_and_earliest_maneuver")
    @JsonPropertyDescription("Enables use of offset between CDM insertion epoch and earliest maneuver epoch.")
    private Boolean useOffsetCdmAndEarliestManeuver;
    /**
     * Time offset between CDM insertion epoch and earliest possible epoch for CAM (in hours).
     * 
     */
    @JsonProperty("offset_cdm_and_earliest_maneuver")
    @JsonPropertyDescription("Time offset between CDM insertion epoch and earliest possible epoch for CAM (in hours).")
    private Double offsetCdmAndEarliestManeuver;
    /**
     * Enables to use ground station passes as available in the database and calculate maneuvers to provide enough time for situation assessment and maneuver generation till next planned ground station pass.
     * 
     */
    @JsonProperty("use_ground_station_passes")
    @JsonPropertyDescription("Enables to use ground station passes as available in the database and calculate maneuvers to provide enough time for situation assessment and maneuver generation till next planned ground station pass.")
    private Boolean useGroundStationPasses;

    /**
     * The maximum duration the thruster can operate at a time in Seconds
     * 
     */
    @JsonProperty("max_thrust_duration")
    public Double getMaxThrustDuration() {
        return maxThrustDuration;
    }

    /**
     * The maximum duration the thruster can operate at a time in Seconds
     * 
     */
    @JsonProperty("max_thrust_duration")
    public void setMaxThrustDuration(Double maxThrustDuration) {
        this.maxThrustDuration = maxThrustDuration;
    }

    /**
     * Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001
     * 
     */
    @JsonProperty("thrust_output")
    public Double getThrustOutput() {
        return thrustOutput;
    }

    /**
     * Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001
     * 
     */
    @JsonProperty("thrust_output")
    public void setThrustOutput(Double thrustOutput) {
        this.thrustOutput = thrustOutput;
    }

    /**
     * Minimum amount of time that the thruster will fire continuously. (in seconds)
     * 
     */
    @JsonProperty("min_thrust_duration")
    public Double getMinThrustDuration() {
        return minThrustDuration;
    }

    /**
     * Minimum amount of time that the thruster will fire continuously. (in seconds)
     * 
     */
    @JsonProperty("min_thrust_duration")
    public void setMinThrustDuration(Double minThrustDuration) {
        this.minThrustDuration = minThrustDuration;
    }

    /**
     * Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric maneuvres are enabled, as well, symmetric maneuvres are not created.
     * 
     */
    @JsonProperty("in_sun_constraint")
    public Boolean getInSunConstraint() {
        return inSunConstraint;
    }

    /**
     * Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric maneuvres are enabled, as well, symmetric maneuvres are not created.
     * 
     */
    @JsonProperty("in_sun_constraint")
    public void setInSunConstraint(Boolean inSunConstraint) {
        this.inSunConstraint = inSunConstraint;
    }

    /**
     * Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in seconds).
     * 
     */
    @JsonProperty("min_time_in_sun")
    public Double getMinTimeInSun() {
        return minTimeInSun;
    }

    /**
     * Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in seconds).
     * 
     */
    @JsonProperty("min_time_in_sun")
    public void setMinTimeInSun(Double minTimeInSun) {
        this.minTimeInSun = minTimeInSun;
    }

    /**
     * Enables use of the parameter to consider minimum time between cdm insertion epoch and next ground station pass.
     * 
     */
    @JsonProperty("use_min_time_till_pass")
    public Boolean getUseMinTimeTillPass() {
        return useMinTimeTillPass;
    }

    /**
     * Enables use of the parameter to consider minimum time between cdm insertion epoch and next ground station pass.
     * 
     */
    @JsonProperty("use_min_time_till_pass")
    public void setUseMinTimeTillPass(Boolean useMinTimeTillPass) {
        this.useMinTimeTillPass = useMinTimeTillPass;
    }

    /**
     * Minimum time required between CDM insertion epoch and the upcoming ground station pass (in seconds).
     * 
     */
    @JsonProperty("min_time_till_pass")
    public Double getMinTimeTillPass() {
        return minTimeTillPass;
    }

    /**
     * Minimum time required between CDM insertion epoch and the upcoming ground station pass (in seconds).
     * 
     */
    @JsonProperty("min_time_till_pass")
    public void setMinTimeTillPass(Double minTimeTillPass) {
        this.minTimeTillPass = minTimeTillPass;
    }

    /**
     * Definition of multiple maneuver windows. Note that these are expected to be in timely order
     * 
     */
    @JsonProperty("maneuver_windows")
    public List<ManeuverWindow> getManeuverWindows() {
        return maneuverWindows;
    }

    /**
     * Definition of multiple maneuver windows. Note that these are expected to be in timely order
     * 
     */
    @JsonProperty("maneuver_windows")
    public void setManeuverWindows(List<ManeuverWindow> maneuverWindows) {
        this.maneuverWindows = maneuverWindows;
    }

    /**
     * Enables use of offset between CDM insertion epoch and earliest maneuver epoch.
     * 
     */
    @JsonProperty("use_offset_cdm_and_earliest_maneuver")
    public Boolean getUseOffsetCdmAndEarliestManeuver() {
        return useOffsetCdmAndEarliestManeuver;
    }

    /**
     * Enables use of offset between CDM insertion epoch and earliest maneuver epoch.
     * 
     */
    @JsonProperty("use_offset_cdm_and_earliest_maneuver")
    public void setUseOffsetCdmAndEarliestManeuver(Boolean useOffsetCdmAndEarliestManeuver) {
        this.useOffsetCdmAndEarliestManeuver = useOffsetCdmAndEarliestManeuver;
    }

    /**
     * Time offset between CDM insertion epoch and earliest possible epoch for CAM (in hours).
     * 
     */
    @JsonProperty("offset_cdm_and_earliest_maneuver")
    public Double getOffsetCdmAndEarliestManeuver() {
        return offsetCdmAndEarliestManeuver;
    }

    /**
     * Time offset between CDM insertion epoch and earliest possible epoch for CAM (in hours).
     * 
     */
    @JsonProperty("offset_cdm_and_earliest_maneuver")
    public void setOffsetCdmAndEarliestManeuver(Double offsetCdmAndEarliestManeuver) {
        this.offsetCdmAndEarliestManeuver = offsetCdmAndEarliestManeuver;
    }

    /**
     * Enables to use ground station passes as available in the database and calculate maneuvers to provide enough time for situation assessment and maneuver generation till next planned ground station pass.
     * 
     */
    @JsonProperty("use_ground_station_passes")
    public Boolean getUseGroundStationPasses() {
        return useGroundStationPasses;
    }

    /**
     * Enables to use ground station passes as available in the database and calculate maneuvers to provide enough time for situation assessment and maneuver generation till next planned ground station pass.
     * 
     */
    @JsonProperty("use_ground_station_passes")
    public void setUseGroundStationPasses(Boolean useGroundStationPasses) {
        this.useGroundStationPasses = useGroundStationPasses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ManeuverConstraints.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxThrustDuration");
        sb.append('=');
        sb.append(((this.maxThrustDuration == null)?"<null>":this.maxThrustDuration));
        sb.append(',');
        sb.append("thrustOutput");
        sb.append('=');
        sb.append(((this.thrustOutput == null)?"<null>":this.thrustOutput));
        sb.append(',');
        sb.append("minThrustDuration");
        sb.append('=');
        sb.append(((this.minThrustDuration == null)?"<null>":this.minThrustDuration));
        sb.append(',');
        sb.append("inSunConstraint");
        sb.append('=');
        sb.append(((this.inSunConstraint == null)?"<null>":this.inSunConstraint));
        sb.append(',');
        sb.append("minTimeInSun");
        sb.append('=');
        sb.append(((this.minTimeInSun == null)?"<null>":this.minTimeInSun));
        sb.append(',');
        sb.append("useMinTimeTillPass");
        sb.append('=');
        sb.append(((this.useMinTimeTillPass == null)?"<null>":this.useMinTimeTillPass));
        sb.append(',');
        sb.append("minTimeTillPass");
        sb.append('=');
        sb.append(((this.minTimeTillPass == null)?"<null>":this.minTimeTillPass));
        sb.append(',');
        sb.append("maneuverWindows");
        sb.append('=');
        sb.append(((this.maneuverWindows == null)?"<null>":this.maneuverWindows));
        sb.append(',');
        sb.append("useOffsetCdmAndEarliestManeuver");
        sb.append('=');
        sb.append(((this.useOffsetCdmAndEarliestManeuver == null)?"<null>":this.useOffsetCdmAndEarliestManeuver));
        sb.append(',');
        sb.append("offsetCdmAndEarliestManeuver");
        sb.append('=');
        sb.append(((this.offsetCdmAndEarliestManeuver == null)?"<null>":this.offsetCdmAndEarliestManeuver));
        sb.append(',');
        sb.append("useGroundStationPasses");
        sb.append('=');
        sb.append(((this.useGroundStationPasses == null)?"<null>":this.useGroundStationPasses));
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
        result = ((result* 31)+((this.inSunConstraint == null)? 0 :this.inSunConstraint.hashCode()));
        result = ((result* 31)+((this.maxThrustDuration == null)? 0 :this.maxThrustDuration.hashCode()));
        result = ((result* 31)+((this.minTimeTillPass == null)? 0 :this.minTimeTillPass.hashCode()));
        result = ((result* 31)+((this.useOffsetCdmAndEarliestManeuver == null)? 0 :this.useOffsetCdmAndEarliestManeuver.hashCode()));
        result = ((result* 31)+((this.useMinTimeTillPass == null)? 0 :this.useMinTimeTillPass.hashCode()));
        result = ((result* 31)+((this.offsetCdmAndEarliestManeuver == null)? 0 :this.offsetCdmAndEarliestManeuver.hashCode()));
        result = ((result* 31)+((this.useGroundStationPasses == null)? 0 :this.useGroundStationPasses.hashCode()));
        result = ((result* 31)+((this.thrustOutput == null)? 0 :this.thrustOutput.hashCode()));
        result = ((result* 31)+((this.maneuverWindows == null)? 0 :this.maneuverWindows.hashCode()));
        result = ((result* 31)+((this.minThrustDuration == null)? 0 :this.minThrustDuration.hashCode()));
        result = ((result* 31)+((this.minTimeInSun == null)? 0 :this.minTimeInSun.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManeuverConstraints) == false) {
            return false;
        }
        ManeuverConstraints rhs = ((ManeuverConstraints) other);
        return ((((((((((((this.inSunConstraint == rhs.inSunConstraint)||((this.inSunConstraint!= null)&&this.inSunConstraint.equals(rhs.inSunConstraint)))&&((this.maxThrustDuration == rhs.maxThrustDuration)||((this.maxThrustDuration!= null)&&this.maxThrustDuration.equals(rhs.maxThrustDuration))))&&((this.minTimeTillPass == rhs.minTimeTillPass)||((this.minTimeTillPass!= null)&&this.minTimeTillPass.equals(rhs.minTimeTillPass))))&&((this.useOffsetCdmAndEarliestManeuver == rhs.useOffsetCdmAndEarliestManeuver)||((this.useOffsetCdmAndEarliestManeuver!= null)&&this.useOffsetCdmAndEarliestManeuver.equals(rhs.useOffsetCdmAndEarliestManeuver))))&&((this.useMinTimeTillPass == rhs.useMinTimeTillPass)||((this.useMinTimeTillPass!= null)&&this.useMinTimeTillPass.equals(rhs.useMinTimeTillPass))))&&((this.offsetCdmAndEarliestManeuver == rhs.offsetCdmAndEarliestManeuver)||((this.offsetCdmAndEarliestManeuver!= null)&&this.offsetCdmAndEarliestManeuver.equals(rhs.offsetCdmAndEarliestManeuver))))&&((this.useGroundStationPasses == rhs.useGroundStationPasses)||((this.useGroundStationPasses!= null)&&this.useGroundStationPasses.equals(rhs.useGroundStationPasses))))&&((this.thrustOutput == rhs.thrustOutput)||((this.thrustOutput!= null)&&this.thrustOutput.equals(rhs.thrustOutput))))&&((this.maneuverWindows == rhs.maneuverWindows)||((this.maneuverWindows!= null)&&this.maneuverWindows.equals(rhs.maneuverWindows))))&&((this.minThrustDuration == rhs.minThrustDuration)||((this.minThrustDuration!= null)&&this.minThrustDuration.equals(rhs.minThrustDuration))))&&((this.minTimeInSun == rhs.minTimeInSun)||((this.minTimeInSun!= null)&&this.minTimeInSun.equals(rhs.minTimeInSun))));
    }

}
