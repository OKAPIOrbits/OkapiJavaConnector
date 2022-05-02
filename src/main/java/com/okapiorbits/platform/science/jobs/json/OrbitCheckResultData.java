
package com.okapiorbits.platform.science.jobs.json;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OrbitCheckResultData
 * <p>
 * The result of an orbit check request as violations of the screening volume.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "violations",
    "candidates_checked",
    "status",
    "result_part_id",
    "next_result_part_foreseen"
})
public class OrbitCheckResultData {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("violations")
    private List<OrbitCheck> violations = new ArrayList<OrbitCheck>();
    @JsonProperty("candidates_checked")
    private Integer candidatesChecked;
    /**
     * Status
     * <p>
     * A request to execute an orbit propagation with an arbitrary orbit propagator
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A request to execute an orbit propagation with an arbitrary orbit propagator")
    private Status status;
    @JsonProperty("result_part_id")
    private Integer resultPartId;
    @JsonProperty("next_result_part_foreseen")
    private Boolean nextResultPartForeseen;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("violations")
    public List<OrbitCheck> getViolations() {
        return violations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("violations")
    public void setViolations(List<OrbitCheck> violations) {
        this.violations = violations;
    }

    @JsonProperty("candidates_checked")
    public Integer getCandidatesChecked() {
        return candidatesChecked;
    }

    @JsonProperty("candidates_checked")
    public void setCandidatesChecked(Integer candidatesChecked) {
        this.candidatesChecked = candidatesChecked;
    }

    /**
     * Status
     * <p>
     * A request to execute an orbit propagation with an arbitrary orbit propagator
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * A request to execute an orbit propagation with an arbitrary orbit propagator
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("result_part_id")
    public Integer getResultPartId() {
        return resultPartId;
    }

    @JsonProperty("result_part_id")
    public void setResultPartId(Integer resultPartId) {
        this.resultPartId = resultPartId;
    }

    @JsonProperty("next_result_part_foreseen")
    public Boolean getNextResultPartForeseen() {
        return nextResultPartForeseen;
    }

    @JsonProperty("next_result_part_foreseen")
    public void setNextResultPartForeseen(Boolean nextResultPartForeseen) {
        this.nextResultPartForeseen = nextResultPartForeseen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrbitCheckResultData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("violations");
        sb.append('=');
        sb.append(((this.violations == null)?"<null>":this.violations));
        sb.append(',');
        sb.append("candidatesChecked");
        sb.append('=');
        sb.append(((this.candidatesChecked == null)?"<null>":this.candidatesChecked));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("resultPartId");
        sb.append('=');
        sb.append(((this.resultPartId == null)?"<null>":this.resultPartId));
        sb.append(',');
        sb.append("nextResultPartForeseen");
        sb.append('=');
        sb.append(((this.nextResultPartForeseen == null)?"<null>":this.nextResultPartForeseen));
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
        result = ((result* 31)+((this.candidatesChecked == null)? 0 :this.candidatesChecked.hashCode()));
        result = ((result* 31)+((this.nextResultPartForeseen == null)? 0 :this.nextResultPartForeseen.hashCode()));
        result = ((result* 31)+((this.violations == null)? 0 :this.violations.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.resultPartId == null)? 0 :this.resultPartId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrbitCheckResultData) == false) {
            return false;
        }
        OrbitCheckResultData rhs = ((OrbitCheckResultData) other);
        return ((((((this.candidatesChecked == rhs.candidatesChecked)||((this.candidatesChecked!= null)&&this.candidatesChecked.equals(rhs.candidatesChecked)))&&((this.nextResultPartForeseen == rhs.nextResultPartForeseen)||((this.nextResultPartForeseen!= null)&&this.nextResultPartForeseen.equals(rhs.nextResultPartForeseen))))&&((this.violations == rhs.violations)||((this.violations!= null)&&this.violations.equals(rhs.violations))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.resultPartId == rhs.resultPartId)||((this.resultPartId!= null)&&this.resultPartId.equals(rhs.resultPartId))));
    }

}
