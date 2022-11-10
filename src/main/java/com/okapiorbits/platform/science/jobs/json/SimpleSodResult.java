
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
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
 * SimpleSodResult
 * <p>
 * The statistical orbit determination result as Cartesian state vector (GCRF) and Keplerian elements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "x",
    "y",
    "z",
    "x_dot",
    "y_dot",
    "z_dot",
    "epoch",
    "epochGd",
    "semi-major-axis",
    "eccentricity",
    "inclination",
    "raan",
    "aop",
    "mean_anomaly",
    "true_anomaly",
    "residual_1",
    "residual_2",
    "residual_3",
    "residual_4",
    "residual_5",
    "residual_6",
    "residual_2_uncorrected",
    "cd",
    "cr",
    "cx_x",
    "cy_x",
    "cy_y",
    "cz_x",
    "cz_y",
    "cz_z",
    "cx_dot_x",
    "cx_dot_y",
    "cx_dot_z",
    "cx_dot_x_dot",
    "cy_dot_x",
    "cy_dot_y",
    "cy_dot_z",
    "cy_dot_x_dot",
    "cy_dot_y_dot",
    "cz_dot_x",
    "cz_dot_y",
    "cz_dot_z",
    "cz_dot_x_dot",
    "cz_dot_y_dot",
    "cz_dot_z_dot"
})
public class SimpleSodResult {

