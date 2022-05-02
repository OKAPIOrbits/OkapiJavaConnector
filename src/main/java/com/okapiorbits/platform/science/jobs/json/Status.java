
package com.okapiorbits.platform.science.jobs.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Status
 * <p>
 * A request to execute an orbit propagation with an arbitrary orbit propagator
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "text",
    "input_problem"
})
public class Status {

    /**
     * Status type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Status type")
    private Status.Type type = Status.Type.fromValue("NONE");
    /**
     * Contains more information on warnings and fatal errors.
     * (Required)
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Contains more information on warnings and fatal errors.")
    private String text = "No messages";
    /**
     * Indicates if a problem was detected in your input data
     * 
     */
    @JsonProperty("input_problem")
    @JsonPropertyDescription("Indicates if a problem was detected in your input data")
    private Boolean inputProblem = false;

    /**
     * Status type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Status.Type getType() {
        return type;
    }

    /**
     * Status type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Status.Type type) {
        this.type = type;
    }

    /**
     * Contains more information on warnings and fatal errors.
     * (Required)
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Contains more information on warnings and fatal errors.
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Indicates if a problem was detected in your input data
     * 
     */
    @JsonProperty("input_problem")
    public Boolean getInputProblem() {
        return inputProblem;
    }

    /**
     * Indicates if a problem was detected in your input data
     * 
     */
    @JsonProperty("input_problem")
    public void setInputProblem(Boolean inputProblem) {
        this.inputProblem = inputProblem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("inputProblem");
        sb.append('=');
        sb.append(((this.inputProblem == null)?"<null>":this.inputProblem));
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
        result = ((result* 31)+((this.inputProblem == null)? 0 :this.inputProblem.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return ((((this.inputProblem == rhs.inputProblem)||((this.inputProblem!= null)&&this.inputProblem.equals(rhs.inputProblem)))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Status type
     * 
     */
    public enum Type {

        NONE("NONE"),
        DEBUG("DEBUG"),
        REMARK("REMARK"),
        WARNING("WARNING"),
        FATAL("FATAL");
        private final String value;
        private final static Map<String, Status.Type> CONSTANTS = new HashMap<String, Status.Type>();

        static {
            for (Status.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
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
        public static Status.Type fromValue(String value) {
            Status.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
