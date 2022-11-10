
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RiskEstimation
 * <p>
 * A risk estimation with the Time of Closest Approach (TCA), collision probability, the associated method, miss vector and covariance scaling factors. In addition, a risk classification is available.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "risk_estimation_id",
    "creation_date",
    "originator",
    "tca",
    "collision_probability",
    "collision_probability_method",
    "mahalanobis_distance",
    "miss_distance",
    "relative_speed",
    "sat1_hard_body_radius",
    "sat2_hard_body_radius",
    "r",
    "t",
    "n",
    "r_dot",
    "t_dot",
    "n_dot",
    "r_std",
    "t_std",
    "n_std",
    "r_dot_std",
    "t_dot_std",
    "n_dot_std",
    "sat1_covariance_r_scaling_factor",
    "sat1_covariance_t_scaling_factor",
    "sat1_covariance_n_scaling_factor",
    "sat2_covariance_r_scaling_factor",
    "sat2_covariance_t_scaling_factor",
    "sat2_covariance_n_scaling_factor",
    "b_plane_x",
    "b_plane_y",
    "b_plane_xx",
    "b_plane_xy",
    "b_plane_yy",
    "b_plane_yx",
    "sat1_state_at_tca",
    "sat2_state_at_tca",
    "criticality",
    "suggested",
    "comment",
    "based_on"
})
public class RiskEstimation {

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     * 
     */
    @JsonProperty("risk_estimation_id")
    @JsonPropertyDescription("A Universally-Unique Identifier, as used by OKAPI:Orbits")
    private String riskEstimationId;
    /**
     * CDM creation date/time in Coordinated Universal Time (UTC).
     * 
     */
    @JsonProperty("creation_date")
    @JsonPropertyDescription("CDM creation date/time in Coordinated Universal Time (UTC).")
    private Date creationDate;
    @JsonProperty("originator")
    private String originator;
    /**
     * Date and time of the time of close approach
     * (Required)
     * 
     */
    @JsonProperty("tca")
    @JsonPropertyDescription("Date and time of the time of close approach")
    private Date tca;
    /**
     * Probability of collision at TCA. If this value is null or non-existing, a value could not be derived due to anomalies in the data.
     * 
     */
    @JsonProperty("collision_probability")
    @JsonPropertyDescription("Probability of collision at TCA. If this value is null or non-existing, a value could not be derived due to anomalies in the data.")
    private Double collisionProbability;
    /**
     * Defines the method that was used to derive the collision probability
     * (Required)
     * 
     */
    @JsonProperty("collision_probability_method")
    @JsonPropertyDescription("Defines the method that was used to derive the collision probability")
    private String collisionProbabilityMethod;
    /**
     *  - 
     * (Required)
     * 
     */
    @JsonProperty("mahalanobis_distance")
    @JsonPropertyDescription(" - ")
    private Double mahalanobisDistance;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("miss_distance")
    @JsonPropertyDescription("in km")
    private Double missDistance;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("relative_speed")
    @JsonPropertyDescription("in km/s")
    private Double relativeSpeed;
    /**
     * in m
     * 
     */
    @JsonProperty("sat1_hard_body_radius")
    @JsonPropertyDescription("in m")
    private Double sat1HardBodyRadius;
    /**
     * in m
     * 
     */
    @JsonProperty("sat2_hard_body_radius")
    @JsonPropertyDescription("in m")
    private Double sat2HardBodyRadius;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("r")
    @JsonPropertyDescription("in km")
    private Double r;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("t")
    @JsonPropertyDescription("in km")
    private Double t;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("n")
    @JsonPropertyDescription("in km")
    private Double n;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("r_dot")
    @JsonPropertyDescription("in km/s")
    private Double rDot;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("t_dot")
    @JsonPropertyDescription("in km/s")
    private Double tDot;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("n_dot")
    @JsonPropertyDescription("in km/s")
    private Double nDot;
    /**
     * Radial standard deviation in km
     * (Required)
     * 
     */
    @JsonProperty("r_std")
    @JsonPropertyDescription("Radial standard deviation in km")
    private Double rStd;
    /**
     * Along-track standard deviation in km
     * (Required)
     * 
     */
    @JsonProperty("t_std")
    @JsonPropertyDescription("Along-track standard deviation in km")
    private Double tStd;
    /**
     * Cross-track standard deviation in km
     * (Required)
     * 
     */
    @JsonProperty("n_std")
    @JsonPropertyDescription("Cross-track standard deviation in km")
    private Double nStd;
    /**
     * Radial velocity standard deviation in km/s
     * (Required)
     * 
     */
    @JsonProperty("r_dot_std")
    @JsonPropertyDescription("Radial velocity standard deviation in km/s")
    private Double rDotStd;
    /**
     * Along-track velocity standard deviation in km/s
     * (Required)
     * 
     */
    @JsonProperty("t_dot_std")
    @JsonPropertyDescription("Along-track velocity standard deviation in km/s")
    private Double tDotStd;
    /**
     * Cross-track velocity standard deviation in km/s
     * (Required)
     * 
     */
    @JsonProperty("n_dot_std")
    @JsonPropertyDescription("Cross-track velocity standard deviation in km/s")
    private Double nDotStd;
    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat1_covariance_r_scaling_factor")
    @JsonPropertyDescription("applied factor / -")
    private Double sat1CovarianceRScalingFactor;
    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat1_covariance_t_scaling_factor")
    @JsonPropertyDescription("applied factor / -")
    private Double sat1CovarianceTScalingFactor;
    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat1_covariance_n_scaling_factor")
    @JsonPropertyDescription("applied factor / -")
    private Double sat1CovarianceNScalingFactor;
    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat2_covariance_r_scaling_factor")
    @JsonPropertyDescription("applied factor / -")
    private Double sat2CovarianceRScalingFactor;
    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat2_covariance_t_scaling_factor")
    @JsonPropertyDescription("applied factor / -")
    private Double sat2CovarianceTScalingFactor;
    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat2_covariance_n_scaling_factor")
    @JsonPropertyDescription("applied factor / -")
    private Double sat2CovarianceNScalingFactor;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("b_plane_x")
    @JsonPropertyDescription("in km")
    private Double bPlaneX;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("b_plane_y")
    @JsonPropertyDescription("in km")
    private Double bPlaneY;
    /**
     * B-plane variance XX in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_xx")
    @JsonPropertyDescription("B-plane variance XX in km\u00b2")
    private Double bPlaneXx;
    /**
     * B-plane variance XY in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_xy")
    @JsonPropertyDescription("B-plane variance XY in km\u00b2")
    private Double bPlaneXy;
    /**
     * B-plane variance YY in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_yy")
    @JsonPropertyDescription("B-plane variance YY in km\u00b2")
    private Double bPlaneYy;
    /**
     * B-plane variance YX in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_yx")
    @JsonPropertyDescription("B-plane variance YX in km\u00b2")
    private Double bPlaneYx;
    /**
     * CcsdsOpm
     * <p>
     * Defintition of the CCSDS OPM, with one header, meta data and data section.
     * (Required)
     * 
     */
    @JsonProperty("sat1_state_at_tca")
    @JsonPropertyDescription("Defintition of the CCSDS OPM, with one header, meta data and data section.")
    private CcsdsOpm sat1StateAtTca;
    /**
     * CcsdsOpm
     * <p>
     * Defintition of the CCSDS OPM, with one header, meta data and data section.
     * (Required)
     * 
     */
    @JsonProperty("sat2_state_at_tca")
    @JsonPropertyDescription("Defintition of the CCSDS OPM, with one header, meta data and data section.")
    private CcsdsOpm sat2StateAtTca;
    /**
     * Criticality
     * <p>
     * Conjunction criticality.
     * 
     */
    @JsonProperty("criticality")
    @JsonPropertyDescription("Conjunction criticality.")
    private com.okapiorbits.platform.science.jobs.json.RiskPrediction.Criticality criticality;
    /**
     * Defines if this risk estimation is the one suggested by Okapi for the CDM it is based on. Is not evaluated for single-call risk estimations.
     * (Required)
     * 
     */
    @JsonProperty("suggested")
    @JsonPropertyDescription("Defines if this risk estimation is the one suggested by Okapi for the CDM it is based on. Is not evaluated for single-call risk estimations.")
    private Boolean suggested = true;
    /**
     * Gives context to this risk estimation.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Gives context to this risk estimation.")
    private String comment;
    /**
     * RiskBasedOn
     * <p>
     * Describes on what basis a risk estimation or prediction was calculated.
     * (Required)
     * 
     */
    @JsonProperty("based_on")
    @JsonPropertyDescription("Describes on what basis a risk estimation or prediction was calculated.")
    private com.okapiorbits.platform.science.jobs.json.RiskPrediction.RiskBasedOn basedOn = com.okapiorbits.platform.science.jobs.json.RiskPrediction.RiskBasedOn.fromValue("UNKNOWN");

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     * 
     */
    @JsonProperty("risk_estimation_id")
    public String getRiskEstimationId() {
        return riskEstimationId;
    }

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     * 
     */
    @JsonProperty("risk_estimation_id")
    public void setRiskEstimationId(String riskEstimationId) {
        this.riskEstimationId = riskEstimationId;
    }

