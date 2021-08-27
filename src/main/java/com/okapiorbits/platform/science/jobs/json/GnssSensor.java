
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GnssSensor
 * <p>
 * A GNSS sensor of a satellite, including settings on orbit determination and propagation
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "x_std",
    "y_std",
    "z_std",
    "x_dot_std",
    "y_dot_std",
    "z_dot_std",
    "enable_rms_quality_check",
    "rms_quality_check_threshold",
    "enable_accepted_residuals_quality_check",
    "accepted_residuals_ratio",
    "orbit_determination_settings",
    "propagation_settings"
})
public class GnssSensor {

    /**
     * Standard deviation of x / km
     * 
     */
    @JsonProperty("x_std")
    @JsonPropertyDescription("Standard deviation of x / km")
    private Double xStd;
    /**
     * Standard deviation of y / km
     * 
     */
    @JsonProperty("y_std")
    @JsonPropertyDescription("Standard deviation of y / km")
    private Double yStd;
    /**
     * Standard deviation of z / km
     * 
     */
    @JsonProperty("z_std")
    @JsonPropertyDescription("Standard deviation of z / km")
    private Double zStd;
    /**
     * Standard deviation of x / km
     * 
     */
    @JsonProperty("x_dot_std")
    @JsonPropertyDescription("Standard deviation of x / km")
    private Double xDotStd;
    /**
     * Standard deviation of y / km
     * 
     */
    @JsonProperty("y_dot_std")
    @JsonPropertyDescription("Standard deviation of y / km")
    private Double yDotStd;
    /**
     * Standard deviation of z / km
     * 
     */
    @JsonProperty("z_dot_std")
    @JsonPropertyDescription("Standard deviation of z / km")
    private Double zDotStd;
    /**
     * Enable quality check of the ephemerides based on the RMS
     * 
     */
    @JsonProperty("enable_rms_quality_check")
    @JsonPropertyDescription("Enable quality check of the ephemerides based on the RMS")
    private Boolean enableRmsQualityCheck;
    /**
     * RMS threshold above which the orbit determination is considered failed.
     * 
     */
    @JsonProperty("rms_quality_check_threshold")
    @JsonPropertyDescription("RMS threshold above which the orbit determination is considered failed.")
    private Double rmsQualityCheckThreshold;
    /**
     * Enable quality check of the ephemerides based on the accepted/rejected residuals ratio.
     * 
     */
    @JsonProperty("enable_accepted_residuals_quality_check")
    @JsonPropertyDescription("Enable quality check of the ephemerides based on the accepted/rejected residuals ratio.")
    private Boolean enableAcceptedResidualsQualityCheck;
    /**
     * Ratio below which the orbit determination is considered failed.
     * 
     */
    @JsonProperty("accepted_residuals_ratio")
    @JsonPropertyDescription("Ratio below which the orbit determination is considered failed.")
    private Double acceptedResidualsRatio;
    /**
     * OrbitDeterminationSettings
     * <p>
     * Orbit determination settings
     * 
     */
    @JsonProperty("orbit_determination_settings")
    @JsonPropertyDescription("Orbit determination settings")
    private OrbitDeterminationSettings orbitDeterminationSettings;
    /**
     * SharedPropagationSettings
     * <p>
     * Shared propagator settings valid for different numerical propagators (e.g. NEPTUNE and Orekit)
     * 
     */
    @JsonProperty("propagation_settings")
    @JsonPropertyDescription("Shared propagator settings valid for different numerical propagators (e.g. NEPTUNE and Orekit)")
    private SharedPropagationSettings propagationSettings;

    /**
     * Standard deviation of x / km
     * 
     */
    @JsonProperty("x_std")
    public Double getxStd() {
        return xStd;
    }

    /**
     * Standard deviation of x / km
     * 
     */
    @JsonProperty("x_std")
    public void setxStd(Double xStd) {
        this.xStd = xStd;
    }

    /**
     * Standard deviation of y / km
     * 
     */
    @JsonProperty("y_std")
    public Double getyStd() {
        return yStd;
    }

    /**
     * Standard deviation of y / km
     * 
     */
    @JsonProperty("y_std")
    public void setyStd(Double yStd) {
        this.yStd = yStd;
    }

    /**
     * Standard deviation of z / km
     * 
     */
    @JsonProperty("z_std")
    public Double getzStd() {
        return zStd;
    }

    /**
     * Standard deviation of z / km
     * 
     */
    @JsonProperty("z_std")
    public void setzStd(Double zStd) {
        this.zStd = zStd;
    }

    /**
     * Standard deviation of x / km
     * 
     */
    @JsonProperty("x_dot_std")
    public Double getxDotStd() {
        return xDotStd;
    }

    /**
     * Standard deviation of x / km
     * 
     */
    @JsonProperty("x_dot_std")
    public void setxDotStd(Double xDotStd) {
        this.xDotStd = xDotStd;
    }

    /**
     * Standard deviation of y / km
     * 
     */
    @JsonProperty("y_dot_std")
    public Double getyDotStd() {
        return yDotStd;
    }

