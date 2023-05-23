
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Satellite
 * <p>
 * A satellite. It may define exactly one satellite or may be the representative of a satellite class, i.e. more than one satellite of similar design.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "satellite_id",
        "name",
        "info",
        "norad_ids",
        "area",
        "drag_area",
        "mass",
        "thrust_uncertainty",
        "thrust_pointing_uncertainty",
        "thrust_output",
        "max_thrust_duration",
        "min_thrust_duration",
        "in_sun_constraint",
        "min_time_in_sun",
        "symmetric_manoeuvres",
        "use_ground_station_passes",
        "use_offset_cdm_and_earliest_maneuver",
        "offset_cdm_and_earliest_maneuver",
        "use_min_time_till_pass",
        "min_time_till_pass",
        "propulsion_type",
        "accepted_collision_probability",
        "accepted_minimum_distance",
        "use_ai_risk_prediction",
        "space_track_status",
        "space_track_status_other",
        "space_track_company_name",
        "space_track_poc_name",
        "space_track_poc_address",
        "space_track_login",
        "active",
        "maneuver_strategy",
        "send_mail_notifications",
        "send_slack_notifications",
        "send_teams_notifications",
        "slack_webhook",
        "teams_webhook",
        "gnss_sensor",
        "notification_verbosity",
        "enable_accepted_collision_probability_limit_recommendation",
        "enable_miss_distance_recommendation",
        "drag_maneuver_settings"
})
public class Satellite {

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     */
    @JsonProperty("satellite_id")
    @JsonPropertyDescription("A Universally-Unique Identifier, as used by OKAPI:Orbits")
    private String satelliteId;
    /**
     * Name of this satellite or the class of satellites this satellite functions as representative
     * (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of this satellite or the class of satellites this satellite functions as representative")
    private String name;
    /**
     * Space for detailed information or notes about this satellite.
     */
    @JsonProperty("info")
    @JsonPropertyDescription("Space for detailed information or notes about this satellite.")
    private String info;
    /**
     * NORAD IDs of satellites this satellite definition stands for. If only one satellite is defined, this array contains the NORAD ID of that satellite.
     * (Required)
     */
    @JsonProperty("norad_ids")
    @JsonPropertyDescription("NORAD IDs of satellites this satellite definition stands for. If only one satellite is defined, this array contains the NORAD ID of that satellite.")
    private List<Integer> noradIds = new ArrayList<Integer>();
    /**
     * The satellite's collision cross section, in m^2
     */
    @JsonProperty("area")
    @JsonPropertyDescription("The satellite's collision cross section, in m^2")
    private Double area = 0.01D;
    /**
     * The satellite's drag area, in m^2
     */
    @JsonProperty("drag_area")
    @JsonPropertyDescription("The satellite's drag area, in m^2")
    private Double dragArea;
    /**
     * in kg
     */
    @JsonProperty("mass")
    @JsonPropertyDescription("in kg")
    private Double mass = 1.3D;
    /**
     * Relative thrust uncertainty / -   e.g. 5 percent is expressed as 0.05
     */
    @JsonProperty("thrust_uncertainty")
    @JsonPropertyDescription("Relative thrust uncertainty / -   e.g. 5 percent is expressed as 0.05")
    private Double thrustUncertainty = 0.0D;
    /**
     * Uncertainty in pointing the thrust / arc seconds
     */
    @JsonProperty("thrust_pointing_uncertainty")
    @JsonPropertyDescription("Uncertainty in pointing the thrust / arc seconds")
    private Double thrustPointingUncertainty = 0.0D;
    /**
     * Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001
     */
    @JsonProperty("thrust_output")
    @JsonPropertyDescription("Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001")
    private Double thrustOutput = 0.0D;
    /**
     * The maximum duration the thruster can operate at a time in Seconds
     */
    @JsonProperty("max_thrust_duration")
    @JsonPropertyDescription("The maximum duration the thruster can operate at a time in Seconds")
    private Double maxThrustDuration = 1.0D;
    /**
     * The minimum duration the thruster can operate at a time in Seconds
     */
    @JsonProperty("min_thrust_duration")
    @JsonPropertyDescription("The minimum duration the thruster can operate at a time in Seconds")
    private Double minThrustDuration;
    /**
     * Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric manoeuvres are enabled, as well, symmetric manoeuvres are not created.
     */
    @JsonProperty("in_sun_constraint")
    @JsonPropertyDescription("Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric manoeuvres are enabled, as well, symmetric manoeuvres are not created.")
    private Boolean inSunConstraint = false;
    /**
     * Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in Seconds).
     */
    @JsonProperty("min_time_in_sun")
    @JsonPropertyDescription("Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in Seconds).")
    private Double minTimeInSun;
    /**
     * Enables to distribute the thrust on opposite sides of the orbits, e.g. to keep the eccentricity constant. If the in-sun constraint is enabled, as well, symmetric manoeuvres are not created.
     */
    @JsonProperty("symmetric_manoeuvres")
    @JsonPropertyDescription("Enables to distribute the thrust on opposite sides of the orbits, e.g. to keep the eccentricity constant. If the in-sun constraint is enabled, as well, symmetric manoeuvres are not created.")
    private Boolean symmetricManoeuvres = false;
    /**
     * Enables to use ground station passes and calculate maneuvers to provide enough time for situation assessment and maneuver generationn till next planned ground station pass.
     */
    @JsonProperty("use_ground_station_passes")
    @JsonPropertyDescription("Enables to use ground station passes and calculate maneuvers to provide enough time for situation assessment and maneuver generationn till next planned ground station pass.")
    private Boolean useGroundStationPasses;
    /**
     * Enables use of the parameter for offset between cdm insertion epoch and earliest maneuver epoch.
     */
    @JsonProperty("use_offset_cdm_and_earliest_maneuver")
    @JsonPropertyDescription("Enables use of the parameter for offset between cdm insertion epoch and earliest maneuver epoch.")
    private Boolean useOffsetCdmAndEarliestManeuver = true;
    /**
     * Time offset between CDM insertion epoch and earliest possible epoch for CAM (in seconds).
     */
    @JsonProperty("offset_cdm_and_earliest_maneuver")
    @JsonPropertyDescription("Time offset between CDM insertion epoch and earliest possible epoch for CAM (in seconds).")
    private Double offsetCdmAndEarliestManeuver = 25200.0D;
    /**
     * Enables use of the parameter to consider minimum time between cdm insertion epoch and next ground station pass.
     */
    @JsonProperty("use_min_time_till_pass")
    @JsonPropertyDescription("Enables use of the parameter to consider minimum time between cdm insertion epoch and next ground station pass.")
    private Boolean useMinTimeTillPass;
    /**
     * Minimum time required between CDM insertion epoch and the upcoming ground station pass (in seconds).
     */
    @JsonProperty("min_time_till_pass")
    @JsonPropertyDescription("Minimum time required between CDM insertion epoch and the upcoming ground station pass (in seconds).")
    private Double minTimeTillPass = 3600.0D;
    @JsonProperty("propulsion_type")
    private Satellite.PropulsionType propulsionType = Satellite.PropulsionType.fromValue("continuous");
    /**
     * Accepted collision probability
     */
    @JsonProperty("accepted_collision_probability")
    @JsonPropertyDescription("Accepted collision probability")
    private Double acceptedCollisionProbability = 1.0E-4D;
    /**
     * Accepted minimum distance, in km
     */
    @JsonProperty("accepted_minimum_distance")
    @JsonPropertyDescription("Accepted minimum distance, in km")
    private Double acceptedMinimumDistance = 1.0D;
    /**
     * Use OKAPI AI for risk prediction
     */
    @JsonProperty("use_ai_risk_prediction")
    @JsonPropertyDescription("Use OKAPI AI for risk prediction")
    private Boolean useAiRiskPrediction = false;
    /**
     * Please state your current relationship with SpaceTrack / 18 SPCS concerning this satellite
     * (Required)
     */
    @JsonProperty("space_track_status")
    @JsonPropertyDescription("Please state your current relationship with SpaceTrack / 18 SPCS concerning this satellite")
    private Satellite.SpaceTrackStatus spaceTrackStatus;
    /**
     * If you select "other" for "space_track_status", describe your current relationship here
     */
    @JsonProperty("space_track_status_other")
    @JsonPropertyDescription("If you select \"other\" for \"space_track_status\", describe your current relationship here")
    private String spaceTrackStatusOther;
    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the company name used at SpaceTrack here. By default, this is the company name you are using at OKAPI.
     */
    @JsonProperty("space_track_company_name")
    @JsonPropertyDescription("If you select \"sharing_agreement_signed\", \"satellite_registered\" or \"space_track_account_exists\" for \"space_track_status\", state the company name used at SpaceTrack here. By default, this is the company name you are using at OKAPI.")
    private String spaceTrackCompanyName;
    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the Point-of-Contact name used at SpaceTrack here. By default, this is the address you are using at OKAPI.
     */
    @JsonProperty("space_track_poc_name")
    @JsonPropertyDescription("If you select \"sharing_agreement_signed\", \"satellite_registered\" or \"space_track_account_exists\" for \"space_track_status\", state the Point-of-Contact name used at SpaceTrack here. By default, this is the address you are using at OKAPI.")
    private String spaceTrackPocName;
    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the Point-of-Contact address used at SpaceTrack here. By default, this is the address you are using at OKAPI.
     */
    @JsonProperty("space_track_poc_address")
    @JsonPropertyDescription("If you select \"sharing_agreement_signed\", \"satellite_registered\" or \"space_track_account_exists\" for \"space_track_status\", state the Point-of-Contact address used at SpaceTrack here. By default, this is the address you are using at OKAPI.")
    private String spaceTrackPocAddress;
    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the login used at SpaceTrack here. By default, this is the mail address you are using at OKAPI.
     */
    @JsonProperty("space_track_login")
    @JsonPropertyDescription("If you select \"sharing_agreement_signed\", \"satellite_registered\" or \"space_track_account_exists\" for \"space_track_status\", state the login used at SpaceTrack here. By default, this is the mail address you are using at OKAPI.")
    private String spaceTrackLogin;
    /**
     * Active status of this satellite. Indicates if screening is currently activated for this satellite definition. Is set automatically by OKAPI. Immutable by clients.
     */
    @JsonProperty("active")
    @JsonPropertyDescription("Active status of this satellite. Indicates if screening is currently activated for this satellite definition. Is set automatically by OKAPI. Immutable by clients.")
    private Boolean active = false;
    /**
     * Preferred collision avoidance maneuver strategy for this satellite
     */
    @JsonProperty("maneuver_strategy")
    @JsonPropertyDescription("Preferred collision avoidance maneuver strategy for this satellite")
    private List<ManeuverStrategy> maneuverStrategy = List.of(ManeuverStrategy.SHORT_TERM, ManeuverStrategy.LONG_TERM);

