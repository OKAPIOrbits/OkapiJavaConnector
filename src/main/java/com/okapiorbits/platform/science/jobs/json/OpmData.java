
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
 * OpmData
 * <p>
 * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EPOCH",
    "X",
    "Y",
    "Z",
    "X_DOT",
    "Y_DOT",
    "Z_DOT",
    "MASS",
    "SOLAR_RAD_COEFF",
    "DRAG_AREA",
    "DRAG_COEFF",
    "COV_REF_FRAME",
    "CX_X",
    "CY_X",
    "CY_Y",
    "CZ_X",
    "CZ_Y",
    "CZ_Z",
    "CX_DOT_X",
    "CX_DOT_Y",
    "CX_DOT_Z",
    "CX_DOT_X_DOT",
    "CY_DOT_X",
    "CY_DOT_Y",
    "CY_DOT_Z",
    "CY_DOT_X_DOT",
    "CY_DOT_Y_DOT",
    "CZ_DOT_X",
    "CZ_DOT_Y",
    "CZ_DOT_Z",
    "CZ_DOT_X_DOT",
    "CZ_DOT_Y_DOT",
    "CZ_DOT_Z_DOT",
    "MANEUVERS",
    "USER_DEFINED_THRUST_UNCERTAINTY",
    "USER_DEFINED_THRUST_POINTING_UNCERTAINTY",
    "USER_DEFINED_BC"
})
public class OpmData {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EPOCH")
    private Date epoch;
    /**
     * In km
     * (Required)
     * 
     */
    @JsonProperty("X")
    @JsonPropertyDescription("In km")
    private Double x;
    /**
     * In km
     * (Required)
     * 
     */
    @JsonProperty("Y")
    @JsonPropertyDescription("In km")
    private Double y;
    /**
     * In km
     * (Required)
     * 
     */
    @JsonProperty("Z")
    @JsonPropertyDescription("In km")
    private Double z;
    /**
     * In km/s
     * (Required)
     * 
     */
    @JsonProperty("X_DOT")
    @JsonPropertyDescription("In km/s")
    private Double xDot;
    /**
     * In km/s
     * (Required)
     * 
     */
    @JsonProperty("Y_DOT")
    @JsonPropertyDescription("In km/s")
    private Double yDot;
    /**
     * In km/s
     * (Required)
     * 
     */
    @JsonProperty("Z_DOT")
    @JsonPropertyDescription("In km/s")
    private Double zDot;
    /**
     * In kg
     * 
     */
    @JsonProperty("MASS")
    @JsonPropertyDescription("In kg")
    private Double mass = 1.0D;
    @JsonProperty("SOLAR_RAD_COEFF")
    private Double solarRadCoeff = 1.3D;
    /**
     * In m^2
     * 
     */
    @JsonProperty("DRAG_AREA")
    @JsonPropertyDescription("In m^2")
    private Double dragArea = 1.0D;
    @JsonProperty("DRAG_COEFF")
    private Double dragCoeff = 2.2D;
    /**
     * CovRefFrame
     * <p>
     * Frame of covariance. Must be RTN or RSW. Must be given, if covariance is given.
     * 
     */
    @JsonProperty("COV_REF_FRAME")
    @JsonPropertyDescription("Frame of covariance. Must be RTN or RSW. Must be given, if covariance is given.")
    private OpmData.CovRefFrame covRefFrame = OpmData.CovRefFrame.fromValue("RTN");
    /**
     * Covariance matrix [1,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_X")
    @JsonPropertyDescription("Covariance matrix [1,1] in km^2. All Covariance values not given are assumed 0.")
    private Double cxX = 0.0D;
    /**
     * Covariance matrix [2,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_X")
    @JsonPropertyDescription("Covariance matrix [2,1] in km^2. All Covariance values not given are assumed 0.")
    private Double cyX = 0.0D;
    /**
     * Covariance matrix [2,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_Y")
    @JsonPropertyDescription("Covariance matrix [2,2] in km^2. All Covariance values not given are assumed 0.")
    private Double cyY = 0.0D;
    /**
     * Covariance matrix [3,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_X")
    @JsonPropertyDescription("Covariance matrix [3,1] in km^2. All Covariance values not given are assumed 0.")
    private Double czX = 0.0D;
    /**
     * Covariance matrix [3,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_Y")
    @JsonPropertyDescription("Covariance matrix [3,2] in km^2. All Covariance values not given are assumed 0.")
    private Double czY = 0.0D;
    /**
     * Covariance matrix [3,3] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_Z")
    @JsonPropertyDescription("Covariance matrix [3,3] in km^2. All Covariance values not given are assumed 0.")
    private Double czZ = 0.0D;
    /**
     * Covariance matrix [4,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_X")
    @JsonPropertyDescription("Covariance matrix [4,1] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cxDotX = 0.0D;
    /**
     * Covariance matrix [4,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_Y")
    @JsonPropertyDescription("Covariance matrix [4,2] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cxDotY = 0.0D;
    /**
     * Covariance matrix [4,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_Z")
    @JsonPropertyDescription("Covariance matrix [4,3] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cxDotZ = 0.0D;
    /**
     * Covariance matrix [4,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_X_DOT")
    @JsonPropertyDescription("Covariance matrix [4,4] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double cxDotXDot = 0.0D;
    /**
     * Covariance matrix [5,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_X")
    @JsonPropertyDescription("Covariance matrix [5,1] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cyDotX = 0.0D;
    /**
     * Covariance matrix [5,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_Y")
    @JsonPropertyDescription("Covariance matrix [5,2] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cyDotY = 0.0D;
    /**
     * Covariance matrix [5,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_Z")
    @JsonPropertyDescription("Covariance matrix [5,3] in km^2/s. All Covariance values not given are assumed 0.")
    private Double cyDotZ = 0.0D;
    /**
     * Covariance matrix [5,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_X_DOT")
    @JsonPropertyDescription("Covariance matrix [5,4] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double cyDotXDot = 0.0D;
    /**
     * Covariance matrix [5,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_Y_DOT")
    @JsonPropertyDescription("Covariance matrix [5,5] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double cyDotYDot = 0.0D;
    /**
     * Covariance matrix [6,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_X")
    @JsonPropertyDescription("Covariance matrix [6,1] in km^2/s. All Covariance values not given are assumed 0.")
    private Double czDotX = 0.0D;
    /**
     * Covariance matrix [6,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Y")
    @JsonPropertyDescription("Covariance matrix [6,2] in km^2/s. All Covariance values not given are assumed 0.")
    private Double czDotY = 0.0D;
    /**
     * Covariance matrix [6,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Z")
    @JsonPropertyDescription("Covariance matrix [6,3] in km^2/s. All Covariance values not given are assumed 0.")
    private Double czDotZ = 0.0D;
    /**
     * Covariance matrix [6,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_X_DOT")
    @JsonPropertyDescription("Covariance matrix [6,4] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double czDotXDot = 0.0D;
    /**
     * Covariance matrix [6,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Y_DOT")
    @JsonPropertyDescription("Covariance matrix [6,5] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double czDotYDot = 0.0D;
    /**
     * Covariance matrix [6,6] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Z_DOT")
    @JsonPropertyDescription("Covariance matrix [6,6] in km^2/s^2. All Covariance values not given are assumed 0.")
    private Double czDotZDot = 0.0D;
    @JsonProperty("MANEUVERS")
    private List<OpmManeuver> maneuvers = new ArrayList<OpmManeuver>();
    /**
     * Thrust uncertainty relative to the acceleration / -
     * 
     */
    @JsonProperty("USER_DEFINED_THRUST_UNCERTAINTY")
    @JsonPropertyDescription("Thrust uncertainty relative to the acceleration / -")
    private Double userDefinedThrustUncertainty = 0.0D;
    /**
     * Maximum uncertainty in pointing the thrust vector / arc seconds
     * 
     */
    @JsonProperty("USER_DEFINED_THRUST_POINTING_UNCERTAINTY")
    @JsonPropertyDescription("Maximum uncertainty in pointing the thrust vector / arc seconds")
    private Double userDefinedThrustPointingUncertainty = 0.0D;
    /**
     * Ballistic Coefficient
     * 
     */
    @JsonProperty("USER_DEFINED_BC")
    @JsonPropertyDescription("Ballistic Coefficient")
    private Double userDefinedBc;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EPOCH")
    public Date getEpoch() {
        return epoch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EPOCH")
    public void setEpoch(Date epoch) {
        this.epoch = epoch;
    }

    /**
     * In km
     * (Required)
     * 
     */
    @JsonProperty("X")
    public Double getX() {
        return x;
    }

    /**
     * In km
     * (Required)
     * 
     */
    @JsonProperty("X")
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * In km
     * (Required)
     * 
     */
    @JsonProperty("Y")
    public Double getY() {
        return y;
    }

    /**
     * In km
     * (Required)
     * 
     */
    @JsonProperty("Y")
    public void setY(Double y) {
        this.y = y;
    }

    /**
     * In km
     * (Required)
     * 
     */
    @JsonProperty("Z")
    public Double getZ() {
        return z;
    }

    /**
     * In km
     * (Required)
     * 
     */
    @JsonProperty("Z")
    public void setZ(Double z) {
        this.z = z;
    }

    /**
     * In km/s
     * 
     */
    @JsonProperty("X_DOT")
    public Double getXDot() {
        return xDot;
    }

    /**
     * In km/s
     * 
     */
    @JsonProperty("X_DOT")
    public void setXDot(Double xDot) {
        this.xDot = xDot;
    }

    /**
     * In km/s
     * 
     */
    @JsonProperty("Y_DOT")
    public Double getYDot() {
        return yDot;
    }

    /**
     * In km/s
     * 
     */
    @JsonProperty("Y_DOT")
    public void setYDot(Double yDot) {
        this.yDot = yDot;
    }

    /**
     * In km/s
     * 
     */
    @JsonProperty("Z_DOT")
    public Double getZDot() {
        return zDot;
    }

    /**
     * In km/s
     * 
     */
    @JsonProperty("Z_DOT")
    public void setZDot(Double zDot) {
        this.zDot = zDot;
    }

    /**
     * In kg
     * 
     */
    @JsonProperty("MASS")
    public Double getMass() {
        return mass;
    }

    /**
     * In kg
     * 
     */
    @JsonProperty("MASS")
    public void setMass(Double mass) {
        this.mass = mass;
    }

    @JsonProperty("SOLAR_RAD_COEFF")
    public Double getSolarRadCoeff() {
        return solarRadCoeff;
    }

    @JsonProperty("SOLAR_RAD_COEFF")
    public void setSolarRadCoeff(Double solarRadCoeff) {
        this.solarRadCoeff = solarRadCoeff;
    }

    /**
     * In m^2
     * 
     */
    @JsonProperty("DRAG_AREA")
    public Double getDragArea() {
        return dragArea;
    }

    /**
     * In m^2
     * 
     */
    @JsonProperty("DRAG_AREA")
    public void setDragArea(Double dragArea) {
        this.dragArea = dragArea;
    }

    @JsonProperty("DRAG_COEFF")
    public Double getDragCoeff() {
        return dragCoeff;
    }

    @JsonProperty("DRAG_COEFF")
    public void setDragCoeff(Double dragCoeff) {
        this.dragCoeff = dragCoeff;
    }

    /**
     * CovRefFrame
     * <p>
     * Frame of covariance. Must be RTN or RSW. Must be given, if covariance is given.
     * 
     */
    @JsonProperty("COV_REF_FRAME")
    public OpmData.CovRefFrame getCovRefFrame() {
        return covRefFrame;
    }

    /**
     * CovRefFrame
     * <p>
     * Frame of covariance. Must be RTN or RSW. Must be given, if covariance is given.
     * 
     */
    @JsonProperty("COV_REF_FRAME")
    public void setCovRefFrame(OpmData.CovRefFrame covRefFrame) {
        this.covRefFrame = covRefFrame;
    }

    /**
     * Covariance matrix [1,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_X")
    public Double getCxX() {
        return cxX;
    }

    /**
     * Covariance matrix [1,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_X")
    public void setCxX(Double cxX) {
        this.cxX = cxX;
    }

    /**
     * Covariance matrix [2,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_X")
    public Double getCyX() {
        return cyX;
    }

    /**
     * Covariance matrix [2,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_X")
    public void setCyX(Double cyX) {
        this.cyX = cyX;
    }

    /**
     * Covariance matrix [2,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_Y")
    public Double getCyY() {
        return cyY;
    }

    /**
     * Covariance matrix [2,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_Y")
    public void setCyY(Double cyY) {
        this.cyY = cyY;
    }

    /**
     * Covariance matrix [3,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_X")
    public Double getCzX() {
        return czX;
    }

    /**
     * Covariance matrix [3,1] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_X")
    public void setCzX(Double czX) {
        this.czX = czX;
    }

    /**
     * Covariance matrix [3,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_Y")
    public Double getCzY() {
        return czY;
    }

    /**
     * Covariance matrix [3,2] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_Y")
    public void setCzY(Double czY) {
        this.czY = czY;
    }

    /**
     * Covariance matrix [3,3] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_Z")
    public Double getCzZ() {
        return czZ;
    }

    /**
     * Covariance matrix [3,3] in km^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_Z")
    public void setCzZ(Double czZ) {
        this.czZ = czZ;
    }

    /**
     * Covariance matrix [4,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_X")
    public Double getCxDotX() {
        return cxDotX;
    }

    /**
     * Covariance matrix [4,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_X")
    public void setCxDotX(Double cxDotX) {
        this.cxDotX = cxDotX;
    }

    /**
     * Covariance matrix [4,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_Y")
    public Double getCxDotY() {
        return cxDotY;
    }

    /**
     * Covariance matrix [4,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_Y")
    public void setCxDotY(Double cxDotY) {
        this.cxDotY = cxDotY;
    }

    /**
     * Covariance matrix [4,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_Z")
    public Double getCxDotZ() {
        return cxDotZ;
    }

    /**
     * Covariance matrix [4,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_Z")
    public void setCxDotZ(Double cxDotZ) {
        this.cxDotZ = cxDotZ;
    }

    /**
     * Covariance matrix [4,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_X_DOT")
    public Double getCxDotXDot() {
        return cxDotXDot;
    }

    /**
     * Covariance matrix [4,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CX_DOT_X_DOT")
    public void setCxDotXDot(Double cxDotXDot) {
        this.cxDotXDot = cxDotXDot;
    }

    /**
     * Covariance matrix [5,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_X")
    public Double getCyDotX() {
        return cyDotX;
    }

    /**
     * Covariance matrix [5,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_X")
    public void setCyDotX(Double cyDotX) {
        this.cyDotX = cyDotX;
    }

    /**
     * Covariance matrix [5,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_Y")
    public Double getCyDotY() {
        return cyDotY;
    }

    /**
     * Covariance matrix [5,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_Y")
    public void setCyDotY(Double cyDotY) {
        this.cyDotY = cyDotY;
    }

    /**
     * Covariance matrix [5,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_Z")
    public Double getCyDotZ() {
        return cyDotZ;
    }

    /**
     * Covariance matrix [5,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_Z")
    public void setCyDotZ(Double cyDotZ) {
        this.cyDotZ = cyDotZ;
    }

    /**
     * Covariance matrix [5,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_X_DOT")
    public Double getCyDotXDot() {
        return cyDotXDot;
    }

    /**
     * Covariance matrix [5,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_X_DOT")
    public void setCyDotXDot(Double cyDotXDot) {
        this.cyDotXDot = cyDotXDot;
    }

    /**
     * Covariance matrix [5,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_Y_DOT")
    public Double getCyDotYDot() {
        return cyDotYDot;
    }

    /**
     * Covariance matrix [5,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CY_DOT_Y_DOT")
    public void setCyDotYDot(Double cyDotYDot) {
        this.cyDotYDot = cyDotYDot;
    }

    /**
     * Covariance matrix [6,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_X")
    public Double getCzDotX() {
        return czDotX;
    }

    /**
     * Covariance matrix [6,1] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_X")
    public void setCzDotX(Double czDotX) {
        this.czDotX = czDotX;
    }

    /**
     * Covariance matrix [6,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Y")
    public Double getCzDotY() {
        return czDotY;
    }

    /**
     * Covariance matrix [6,2] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Y")
    public void setCzDotY(Double czDotY) {
        this.czDotY = czDotY;
    }

    /**
     * Covariance matrix [6,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Z")
    public Double getCzDotZ() {
        return czDotZ;
    }

    /**
     * Covariance matrix [6,3] in km^2/s. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Z")
    public void setCzDotZ(Double czDotZ) {
        this.czDotZ = czDotZ;
    }

    /**
     * Covariance matrix [6,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_X_DOT")
    public Double getCzDotXDot() {
        return czDotXDot;
    }

    /**
     * Covariance matrix [6,4] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_X_DOT")
    public void setCzDotXDot(Double czDotXDot) {
        this.czDotXDot = czDotXDot;
    }

    /**
     * Covariance matrix [6,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Y_DOT")
    public Double getCzDotYDot() {
        return czDotYDot;
    }

    /**
     * Covariance matrix [6,5] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Y_DOT")
    public void setCzDotYDot(Double czDotYDot) {
        this.czDotYDot = czDotYDot;
    }

    /**
     * Covariance matrix [6,6] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Z_DOT")
    public Double getCzDotZDot() {
        return czDotZDot;
    }

    /**
     * Covariance matrix [6,6] in km^2/s^2. All Covariance values not given are assumed 0.
     * 
     */
    @JsonProperty("CZ_DOT_Z_DOT")
    public void setCzDotZDot(Double czDotZDot) {
        this.czDotZDot = czDotZDot;
    }

    @JsonProperty("MANEUVERS")
    public List<OpmManeuver> getManeuvers() {
        return maneuvers;
    }

    @JsonProperty("MANEUVERS")
    public void setManeuvers(List<OpmManeuver> maneuvers) {
        this.maneuvers = maneuvers;
    }

    /**
     * Thrust uncertainty relative to the acceleration / -
     * 
     */
    @JsonProperty("USER_DEFINED_THRUST_UNCERTAINTY")
    public Double getUserDefinedThrustUncertainty() {
        return userDefinedThrustUncertainty;
    }

    /**
     * Thrust uncertainty relative to the acceleration / -
     * 
     */
    @JsonProperty("USER_DEFINED_THRUST_UNCERTAINTY")
    public void setUserDefinedThrustUncertainty(Double userDefinedThrustUncertainty) {
        this.userDefinedThrustUncertainty = userDefinedThrustUncertainty;
    }

    /**
     * Maximum uncertainty in pointing the thrust vector / arc seconds
     * 
     */
    @JsonProperty("USER_DEFINED_THRUST_POINTING_UNCERTAINTY")
    public Double getUserDefinedThrustPointingUncertainty() {
        return userDefinedThrustPointingUncertainty;
    }

    /**
     * Maximum uncertainty in pointing the thrust vector / arc seconds
     * 
     */
    @JsonProperty("USER_DEFINED_THRUST_POINTING_UNCERTAINTY")
    public void setUserDefinedThrustPointingUncertainty(Double userDefinedThrustPointingUncertainty) {
        this.userDefinedThrustPointingUncertainty = userDefinedThrustPointingUncertainty;
    }

    /**
     * Ballistic Coefficient
     * 
     */
    @JsonProperty("USER_DEFINED_BC")
    public Double getUserDefinedBc() {
        return userDefinedBc;
    }

    /**
     * Ballistic Coefficient
     * 
     */
    @JsonProperty("USER_DEFINED_BC")
    public void setUserDefinedBc(Double userDefinedBc) {
        this.userDefinedBc = userDefinedBc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpmData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("epoch");
        sb.append('=');
        sb.append(((this.epoch == null)?"<null>":this.epoch));
        sb.append(',');
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
        sb.append("mass");
        sb.append('=');
        sb.append(((this.mass == null)?"<null>":this.mass));
        sb.append(',');
        sb.append("solarRadCoeff");
        sb.append('=');
        sb.append(((this.solarRadCoeff == null)?"<null>":this.solarRadCoeff));
        sb.append(',');
        sb.append("dragArea");
        sb.append('=');
        sb.append(((this.dragArea == null)?"<null>":this.dragArea));
        sb.append(',');
        sb.append("dragCoeff");
        sb.append('=');
        sb.append(((this.dragCoeff == null)?"<null>":this.dragCoeff));
        sb.append(',');
        sb.append("covRefFrame");
        sb.append('=');
        sb.append(((this.covRefFrame == null)?"<null>":this.covRefFrame));
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
        sb.append("maneuvers");
        sb.append('=');
        sb.append(((this.maneuvers == null)?"<null>":this.maneuvers));
        sb.append(',');
        sb.append("userDefinedThrustUncertainty");
        sb.append('=');
        sb.append(((this.userDefinedThrustUncertainty == null)?"<null>":this.userDefinedThrustUncertainty));
        sb.append(',');
        sb.append("userDefinedThrustPointingUncertainty");
        sb.append('=');
        sb.append(((this.userDefinedThrustPointingUncertainty == null)?"<null>":this.userDefinedThrustPointingUncertainty));
        sb.append(',');
        sb.append("userDefinedBc");
        sb.append('=');
        sb.append(((this.userDefinedBc == null)?"<null>":this.userDefinedBc));
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
        result = ((result* 31)+((this.dragCoeff == null)? 0 :this.dragCoeff.hashCode()));
        result = ((result* 31)+((this.czX == null)? 0 :this.czX.hashCode()));
        result = ((result* 31)+((this.czDotY == null)? 0 :this.czDotY.hashCode()));
        result = ((result* 31)+((this.czDotXDot == null)? 0 :this.czDotXDot.hashCode()));
        result = ((result* 31)+((this.czDotX == null)? 0 :this.czDotX.hashCode()));
        result = ((result* 31)+((this.cxX == null)? 0 :this.cxX.hashCode()));
        result = ((result* 31)+((this.czZ == null)? 0 :this.czZ.hashCode()));
        result = ((result* 31)+((this.czY == null)? 0 :this.czY.hashCode()));
        result = ((result* 31)+((this.cxDotXDot == null)? 0 :this.cxDotXDot.hashCode()));
        result = ((result* 31)+((this.czDotZDot == null)? 0 :this.czDotZDot.hashCode()));
        result = ((result* 31)+((this.xDot == null)? 0 :this.xDot.hashCode()));
        result = ((result* 31)+((this.cyDotXDot == null)? 0 :this.cyDotXDot.hashCode()));
        result = ((result* 31)+((this.mass == null)? 0 :this.mass.hashCode()));
        result = ((result* 31)+((this.epoch == null)? 0 :this.epoch.hashCode()));
        result = ((result* 31)+((this.czDotZ == null)? 0 :this.czDotZ.hashCode()));
        result = ((result* 31)+((this.solarRadCoeff == null)? 0 :this.solarRadCoeff.hashCode()));
        result = ((result* 31)+((this.zDot == null)? 0 :this.zDot.hashCode()));
        result = ((result* 31)+((this.userDefinedBc == null)? 0 :this.userDefinedBc.hashCode()));
        result = ((result* 31)+((this.maneuvers == null)? 0 :this.maneuvers.hashCode()));
        result = ((result* 31)+((this.cyDotYDot == null)? 0 :this.cyDotYDot.hashCode()));
        result = ((result* 31)+((this.cyY == null)? 0 :this.cyY.hashCode()));
        result = ((result* 31)+((this.cyX == null)? 0 :this.cyX.hashCode()));
        result = ((result* 31)+((this.czDotYDot == null)? 0 :this.czDotYDot.hashCode()));
        result = ((result* 31)+((this.yDot == null)? 0 :this.yDot.hashCode()));
        result = ((result* 31)+((this.covRefFrame == null)? 0 :this.covRefFrame.hashCode()));
        result = ((result* 31)+((this.dragArea == null)? 0 :this.dragArea.hashCode()));
        result = ((result* 31)+((this.cxDotZ == null)? 0 :this.cxDotZ.hashCode()));
        result = ((result* 31)+((this.cxDotY == null)? 0 :this.cxDotY.hashCode()));
        result = ((result* 31)+((this.cxDotX == null)? 0 :this.cxDotX.hashCode()));
        result = ((result* 31)+((this.userDefinedThrustUncertainty == null)? 0 :this.userDefinedThrustUncertainty.hashCode()));
        result = ((result* 31)+((this.userDefinedThrustPointingUncertainty == null)? 0 :this.userDefinedThrustPointingUncertainty.hashCode()));
        result = ((result* 31)+((this.x == null)? 0 :this.x.hashCode()));
        result = ((result* 31)+((this.y == null)? 0 :this.y.hashCode()));
        result = ((result* 31)+((this.z == null)? 0 :this.z.hashCode()));
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
        if ((other instanceof OpmData) == false) {
            return false;
        }
        OpmData rhs = ((OpmData) other);
        return ((((((((((((((((((((((((((((((((((((((this.dragCoeff == rhs.dragCoeff)||((this.dragCoeff!= null)&&this.dragCoeff.equals(rhs.dragCoeff)))&&((this.czX == rhs.czX)||((this.czX!= null)&&this.czX.equals(rhs.czX))))&&((this.czDotY == rhs.czDotY)||((this.czDotY!= null)&&this.czDotY.equals(rhs.czDotY))))&&((this.czDotXDot == rhs.czDotXDot)||((this.czDotXDot!= null)&&this.czDotXDot.equals(rhs.czDotXDot))))&&((this.czDotX == rhs.czDotX)||((this.czDotX!= null)&&this.czDotX.equals(rhs.czDotX))))&&((this.cxX == rhs.cxX)||((this.cxX!= null)&&this.cxX.equals(rhs.cxX))))&&((this.czZ == rhs.czZ)||((this.czZ!= null)&&this.czZ.equals(rhs.czZ))))&&((this.czY == rhs.czY)||((this.czY!= null)&&this.czY.equals(rhs.czY))))&&((this.cxDotXDot == rhs.cxDotXDot)||((this.cxDotXDot!= null)&&this.cxDotXDot.equals(rhs.cxDotXDot))))&&((this.czDotZDot == rhs.czDotZDot)||((this.czDotZDot!= null)&&this.czDotZDot.equals(rhs.czDotZDot))))&&((this.xDot == rhs.xDot)||((this.xDot!= null)&&this.xDot.equals(rhs.xDot))))&&((this.cyDotXDot == rhs.cyDotXDot)||((this.cyDotXDot!= null)&&this.cyDotXDot.equals(rhs.cyDotXDot))))&&((this.mass == rhs.mass)||((this.mass!= null)&&this.mass.equals(rhs.mass))))&&((this.epoch == rhs.epoch)||((this.epoch!= null)&&this.epoch.equals(rhs.epoch))))&&((this.czDotZ == rhs.czDotZ)||((this.czDotZ!= null)&&this.czDotZ.equals(rhs.czDotZ))))&&((this.solarRadCoeff == rhs.solarRadCoeff)||((this.solarRadCoeff!= null)&&this.solarRadCoeff.equals(rhs.solarRadCoeff))))&&((this.zDot == rhs.zDot)||((this.zDot!= null)&&this.zDot.equals(rhs.zDot))))&&((this.userDefinedBc == rhs.userDefinedBc)||((this.userDefinedBc!= null)&&this.userDefinedBc.equals(rhs.userDefinedBc))))&&((this.maneuvers == rhs.maneuvers)||((this.maneuvers!= null)&&this.maneuvers.equals(rhs.maneuvers))))&&((this.cyDotYDot == rhs.cyDotYDot)||((this.cyDotYDot!= null)&&this.cyDotYDot.equals(rhs.cyDotYDot))))&&((this.cyY == rhs.cyY)||((this.cyY!= null)&&this.cyY.equals(rhs.cyY))))&&((this.cyX == rhs.cyX)||((this.cyX!= null)&&this.cyX.equals(rhs.cyX))))&&((this.czDotYDot == rhs.czDotYDot)||((this.czDotYDot!= null)&&this.czDotYDot.equals(rhs.czDotYDot))))&&((this.yDot == rhs.yDot)||((this.yDot!= null)&&this.yDot.equals(rhs.yDot))))&&((this.covRefFrame == rhs.covRefFrame)||((this.covRefFrame!= null)&&this.covRefFrame.equals(rhs.covRefFrame))))&&((this.dragArea == rhs.dragArea)||((this.dragArea!= null)&&this.dragArea.equals(rhs.dragArea))))&&((this.cxDotZ == rhs.cxDotZ)||((this.cxDotZ!= null)&&this.cxDotZ.equals(rhs.cxDotZ))))&&((this.cxDotY == rhs.cxDotY)||((this.cxDotY!= null)&&this.cxDotY.equals(rhs.cxDotY))))&&((this.cxDotX == rhs.cxDotX)||((this.cxDotX!= null)&&this.cxDotX.equals(rhs.cxDotX))))&&((this.userDefinedThrustUncertainty == rhs.userDefinedThrustUncertainty)||((this.userDefinedThrustUncertainty!= null)&&this.userDefinedThrustUncertainty.equals(rhs.userDefinedThrustUncertainty))))&&((this.userDefinedThrustPointingUncertainty == rhs.userDefinedThrustPointingUncertainty)||((this.userDefinedThrustPointingUncertainty!= null)&&this.userDefinedThrustPointingUncertainty.equals(rhs.userDefinedThrustPointingUncertainty))))&&((this.x == rhs.x)||((this.x!= null)&&this.x.equals(rhs.x))))&&((this.y == rhs.y)||((this.y!= null)&&this.y.equals(rhs.y))))&&((this.z == rhs.z)||((this.z!= null)&&this.z.equals(rhs.z))))&&((this.cyDotX == rhs.cyDotX)||((this.cyDotX!= null)&&this.cyDotX.equals(rhs.cyDotX))))&&((this.cyDotZ == rhs.cyDotZ)||((this.cyDotZ!= null)&&this.cyDotZ.equals(rhs.cyDotZ))))&&((this.cyDotY == rhs.cyDotY)||((this.cyDotY!= null)&&this.cyDotY.equals(rhs.cyDotY))));
    }


    /**
     * CovRefFrame
     * <p>
     * Frame of covariance. Must be RTN or RSW. Must be given, if covariance is given.
     * 
     */
    public enum CovRefFrame {

        RTN("RTN"),
        RSW("RSW"),
        GCRF("GCRF");
        private final String value;
        private final static Map<String, OpmData.CovRefFrame> CONSTANTS = new HashMap<String, OpmData.CovRefFrame>();

        static {
            for (OpmData.CovRefFrame c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CovRefFrame(String value) {
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
        public static OpmData.CovRefFrame fromValue(String value) {
            OpmData.CovRefFrame constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
