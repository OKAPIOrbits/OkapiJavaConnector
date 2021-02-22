
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OpmMetaData
 * <p>
 * Meta data as needed for the CCSDS OPM data type.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OBJECT_NAME",
    "OBJECT_ID",
    "CENTER_NAME",
    "REF_FRAME",
    "REF_FRAME_EPOCH",
    "TIME_SYSTEM"
})
public class OpmMetaData {

    /**
     * Only used for new output.
     * 
     */
    @JsonProperty("OBJECT_NAME")
    @JsonPropertyDescription("Only used for new output.")
    private String objectName = "Unspecified";
    /**
     * Only used for new output.
     * 
     */
    @JsonProperty("OBJECT_ID")
    @JsonPropertyDescription("Only used for new output.")
    private String objectId = "Unspecified";
    /**
     * CenterName
     * <p>
     * Center name. Note that only EARTH is supported.
     * (Required)
     * 
     */
    @JsonProperty("CENTER_NAME")
    @JsonPropertyDescription("Center name. Note that only EARTH is supported.")
    private com.okapiorbits.platform.science.jobs.json.OemMetaData.CenterName centerName = com.okapiorbits.platform.science.jobs.json.OemMetaData.CenterName.fromValue("EARTH");
    /**
     * RefFrame
     * <p>
     * Reference frame. Note currently only GCRF, ITRF2000 and TEME are supported.
     * (Required)
     * 
     */
    @JsonProperty("REF_FRAME")
    @JsonPropertyDescription("Reference frame. Note currently only GCRF, ITRF2000 and TEME are supported.")
    private com.okapiorbits.platform.science.jobs.json.OemMetaData.RefFrame refFrame = com.okapiorbits.platform.science.jobs.json.OemMetaData.RefFrame.fromValue("GCRF");
    /**
     * Input given here is currently not evaluated.
     * 
     */
    @JsonProperty("REF_FRAME_EPOCH")
    @JsonPropertyDescription("Input given here is currently not evaluated.")
    private String refFrameEpoch;
    /**
     * TimeSystem
     * <p>
     * Time system in use. Note that only UTC is supported.
     * (Required)
     * 
     */
    @JsonProperty("TIME_SYSTEM")
    @JsonPropertyDescription("Time system in use. Note that only UTC is supported.")
    private com.okapiorbits.platform.science.jobs.json.OemMetaData.TimeSystem timeSystem = com.okapiorbits.platform.science.jobs.json.OemMetaData.TimeSystem.fromValue("UTC");