    /**
     * Send notifications to email address associated with the satellite
     */
    @JsonProperty("send_mail_notifications")
    @JsonPropertyDescription("Send notifications to email address associated with the satellite")
    private Boolean sendMailNotifications = false;
    /**
     * Send notifications to Slack. Webhook needs to be provided separately
     */
    @JsonProperty("send_slack_notifications")
    @JsonPropertyDescription("Send notifications to Slack. Webhook needs to be provided separately")
    private Boolean sendSlackNotifications = false;
    /**
     * Send notifications to Teams. Webhook needs to be provided separately
     */
    @JsonProperty("send_teams_notifications")
    @JsonPropertyDescription("Send notifications to Teams. Webhook needs to be provided separately")
    private Boolean sendTeamsNotifications = false;
    /**
     * URL of the Slack webhook
     */
    @JsonProperty("slack_webhook")
    @JsonPropertyDescription("URL of the Slack webhook")
    private String slackWebhook;
    /**
     * URL of the Teams webhook
     */
    @JsonProperty("teams_webhook")
    @JsonPropertyDescription("URL of the Teams webhook")
    private String teamsWebhook;
    /**
     * GnssSensor
     * <p>
     * A GNSS sensor of a satellite, including settings on orbit determination and propagation
     */
    @JsonProperty("gnss_sensor")
    @JsonPropertyDescription("A GNSS sensor of a satellite, including settings on orbit determination and propagation")
    private GnssSensor gnssSensor;
    /**
     * If notifications are activated for this satellite, defines how critical a conjunction must be at the very least to be notified about it.
     */
    @JsonProperty("notification_verbosity")
    @JsonPropertyDescription("If notifications are activated for this satellite, defines how critical a conjunction must be at the very least to be notified about it.")
    private Satellite.NotificationVerbosity notificationVerbosity = Satellite.NotificationVerbosity.fromValue("observe");

