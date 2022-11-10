
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
    "differencing_position_absolute_delta",
    "differencing_velocity_absolute_delta",
    "differencing_solve_for_cd_relative_delta",
    "differencing_solve_for_cr_relative_delta",
    "residual_filter_threshold",
    "min_ephemerides",
    "max_ephemerides",
    "allow_additional_ephemerides",
    "allowed_additional_ephemerides_age",
    "use_maximum_fit_span",
    "maximum_fit_span",
    "solve_for_cd",
    "solve_for_cr",
    "scale_std_for_in_sun",
    "scale_factor_std_for_in_sun"
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
     * The central differencing value of delta to be used for position
     * 
     */
    @JsonProperty("differencing_position_absolute_delta")
    @JsonPropertyDescription("The central differencing value of delta to be used for position")
    private Double differencingPositionAbsoluteDelta = 0.001D;
    /**
     * The central differencing value of delta to be used for velocity
     * 
     */
    @JsonProperty("differencing_velocity_absolute_delta")
    @JsonPropertyDescription("The central differencing value of delta to be used for velocity")
    private Double differencingVelocityAbsoluteDelta = 1.0E-6D;
    /**
     * The central differencing value of delta to be used for cd
     * 
     */
    @JsonProperty("differencing_solve_for_cd_relative_delta")
    @JsonPropertyDescription("The central differencing value of delta to be used for cd")
    private Double differencingSolveForCdRelativeDelta = 0.1D;
    /**
     * The central differencing value of delta to be used for cr
     * 
     */
    @JsonProperty("differencing_solve_for_cr_relative_delta")
    @JsonPropertyDescription("The central differencing value of delta to be used for cr")
    private Double differencingSolveForCrRelativeDelta = 0.1D;
    /**
     * The threshold of the residual filter as the multiplyer of the standard deviation. 3.0 implies a 3-sigma threshold.
     * 
     */
    @JsonProperty("residual_filter_threshold")
    @JsonPropertyDescription("The threshold of the residual filter as the multiplyer of the standard deviation. 3.0 implies a 3-sigma threshold.")
    private Double residualFilterThreshold;
    /**
     * Minimum number of ephemerides to be used for OD
     * 
     */
    @JsonProperty("min_ephemerides")
    @JsonPropertyDescription("Minimum number of ephemerides to be used for OD")
    private Integer minEphemerides;
    /**
     * Maximum number of ephemerides to be used for OD
     * 
     */
    @JsonProperty("max_ephemerides")
    @JsonPropertyDescription("Maximum number of ephemerides to be used for OD")
    private Integer maxEphemerides = 5000;
    /**
     * Allows the use of additional ephemerides when available from the database.
     * 
     */
    @JsonProperty("allow_additional_ephemerides")
    @JsonPropertyDescription("Allows the use of additional ephemerides when available from the database.")
    private Boolean allowAdditionalEphemerides = false;
    /**
     * The maximum age of ephemerides to be used in the OD process
     * 
     */
    @JsonProperty("allowed_additional_ephemerides_age")
    @JsonPropertyDescription("The maximum age of ephemerides to be used in the OD process")
    private Double allowedAdditionalEphemeridesAge = 0.0D;
    /**
     * Flags whether usage of measurement data shall be limited (to duration in days)
     * 
     */
    @JsonProperty("use_maximum_fit_span")
    @JsonPropertyDescription("Flags whether usage of measurement data shall be limited (to duration in days)")
    private Boolean useMaximumFitSpan = false;
    /**
     * The maximum time span over which the measurements can be used in the OD process (in days)
     * 
     */
    @JsonProperty("maximum_fit_span")
    @JsonPropertyDescription("The maximum time span over which the measurements can be used in the OD process (in days)")
    private Double maximumFitSpan = 0.0D;
    /**
     * Allows to estimate the value of cd
     * 
     */
    @JsonProperty("solve_for_cd")
    @JsonPropertyDescription("Allows to estimate the value of cd")
    private Boolean solveForCd = false;
    /**
     * Allows to estimate the value of cr
     * 
     */
    @JsonProperty("solve_for_cr")
    @JsonPropertyDescription("Allows to estimate the value of cr")
    private Boolean solveForCr = false;
    /**
     * Allows to scale the value of standard deviation, hence weight matrix when satellite is in sun
     * 
     */
    @JsonProperty("scale_std_for_in_sun")
    @JsonPropertyDescription("Allows to scale the value of standard deviation, hence weight matrix when satellite is in sun")
    private Boolean scaleStdForInSun = false;
    /**
     * Standard deviations scaling factor: used when satellite is illuminated
     * 
     */
    @JsonProperty("scale_factor_std_for_in_sun")
    @JsonPropertyDescription("Standard deviations scaling factor: used when satellite is illuminated")
    private Double scaleFactorStdForInSun;

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
     * The central differencing value of delta to be used for position
     * 
     */
    @JsonProperty("differencing_position_absolute_delta")
    public Double getDifferencingPositionAbsoluteDelta() {
        return differencingPositionAbsoluteDelta;
    }

    /**
     * The central differencing value of delta to be used for position
     * 
     */
    @JsonProperty("differencing_position_absolute_delta")
    public void setDifferencingPositionAbsoluteDelta(Double differencingPositionAbsoluteDelta) {
        this.differencingPositionAbsoluteDelta = differencingPositionAbsoluteDelta;
    }

    /**
     * The central differencing value of delta to be used for velocity
     * 
     */
    @JsonProperty("differencing_velocity_absolute_delta")
    public Double getDifferencingVelocityAbsoluteDelta() {
        return differencingVelocityAbsoluteDelta;
    }

    /**
     * The central differencing value of delta to be used for velocity
     * 
     */
    @JsonProperty("differencing_velocity_absolute_delta")
    public void setDifferencingVelocityAbsoluteDelta(Double differencingVelocityAbsoluteDelta) {
        this.differencingVelocityAbsoluteDelta = differencingVelocityAbsoluteDelta;
    }

    /**
     * The central differencing value of delta to be used for cd
     * 
     */
    @JsonProperty("differencing_solve_for_cd_relative_delta")
    public Double getDifferencingSolveForCdRelativeDelta() {
        return differencingSolveForCdRelativeDelta;
    }

    /**
     * The central differencing value of delta to be used for cd
     * 
     */
    @JsonProperty("differencing_solve_for_cd_relative_delta")
    public void setDifferencingSolveForCdRelativeDelta(Double differencingSolveForCdRelativeDelta) {
        this.differencingSolveForCdRelativeDelta = differencingSolveForCdRelativeDelta;
    }

    /**
     * The central differencing value of delta to be used for cr
     * 
     */
    @JsonProperty("differencing_solve_for_cr_relative_delta")
    public Double getDifferencingSolveForCrRelativeDelta() {
        return differencingSolveForCrRelativeDelta;
    }

    /**
     * The central differencing value of delta to be used for cr
     * 
     */
    @JsonProperty("differencing_solve_for_cr_relative_delta")
    public void setDifferencingSolveForCrRelativeDelta(Double differencingSolveForCrRelativeDelta) {
        this.differencingSolveForCrRelativeDelta = differencingSolveForCrRelativeDelta;
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
     * Minimum number of ephemerides to be used for OD
     * 
     */
    @JsonProperty("min_ephemerides")
    public Integer getMinEphemerides() {
        return minEphemerides;
    }

    /**
     * Minimum number of ephemerides to be used for OD
     * 
     */
    @JsonProperty("min_ephemerides")
    public void setMinEphemerides(Integer minEphemerides) {
        this.minEphemerides = minEphemerides;
    }

    /**
     * Maximum number of ephemerides to be used for OD
     * 
     */
    @JsonProperty("max_ephemerides")
    public Integer getMaxEphemerides() {
        return maxEphemerides;
    }

    /**
     * Maximum number of ephemerides to be used for OD
     * 
     */
    @JsonProperty("max_ephemerides")
    public void setMaxEphemerides(Integer maxEphemerides) {
        this.maxEphemerides = maxEphemerides;
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

    /**
     * Flags whether usage of measurement data shall be limited (to duration in days)
     * 
     */
    @JsonProperty("use_maximum_fit_span")
    public Boolean getUseMaximumFitSpan() {
        return useMaximumFitSpan;
    }

    /**
     * Flags whether usage of measurement data shall be limited (to duration in days)
     * 
     */
    @JsonProperty("use_maximum_fit_span")
    public void setUseMaximumFitSpan(Boolean useMaximumFitSpan) {
        this.useMaximumFitSpan = useMaximumFitSpan;
    }

    /**
     * The maximum time span over which the measurements can be used in the OD process (in days)
     * 
     */
    @JsonProperty("maximum_fit_span")
    public Double getMaximumFitSpan() {
        return maximumFitSpan;
    }

    /**
     * The maximum time span over which the measurements can be used in the OD process (in days)
     * 
     */
    @JsonProperty("maximum_fit_span")
    public void setMaximumFitSpan(Double maximumFitSpan) {
        this.maximumFitSpan = maximumFitSpan;
    }

    /**
     * Allows to estimate the value of cd
     * 
     */
    @JsonProperty("solve_for_cd")
    public Boolean getSolveForCd() {
        return solveForCd;
    }

    /**
     * Allows to estimate the value of cd
     * 
     */
    @JsonProperty("solve_for_cd")
    public void setSolveForCd(Boolean solveForCd) {
        this.solveForCd = solveForCd;
    }

    /**
     * Allows to estimate the value of cr
     * 
     */
    @JsonProperty("solve_for_cr")
    public Boolean getSolveForCr() {
        return solveForCr;
    }

    /**
     * Allows to estimate the value of cr
     * 
     */
    @JsonProperty("solve_for_cr")
    public void setSolveForCr(Boolean solveForCr) {
        this.solveForCr = solveForCr;
    }

    /**
     * Allows to scale the value of standard deviation, hence weight matrix when satellite is in sun
     * 
     */
    @JsonProperty("scale_std_for_in_sun")
    public Boolean getScaleStdForInSun() {
        return scaleStdForInSun;
    }

    /**
     * Allows to scale the value of standard deviation, hence weight matrix when satellite is in sun
     * 
     */
    @JsonProperty("scale_std_for_in_sun")
    public void setScaleStdForInSun(Boolean scaleStdForInSun) {
        this.scaleStdForInSun = scaleStdForInSun;
    }

    /**
     * Standard deviations scaling factor: used when satellite is illuminated
     * 
     */
    @JsonProperty("scale_factor_std_for_in_sun")
    public Double getScaleFactorStdForInSun() {
        return scaleFactorStdForInSun;
    }

    /**
     * Standard deviations scaling factor: used when satellite is illuminated
     * 
     */
    @JsonProperty("scale_factor_std_for_in_sun")
    public void setScaleFactorStdForInSun(Double scaleFactorStdForInSun) {
        this.scaleFactorStdForInSun = scaleFactorStdForInSun;
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
        sb.append("differencingPositionAbsoluteDelta");
        sb.append('=');
        sb.append(((this.differencingPositionAbsoluteDelta == null)?"<null>":this.differencingPositionAbsoluteDelta));
        sb.append(',');
        sb.append("differencingVelocityAbsoluteDelta");
        sb.append('=');
        sb.append(((this.differencingVelocityAbsoluteDelta == null)?"<null>":this.differencingVelocityAbsoluteDelta));
        sb.append(',');
        sb.append("differencingSolveForCdRelativeDelta");
        sb.append('=');
        sb.append(((this.differencingSolveForCdRelativeDelta == null)?"<null>":this.differencingSolveForCdRelativeDelta));
        sb.append(',');
        sb.append("differencingSolveForCrRelativeDelta");
        sb.append('=');
        sb.append(((this.differencingSolveForCrRelativeDelta == null)?"<null>":this.differencingSolveForCrRelativeDelta));
        sb.append(',');
        sb.append("residualFilterThreshold");
        sb.append('=');
        sb.append(((this.residualFilterThreshold == null)?"<null>":this.residualFilterThreshold));
        sb.append(',');
        sb.append("minEphemerides");
        sb.append('=');
        sb.append(((this.minEphemerides == null)?"<null>":this.minEphemerides));
        sb.append(',');
        sb.append("maxEphemerides");
        sb.append('=');
        sb.append(((this.maxEphemerides == null)?"<null>":this.maxEphemerides));
        sb.append(',');
        sb.append("allowAdditionalEphemerides");
        sb.append('=');
        sb.append(((this.allowAdditionalEphemerides == null)?"<null>":this.allowAdditionalEphemerides));
        sb.append(',');
        sb.append("allowedAdditionalEphemeridesAge");
        sb.append('=');
        sb.append(((this.allowedAdditionalEphemeridesAge == null)?"<null>":this.allowedAdditionalEphemeridesAge));
        sb.append(',');
        sb.append("useMaximumFitSpan");
        sb.append('=');
        sb.append(((this.useMaximumFitSpan == null)?"<null>":this.useMaximumFitSpan));
        sb.append(',');
        sb.append("maximumFitSpan");
        sb.append('=');
        sb.append(((this.maximumFitSpan == null)?"<null>":this.maximumFitSpan));
        sb.append(',');
        sb.append("solveForCd");
        sb.append('=');
        sb.append(((this.solveForCd == null)?"<null>":this.solveForCd));
        sb.append(',');
        sb.append("solveForCr");
        sb.append('=');
        sb.append(((this.solveForCr == null)?"<null>":this.solveForCr));
        sb.append(',');
        sb.append("scaleStdForInSun");
        sb.append('=');
        sb.append(((this.scaleStdForInSun == null)?"<null>":this.scaleStdForInSun));
        sb.append(',');
        sb.append("scaleFactorStdForInSun");
        sb.append('=');
        sb.append(((this.scaleFactorStdForInSun == null)?"<null>":this.scaleFactorStdForInSun));
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
        result = ((result* 31)+((this.scaleStdForInSun == null)? 0 :this.scaleStdForInSun.hashCode()));
        result = ((result* 31)+((this.maximumFitSpan == null)? 0 :this.maximumFitSpan.hashCode()));
        result = ((result* 31)+((this.differencingVelocityAbsoluteDelta == null)? 0 :this.differencingVelocityAbsoluteDelta.hashCode()));
        result = ((result* 31)+((this.allowedAdditionalEphemeridesAge == null)? 0 :this.allowedAdditionalEphemeridesAge.hashCode()));
        result = ((result* 31)+((this.solveForCr == null)? 0 :this.solveForCr.hashCode()));
        result = ((result* 31)+((this.differencingPositionAbsoluteDelta == null)? 0 :this.differencingPositionAbsoluteDelta.hashCode()));
        result = ((result* 31)+((this.minEphemerides == null)? 0 :this.minEphemerides.hashCode()));
        result = ((result* 31)+((this.differencingSolveForCdRelativeDelta == null)? 0 :this.differencingSolveForCdRelativeDelta.hashCode()));
        result = ((result* 31)+((this.maxEphemerides == null)? 0 :this.maxEphemerides.hashCode()));
        result = ((result* 31)+((this.scaleFactorStdForInSun == null)? 0 :this.scaleFactorStdForInSun.hashCode()));
        result = ((result* 31)+((this.ephemerisAutoSelection == null)? 0 :this.ephemerisAutoSelection.hashCode()));
        result = ((result* 31)+((this.differencingSolveForCrRelativeDelta == null)? 0 :this.differencingSolveForCrRelativeDelta.hashCode()));
        result = ((result* 31)+((this.allowAdditionalEphemerides == null)? 0 :this.allowAdditionalEphemerides.hashCode()));
        result = ((result* 31)+((this.filterResiduals == null)? 0 :this.filterResiduals.hashCode()));
        result = ((result* 31)+((this.rmsMaxIterations == null)? 0 :this.rmsMaxIterations.hashCode()));
        result = ((result* 31)+((this.solveForCd == null)? 0 :this.solveForCd.hashCode()));
        result = ((result* 31)+((this.useMaximumFitSpan == null)? 0 :this.useMaximumFitSpan.hashCode()));
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
        return (((((((((((((((((((((this.scaleStdForInSun == rhs.scaleStdForInSun)||((this.scaleStdForInSun!= null)&&this.scaleStdForInSun.equals(rhs.scaleStdForInSun)))&&((this.maximumFitSpan == rhs.maximumFitSpan)||((this.maximumFitSpan!= null)&&this.maximumFitSpan.equals(rhs.maximumFitSpan))))&&((this.differencingVelocityAbsoluteDelta == rhs.differencingVelocityAbsoluteDelta)||((this.differencingVelocityAbsoluteDelta!= null)&&this.differencingVelocityAbsoluteDelta.equals(rhs.differencingVelocityAbsoluteDelta))))&&((this.allowedAdditionalEphemeridesAge == rhs.allowedAdditionalEphemeridesAge)||((this.allowedAdditionalEphemeridesAge!= null)&&this.allowedAdditionalEphemeridesAge.equals(rhs.allowedAdditionalEphemeridesAge))))&&((this.solveForCr == rhs.solveForCr)||((this.solveForCr!= null)&&this.solveForCr.equals(rhs.solveForCr))))&&((this.differencingPositionAbsoluteDelta == rhs.differencingPositionAbsoluteDelta)||((this.differencingPositionAbsoluteDelta!= null)&&this.differencingPositionAbsoluteDelta.equals(rhs.differencingPositionAbsoluteDelta))))&&((this.minEphemerides == rhs.minEphemerides)||((this.minEphemerides!= null)&&this.minEphemerides.equals(rhs.minEphemerides))))&&((this.differencingSolveForCdRelativeDelta == rhs.differencingSolveForCdRelativeDelta)||((this.differencingSolveForCdRelativeDelta!= null)&&this.differencingSolveForCdRelativeDelta.equals(rhs.differencingSolveForCdRelativeDelta))))&&((this.maxEphemerides == rhs.maxEphemerides)||((this.maxEphemerides!= null)&&this.maxEphemerides.equals(rhs.maxEphemerides))))&&((this.scaleFactorStdForInSun == rhs.scaleFactorStdForInSun)||((this.scaleFactorStdForInSun!= null)&&this.scaleFactorStdForInSun.equals(rhs.scaleFactorStdForInSun))))&&((this.ephemerisAutoSelection == rhs.ephemerisAutoSelection)||((this.ephemerisAutoSelection!= null)&&this.ephemerisAutoSelection.equals(rhs.ephemerisAutoSelection))))&&((this.differencingSolveForCrRelativeDelta == rhs.differencingSolveForCrRelativeDelta)||((this.differencingSolveForCrRelativeDelta!= null)&&this.differencingSolveForCrRelativeDelta.equals(rhs.differencingSolveForCrRelativeDelta))))&&((this.allowAdditionalEphemerides == rhs.allowAdditionalEphemerides)||((this.allowAdditionalEphemerides!= null)&&this.allowAdditionalEphemerides.equals(rhs.allowAdditionalEphemerides))))&&((this.filterResiduals == rhs.filterResiduals)||((this.filterResiduals!= null)&&this.filterResiduals.equals(rhs.filterResiduals))))&&((this.rmsMaxIterations == rhs.rmsMaxIterations)||((this.rmsMaxIterations!= null)&&this.rmsMaxIterations.equals(rhs.rmsMaxIterations))))&&((this.solveForCd == rhs.solveForCd)||((this.solveForCd!= null)&&this.solveForCd.equals(rhs.solveForCd))))&&((this.useMaximumFitSpan == rhs.useMaximumFitSpan)||((this.useMaximumFitSpan!= null)&&this.useMaximumFitSpan.equals(rhs.useMaximumFitSpan))))&&((this.rmsThreshold == rhs.rmsThreshold)||((this.rmsThreshold!= null)&&this.rmsThreshold.equals(rhs.rmsThreshold))))&&((this.enableLevenbergMarquardt == rhs.enableLevenbergMarquardt)||((this.enableLevenbergMarquardt!= null)&&this.enableLevenbergMarquardt.equals(rhs.enableLevenbergMarquardt))))&&((this.residualFilterThreshold == rhs.residualFilterThreshold)||((this.residualFilterThreshold!= null)&&this.residualFilterThreshold.equals(rhs.residualFilterThreshold))));
    }

}
