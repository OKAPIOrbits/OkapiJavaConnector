
package com.okapiorbits.platform.science.jobs.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * CovariancePropagationMethod
 * <p>
 * Covariance propagation using the numerical integration of the state error transition matrix (Numerical) or sigma point propagation (Unscented).
 * 
 */
public enum CovariancePropagationMethod {

    NUMERICAL("Numerical"),
    UNSCENTED("Unscented");
    private final String value;
    private final static Map<String, CovariancePropagationMethod> CONSTANTS = new HashMap<String, CovariancePropagationMethod>();

    static {
        for (CovariancePropagationMethod c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CovariancePropagationMethod(String value) {
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
    public static CovariancePropagationMethod fromValue(String value) {
        CovariancePropagationMethod constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