    /**
     * im km
     * (Required)
     * 
     */
    @JsonProperty("x")
    @JsonPropertyDescription("im km")
    private Double x;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("y")
    @JsonPropertyDescription("in km")
    private Double y;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("z")
    @JsonPropertyDescription("in km")
    private Double z;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("x_dot")
    @JsonPropertyDescription("in km/s")
    private Double xDot;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("y_dot")
    @JsonPropertyDescription("in km/s")
    private Double yDot;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("z_dot")
    @JsonPropertyDescription("in km/s")
    private Double zDot;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("epoch")
    private Double epoch;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("epochGd")
    private Date epochGd;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("semi-major-axis")
    @JsonPropertyDescription("in km/s")
    private Double semiMajorAxis;
    /**
     * / -
     * (Required)
     * 
     */
    @JsonProperty("eccentricity")
    @JsonPropertyDescription("/ -")
    private Double eccentricity;
    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("inclination")
    @JsonPropertyDescription("/ deg")
    private Double inclination;
    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("raan")
    @JsonPropertyDescription("/ deg")
    private Double raan;
    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("aop")
    @JsonPropertyDescription("/ deg")
    private Double aop;
    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("mean_anomaly")
    @JsonPropertyDescription("/ deg")
    private Double meanAnomaly;
    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("true_anomaly")
    @JsonPropertyDescription("/ deg")
    private Double trueAnomaly;
    /**
     * This can be the range in km, cartesian X component / km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_1")
    @JsonPropertyDescription("This can be the range in km, cartesian X component / km. This depends on the measurements used in the orbit determination process")
    private Double residual1;
    /**
     * This can be the angle_1 in rad or cartesian Y component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_2")
    @JsonPropertyDescription("This can be the angle_1 in rad or cartesian Y component in km. This depends on the measurements used in the orbit determination process")
    private Double residual2;
    /**
     * This can be the angle_2 in rad scaled for the influence of angle_1 or cartesian Z component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_3")
    @JsonPropertyDescription("This can be the angle_2 in rad scaled for the influence of angle_1 or cartesian Z component in km. This depends on the measurements used in the orbit determination process")
    private Double residual3;
    /**
     * This can be the range-rate in km/s or cartesian X_DOT component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_4")
    @JsonPropertyDescription("This can be the range-rate in km/s or cartesian X_DOT component in km. This depends on the measurements used in the orbit determination process")
    private Double residual4;
    /**
     * This can be the angle_1_dot in deg/s or cartesian Y_DOT component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_5")
    @JsonPropertyDescription("This can be the angle_1_dot in deg/s or cartesian Y_DOT component in km. This depends on the measurements used in the orbit determination process")
    private Double residual5;
    /**
     * This can be the angle_2_dot in deg/s or cartesian Z_DOT component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_6")
    @JsonPropertyDescription("This can be the angle_2_dot in deg/s or cartesian Z_DOT component in km. This depends on the measurements used in the orbit determination process")
    private Double residual6;
    /**
     * This can be the angle_2 without scaling for the influence of angle_1
     * 
     */
    @JsonProperty("residual_2_uncorrected")
    @JsonPropertyDescription("This can be the angle_2 without scaling for the influence of angle_1")
    private Double residual2Uncorrected;
    /**
     * drag coefficient / -
     * 
     */
    @JsonProperty("cd")
    @JsonPropertyDescription("drag coefficient / -")
    private Double cd = 2.2D;
    /**
     * reflectivity coefficient / -
     * 
     */
    @JsonProperty("cr")
    @JsonPropertyDescription("reflectivity coefficient / -")
    private Double cr = 1.3D;
    /**
     * Covariance matrix [1,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_x")
    @JsonPropertyDescription("Covariance matrix [1,1] in km^2. All Covariance values not given are assumed 0.")
    private Double cxX;
    /**
     * Covariance matrix [2,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_x")
    @JsonPropertyDescription("Covariance matrix [2,1] in km^2. All Covariance values not given are assumed 0.")
    private Double cyX;
    /**
     * Covariance matrix [2,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_y")
    @JsonPropertyDescription("Covariance matrix [2,2] in km^2. All Covariance values not given are assumed 0.")
    private Double cyY;
    /**
     * Covariance matrix [3,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_x")
    @JsonPropertyDescription("Covariance matrix [3,1] in km^2. All Covariance values not given are assumed 0.")
    private Double czX;
    /**
     * Covariance matrix [3,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_y")
    @JsonPropertyDescription("Covariance matrix [3,2] in km^2. All Covariance values not given are assumed 0.")
    private Double czY;
    /**
     * Covariance matrix [3,3] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_z")
    @JsonPropertyDescription("Covariance matrix [3,3] in km^2. All Covariance values not given are assumed 0.")
    private Double czZ;
    /**
     * Covariance matrix [4,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_x")
    @JsonPropertyDescription("Covariance matrix [4,1] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cxDotX;
    /**
     * Covariance matrix [4,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_y")
    @JsonPropertyDescription("Covariance matrix [4,2] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cxDotY;
    /**
     * Covariance matrix [4,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_z")
    @JsonPropertyDescription("Covariance matrix [4,3] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cxDotZ;
    /**
     * Covariance matrix [4,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_x_dot")
    @JsonPropertyDescription("Covariance matrix [4,4] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double cxDotXDot;
    /**
     * Covariance matrix [5,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_x")
    @JsonPropertyDescription("Covariance matrix [5,1] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cyDotX;
    /**
     * Covariance matrix [5,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_y")
    @JsonPropertyDescription("Covariance matrix [5,2] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cyDotY;
    /**
     * Covariance matrix [5,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_z")
    @JsonPropertyDescription("Covariance matrix [5,3] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cyDotZ;
    /**
     * Covariance matrix [5,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_x_dot")
    @JsonPropertyDescription("Covariance matrix [5,4] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double cyDotXDot;
    /**
     * Covariance matrix [5,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_y_dot")
    @JsonPropertyDescription("Covariance matrix [5,5] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double cyDotYDot;
    /**
     * Covariance matrix [6,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_x")
    @JsonPropertyDescription("Covariance matrix [6,1] in km^2/s. All Covariance values not given are assumed 0.")
    private Double czDotX;
    /**
     * Covariance matrix [6,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_y")
    @JsonPropertyDescription("Covariance matrix [6,2] in km^2/s. All Covariance values not given are assumed 0.")
    private Double czDotY;
    /**
     * Covariance matrix [6,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_z")
    @JsonPropertyDescription("Covariance matrix [6,3] in km^2/s. All Covariance values not given are assumed 0.")
    private Double czDotZ;
    /**
     * Covariance matrix [6,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_x_dot")
    @JsonPropertyDescription("Covariance matrix [6,4] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double czDotXDot;
    /**
     * Covariance matrix [6,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_y_dot")
    @JsonPropertyDescription("Covariance matrix [6,5] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double czDotYDot;
    /**
     * Covariance matrix [6,6] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_z_dot")
    @JsonPropertyDescription("Covariance matrix [6,6] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double czDotZDot;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * im km
     * (Required)
     * 
     */
    @JsonProperty("x")
    public Double getX() {
        return x;
    }