    /**
     * Standard deviation of y / km
     * 
     */
    @JsonProperty("y_dot_std")
    public void setyDotStd(Double yDotStd) {
        this.yDotStd = yDotStd;
    }

    /**
     * Standard deviation of z / km
     * 
     */
    @JsonProperty("z_dot_std")
    public Double getzDotStd() {
        return zDotStd;
    }

    /**
     * Standard deviation of z / km
     * 
     */
    @JsonProperty("z_dot_std")
    public void setzDotStd(Double zDotStd) {
        this.zDotStd = zDotStd;
    }

    /**
     * Enable quality check of the ephemerides based on the RMS
     * 
     */
    @JsonProperty("enable_rms_quality_check")
    public Boolean getEnableRmsQualityCheck() {
        return enableRmsQualityCheck;
    }

    /**
     * Enable quality check of the ephemerides based on the RMS
     * 
     */
    @JsonProperty("enable_rms_quality_check")
    public void setEnableRmsQualityCheck(Boolean enableRmsQualityCheck) {
        this.enableRmsQualityCheck = enableRmsQualityCheck;
    }

    /**
     * RMS threshold above which the orbit determination is considered failed.
     * 
     */
    @JsonProperty("rms_quality_check_threshold")
    public Double getRmsQualityCheckThreshold() {
        return rmsQualityCheckThreshold;
    }

    /**
     * RMS threshold above which the orbit determination is considered failed.
     * 
     */
    @JsonProperty("rms_quality_check_threshold")
    public void setRmsQualityCheckThreshold(Double rmsQualityCheckThreshold) {
        this.rmsQualityCheckThreshold = rmsQualityCheckThreshold;
    }

    /**
     * Enable quality check of the ephemerides based on the accepted/rejected residuals ratio.
     * 
     */
    @JsonProperty("enable_accepted_residuals_quality_check")
    public Boolean getEnableAcceptedResidualsQualityCheck() {
        return enableAcceptedResidualsQualityCheck;
    }

    /**
     * Enable quality check of the ephemerides based on the accepted/rejected residuals ratio.
     * 
     */
    @JsonProperty("enable_accepted_residuals_quality_check")
    public void setEnableAcceptedResidualsQualityCheck(Boolean enableAcceptedResidualsQualityCheck) {
        this.enableAcceptedResidualsQualityCheck = enableAcceptedResidualsQualityCheck;
    }

    /**
     * Ratio below which the orbit determination is considered failed.
     * 
     */
    @JsonProperty("accepted_residuals_ratio")
    public Double getAcceptedResidualsRatio() {
        return acceptedResidualsRatio;
    }

    /**
     * Ratio below which the orbit determination is considered failed.
     * 
     */
    @JsonProperty("accepted_residuals_ratio")
    public void setAcceptedResidualsRatio(Double acceptedResidualsRatio) {
        this.acceptedResidualsRatio = acceptedResidualsRatio;
    }

    /**
     * OrbitDeterminationSettings
     * <p>
     * Orbit determination settings
     * 
     */
    @JsonProperty("orbit_determination_settings")
    public OrbitDeterminationSettings getOrbitDeterminationSettings() {
        return orbitDeterminationSettings;
    }

    /**
     * OrbitDeterminationSettings
     * <p>
     * Orbit determination settings
     * 
     */
    @JsonProperty("orbit_determination_settings")
    public void setOrbitDeterminationSettings(OrbitDeterminationSettings orbitDeterminationSettings) {
        this.orbitDeterminationSettings = orbitDeterminationSettings;
    }

    /**
     * SharedPropagationSettings
     * <p>
     * Shared propagator settings valid for different numerical propagators (e.g. NEPTUNE and Orekit)
     * 
     */
    @JsonProperty("propagation_settings")
    public SharedPropagationSettings getPropagationSettings() {
        return propagationSettings;
    }