    /**
     * Only used for new output.
     * 
     */
    @JsonProperty("OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    /**
     * Only used for new output.
     * 
     */
    @JsonProperty("OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * Only used for new output.
     * 
     */
    @JsonProperty("OBJECT_ID")
    public String getObjectId() {
        return objectId;
    }

    /**
     * Only used for new output.
     * 
     */
    @JsonProperty("OBJECT_ID")
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    /**
     * CenterName
     * <p>
     * Center name. Note that only EARTH is supported.
     * (Required)
     * 
     */
    @JsonProperty("CENTER_NAME")
    public com.okapiorbits.platform.science.jobs.json.OemMetaData.CenterName getCenterName() {
        return centerName;
    }

    /**
     * CenterName
     * <p>
     * Center name. Note that only EARTH is supported.
     * (Required)
     * 
     */
    @JsonProperty("CENTER_NAME")
    public void setCenterName(com.okapiorbits.platform.science.jobs.json.OemMetaData.CenterName centerName) {
        this.centerName = centerName;
    }

    /**
     * RefFrame
     * <p>
     * Reference frame. Note currently only GCRF, ITRF2000 and TEME are supported.
     * (Required)
     * 
     */
    @JsonProperty("REF_FRAME")
    public com.okapiorbits.platform.science.jobs.json.OemMetaData.RefFrame getRefFrame() {
        return refFrame;
    }

    /**
     * RefFrame
     * <p>
     * Reference frame. Note currently only GCRF, ITRF2000 and TEME are supported.
     * (Required)
     * 
     */
    @JsonProperty("REF_FRAME")
    public void setRefFrame(com.okapiorbits.platform.science.jobs.json.OemMetaData.RefFrame refFrame) {
        this.refFrame = refFrame;
    }

    /**
     * Input given here is currently not evaluated.
     * 
     */
    @JsonProperty("REF_FRAME_EPOCH")
    public String getRefFrameEpoch() {
        return refFrameEpoch;
    }

    /**
     * Input given here is currently not evaluated.
     * 
     */
    @JsonProperty("REF_FRAME_EPOCH")
    public void setRefFrameEpoch(String refFrameEpoch) {
        this.refFrameEpoch = refFrameEpoch;
    }

    /**
     * TimeSystem
     * <p>
     * Time system in use. Note that only UTC is supported.
     * (Required)
     * 
     */
    @JsonProperty("TIME_SYSTEM")
    public com.okapiorbits.platform.science.jobs.json.OemMetaData.TimeSystem getTimeSystem() {
        return timeSystem;
    }

    /**
     * TimeSystem
     * <p>
     * Time system in use. Note that only UTC is supported.
     * (Required)
     * 
     */
    @JsonProperty("TIME_SYSTEM")
    public void setTimeSystem(com.okapiorbits.platform.science.jobs.json.OemMetaData.TimeSystem timeSystem) {
        this.timeSystem = timeSystem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpmMetaData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("objectName");
        sb.append('=');
        sb.append(((this.objectName == null)?"<null>":this.objectName));
        sb.append(',');
        sb.append("objectId");
        sb.append('=');
        sb.append(((this.objectId == null)?"<null>":this.objectId));
        sb.append(',');
        sb.append("centerName");
        sb.append('=');
        sb.append(((this.centerName == null)?"<null>":this.centerName));
        sb.append(',');
        sb.append("refFrame");
        sb.append('=');
        sb.append(((this.refFrame == null)?"<null>":this.refFrame));
        sb.append(',');
        sb.append("refFrameEpoch");
        sb.append('=');
        sb.append(((this.refFrameEpoch == null)?"<null>":this.refFrameEpoch));
        sb.append(',');
        sb.append("timeSystem");
        sb.append('=');
        sb.append(((this.timeSystem == null)?"<null>":this.timeSystem));
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
        result = ((result* 31)+((this.refFrame == null)? 0 :this.refFrame.hashCode()));
        result = ((result* 31)+((this.timeSystem == null)? 0 :this.timeSystem.hashCode()));
        result = ((result* 31)+((this.objectName == null)? 0 :this.objectName.hashCode()));
        result = ((result* 31)+((this.objectId == null)? 0 :this.objectId.hashCode()));
        result = ((result* 31)+((this.centerName == null)? 0 :this.centerName.hashCode()));
        result = ((result* 31)+((this.refFrameEpoch == null)? 0 :this.refFrameEpoch.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpmMetaData) == false) {
            return false;
        }
        OpmMetaData rhs = ((OpmMetaData) other);
        return (((((((this.refFrame == rhs.refFrame)||((this.refFrame!= null)&&this.refFrame.equals(rhs.refFrame)))&&((this.timeSystem == rhs.timeSystem)||((this.timeSystem!= null)&&this.timeSystem.equals(rhs.timeSystem))))&&((this.objectName == rhs.objectName)||((this.objectName!= null)&&this.objectName.equals(rhs.objectName))))&&((this.objectId == rhs.objectId)||((this.objectId!= null)&&this.objectId.equals(rhs.objectId))))&&((this.centerName == rhs.centerName)||((this.centerName!= null)&&this.centerName.equals(rhs.centerName))))&&((this.refFrameEpoch == rhs.refFrameEpoch)||((this.refFrameEpoch!= null)&&this.refFrameEpoch.equals(rhs.refFrameEpoch))));
    }

}
