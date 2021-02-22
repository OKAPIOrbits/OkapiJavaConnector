
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * OpmManeuver
 * <p>
 * Optional maneuvers. Max. 5 maneuvers are accepted, all of them have to be in the propagation time frame. In contrast to CCSDS, the acceleration of the object is used! Furthermore, the change in mass is not considered at the moment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MAN_EPOCH_IGNITION",
    "MAN_DURATION",
    "MAN_REF_FRAME",
    "USER_DEFINED_MAN_A_1",
    "USER_DEFINED_MAN_A_2",
    "USER_DEFINED_MAN_A_3"
})
public class OpmManeuver {

    /**
     * Time when the manoeuver starts. !IMPORTANT! Stick to the format! If you reduce the format, the program assumes a lower (too low) precision of the date!
     * (Required)
     * 
     */
    @JsonProperty("MAN_EPOCH_IGNITION")
    @JsonPropertyDescription("Time when the manoeuver starts. !IMPORTANT! Stick to the format! If you reduce the format, the program assumes a lower (too low) precision of the date!")
    private Date manEpochIgnition;
    /**
     * Duration of the maneuver in seconds
     * (Required)
     * 
     */
    @JsonProperty("MAN_DURATION")
    @JsonPropertyDescription("Duration of the maneuver in seconds")
    private Double manDuration;
    /**
     * The reference frame for the maneuver. Only used for the maneuver. Currently, only RTN (satellite frame) is considered.
     * (Required)
     * 
     */
    @JsonProperty("MAN_REF_FRAME")
    @JsonPropertyDescription("The reference frame for the maneuver. Only used for the maneuver. Currently, only RTN (satellite frame) is considered.")
    private OpmManeuver.ManRefFrame manRefFrame;
    /**
     * The acceleration of the maneuver in km/s**2 in direction 1 of the reference frame.
     * (Required)
     * 
     */
    @JsonProperty("USER_DEFINED_MAN_A_1")
    @JsonPropertyDescription("The acceleration of the maneuver in km/s**2 in direction 1 of the reference frame.")
    private Double userDefinedManA1;
    /**
     * The acceleration of the maneuver in km/s**2 in direction 2 of the reference frame.
     * (Required)
     * 
     */
    @JsonProperty("USER_DEFINED_MAN_A_2")
    @JsonPropertyDescription("The acceleration of the maneuver in km/s**2 in direction 2 of the reference frame.")
    private Double userDefinedManA2;
    /**
     * The acceleration of the maneuver in km/s**2 in direction 3 of the reference frame.
     * (Required)
     * 
     */
    @JsonProperty("USER_DEFINED_MAN_A_3")
    @JsonPropertyDescription("The acceleration of the maneuver in km/s**2 in direction 3 of the reference frame.")
    private Double userDefinedManA3;

    /**
     * Time when the manoeuver starts. !IMPORTANT! Stick to the format! If you reduce the format, the program assumes a lower (too low) precision of the date!
     * (Required)
     * 
     */
    @JsonProperty("MAN_EPOCH_IGNITION")
    public Date getManEpochIgnition() {
        return manEpochIgnition;
    }

    /**
     * Time when the manoeuver starts. !IMPORTANT! Stick to the format! If you reduce the format, the program assumes a lower (too low) precision of the date!
     * (Required)
     * 
     */
    @JsonProperty("MAN_EPOCH_IGNITION")
    public void setManEpochIgnition(Date manEpochIgnition) {
        this.manEpochIgnition = manEpochIgnition;
    }

    /**
     * Duration of the maneuver in seconds
     * (Required)
     * 
     */
    @JsonProperty("MAN_DURATION")
    public Double getManDuration() {
        return manDuration;
    }

    /**
     * Duration of the maneuver in seconds
     * (Required)
     * 
     */
    @JsonProperty("MAN_DURATION")
    public void setManDuration(Double manDuration) {
        this.manDuration = manDuration;
    }

    /**
     * The reference frame for the maneuver. Only used for the maneuver. Currently, only RTN (satellite frame) is considered.
     * (Required)
     * 
     */
    @JsonProperty("MAN_REF_FRAME")
    public OpmManeuver.ManRefFrame getManRefFrame() {
        return manRefFrame;
    }

    /**
     * The reference frame for the maneuver. Only used for the maneuver. Currently, only RTN (satellite frame) is considered.
     * (Required)
     * 
     */
    @JsonProperty("MAN_REF_FRAME")
    public void setManRefFrame(OpmManeuver.ManRefFrame manRefFrame) {
        this.manRefFrame = manRefFrame;
    }

    /**
     * The acceleration of the maneuver in km/s**2 in direction 1 of the reference frame.
     * (Required)
     * 
     */
    @JsonProperty("USER_DEFINED_MAN_A_1")
    public Double getUserDefinedManA1() {
        return userDefinedManA1;
    }

