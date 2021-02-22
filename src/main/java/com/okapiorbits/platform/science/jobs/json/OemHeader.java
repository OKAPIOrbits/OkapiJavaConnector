
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OemHeader
 * <p>
 * Header information as needed for the CCSDS OEM data type.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CCSDS_OEM_VERS",
    "CREATION_DATE",
    "ORIGINATOR"
})
public class OemHeader {

    /**
     * Will always be 2.0
     * (Required)
     * 
     */
    @JsonProperty("CCSDS_OEM_VERS")
    @JsonPropertyDescription("Will always be 2.0")
    private Double ccsdsOemVers = 2.0D;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CREATION_DATE")
    private Date creationDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ORIGINATOR")
    private String originator = "OKAPI:Orbits GmbH";

    /**
     * Will always be 2.0
     * (Required)
     * 
     */
    @JsonProperty("CCSDS_OEM_VERS")
    public Double getCcsdsOemVers() {
        return ccsdsOemVers;
    }

    /**
     * Will always be 2.0
     * (Required)
     * 
     */
    @JsonProperty("CCSDS_OEM_VERS")
    public void setCcsdsOemVers(Double ccsdsOemVers) {
        this.ccsdsOemVers = ccsdsOemVers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CREATION_DATE")
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CREATION_DATE")
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ORIGINATOR")
    public String getOriginator() {
        return originator;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ORIGINATOR")
    public void setOriginator(String originator) {
        this.originator = originator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OemHeader.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ccsdsOemVers");
        sb.append('=');
        sb.append(((this.ccsdsOemVers == null)?"<null>":this.ccsdsOemVers));
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
        result = ((result* 31)+((this.originator == null)? 0 :this.originator.hashCode()));
        result = ((result* 31)+((this.creationDate == null)? 0 :this.creationDate.hashCode()));
        result = ((result* 31)+((this.ccsdsOemVers == null)? 0 :this.ccsdsOemVers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OemHeader) == false) {
            return false;
        }
        OemHeader rhs = ((OemHeader) other);
        return ((((this.originator == rhs.originator)||((this.originator!= null)&&this.originator.equals(rhs.originator)))&&((this.creationDate == rhs.creationDate)||((this.creationDate!= null)&&this.creationDate.equals(rhs.creationDate))))&&((this.ccsdsOemVers == rhs.ccsdsOemVers)||((this.ccsdsOemVers!= null)&&this.ccsdsOemVers.equals(rhs.ccsdsOemVers))));
    }

}
