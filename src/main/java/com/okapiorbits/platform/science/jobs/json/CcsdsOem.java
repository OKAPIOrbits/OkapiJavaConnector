
package com.okapiorbits.platform.science.jobs.json;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CcsdsOem
 * <p>
 * Definition of the CCSDS OEM with a header and one meta and data combination.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OEM_HEADER",
    "OEM_META_DATA_DATA"
})
public class CcsdsOem {

    /**
     * OemHeader
     * <p>
     * Header information as needed for the CCSDS OEM data type.
     * (Required)
     * 
     */
    @JsonProperty("OEM_HEADER")
    @JsonPropertyDescription("Header information as needed for the CCSDS OEM data type.")
    private OemHeader oemHeader;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OEM_META_DATA_DATA")
    private List<OemMetaData> oemMetaDataData = new ArrayList<OemMetaData>();

    /**
     * OemHeader
     * <p>
     * Header information as needed for the CCSDS OEM data type.
     * (Required)
     * 
     */
    @JsonProperty("OEM_HEADER")
    public OemHeader getOemHeader() {
        return oemHeader;
    }

    /**
     * OemHeader
     * <p>
     * Header information as needed for the CCSDS OEM data type.
     * (Required)
     * 
     */
    @JsonProperty("OEM_HEADER")
    public void setOemHeader(OemHeader oemHeader) {
        this.oemHeader = oemHeader;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OEM_META_DATA_DATA")
    public List<OemMetaData> getOemMetaDataData() {
        return oemMetaDataData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OEM_META_DATA_DATA")
    public void setOemMetaDataData(List<OemMetaData> oemMetaDataData) {
        this.oemMetaDataData = oemMetaDataData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CcsdsOem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("oemHeader");
        sb.append('=');
        sb.append(((this.oemHeader == null)?"<null>":this.oemHeader));
        sb.append(',');
        sb.append("oemMetaDataData");
        sb.append('=');
        sb.append(((this.oemMetaDataData == null)?"<null>":this.oemMetaDataData));
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
        result = ((result* 31)+((this.oemMetaDataData == null)? 0 :this.oemMetaDataData.hashCode()));
        result = ((result* 31)+((this.oemHeader == null)? 0 :this.oemHeader.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CcsdsOem) == false) {
            return false;
        }
        CcsdsOem rhs = ((CcsdsOem) other);
        return (((this.oemMetaDataData == rhs.oemMetaDataData)||((this.oemMetaDataData!= null)&&this.oemMetaDataData.equals(rhs.oemMetaDataData)))&&((this.oemHeader == rhs.oemHeader)||((this.oemHeader!= null)&&this.oemHeader.equals(rhs.oemHeader))));
    }

}
