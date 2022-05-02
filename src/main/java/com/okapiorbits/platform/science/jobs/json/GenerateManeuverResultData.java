
package com.okapiorbits.platform.science.jobs.json;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GenerateManeuverResultData
 * <p>
 * Maneuver generation given the ID and orbit of primary and secondary object, conjunction id.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cam_result_data",
    "status",
    "db_sat_in_sun",
    "db_sat_min_time_in_sun",
    "db_sat_min_thrust_duration",
    "db_sat_max_thrust_duration",
    "db_sat_thrust_output",
    "maneuver_constraints"
})
public class GenerateManeuverResultData {

    @JsonProperty("cam_result_data")
    private List<ManeuverEval> camResultData = new ArrayList<ManeuverEval>();
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
     * Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric manoeuvres are enabled, as well, symmetric manoeuvres are not created.
     * 
     */
    @JsonProperty("db_sat_in_sun")
    @JsonPropertyDescription("Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric manoeuvres are enabled, as well, symmetric manoeuvres are not created.")
    private Boolean dbSatInSun;
    /**
     * Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in Seconds).
     * 
     */
    @JsonProperty("db_sat_min_time_in_sun")
    @JsonPropertyDescription("Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in Seconds).")
    private Double dbSatMinTimeInSun;
    /**
     * The minimum duration the thruster can operate at a time in Seconds
     * 
     */
    @JsonProperty("db_sat_min_thrust_duration")
    @JsonPropertyDescription("The minimum duration the thruster can operate at a time in Seconds")
    private Double dbSatMinThrustDuration;
    /**
     * The maximum duration the thruster can operate at a time in Seconds
     * 
     */
    @JsonProperty("db_sat_max_thrust_duration")
    @JsonPropertyDescription("The maximum duration the thruster can operate at a time in Seconds")
    private Double dbSatMaxThrustDuration;
    /**
     * Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001
     * 
     */
    @JsonProperty("db_sat_thrust_output")
    @JsonPropertyDescription("Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001")
    private Double dbSatThrustOutput;
    /**
     * ManueverConstraints
     * <p>
     * Maneuver Constraints
     * 
     */
    @JsonProperty("maneuver_constraints")
    @JsonPropertyDescription("Maneuver Constraints")
    private ManeuverConstraints maneuverConstraints;

    @JsonProperty("cam_result_data")
    public List<ManeuverEval> getCamResultData() {
        return camResultData;
    }