    /**
     * The acceleration of the maneuver in km/s**2 in direction 1 of the reference frame.
     * (Required)
     * 
     */
    @JsonProperty("USER_DEFINED_MAN_A_1")
    public void setUserDefinedManA1(Double userDefinedManA1) {
        this.userDefinedManA1 = userDefinedManA1;
    }

    /**
     * The acceleration of the maneuver in km/s**2 in direction 2 of the reference frame.
     * (Required)
     * 
     */
    @JsonProperty("USER_DEFINED_MAN_A_2")
    public Double getUserDefinedManA2() {
        return userDefinedManA2;
    }

    /**
     * The acceleration of the maneuver in km/s**2 in direction 2 of the reference frame.
     * (Required)
     * 
     */
    @JsonProperty("USER_DEFINED_MAN_A_2")
    public void setUserDefinedManA2(Double userDefinedManA2) {
        this.userDefinedManA2 = userDefinedManA2;
    }

    /**
     * The acceleration of the maneuver in km/s**2 in direction 3 of the reference frame.
     * (Required)
     * 
     */
    @JsonProperty("USER_DEFINED_MAN_A_3")
    public Double getUserDefinedManA3() {
        return userDefinedManA3;
    }

    /**
     * The acceleration of the maneuver in km/s**2 in direction 3 of the reference frame.
     * (Required)
     * 
     */
    @JsonProperty("USER_DEFINED_MAN_A_3")
    public void setUserDefinedManA3(Double userDefinedManA3) {
        this.userDefinedManA3 = userDefinedManA3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpmManeuver.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("manEpochIgnition");
        sb.append('=');
        sb.append(((this.manEpochIgnition == null)?"<null>":this.manEpochIgnition));
        sb.append(',');
        sb.append("manDuration");
        sb.append('=');
        sb.append(((this.manDuration == null)?"<null>":this.manDuration));
        sb.append(',');
        sb.append("manRefFrame");
        sb.append('=');
        sb.append(((this.manRefFrame == null)?"<null>":this.manRefFrame));
        sb.append(',');
        sb.append("userDefinedManA1");
        sb.append('=');
        sb.append(((this.userDefinedManA1 == null)?"<null>":this.userDefinedManA1));
        sb.append(',');
        sb.append("userDefinedManA2");
        sb.append('=');
        sb.append(((this.userDefinedManA2 == null)?"<null>":this.userDefinedManA2));
        sb.append(',');
        sb.append("userDefinedManA3");
        sb.append('=');
        sb.append(((this.userDefinedManA3 == null)?"<null>":this.userDefinedManA3));
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
        result = ((result* 31)+((this.manEpochIgnition == null)? 0 :this.manEpochIgnition.hashCode()));
        result = ((result* 31)+((this.manDuration == null)? 0 :this.manDuration.hashCode()));
        result = ((result* 31)+((this.userDefinedManA2 == null)? 0 :this.userDefinedManA2 .hashCode()));
        result = ((result* 31)+((this.userDefinedManA1 == null)? 0 :this.userDefinedManA1 .hashCode()));
        result = ((result* 31)+((this.userDefinedManA3 == null)? 0 :this.userDefinedManA3 .hashCode()));
        result = ((result* 31)+((this.manRefFrame == null)? 0 :this.manRefFrame.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpmManeuver) == false) {
            return false;
        }
        OpmManeuver rhs = ((OpmManeuver) other);
        return (((((((this.manEpochIgnition == rhs.manEpochIgnition)||((this.manEpochIgnition!= null)&&this.manEpochIgnition.equals(rhs.manEpochIgnition)))&&((this.manDuration == rhs.manDuration)||((this.manDuration!= null)&&this.manDuration.equals(rhs.manDuration))))&&((this.userDefinedManA2 == rhs.userDefinedManA2)||((this.userDefinedManA2 != null)&&this.userDefinedManA2 .equals(rhs.userDefinedManA2))))&&((this.userDefinedManA1 == rhs.userDefinedManA1)||((this.userDefinedManA1 != null)&&this.userDefinedManA1 .equals(rhs.userDefinedManA1))))&&((this.userDefinedManA3 == rhs.userDefinedManA3)||((this.userDefinedManA3 != null)&&this.userDefinedManA3 .equals(rhs.userDefinedManA3))))&&((this.manRefFrame == rhs.manRefFrame)||((this.manRefFrame!= null)&&this.manRefFrame.equals(rhs.manRefFrame))));
    }


    /**
     * The reference frame for the maneuver. Only used for the maneuver. Currently, only RTN (satellite frame) is considered.
     * 
     */
    public enum ManRefFrame {

        RTN("RTN");
        private final String value;
        private final static Map<String, OpmManeuver.ManRefFrame> CONSTANTS = new HashMap<String, OpmManeuver.ManRefFrame>();

        static {
            for (OpmManeuver.ManRefFrame c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ManRefFrame(String value) {
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
        public static OpmManeuver.ManRefFrame fromValue(String value) {
            OpmManeuver.ManRefFrame constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
