
package com.okapiorbits.platform.science.jobs.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * RiskPrediction
 * <p>
 * A risk prediction with a risk trend (series of collision probabilities), the peak risk, miss vector and risk classification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "creation_date",
    "originator",
    "tca",
    "collision_probability",
    "collision_probability_method",
    "approx_peak_risk",
    "time_of_peak_risk",
    "risk_trend",
    "miss_distance",
    "relative_speed",
    "r",
    "t",
    "n",
    "r_dot",
    "t_dot",
    "n_dot",
    "sat1_covariance_r_scaling_factor",
    "sat1_covariance_t_scaling_factor",
    "sat1_covariance_n_scaling_factor",
    "sat2_covariance_r_scaling_factor",
    "sat2_covariance_t_scaling_factor",
    "sat2_covariance_n_scaling_factor",
    "criticality"
})
public class RiskPrediction {

    /**
     * Date and time of the creation of this message
     * (Required)
     * 
     */
    @JsonProperty("creation_date")
    @JsonPropertyDescription("Date and time of the creation of this message")
    private String creationDate;
    /**
     * Identifies where the message originated from
     * (Required)
     * 
     */
    @JsonProperty("originator")
    @JsonPropertyDescription("Identifies where the message originated from")
    private String originator;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("tca")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private Date tca;
    /**
     * Probability of collision at TCA
     * (Required)
     * 
     */
    @JsonProperty("collision_probability")
    @JsonPropertyDescription("Probability of collision at TCA")
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
     * Peak collision probability in the trend
     * (Required)
     * 
     */
    @JsonProperty("approx_peak_risk")
    @JsonPropertyDescription("Peak collision probability in the trend")
    private Double approxPeakRisk;
    /**
     * Date and time of peak collision probability
     * (Required)
     * 
     */
    @JsonProperty("time_of_peak_risk")
    @JsonPropertyDescription("Date and time of peak collision probability")
    private String timeOfPeakRisk;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("risk_trend")
    private List<RiskAtTca> riskTrend = new ArrayList<RiskAtTca>();
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
     * Covariance R component scaling factor used for object 1 / -
     * 
     */
    @JsonProperty("sat1_covariance_r_scaling_factor")
    @JsonPropertyDescription("Covariance R component scaling factor used for object 1 / -")
    private Double sat1CovarianceRScalingFactor;
    /**
     * Covariance T component scaling factor used for object 1 / -
     * 
     */
    @JsonProperty("sat1_covariance_t_scaling_factor")
    @JsonPropertyDescription("Covariance T component scaling factor used for object 1 / -")
    private Double sat1CovarianceTScalingFactor;
    /**
     * Covariance N component scaling factor used for object 1 / -
     * 
     */
    @JsonProperty("sat1_covariance_n_scaling_factor")
    @JsonPropertyDescription("Covariance N component scaling factor used for object 1 / -")
    private Double sat1CovarianceNScalingFactor;
    /**
     * Covariance R component scaling factor used for object 2 / -
     * 
     */
    @JsonProperty("sat2_covariance_r_scaling_factor")
    @JsonPropertyDescription("Covariance R component scaling factor used for object 2 / -")
    private Double sat2CovarianceRScalingFactor;
    /**
     * Covariance T component scaling factor used for object 2 / -
     * 
     */
    @JsonProperty("sat2_covariance_t_scaling_factor")
    @JsonPropertyDescription("Covariance T component scaling factor used for object 2 / -")
    private Double sat2CovarianceTScalingFactor;
    /**
     * Covariance N component scaling factor used for object 2 / -
     * 
     */
    @JsonProperty("sat2_covariance_n_scaling_factor")
    @JsonPropertyDescription("Covariance N component scaling factor used for object 2 / -")
    private Double sat2CovarianceNScalingFactor;
    /**
     * Criticality of the analyzed conjunction
     * 
     */
    @JsonProperty("criticality")
    @JsonPropertyDescription("Criticality of the analyzed conjunction")
    private RiskPrediction.Criticality criticality;

    /**
     * Date and time of the creation of this message
     * (Required)
     * 
     */
    @JsonProperty("creation_date")
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Date and time of the creation of this message
     * (Required)
     * 
     */
    @JsonProperty("creation_date")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Identifies where the message originated from
     * (Required)
     * 
     */
    @JsonProperty("originator")
    public String getOriginator() {
        return originator;
    }

