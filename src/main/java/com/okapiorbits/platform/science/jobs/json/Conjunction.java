
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Conjunction
 * <p>
 * A conjunction between two objects defined using their norad ids and names. Optionally, this conjunction can contain a rsik estimation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "conjunction_id",
    "sat1_norad_id",
    "sat2_norad_id",
    "sat1_name",
    "sat2_name",
    "risk_estimations",
    "risk_predictions"
})
public class Conjunction {

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     * 
     */
    @JsonProperty("conjunction_id")
    @JsonPropertyDescription("A Universally-Unique Identifier, as used by OKAPI:Orbits")
    private String conjunctionId;
    /**
     * NORAD ID of satellite 1
     * (Required)
     * 
     */
    @JsonProperty("sat1_norad_id")
    @JsonPropertyDescription("NORAD ID of satellite 1")
    private Integer sat1NoradId;
    /**
     * NORAD ID of satellite 2
     * (Required)
     * 
     */
    @JsonProperty("sat2_norad_id")
    @JsonPropertyDescription("NORAD ID of satellite 2")
    private Integer sat2NoradId;
    /**
     * Name of satellite 1
     * (Required)
     * 
     */
    @JsonProperty("sat1_name")
    @JsonPropertyDescription("Name of satellite 1")
    private String sat1Name;
    /**
     * Name of satellite 2
     * (Required)
     * 
     */
    @JsonProperty("sat2_name")
    @JsonPropertyDescription("Name of satellite 2")
    private String sat2Name;
    /**
     * RiskEstimations
     * <p>
     * An array of risk estimations.
     * 
     */
    @JsonProperty("risk_estimations")
    @JsonPropertyDescription("An array of risk estimations.")
    private RiskEstimations riskEstimations;
    /**
     * RiskPredictions
     * <p>
     * An array of risk predictions.
     * 
     */
    @JsonProperty("risk_predictions")
    @JsonPropertyDescription("An array of risk predictions.")
    private RiskPredictions riskPredictions;

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     * 
     */
    @JsonProperty("conjunction_id")
    public String getConjunctionId() {
        return conjunctionId;
    }

    /**
     * Uuid
     * <p>
     * A Universally-Unique Identifier, as used by OKAPI:Orbits
     * (Required)
     * 
     */
    @JsonProperty("conjunction_id")
    public void setConjunctionId(String conjunctionId) {
        this.conjunctionId = conjunctionId;
    }

    /**
     * NORAD ID of satellite 1
     * (Required)
     * 
     */
    @JsonProperty("sat1_norad_id")
    public Integer getSat1NoradId() {
        return sat1NoradId;
    }

    /**
     * NORAD ID of satellite 1
     * (Required)
     * 
     */
    @JsonProperty("sat1_norad_id")
    public void setSat1NoradId(Integer sat1NoradId) {
        this.sat1NoradId = sat1NoradId;
    }

    /**
     * NORAD ID of satellite 2
     * (Required)
     * 
     */
    @JsonProperty("sat2_norad_id")
    public Integer getSat2NoradId() {
        return sat2NoradId;
    }

    /**
     * NORAD ID of satellite 2
     * (Required)
     * 
     */
    @JsonProperty("sat2_norad_id")
    public void setSat2NoradId(Integer sat2NoradId) {
        this.sat2NoradId = sat2NoradId;
    }

    /**
     * Name of satellite 1
     * (Required)
     * 
     */
    @JsonProperty("sat1_name")
    public String getSat1Name() {
        return sat1Name;
    }

    /**
     * Name of satellite 1
     * (Required)
     * 
     */
    @JsonProperty("sat1_name")
    public void setSat1Name(String sat1Name) {
        this.sat1Name = sat1Name;
    }

    /**
     * Name of satellite 2
     * (Required)
     * 
     */
    @JsonProperty("sat2_name")
    public String getSat2Name() {
        return sat2Name;
    }

    /**
     * Name of satellite 2
     * (Required)
     * 
     */
    @JsonProperty("sat2_name")
    public void setSat2Name(String sat2Name) {
        this.sat2Name = sat2Name;
    }

