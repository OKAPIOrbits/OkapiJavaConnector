
package com.okapiorbits.platform.science.jobs.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Conjunction
 * <p>
 * A conjunction between two objects defined using their norad ids and names. Optionally contains newest risk estimation and prediction of this conjunction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "conjunction_id",
    "sat1_norad_id",
    "sat2_norad_id",
    "sat1_name",
    "sat2_name",
    "criticality",
    "criticality_source",
    "newest_risk_estimation",
    "newest_risk_prediction"
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
     * Criticality
     * <p>
     * Conjunction criticality.
     * 
     */
    @JsonProperty("criticality")
    @JsonPropertyDescription("Conjunction criticality.")
    private RiskPrediction.Criticality criticality;
    /**
     * The source of the criticality in this conjunction. Conjunctions from AI enabled satellites using the criticality from risk predictions, AI disabled refers to risk estimations.
     * 
     */
    @JsonProperty("criticality_source")
    @JsonPropertyDescription("The source of the criticality in this conjunction. Conjunctions from AI enabled satellites using the criticality from risk predictions, AI disabled refers to risk estimations.")
    private Conjunction.CriticalitySource criticalitySource;
    /**
     * RiskEstimation
     * <p>
     * A risk estimation with the Time of Closest Approach (TCA), collision probability, the associated method, miss vector and covariance scaling factors. In addition, a risk classification is available.
     * 
     */
    @JsonProperty("newest_risk_estimation")
    @JsonPropertyDescription("A risk estimation with the Time of Closest Approach (TCA), collision probability, the associated method, miss vector and covariance scaling factors. In addition, a risk classification is available.")
    private RiskEstimation newestRiskEstimation;
    /**
     * RiskPrediction
     * <p>
     * A risk prediction with a risk trend (series of collision probabilities), the peak risk, miss vector and risk classification.
     * 
     */
    @JsonProperty("newest_risk_prediction")
    @JsonPropertyDescription("A risk prediction with a risk trend (series of collision probabilities), the peak risk, miss vector and risk classification.")
    private RiskPrediction newestRiskPrediction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * Criticality
     * <p>
     * Conjunction criticality.
     * 
     */
    @JsonProperty("criticality")
    public RiskPrediction.Criticality getCriticality() {
        return criticality;
    }

    /**
     * Criticality
     * <p>
     * Conjunction criticality.
     * 
     */
    @JsonProperty("criticality")
    public void setCriticality(RiskPrediction.Criticality criticality) {
        this.criticality = criticality;
    }

    /**
     * The source of the criticality in this conjunction. Conjunctions from AI enabled satellites using the criticality from risk predictions, AI disabled refers to risk estimations.
     * 
     */
    @JsonProperty("criticality_source")
    public Conjunction.CriticalitySource getCriticalitySource() {
        return criticalitySource;
    }

    /**
     * The source of the criticality in this conjunction. Conjunctions from AI enabled satellites using the criticality from risk predictions, AI disabled refers to risk estimations.
     * 
     */
    @JsonProperty("criticality_source")
    public void setCriticalitySource(Conjunction.CriticalitySource criticalitySource) {
        this.criticalitySource = criticalitySource;
    }

    /**
     * RiskEstimation
     * <p>
     * A risk estimation with the Time of Closest Approach (TCA), collision probability, the associated method, miss vector and covariance scaling factors. In addition, a risk classification is available.
     * 
     */
    @JsonProperty("newest_risk_estimation")
    public RiskEstimation getNewestRiskEstimation() {
        return newestRiskEstimation;
    }

    /**
     * RiskEstimation
     * <p>
     * A risk estimation with the Time of Closest Approach (TCA), collision probability, the associated method, miss vector and covariance scaling factors. In addition, a risk classification is available.
     * 
     */
    @JsonProperty("newest_risk_estimation")
    public void setNewestRiskEstimation(RiskEstimation newestRiskEstimation) {
        this.newestRiskEstimation = newestRiskEstimation;
    }

    /**
     * RiskPrediction
     * <p>
     * A risk prediction with a risk trend (series of collision probabilities), the peak risk, miss vector and risk classification.
     * 
     */
    @JsonProperty("newest_risk_prediction")
    public RiskPrediction getNewestRiskPrediction() {
        return newestRiskPrediction;
    }

    /**
     * RiskPrediction
     * <p>
     * A risk prediction with a risk trend (series of collision probabilities), the peak risk, miss vector and risk classification.
     * 
     */
    @JsonProperty("newest_risk_prediction")
    public void setNewestRiskPrediction(RiskPrediction newestRiskPrediction) {
        this.newestRiskPrediction = newestRiskPrediction;
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
        sb.append("criticality");
        sb.append('=');
        sb.append(((this.criticality == null)?"<null>":this.criticality));
        sb.append(',');
        sb.append("criticalitySource");
        sb.append('=');
        sb.append(((this.criticalitySource == null)?"<null>":this.criticalitySource));
        sb.append(',');
        sb.append("newestRiskEstimation");
        sb.append('=');
        sb.append(((this.newestRiskEstimation == null)?"<null>":this.newestRiskEstimation));
        sb.append(',');
        sb.append("newestRiskPrediction");
        sb.append('=');
        sb.append(((this.newestRiskPrediction == null)?"<null>":this.newestRiskPrediction));
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
        result = ((result* 31)+((this.sat2NoradId == null)? 0 :this.sat2NoradId.hashCode()));
        result = ((result* 31)+((this.criticalitySource == null)? 0 :this.criticalitySource.hashCode()));
        result = ((result* 31)+((this.newestRiskEstimation == null)? 0 :this.newestRiskEstimation.hashCode()));
        result = ((result* 31)+((this.sat1NoradId == null)? 0 :this.sat1NoradId.hashCode()));
        result = ((result* 31)+((this.criticality == null)? 0 :this.criticality.hashCode()));
        result = ((result* 31)+((this.sat1Name == null)? 0 :this.sat1Name.hashCode()));
        result = ((result* 31)+((this.newestRiskPrediction == null)? 0 :this.newestRiskPrediction.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        return (((((((((((this.sat2NoradId == rhs.sat2NoradId)||((this.sat2NoradId!= null)&&this.sat2NoradId.equals(rhs.sat2NoradId)))&&((this.criticalitySource == rhs.criticalitySource)||((this.criticalitySource!= null)&&this.criticalitySource.equals(rhs.criticalitySource))))&&((this.newestRiskEstimation == rhs.newestRiskEstimation)||((this.newestRiskEstimation!= null)&&this.newestRiskEstimation.equals(rhs.newestRiskEstimation))))&&((this.sat1NoradId == rhs.sat1NoradId)||((this.sat1NoradId!= null)&&this.sat1NoradId.equals(rhs.sat1NoradId))))&&((this.criticality == rhs.criticality)||((this.criticality!= null)&&this.criticality.equals(rhs.criticality))))&&((this.sat1Name == rhs.sat1Name)||((this.sat1Name!= null)&&this.sat1Name.equals(rhs.sat1Name))))&&((this.newestRiskPrediction == rhs.newestRiskPrediction)||((this.newestRiskPrediction!= null)&&this.newestRiskPrediction.equals(rhs.newestRiskPrediction))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sat2Name == rhs.sat2Name)||((this.sat2Name!= null)&&this.sat2Name.equals(rhs.sat2Name))))&&((this.conjunctionId == rhs.conjunctionId)||((this.conjunctionId!= null)&&this.conjunctionId.equals(rhs.conjunctionId))));
    }


    /**
     * The source of the criticality in this conjunction. Conjunctions from AI enabled satellites using the criticality from risk predictions, AI disabled refers to risk estimations.
     * 
     */
    public enum CriticalitySource {

        RISK_ESTIMATION("risk_estimation"),
        RISK_PREDICTION("risk_prediction");
        private final String value;
        private final static Map<String, Conjunction.CriticalitySource> CONSTANTS = new HashMap<String, Conjunction.CriticalitySource>();

        static {
            for (Conjunction.CriticalitySource c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CriticalitySource(String value) {
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
        public static Conjunction.CriticalitySource fromValue(String value) {
            Conjunction.CriticalitySource constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
