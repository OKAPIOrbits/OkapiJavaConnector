
package com.okapiorbits.platform.science.jobs.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    "suggested",
    "dismissed",
    "comment"
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
     * Defintition of the CCSDS OPM, with one header, meta data and data section.
     * (Required)
     * 
     */
    @JsonProperty("maneuver_file")
    @JsonPropertyDescription("Defintition of the CCSDS OPM, with one header, meta data and data section.")
    private CcsdsOpm maneuverFile;
    /**
     * RiskEstimation
     * <p>
     * A risk estimation with the Time of Closest Approach (TCA), collision probability, the associated method, miss vector and covariance scaling factors. In addition, a risk classification is available.
     * 
     */
    @JsonProperty("new_risk_estimation")
    @JsonPropertyDescription("A risk estimation with the Time of Closest Approach (TCA), collision probability, the associated method, miss vector and covariance scaling factors. In addition, a risk classification is available.")
    private RiskEstimation newRiskEstimation;
    /**
     * Required delta-V (dV), in m/s
     * 
     */
    @JsonProperty("thrust_total")
    @JsonPropertyDescription("Required delta-V (dV), in m/s")
    private Double thrustTotal;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("suggested")
    private Boolean suggested;
    @JsonProperty("dismissed")
    private Boolean dismissed;
    @JsonProperty("comment")
    private String comment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * Defintition of the CCSDS OPM, with one header, meta data and data section.
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
     * Defintition of the CCSDS OPM, with one header, meta data and data section.
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
     * A risk estimation with the Time of Closest Approach (TCA), collision probability, the associated method, miss vector and covariance scaling factors. In addition, a risk classification is available.
     * 
     */
    @JsonProperty("new_risk_estimation")
    public RiskEstimation getNewRiskEstimation() {
        return newRiskEstimation;
    }

    /**
     * RiskEstimation
     * <p>
     * A risk estimation with the Time of Closest Approach (TCA), collision probability, the associated method, miss vector and covariance scaling factors. In addition, a risk classification is available.
     * 
     */
    @JsonProperty("new_risk_estimation")
    public void setNewRiskEstimation(RiskEstimation newRiskEstimation) {
        this.newRiskEstimation = newRiskEstimation;
    }

    /**
     * Required delta-V (dV), in m/s
     * 
     */
    @JsonProperty("thrust_total")
    public Double getThrustTotal() {
        return thrustTotal;
    }

    /**
     * Required delta-V (dV), in m/s
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

    @JsonProperty("dismissed")
    public Boolean getDismissed() {
        return dismissed;
    }

    @JsonProperty("dismissed")
    public void setDismissed(Boolean dismissed) {
        this.dismissed = dismissed;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
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
        sb.append("dismissed");
        sb.append('=');
        sb.append(((this.dismissed == null)?"<null>":this.dismissed));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.dismissed == null)? 0 :this.dismissed.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        return ((((((((((this.thrustTotal == rhs.thrustTotal)||((this.thrustTotal!= null)&&this.thrustTotal.equals(rhs.thrustTotal)))&&((this.strategyName == rhs.strategyName)||((this.strategyName!= null)&&this.strategyName.equals(rhs.strategyName))))&&((this.suggested == rhs.suggested)||((this.suggested!= null)&&this.suggested.equals(rhs.suggested))))&&((this.maneuverFile == rhs.maneuverFile)||((this.maneuverFile!= null)&&this.maneuverFile.equals(rhs.maneuverFile))))&&((this.newRiskEstimation == rhs.newRiskEstimation)||((this.newRiskEstimation!= null)&&this.newRiskEstimation.equals(rhs.newRiskEstimation))))&&((this.dismissed == rhs.dismissed)||((this.dismissed!= null)&&this.dismissed.equals(rhs.dismissed))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.strategyNumber == rhs.strategyNumber)||((this.strategyNumber!= null)&&this.strategyNumber.equals(rhs.strategyNumber))));
    }

}