    @JsonProperty("enable_accepted_collision_probability_limit_recommendation")
    private Boolean enableAcceptedCollisionProbabilityLimitRecommendation;

    @JsonProperty("enable_miss_distance_recommendation")
    private Boolean enableMissDistanceRecommendation;

    @JsonProperty("drag_maneuver_settings")
    private Satellite.DragManeuverSettings dragManeuverSettings = new DragManeuverSettings(0.54,
            true, 7.5);

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     */
    @JsonProperty("satellite_id")
    public String getSatelliteId() {
        return satelliteId;
    }

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     */
    @JsonProperty("satellite_id")
    public void setSatelliteId(String satelliteId) {
        this.satelliteId = satelliteId;
    }

    /**
     * Name of this satellite or the class of satellites this satellite functions as representative
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of this satellite or the class of satellites this satellite functions as representative
     * (Required)
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Space for detailed information or notes about this satellite.
     */
    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    /**
     * Space for detailed information or notes about this satellite.
     */
    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * NORAD IDs of satellites this satellite definition stands for. If only one satellite is defined, this array contains the NORAD ID of that satellite.
     * (Required)
     */
    @JsonProperty("norad_ids")
    public List<Integer> getNoradIds() {
        return noradIds;
    }

    /**
     * NORAD IDs of satellites this satellite definition stands for. If only one satellite is defined, this array contains the NORAD ID of that satellite.
     * (Required)
     */
    @JsonProperty("norad_ids")
    public void setNoradIds(List<Integer> noradIds) {
        this.noradIds = noradIds;
    }

    /**
     * The satellite's collision cross section, in m^2
     */
    @JsonProperty("area")
    public Double getArea() {
        return area;
    }

    /**
     * The satellite's collision cross section, in m^2
     */
    @JsonProperty("area")
    public void setArea(Double area) {
        this.area = area;
    }

    /**
     * The satellite's drag area, in m^2
     */
    @JsonProperty("drag_area")
    public Double getDragArea() {
        return dragArea;
    }

    /**
     * The satellite's drag area, in m^2
     */
    @JsonProperty("drag_area")
    public void setDragArea(Double dragArea) {
        this.dragArea = dragArea;
    }

    /**
     * in kg
     */
    @JsonProperty("mass")
    public Double getMass() {
        return mass;
    }

    /**
     * in kg
     */
    @JsonProperty("mass")
    public void setMass(Double mass) {
        this.mass = mass;
    }

    /**
     * Relative thrust uncertainty / -   e.g. 5 percent is expressed as 0.05
     */
    @JsonProperty("thrust_uncertainty")
    public Double getThrustUncertainty() {
        return thrustUncertainty;
    }

    /**
     * Relative thrust uncertainty / -   e.g. 5 percent is expressed as 0.05
     */
    @JsonProperty("thrust_uncertainty")
    public void setThrustUncertainty(Double thrustUncertainty) {
        this.thrustUncertainty = thrustUncertainty;
    }

    /**
     * Uncertainty in pointing the thrust / arc seconds
     */
    @JsonProperty("thrust_pointing_uncertainty")
    public Double getThrustPointingUncertainty() {
        return thrustPointingUncertainty;
    }

    /**
     * Uncertainty in pointing the thrust / arc seconds
     */
    @JsonProperty("thrust_pointing_uncertainty")
    public void setThrustPointingUncertainty(Double thrustPointingUncertainty) {
        this.thrustPointingUncertainty = thrustPointingUncertainty;
    }

    /**
     * Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001
     */
    @JsonProperty("thrust_output")
    public Double getThrustOutput() {
        return thrustOutput;
    }

    /**
     * Thrust output, in Newton. Note that you can enter values like 1.1e-8 or 0.0001
     */
    @JsonProperty("thrust_output")
    public void setThrustOutput(Double thrustOutput) {
        this.thrustOutput = thrustOutput;
    }

    /**
     * The maximum duration the thruster can operate at a time in Seconds
     */
    @JsonProperty("max_thrust_duration")
    public Double getMaxThrustDuration() {
        return maxThrustDuration;
    }

    /**
     * The maximum duration the thruster can operate at a time in Seconds
     */
    @JsonProperty("max_thrust_duration")
    public void setMaxThrustDuration(Double maxThrustDuration) {
        this.maxThrustDuration = maxThrustDuration;
    }

    /**
     * The minimum duration the thruster can operate at a time in Seconds
     */
    @JsonProperty("min_thrust_duration")
    public Double getMinThrustDuration() {
        return minThrustDuration;
    }

    /**
     * The minimum duration the thruster can operate at a time in Seconds
     */
    @JsonProperty("min_thrust_duration")
    public void setMinThrustDuration(Double minThrustDuration) {
        this.minThrustDuration = minThrustDuration;
    }

    /**
     * Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric manoeuvres are enabled, as well, symmetric manoeuvres are not created.
     */
    @JsonProperty("in_sun_constraint")
    public Boolean getInSunConstraint() {
        return inSunConstraint;
    }

    /**
     * Enables the requirement of a satellite being in the Sun during thruster activation. If symmetric manoeuvres are enabled, as well, symmetric manoeuvres are not created.
     */
    @JsonProperty("in_sun_constraint")
    public void setInSunConstraint(Boolean inSunConstraint) {
        this.inSunConstraint = inSunConstraint;
    }

    /**
     * Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in Seconds).
     */
    @JsonProperty("min_time_in_sun")
    public Double getMinTimeInSun() {
        return minTimeInSun;
    }

    /**
     * Makes sure that the generated manoeuvre will be performed after the satellite being in the Sun for a minimum amount of time (in Seconds).
     */
    @JsonProperty("min_time_in_sun")
    public void setMinTimeInSun(Double minTimeInSun) {
        this.minTimeInSun = minTimeInSun;
    }

    /**
     * Enables to distribute the thrust on opposite sides of the orbits, e.g. to keep the eccentricity constant. If the in-sun constraint is enabled, as well, symmetric manoeuvres are not created.
     */
    @JsonProperty("symmetric_manoeuvres")
    public Boolean getSymmetricManoeuvres() {
        return symmetricManoeuvres;
    }

