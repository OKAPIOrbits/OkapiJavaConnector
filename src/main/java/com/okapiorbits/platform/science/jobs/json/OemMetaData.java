
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
 * OemMetaData
 * <p>
 * Meta data as needed for the CCSDS OEM data type.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OBJECT_NAME",
    "OBJECT_ID",
    "CENTER_NAME",
    "REF_FRAME",
    "REF_FRAME_EPOCH",
    "TIME_SYSTEM",
    "START_TIME",
    "STOP_TIME",
    "DATA",
    "COMMENTS"
})
public class OemMetaData {

    /**
     * uninitialized if not provided with request
     * (Required)
     * 
     */
    @JsonProperty("OBJECT_NAME")
    @JsonPropertyDescription("uninitialized if not provided with request")
    private String objectName = "Unspecified";
    /**
     * uninitialized if not provided with request
     * (Required)
     * 
     */
    @JsonProperty("OBJECT_ID")
    @JsonPropertyDescription("uninitialized if not provided with request")
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
    private OemMetaData.CenterName centerName = OemMetaData.CenterName.fromValue("EARTH");
    /**
     * RefFrame
     * <p>
     * Reference frame. Note currently only GCRF, ITRF2000 and TEME are supported.
     * (Required)
     * 
     */
    @JsonProperty("REF_FRAME")
    @JsonPropertyDescription("Reference frame. Note currently only GCRF, ITRF2000 and TEME are supported.")
    private OemMetaData.RefFrame refFrame = OemMetaData.RefFrame.fromValue("GCRF");
    /**
     * uninitialized if not provided with request
     * 
     */
    @JsonProperty("REF_FRAME_EPOCH")
    @JsonPropertyDescription("uninitialized if not provided with request")
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
    private OemMetaData.TimeSystem timeSystem = OemMetaData.TimeSystem.fromValue("UTC");
    @JsonProperty("START_TIME")
    private Date startTime;
    @JsonProperty("STOP_TIME")
    private Date stopTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATA")
    private List<OpmData> data = new ArrayList<OpmData>();
    /**
     * Array of comments. Each entry relates to a COMMENT statement.
     * 
     */
    @JsonProperty("COMMENTS")
    @JsonPropertyDescription("Array of comments. Each entry relates to a COMMENT statement.")
    private List<String> comments = new ArrayList<String>();

    /**
     * uninitialized if not provided with request
     * (Required)
     * 
     */
    @JsonProperty("OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    /**
     * uninitialized if not provided with request
     * (Required)
     * 
     */
    @JsonProperty("OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * uninitialized if not provided with request
     * (Required)
     * 
     */
    @JsonProperty("OBJECT_ID")
    public String getObjectId() {
        return objectId;
    }

    /**
     * uninitialized if not provided with request
     * (Required)
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
    public OemMetaData.CenterName getCenterName() {
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
    public void setCenterName(OemMetaData.CenterName centerName) {
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
    public OemMetaData.RefFrame getRefFrame() {
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
    public void setRefFrame(OemMetaData.RefFrame refFrame) {
        this.refFrame = refFrame;
    }

    /**
     * uninitialized if not provided with request
     * 
     */
    @JsonProperty("REF_FRAME_EPOCH")
    public String getRefFrameEpoch() {
        return refFrameEpoch;
    }

    /**
     * uninitialized if not provided with request
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
    public OemMetaData.TimeSystem getTimeSystem() {
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
    public void setTimeSystem(OemMetaData.TimeSystem timeSystem) {
        this.timeSystem = timeSystem;
    }

    @JsonProperty("START_TIME")
    public Date getStartTime() {
        return startTime;
    }

    @JsonProperty("START_TIME")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("STOP_TIME")
    public Date getStopTime() {
        return stopTime;
    }

    @JsonProperty("STOP_TIME")
    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATA")
    public List<OpmData> getData() {
        return data;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATA")
    public void setData(List<OpmData> data) {
        this.data = data;
    }

    /**
     * Array of comments. Each entry relates to a COMMENT statement.
     * 
     */
    @JsonProperty("COMMENTS")
    public List<String> getComments() {
        return comments;
    }

    /**
     * Array of comments. Each entry relates to a COMMENT statement.
     * 
     */
    @JsonProperty("COMMENTS")
    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OemMetaData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("stopTime");
        sb.append('=');
        sb.append(((this.stopTime == null)?"<null>":this.stopTime));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
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
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.objectName == null)? 0 :this.objectName.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.stopTime == null)? 0 :this.stopTime.hashCode()));
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
        if ((other instanceof OemMetaData) == false) {
            return false;
        }
        OemMetaData rhs = ((OemMetaData) other);
        return (((((((((((this.refFrame == rhs.refFrame)||((this.refFrame!= null)&&this.refFrame.equals(rhs.refFrame)))&&((this.timeSystem == rhs.timeSystem)||((this.timeSystem!= null)&&this.timeSystem.equals(rhs.timeSystem))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.objectName == rhs.objectName)||((this.objectName!= null)&&this.objectName.equals(rhs.objectName))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.stopTime == rhs.stopTime)||((this.stopTime!= null)&&this.stopTime.equals(rhs.stopTime))))&&((this.objectId == rhs.objectId)||((this.objectId!= null)&&this.objectId.equals(rhs.objectId))))&&((this.centerName == rhs.centerName)||((this.centerName!= null)&&this.centerName.equals(rhs.centerName))))&&((this.refFrameEpoch == rhs.refFrameEpoch)||((this.refFrameEpoch!= null)&&this.refFrameEpoch.equals(rhs.refFrameEpoch))));
    }


    /**
     * CenterName
     * <p>
     * Center name. Note that only EARTH is supported.
     * 
     */
    public enum CenterName {

        EARTH("EARTH");
        private final String value;
        private final static Map<String, OemMetaData.CenterName> CONSTANTS = new HashMap<String, OemMetaData.CenterName>();

        static {
            for (OemMetaData.CenterName c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CenterName(String value) {
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
        public static OemMetaData.CenterName fromValue(String value) {
            OemMetaData.CenterName constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * RefFrame
     * <p>
     * Reference frame. Note currently only GCRF, ITRF2000 and TEME are supported.
     * 
     */
    public enum RefFrame {

        GCRF("GCRF"),
        TEME("TEME"),
        ITRF_2000("ITRF2000");
        private final String value;
        private final static Map<String, OemMetaData.RefFrame> CONSTANTS = new HashMap<String, OemMetaData.RefFrame>();

        static {
            for (OemMetaData.RefFrame c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private RefFrame(String value) {
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
        public static OemMetaData.RefFrame fromValue(String value) {
            OemMetaData.RefFrame constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * TimeSystem
     * <p>
     * Time system in use. Note that only UTC is supported.
     * 
     */
    public enum TimeSystem {

        UTC("UTC");
        private final String value;
        private final static Map<String, OemMetaData.TimeSystem> CONSTANTS = new HashMap<String, OemMetaData.TimeSystem>();

        static {
            for (OemMetaData.TimeSystem c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TimeSystem(String value) {
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
        public static OemMetaData.TimeSystem fromValue(String value) {
            OemMetaData.TimeSystem constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