    /**
     * Identifies where the message originated from
     * (Required)
     * 
     */
    @JsonProperty("originator")
    public void setOriginator(String originator) {
        this.originator = originator;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("tca")
    public Date getTca() {
        return tca;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("tca")
    public void setTca(Date tca) {
        this.tca = tca;
    }

    /**
     * Probability of collision at TCA
     * (Required)
     * 
     */
    @JsonProperty("collision_probability")
    public Double getCollisionProbability() {
        return collisionProbability;
    }

    /**
     * Probability of collision at TCA
     * (Required)
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
     * Peak collision probability in the trend
     * (Required)
     * 
     */
    @JsonProperty("approx_peak_risk")
    public Double getApproxPeakRisk() {
        return approxPeakRisk;
    }

    /**
     * Peak collision probability in the trend
     * (Required)
     * 
     */
    @JsonProperty("approx_peak_risk")
    public void setApproxPeakRisk(Double approxPeakRisk) {
        this.approxPeakRisk = approxPeakRisk;
    }

    /**
     * Date and time of peak collision probability
     * (Required)
     * 
     */
    @JsonProperty("time_of_peak_risk")
    public String getTimeOfPeakRisk() {
        return timeOfPeakRisk;
    }

    /**
     * Date and time of peak collision probability
     * (Required)
     * 
     */
    @JsonProperty("time_of_peak_risk")
    public void setTimeOfPeakRisk(String timeOfPeakRisk) {
        this.timeOfPeakRisk = timeOfPeakRisk;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("risk_trend")
    public List<RiskAtTca> getRiskTrend() {
        return riskTrend;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("risk_trend")
    public void setRiskTrend(List<RiskAtTca> riskTrend) {
        this.riskTrend = riskTrend;
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
     * Covariance R component scaling factor used for object 1 / -
     * 
     */
    @JsonProperty("sat1_covariance_r_scaling_factor")
    public Double getSat1CovarianceRScalingFactor() {
        return sat1CovarianceRScalingFactor;
    }

    /**
     * Covariance R component scaling factor used for object 1 / -
     * 
     */
    @JsonProperty("sat1_covariance_r_scaling_factor")
    public void setSat1CovarianceRScalingFactor(Double sat1CovarianceRScalingFactor) {
        this.sat1CovarianceRScalingFactor = sat1CovarianceRScalingFactor;
    }

    /**
     * Covariance T component scaling factor used for object 1 / -
     * 
     */
    @JsonProperty("sat1_covariance_t_scaling_factor")
    public Double getSat1CovarianceTScalingFactor() {
        return sat1CovarianceTScalingFactor;
    }

    /**
     * Covariance T component scaling factor used for object 1 / -
     * 
     */
    @JsonProperty("sat1_covariance_t_scaling_factor")
    public void setSat1CovarianceTScalingFactor(Double sat1CovarianceTScalingFactor) {
        this.sat1CovarianceTScalingFactor = sat1CovarianceTScalingFactor;
    }

    /**
     * Covariance N component scaling factor used for object 1 / -
     * 
     */
    @JsonProperty("sat1_covariance_n_scaling_factor")
    public Double getSat1CovarianceNScalingFactor() {
        return sat1CovarianceNScalingFactor;
    }

    /**
     * Covariance N component scaling factor used for object 1 / -
     * 
     */
    @JsonProperty("sat1_covariance_n_scaling_factor")
    public void setSat1CovarianceNScalingFactor(Double sat1CovarianceNScalingFactor) {
        this.sat1CovarianceNScalingFactor = sat1CovarianceNScalingFactor;
    }

    /**
     * Covariance R component scaling factor used for object 2 / -
     * 
     */
    @JsonProperty("sat2_covariance_r_scaling_factor")
    public Double getSat2CovarianceRScalingFactor() {
        return sat2CovarianceRScalingFactor;
    }

    /**
     * Covariance R component scaling factor used for object 2 / -
     * 
     */
    @JsonProperty("sat2_covariance_r_scaling_factor")
    public void setSat2CovarianceRScalingFactor(Double sat2CovarianceRScalingFactor) {
        this.sat2CovarianceRScalingFactor = sat2CovarianceRScalingFactor;
    }

    /**
     * Covariance T component scaling factor used for object 2 / -
     * 
     */
    @JsonProperty("sat2_covariance_t_scaling_factor")
    public Double getSat2CovarianceTScalingFactor() {
        return sat2CovarianceTScalingFactor;
    }

    /**
     * Covariance T component scaling factor used for object 2 / -
     * 
     */
    @JsonProperty("sat2_covariance_t_scaling_factor")
    public void setSat2CovarianceTScalingFactor(Double sat2CovarianceTScalingFactor) {
        this.sat2CovarianceTScalingFactor = sat2CovarianceTScalingFactor;
    }

    /**
     * Covariance N component scaling factor used for object 2 / -
     * 
     */
    @JsonProperty("sat2_covariance_n_scaling_factor")
    public Double getSat2CovarianceNScalingFactor() {
        return sat2CovarianceNScalingFactor;
    }

    /**
     * Covariance N component scaling factor used for object 2 / -
     * 
     */
    @JsonProperty("sat2_covariance_n_scaling_factor")
    public void setSat2CovarianceNScalingFactor(Double sat2CovarianceNScalingFactor) {
        this.sat2CovarianceNScalingFactor = sat2CovarianceNScalingFactor;
    }

    /**
     * Criticality of the analyzed conjunction
     * 
     */
    @JsonProperty("criticality")
    public RiskPrediction.Criticality getCriticality() {
        return criticality;
    }

    /**
     * Criticality of the analyzed conjunction
     * 
     */
    @JsonProperty("criticality")
    public void setCriticality(RiskPrediction.Criticality criticality) {
        this.criticality = criticality;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RiskPrediction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("approxPeakRisk");
        sb.append('=');
        sb.append(((this.approxPeakRisk == null)?"<null>":this.approxPeakRisk));
        sb.append(',');
        sb.append("timeOfPeakRisk");
        sb.append('=');
        sb.append(((this.timeOfPeakRisk == null)?"<null>":this.timeOfPeakRisk));
        sb.append(',');
        sb.append("riskTrend");
        sb.append('=');
        sb.append(((this.riskTrend == null)?"<null>":this.riskTrend));
        sb.append(',');
        sb.append("missDistance");
        sb.append('=');
        sb.append(((this.missDistance == null)?"<null>":this.missDistance));
        sb.append(',');
        sb.append("relativeSpeed");
        sb.append('=');
        sb.append(((this.relativeSpeed == null)?"<null>":this.relativeSpeed));
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
        sb.append("criticality");
        sb.append('=');
        sb.append(((this.criticality == null)?"<null>":this.criticality));
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
        result = ((result* 31)+((this.relativeSpeed == null)? 0 :this.relativeSpeed.hashCode()));
        result = ((result* 31)+((this.riskTrend == null)? 0 :this.riskTrend.hashCode()));
        result = ((result* 31)+((this.rDot == null)? 0 :this.rDot.hashCode()));
        result = ((result* 31)+((this.sat1CovarianceTScalingFactor == null)? 0 :this.sat1CovarianceTScalingFactor.hashCode()));
        result = ((result* 31)+((this.collisionProbabilityMethod == null)? 0 :this.collisionProbabilityMethod.hashCode()));
        result = ((result* 31)+((this.nDot == null)? 0 :this.nDot.hashCode()));
        result = ((result* 31)+((this.criticality == null)? 0 :this.criticality.hashCode()));
        result = ((result* 31)+((this.missDistance == null)? 0 :this.missDistance.hashCode()));
        result = ((result* 31)+((this.sat2CovarianceRScalingFactor == null)? 0 :this.sat2CovarianceRScalingFactor.hashCode()));
        result = ((result* 31)+((this.collisionProbability == null)? 0 :this.collisionProbability.hashCode()));
        result = ((result* 31)+((this.originator == null)? 0 :this.originator.hashCode()));
        result = ((result* 31)+((this.creationDate == null)? 0 :this.creationDate.hashCode()));
        result = ((result* 31)+((this.sat1CovarianceNScalingFactor == null)? 0 :this.sat1CovarianceNScalingFactor.hashCode()));
        result = ((result* 31)+((this.n == null)? 0 :this.n.hashCode()));
        result = ((result* 31)+((this.r == null)? 0 :this.r.hashCode()));
        result = ((result* 31)+((this.tca == null)? 0 :this.tca.hashCode()));
        result = ((result* 31)+((this.approxPeakRisk == null)? 0 :this.approxPeakRisk.hashCode()));
        result = ((result* 31)+((this.t == null)? 0 :this.t.hashCode()));
        result = ((result* 31)+((this.sat2CovarianceTScalingFactor == null)? 0 :this.sat2CovarianceTScalingFactor.hashCode()));
        result = ((result* 31)+((this.sat2CovarianceNScalingFactor == null)? 0 :this.sat2CovarianceNScalingFactor.hashCode()));
        result = ((result* 31)+((this.timeOfPeakRisk == null)? 0 :this.timeOfPeakRisk.hashCode()));
        result = ((result* 31)+((this.sat1CovarianceRScalingFactor == null)? 0 :this.sat1CovarianceRScalingFactor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RiskPrediction) == false) {
            return false;
        }
        RiskPrediction rhs = ((RiskPrediction) other);
        return ((((((((((((((((((((((((this.tDot == rhs.tDot)||((this.tDot!= null)&&this.tDot.equals(rhs.tDot)))&&((this.relativeSpeed == rhs.relativeSpeed)||((this.relativeSpeed!= null)&&this.relativeSpeed.equals(rhs.relativeSpeed))))&&((this.riskTrend == rhs.riskTrend)||((this.riskTrend!= null)&&this.riskTrend.equals(rhs.riskTrend))))&&((this.rDot == rhs.rDot)||((this.rDot!= null)&&this.rDot.equals(rhs.rDot))))&&((this.sat1CovarianceTScalingFactor == rhs.sat1CovarianceTScalingFactor)||((this.sat1CovarianceTScalingFactor!= null)&&this.sat1CovarianceTScalingFactor.equals(rhs.sat1CovarianceTScalingFactor))))&&((this.collisionProbabilityMethod == rhs.collisionProbabilityMethod)||((this.collisionProbabilityMethod!= null)&&this.collisionProbabilityMethod.equals(rhs.collisionProbabilityMethod))))&&((this.nDot == rhs.nDot)||((this.nDot!= null)&&this.nDot.equals(rhs.nDot))))&&((this.criticality == rhs.criticality)||((this.criticality!= null)&&this.criticality.equals(rhs.criticality))))&&((this.missDistance == rhs.missDistance)||((this.missDistance!= null)&&this.missDistance.equals(rhs.missDistance))))&&((this.sat2CovarianceRScalingFactor == rhs.sat2CovarianceRScalingFactor)||((this.sat2CovarianceRScalingFactor!= null)&&this.sat2CovarianceRScalingFactor.equals(rhs.sat2CovarianceRScalingFactor))))&&((this.collisionProbability == rhs.collisionProbability)||((this.collisionProbability!= null)&&this.collisionProbability.equals(rhs.collisionProbability))))&&((this.originator == rhs.originator)||((this.originator!= null)&&this.originator.equals(rhs.originator))))&&((this.creationDate == rhs.creationDate)||((this.creationDate!= null)&&this.creationDate.equals(rhs.creationDate))))&&((this.sat1CovarianceNScalingFactor == rhs.sat1CovarianceNScalingFactor)||((this.sat1CovarianceNScalingFactor!= null)&&this.sat1CovarianceNScalingFactor.equals(rhs.sat1CovarianceNScalingFactor))))&&((this.n == rhs.n)||((this.n!= null)&&this.n.equals(rhs.n))))&&((this.r == rhs.r)||((this.r!= null)&&this.r.equals(rhs.r))))&&((this.tca == rhs.tca)||((this.tca!= null)&&this.tca.equals(rhs.tca))))&&((this.approxPeakRisk == rhs.approxPeakRisk)||((this.approxPeakRisk!= null)&&this.approxPeakRisk.equals(rhs.approxPeakRisk))))&&((this.t == rhs.t)||((this.t!= null)&&this.t.equals(rhs.t))))&&((this.sat2CovarianceTScalingFactor == rhs.sat2CovarianceTScalingFactor)||((this.sat2CovarianceTScalingFactor!= null)&&this.sat2CovarianceTScalingFactor.equals(rhs.sat2CovarianceTScalingFactor))))&&((this.sat2CovarianceNScalingFactor == rhs.sat2CovarianceNScalingFactor)||((this.sat2CovarianceNScalingFactor!= null)&&this.sat2CovarianceNScalingFactor.equals(rhs.sat2CovarianceNScalingFactor))))&&((this.timeOfPeakRisk == rhs.timeOfPeakRisk)||((this.timeOfPeakRisk!= null)&&this.timeOfPeakRisk.equals(rhs.timeOfPeakRisk))))&&((this.sat1CovarianceRScalingFactor == rhs.sat1CovarianceRScalingFactor)||((this.sat1CovarianceRScalingFactor!= null)&&this.sat1CovarianceRScalingFactor.equals(rhs.sat1CovarianceRScalingFactor))));
    }


    /**
     * Criticality of the analyzed conjunction
     * 
     */
    public enum Criticality {

        NON_CRITICAL("non_critical"),
        OBSERVE("observe"),
        CRITICAL("critical");
        private final String value;
        private final static Map<String, RiskPrediction.Criticality> CONSTANTS = new HashMap<String, RiskPrediction.Criticality>();

        static {
            for (RiskPrediction.Criticality c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Criticality(String value) {
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
        public static RiskPrediction.Criticality fromValue(String value) {
            RiskPrediction.Criticality constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
