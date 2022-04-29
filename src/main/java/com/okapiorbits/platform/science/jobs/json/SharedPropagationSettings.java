
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
 * SharedPropagationSettings
 * <p>
 * Shared propagator settings valid for different numerical propagators (e.g. NEPTUNE and Orekit)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "output_step_size",
    "geopotential_degree_order",
    "atmospheric_drag",
    "horizontal_wind",
    "sun_gravity",
    "moon_gravity",
    "solar_radiation_pressure",
    "solid_tides",
    "ocean_tides",
    "earth_albedo",
    "geopotential_model",
    "atmospheric_model",
    "shadow_model",
    "shadow_boundary_correction",
    "covariance_propagation",
    "covariance_propagation_method",
    "covariance_geopotential",
    "covariance_atmospheric_drag",
    "covariance_sun_gravity",
    "covariance_moon_gravity",
    "covariance_solar_radiation_pressure",
    "compute_noise_matrix",
    "use_eop",
    "precession_nutation_lookup",
    "solar_activity_forecast",
    "geo_ap",
    "solar_f107",
    "stormer_cowell_rel_tolerance",
    "stormer_cowell_abs_tolerance",
    "covariance_integration_step",
    "covariance_integration_method"
})
public class SharedPropagationSettings {

    /**
     * In seconds
     * 
     */
    @JsonProperty("output_step_size")
    @JsonPropertyDescription("In seconds")
    private Integer outputStepSize = 60;
    /**
     * Degree and order of geopotential. Standard is 6.
     * 
     */
    @JsonProperty("geopotential_degree_order")
    @JsonPropertyDescription("Degree and order of geopotential. Standard is 6.")
    private Integer geopotentialDegreeOrder = 6;
    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("atmospheric_drag")
    @JsonPropertyDescription("1 is on, 0 is off. Default is 1.")
    private Integer atmosphericDrag = 1;
    /**
     *  1 is on, 0 is off. Default is 0.
     * 
     */
    @JsonProperty("horizontal_wind")
    @JsonPropertyDescription("1 is on, 0 is off. Default is 0.")
    private Integer horizontalWind = 0;
    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("sun_gravity")
    @JsonPropertyDescription("1 is on, 0 is off. Default is 1.")
    private Integer sunGravity = 1;
    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("moon_gravity")
    @JsonPropertyDescription("1 is on, 0 is off. Default is 1.")
    private Integer moonGravity = 1;
    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("solar_radiation_pressure")
    @JsonPropertyDescription("1 is on, 0 is off. Default is 1.")
    private Integer solarRadiationPressure = 1;
    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("solid_tides")
    @JsonPropertyDescription("1 is on, 0 is off. Default is 1.")
    private Integer solidTides = 1;
    /**
     *  1 is on, 0 is off. Default is 0.
     * 
     */
    @JsonProperty("ocean_tides")
    @JsonPropertyDescription("1 is on, 0 is off. Default is 0.")
    private Integer oceanTides = 0;
    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("earth_albedo")
    @JsonPropertyDescription("1 is on, 0 is off. Default is 1.")
    private Integer earthAlbedo = 1;
    /**
     * Choose EGM96, EGM2008 or EIGEN-GL04C. Standard is EIGEN-GL04C.
     * 
     */
    @JsonProperty("geopotential_model")
    @JsonPropertyDescription("Choose EGM96, EGM2008 or EIGEN-GL04C. Standard is EIGEN-GL04C.")
    private SharedPropagationSettings.GeopotentialModel geopotentialModel = SharedPropagationSettings.GeopotentialModel.fromValue("EIGEN-GL04C");
    /**
     * Use Exponential or NRLMSISE-00. Default is NRLMSISE-00.
     * 
     */
    @JsonProperty("atmospheric_model")
    @JsonPropertyDescription("Use Exponential or NRLMSISE-00. Default is NRLMSISE-00.")
    private SharedPropagationSettings.AtmosphericModel atmosphericModel = SharedPropagationSettings.AtmosphericModel.fromValue("NRLMSISE-00");
    /**
     * Use either conical or none. Default is conical.
     * 
     */
    @JsonProperty("shadow_model")
    @JsonPropertyDescription("Use either conical or none. Default is conical.")
    private SharedPropagationSettings.ShadowModel shadowModel = SharedPropagationSettings.ShadowModel.fromValue("conical");
    /**
     * Use Lundberg algorithm for shadow boundary correction (1) or not (0). Standard is 0.
     * 
     */
    @JsonProperty("shadow_boundary_correction")
    @JsonPropertyDescription("Use Lundberg algorithm for shadow boundary correction (1) or not (0). Standard is 0.")
    private Integer shadowBoundaryCorrection = 0;
    /**
     * Activates covariance propagation
     * 
     */
    @JsonProperty("covariance_propagation")
    @JsonPropertyDescription("Activates covariance propagation")
    private Boolean covariancePropagation = false;
    /**
     * CovariancePropagationMethod
     * <p>
     * Covariance propagation using the numerical integration of the state error transition matrix (Numerical) or sigma point propagation (Unscented).
     * 
     */
    @JsonProperty("covariance_propagation_method")
    @JsonPropertyDescription("Covariance propagation using the numerical integration of the state error transition matrix (Numerical) or sigma point propagation (Unscented).")
    private CovariancePropagationMethod covariancePropagationMethod = CovariancePropagationMethod.fromValue("Numerical");
    /**
     * Use 0 for two-body only, or n as degree of geopotential. Has to be smaller than or equal to the degree used in the state vector propagation. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_geopotential")
    @JsonPropertyDescription("Use 0 for two-body only, or n as degree of geopotential. Has to be smaller than or equal to the degree used in the state vector propagation. Covariance is only propagated when provided as input. Standard is 0.")
    private Integer covarianceGeopotential = 6;
    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_atmospheric_drag")
    @JsonPropertyDescription("Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.")
    private Integer covarianceAtmosphericDrag = 0;
    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_sun_gravity")
    @JsonPropertyDescription("Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.")
    private Integer covarianceSunGravity = 0;
    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_moon_gravity")
    @JsonPropertyDescription("Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.")
    private Integer covarianceMoonGravity = 0;
    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_solar_radiation_pressure")
    @JsonPropertyDescription("Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.")
    private Integer covarianceSolarRadiationPressure = 0;
    /**
     * Compute noise matrix. Only considered, if covariance is propagated. Standard is 0.
     * 
     */
    @JsonProperty("compute_noise_matrix")
    @JsonPropertyDescription("Compute noise matrix. Only considered, if covariance is propagated. Standard is 0.")
    private Integer computeNoiseMatrix = 0;
    /**
     * Use (1) or do not use (0) eop for coordinate transformations. Standard is 1.
     * 
     */
    @JsonProperty("use_eop")
    @JsonPropertyDescription("Use (1) or do not use (0) eop for coordinate transformations. Standard is 1.")
    private Integer useEop = 1;
    /**
     * Use (1) or do not use (0) precission nutation theory lookup tables, which leads to short processing times. Standard is 1.
     * 
     */
    @JsonProperty("precession_nutation_lookup")
    @JsonPropertyDescription("Use (1) or do not use (0) precission nutation theory lookup tables, which leads to short processing times. Standard is 1.")
    private Integer precessionNutationLookup = 1;
    /**
     * Describe, which solar and geomagnetic activity forecast shall be used. Choose "celestrak", "esa" or "constant". If constant is chosen, the values geo_ap and solar_f107 are used. Standard is esa.
     * 
     */
    @JsonProperty("solar_activity_forecast")
    @JsonPropertyDescription("Describe, which solar and geomagnetic activity forecast shall be used. Choose \"celestrak\", \"esa\" or \"constant\". If constant is chosen, the values geo_ap and solar_f107 are used. Standard is esa.")
    private SharedPropagationSettings.SolarActivityForecast solarActivityForecast = SharedPropagationSettings.SolarActivityForecast.fromValue("esa");
    /**
     * Geomagnetic index to be used during the complete propagation. Standard is 15.
     * 
     */
    @JsonProperty("geo_ap")
    @JsonPropertyDescription("Geomagnetic index to be used during the complete propagation. Standard is 15.")
    private Integer geoAp = 15;
    /**
     * Solar F10.7 index to be used during the complete propagation. Standard is 150.
     * 
     */
    @JsonProperty("solar_f107")
    @JsonPropertyDescription("Solar F10.7 index to be used during the complete propagation. Standard is 150.")
    private Double solarF107 = 150.0D;
    /**
     * Relative tolerance to be used for the Störmer-Cowell integration. Standard is 1.e-10.
     * 
     */
    @JsonProperty("stormer_cowell_rel_tolerance")
    @JsonPropertyDescription("Relative tolerance to be used for the St\u00f6rmer-Cowell integration. Standard is 1.e-10.")
    private Double stormerCowellRelTolerance = 1.0E-10D;
    /**
     * Absolute tolerance to be used for the Störmer-Cowell integration. Standard is 1.e-11.
     * 
     */
    @JsonProperty("stormer_cowell_abs_tolerance")
    @JsonPropertyDescription("Absolute tolerance to be used for the St\u00f6rmer-Cowell integration. Standard is 1.e-11.")
    private Double stormerCowellAbsTolerance = 1.0E-11D;
    /**
     * Covariance matrix integration step size (sec) (multiple of output step, should not be greater than output step!). Standard is 60 sec or output step size.
     * 
     */
    @JsonProperty("covariance_integration_step")
    @JsonPropertyDescription("Covariance matrix integration step size (sec) (multiple of output step, should not be greater than output step!). Standard is 60 sec or output step size.")
    private Double covarianceIntegrationStep = 60.0D;
    /**
     * Covariance matrix integration method. Use 1 for taylor expansion, 2 for RK4, 3 for RK8. Standard is RK4.
     * 
     */
    @JsonProperty("covariance_integration_method")
    @JsonPropertyDescription("Covariance matrix integration method. Use 1 for taylor expansion, 2 for RK4, 3 for RK8. Standard is RK4.")
    private Integer covarianceIntegrationMethod = 2;