    /**
     * CDM creation date/time in Coordinated Universal Time (UTC).
     * 
     */
    @JsonProperty("creation_date")
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * CDM creation date/time in Coordinated Universal Time (UTC).
     * 
     */
    @JsonProperty("creation_date")
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("originator")
    public String getOriginator() {
        return originator;
    }

    @JsonProperty("originator")
    public void setOriginator(String originator) {
        this.originator = originator;
    }

    /**
     * Date and time of the time of close approach
     * (Required)
     * 
     */
    @JsonProperty("tca")
    public Date getTca() {
        return tca;
    }

    /**
     * Date and time of the time of close approach
     * (Required)
     * 
     */
    @JsonProperty("tca")
    public void setTca(Date tca) {
        this.tca = tca;
    }

    /**
     * Probability of collision at TCA. If this value is null or non-existing, a value could not be derived due to anomalies in the data.
     * 
     */
    @JsonProperty("collision_probability")
    public Double getCollisionProbability() {
        return collisionProbability;
    }

    /**
     * Probability of collision at TCA. If this value is null or non-existing, a value could not be derived due to anomalies in the data.
     * 
     */
    @JsonProperty("collision_probability")
    public void setCollisionProbability(Double collisionProbability) {
        this.collisionProbability = collisionProbability;
    }