    /**
     * im km
     * (Required)
     * 
     */
    @JsonProperty("x")
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("y")
    public Double getY() {
        return y;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("y")
    public void setY(Double y) {
        this.y = y;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("z")
    public Double getZ() {
        return z;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("z")
    public void setZ(Double z) {
        this.z = z;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("x_dot")
    public Double getxDot() {
        return xDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("x_dot")
    public void setxDot(Double xDot) {
        this.xDot = xDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("y_dot")
    public Double getyDot() {
        return yDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("y_dot")
    public void setyDot(Double yDot) {
        this.yDot = yDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("z_dot")
    public Double getzDot() {
        return zDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("z_dot")
    public void setzDot(Double zDot) {
        this.zDot = zDot;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("epoch")
    public Double getEpoch() {
        return epoch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("epoch")
    public void setEpoch(Double epoch) {
        this.epoch = epoch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("epochGd")
    public Date getEpochGd() {
        return epochGd;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("epochGd")
    public void setEpochGd(Date epochGd) {
        this.epochGd = epochGd;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("semi-major-axis")
    public Double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("semi-major-axis")
    public void setSemiMajorAxis(Double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    /**
     * / -
     * (Required)
     * 
     */
    @JsonProperty("eccentricity")
    public Double getEccentricity() {
        return eccentricity;
    }

    /**
     * / -
     * (Required)
     * 
     */
    @JsonProperty("eccentricity")
    public void setEccentricity(Double eccentricity) {
        this.eccentricity = eccentricity;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("inclination")
    public Double getInclination() {
        return inclination;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("inclination")
    public void setInclination(Double inclination) {
        this.inclination = inclination;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("raan")
    public Double getRaan() {
        return raan;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("raan")
    public void setRaan(Double raan) {
        this.raan = raan;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("aop")
    public Double getAop() {
        return aop;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("aop")
    public void setAop(Double aop) {
        this.aop = aop;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("mean_anomaly")
    public Double getMeanAnomaly() {
        return meanAnomaly;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("mean_anomaly")
    public void setMeanAnomaly(Double meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("true_anomaly")
    public Double getTrueAnomaly() {
        return trueAnomaly;
    }

    /**
     * / deg
     * (Required)
     * 
     */
    @JsonProperty("true_anomaly")
    public void setTrueAnomaly(Double trueAnomaly) {
        this.trueAnomaly = trueAnomaly;
    }

    /**
     * This can be the range in km, cartesian X component / km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_1")
    public Double getResidual1() {
        return residual1;
    }

    /**
     * This can be the range in km, cartesian X component / km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_1")
    public void setResidual1(Double residual1) {
        this.residual1 = residual1;
    }

    /**
     * This can be the angle_1 in rad or cartesian Y component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_2")
    public Double getResidual2() {
        return residual2;
    }

    /**
     * This can be the angle_1 in rad or cartesian Y component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_2")
    public void setResidual2(Double residual2) {
        this.residual2 = residual2;
    }

    /**
     * This can be the angle_2 in rad scaled for the influence of angle_1 or cartesian Z component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_3")
    public Double getResidual3() {
        return residual3;
    }

    /**
     * This can be the angle_2 in rad scaled for the influence of angle_1 or cartesian Z component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_3")
    public void setResidual3(Double residual3) {
        this.residual3 = residual3;
    }

    /**
     * This can be the range-rate in km/s or cartesian X_DOT component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_4")
    public Double getResidual4() {
        return residual4;
    }

    /**
     * This can be the range-rate in km/s or cartesian X_DOT component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_4")
    public void setResidual4(Double residual4) {
        this.residual4 = residual4;
    }

    /**
     * This can be the angle_1_dot in deg/s or cartesian Y_DOT component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_5")
    public Double getResidual5() {
        return residual5;
    }

    /**
     * This can be the angle_1_dot in deg/s or cartesian Y_DOT component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_5")
    public void setResidual5(Double residual5) {
        this.residual5 = residual5;
    }

    /**
     * This can be the angle_2_dot in deg/s or cartesian Z_DOT component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_6")
    public Double getResidual6() {
        return residual6;
    }

    /**
     * This can be the angle_2_dot in deg/s or cartesian Z_DOT component in km. This depends on the measurements used in the orbit determination process
     * 
     */
    @JsonProperty("residual_6")
    public void setResidual6(Double residual6) {
        this.residual6 = residual6;
    }

    /**
     * This can be the angle_2 without scaling for the influence of angle_1
     * 
     */
    @JsonProperty("residual_2_uncorrected")
    public Double getResidual2Uncorrected() {
        return residual2Uncorrected;
    }

    /**
     * This can be the angle_2 without scaling for the influence of angle_1
     * 
     */
    @JsonProperty("residual_2_uncorrected")
    public void setResidual2Uncorrected(Double residual2Uncorrected) {
        this.residual2Uncorrected = residual2Uncorrected;
    }

    /**
     * drag coefficient / -
     * 
     */
    @JsonProperty("cd")
    public Double getCd() {
        return cd;
    }

    /**
     * drag coefficient / -
     * 
     */
    @JsonProperty("cd")
    public void setCd(Double cd) {
        this.cd = cd;
    }

    /**
     * reflectivity coefficient / -
     * 
     */
    @JsonProperty("cr")
    public Double getCr() {
        return cr;
    }

    /**
     * reflectivity coefficient / -
     * 
     */
    @JsonProperty("cr")
    public void setCr(Double cr) {
        this.cr = cr;
    }

    /**
     * Covariance matrix [1,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_x")
    public Double getCxX() {
        return cxX;
    }

    /**
     * Covariance matrix [1,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_x")
    public void setCxX(Double cxX) {
        this.cxX = cxX;
    }

    /**
     * Covariance matrix [2,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_x")
    public Double getCyX() {
        return cyX;
    }

    /**
     * Covariance matrix [2,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_x")
    public void setCyX(Double cyX) {
        this.cyX = cyX;
    }

    /**
     * Covariance matrix [2,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_y")
    public Double getCyY() {
        return cyY;
    }

    /**
     * Covariance matrix [2,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_y")
    public void setCyY(Double cyY) {
        this.cyY = cyY;
    }

    /**
     * Covariance matrix [3,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_x")
    public Double getCzX() {
        return czX;
    }

    /**
     * Covariance matrix [3,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_x")
    public void setCzX(Double czX) {
        this.czX = czX;
    }

    /**
     * Covariance matrix [3,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_y")
    public Double getCzY() {
        return czY;
    }

    /**
     * Covariance matrix [3,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_y")
    public void setCzY(Double czY) {
        this.czY = czY;
    }

    /**
     * Covariance matrix [3,3] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_z")
    public Double getCzZ() {
        return czZ;
    }

    /**
     * Covariance matrix [3,3] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_z")
    public void setCzZ(Double czZ) {
        this.czZ = czZ;
    }

    /**
     * Covariance matrix [4,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_x")
    public Double getCxDotX() {
        return cxDotX;
    }

    /**
     * Covariance matrix [4,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_x")
    public void setCxDotX(Double cxDotX) {
        this.cxDotX = cxDotX;
    }

    /**
     * Covariance matrix [4,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_y")
    public Double getCxDotY() {
        return cxDotY;
    }

    /**
     * Covariance matrix [4,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_y")
    public void setCxDotY(Double cxDotY) {
        this.cxDotY = cxDotY;
    }

    /**
     * Covariance matrix [4,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_z")
    public Double getCxDotZ() {
        return cxDotZ;
    }

    /**
     * Covariance matrix [4,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_z")
    public void setCxDotZ(Double cxDotZ) {
        this.cxDotZ = cxDotZ;
    }

    /**
     * Covariance matrix [4,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_x_dot")
    public Double getCxDotXDot() {
        return cxDotXDot;
    }

    /**
     * Covariance matrix [4,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cx_dot_x_dot")
    public void setCxDotXDot(Double cxDotXDot) {
        this.cxDotXDot = cxDotXDot;
    }

    /**
     * Covariance matrix [5,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_x")
    public Double getCyDotX() {
        return cyDotX;
    }

    /**
     * Covariance matrix [5,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_x")
    public void setCyDotX(Double cyDotX) {
        this.cyDotX = cyDotX;
    }

    /**
     * Covariance matrix [5,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_y")
    public Double getCyDotY() {
        return cyDotY;
    }

    /**
     * Covariance matrix [5,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_y")
    public void setCyDotY(Double cyDotY) {
        this.cyDotY = cyDotY;
    }

    /**
     * Covariance matrix [5,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_z")
    public Double getCyDotZ() {
        return cyDotZ;
    }

    /**
     * Covariance matrix [5,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_z")
    public void setCyDotZ(Double cyDotZ) {
        this.cyDotZ = cyDotZ;
    }

    /**
     * Covariance matrix [5,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_x_dot")
    public Double getCyDotXDot() {
        return cyDotXDot;
    }

    /**
     * Covariance matrix [5,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_x_dot")
    public void setCyDotXDot(Double cyDotXDot) {
        this.cyDotXDot = cyDotXDot;
    }

    /**
     * Covariance matrix [5,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_y_dot")
    public Double getCyDotYDot() {
        return cyDotYDot;
    }

    /**
     * Covariance matrix [5,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cy_dot_y_dot")
    public void setCyDotYDot(Double cyDotYDot) {
        this.cyDotYDot = cyDotYDot;
    }

    /**
     * Covariance matrix [6,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_x")
    public Double getCzDotX() {
        return czDotX;
    }

    /**
     * Covariance matrix [6,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_x")
    public void setCzDotX(Double czDotX) {
        this.czDotX = czDotX;
    }

    /**
     * Covariance matrix [6,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_y")
    public Double getCzDotY() {
        return czDotY;
    }

    /**
     * Covariance matrix [6,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_y")
    public void setCzDotY(Double czDotY) {
        this.czDotY = czDotY;
    }

    /**
     * Covariance matrix [6,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_z")
    public Double getCzDotZ() {
        return czDotZ;
    }

    /**
     * Covariance matrix [6,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_z")
    public void setCzDotZ(Double czDotZ) {
        this.czDotZ = czDotZ;
    }

    /**
     * Covariance matrix [6,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_x_dot")
    public Double getCzDotXDot() {
        return czDotXDot;
    }

    /**
     * Covariance matrix [6,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_x_dot")
    public void setCzDotXDot(Double czDotXDot) {
        this.czDotXDot = czDotXDot;
    }

    /**
     * Covariance matrix [6,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_y_dot")
    public Double getCzDotYDot() {
        return czDotYDot;
    }

    /**
     * Covariance matrix [6,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_y_dot")
    public void setCzDotYDot(Double czDotYDot) {
        this.czDotYDot = czDotYDot;
    }

    /**
     * Covariance matrix [6,6] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_z_dot")
    public Double getCzDotZDot() {
        return czDotZDot;
    }

    /**
     * Covariance matrix [6,6] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("cz_dot_z_dot")
    public void setCzDotZDot(Double czDotZDot) {
        this.czDotZDot = czDotZDot;
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
        sb.append(SimpleSodResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("x");
        sb.append('=');
        sb.append(((this.x == null)?"<null>":this.x));
        sb.append(',');
        sb.append("y");
        sb.append('=');
        sb.append(((this.y == null)?"<null>":this.y));
        sb.append(',');
        sb.append("z");
        sb.append('=');
        sb.append(((this.z == null)?"<null>":this.z));
        sb.append(',');
        sb.append("xDot");
        sb.append('=');
        sb.append(((this.xDot == null)?"<null>":this.xDot));
        sb.append(',');
        sb.append("yDot");
        sb.append('=');
        sb.append(((this.yDot == null)?"<null>":this.yDot));
        sb.append(',');
        sb.append("zDot");
        sb.append('=');
        sb.append(((this.zDot == null)?"<null>":this.zDot));
        sb.append(',');
        sb.append("epoch");
        sb.append('=');
        sb.append(((this.epoch == null)?"<null>":this.epoch));
        sb.append(',');
        sb.append("epochGd");
        sb.append('=');
        sb.append(((this.epochGd == null)?"<null>":this.epochGd));
        sb.append(',');
        sb.append("semiMajorAxis");
        sb.append('=');
        sb.append(((this.semiMajorAxis == null)?"<null>":this.semiMajorAxis));
        sb.append(',');
        sb.append("eccentricity");
        sb.append('=');
        sb.append(((this.eccentricity == null)?"<null>":this.eccentricity));
        sb.append(',');
        sb.append("inclination");
        sb.append('=');
        sb.append(((this.inclination == null)?"<null>":this.inclination));
        sb.append(',');
        sb.append("raan");
        sb.append('=');
        sb.append(((this.raan == null)?"<null>":this.raan));
        sb.append(',');
        sb.append("aop");
        sb.append('=');
        sb.append(((this.aop == null)?"<null>":this.aop));
        sb.append(',');
        sb.append("meanAnomaly");
        sb.append('=');
        sb.append(((this.meanAnomaly == null)?"<null>":this.meanAnomaly));
        sb.append(',');
        sb.append("trueAnomaly");
        sb.append('=');
        sb.append(((this.trueAnomaly == null)?"<null>":this.trueAnomaly));
        sb.append(',');
        sb.append("residual1");
        sb.append('=');
        sb.append(((this.residual1 == null)?"<null>":this.residual1));
        sb.append(',');
        sb.append("residual2");
        sb.append('=');
        sb.append(((this.residual2 == null)?"<null>":this.residual2));
        sb.append(',');
        sb.append("residual3");
        sb.append('=');
        sb.append(((this.residual3 == null)?"<null>":this.residual3));
        sb.append(',');
        sb.append("residual4");
        sb.append('=');
        sb.append(((this.residual4 == null)?"<null>":this.residual4));
        sb.append(',');
        sb.append("residual5");
        sb.append('=');
        sb.append(((this.residual5 == null)?"<null>":this.residual5));
        sb.append(',');
        sb.append("residual6");
        sb.append('=');
        sb.append(((this.residual6 == null)?"<null>":this.residual6));
        sb.append(',');
        sb.append("residual2Uncorrected");
        sb.append('=');
        sb.append(((this.residual2Uncorrected == null)?"<null>":this.residual2Uncorrected));
        sb.append(',');
        sb.append("cd");
        sb.append('=');
        sb.append(((this.cd == null)?"<null>":this.cd));
        sb.append(',');
        sb.append("cr");
        sb.append('=');
        sb.append(((this.cr == null)?"<null>":this.cr));
        sb.append(',');
        sb.append("cxX");
        sb.append('=');
        sb.append(((this.cxX == null)?"<null>":this.cxX));
        sb.append(',');
        sb.append("cyX");
        sb.append('=');
        sb.append(((this.cyX == null)?"<null>":this.cyX));
        sb.append(',');
        sb.append("cyY");
        sb.append('=');
        sb.append(((this.cyY == null)?"<null>":this.cyY));
        sb.append(',');
        sb.append("czX");
        sb.append('=');
        sb.append(((this.czX == null)?"<null>":this.czX));
        sb.append(',');
        sb.append("czY");
        sb.append('=');
        sb.append(((this.czY == null)?"<null>":this.czY));
        sb.append(',');
        sb.append("czZ");
        sb.append('=');
        sb.append(((this.czZ == null)?"<null>":this.czZ));
        sb.append(',');
        sb.append("cxDotX");
        sb.append('=');
        sb.append(((this.cxDotX == null)?"<null>":this.cxDotX));
        sb.append(',');
        sb.append("cxDotY");
        sb.append('=');
        sb.append(((this.cxDotY == null)?"<null>":this.cxDotY));
        sb.append(',');
        sb.append("cxDotZ");
        sb.append('=');
        sb.append(((this.cxDotZ == null)?"<null>":this.cxDotZ));
        sb.append(',');
        sb.append("cxDotXDot");
        sb.append('=');
        sb.append(((this.cxDotXDot == null)?"<null>":this.cxDotXDot));
        sb.append(',');
        sb.append("cyDotX");
        sb.append('=');
        sb.append(((this.cyDotX == null)?"<null>":this.cyDotX));
        sb.append(',');
        sb.append("cyDotY");
        sb.append('=');
        sb.append(((this.cyDotY == null)?"<null>":this.cyDotY));
        sb.append(',');
        sb.append("cyDotZ");
        sb.append('=');
        sb.append(((this.cyDotZ == null)?"<null>":this.cyDotZ));
        sb.append(',');
        sb.append("cyDotXDot");
        sb.append('=');
        sb.append(((this.cyDotXDot == null)?"<null>":this.cyDotXDot));
        sb.append(',');
        sb.append("cyDotYDot");
        sb.append('=');
        sb.append(((this.cyDotYDot == null)?"<null>":this.cyDotYDot));
        sb.append(',');
        sb.append("czDotX");
        sb.append('=');
        sb.append(((this.czDotX == null)?"<null>":this.czDotX));
        sb.append(',');
        sb.append("czDotY");
        sb.append('=');
        sb.append(((this.czDotY == null)?"<null>":this.czDotY));
        sb.append(',');
        sb.append("czDotZ");
        sb.append('=');
        sb.append(((this.czDotZ == null)?"<null>":this.czDotZ));
        sb.append(',');
        sb.append("czDotXDot");
        sb.append('=');
        sb.append(((this.czDotXDot == null)?"<null>":this.czDotXDot));
        sb.append(',');
        sb.append("czDotYDot");
        sb.append('=');
        sb.append(((this.czDotYDot == null)?"<null>":this.czDotYDot));
        sb.append(',');
        sb.append("czDotZDot");
        sb.append('=');
        sb.append(((this.czDotZDot == null)?"<null>":this.czDotZDot));
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
        result = ((result* 31)+((this.czX == null)? 0 :this.czX.hashCode()));
        result = ((result* 31)+((this.czDotY == null)? 0 :this.czDotY.hashCode()));
        result = ((result* 31)+((this.czDotXDot == null)? 0 :this.czDotXDot.hashCode()));
        result = ((result* 31)+((this.czDotX == null)? 0 :this.czDotX.hashCode()));
        result = ((result* 31)+((this.cxX == null)? 0 :this.cxX.hashCode()));
        result = ((result* 31)+((this.czZ == null)? 0 :this.czZ.hashCode()));
        result = ((result* 31)+((this.aop == null)? 0 :this.aop.hashCode()));
        result = ((result* 31)+((this.czY == null)? 0 :this.czY.hashCode()));
        result = ((result* 31)+((this.cxDotXDot == null)? 0 :this.cxDotXDot.hashCode()));
        result = ((result* 31)+((this.czDotZDot == null)? 0 :this.czDotZDot.hashCode()));
        result = ((result* 31)+((this.xDot == null)? 0 :this.xDot.hashCode()));
        result = ((result* 31)+((this.cyDotXDot == null)? 0 :this.cyDotXDot.hashCode()));
        result = ((result* 31)+((this.epoch == null)? 0 :this.epoch.hashCode()));
        result = ((result* 31)+((this.czDotZ == null)? 0 :this.czDotZ.hashCode()));
        result = ((result* 31)+((this.semiMajorAxis == null)? 0 :this.semiMajorAxis.hashCode()));
        result = ((result* 31)+((this.zDot == null)? 0 :this.zDot.hashCode()));
        result = ((result* 31)+((this.inclination == null)? 0 :this.inclination.hashCode()));
        result = ((result* 31)+((this.cd == null)? 0 :this.cd.hashCode()));
        result = ((result* 31)+((this.cyDotYDot == null)? 0 :this.cyDotYDot.hashCode()));
        result = ((result* 31)+((this.cyY == null)? 0 :this.cyY.hashCode()));
        result = ((result* 31)+((this.cyX == null)? 0 :this.cyX.hashCode()));
        result = ((result* 31)+((this.residual2Uncorrected == null)? 0 :this.residual2Uncorrected.hashCode()));
        result = ((result* 31)+((this.czDotYDot == null)? 0 :this.czDotYDot.hashCode()));
        result = ((result* 31)+((this.yDot == null)? 0 :this.yDot.hashCode()));
        result = ((result* 31)+((this.eccentricity == null)? 0 :this.eccentricity.hashCode()));
        result = ((result* 31)+((this.raan == null)? 0 :this.raan.hashCode()));
        result = ((result* 31)+((this.residual2 == null)? 0 :this.residual2 .hashCode()));
        result = ((result* 31)+((this.residual1 == null)? 0 :this.residual1 .hashCode()));
        result = ((result* 31)+((this.cxDotZ == null)? 0 :this.cxDotZ.hashCode()));
        result = ((result* 31)+((this.residual4 == null)? 0 :this.residual4 .hashCode()));
        result = ((result* 31)+((this.cxDotY == null)? 0 :this.cxDotY.hashCode()));
        result = ((result* 31)+((this.residual3 == null)? 0 :this.residual3 .hashCode()));
        result = ((result* 31)+((this.cr == null)? 0 :this.cr.hashCode()));
        result = ((result* 31)+((this.cxDotX == null)? 0 :this.cxDotX.hashCode()));
        result = ((result* 31)+((this.residual6 == null)? 0 :this.residual6 .hashCode()));
        result = ((result* 31)+((this.residual5 == null)? 0 :this.residual5 .hashCode()));
        result = ((result* 31)+((this.x == null)? 0 :this.x.hashCode()));
        result = ((result* 31)+((this.epochGd == null)? 0 :this.epochGd.hashCode()));
        result = ((result* 31)+((this.y == null)? 0 :this.y.hashCode()));
        result = ((result* 31)+((this.trueAnomaly == null)? 0 :this.trueAnomaly.hashCode()));
        result = ((result* 31)+((this.z == null)? 0 :this.z.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.meanAnomaly == null)? 0 :this.meanAnomaly.hashCode()));
        result = ((result* 31)+((this.cyDotX == null)? 0 :this.cyDotX.hashCode()));
        result = ((result* 31)+((this.cyDotZ == null)? 0 :this.cyDotZ.hashCode()));
        result = ((result* 31)+((this.cyDotY == null)? 0 :this.cyDotY.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimpleSodResult) == false) {
            return false;
        }
        SimpleSodResult rhs = ((SimpleSodResult) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((this.czX == rhs.czX)||((this.czX!= null)&&this.czX.equals(rhs.czX)))&&((this.czDotY == rhs.czDotY)||((this.czDotY!= null)&&this.czDotY.equals(rhs.czDotY))))&&((this.czDotXDot == rhs.czDotXDot)||((this.czDotXDot!= null)&&this.czDotXDot.equals(rhs.czDotXDot))))&&((this.czDotX == rhs.czDotX)||((this.czDotX!= null)&&this.czDotX.equals(rhs.czDotX))))&&((this.cxX == rhs.cxX)||((this.cxX!= null)&&this.cxX.equals(rhs.cxX))))&&((this.czZ == rhs.czZ)||((this.czZ!= null)&&this.czZ.equals(rhs.czZ))))&&((this.aop == rhs.aop)||((this.aop!= null)&&this.aop.equals(rhs.aop))))&&((this.czY == rhs.czY)||((this.czY!= null)&&this.czY.equals(rhs.czY))))&&((this.cxDotXDot == rhs.cxDotXDot)||((this.cxDotXDot!= null)&&this.cxDotXDot.equals(rhs.cxDotXDot))))&&((this.czDotZDot == rhs.czDotZDot)||((this.czDotZDot!= null)&&this.czDotZDot.equals(rhs.czDotZDot))))&&((this.xDot == rhs.xDot)||((this.xDot!= null)&&this.xDot.equals(rhs.xDot))))&&((this.cyDotXDot == rhs.cyDotXDot)||((this.cyDotXDot!= null)&&this.cyDotXDot.equals(rhs.cyDotXDot))))&&((this.epoch == rhs.epoch)||((this.epoch!= null)&&this.epoch.equals(rhs.epoch))))&&((this.czDotZ == rhs.czDotZ)||((this.czDotZ!= null)&&this.czDotZ.equals(rhs.czDotZ))))&&((this.semiMajorAxis == rhs.semiMajorAxis)||((this.semiMajorAxis!= null)&&this.semiMajorAxis.equals(rhs.semiMajorAxis))))&&((this.zDot == rhs.zDot)||((this.zDot!= null)&&this.zDot.equals(rhs.zDot))))&&((this.inclination == rhs.inclination)||((this.inclination!= null)&&this.inclination.equals(rhs.inclination))))&&((this.cd == rhs.cd)||((this.cd!= null)&&this.cd.equals(rhs.cd))))&&((this.cyDotYDot == rhs.cyDotYDot)||((this.cyDotYDot!= null)&&this.cyDotYDot.equals(rhs.cyDotYDot))))&&((this.cyY == rhs.cyY)||((this.cyY!= null)&&this.cyY.equals(rhs.cyY))))&&((this.cyX == rhs.cyX)||((this.cyX!= null)&&this.cyX.equals(rhs.cyX))))&&((this.residual2Uncorrected == rhs.residual2Uncorrected)||((this.residual2Uncorrected!= null)&&this.residual2Uncorrected.equals(rhs.residual2Uncorrected))))&&((this.czDotYDot == rhs.czDotYDot)||((this.czDotYDot!= null)&&this.czDotYDot.equals(rhs.czDotYDot))))&&((this.yDot == rhs.yDot)||((this.yDot!= null)&&this.yDot.equals(rhs.yDot))))&&((this.eccentricity == rhs.eccentricity)||((this.eccentricity!= null)&&this.eccentricity.equals(rhs.eccentricity))))&&((this.raan == rhs.raan)||((this.raan!= null)&&this.raan.equals(rhs.raan))))&&((this.residual2 == rhs.residual2)||((this.residual2 != null)&&this.residual2 .equals(rhs.residual2))))&&((this.residual1 == rhs.residual1)||((this.residual1 != null)&&this.residual1 .equals(rhs.residual1))))&&((this.cxDotZ == rhs.cxDotZ)||((this.cxDotZ!= null)&&this.cxDotZ.equals(rhs.cxDotZ))))&&((this.residual4 == rhs.residual4)||((this.residual4 != null)&&this.residual4 .equals(rhs.residual4))))&&((this.cxDotY == rhs.cxDotY)||((this.cxDotY!= null)&&this.cxDotY.equals(rhs.cxDotY))))&&((this.residual3 == rhs.residual3)||((this.residual3 != null)&&this.residual3 .equals(rhs.residual3))))&&((this.cr == rhs.cr)||((this.cr!= null)&&this.cr.equals(rhs.cr))))&&((this.cxDotX == rhs.cxDotX)||((this.cxDotX!= null)&&this.cxDotX.equals(rhs.cxDotX))))&&((this.residual6 == rhs.residual6)||((this.residual6 != null)&&this.residual6 .equals(rhs.residual6))))&&((this.residual5 == rhs.residual5)||((this.residual5 != null)&&this.residual5 .equals(rhs.residual5))))&&((this.x == rhs.x)||((this.x!= null)&&this.x.equals(rhs.x))))&&((this.epochGd == rhs.epochGd)||((this.epochGd!= null)&&this.epochGd.equals(rhs.epochGd))))&&((this.y == rhs.y)||((this.y!= null)&&this.y.equals(rhs.y))))&&((this.trueAnomaly == rhs.trueAnomaly)||((this.trueAnomaly!= null)&&this.trueAnomaly.equals(rhs.trueAnomaly))))&&((this.z == rhs.z)||((this.z!= null)&&this.z.equals(rhs.z))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.meanAnomaly == rhs.meanAnomaly)||((this.meanAnomaly!= null)&&this.meanAnomaly.equals(rhs.meanAnomaly))))&&((this.cyDotX == rhs.cyDotX)||((this.cyDotX!= null)&&this.cyDotX.equals(rhs.cyDotX))))&&((this.cyDotZ == rhs.cyDotZ)||((this.cyDotZ!= null)&&this.cyDotZ.equals(rhs.cyDotZ))))&&((this.cyDotY == rhs.cyDotY)||((this.cyDotY!= null)&&this.cyDotY.equals(rhs.cyDotY))));
    }

}
