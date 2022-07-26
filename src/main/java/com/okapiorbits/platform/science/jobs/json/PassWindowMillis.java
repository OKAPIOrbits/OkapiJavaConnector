
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PassWindowMillis
 * <p>
 * Pass Window including pass start and end epochs (with milliseconds).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "start",
    "end"
})
public class PassWindowMillis {

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("start")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private Date start;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("end")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private Date end;

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("start")
    public Date getStart() {
        return start;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("start")
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("end")
    public Date getEnd() {
        return end;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("end")
    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PassWindowMillis.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
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
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassWindowMillis) == false) {
            return false;
        }
        PassWindowMillis rhs = ((PassWindowMillis) other);
        return (((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start)))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))));
    }

}