    /**
     * Defines the method that was used to derive the collision probability
     * (Required)
     * 
     */
    @JsonProperty("collision_probability_method")
    public String getCollisionProbabilityMethod() {
        return collisionProbabilityMethod;
    }

    /**
     * Defines the method that was used to derive the collision probability
     * (Required)
     * 
     */
    @JsonProperty("collision_probability_method")
    public void setCollisionProbabilityMethod(String collisionProbabilityMethod) {
        this.collisionProbabilityMethod = collisionProbabilityMethod;
    }

    /**
     *  - 
     * (Required)
     * 
     */
    @JsonProperty("mahalanobis_distance")
    public Double getMahalanobisDistance() {
        return mahalanobisDistance;
    }

    /**
     *  - 
     * (Required)
     * 
     */
    @JsonProperty("mahalanobis_distance")
    public void setMahalanobisDistance(Double mahalanobisDistance) {
        this.mahalanobisDistance = mahalanobisDistance;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("miss_distance")
    public Double getMissDistance() {
        return missDistance;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("miss_distance")
    public void setMissDistance(Double missDistance) {
        this.missDistance = missDistance;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("relative_speed")
    public Double getRelativeSpeed() {
        return relativeSpeed;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("relative_speed")
    public void setRelativeSpeed(Double relativeSpeed) {
        this.relativeSpeed = relativeSpeed;
    }

    /**
     * in m
     * 
     */
    @JsonProperty("sat1_hard_body_radius")
    public Double getSat1HardBodyRadius() {
        return sat1HardBodyRadius;
    }

    /**
     * in m
     * 
     */
    @JsonProperty("sat1_hard_body_radius")
    public void setSat1HardBodyRadius(Double sat1HardBodyRadius) {
        this.sat1HardBodyRadius = sat1HardBodyRadius;
    }

    /**
     * in m
     * 
     */
    @JsonProperty("sat2_hard_body_radius")
    public Double getSat2HardBodyRadius() {
        return sat2HardBodyRadius;
    }

    /**
     * in m
     * 
     */
    @JsonProperty("sat2_hard_body_radius")
    public void setSat2HardBodyRadius(Double sat2HardBodyRadius) {
        this.sat2HardBodyRadius = sat2HardBodyRadius;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("r")
    public Double getR() {
        return r;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("r")
    public void setR(Double r) {
        this.r = r;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("t")
    public Double getT() {
        return t;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("t")
    public void setT(Double t) {
        this.t = t;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("n")
    public Double getN() {
        return n;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("n")
    public void setN(Double n) {
        this.n = n;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("r_dot")
    public Double getrDot() {
        return rDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("r_dot")
    public void setrDot(Double rDot) {
        this.rDot = rDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("t_dot")
    public Double gettDot() {
        return tDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("t_dot")
    public void settDot(Double tDot) {
        this.tDot = tDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("n_dot")
    public Double getnDot() {
        return nDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("n_dot")
    public void setnDot(Double nDot) {
        this.nDot = nDot;
    }

    /**
     * Radial standard deviation in km
     * (Required)
     * 
     */
    @JsonProperty("r_std")
    public Double getrStd() {
        return rStd;
    }

    /**
     * Radial standard deviation in km
     * (Required)
     * 
     */
    @JsonProperty("r_std")
    public void setrStd(Double rStd) {
        this.rStd = rStd;
    }

    /**
     * Along-track standard deviation in km
     * (Required)
     * 
     */
    @JsonProperty("t_std")
    public Double gettStd() {
        return tStd;
    }

    /**
     * Along-track standard deviation in km
     * (Required)
     * 
     */
    @JsonProperty("t_std")
    public void settStd(Double tStd) {
        this.tStd = tStd;
    }

    /**
     * Cross-track standard deviation in km
     * (Required)
     * 
     */
    @JsonProperty("n_std")
    public Double getnStd() {
        return nStd;
    }

    /**
     * Cross-track standard deviation in km
     * (Required)
     * 
     */
    @JsonProperty("n_std")
    public void setnStd(Double nStd) {
        this.nStd = nStd;
    }

    /**
     * Radial velocity standard deviation in km/s
     * (Required)
     * 
     */
    @JsonProperty("r_dot_std")
    public Double getrDotStd() {
        return rDotStd;
    }

    /**
     * Radial velocity standard deviation in km/s
     * (Required)
     * 
     */
    @JsonProperty("r_dot_std")
    public void setrDotStd(Double rDotStd) {
        this.rDotStd = rDotStd;
    }

    /**
     * Along-track velocity standard deviation in km/s
     * (Required)
     * 
     */
    @JsonProperty("t_dot_std")
    public Double gettDotStd() {
        return tDotStd;
    }

    /**
     * Along-track velocity standard deviation in km/s
     * (Required)
     * 
     */
    @JsonProperty("t_dot_std")
    public void settDotStd(Double tDotStd) {
        this.tDotStd = tDotStd;
    }

    /**
     * Cross-track velocity standard deviation in km/s
     * (Required)
     * 
     */
    @JsonProperty("n_dot_std")
    public Double getnDotStd() {
        return nDotStd;
    }

    /**
     * Cross-track velocity standard deviation in km/s
     * (Required)
     * 
     */
    @JsonProperty("n_dot_std")
    public void setnDotStd(Double nDotStd) {
        this.nDotStd = nDotStd;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat1_covariance_r_scaling_factor")
    public Double getSat1CovarianceRScalingFactor() {
        return sat1CovarianceRScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat1_covariance_r_scaling_factor")
    public void setSat1CovarianceRScalingFactor(Double sat1CovarianceRScalingFactor) {
        this.sat1CovarianceRScalingFactor = sat1CovarianceRScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat1_covariance_t_scaling_factor")
    public Double getSat1CovarianceTScalingFactor() {
        return sat1CovarianceTScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat1_covariance_t_scaling_factor")
    public void setSat1CovarianceTScalingFactor(Double sat1CovarianceTScalingFactor) {
        this.sat1CovarianceTScalingFactor = sat1CovarianceTScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat1_covariance_n_scaling_factor")
    public Double getSat1CovarianceNScalingFactor() {
        return sat1CovarianceNScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat1_covariance_n_scaling_factor")
    public void setSat1CovarianceNScalingFactor(Double sat1CovarianceNScalingFactor) {
        this.sat1CovarianceNScalingFactor = sat1CovarianceNScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat2_covariance_r_scaling_factor")
    public Double getSat2CovarianceRScalingFactor() {
        return sat2CovarianceRScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat2_covariance_r_scaling_factor")
    public void setSat2CovarianceRScalingFactor(Double sat2CovarianceRScalingFactor) {
        this.sat2CovarianceRScalingFactor = sat2CovarianceRScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat2_covariance_t_scaling_factor")
    public Double getSat2CovarianceTScalingFactor() {
        return sat2CovarianceTScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat2_covariance_t_scaling_factor")
    public void setSat2CovarianceTScalingFactor(Double sat2CovarianceTScalingFactor) {
        this.sat2CovarianceTScalingFactor = sat2CovarianceTScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat2_covariance_n_scaling_factor")
    public Double getSat2CovarianceNScalingFactor() {
        return sat2CovarianceNScalingFactor;
    }

    /**
     * applied factor / -
     * (Required)
     * 
     */
    @JsonProperty("sat2_covariance_n_scaling_factor")
    public void setSat2CovarianceNScalingFactor(Double sat2CovarianceNScalingFactor) {
        this.sat2CovarianceNScalingFactor = sat2CovarianceNScalingFactor;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("b_plane_x")
    public Double getbPlaneX() {
        return bPlaneX;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("b_plane_x")
    public void setbPlaneX(Double bPlaneX) {
        this.bPlaneX = bPlaneX;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("b_plane_y")
    public Double getbPlaneY() {
        return bPlaneY;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("b_plane_y")
    public void setbPlaneY(Double bPlaneY) {
        this.bPlaneY = bPlaneY;
    }

    /**
     * B-plane variance XX in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_xx")
    public Double getbPlaneXx() {
        return bPlaneXx;
    }

    /**
     * B-plane variance XX in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_xx")
    public void setbPlaneXx(Double bPlaneXx) {
        this.bPlaneXx = bPlaneXx;
    }

    /**
     * B-plane variance XY in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_xy")
    public Double getbPlaneXy() {
        return bPlaneXy;
    }

    /**
     * B-plane variance XY in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_xy")
    public void setbPlaneXy(Double bPlaneXy) {
        this.bPlaneXy = bPlaneXy;
    }

    /**
     * B-plane variance YY in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_yy")
    public Double getbPlaneYy() {
        return bPlaneYy;
    }

    /**
     * B-plane variance YY in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_yy")
    public void setbPlaneYy(Double bPlaneYy) {
        this.bPlaneYy = bPlaneYy;
    }

    /**
     * B-plane variance YX in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_yx")
    public Double getbPlaneYx() {
        return bPlaneYx;
    }

    /**
     * B-plane variance YX in km²
     * (Required)
     * 
     */
    @JsonProperty("b_plane_yx")
    public void setbPlaneYx(Double bPlaneYx) {
        this.bPlaneYx = bPlaneYx;
    }

    /**
     * CcsdsOpm
     * <p>
     * Defintition of the CCSDS OPM, with one header, meta data and data section.
     * (Required)
     * 
     */
    @JsonProperty("sat1_state_at_tca")
    public CcsdsOpm getSat1StateAtTca() {
        return sat1StateAtTca;
    }

    /**
     * CcsdsOpm
     * <p>
     * Defintition of the CCSDS OPM, with one header, meta data and data section.
     * (Required)
     * 
     */
    @JsonProperty("sat1_state_at_tca")
    public void setSat1StateAtTca(CcsdsOpm sat1StateAtTca) {
        this.sat1StateAtTca = sat1StateAtTca;
    }

    /**
     * CcsdsOpm
     * <p>
     * Defintition of the CCSDS OPM, with one header, meta data and data section.
     * (Required)
     * 
     */
    @JsonProperty("sat2_state_at_tca")
    public CcsdsOpm getSat2StateAtTca() {
        return sat2StateAtTca;
    }

    /**
     * CcsdsOpm
     * <p>
     * Defintition of the CCSDS OPM, with one header, meta data and data section.
     * (Required)
     * 
     */
    @JsonProperty("sat2_state_at_tca")
    public void setSat2StateAtTca(CcsdsOpm sat2StateAtTca) {
        this.sat2StateAtTca = sat2StateAtTca;
    }

    /**
     * Criticality
     * <p>
     * Conjunction criticality.
     * 
     */
    @JsonProperty("criticality")
    public com.okapiorbits.platform.science.jobs.json.RiskPrediction.Criticality getCriticality() {
        return criticality;
    }

    /**
     * Criticality
     * <p>
     * Conjunction criticality.
     * 
     */
    @JsonProperty("criticality")
    public void setCriticality(com.okapiorbits.platform.science.jobs.json.RiskPrediction.Criticality criticality) {
        this.criticality = criticality;
    }

    /**
     * Defines if this risk estimation is the one suggested by Okapi for the CDM it is based on. Is not evaluated for single-call risk estimations.
     * (Required)
     * 
     */
    @JsonProperty("suggested")
    public Boolean getSuggested() {
        return suggested;
    }

    /**
     * Defines if this risk estimation is the one suggested by Okapi for the CDM it is based on. Is not evaluated for single-call risk estimations.
     * (Required)
     * 
     */
    @JsonProperty("suggested")
    public void setSuggested(Boolean suggested) {
        this.suggested = suggested;
    }

    /**
     * Gives context to this risk estimation.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Gives context to this risk estimation.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * RiskBasedOn
     * <p>
     * Describes on what basis a risk estimation or prediction was calculated.
     * (Required)
     * 
     */
    @JsonProperty("based_on")
    public com.okapiorbits.platform.science.jobs.json.RiskPrediction.RiskBasedOn getBasedOn() {
        return basedOn;
    }

    /**
     * RiskBasedOn
     * <p>
     * Describes on what basis a risk estimation or prediction was calculated.
     * (Required)
     * 
     */
    @JsonProperty("based_on")
    public void setBasedOn(com.okapiorbits.platform.science.jobs.json.RiskPrediction.RiskBasedOn basedOn) {
        this.basedOn = basedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RiskEstimation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("riskEstimationId");
        sb.append('=');
        sb.append(((this.riskEstimationId == null)?"<null>":this.riskEstimationId));
        sb.append(',');
        sb.append("creationDate");
        sb.append('=');
        sb.append(((this.creationDate == null)?"<null>":this.creationDate));
        sb.append(',');
        sb.append("originator");
        sb.append('=');
        sb.append(((this.originator == null)?"<null>":this.originator));
        sb.append(',');
        sb.append("tca");
        sb.append('=');
        sb.append(((this.tca == null)?"<null>":this.tca));
        sb.append(',');
        sb.append("collisionProbability");
        sb.append('=');
        sb.append(((this.collisionProbability == null)?"<null>":this.collisionProbability));
        sb.append(',');
        sb.append("collisionProbabilityMethod");
        sb.append('=');
        sb.append(((this.collisionProbabilityMethod == null)?"<null>":this.collisionProbabilityMethod));
        sb.append(',');
        sb.append("mahalanobisDistance");
        sb.append('=');
        sb.append(((this.mahalanobisDistance == null)?"<null>":this.mahalanobisDistance));
        sb.append(',');
        sb.append("missDistance");
        sb.append('=');
        sb.append(((this.missDistance == null)?"<null>":this.missDistance));
        sb.append(',');
        sb.append("relativeSpeed");
        sb.append('=');
        sb.append(((this.relativeSpeed == null)?"<null>":this.relativeSpeed));
        sb.append(',');
        sb.append("sat1HardBodyRadius");
        sb.append('=');
        sb.append(((this.sat1HardBodyRadius == null)?"<null>":this.sat1HardBodyRadius));
        sb.append(',');
        sb.append("sat2HardBodyRadius");
        sb.append('=');
        sb.append(((this.sat2HardBodyRadius == null)?"<null>":this.sat2HardBodyRadius));
        sb.append(',');
        sb.append("r");
        sb.append('=');
        sb.append(((this.r == null)?"<null>":this.r));
        sb.append(',');
        sb.append("t");
        sb.append('=');
        sb.append(((this.t == null)?"<null>":this.t));
        sb.append(',');
        sb.append("n");
        sb.append('=');
        sb.append(((this.n == null)?"<null>":this.n));
        sb.append(',');
        sb.append("rDot");
        sb.append('=');
        sb.append(((this.rDot == null)?"<null>":this.rDot));
        sb.append(',');
        sb.append("tDot");
        sb.append('=');
        sb.append(((this.tDot == null)?"<null>":this.tDot));
        sb.append(',');
        sb.append("nDot");
        sb.append('=');
        sb.append(((this.nDot == null)?"<null>":this.nDot));
        sb.append(',');
        sb.append("rStd");
        sb.append('=');
        sb.append(((this.rStd == null)?"<null>":this.rStd));
        sb.append(',');
        sb.append("tStd");
        sb.append('=');
        sb.append(((this.tStd == null)?"<null>":this.tStd));
        sb.append(',');
        sb.append("nStd");
        sb.append('=');
        sb.append(((this.nStd == null)?"<null>":this.nStd));
        sb.append(',');
        sb.append("rDotStd");
        sb.append('=');
        sb.append(((this.rDotStd == null)?"<null>":this.rDotStd));
        sb.append(',');
        sb.append("tDotStd");
        sb.append('=');
        sb.append(((this.tDotStd == null)?"<null>":this.tDotStd));
        sb.append(',');
        sb.append("nDotStd");
        sb.append('=');
        sb.append(((this.nDotStd == null)?"<null>":this.nDotStd));
        sb.append(',');
        sb.append("sat1CovarianceRScalingFactor");
        sb.append('=');
        sb.append(((this.sat1CovarianceRScalingFactor == null)?"<null>":this.sat1CovarianceRScalingFactor));
        sb.append(',');
        sb.append("sat1CovarianceTScalingFactor");
        sb.append('=');
        sb.append(((this.sat1CovarianceTScalingFactor == null)?"<null>":this.sat1CovarianceTScalingFactor));
        sb.append(',');
        sb.append("sat1CovarianceNScalingFactor");
        sb.append('=');
        sb.append(((this.sat1CovarianceNScalingFactor == null)?"<null>":this.sat1CovarianceNScalingFactor));
        sb.append(',');
        sb.append("sat2CovarianceRScalingFactor");
        sb.append('=');
        sb.append(((this.sat2CovarianceRScalingFactor == null)?"<null>":this.sat2CovarianceRScalingFactor));
        sb.append(',');
        sb.append("sat2CovarianceTScalingFactor");
        sb.append('=');
        sb.append(((this.sat2CovarianceTScalingFactor == null)?"<null>":this.sat2CovarianceTScalingFactor));
        sb.append(',');
        sb.append("sat2CovarianceNScalingFactor");
        sb.append('=');
        sb.append(((this.sat2CovarianceNScalingFactor == null)?"<null>":this.sat2CovarianceNScalingFactor));
        sb.append(',');
        sb.append("bPlaneX");
        sb.append('=');
        sb.append(((this.bPlaneX == null)?"<null>":this.bPlaneX));
        sb.append(',');
        sb.append("bPlaneY");
        sb.append('=');
        sb.append(((this.bPlaneY == null)?"<null>":this.bPlaneY));
        sb.append(',');
        sb.append("bPlaneXx");
        sb.append('=');
        sb.append(((this.bPlaneXx == null)?"<null>":this.bPlaneXx));
        sb.append(',');
        sb.append("bPlaneXy");
        sb.append('=');
        sb.append(((this.bPlaneXy == null)?"<null>":this.bPlaneXy));
        sb.append(',');
        sb.append("bPlaneYy");
        sb.append('=');
        sb.append(((this.bPlaneYy == null)?"<null>":this.bPlaneYy));
        sb.append(',');
        sb.append("bPlaneYx");
        sb.append('=');
        sb.append(((this.bPlaneYx == null)?"<null>":this.bPlaneYx));
        sb.append(',');
        sb.append("sat1StateAtTca");
        sb.append('=');
        sb.append(((this.sat1StateAtTca == null)?"<null>":this.sat1StateAtTca));
        sb.append(',');
        sb.append("sat2StateAtTca");
        sb.append('=');
        sb.append(((this.sat2StateAtTca == null)?"<null>":this.sat2StateAtTca));
        sb.append(',');
        sb.append("criticality");
        sb.append('=');
        sb.append(((this.criticality == null)?"<null>":this.criticality));
        sb.append(',');
        sb.append("suggested");
        sb.append('=');
        sb.append(((this.suggested == null)?"<null>":this.suggested));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("basedOn");
        sb.append('=');
        sb.append(((this.basedOn == null)?"<null>":this.basedOn));
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
        result = ((result* 31)+((this.tDot == null)? 0 :this.tDot.hashCode()));
        result = ((result* 31)+((this.tDotStd == null)? 0 :this.tDotStd.hashCode()));
        result = ((result* 31)+((this.bPlaneXy == null)? 0 :this.bPlaneXy.hashCode()));
        result = ((result* 31)+((this.relativeSpeed == null)? 0 :this.relativeSpeed.hashCode()));
        result = ((result* 31)+((this.sat1HardBodyRadius == null)? 0 :this.sat1HardBodyRadius.hashCode()));
        result = ((result* 31)+((this.bPlaneXx == null)? 0 :this.bPlaneXx.hashCode()));
        result = ((result* 31)+((this.mahalanobisDistance == null)? 0 :this.mahalanobisDistance.hashCode()));
        result = ((result* 31)+((this.rDot == null)? 0 :this.rDot.hashCode()));
        result = ((result* 31)+((this.sat1CovarianceTScalingFactor == null)? 0 :this.sat1CovarianceTScalingFactor.hashCode()));
        result = ((result* 31)+((this.collisionProbabilityMethod == null)? 0 :this.collisionProbabilityMethod.hashCode()));
        result = ((result* 31)+((this.nDot == null)? 0 :this.nDot.hashCode()));
        result = ((result* 31)+((this.criticality == null)? 0 :this.criticality.hashCode()));
        result = ((result* 31)+((this.sat2CovarianceRScalingFactor == null)? 0 :this.sat2CovarianceRScalingFactor.hashCode()));
        result = ((result* 31)+((this.collisionProbability == null)? 0 :this.collisionProbability.hashCode()));
        result = ((result* 31)+((this.originator == null)? 0 :this.originator.hashCode()));
        result = ((result* 31)+((this.sat1CovarianceNScalingFactor == null)? 0 :this.sat1CovarianceNScalingFactor.hashCode()));
        result = ((result* 31)+((this.rDotStd == null)? 0 :this.rDotStd.hashCode()));
        result = ((result* 31)+((this.tca == null)? 0 :this.tca.hashCode()));
        result = ((result* 31)+((this.sat2CovarianceNScalingFactor == null)? 0 :this.sat2CovarianceNScalingFactor.hashCode()));
        result = ((result* 31)+((this.basedOn == null)? 0 :this.basedOn.hashCode()));
        result = ((result* 31)+((this.sat1CovarianceRScalingFactor == null)? 0 :this.sat1CovarianceRScalingFactor.hashCode()));
        result = ((result* 31)+((this.sat1StateAtTca == null)? 0 :this.sat1StateAtTca.hashCode()));
        result = ((result* 31)+((this.nDotStd == null)? 0 :this.nDotStd.hashCode()));
        result = ((result* 31)+((this.bPlaneYy == null)? 0 :this.bPlaneYy.hashCode()));
        result = ((result* 31)+((this.bPlaneYx == null)? 0 :this.bPlaneYx.hashCode()));
        result = ((result* 31)+((this.rStd == null)? 0 :this.rStd.hashCode()));
        result = ((result* 31)+((this.nStd == null)? 0 :this.nStd.hashCode()));
        result = ((result* 31)+((this.missDistance == null)? 0 :this.missDistance.hashCode()));
        result = ((result* 31)+((this.riskEstimationId == null)? 0 :this.riskEstimationId.hashCode()));
        result = ((result* 31)+((this.creationDate == null)? 0 :this.creationDate.hashCode()));
        result = ((result* 31)+((this.sat2HardBodyRadius == null)? 0 :this.sat2HardBodyRadius.hashCode()));
        result = ((result* 31)+((this.n == null)? 0 :this.n.hashCode()));
        result = ((result* 31)+((this.sat2StateAtTca == null)? 0 :this.sat2StateAtTca.hashCode()));
        result = ((result* 31)+((this.r == null)? 0 :this.r.hashCode()));
        result = ((result* 31)+((this.suggested == null)? 0 :this.suggested.hashCode()));
        result = ((result* 31)+((this.t == null)? 0 :this.t.hashCode()));
        result = ((result* 31)+((this.sat2CovarianceTScalingFactor == null)? 0 :this.sat2CovarianceTScalingFactor.hashCode()));
        result = ((result* 31)+((this.bPlaneX == null)? 0 :this.bPlaneX.hashCode()));
        result = ((result* 31)+((this.tStd == null)? 0 :this.tStd.hashCode()));
        result = ((result* 31)+((this.bPlaneY == null)? 0 :this.bPlaneY.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RiskEstimation) == false) {
            return false;
        }
        RiskEstimation rhs = ((RiskEstimation) other);
        return ((((((((((((((((((((((((((((((((((((((((((this.tDot == rhs.tDot)||((this.tDot!= null)&&this.tDot.equals(rhs.tDot)))&&((this.tDotStd == rhs.tDotStd)||((this.tDotStd!= null)&&this.tDotStd.equals(rhs.tDotStd))))&&((this.bPlaneXy == rhs.bPlaneXy)||((this.bPlaneXy!= null)&&this.bPlaneXy.equals(rhs.bPlaneXy))))&&((this.relativeSpeed == rhs.relativeSpeed)||((this.relativeSpeed!= null)&&this.relativeSpeed.equals(rhs.relativeSpeed))))&&((this.sat1HardBodyRadius == rhs.sat1HardBodyRadius)||((this.sat1HardBodyRadius!= null)&&this.sat1HardBodyRadius.equals(rhs.sat1HardBodyRadius))))&&((this.bPlaneXx == rhs.bPlaneXx)||((this.bPlaneXx!= null)&&this.bPlaneXx.equals(rhs.bPlaneXx))))&&((this.mahalanobisDistance == rhs.mahalanobisDistance)||((this.mahalanobisDistance!= null)&&this.mahalanobisDistance.equals(rhs.mahalanobisDistance))))&&((this.rDot == rhs.rDot)||((this.rDot!= null)&&this.rDot.equals(rhs.rDot))))&&((this.sat1CovarianceTScalingFactor == rhs.sat1CovarianceTScalingFactor)||((this.sat1CovarianceTScalingFactor!= null)&&this.sat1CovarianceTScalingFactor.equals(rhs.sat1CovarianceTScalingFactor))))&&((this.collisionProbabilityMethod == rhs.collisionProbabilityMethod)||((this.collisionProbabilityMethod!= null)&&this.collisionProbabilityMethod.equals(rhs.collisionProbabilityMethod))))&&((this.nDot == rhs.nDot)||((this.nDot!= null)&&this.nDot.equals(rhs.nDot))))&&((this.criticality == rhs.criticality)||((this.criticality!= null)&&this.criticality.equals(rhs.criticality))))&&((this.sat2CovarianceRScalingFactor == rhs.sat2CovarianceRScalingFactor)||((this.sat2CovarianceRScalingFactor!= null)&&this.sat2CovarianceRScalingFactor.equals(rhs.sat2CovarianceRScalingFactor))))&&((this.collisionProbability == rhs.collisionProbability)||((this.collisionProbability!= null)&&this.collisionProbability.equals(rhs.collisionProbability))))&&((this.originator == rhs.originator)||((this.originator!= null)&&this.originator.equals(rhs.originator))))&&((this.sat1CovarianceNScalingFactor == rhs.sat1CovarianceNScalingFactor)||((this.sat1CovarianceNScalingFactor!= null)&&this.sat1CovarianceNScalingFactor.equals(rhs.sat1CovarianceNScalingFactor))))&&((this.rDotStd == rhs.rDotStd)||((this.rDotStd!= null)&&this.rDotStd.equals(rhs.rDotStd))))&&((this.tca == rhs.tca)||((this.tca!= null)&&this.tca.equals(rhs.tca))))&&((this.sat2CovarianceNScalingFactor == rhs.sat2CovarianceNScalingFactor)||((this.sat2CovarianceNScalingFactor!= null)&&this.sat2CovarianceNScalingFactor.equals(rhs.sat2CovarianceNScalingFactor))))&&((this.basedOn == rhs.basedOn)||((this.basedOn!= null)&&this.basedOn.equals(rhs.basedOn))))&&((this.sat1CovarianceRScalingFactor == rhs.sat1CovarianceRScalingFactor)||((this.sat1CovarianceRScalingFactor!= null)&&this.sat1CovarianceRScalingFactor.equals(rhs.sat1CovarianceRScalingFactor))))&&((this.sat1StateAtTca == rhs.sat1StateAtTca)||((this.sat1StateAtTca!= null)&&this.sat1StateAtTca.equals(rhs.sat1StateAtTca))))&&((this.nDotStd == rhs.nDotStd)||((this.nDotStd!= null)&&this.nDotStd.equals(rhs.nDotStd))))&&((this.bPlaneYy == rhs.bPlaneYy)||((this.bPlaneYy!= null)&&this.bPlaneYy.equals(rhs.bPlaneYy))))&&((this.bPlaneYx == rhs.bPlaneYx)||((this.bPlaneYx!= null)&&this.bPlaneYx.equals(rhs.bPlaneYx))))&&((this.rStd == rhs.rStd)||((this.rStd!= null)&&this.rStd.equals(rhs.rStd))))&&((this.nStd == rhs.nStd)||((this.nStd!= null)&&this.nStd.equals(rhs.nStd))))&&((this.missDistance == rhs.missDistance)||((this.missDistance!= null)&&this.missDistance.equals(rhs.missDistance))))&&((this.riskEstimationId == rhs.riskEstimationId)||((this.riskEstimationId!= null)&&this.riskEstimationId.equals(rhs.riskEstimationId))))&&((this.creationDate == rhs.creationDate)||((this.creationDate!= null)&&this.creationDate.equals(rhs.creationDate))))&&((this.sat2HardBodyRadius == rhs.sat2HardBodyRadius)||((this.sat2HardBodyRadius!= null)&&this.sat2HardBodyRadius.equals(rhs.sat2HardBodyRadius))))&&((this.n == rhs.n)||((this.n!= null)&&this.n.equals(rhs.n))))&&((this.sat2StateAtTca == rhs.sat2StateAtTca)||((this.sat2StateAtTca!= null)&&this.sat2StateAtTca.equals(rhs.sat2StateAtTca))))&&((this.r == rhs.r)||((this.r!= null)&&this.r.equals(rhs.r))))&&((this.suggested == rhs.suggested)||((this.suggested!= null)&&this.suggested.equals(rhs.suggested))))&&((this.t == rhs.t)||((this.t!= null)&&this.t.equals(rhs.t))))&&((this.sat2CovarianceTScalingFactor == rhs.sat2CovarianceTScalingFactor)||((this.sat2CovarianceTScalingFactor!= null)&&this.sat2CovarianceTScalingFactor.equals(rhs.sat2CovarianceTScalingFactor))))&&((this.bPlaneX == rhs.bPlaneX)||((this.bPlaneX!= null)&&this.bPlaneX.equals(rhs.bPlaneX))))&&((this.tStd == rhs.tStd)||((this.tStd!= null)&&this.tStd.equals(rhs.tStd))))&&((this.bPlaneY == rhs.bPlaneY)||((this.bPlaneY!= null)&&this.bPlaneY.equals(rhs.bPlaneY))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))));
    }

}