    /**
     * Enables to distribute the thrust on opposite sides of the orbits, e.g. to keep the eccentricity constant. If the in-sun constraint is enabled, as well, symmetric manoeuvres are not created.
     */
    @JsonProperty("symmetric_manoeuvres")
    public void setSymmetricManoeuvres(Boolean symmetricManoeuvres) {
        this.symmetricManoeuvres = symmetricManoeuvres;
    }

    /**
     * Enables to use ground station passes and calculate maneuvers to provide enough time for situation assessment and maneuver generationn till next planned ground station pass.
     */
    @JsonProperty("use_ground_station_passes")
    public Boolean getUseGroundStationPasses() {
        return useGroundStationPasses;
    }

    /**
     * Enables to use ground station passes and calculate maneuvers to provide enough time for situation assessment and maneuver generationn till next planned ground station pass.
     */
    @JsonProperty("use_ground_station_passes")
    public void setUseGroundStationPasses(Boolean useGroundStationPasses) {
        this.useGroundStationPasses = useGroundStationPasses;
    }

    /**
     * Enables use of the parameter for offset between cdm insertion epoch and earliest maneuver epoch.
     */
    @JsonProperty("use_offset_cdm_and_earliest_maneuver")
    public Boolean getUseOffsetCdmAndEarliestManeuver() {
        return useOffsetCdmAndEarliestManeuver;
    }

    /**
     * Enables use of the parameter for offset between cdm insertion epoch and earliest maneuver epoch.
     */
    @JsonProperty("use_offset_cdm_and_earliest_maneuver")
    public void setUseOffsetCdmAndEarliestManeuver(Boolean useOffsetCdmAndEarliestManeuver) {
        this.useOffsetCdmAndEarliestManeuver = useOffsetCdmAndEarliestManeuver;
    }

    /**
     * Time offset between CDM insertion epoch and earliest possible epoch for CAM (in seconds).
     */
    @JsonProperty("offset_cdm_and_earliest_maneuver")
    public Double getOffsetCdmAndEarliestManeuver() {
        return offsetCdmAndEarliestManeuver;
    }

    /**
     * Time offset between CDM insertion epoch and earliest possible epoch for CAM (in seconds).
     */
    @JsonProperty("offset_cdm_and_earliest_maneuver")
    public void setOffsetCdmAndEarliestManeuver(Double offsetCdmAndEarliestManeuver) {
        this.offsetCdmAndEarliestManeuver = offsetCdmAndEarliestManeuver;
    }

    /**
     * Enables use of the parameter to consider minimum time between cdm insertion epoch and next ground station pass.
     */
    @JsonProperty("use_min_time_till_pass")
    public Boolean getUseMinTimeTillPass() {
        return useMinTimeTillPass;
    }

    /**
     * Enables use of the parameter to consider minimum time between cdm insertion epoch and next ground station pass.
     */
    @JsonProperty("use_min_time_till_pass")
    public void setUseMinTimeTillPass(Boolean useMinTimeTillPass) {
        this.useMinTimeTillPass = useMinTimeTillPass;
    }

    /**
     * Minimum time required between CDM insertion epoch and the upcoming ground station pass (in seconds).
     */
    @JsonProperty("min_time_till_pass")
    public Double getMinTimeTillPass() {
        return minTimeTillPass;
    }

    /**
     * Minimum time required between CDM insertion epoch and the upcoming ground station pass (in seconds).
     */
    @JsonProperty("min_time_till_pass")
    public void setMinTimeTillPass(Double minTimeTillPass) {
        this.minTimeTillPass = minTimeTillPass;
    }

    @JsonProperty("propulsion_type")
    public Satellite.PropulsionType getPropulsionType() {
        return propulsionType;
    }

    @JsonProperty("propulsion_type")
    public void setPropulsionType(Satellite.PropulsionType propulsionType) {
        this.propulsionType = propulsionType;
    }

    /**
     * Accepted collision probability
     */
    @JsonProperty("accepted_collision_probability")
    public Double getAcceptedCollisionProbability() {
        return acceptedCollisionProbability;
    }

    /**
     * Accepted collision probability
     */
    @JsonProperty("accepted_collision_probability")
    public void setAcceptedCollisionProbability(Double acceptedCollisionProbability) {
        this.acceptedCollisionProbability = acceptedCollisionProbability;
    }

    /**
     * Accepted minimum distance, in km
     */
    @JsonProperty("accepted_minimum_distance")
    public Double getAcceptedMinimumDistance() {
        return acceptedMinimumDistance;
    }

    /**
     * Accepted minimum distance, in km
     */
    @JsonProperty("accepted_minimum_distance")
    public void setAcceptedMinimumDistance(Double acceptedMinimumDistance) {
        this.acceptedMinimumDistance = acceptedMinimumDistance;
    }

    /**
     * Use OKAPI AI for risk prediction
     */
    @JsonProperty("use_ai_risk_prediction")
    public Boolean getUseAiRiskPrediction() {
        return useAiRiskPrediction;
    }

    /**
     * Use OKAPI AI for risk prediction
     */
    @JsonProperty("use_ai_risk_prediction")
    public void setUseAiRiskPrediction(Boolean useAiRiskPrediction) {
        this.useAiRiskPrediction = useAiRiskPrediction;
    }

    /**
     * Please state your current relationship with SpaceTrack / 18 SPCS concerning this satellite
     * (Required)
     */
    @JsonProperty("space_track_status")
    public Satellite.SpaceTrackStatus getSpaceTrackStatus() {
        return spaceTrackStatus;
    }

    /**
     * Please state your current relationship with SpaceTrack / 18 SPCS concerning this satellite
     * (Required)
     */
    @JsonProperty("space_track_status")
    public void setSpaceTrackStatus(Satellite.SpaceTrackStatus spaceTrackStatus) {
        this.spaceTrackStatus = spaceTrackStatus;
    }

    /**
     * If you select "other" for "space_track_status", describe your current relationship here
     */
    @JsonProperty("space_track_status_other")
    public String getSpaceTrackStatusOther() {
        return spaceTrackStatusOther;
    }

