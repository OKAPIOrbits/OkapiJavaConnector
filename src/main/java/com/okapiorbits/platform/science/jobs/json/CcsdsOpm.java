
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CcsdsOpm
 * <p>
 * Defintition of the CCSDS OPM, with one header, meta data and data section.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OPM_HEADER",
    "OPM_META_DATA",
    "OPM_DATA"
})
public class CcsdsOpm {

    /**
     * OpmHeader
     * <p>
     * Header information as needed for the CCSDS OPM data type.
     * (Required)
     * 
     */
    @JsonProperty("OPM_HEADER")
    @JsonPropertyDescription("Header information as needed for the CCSDS OPM data type.")
    private OpmHeader opmHeader;
    /**
     * OpmMetaData
     * <p>
     * Meta data as needed for the CCSDS OPM data type.
     * (Required)
     * 
     */
    @JsonProperty("OPM_META_DATA")
    @JsonPropertyDescription("Meta data as needed for the CCSDS OPM data type.")
    private OpmMetaData opmMetaData;
    /**
     * OpmData
     * <p>
     * A description of an orbit based on the CCSDS OPM data field, using a Cartesian state vector and an associated epoch. It may additionally contain a covariance matrix, drag area and coefficient and solar radiation coefficient. Up to 5 maneuvers can be defined in the maneuver array. For these a pointing uncertainty and thrust uncertainty can be defined.
     * (Required)
     * 
     */
    @JsonProperty("OPM_DATA")
    @JsonPropertyDescription("A description of an orbit based on the CCSDS OPM data field, using a Cartesian state vector and an associated epoch. It may additionally contain a covariance matrix, drag area and coefficient and solar radiation coefficient. Up to 5 maneuvers can be defined in the maneuver array. For these a pointing uncertainty and thrust uncertainty can be defined.")
    private OpmData opmData;

    /**
     * OpmHeader
     * <p>
     * Header information as needed for the CCSDS OPM data type.
     * (Required)
     * 
     */
    @JsonProperty("OPM_HEADER")
    public OpmHeader getOpmHeader() {
        return opmHeader;
    }

    /**
     * OpmHeader
     * <p>
     * Header information as needed for the CCSDS OPM data type.
     * (Required)
     * 
     */
    @JsonProperty("OPM_HEADER")
    public void setOpmHeader(OpmHeader opmHeader) {
        this.opmHeader = opmHeader;
    }

    /**
     * OpmMetaData
     * <p>
     * Meta data as needed for the CCSDS OPM data type.
     * (Required)
     * 
     */
    @JsonProperty("OPM_META_DATA")
    public OpmMetaData getOpmMetaData() {
        return opmMetaData;
    }

    /**
     * OpmMetaData
     * <p>
     * Meta data as needed for the CCSDS OPM data type.
     * (Required)
     * 
     */
    @JsonProperty("OPM_META_DATA")
    public void setOpmMetaData(OpmMetaData opmMetaData) {
        this.opmMetaData = opmMetaData;
    }

    /**
     * OpmData
     * <p>
     * A description of an orbit based on the CCSDS OPM data field, using a Cartesian state vector and an associated epoch. It may additionally contain a covariance matrix, drag area and coefficient and solar radiation coefficient. Up to 5 maneuvers can be defined in the maneuver array. For these a pointing uncertainty and thrust uncertainty can be defined.
     * (Required)
     * 
     */
    @JsonProperty("OPM_DATA")
    public OpmData getOpmData() {
        return opmData;
    }

    /**
     * OpmData
     * <p>
     * A description of an orbit based on the CCSDS OPM data field, using a Cartesian state vector and an associated epoch. It may additionally contain a covariance matrix, drag area and coefficient and solar radiation coefficient. Up to 5 maneuvers can be defined in the maneuver array. For these a pointing uncertainty and thrust uncertainty can be defined.
     * (Required)
     * 
     */
    @JsonProperty("OPM_DATA")
    public void setOpmData(OpmData opmData) {
        this.opmData = opmData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CcsdsOpm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("opmHeader");
        sb.append('=');
        sb.append(((this.opmHeader == null)?"<null>":this.opmHeader));
        sb.append(',');
        sb.append("opmMetaData");
        sb.append('=');
        sb.append(((this.opmMetaData == null)?"<null>":this.opmMetaData));
        sb.append(',');
        sb.append("opmData");
        sb.append('=');
        sb.append(((this.opmData == null)?"<null>":this.opmData));
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
        result = ((result* 31)+((this.opmHeader == null)? 0 :this.opmHeader.hashCode()));
        result = ((result* 31)+((this.opmMetaData == null)? 0 :this.opmMetaData.hashCode()));
        result = ((result* 31)+((this.opmData == null)? 0 :this.opmData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CcsdsOpm) == false) {
            return false;
        }
        CcsdsOpm rhs = ((CcsdsOpm) other);
        return ((((this.opmHeader == rhs.opmHeader)||((this.opmHeader!= null)&&this.opmHeader.equals(rhs.opmHeader)))&&((this.opmMetaData == rhs.opmMetaData)||((this.opmMetaData!= null)&&this.opmMetaData.equals(rhs.opmMetaData))))&&((this.opmData == rhs.opmData)||((this.opmData!= null)&&this.opmData.equals(rhs.opmData))));
    }

}
