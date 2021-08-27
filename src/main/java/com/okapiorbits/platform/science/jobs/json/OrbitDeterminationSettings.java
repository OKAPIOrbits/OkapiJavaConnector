
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OrbitDeterminationSettings
 * <p>
 * Orbit determination settings
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rms_threshold",
    "rms_max_iterations",
    "enable_levenberg_marquardt",
    "ephemeris_auto_selection",
    "filter_residuals",
    "residual_filter_threshold",
    "min_ephemerides",
    "allow_additional_ephemerides",
    "allowed_additional_ephemerides_age"
})
public class OrbitDeterminationSettings {

    /**
     * The convergence criterion for the least squares approach
     * 
     */
    @JsonProperty("rms_threshold")
    @JsonPropertyDescription("The convergence criterion for the least squares approach")
    private Double rmsThreshold;
    /**
     * Number of iterations before the least squares process is stopped.
     * 
     */
    @JsonProperty("rms_max_iterations")
    @JsonPropertyDescription("Number of iterations before the least squares process is stopped.")
    private Integer rmsMaxIterations;
    /**
     * Helps the least squares to converge. Note: this is disabled at the moment.
     * 
     */
    @JsonProperty("enable_levenberg_marquardt")
    @JsonPropertyDescription("Helps the least squares to converge. Note: this is disabled at the moment.")
    private Boolean enableLevenbergMarquardt;
    /**
     * Filters the results for the best ephemeris. Note: this is disabled at the moment.
     * 
     */
    @JsonProperty("ephemeris_auto_selection")
    @JsonPropertyDescription("Filters the results for the best ephemeris. Note: this is disabled at the moment.")
    private Boolean ephemerisAutoSelection;
    /**
     * Enables the residual filter. The threshold can be set via the field residual_filter_threshold.
     * 
     */
    @JsonProperty("filter_residuals")
    @JsonPropertyDescription("Enables the residual filter. The threshold can be set via the field residual_filter_threshold.")
    private Boolean filterResiduals;
    /**
     * The threshold of the residual filter as the multiplyer of the standard deviation. 3.0 implies a 3-sigma threshold.
     * 
     */
    @JsonProperty("residual_filter_threshold")
    @JsonPropertyDescription("The threshold of the residual filter as the multiplyer of the standard deviation. 3.0 implies a 3-sigma threshold.")
    private Double residualFilterThreshold;
    /**
     * Minimum number of ephemerides
     * 
     */
    @JsonProperty("min_ephemerides")
    @JsonPropertyDescription("Minimum number of ephemerides")
    private Integer minEphemerides;
    /**
     * Allows the use of additional ephemerides when available from the database.
     * 
     */
    @JsonProperty("allow_additional_ephemerides")
    @JsonPropertyDescription("Allows the use of additional ephemerides when available from the database.")
    private Boolean allowAdditionalEphemerides;
    /**
     * The maximum age of ephemerides to be used in the OD process
     * 
     */
    @JsonProperty("allowed_additional_ephemerides_age")
    @JsonPropertyDescription("The maximum age of ephemerides to be used in the OD process")
    private Double allowedAdditionalEphemeridesAge;

    /**
     * The convergence criterion for the least squares approach
     * 
     */
    @JsonProperty("rms_threshold")
    public Double getRmsThreshold() {
        return rmsThreshold;
    }

    /**
     * The convergence criterion for the least squares approach
     * 
     */
    @JsonProperty("rms_threshold")
    public void setRmsThreshold(Double rmsThreshold) {
        this.rmsThreshold = rmsThreshold;
    }

    /**
     * Number of iterations before the least squares process is stopped.
     * 
     */
    @JsonProperty("rms_max_iterations")
    public Integer getRmsMaxIterations() {
        return rmsMaxIterations;
    }

    /**
     * Number of iterations before the least squares process is stopped.
     * 
     */
    @JsonProperty("rms_max_iterations")
    public void setRmsMaxIterations(Integer rmsMaxIterations) {
        this.rmsMaxIterations = rmsMaxIterations;
    }

    /**
     * Helps the least squares to converge. Note: this is disabled at the moment.
     * 
     */
    @JsonProperty("enable_levenberg_marquardt")
    public Boolean getEnableLevenbergMarquardt() {
        return enableLevenbergMarquardt;
    }