    /**
     * If you select "other" for "space_track_status", describe your current relationship here
     */
    @JsonProperty("space_track_status_other")
    public void setSpaceTrackStatusOther(String spaceTrackStatusOther) {
        this.spaceTrackStatusOther = spaceTrackStatusOther;
    }

    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the company name used at SpaceTrack here. By default, this is the company name you are using at OKAPI.
     */
    @JsonProperty("space_track_company_name")
    public String getSpaceTrackCompanyName() {
        return spaceTrackCompanyName;
    }

    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the company name used at SpaceTrack here. By default, this is the company name you are using at OKAPI.
     */
    @JsonProperty("space_track_company_name")
    public void setSpaceTrackCompanyName(String spaceTrackCompanyName) {
        this.spaceTrackCompanyName = spaceTrackCompanyName;
    }

    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the Point-of-Contact name used at SpaceTrack here. By default, this is the address you are using at OKAPI.
     */
    @JsonProperty("space_track_poc_name")
    public String getSpaceTrackPocName() {
        return spaceTrackPocName;
    }

    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the Point-of-Contact name used at SpaceTrack here. By default, this is the address you are using at OKAPI.
     */
    @JsonProperty("space_track_poc_name")
    public void setSpaceTrackPocName(String spaceTrackPocName) {
        this.spaceTrackPocName = spaceTrackPocName;
    }

    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the Point-of-Contact address used at SpaceTrack here. By default, this is the address you are using at OKAPI.
     */
    @JsonProperty("space_track_poc_address")
    public String getSpaceTrackPocAddress() {
        return spaceTrackPocAddress;
    }

    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the Point-of-Contact address used at SpaceTrack here. By default, this is the address you are using at OKAPI.
     */
    @JsonProperty("space_track_poc_address")
    public void setSpaceTrackPocAddress(String spaceTrackPocAddress) {
        this.spaceTrackPocAddress = spaceTrackPocAddress;
    }

    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the login used at SpaceTrack here. By default, this is the mail address you are using at OKAPI.
     */
    @JsonProperty("space_track_login")
    public String getSpaceTrackLogin() {
        return spaceTrackLogin;
    }

    /**
     * If you select "sharing_agreement_signed", "satellite_registered" or "space_track_account_exists" for "space_track_status", state the login used at SpaceTrack here. By default, this is the mail address you are using at OKAPI.
     */
    @JsonProperty("space_track_login")
    public void setSpaceTrackLogin(String spaceTrackLogin) {
        this.spaceTrackLogin = spaceTrackLogin;
    }

    /**
     * Active status of this satellite. Indicates if screening is currently activated for this satellite definition. Is set automatically by OKAPI. Immutable by clients.
     */
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    /**
     * Active status of this satellite. Indicates if screening is currently activated for this satellite definition. Is set automatically by OKAPI. Immutable by clients.
     */
    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Preferred collision avoidance maneuver strategy for this satellite
     */
    @JsonProperty("maneuver_strategy")
    public List<ManeuverStrategy> getManeuverStrategy() {
        return maneuverStrategy;
    }

    /**
     * Preferred collision avoidance maneuver strategy for this satellite
     */
    @JsonProperty("maneuver_strategy")
    public void setManeuverStrategy(List<ManeuverStrategy> maneuverStrategy) {
        this.maneuverStrategy = new ArrayList<>(maneuverStrategy);
    }

    /**
     * Send notifications to email address associated with the satellite
     */
    @JsonProperty("send_mail_notifications")
    public Boolean getSendMailNotifications() {
        return sendMailNotifications;
    }

    /**
     * Send notifications to email address associated with the satellite
     */
    @JsonProperty("send_mail_notifications")
    public void setSendMailNotifications(Boolean sendMailNotifications) {
        this.sendMailNotifications = sendMailNotifications;
    }

    /**
     * Send notifications to Slack. Webhook needs to be provided separately
     */
    @JsonProperty("send_slack_notifications")
    public Boolean getSendSlackNotifications() {
        return sendSlackNotifications;
    }

    /**
     * Send notifications to Slack. Webhook needs to be provided separately
     */
    @JsonProperty("send_slack_notifications")
    public void setSendSlackNotifications(Boolean sendSlackNotifications) {
        this.sendSlackNotifications = sendSlackNotifications;
    }

    /**
     * Send notifications to Teams. Webhook needs to be provided separately
     */
    @JsonProperty("send_teams_notifications")
    public Boolean getSendTeamsNotifications() {
        return sendTeamsNotifications;
    }

    /**
     * Send notifications to Teams. Webhook needs to be provided separately
     */
    @JsonProperty("send_teams_notifications")
    public void setSendTeamsNotifications(Boolean sendTeamsNotifications) {
        this.sendTeamsNotifications = sendTeamsNotifications;
    }

    /**
     * URL of the Slack webhook
     */
    @JsonProperty("slack_webhook")
    public String getSlackWebhook() {
        return slackWebhook;
    }

    /**
     * URL of the Slack webhook
     */
    @JsonProperty("slack_webhook")
    public void setSlackWebhook(String slackWebhook) {
        this.slackWebhook = slackWebhook;
    }

    /**
     * URL of the Teams webhook
     */
    @JsonProperty("teams_webhook")
    public String getTeamsWebhook() {
        return teamsWebhook;
    }

    /**
     * URL of the Teams webhook
     */
    @JsonProperty("teams_webhook")
    public void setTeamsWebhook(String teamsWebhook) {
        this.teamsWebhook = teamsWebhook;
    }

    /**
     * GnssSensor
     * <p>
     * A GNSS sensor of a satellite, including settings on orbit determination and propagation
     */
    @JsonProperty("gnss_sensor")
    public GnssSensor getGnssSensor() {
        return gnssSensor;
    }

    /**
     * GnssSensor
     * <p>
     * A GNSS sensor of a satellite, including settings on orbit determination and propagation
     */
    @JsonProperty("gnss_sensor")
    public void setGnssSensor(GnssSensor gnssSensor) {
        this.gnssSensor = gnssSensor;
    }

    /**
     * If notifications are activated for this satellite, defines how critical a conjunction must be at the very least to be notified about it.
     */
    @JsonProperty("notification_verbosity")
    public Satellite.NotificationVerbosity getNotificationVerbosity() {
        return notificationVerbosity;
    }

    /**
     * If notifications are activated for this satellite, defines how critical a conjunction must be at the very least to be notified about it.
     */
    @JsonProperty("notification_verbosity")
    public void setNotificationVerbosity(Satellite.NotificationVerbosity notificationVerbosity) {
        this.notificationVerbosity = notificationVerbosity;
    }

