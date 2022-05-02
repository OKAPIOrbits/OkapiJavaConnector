
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OrbitCheck
 * <p>
 * The object that violates the screening volume.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "norad_id",
    "tca",
    "r",
    "t",
    "n",
    "r_dot",
    "t_dot",
    "n_dot"
})
public class OrbitCheck {

    /**
     * The norad id of the encountering object
     * (Required)
     * 
     */
    @JsonProperty("norad_id")
    @JsonPropertyDescription("The norad id of the encountering object")
    private Integer noradId;
    /**
     * Date and time of the time of close approach
     * (Required)
     * 
     */
    @JsonProperty("tca")
    @JsonPropertyDescription("Date and time of the time of close approach")
    private Date tca;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("r")
    @JsonPropertyDescription("in km")
    private Double r;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("t")
    @JsonPropertyDescription("in km")
    private Double t;
    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("n")
    @JsonPropertyDescription("in km")
    private Double n;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("r_dot")
    @JsonPropertyDescription("in km/s")
    private Double rDot;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("t_dot")
    @JsonPropertyDescription("in km/s")
    private Double tDot;
    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("n_dot")
    @JsonPropertyDescription("in km/s")
    private Double nDot;

    /**
     * The norad id of the encountering object
     * (Required)
     * 
     */
    @JsonProperty("norad_id")
    public Integer getNoradId() {
        return noradId;
    }

    /**
     * The norad id of the encountering object
     * (Required)
     * 
     */
    @JsonProperty("norad_id")
    public void setNoradId(Integer noradId) {
        this.noradId = noradId;
    }

    /**
     * Date and time of the time of close approach
     * (Required)
     * 
     */
    @JsonProperty("tca")
    public Date getTca() {
        return tca;
    }

    /**
     * Date and time of the time of close approach
     * (Required)
     * 
     */
    @JsonProperty("tca")
    public void setTca(Date tca) {
        this.tca = tca;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("r")
    public Double getR() {
        return r;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("r")
    public void setR(Double r) {
        this.r = r;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("t")
    public Double getT() {
        return t;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("t")
    public void setT(Double t) {
        this.t = t;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("n")
    public Double getN() {
        return n;
    }

    /**
     * in km
     * (Required)
     * 
     */
    @JsonProperty("n")
    public void setN(Double n) {
        this.n = n;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("r_dot")
    public Double getrDot() {
        return rDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("r_dot")
    public void setrDot(Double rDot) {
        this.rDot = rDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("t_dot")
    public Double gettDot() {
        return tDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("t_dot")
    public void settDot(Double tDot) {
        this.tDot = tDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("n_dot")
    public Double getnDot() {
        return nDot;
    }

    /**
     * in km/s
     * (Required)
     * 
     */
    @JsonProperty("n_dot")
    public void setnDot(Double nDot) {
        this.nDot = nDot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrbitCheck.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("noradId");
        sb.append('=');
        sb.append(((this.noradId == null)?"<null>":this.noradId));
        sb.append(',');
        sb.append("tca");
        sb.append('=');
        sb.append(((this.tca == null)?"<null>":this.tca));
        sb.append(',');
        sb.append("r");
        sb.append('=');
        sb.append(((this.r == null)?"<null>":this.r));
        sb.append(',');
        sb.append("t");
        sb.append('=');
        sb.append(((this.t == null)?"<null>":this.t));
        sb.append(',');
        sb.append("n");
        sb.append('=');
        sb.append(((this.n == null)?"<null>":this.n));
        sb.append(',');
        sb.append("rDot");
        sb.append('=');
        sb.append(((this.rDot == null)?"<null>":this.rDot));
        sb.append(',');
        sb.append("tDot");
        sb.append('=');
        sb.append(((this.tDot == null)?"<null>":this.tDot));
        sb.append(',');
        sb.append("nDot");
        sb.append('=');
        sb.append(((this.nDot == null)?"<null>":this.nDot));
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
        result = ((result* 31)+((this.tDot == null)? 0 :this.tDot.hashCode()));
        result = ((result* 31)+((this.r == null)? 0 :this.r.hashCode()));
        result = ((result* 31)+((this.tca == null)? 0 :this.tca.hashCode()));
        result = ((result* 31)+((this.rDot == null)? 0 :this.rDot.hashCode()));
        result = ((result* 31)+((this.noradId == null)? 0 :this.noradId.hashCode()));
        result = ((result* 31)+((this.t == null)? 0 :this.t.hashCode()));
        result = ((result* 31)+((this.nDot == null)? 0 :this.nDot.hashCode()));
        result = ((result* 31)+((this.n == null)? 0 :this.n.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrbitCheck) == false) {
            return false;
        }
        OrbitCheck rhs = ((OrbitCheck) other);
        return (((((((((this.tDot == rhs.tDot)||((this.tDot!= null)&&this.tDot.equals(rhs.tDot)))&&((this.r == rhs.r)||((this.r!= null)&&this.r.equals(rhs.r))))&&((this.tca == rhs.tca)||((this.tca!= null)&&this.tca.equals(rhs.tca))))&&((this.rDot == rhs.rDot)||((this.rDot!= null)&&this.rDot.equals(rhs.rDot))))&&((this.noradId == rhs.noradId)||((this.noradId!= null)&&this.noradId.equals(rhs.noradId))))&&((this.t == rhs.t)||((this.t!= null)&&this.t.equals(rhs.t))))&&((this.nDot == rhs.nDot)||((this.nDot!= null)&&this.nDot.equals(rhs.nDot))))&&((this.n == rhs.n)||((this.n!= null)&&this.n.equals(rhs.n))));
    }

}