    /**
     * Helps the least squares to converge. Note: this is disabled at the moment.
     * 
     */
    @JsonProperty("enable_levenberg_marquardt")
    public void setEnableLevenbergMarquardt(Boolean enableLevenbergMarquardt) {
        this.enableLevenbergMarquardt = enableLevenbergMarquardt;
    }

    /**
     * Filters the results for the best ephemeris. Note: this is disabled at the moment.
     * 
     */
    @JsonProperty("ephemeris_auto_selection")
    public Boolean getEphemerisAutoSelection() {
        return ephemerisAutoSelection;
    }

    /**
     * Filters the results for the best ephemeris. Note: this is disabled at the moment.
     * 
     */
    @JsonProperty("ephemeris_auto_selection")
    public void setEphemerisAutoSelection(Boolean ephemerisAutoSelection) {
        this.ephemerisAutoSelection = ephemerisAutoSelection;
    }

    /**
     * Enables the residual filter. The threshold can be set via the field residual_filter_threshold.
     * 
     */
    @JsonProperty("filter_residuals")
    public Boolean getFilterResiduals() {
        return filterResiduals;
    }

    /**
     * Enables the residual filter. The threshold can be set via the field residual_filter_threshold.
     * 
     */
    @JsonProperty("filter_residuals")
    public void setFilterResiduals(Boolean filterResiduals) {
        this.filterResiduals = filterResiduals;
    }

    /**
     * The threshold of the residual filter as the multiplyer of the standard deviation. 3.0 implies a 3-sigma threshold.
     * 
     */
    @JsonProperty("residual_filter_threshold")
    public Double getResidualFilterThreshold() {
        return residualFilterThreshold;
    }

    /**
     * The threshold of the residual filter as the multiplyer of the standard deviation. 3.0 implies a 3-sigma threshold.
     * 
     */
    @JsonProperty("residual_filter_threshold")
    public void setResidualFilterThreshold(Double residualFilterThreshold) {
        this.residualFilterThreshold = residualFilterThreshold;
    }

    /**
     * Minimum number of ephemerides
     * 
     */
    @JsonProperty("min_ephemerides")
    public Integer getMinEphemerides() {
        return minEphemerides;
    }

    /**
     * Minimum number of ephemerides
     * 
     */
    @JsonProperty("min_ephemerides")
    public void setMinEphemerides(Integer minEphemerides) {
        this.minEphemerides = minEphemerides;
    }

    /**
     * Allows the use of additional ephemerides when available from the database.
     * 
     */
    @JsonProperty("allow_additional_ephemerides")
    public Boolean getAllowAdditionalEphemerides() {
        return allowAdditionalEphemerides;
    }

    /**
     * Allows the use of additional ephemerides when available from the database.
     * 
     */
    @JsonProperty("allow_additional_ephemerides")
    public void setAllowAdditionalEphemerides(Boolean allowAdditionalEphemerides) {
        this.allowAdditionalEphemerides = allowAdditionalEphemerides;
    }

    /**
     * The maximum age of ephemerides to be used in the OD process
     * 
     */
    @JsonProperty("allowed_additional_ephemerides_age")
    public Double getAllowedAdditionalEphemeridesAge() {
        return allowedAdditionalEphemeridesAge;
    }

