
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CcsdsOpm
 * <p>
 * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
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
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
     * (Required)
     * 
     */
    @JsonProperty("OPM_HEADER")
    @JsonPropertyDescription("A request for the execution of an OKAPI service. It contains the actual request data in its \"data\" attribute. This is also the schema of MongoDB collection \"service_requests\"")
    private OpmHeader opmHeader;
    /**
     * OpmMetaData
     * <p>
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
     * (Required)
     * 
     */
    @JsonProperty("OPM_META_DATA")
    @JsonPropertyDescription("A request for the execution of an OKAPI service. It contains the actual request data in its \"data\" attribute. This is also the schema of MongoDB collection \"service_requests\"")
    private OpmMetaData opmMetaData;
    /**
     * OpmData
     * <p>
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
     * (Required)
     * 
     */
    @JsonProperty("OPM_DATA")
    @JsonPropertyDescription("A request for the execution of an OKAPI service. It contains the actual request data in its \"data\" attribute. This is also the schema of MongoDB collection \"service_requests\"")
    private OpmData opmData;

    /**
     * OpmHeader
     * <p>
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
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
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
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
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
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
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
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
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
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
     * A request for the execution of an OKAPI service. It contains the actual request data in its "data" attribute. This is also the schema of MongoDB collection "service_requests"
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