    /**
     * SharedPropagationSettings
     * <p>
     * Shared propagator settings valid for different numerical propagators (e.g. NEPTUNE and Orekit)
     * 
     */
    @JsonProperty("propagation_settings")
    public void setPropagationSettings(SharedPropagationSettings propagationSettings) {
        this.propagationSettings = propagationSettings;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GnssSensor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xStd");
        sb.append('=');
        sb.append(((this.xStd == null)?"<null>":this.xStd));
        sb.append(',');
        sb.append("yStd");
        sb.append('=');
        sb.append(((this.yStd == null)?"<null>":this.yStd));
        sb.append(',');
        sb.append("zStd");
        sb.append('=');
        sb.append(((this.zStd == null)?"<null>":this.zStd));
        sb.append(',');
        sb.append("xDotStd");
        sb.append('=');
        sb.append(((this.xDotStd == null)?"<null>":this.xDotStd));
        sb.append(',');
        sb.append("yDotStd");
        sb.append('=');
        sb.append(((this.yDotStd == null)?"<null>":this.yDotStd));
        sb.append(',');
        sb.append("zDotStd");
        sb.append('=');
        sb.append(((this.zDotStd == null)?"<null>":this.zDotStd));
        sb.append(',');
        sb.append("enableRmsQualityCheck");
        sb.append('=');
        sb.append(((this.enableRmsQualityCheck == null)?"<null>":this.enableRmsQualityCheck));
        sb.append(',');
        sb.append("rmsQualityCheckThreshold");
        sb.append('=');
        sb.append(((this.rmsQualityCheckThreshold == null)?"<null>":this.rmsQualityCheckThreshold));
        sb.append(',');
        sb.append("enableAcceptedResidualsQualityCheck");
        sb.append('=');
        sb.append(((this.enableAcceptedResidualsQualityCheck == null)?"<null>":this.enableAcceptedResidualsQualityCheck));
        sb.append(',');
        sb.append("acceptedResidualsRatio");
        sb.append('=');
        sb.append(((this.acceptedResidualsRatio == null)?"<null>":this.acceptedResidualsRatio));
        sb.append(',');
        sb.append("orbitDeterminationSettings");
        sb.append('=');
        sb.append(((this.orbitDeterminationSettings == null)?"<null>":this.orbitDeterminationSettings));
        sb.append(',');
        sb.append("propagationSettings");
        sb.append('=');
        sb.append(((this.propagationSettings == null)?"<null>":this.propagationSettings));
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
        result = ((result* 31)+((this.orbitDeterminationSettings == null)? 0 :this.orbitDeterminationSettings.hashCode()));
        result = ((result* 31)+((this.zDotStd == null)? 0 :this.zDotStd.hashCode()));
        result = ((result* 31)+((this.propagationSettings == null)? 0 :this.propagationSettings.hashCode()));
        result = ((result* 31)+((this.rmsQualityCheckThreshold == null)? 0 :this.rmsQualityCheckThreshold.hashCode()));
        result = ((result* 31)+((this.zStd == null)? 0 :this.zStd.hashCode()));
        result = ((result* 31)+((this.yStd == null)? 0 :this.yStd.hashCode()));
        result = ((result* 31)+((this.enableRmsQualityCheck == null)? 0 :this.enableRmsQualityCheck.hashCode()));
        result = ((result* 31)+((this.xDotStd == null)? 0 :this.xDotStd.hashCode()));
        result = ((result* 31)+((this.enableAcceptedResidualsQualityCheck == null)? 0 :this.enableAcceptedResidualsQualityCheck.hashCode()));
        result = ((result* 31)+((this.acceptedResidualsRatio == null)? 0 :this.acceptedResidualsRatio.hashCode()));
        result = ((result* 31)+((this.xStd == null)? 0 :this.xStd.hashCode()));
        result = ((result* 31)+((this.yDotStd == null)? 0 :this.yDotStd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GnssSensor) == false) {
            return false;
        }
        GnssSensor rhs = ((GnssSensor) other);
        return (((((((((((((this.orbitDeterminationSettings == rhs.orbitDeterminationSettings)||((this.orbitDeterminationSettings!= null)&&this.orbitDeterminationSettings.equals(rhs.orbitDeterminationSettings)))&&((this.zDotStd == rhs.zDotStd)||((this.zDotStd!= null)&&this.zDotStd.equals(rhs.zDotStd))))&&((this.propagationSettings == rhs.propagationSettings)||((this.propagationSettings!= null)&&this.propagationSettings.equals(rhs.propagationSettings))))&&((this.rmsQualityCheckThreshold == rhs.rmsQualityCheckThreshold)||((this.rmsQualityCheckThreshold!= null)&&this.rmsQualityCheckThreshold.equals(rhs.rmsQualityCheckThreshold))))&&((this.zStd == rhs.zStd)||((this.zStd!= null)&&this.zStd.equals(rhs.zStd))))&&((this.yStd == rhs.yStd)||((this.yStd!= null)&&this.yStd.equals(rhs.yStd))))&&((this.enableRmsQualityCheck == rhs.enableRmsQualityCheck)||((this.enableRmsQualityCheck!= null)&&this.enableRmsQualityCheck.equals(rhs.enableRmsQualityCheck))))&&((this.xDotStd == rhs.xDotStd)||((this.xDotStd!= null)&&this.xDotStd.equals(rhs.xDotStd))))&&((this.enableAcceptedResidualsQualityCheck == rhs.enableAcceptedResidualsQualityCheck)||((this.enableAcceptedResidualsQualityCheck!= null)&&this.enableAcceptedResidualsQualityCheck.equals(rhs.enableAcceptedResidualsQualityCheck))))&&((this.acceptedResidualsRatio == rhs.acceptedResidualsRatio)||((this.acceptedResidualsRatio!= null)&&this.acceptedResidualsRatio.equals(rhs.acceptedResidualsRatio))))&&((this.xStd == rhs.xStd)||((this.xStd!= null)&&this.xStd.equals(rhs.xStd))))&&((this.yDotStd == rhs.yDotStd)||((this.yDotStd!= null)&&this.yDotStd.equals(rhs.yDotStd))));
    }

}