    /**
     * The maximum age of ephemerides to be used in the OD process
     * 
     */
    @JsonProperty("allowed_additional_ephemerides_age")
    public void setAllowedAdditionalEphemeridesAge(Double allowedAdditionalEphemeridesAge) {
        this.allowedAdditionalEphemeridesAge = allowedAdditionalEphemeridesAge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrbitDeterminationSettings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rmsThreshold");
        sb.append('=');
        sb.append(((this.rmsThreshold == null)?"<null>":this.rmsThreshold));
        sb.append(',');
        sb.append("rmsMaxIterations");
        sb.append('=');
        sb.append(((this.rmsMaxIterations == null)?"<null>":this.rmsMaxIterations));
        sb.append(',');
        sb.append("enableLevenbergMarquardt");
        sb.append('=');
        sb.append(((this.enableLevenbergMarquardt == null)?"<null>":this.enableLevenbergMarquardt));
        sb.append(',');
        sb.append("ephemerisAutoSelection");
        sb.append('=');
        sb.append(((this.ephemerisAutoSelection == null)?"<null>":this.ephemerisAutoSelection));
        sb.append(',');
        sb.append("filterResiduals");
        sb.append('=');
        sb.append(((this.filterResiduals == null)?"<null>":this.filterResiduals));
        sb.append(',');
        sb.append("residualFilterThreshold");
        sb.append('=');
        sb.append(((this.residualFilterThreshold == null)?"<null>":this.residualFilterThreshold));
        sb.append(',');
        sb.append("minEphemerides");
        sb.append('=');
        sb.append(((this.minEphemerides == null)?"<null>":this.minEphemerides));
        sb.append(',');
        sb.append("allowAdditionalEphemerides");
        sb.append('=');
        sb.append(((this.allowAdditionalEphemerides == null)?"<null>":this.allowAdditionalEphemerides));
        sb.append(',');
        sb.append("allowedAdditionalEphemeridesAge");
        sb.append('=');
        sb.append(((this.allowedAdditionalEphemeridesAge == null)?"<null>":this.allowedAdditionalEphemeridesAge));
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
        result = ((result* 31)+((this.ephemerisAutoSelection == null)? 0 :this.ephemerisAutoSelection.hashCode()));
        result = ((result* 31)+((this.allowAdditionalEphemerides == null)? 0 :this.allowAdditionalEphemerides.hashCode()));
        result = ((result* 31)+((this.allowedAdditionalEphemeridesAge == null)? 0 :this.allowedAdditionalEphemeridesAge.hashCode()));
        result = ((result* 31)+((this.filterResiduals == null)? 0 :this.filterResiduals.hashCode()));
        result = ((result* 31)+((this.minEphemerides == null)? 0 :this.minEphemerides.hashCode()));
        result = ((result* 31)+((this.rmsMaxIterations == null)? 0 :this.rmsMaxIterations.hashCode()));
        result = ((result* 31)+((this.rmsThreshold == null)? 0 :this.rmsThreshold.hashCode()));
        result = ((result* 31)+((this.enableLevenbergMarquardt == null)? 0 :this.enableLevenbergMarquardt.hashCode()));
        result = ((result* 31)+((this.residualFilterThreshold == null)? 0 :this.residualFilterThreshold.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrbitDeterminationSettings) == false) {
            return false;
        }
        OrbitDeterminationSettings rhs = ((OrbitDeterminationSettings) other);
        return ((((((((((this.ephemerisAutoSelection == rhs.ephemerisAutoSelection)||((this.ephemerisAutoSelection!= null)&&this.ephemerisAutoSelection.equals(rhs.ephemerisAutoSelection)))&&((this.allowAdditionalEphemerides == rhs.allowAdditionalEphemerides)||((this.allowAdditionalEphemerides!= null)&&this.allowAdditionalEphemerides.equals(rhs.allowAdditionalEphemerides))))&&((this.allowedAdditionalEphemeridesAge == rhs.allowedAdditionalEphemeridesAge)||((this.allowedAdditionalEphemeridesAge!= null)&&this.allowedAdditionalEphemeridesAge.equals(rhs.allowedAdditionalEphemeridesAge))))&&((this.filterResiduals == rhs.filterResiduals)||((this.filterResiduals!= null)&&this.filterResiduals.equals(rhs.filterResiduals))))&&((this.minEphemerides == rhs.minEphemerides)||((this.minEphemerides!= null)&&this.minEphemerides.equals(rhs.minEphemerides))))&&((this.rmsMaxIterations == rhs.rmsMaxIterations)||((this.rmsMaxIterations!= null)&&this.rmsMaxIterations.equals(rhs.rmsMaxIterations))))&&((this.rmsThreshold == rhs.rmsThreshold)||((this.rmsThreshold!= null)&&this.rmsThreshold.equals(rhs.rmsThreshold))))&&((this.enableLevenbergMarquardt == rhs.enableLevenbergMarquardt)||((this.enableLevenbergMarquardt!= null)&&this.enableLevenbergMarquardt.equals(rhs.enableLevenbergMarquardt))))&&((this.residualFilterThreshold == rhs.residualFilterThreshold)||((this.residualFilterThreshold!= null)&&this.residualFilterThreshold.equals(rhs.residualFilterThreshold))));
    }

}
