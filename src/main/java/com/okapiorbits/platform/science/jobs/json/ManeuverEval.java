
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ManeuverEval
 * <p>
 * A maneuver evaluation, giving the required velocity and a new risk estimation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strategy_number",
    "strategy_name",
    "maneuver_file",
    "new_risk_estimation",
    "new_risk_prediction",
    "thrust_total",
    "delta_sma",
    "suggested",
    "dismissed",
    "comment",
    "candidates_checked"
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
     * RiskPrediction
     * <p>
     * A risk prediction with a risk trend (series of collision probabilities), the peak risk, miss vector and risk classification.
     * 
     */
    @JsonProperty("new_risk_prediction")
    @JsonPropertyDescription("A risk prediction with a risk trend (series of collision probabilities), the peak risk, miss vector and risk classification.")
    private RiskPrediction newRiskPrediction;
    /**
     * Required velocity change (dV) / in m/s
     * 
     */
    @JsonProperty("thrust_total")
    @JsonPropertyDescription("Required velocity change (dV) / in m/s")
    private Double thrustTotal;
    /**
     * Change of the semi-major axis / in km
     * 
     */
    @JsonProperty("delta_sma")
    @JsonPropertyDescription("Change of the semi-major axis / in km")
    private Double deltaSma;
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
    @JsonProperty("candidates_checked")
    private Integer candidatesChecked;

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
     * RiskPrediction
     * <p>
     * A risk prediction with a risk trend (series of collision probabilities), the peak risk, miss vector and risk classification.
     * 
     */
    @JsonProperty("new_risk_prediction")
    public RiskPrediction getNewRiskPrediction() {
        return newRiskPrediction;
    }

    /**
     * RiskPrediction
     * <p>
     * A risk prediction with a risk trend (series of collision probabilities), the peak risk, miss vector and risk classification.
     * 
     */
    @JsonProperty("new_risk_prediction")
    public void setNewRiskPrediction(RiskPrediction newRiskPrediction) {
        this.newRiskPrediction = newRiskPrediction;
    }

    /**
     * Required velocity change (dV) / in m/s
     * 
     */
    @JsonProperty("thrust_total")
    public Double getThrustTotal() {
        return thrustTotal;
    }

    /**
     * Required velocity change (dV) / in m/s
     * 
     */
    @JsonProperty("thrust_total")
    public void setThrustTotal(Double thrustTotal) {
        this.thrustTotal = thrustTotal;
    }

    /**
     * Change of the semi-major axis / in km
     * 
     */
    @JsonProperty("delta_sma")
    public Double getDeltaSma() {
        return deltaSma;
    }

    /**
     * Change of the semi-major axis / in km
     * 
     */
    @JsonProperty("delta_sma")
    public void setDeltaSma(Double deltaSma) {
        this.deltaSma = deltaSma;
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

    @JsonProperty("candidates_checked")
    public Integer getCandidatesChecked() {
        return candidatesChecked;
    }

    @JsonProperty("candidates_checked")
    public void setCandidatesChecked(Integer candidatesChecked) {
        this.candidatesChecked = candidatesChecked;
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
        sb.append("newRiskPrediction");
        sb.append('=');
        sb.append(((this.newRiskPrediction == null)?"<null>":this.newRiskPrediction));
        sb.append(',');
        sb.append("thrustTotal");
        sb.append('=');
        sb.append(((this.thrustTotal == null)?"<null>":this.thrustTotal));
        sb.append(',');
        sb.append("deltaSma");
        sb.append('=');
        sb.append(((this.deltaSma == null)?"<null>":this.deltaSma));
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
        sb.append("candidatesChecked");
        sb.append('=');
        sb.append(((this.candidatesChecked == null)?"<null>":this.candidatesChecked));
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
        result = ((result* 31)+((this.newRiskPrediction == null)? 0 :this.newRiskPrediction.hashCode()));
        result = ((result* 31)+((this.maneuverFile == null)? 0 :this.maneuverFile.hashCode()));
        result = ((result* 31)+((this.newRiskEstimation == null)? 0 :this.newRiskEstimation.hashCode()));
        result = ((result* 31)+((this.dismissed == null)? 0 :this.dismissed.hashCode()));
        result = ((result* 31)+((this.candidatesChecked == null)? 0 :this.candidatesChecked.hashCode()));
        result = ((result* 31)+((this.deltaSma == null)? 0 :this.deltaSma.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
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
        return ((((((((((((this.thrustTotal == rhs.thrustTotal)||((this.thrustTotal!= null)&&this.thrustTotal.equals(rhs.thrustTotal)))&&((this.strategyName == rhs.strategyName)||((this.strategyName!= null)&&this.strategyName.equals(rhs.strategyName))))&&((this.suggested == rhs.suggested)||((this.suggested!= null)&&this.suggested.equals(rhs.suggested))))&&((this.newRiskPrediction == rhs.newRiskPrediction)||((this.newRiskPrediction!= null)&&this.newRiskPrediction.equals(rhs.newRiskPrediction))))&&((this.maneuverFile == rhs.maneuverFile)||((this.maneuverFile!= null)&&this.maneuverFile.equals(rhs.maneuverFile))))&&((this.newRiskEstimation == rhs.newRiskEstimation)||((this.newRiskEstimation!= null)&&this.newRiskEstimation.equals(rhs.newRiskEstimation))))&&((this.dismissed == rhs.dismissed)||((this.dismissed!= null)&&this.dismissed.equals(rhs.dismissed))))&&((this.candidatesChecked == rhs.candidatesChecked)||((this.candidatesChecked!= null)&&this.candidatesChecked.equals(rhs.candidatesChecked))))&&((this.deltaSma == rhs.deltaSma)||((this.deltaSma!= null)&&this.deltaSma.equals(rhs.deltaSma))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.strategyNumber == rhs.strategyNumber)||((this.strategyNumber!= null)&&this.strategyNumber.equals(rhs.strategyNumber))));
    }

}