    @JsonProperty("cam_result_data")
    public void setCamResultData(List<ManeuverEval> camResultData) {
        this.camResultData = camResultData;
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

    /**
     * Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric manoeuvres are enabled, as well, symmetric manoeuvres are not created.
     * 
     */
    @JsonProperty("db_sat_in_sun")
    public Boolean getDbSatInSun() {
        return dbSatInSun;
    }

    /**
     * Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric manoeuvres are enabled, as well, symmetric manoeuvres are not created.
     * 
     */
    @JsonProperty("db_sat_in_sun")
    public void setDbSatInSun(Boolean dbSatInSun) {
        this.dbSatInSun = dbSatInSun;
    }

    /**
     * Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in Seconds).
     * 
     */
    @JsonProperty("db_sat_min_time_in_sun")
    public Double getDbSatMinTimeInSun() {
        return dbSatMinTimeInSun;
    }

    /**
     * Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in Seconds).
     * 
     */
    @JsonProperty("db_sat_min_time_in_sun")
    public void setDbSatMinTimeInSun(Double dbSatMinTimeInSun) {
        this.dbSatMinTimeInSun = dbSatMinTimeInSun;
    }

    /**
     * The minimum duration the thruster can operate at a time in Seconds
     * 
     */
    @JsonProperty("db_sat_min_thrust_duration")
    public Double getDbSatMinThrustDuration() {
        return dbSatMinThrustDuration;
    }

    /**
     * The minimum duration the thruster can operate at a time in Seconds
     * 
     */
    @JsonProperty("db_sat_min_thrust_duration")
    public void setDbSatMinThrustDuration(Double dbSatMinThrustDuration) {
        this.dbSatMinThrustDuration = dbSatMinThrustDuration;
    }

    /**
     * The maximum duration the thruster can operate at a time in Seconds
     * 
     */
    @JsonProperty("db_sat_max_thrust_duration")
    public Double getDbSatMaxThrustDuration() {
        return dbSatMaxThrustDuration;
    }

    /**
     * The maximum duration the thruster can operate at a time in Seconds
     * 
     */
    @JsonProperty("db_sat_max_thrust_duration")
    public void setDbSatMaxThrustDuration(Double dbSatMaxThrustDuration) {
        this.dbSatMaxThrustDuration = dbSatMaxThrustDuration;
    }

    /**
     * Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001
     * 
     */
    @JsonProperty("db_sat_thrust_output")
    public Double getDbSatThrustOutput() {
        return dbSatThrustOutput;
    }

    /**
     * Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001
     * 
     */
    @JsonProperty("db_sat_thrust_output")
    public void setDbSatThrustOutput(Double dbSatThrustOutput) {
        this.dbSatThrustOutput = dbSatThrustOutput;
    }

    /**
     * ManueverConstraints
     * <p>
     * Maneuver Constraints
     * 
     */
    @JsonProperty("maneuver_constraints")
    public ManeuverConstraints getManeuverConstraints() {
        return maneuverConstraints;
    }

    /**
     * ManueverConstraints
     * <p>
     * Maneuver Constraints
     * 
     */
    @JsonProperty("maneuver_constraints")
    public void setManeuverConstraints(ManeuverConstraints maneuverConstraints) {
        this.maneuverConstraints = maneuverConstraints;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenerateManeuverResultData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("camResultData");
        sb.append('=');
        sb.append(((this.camResultData == null)?"<null>":this.camResultData));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("dbSatInSun");
        sb.append('=');
        sb.append(((this.dbSatInSun == null)?"<null>":this.dbSatInSun));
        sb.append(',');
        sb.append("dbSatMinTimeInSun");
        sb.append('=');
        sb.append(((this.dbSatMinTimeInSun == null)?"<null>":this.dbSatMinTimeInSun));
        sb.append(',');
        sb.append("dbSatMinThrustDuration");
        sb.append('=');
        sb.append(((this.dbSatMinThrustDuration == null)?"<null>":this.dbSatMinThrustDuration));
        sb.append(',');
        sb.append("dbSatMaxThrustDuration");
        sb.append('=');
        sb.append(((this.dbSatMaxThrustDuration == null)?"<null>":this.dbSatMaxThrustDuration));
        sb.append(',');
        sb.append("dbSatThrustOutput");
        sb.append('=');
        sb.append(((this.dbSatThrustOutput == null)?"<null>":this.dbSatThrustOutput));
        sb.append(',');
        sb.append("maneuverConstraints");
        sb.append('=');
        sb.append(((this.maneuverConstraints == null)?"<null>":this.maneuverConstraints));
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
        result = ((result* 31)+((this.dbSatMinTimeInSun == null)? 0 :this.dbSatMinTimeInSun.hashCode()));
        result = ((result* 31)+((this.dbSatInSun == null)? 0 :this.dbSatInSun.hashCode()));
        result = ((result* 31)+((this.dbSatMinThrustDuration == null)? 0 :this.dbSatMinThrustDuration.hashCode()));
        result = ((result* 31)+((this.camResultData == null)? 0 :this.camResultData.hashCode()));
        result = ((result* 31)+((this.dbSatThrustOutput == null)? 0 :this.dbSatThrustOutput.hashCode()));
        result = ((result* 31)+((this.dbSatMaxThrustDuration == null)? 0 :this.dbSatMaxThrustDuration.hashCode()));
        result = ((result* 31)+((this.maneuverConstraints == null)? 0 :this.maneuverConstraints.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenerateManeuverResultData) == false) {
            return false;
        }
        GenerateManeuverResultData rhs = ((GenerateManeuverResultData) other);
        return (((((((((this.dbSatMinTimeInSun == rhs.dbSatMinTimeInSun)||((this.dbSatMinTimeInSun!= null)&&this.dbSatMinTimeInSun.equals(rhs.dbSatMinTimeInSun)))&&((this.dbSatInSun == rhs.dbSatInSun)||((this.dbSatInSun!= null)&&this.dbSatInSun.equals(rhs.dbSatInSun))))&&((this.dbSatMinThrustDuration == rhs.dbSatMinThrustDuration)||((this.dbSatMinThrustDuration!= null)&&this.dbSatMinThrustDuration.equals(rhs.dbSatMinThrustDuration))))&&((this.camResultData == rhs.camResultData)||((this.camResultData!= null)&&this.camResultData.equals(rhs.camResultData))))&&((this.dbSatThrustOutput == rhs.dbSatThrustOutput)||((this.dbSatThrustOutput!= null)&&this.dbSatThrustOutput.equals(rhs.dbSatThrustOutput))))&&((this.dbSatMaxThrustDuration == rhs.dbSatMaxThrustDuration)||((this.dbSatMaxThrustDuration!= null)&&this.dbSatMaxThrustDuration.equals(rhs.dbSatMaxThrustDuration))))&&((this.maneuverConstraints == rhs.maneuverConstraints)||((this.maneuverConstraints!= null)&&this.maneuverConstraints.equals(rhs.maneuverConstraints))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