    /**
     * RiskEstimations
     * <p>
     * An array of risk estimations.
     * 
     */
    @JsonProperty("risk_estimations")
    public RiskEstimations getRiskEstimations() {
        return riskEstimations;
    }

    /**
     * RiskEstimations
     * <p>
     * An array of risk estimations.
     * 
     */
    @JsonProperty("risk_estimations")
    public void setRiskEstimations(RiskEstimations riskEstimations) {
        this.riskEstimations = riskEstimations;
    }

    /**
     * RiskPredictions
     * <p>
     * An array of risk predictions.
     * 
     */
    @JsonProperty("risk_predictions")
    public RiskPredictions getRiskPredictions() {
        return riskPredictions;
    }

    /**
     * RiskPredictions
     * <p>
     * An array of risk predictions.
     * 
     */
    @JsonProperty("risk_predictions")
    public void setRiskPredictions(RiskPredictions riskPredictions) {
        this.riskPredictions = riskPredictions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Conjunction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("conjunctionId");
        sb.append('=');
        sb.append(((this.conjunctionId == null)?"<null>":this.conjunctionId));
        sb.append(',');
        sb.append("sat1NoradId");
        sb.append('=');
        sb.append(((this.sat1NoradId == null)?"<null>":this.sat1NoradId));
        sb.append(',');
        sb.append("sat2NoradId");
        sb.append('=');
        sb.append(((this.sat2NoradId == null)?"<null>":this.sat2NoradId));
        sb.append(',');
        sb.append("sat1Name");
        sb.append('=');
        sb.append(((this.sat1Name == null)?"<null>":this.sat1Name));
        sb.append(',');
        sb.append("sat2Name");
        sb.append('=');
        sb.append(((this.sat2Name == null)?"<null>":this.sat2Name));
        sb.append(',');
        sb.append("riskEstimations");
        sb.append('=');
        sb.append(((this.riskEstimations == null)?"<null>":this.riskEstimations));
        sb.append(',');
        sb.append("riskPredictions");
        sb.append('=');
        sb.append(((this.riskPredictions == null)?"<null>":this.riskPredictions));
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
        result = ((result* 31)+((this.sat2NoradId == null)? 0 :this.sat2NoradId.hashCode()));
        result = ((result* 31)+((this.riskEstimations == null)? 0 :this.riskEstimations.hashCode()));
        result = ((result* 31)+((this.sat1NoradId == null)? 0 :this.sat1NoradId.hashCode()));
        result = ((result* 31)+((this.riskPredictions == null)? 0 :this.riskPredictions.hashCode()));
        result = ((result* 31)+((this.sat1Name == null)? 0 :this.sat1Name.hashCode()));
        result = ((result* 31)+((this.sat2Name == null)? 0 :this.sat2Name.hashCode()));
        result = ((result* 31)+((this.conjunctionId == null)? 0 :this.conjunctionId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conjunction) == false) {
            return false;
        }
        Conjunction rhs = ((Conjunction) other);
        return ((((((((this.sat2NoradId == rhs.sat2NoradId)||((this.sat2NoradId!= null)&&this.sat2NoradId.equals(rhs.sat2NoradId)))&&((this.riskEstimations == rhs.riskEstimations)||((this.riskEstimations!= null)&&this.riskEstimations.equals(rhs.riskEstimations))))&&((this.sat1NoradId == rhs.sat1NoradId)||((this.sat1NoradId!= null)&&this.sat1NoradId.equals(rhs.sat1NoradId))))&&((this.riskPredictions == rhs.riskPredictions)||((this.riskPredictions!= null)&&this.riskPredictions.equals(rhs.riskPredictions))))&&((this.sat1Name == rhs.sat1Name)||((this.sat1Name!= null)&&this.sat1Name.equals(rhs.sat1Name))))&&((this.sat2Name == rhs.sat2Name)||((this.sat2Name!= null)&&this.sat2Name.equals(rhs.sat2Name))))&&((this.conjunctionId == rhs.conjunctionId)||((this.conjunctionId!= null)&&this.conjunctionId.equals(rhs.conjunctionId))));
    }

}