    /**
     * In seconds
     * 
     */
    @JsonProperty("output_step_size")
    public Integer getOutputStepSize() {
        return outputStepSize;
    }

    /**
     * In seconds
     * 
     */
    @JsonProperty("output_step_size")
    public void setOutputStepSize(Integer outputStepSize) {
        this.outputStepSize = outputStepSize;
    }

    /**
     * Degree and order of geopotential. Standard is 6.
     * 
     */
    @JsonProperty("geopotential_degree_order")
    public Integer getGeopotentialDegreeOrder() {
        return geopotentialDegreeOrder;
    }

    /**
     * Degree and order of geopotential. Standard is 6.
     * 
     */
    @JsonProperty("geopotential_degree_order")
    public void setGeopotentialDegreeOrder(Integer geopotentialDegreeOrder) {
        this.geopotentialDegreeOrder = geopotentialDegreeOrder;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("atmospheric_drag")
    public Integer getAtmosphericDrag() {
        return atmosphericDrag;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("atmospheric_drag")
    public void setAtmosphericDrag(Integer atmosphericDrag) {
        this.atmosphericDrag = atmosphericDrag;
    }

    /**
     *  1 is on, 0 is off. Default is 0.
     * 
     */
    @JsonProperty("horizontal_wind")
    public Integer getHorizontalWind() {
        return horizontalWind;
    }

    /**
     *  1 is on, 0 is off. Default is 0.
     * 
     */
    @JsonProperty("horizontal_wind")
    public void setHorizontalWind(Integer horizontalWind) {
        this.horizontalWind = horizontalWind;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("sun_gravity")
    public Integer getSunGravity() {
        return sunGravity;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("sun_gravity")
    public void setSunGravity(Integer sunGravity) {
        this.sunGravity = sunGravity;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("moon_gravity")
    public Integer getMoonGravity() {
        return moonGravity;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("moon_gravity")
    public void setMoonGravity(Integer moonGravity) {
        this.moonGravity = moonGravity;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("solar_radiation_pressure")
    public Integer getSolarRadiationPressure() {
        return solarRadiationPressure;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("solar_radiation_pressure")
    public void setSolarRadiationPressure(Integer solarRadiationPressure) {
        this.solarRadiationPressure = solarRadiationPressure;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("solid_tides")
    public Integer getSolidTides() {
        return solidTides;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("solid_tides")
    public void setSolidTides(Integer solidTides) {
        this.solidTides = solidTides;
    }

    /**
     *  1 is on, 0 is off. Default is 0.
     * 
     */
    @JsonProperty("ocean_tides")
    public Integer getOceanTides() {
        return oceanTides;
    }

    /**
     *  1 is on, 0 is off. Default is 0.
     * 
     */
    @JsonProperty("ocean_tides")
    public void setOceanTides(Integer oceanTides) {
        this.oceanTides = oceanTides;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("earth_albedo")
    public Integer getEarthAlbedo() {
        return earthAlbedo;
    }

    /**
     *  1 is on, 0 is off. Default is 1.
     * 
     */
    @JsonProperty("earth_albedo")
    public void setEarthAlbedo(Integer earthAlbedo) {
        this.earthAlbedo = earthAlbedo;
    }

    /**
     * Choose EGM96, EGM2008 or EIGEN-GL04C. Standard is EIGEN-GL04C.
     * 
     */
    @JsonProperty("geopotential_model")
    public SharedPropagationSettings.GeopotentialModel getGeopotentialModel() {
        return geopotentialModel;
    }

    /**
     * Choose EGM96, EGM2008 or EIGEN-GL04C. Standard is EIGEN-GL04C.
     * 
     */
    @JsonProperty("geopotential_model")
    public void setGeopotentialModel(SharedPropagationSettings.GeopotentialModel geopotentialModel) {
        this.geopotentialModel = geopotentialModel;
    }

    /**
     * Use Exponential or NRLMSISE-00. Default is NRLMSISE-00.
     * 
     */
    @JsonProperty("atmospheric_model")
    public SharedPropagationSettings.AtmosphericModel getAtmosphericModel() {
        return atmosphericModel;
    }

    /**
     * Use Exponential or NRLMSISE-00. Default is NRLMSISE-00.
     * 
     */
    @JsonProperty("atmospheric_model")
    public void setAtmosphericModel(SharedPropagationSettings.AtmosphericModel atmosphericModel) {
        this.atmosphericModel = atmosphericModel;
    }

    /**
     * Use either conical or none. Default is conical.
     * 
     */
    @JsonProperty("shadow_model")
    public SharedPropagationSettings.ShadowModel getShadowModel() {
        return shadowModel;
    }

    /**
     * Use either conical or none. Default is conical.
     * 
     */
    @JsonProperty("shadow_model")
    public void setShadowModel(SharedPropagationSettings.ShadowModel shadowModel) {
        this.shadowModel = shadowModel;
    }

    /**
     * Use Lundberg algorithm for shadow boundary correction (1) or not (0). Standard is 0.
     * 
     */
    @JsonProperty("shadow_boundary_correction")
    public Integer getShadowBoundaryCorrection() {
        return shadowBoundaryCorrection;
    }

    /**
     * Use Lundberg algorithm for shadow boundary correction (1) or not (0). Standard is 0.
     * 
     */
    @JsonProperty("shadow_boundary_correction")
    public void setShadowBoundaryCorrection(Integer shadowBoundaryCorrection) {
        this.shadowBoundaryCorrection = shadowBoundaryCorrection;
    }

    /**
     * Activates covariance propagation
     * 
     */
    @JsonProperty("covariance_propagation")
    public Boolean getCovariancePropagation() {
        return covariancePropagation;
    }

    /**
     * Activates covariance propagation
     * 
     */
    @JsonProperty("covariance_propagation")
    public void setCovariancePropagation(Boolean covariancePropagation) {
        this.covariancePropagation = covariancePropagation;
    }

    /**
     * CovariancePropagationMethod
     * <p>
     * Covariance propagation using the numerical integration of the state error transition matrix (Numerical) or sigma point propagation (Unscented).
     * 
     */
    @JsonProperty("covariance_propagation_method")
    public CovariancePropagationMethod getCovariancePropagationMethod() {
        return covariancePropagationMethod;
    }

    /**
     * CovariancePropagationMethod
     * <p>
     * Covariance propagation using the numerical integration of the state error transition matrix (Numerical) or sigma point propagation (Unscented).
     * 
     */
    @JsonProperty("covariance_propagation_method")
    public void setCovariancePropagationMethod(CovariancePropagationMethod covariancePropagationMethod) {
        this.covariancePropagationMethod = covariancePropagationMethod;
    }

    /**
     * Use 0 for two-body only, or n as degree of geopotential. Has to be smaller than or equal to the degree used in the state vector propagation. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_geopotential")
    public Integer getCovarianceGeopotential() {
        return covarianceGeopotential;
    }

    /**
     * Use 0 for two-body only, or n as degree of geopotential. Has to be smaller than or equal to the degree used in the state vector propagation. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_geopotential")
    public void setCovarianceGeopotential(Integer covarianceGeopotential) {
        this.covarianceGeopotential = covarianceGeopotential;
    }

    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_atmospheric_drag")
    public Integer getCovarianceAtmosphericDrag() {
        return covarianceAtmosphericDrag;
    }

    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_atmospheric_drag")
    public void setCovarianceAtmosphericDrag(Integer covarianceAtmosphericDrag) {
        this.covarianceAtmosphericDrag = covarianceAtmosphericDrag;
    }

    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_sun_gravity")
    public Integer getCovarianceSunGravity() {
        return covarianceSunGravity;
    }

    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_sun_gravity")
    public void setCovarianceSunGravity(Integer covarianceSunGravity) {
        this.covarianceSunGravity = covarianceSunGravity;
    }

    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_moon_gravity")
    public Integer getCovarianceMoonGravity() {
        return covarianceMoonGravity;
    }

    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_moon_gravity")
    public void setCovarianceMoonGravity(Integer covarianceMoonGravity) {
        this.covarianceMoonGravity = covarianceMoonGravity;
    }

    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_solar_radiation_pressure")
    public Integer getCovarianceSolarRadiationPressure() {
        return covarianceSolarRadiationPressure;
    }

    /**
     * Uses variational equations. 0 for off, 1 for on. Covariance is only propagated when provided as input. Standard is 0.
     * 
     */
    @JsonProperty("covariance_solar_radiation_pressure")
    public void setCovarianceSolarRadiationPressure(Integer covarianceSolarRadiationPressure) {
        this.covarianceSolarRadiationPressure = covarianceSolarRadiationPressure;
    }

    /**
     * Compute noise matrix. Only considered, if covariance is propagated. Standard is 0.
     * 
     */
    @JsonProperty("compute_noise_matrix")
    public Integer getComputeNoiseMatrix() {
        return computeNoiseMatrix;
    }

    /**
     * Compute noise matrix. Only considered, if covariance is propagated. Standard is 0.
     * 
     */
    @JsonProperty("compute_noise_matrix")
    public void setComputeNoiseMatrix(Integer computeNoiseMatrix) {
        this.computeNoiseMatrix = computeNoiseMatrix;
    }

    /**
     * Use (1) or do not use (0) eop for coordinate transformations. Standard is 1.
     * 
     */
    @JsonProperty("use_eop")
    public Integer getUseEop() {
        return useEop;
    }

    /**
     * Use (1) or do not use (0) eop for coordinate transformations. Standard is 1.
     * 
     */
    @JsonProperty("use_eop")
    public void setUseEop(Integer useEop) {
        this.useEop = useEop;
    }

    /**
     * Use (1) or do not use (0) precission nutation theory lookup tables, which leads to short processing times. Standard is 1.
     * 
     */
    @JsonProperty("precession_nutation_lookup")
    public Integer getPrecessionNutationLookup() {
        return precessionNutationLookup;
    }

    /**
     * Use (1) or do not use (0) precission nutation theory lookup tables, which leads to short processing times. Standard is 1.
     * 
     */
    @JsonProperty("precession_nutation_lookup")
    public void setPrecessionNutationLookup(Integer precessionNutationLookup) {
        this.precessionNutationLookup = precessionNutationLookup;
    }

    /**
     * Describe, which solar and geomagnetic activity forecast shall be used. Choose "celestrak", "esa" or "constant". If constant is chosen, the values geo_ap and solar_f107 are used. Standard is esa.
     * 
     */
    @JsonProperty("solar_activity_forecast")
    public SharedPropagationSettings.SolarActivityForecast getSolarActivityForecast() {
        return solarActivityForecast;
    }

    /**
     * Describe, which solar and geomagnetic activity forecast shall be used. Choose "celestrak", "esa" or "constant". If constant is chosen, the values geo_ap and solar_f107 are used. Standard is esa.
     * 
     */
    @JsonProperty("solar_activity_forecast")
    public void setSolarActivityForecast(SharedPropagationSettings.SolarActivityForecast solarActivityForecast) {
        this.solarActivityForecast = solarActivityForecast;
    }

    /**
     * Geomagnetic index to be used during the complete propagation. Standard is 15.
     * 
     */
    @JsonProperty("geo_ap")
    public Integer getGeoAp() {
        return geoAp;
    }

    /**
     * Geomagnetic index to be used during the complete propagation. Standard is 15.
     * 
     */
    @JsonProperty("geo_ap")
    public void setGeoAp(Integer geoAp) {
        this.geoAp = geoAp;
    }

    /**
     * Solar F10.7 index to be used during the complete propagation. Standard is 150.
     * 
     */
    @JsonProperty("solar_f107")
    public Double getSolarF107() {
        return solarF107;
    }

    /**
     * Solar F10.7 index to be used during the complete propagation. Standard is 150.
     * 
     */
    @JsonProperty("solar_f107")
    public void setSolarF107(Double solarF107) {
        this.solarF107 = solarF107;
    }

    /**
     * Relative tolerance to be used for the Störmer-Cowell integration. Standard is 1.e-10.
     * 
     */
    @JsonProperty("stormer_cowell_rel_tolerance")
    public Double getStormerCowellRelTolerance() {
        return stormerCowellRelTolerance;
    }

    /**
     * Relative tolerance to be used for the Störmer-Cowell integration. Standard is 1.e-10.
     * 
     */
    @JsonProperty("stormer_cowell_rel_tolerance")
    public void setStormerCowellRelTolerance(Double stormerCowellRelTolerance) {
        this.stormerCowellRelTolerance = stormerCowellRelTolerance;
    }

    /**
     * Absolute tolerance to be used for the Störmer-Cowell integration. Standard is 1.e-11.
     * 
     */
    @JsonProperty("stormer_cowell_abs_tolerance")
    public Double getStormerCowellAbsTolerance() {
        return stormerCowellAbsTolerance;
    }

    /**
     * Absolute tolerance to be used for the Störmer-Cowell integration. Standard is 1.e-11.
     * 
     */
    @JsonProperty("stormer_cowell_abs_tolerance")
    public void setStormerCowellAbsTolerance(Double stormerCowellAbsTolerance) {
        this.stormerCowellAbsTolerance = stormerCowellAbsTolerance;
    }

    /**
     * Covariance matrix integration step size (sec) (multiple of output step, should not be greater than output step!). Standard is 60 sec or output step size.
     * 
     */
    @JsonProperty("covariance_integration_step")
    public Double getCovarianceIntegrationStep() {
        return covarianceIntegrationStep;
    }

    /**
     * Covariance matrix integration step size (sec) (multiple of output step, should not be greater than output step!). Standard is 60 sec or output step size.
     * 
     */
    @JsonProperty("covariance_integration_step")
    public void setCovarianceIntegrationStep(Double covarianceIntegrationStep) {
        this.covarianceIntegrationStep = covarianceIntegrationStep;
    }

    /**
     * Covariance matrix integration method. Use 1 for taylor expansion, 2 for RK4, 3 for RK8. Standard is RK4.
     * 
     */
    @JsonProperty("covariance_integration_method")
    public Integer getCovarianceIntegrationMethod() {
        return covarianceIntegrationMethod;
    }

    /**
     * Covariance matrix integration method. Use 1 for taylor expansion, 2 for RK4, 3 for RK8. Standard is RK4.
     * 
     */
    @JsonProperty("covariance_integration_method")
    public void setCovarianceIntegrationMethod(Integer covarianceIntegrationMethod) {
        this.covarianceIntegrationMethod = covarianceIntegrationMethod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SharedPropagationSettings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("outputStepSize");
        sb.append('=');
        sb.append(((this.outputStepSize == null)?"<null>":this.outputStepSize));
        sb.append(',');
        sb.append("geopotentialDegreeOrder");
        sb.append('=');
        sb.append(((this.geopotentialDegreeOrder == null)?"<null>":this.geopotentialDegreeOrder));
        sb.append(',');
        sb.append("atmosphericDrag");
        sb.append('=');
        sb.append(((this.atmosphericDrag == null)?"<null>":this.atmosphericDrag));
        sb.append(',');
        sb.append("horizontalWind");
        sb.append('=');
        sb.append(((this.horizontalWind == null)?"<null>":this.horizontalWind));
        sb.append(',');
        sb.append("sunGravity");
        sb.append('=');
        sb.append(((this.sunGravity == null)?"<null>":this.sunGravity));
        sb.append(',');
        sb.append("moonGravity");
        sb.append('=');
        sb.append(((this.moonGravity == null)?"<null>":this.moonGravity));
        sb.append(',');
        sb.append("solarRadiationPressure");
        sb.append('=');
        sb.append(((this.solarRadiationPressure == null)?"<null>":this.solarRadiationPressure));
        sb.append(',');
        sb.append("solidTides");
        sb.append('=');
        sb.append(((this.solidTides == null)?"<null>":this.solidTides));
        sb.append(',');
        sb.append("oceanTides");
        sb.append('=');
        sb.append(((this.oceanTides == null)?"<null>":this.oceanTides));
        sb.append(',');
        sb.append("earthAlbedo");
        sb.append('=');
        sb.append(((this.earthAlbedo == null)?"<null>":this.earthAlbedo));
        sb.append(',');
        sb.append("geopotentialModel");
        sb.append('=');
        sb.append(((this.geopotentialModel == null)?"<null>":this.geopotentialModel));
        sb.append(',');
        sb.append("atmosphericModel");
        sb.append('=');
        sb.append(((this.atmosphericModel == null)?"<null>":this.atmosphericModel));
        sb.append(',');
        sb.append("shadowModel");
        sb.append('=');
        sb.append(((this.shadowModel == null)?"<null>":this.shadowModel));
        sb.append(',');
        sb.append("shadowBoundaryCorrection");
        sb.append('=');
        sb.append(((this.shadowBoundaryCorrection == null)?"<null>":this.shadowBoundaryCorrection));
        sb.append(',');
        sb.append("covariancePropagation");
        sb.append('=');
        sb.append(((this.covariancePropagation == null)?"<null>":this.covariancePropagation));
        sb.append(',');
        sb.append("covariancePropagationMethod");
        sb.append('=');
        sb.append(((this.covariancePropagationMethod == null)?"<null>":this.covariancePropagationMethod));
        sb.append(',');
        sb.append("covarianceGeopotential");
        sb.append('=');
        sb.append(((this.covarianceGeopotential == null)?"<null>":this.covarianceGeopotential));
        sb.append(',');
        sb.append("covarianceAtmosphericDrag");
        sb.append('=');
        sb.append(((this.covarianceAtmosphericDrag == null)?"<null>":this.covarianceAtmosphericDrag));
        sb.append(',');
        sb.append("covarianceSunGravity");
        sb.append('=');
        sb.append(((this.covarianceSunGravity == null)?"<null>":this.covarianceSunGravity));
        sb.append(',');
        sb.append("covarianceMoonGravity");
        sb.append('=');
        sb.append(((this.covarianceMoonGravity == null)?"<null>":this.covarianceMoonGravity));
        sb.append(',');
        sb.append("covarianceSolarRadiationPressure");
        sb.append('=');
        sb.append(((this.covarianceSolarRadiationPressure == null)?"<null>":this.covarianceSolarRadiationPressure));
        sb.append(',');
        sb.append("computeNoiseMatrix");
        sb.append('=');
        sb.append(((this.computeNoiseMatrix == null)?"<null>":this.computeNoiseMatrix));
        sb.append(',');
        sb.append("useEop");
        sb.append('=');
        sb.append(((this.useEop == null)?"<null>":this.useEop));
        sb.append(',');
        sb.append("precessionNutationLookup");
        sb.append('=');
        sb.append(((this.precessionNutationLookup == null)?"<null>":this.precessionNutationLookup));
        sb.append(',');
        sb.append("solarActivityForecast");
        sb.append('=');
        sb.append(((this.solarActivityForecast == null)?"<null>":this.solarActivityForecast));
        sb.append(',');
        sb.append("geoAp");
        sb.append('=');
        sb.append(((this.geoAp == null)?"<null>":this.geoAp));
        sb.append(',');
        sb.append("solarF107");
        sb.append('=');
        sb.append(((this.solarF107 == null)?"<null>":this.solarF107));
        sb.append(',');
        sb.append("stormerCowellRelTolerance");
        sb.append('=');
        sb.append(((this.stormerCowellRelTolerance == null)?"<null>":this.stormerCowellRelTolerance));
        sb.append(',');
        sb.append("stormerCowellAbsTolerance");
        sb.append('=');
        sb.append(((this.stormerCowellAbsTolerance == null)?"<null>":this.stormerCowellAbsTolerance));
        sb.append(',');
        sb.append("covarianceIntegrationStep");
        sb.append('=');
        sb.append(((this.covarianceIntegrationStep == null)?"<null>":this.covarianceIntegrationStep));
        sb.append(',');
        sb.append("covarianceIntegrationMethod");
        sb.append('=');
        sb.append(((this.covarianceIntegrationMethod == null)?"<null>":this.covarianceIntegrationMethod));
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
        result = ((result* 31)+((this.earthAlbedo == null)? 0 :this.earthAlbedo.hashCode()));
        result = ((result* 31)+((this.computeNoiseMatrix == null)? 0 :this.computeNoiseMatrix.hashCode()));
        result = ((result* 31)+((this.solarActivityForecast == null)? 0 :this.solarActivityForecast.hashCode()));
        result = ((result* 31)+((this.geopotentialModel == null)? 0 :this.geopotentialModel.hashCode()));
        result = ((result* 31)+((this.stormerCowellAbsTolerance == null)? 0 :this.stormerCowellAbsTolerance.hashCode()));
        result = ((result* 31)+((this.covarianceSunGravity == null)? 0 :this.covarianceSunGravity.hashCode()));
        result = ((result* 31)+((this.covarianceIntegrationStep == null)? 0 :this.covarianceIntegrationStep.hashCode()));
        result = ((result* 31)+((this.covarianceIntegrationMethod == null)? 0 :this.covarianceIntegrationMethod.hashCode()));
        result = ((result* 31)+((this.sunGravity == null)? 0 :this.sunGravity.hashCode()));
        result = ((result* 31)+((this.useEop == null)? 0 :this.useEop.hashCode()));
        result = ((result* 31)+((this.precessionNutationLookup == null)? 0 :this.precessionNutationLookup.hashCode()));
        result = ((result* 31)+((this.covarianceGeopotential == null)? 0 :this.covarianceGeopotential.hashCode()));
        result = ((result* 31)+((this.atmosphericModel == null)? 0 :this.atmosphericModel.hashCode()));
        result = ((result* 31)+((this.covariancePropagation == null)? 0 :this.covariancePropagation.hashCode()));
        result = ((result* 31)+((this.moonGravity == null)? 0 :this.moonGravity.hashCode()));
        result = ((result* 31)+((this.solarF107 == null)? 0 :this.solarF107 .hashCode()));
        result = ((result* 31)+((this.solidTides == null)? 0 :this.solidTides.hashCode()));
        result = ((result* 31)+((this.covarianceAtmosphericDrag == null)? 0 :this.covarianceAtmosphericDrag.hashCode()));
        result = ((result* 31)+((this.outputStepSize == null)? 0 :this.outputStepSize.hashCode()));
        result = ((result* 31)+((this.shadowModel == null)? 0 :this.shadowModel.hashCode()));
        result = ((result* 31)+((this.shadowBoundaryCorrection == null)? 0 :this.shadowBoundaryCorrection.hashCode()));
        result = ((result* 31)+((this.solarRadiationPressure == null)? 0 :this.solarRadiationPressure.hashCode()));
        result = ((result* 31)+((this.atmosphericDrag == null)? 0 :this.atmosphericDrag.hashCode()));
        result = ((result* 31)+((this.covariancePropagationMethod == null)? 0 :this.covariancePropagationMethod.hashCode()));
        result = ((result* 31)+((this.geopotentialDegreeOrder == null)? 0 :this.geopotentialDegreeOrder.hashCode()));
        result = ((result* 31)+((this.oceanTides == null)? 0 :this.oceanTides.hashCode()));
        result = ((result* 31)+((this.stormerCowellRelTolerance == null)? 0 :this.stormerCowellRelTolerance.hashCode()));
        result = ((result* 31)+((this.geoAp == null)? 0 :this.geoAp.hashCode()));
        result = ((result* 31)+((this.covarianceSolarRadiationPressure == null)? 0 :this.covarianceSolarRadiationPressure.hashCode()));
        result = ((result* 31)+((this.covarianceMoonGravity == null)? 0 :this.covarianceMoonGravity.hashCode()));
        result = ((result* 31)+((this.horizontalWind == null)? 0 :this.horizontalWind.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SharedPropagationSettings) == false) {
            return false;
        }
        SharedPropagationSettings rhs = ((SharedPropagationSettings) other);
        return ((((((((((((((((((((((((((((((((this.earthAlbedo == rhs.earthAlbedo)||((this.earthAlbedo!= null)&&this.earthAlbedo.equals(rhs.earthAlbedo)))&&((this.computeNoiseMatrix == rhs.computeNoiseMatrix)||((this.computeNoiseMatrix!= null)&&this.computeNoiseMatrix.equals(rhs.computeNoiseMatrix))))&&((this.solarActivityForecast == rhs.solarActivityForecast)||((this.solarActivityForecast!= null)&&this.solarActivityForecast.equals(rhs.solarActivityForecast))))&&((this.geopotentialModel == rhs.geopotentialModel)||((this.geopotentialModel!= null)&&this.geopotentialModel.equals(rhs.geopotentialModel))))&&((this.stormerCowellAbsTolerance == rhs.stormerCowellAbsTolerance)||((this.stormerCowellAbsTolerance!= null)&&this.stormerCowellAbsTolerance.equals(rhs.stormerCowellAbsTolerance))))&&((this.covarianceSunGravity == rhs.covarianceSunGravity)||((this.covarianceSunGravity!= null)&&this.covarianceSunGravity.equals(rhs.covarianceSunGravity))))&&((this.covarianceIntegrationStep == rhs.covarianceIntegrationStep)||((this.covarianceIntegrationStep!= null)&&this.covarianceIntegrationStep.equals(rhs.covarianceIntegrationStep))))&&((this.covarianceIntegrationMethod == rhs.covarianceIntegrationMethod)||((this.covarianceIntegrationMethod!= null)&&this.covarianceIntegrationMethod.equals(rhs.covarianceIntegrationMethod))))&&((this.sunGravity == rhs.sunGravity)||((this.sunGravity!= null)&&this.sunGravity.equals(rhs.sunGravity))))&&((this.useEop == rhs.useEop)||((this.useEop!= null)&&this.useEop.equals(rhs.useEop))))&&((this.precessionNutationLookup == rhs.precessionNutationLookup)||((this.precessionNutationLookup!= null)&&this.precessionNutationLookup.equals(rhs.precessionNutationLookup))))&&((this.covarianceGeopotential == rhs.covarianceGeopotential)||((this.covarianceGeopotential!= null)&&this.covarianceGeopotential.equals(rhs.covarianceGeopotential))))&&((this.atmosphericModel == rhs.atmosphericModel)||((this.atmosphericModel!= null)&&this.atmosphericModel.equals(rhs.atmosphericModel))))&&((this.covariancePropagation == rhs.covariancePropagation)||((this.covariancePropagation!= null)&&this.covariancePropagation.equals(rhs.covariancePropagation))))&&((this.moonGravity == rhs.moonGravity)||((this.moonGravity!= null)&&this.moonGravity.equals(rhs.moonGravity))))&&((this.solarF107 == rhs.solarF107)||((this.solarF107 != null)&&this.solarF107 .equals(rhs.solarF107))))&&((this.solidTides == rhs.solidTides)||((this.solidTides!= null)&&this.solidTides.equals(rhs.solidTides))))&&((this.covarianceAtmosphericDrag == rhs.covarianceAtmosphericDrag)||((this.covarianceAtmosphericDrag!= null)&&this.covarianceAtmosphericDrag.equals(rhs.covarianceAtmosphericDrag))))&&((this.outputStepSize == rhs.outputStepSize)||((this.outputStepSize!= null)&&this.outputStepSize.equals(rhs.outputStepSize))))&&((this.shadowModel == rhs.shadowModel)||((this.shadowModel!= null)&&this.shadowModel.equals(rhs.shadowModel))))&&((this.shadowBoundaryCorrection == rhs.shadowBoundaryCorrection)||((this.shadowBoundaryCorrection!= null)&&this.shadowBoundaryCorrection.equals(rhs.shadowBoundaryCorrection))))&&((this.solarRadiationPressure == rhs.solarRadiationPressure)||((this.solarRadiationPressure!= null)&&this.solarRadiationPressure.equals(rhs.solarRadiationPressure))))&&((this.atmosphericDrag == rhs.atmosphericDrag)||((this.atmosphericDrag!= null)&&this.atmosphericDrag.equals(rhs.atmosphericDrag))))&&((this.covariancePropagationMethod == rhs.covariancePropagationMethod)||((this.covariancePropagationMethod!= null)&&this.covariancePropagationMethod.equals(rhs.covariancePropagationMethod))))&&((this.geopotentialDegreeOrder == rhs.geopotentialDegreeOrder)||((this.geopotentialDegreeOrder!= null)&&this.geopotentialDegreeOrder.equals(rhs.geopotentialDegreeOrder))))&&((this.oceanTides == rhs.oceanTides)||((this.oceanTides!= null)&&this.oceanTides.equals(rhs.oceanTides))))&&((this.stormerCowellRelTolerance == rhs.stormerCowellRelTolerance)||((this.stormerCowellRelTolerance!= null)&&this.stormerCowellRelTolerance.equals(rhs.stormerCowellRelTolerance))))&&((this.geoAp == rhs.geoAp)||((this.geoAp!= null)&&this.geoAp.equals(rhs.geoAp))))&&((this.covarianceSolarRadiationPressure == rhs.covarianceSolarRadiationPressure)||((this.covarianceSolarRadiationPressure!= null)&&this.covarianceSolarRadiationPressure.equals(rhs.covarianceSolarRadiationPressure))))&&((this.covarianceMoonGravity == rhs.covarianceMoonGravity)||((this.covarianceMoonGravity!= null)&&this.covarianceMoonGravity.equals(rhs.covarianceMoonGravity))))&&((this.horizontalWind == rhs.horizontalWind)||((this.horizontalWind!= null)&&this.horizontalWind.equals(rhs.horizontalWind))));
    }


    /**
     * Use Exponential or NRLMSISE-00. Default is NRLMSISE-00.
     * 
     */
    public enum AtmosphericModel {

        EXPONENTIAL("Exponential"),
        NRLMSISE_00("NRLMSISE-00"),
        JB_2008("JB2008");
        private final String value;
        private final static Map<String, SharedPropagationSettings.AtmosphericModel> CONSTANTS = new HashMap<String, SharedPropagationSettings.AtmosphericModel>();

        static {
            for (SharedPropagationSettings.AtmosphericModel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AtmosphericModel(String value) {
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
        public static SharedPropagationSettings.AtmosphericModel fromValue(String value) {
            SharedPropagationSettings.AtmosphericModel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Choose EGM96, EGM2008 or EIGEN-GL04C. Standard is EIGEN-GL04C.
     * 
     */
    public enum GeopotentialModel {

        EGM_96("EGM96"),
        EGM_2008("EGM2008"),
        EIGEN_GL_04_C("EIGEN-GL04C");
        private final String value;
        private final static Map<String, SharedPropagationSettings.GeopotentialModel> CONSTANTS = new HashMap<String, SharedPropagationSettings.GeopotentialModel>();

        static {
            for (SharedPropagationSettings.GeopotentialModel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private GeopotentialModel(String value) {
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
        public static SharedPropagationSettings.GeopotentialModel fromValue(String value) {
            SharedPropagationSettings.GeopotentialModel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Use either conical or none. Default is conical.
     * 
     */
    public enum ShadowModel {

        CONICAL("conical"),
        NONE("none");
        private final String value;
        private final static Map<String, SharedPropagationSettings.ShadowModel> CONSTANTS = new HashMap<String, SharedPropagationSettings.ShadowModel>();

        static {
            for (SharedPropagationSettings.ShadowModel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ShadowModel(String value) {
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
        public static SharedPropagationSettings.ShadowModel fromValue(String value) {
            SharedPropagationSettings.ShadowModel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Describe, which solar and geomagnetic activity forecast shall be used. Choose "celestrak", "esa" or "constant". If constant is chosen, the values geo_ap and solar_f107 are used. Standard is esa.
     * 
     */
    public enum SolarActivityForecast {

        CELESTRAK("celestrak"),
        ESA("esa"),
        CONSTANT("constant"),
        JB_2008("jb2008");
        private final String value;
        private final static Map<String, SharedPropagationSettings.SolarActivityForecast> CONSTANTS = new HashMap<String, SharedPropagationSettings.SolarActivityForecast>();

        static {
            for (SharedPropagationSettings.SolarActivityForecast c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SolarActivityForecast(String value) {
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
        public static SharedPropagationSettings.SolarActivityForecast fromValue(String value) {
            SharedPropagationSettings.SolarActivityForecast constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