    @JsonProperty("enable_accepted_collision_probability_limit_recommendation")
    public Boolean getEnableAcceptedCollisionProbabilityLimitRecommendation() {
        return enableAcceptedCollisionProbabilityLimitRecommendation;
    }

    @JsonProperty("enable_accepted_collision_probability_limit_recommendation")
    public void setEnableAcceptedCollisionProbabilityLimitRecommendation(Boolean enableAcceptedCollisionProbabilityLimitRecommendation) {
        this.enableAcceptedCollisionProbabilityLimitRecommendation = enableAcceptedCollisionProbabilityLimitRecommendation;
    }

    @JsonProperty("enable_miss_distance_recommendation")
    public Boolean getEnableMissDistanceRecommendation() {
        return enableMissDistanceRecommendation;
    }

    @JsonProperty("enable_miss_distance_recommendation")
    public void setEnableMissDistanceRecommendation(Boolean enableMissDistanceRecommendation) {
        this.enableMissDistanceRecommendation = enableMissDistanceRecommendation;
    }

    @JsonProperty("drag_maneuver_settings")
    public Satellite.DragManeuverSettings getDragManeuverSettings() {
        return dragManeuverSettings;
    }

    @JsonProperty("drag_maneuver_settings")
    public void setDragManeuverSettings(
            Satellite.DragManeuverSettings dragManeuverSettings) {
        this.dragManeuverSettings = dragManeuverSettings;
    }

