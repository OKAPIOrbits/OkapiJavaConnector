
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OpmHeader
 * <p>
 * Header information as needed for the CCSDS OPM data type.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CCSDS_OPM_VERS",
    "CREATION_DATE",
    "ORIGINATOR"
})
public class OpmHeader {

    /**
     * Only version 2.0 is supported.
     * (Required)
     * 
     */
    @JsonProperty("CCSDS_OPM_VERS")
    @JsonPropertyDescription("Only version 2.0 is supported.")
    private Double ccsdsOpmVers = 2.0D;
    @JsonProperty("CREATION_DATE")
    private Date creationDate;
    @JsonProperty("ORIGINATOR")
    private String originator = "OKAPI:Orbits GmbH";

    /**
     * Only version 2.0 is supported.
     * (Required)
     * 
     */
    @JsonProperty("CCSDS_OPM_VERS")
    public Double getCcsdsOpmVers() {
        return ccsdsOpmVers;
    }

    /**
     * Only version 2.0 is supported.
     * (Required)
     * 
     */
    @JsonProperty("CCSDS_OPM_VERS")
    public void setCcsdsOpmVers(Double ccsdsOpmVers) {
        this.ccsdsOpmVers = ccsdsOpmVers;
    }

    @JsonProperty("CREATION_DATE")
    public Date getCreationDate() {
        return creationDate;
    }

    @JsonProperty("CREATION_DATE")
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("ORIGINATOR")
    public String getOriginator() {
        return originator;
    }

    @JsonProperty("ORIGINATOR")
    public void setOriginator(String originator) {
        this.originator = originator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpmHeader.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ccsdsOpmVers");
        sb.append('=');
        sb.append(((this.ccsdsOpmVers == null)?"<null>":this.ccsdsOpmVers));
        sb.append(',');
        sb.append("creationDate");
        sb.append('=');
        sb.append(((this.creationDate == null)?"<null>":this.creationDate));
        sb.append(',');
        sb.append("originator");
        sb.append('=');
        sb.append(((this.originator == null)?"<null>":this.originator));
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
        result = ((result* 31)+((this.ccsdsOpmVers == null)? 0 :this.ccsdsOpmVers.hashCode()));
        result = ((result* 31)+((this.originator == null)? 0 :this.originator.hashCode()));
        result = ((result* 31)+((this.creationDate == null)? 0 :this.creationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpmHeader) == false) {
            return false;
        }
        OpmHeader rhs = ((OpmHeader) other);
        return ((((this.ccsdsOpmVers == rhs.ccsdsOpmVers)||((this.ccsdsOpmVers!= null)&&this.ccsdsOpmVers.equals(rhs.ccsdsOpmVers)))&&((this.originator == rhs.originator)||((this.originator!= null)&&this.originator.equals(rhs.originator))))&&((this.creationDate == rhs.creationDate)||((this.creationDate!= null)&&this.creationDate.equals(rhs.creationDate))));
    }

}
