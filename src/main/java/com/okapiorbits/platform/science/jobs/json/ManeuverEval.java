
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ManeuverEval
 * <p>
 * A maneuver evaluation
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strategy_number",
    "strategy_name",
    "maneuver_file",
    "new_risk_estimation",
    "thrust_total",
    "suggested"
})
public class ManeuverEval {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("strategy_number")
    private Integer strategyNumber;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("strategy_name")
    private String strategyName;
    /**
     * CcsdsOpm
     * <p>
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
     * (Required)
     * 
     */
    @JsonProperty("maneuver_file")
    @JsonPropertyDescription("A request for the execution of an OKAPI service. It contains the actual request data in its \"data\" attribute. This is also the schema of MongoDB collection \"service_requests\"")
    private CcsdsOpm maneuverFile;
    /**
     * RiskEstimation
     * <p>
     * A request to execute an orbit propagation with an arbitrary orbit propagator
     * 
     */
    @JsonProperty("new_risk_estimation")
    @JsonPropertyDescription("A request to execute an orbit propagation with an arbitrary orbit propagator")
    private RiskEstimation newRiskEstimation;
    /**
     * Total thrust required (dV), in m/s
     * 
     */
    @JsonProperty("thrust_total")
    @JsonPropertyDescription("Total thrust required (dV), in m/s")
    private Double thrustTotal;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("suggested")
    private Boolean suggested;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("strategy_number")
    public Integer getStrategyNumber() {
        return strategyNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("strategy_number")
    public void setStrategyNumber(Integer strategyNumber) {
        this.strategyNumber = strategyNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("strategy_name")
    public String getStrategyName() {
        return strategyName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("strategy_name")
    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    /**
     * CcsdsOpm
     * <p>
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
     * (Required)
     * 
     */
    @JsonProperty("maneuver_file")
    public CcsdsOpm getManeuverFile() {
        return maneuverFile;
    }

    /**
     * CcsdsOpm
     * <p>
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
     * (Required)
     * 
     */
    @JsonProperty("maneuver_file")
    public void setManeuverFile(CcsdsOpm maneuverFile) {
        this.maneuverFile = maneuverFile;
    }

    /**
     * RiskEstimation
     * <p>
     * A request to execute an orbit propagation with an arbitrary orbit propagator
     * 
     */
    @JsonProperty("new_risk_estimation")
    public RiskEstimation getNewRiskEstimation() {
        return newRiskEstimation;
    }

    /**
     * RiskEstimation
     * <p>
     * A request to execute an orbit propagation with an arbitrary orbit propagator
     * 
     */
    @JsonProperty("new_risk_estimation")
    public void setNewRiskEstimation(RiskEstimation newRiskEstimation) {
        this.newRiskEstimation = newRiskEstimation;
    }

    /**
     * Total thrust required (dV), in m/s
     * 
     */
    @JsonProperty("thrust_total")
    public Double getThrustTotal() {
        return thrustTotal;
    }

    /**
     * Total thrust required (dV), in m/s
     * 
     */
    @JsonProperty("thrust_total")
    public void setThrustTotal(Double thrustTotal) {
        this.thrustTotal = thrustTotal;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("suggested")
    public Boolean getSuggested() {
        return suggested;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("suggested")
    public void setSuggested(Boolean suggested) {
        this.suggested = suggested;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ManeuverEval.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("strategyNumber");
        sb.append('=');
        sb.append(((this.strategyNumber == null)?"<null>":this.strategyNumber));
        sb.append(',');
        sb.append("strategyName");
        sb.append('=');
        sb.append(((this.strategyName == null)?"<null>":this.strategyName));
        sb.append(',');
        sb.append("maneuverFile");
        sb.append('=');
        sb.append(((this.maneuverFile == null)?"<null>":this.maneuverFile));
        sb.append(',');
        sb.append("newRiskEstimation");
        sb.append('=');
        sb.append(((this.newRiskEstimation == null)?"<null>":this.newRiskEstimation));
        sb.append(',');
        sb.append("thrustTotal");
        sb.append('=');
        sb.append(((this.thrustTotal == null)?"<null>":this.thrustTotal));
        sb.append(',');
        sb.append("suggested");
        sb.append('=');
        sb.append(((this.suggested == null)?"<null>":this.suggested));
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
        result = ((result* 31)+((this.thrustTotal == null)? 0 :this.thrustTotal.hashCode()));
        result = ((result* 31)+((this.strategyName == null)? 0 :this.strategyName.hashCode()));
        result = ((result* 31)+((this.suggested == null)? 0 :this.suggested.hashCode()));
        result = ((result* 31)+((this.maneuverFile == null)? 0 :this.maneuverFile.hashCode()));
        result = ((result* 31)+((this.newRiskEstimation == null)? 0 :this.newRiskEstimation.hashCode()));
        result = ((result* 31)+((this.strategyNumber == null)? 0 :this.strategyNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManeuverEval) == false) {
            return false;
        }
        ManeuverEval rhs = ((ManeuverEval) other);
        return (((((((this.thrustTotal == rhs.thrustTotal)||((this.thrustTotal!= null)&&this.thrustTotal.equals(rhs.thrustTotal)))&&((this.strategyName == rhs.strategyName)||((this.strategyName!= null)&&this.strategyName.equals(rhs.strategyName))))&&((this.suggested == rhs.suggested)||((this.suggested!= null)&&this.suggested.equals(rhs.suggested))))&&((this.maneuverFile == rhs.maneuverFile)||((this.maneuverFile!= null)&&this.maneuverFile.equals(rhs.maneuverFile))))&&((this.newRiskEstimation == rhs.newRiskEstimation)||((this.newRiskEstimation!= null)&&this.newRiskEstimation.equals(rhs.newRiskEstimation))))&&((this.strategyNumber == rhs.strategyNumber)||((this.strategyNumber!= null)&&this.strategyNumber.equals(rhs.strategyNumber))));
    }

}