    @Override
    public String toString() {
        String nullString = "<null>";
        StringBuilder sb = new StringBuilder();
        sb.append(Satellite.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("satelliteId");
        sb.append('=');
        sb.append(((this.satelliteId == null) ? nullString : this.satelliteId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? nullString: this.name));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null) ? nullString: this.info));
        sb.append(',');
        sb.append("noradIds");
        sb.append('=');
        sb.append(((this.noradIds == null) ? nullString: this.noradIds));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null) ? nullString: this.area));
        sb.append(',');
        sb.append("dragArea");
        sb.append('=');
        sb.append(((this.dragArea == null) ? nullString: this.dragArea));
        sb.append(',');
        sb.append("mass");
        sb.append('=');
        sb.append(((this.mass == null) ? nullString: this.mass));
        sb.append(',');
        sb.append("thrustUncertainty");
        sb.append('=');
        sb.append(((this.thrustUncertainty == null) ? nullString: this.thrustUncertainty));
        sb.append(',');
        sb.append("thrustPointingUncertainty");
        sb.append('=');
        sb.append(((this.thrustPointingUncertainty == null) ? nullString: this.thrustPointingUncertainty));
        sb.append(',');
        sb.append("thrustOutput");
        sb.append('=');
        sb.append(((this.thrustOutput == null) ? nullString: this.thrustOutput));
        sb.append(',');
        sb.append("maxThrustDuration");
        sb.append('=');
        sb.append(((this.maxThrustDuration == null) ? nullString: this.maxThrustDuration));
        sb.append(',');
        sb.append("minThrustDuration");
        sb.append('=');
        sb.append(((this.minThrustDuration == null) ? nullString: this.minThrustDuration));
        sb.append(',');
        sb.append("inSunConstraint");
        sb.append('=');
        sb.append(((this.inSunConstraint == null) ? nullString: this.inSunConstraint));
        sb.append(',');
        sb.append("minTimeInSun");
        sb.append('=');
        sb.append(((this.minTimeInSun == null) ? nullString: this.minTimeInSun));
        sb.append(',');
        sb.append("symmetricManoeuvres");
        sb.append('=');
        sb.append(((this.symmetricManoeuvres == null) ? nullString: this.symmetricManoeuvres));
        sb.append(',');
        sb.append("useGroundStationPasses");
        sb.append('=');
        sb.append(((this.useGroundStationPasses == null) ? nullString: this.useGroundStationPasses));
        sb.append(',');
        sb.append("useOffsetCdmAndEarliestManeuver");
        sb.append('=');
        sb.append(((this.useOffsetCdmAndEarliestManeuver == null) ? nullString: this.useOffsetCdmAndEarliestManeuver));
        sb.append(',');
        sb.append("offsetCdmAndEarliestManeuver");
        sb.append('=');
        sb.append(((this.offsetCdmAndEarliestManeuver == null) ? nullString: this.offsetCdmAndEarliestManeuver));
        sb.append(',');
        sb.append("useMinTimeTillPass");
        sb.append('=');
        sb.append(((this.useMinTimeTillPass == null) ? nullString: this.useMinTimeTillPass));
        sb.append(',');
        sb.append("minTimeTillPass");
        sb.append('=');
        sb.append(((this.minTimeTillPass == null) ? nullString: this.minTimeTillPass));
        sb.append(',');
        sb.append("propulsionType");
        sb.append('=');
        sb.append(((this.propulsionType == null) ? nullString: this.propulsionType));
        sb.append(',');
        sb.append("acceptedCollisionProbability");
        sb.append('=');
        sb.append(((this.acceptedCollisionProbability == null) ? nullString: this.acceptedCollisionProbability));
        sb.append(',');
        sb.append("acceptedMinimumDistance");
        sb.append('=');
        sb.append(((this.acceptedMinimumDistance == null) ? nullString: this.acceptedMinimumDistance));
        sb.append(',');
        sb.append("useAiRiskPrediction");
        sb.append('=');
        sb.append(((this.useAiRiskPrediction == null) ? nullString: this.useAiRiskPrediction));
        sb.append(',');
        sb.append("spaceTrackStatus");
        sb.append('=');
        sb.append(((this.spaceTrackStatus == null) ? nullString: this.spaceTrackStatus));
        sb.append(',');
        sb.append("spaceTrackStatusOther");
        sb.append('=');
        sb.append(((this.spaceTrackStatusOther == null) ? nullString: this.spaceTrackStatusOther));
        sb.append(',');
        sb.append("spaceTrackCompanyName");
        sb.append('=');
        sb.append(((this.spaceTrackCompanyName == null) ? nullString: this.spaceTrackCompanyName));
        sb.append(',');
        sb.append("spaceTrackPocName");
        sb.append('=');
        sb.append(((this.spaceTrackPocName == null) ? nullString: this.spaceTrackPocName));
        sb.append(',');
        sb.append("spaceTrackPocAddress");
        sb.append('=');
        sb.append(((this.spaceTrackPocAddress == null) ? nullString: this.spaceTrackPocAddress));
        sb.append(',');
        sb.append("spaceTrackLogin");
        sb.append('=');
        sb.append(((this.spaceTrackLogin == null) ? nullString: this.spaceTrackLogin));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null) ? nullString: this.active));
        sb.append(',');
        sb.append("maneuverStrategy");
        sb.append('=');
        sb.append(((this.maneuverStrategy == null) ? nullString: this.maneuverStrategy));
        sb.append(',');
        sb.append("sendMailNotifications");
        sb.append('=');
        sb.append(((this.sendMailNotifications == null) ? nullString: this.sendMailNotifications));
        sb.append(',');
        sb.append("sendSlackNotifications");
        sb.append('=');
        sb.append(((this.sendSlackNotifications == null) ? nullString: this.sendSlackNotifications));
        sb.append(',');
        sb.append("sendTeamsNotifications");
        sb.append('=');
        sb.append(((this.sendTeamsNotifications == null) ? nullString: this.sendTeamsNotifications));
        sb.append(',');
        sb.append("slackWebhook");
        sb.append('=');
        sb.append(((this.slackWebhook == null) ? nullString: this.slackWebhook));
        sb.append(',');
        sb.append("teamsWebhook");
        sb.append('=');
        sb.append(((this.teamsWebhook == null) ? nullString: this.teamsWebhook));
        sb.append(',');
        sb.append("gnssSensor");
        sb.append('=');
        sb.append(((this.gnssSensor == null) ? nullString: this.gnssSensor));
        sb.append(',');
        sb.append("notificationVerbosity");
        sb.append('=');
        sb.append(((this.notificationVerbosity == null) ? nullString: this.notificationVerbosity));
        sb.append(',');
        sb.append("enableAcceptedCollisionProbabilityLimitRecommendation");
        sb.append('=');
        sb.append(((this.enableAcceptedCollisionProbabilityLimitRecommendation == null) ? nullString: this.enableAcceptedCollisionProbabilityLimitRecommendation));
        sb.append(',');
        sb.append("enableMissDistanceRecommendation");
        sb.append('=');
        sb.append(((this.enableMissDistanceRecommendation == null) ? nullString: this.enableMissDistanceRecommendation));
        sb.append(',');
        sb.append("dragManeuverSettings");
        sb.append('=');
        sb.append(((this.dragManeuverSettings == null) ? nullString: this.dragManeuverSettings));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Satellite satellite = (Satellite) o;
        return Objects.equals(satelliteId, satellite.satelliteId) &&
                Objects.equals(name, satellite.name) && Objects.equals(info, satellite.info) &&
                Objects.equals(noradIds, satellite.noradIds) && Objects.equals(area, satellite.area) &&
                Objects.equals(dragArea, satellite.dragArea) && Objects.equals(mass, satellite.mass) &&
                Objects.equals(thrustUncertainty, satellite.thrustUncertainty) &&
                Objects.equals(thrustPointingUncertainty, satellite.thrustPointingUncertainty) &&
                Objects.equals(thrustOutput, satellite.thrustOutput) &&
                Objects.equals(maxThrustDuration, satellite.maxThrustDuration) &&
                Objects.equals(minThrustDuration, satellite.minThrustDuration) &&
                Objects.equals(inSunConstraint, satellite.inSunConstraint) &&
                Objects.equals(minTimeInSun, satellite.minTimeInSun) &&
                Objects.equals(symmetricManoeuvres, satellite.symmetricManoeuvres) &&
                Objects.equals(useGroundStationPasses, satellite.useGroundStationPasses) &&
                Objects.equals(useOffsetCdmAndEarliestManeuver, satellite.useOffsetCdmAndEarliestManeuver) &&
                Objects.equals(offsetCdmAndEarliestManeuver, satellite.offsetCdmAndEarliestManeuver) &&
                Objects.equals(useMinTimeTillPass, satellite.useMinTimeTillPass) &&
                Objects.equals(minTimeTillPass, satellite.minTimeTillPass) &&
                propulsionType == satellite.propulsionType &&
                Objects.equals(acceptedCollisionProbability, satellite.acceptedCollisionProbability) &&
                Objects.equals(acceptedMinimumDistance, satellite.acceptedMinimumDistance) &&
                Objects.equals(useAiRiskPrediction, satellite.useAiRiskPrediction) &&
                spaceTrackStatus == satellite.spaceTrackStatus &&
                Objects.equals(spaceTrackStatusOther, satellite.spaceTrackStatusOther) &&
                Objects.equals(spaceTrackCompanyName, satellite.spaceTrackCompanyName) &&
                Objects.equals(spaceTrackPocName, satellite.spaceTrackPocName) &&
                Objects.equals(spaceTrackPocAddress, satellite.spaceTrackPocAddress) &&
                Objects.equals(spaceTrackLogin, satellite.spaceTrackLogin) &&
                Objects.equals(active, satellite.active) &&
                Objects.equals(maneuverStrategy, satellite.maneuverStrategy) &&
                Objects.equals(sendMailNotifications, satellite.sendMailNotifications) &&
                Objects.equals(sendSlackNotifications, satellite.sendSlackNotifications) &&
                Objects.equals(sendTeamsNotifications, satellite.sendTeamsNotifications) &&
                Objects.equals(slackWebhook, satellite.slackWebhook) &&
                Objects.equals(teamsWebhook, satellite.teamsWebhook) &&
                Objects.equals(gnssSensor, satellite.gnssSensor) &&
                notificationVerbosity == satellite.notificationVerbosity &&
                Objects.equals(enableAcceptedCollisionProbabilityLimitRecommendation,
                        satellite.enableAcceptedCollisionProbabilityLimitRecommendation) &&
                Objects.equals(enableMissDistanceRecommendation, satellite.enableMissDistanceRecommendation) &&
                Objects.equals(dragManeuverSettings, satellite.dragManeuverSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(satelliteId, name, info, noradIds, area, dragArea, mass, thrustUncertainty,
                thrustPointingUncertainty, thrustOutput, maxThrustDuration, minThrustDuration, inSunConstraint,
                minTimeInSun, symmetricManoeuvres, useGroundStationPasses, useOffsetCdmAndEarliestManeuver,
                offsetCdmAndEarliestManeuver, useMinTimeTillPass, minTimeTillPass, propulsionType,
                acceptedCollisionProbability, acceptedMinimumDistance, useAiRiskPrediction, spaceTrackStatus,
                spaceTrackStatusOther, spaceTrackCompanyName, spaceTrackPocName, spaceTrackPocAddress, spaceTrackLogin,
                active, maneuverStrategy, sendMailNotifications, sendSlackNotifications, sendTeamsNotifications,
                slackWebhook, teamsWebhook, gnssSensor, notificationVerbosity,
                enableAcceptedCollisionProbabilityLimitRecommendation, enableMissDistanceRecommendation,
                dragManeuverSettings);
    }

    /**
     * Preferred collision avoidance maneuver strategy for this satellite
     */
    public enum ManeuverStrategy {

        SHORT_TERM("short_term"),
        LONG_TERM("long_term");
        private final String value;
        private static final Map<String, Satellite.ManeuverStrategy> CONSTANTS = new HashMap<String,
                Satellite.ManeuverStrategy>();

        static {
            for (Satellite.ManeuverStrategy c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ManeuverStrategy(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Satellite.ManeuverStrategy fromValue(String value) {
            Satellite.ManeuverStrategy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * If notifications are activated for this satellite, defines how critical a conjunction must be at the very least to be notified about it.
     */
    public enum NotificationVerbosity {

        OBSERVE("observe"),
        CRITICAL("critical");
        private final String value;
        private static final Map<String, Satellite.NotificationVerbosity> CONSTANTS = new HashMap<String, Satellite.NotificationVerbosity>();

        static {
            for (Satellite.NotificationVerbosity c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        NotificationVerbosity(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Satellite.NotificationVerbosity fromValue(String value) {
            Satellite.NotificationVerbosity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum PropulsionType {

        IMPULSIVE("impulsive"),
        CONTINUOUS("continuous");
        private final String value;
        private static final Map<String, Satellite.PropulsionType> CONSTANTS = new HashMap<String,
                Satellite.PropulsionType>();

        static {
            for (Satellite.PropulsionType c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PropulsionType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Satellite.PropulsionType fromValue(String value) {
            Satellite.PropulsionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Please state your current relationship with SpaceTrack / 18 SPCS concerning this satellite
     */
    public enum SpaceTrackStatus {

        SHARING_AGREEMENT_SIGNED("sharing_agreement_signed"),
        SATELLITE_REGISTERED("satellite_registered"),
        SPACE_TRACK_ACCOUNT_EXISTS("space_track_account_exists"),
        NO_SPACE_TRACK_ACCOUNT("no_space_track_account"),
        DONT_KNOW("dont_know"),
        OTHER("other");
        private final String value;
        private static final Map<String, Satellite.SpaceTrackStatus> CONSTANTS = new HashMap<String, Satellite.SpaceTrackStatus>();

        static {
            for (Satellite.SpaceTrackStatus c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SpaceTrackStatus(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Satellite.SpaceTrackStatus fromValue(String value) {
            Satellite.SpaceTrackStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
    }

    /**
     * Drag Maneuver Settings
     */
    @JsonPropertyOrder({
            "high_drag_area",
            "use_offset_cdm_earliest_drag_maneuver",
            "offset_cdm_earliest_drag_maneuver"
    })
    public static class DragManeuverSettings {
        @JsonProperty("high_drag_area")
        private Double highDragArea;
        @JsonProperty("use_offset_cdm_earliest_drag_maneuver")
        private Boolean useOffsetCdmEarliestDragManeuver;
        @JsonProperty("offset_cdm_earliest_drag_maneuver")
        private Double offsetCdmEarliestDragManeuver;

        public DragManeuverSettings() {
            // Default constructor
        }

        public DragManeuverSettings(Double highDragArea, Boolean useOffsetCdmEarliestDragManeuver,
                                    Double offsetCdmEarliestDragManeuver) {
            this.highDragArea = highDragArea;
            this.useOffsetCdmEarliestDragManeuver = useOffsetCdmEarliestDragManeuver;
            this.offsetCdmEarliestDragManeuver = offsetCdmEarliestDragManeuver;
        }

        @JsonProperty("high_drag_area")
        public Double getHighDragArea() {
            return highDragArea;
        }

        @JsonProperty("high_drag_area")
        public void setHighDragArea(Double highDragArea) {
            this.highDragArea = highDragArea;
        }

        @JsonProperty("use_offset_cdm_earliest_drag_maneuver")
        public Boolean getUseOffsetCdmEarliestDragManeuver() {
            return useOffsetCdmEarliestDragManeuver;
        }

        @JsonProperty("use_offset_cdm_earliest_drag_maneuver")
        public void setUseOffsetCdmEarliestDragManeuver(Boolean useOffsetCdmEarliestDragManeuver) {
            this.useOffsetCdmEarliestDragManeuver = useOffsetCdmEarliestDragManeuver;
        }

        @JsonProperty("offset_cdm_earliest_drag_maneuver")
        public Double getOffsetCdmEarliestDragManeuver() {
            return offsetCdmEarliestDragManeuver;
        }

        @JsonProperty("offset_cdm_earliest_drag_maneuver")
        public void setOffsetCdmEarliestDragManeuver(Double offsetCdmEarliestDragManeuver) {
            this.offsetCdmEarliestDragManeuver = offsetCdmEarliestDragManeuver;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DragManeuverSettings that = (DragManeuverSettings) o;
            return Objects.equals(highDragArea, that.highDragArea) &&
                    Objects.equals(useOffsetCdmEarliestDragManeuver, that.useOffsetCdmEarliestDragManeuver) &&
                    Objects.equals(offsetCdmEarliestDragManeuver, that.offsetCdmEarliestDragManeuver);
        }

        @Override
        public int hashCode() {
            return Objects.hash(highDragArea, useOffsetCdmEarliestDragManeuver, offsetCdmEarliestDragManeuver);
        }

        @Override
        public String toString() {
            return "DragManeuverSettings{" +
                    "HighDragArea=" + highDragArea +
                    ", useOffsetCdmEarliestDragManeuver=" + useOffsetCdmEarliestDragManeuver +
                    ", offsetCdmEarliestDragManeuver=" + offsetCdmEarliestDragManeuver +
                    '}';
        }
    }



}
