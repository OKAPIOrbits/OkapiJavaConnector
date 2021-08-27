
package com.okapiorbits.platform.science.jobs.json;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CcsdsCdm
 * <p>
 * The CCSDS CDM definition.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CCSDS_CDM_VERS",
    "CREATION_DATE",
    "ORIGINATOR",
    "MESSAGE_FOR",
    "MESSAGE_ID",
    "TCA",
    "MISS_DISTANCE",
    "RELATIVE_SPEED",
    "RELATIVE_POSITION_R",
    "RELATIVE_POSITION_T",
    "RELATIVE_POSITION_N",
    "RELATIVE_VELOCITY_R",
    "RELATIVE_VELOCITY_T",
    "RELATIVE_VELOCITY_N",
    "COLLISION_PROBABILITY",
    "COLLISION_PROBABILITY_METHOD",
    "SAT1_OBJECT",
    "SAT1_OBJECT_DESIGNATOR",
    "SAT1_CATALOG_NAME",
    "SAT1_OBJECT_NAME",
    "SAT1_INTERNATIONAL_DESIGNATOR",
    "SAT1_OBJECT_TYPE",
    "SAT1_OPERATOR_ORGANIZATION",
    "SAT1_COVARIANCE_METHOD",
    "SAT1_MANEUVERABLE",
    "SAT1_REF_FRAME",
    "SAT1_GRAVITY_MODEL",
    "SAT1_ATMOSPHERIC_MODEL",
    "SAT1_N_BODY_PERTURBATIONS",
    "SAT1_SOLAR_RAD_PRESSURE",
    "SAT1_EARTH_TIDES",
    "SAT1_INTRACK_THRUST",
    "SAT1_TIME_LASTOB_START",
    "SAT1_TIME_LASTOB_END",
    "SAT1_RECOMMENDED_OD_SPAN",
    "SAT1_ACTUAL_OD_SPAN",
    "SAT1_OBS_AVAILABLE",
    "SAT1_OBS_USED",
    "SAT1_RESIDUALS_ACCEPTED",
    "SAT1_WEIGHTED_RMS",
    "SAT1_AREA_PC",
    "SAT1_CD_AREA_OVER_MASS",
    "SAT1_CR_AREA_OVER_MASS",
    "SAT1_THRUST_ACCELERATION",
    "SAT1_SEDR",
    "SAT1_X",
    "SAT1_Y",
    "SAT1_Z",
    "SAT1_X_DOT",
    "SAT1_Y_DOT",
    "SAT1_Z_DOT",
    "SAT1_CR_R",
    "SAT1_CT_R",
    "SAT1_CT_T",
    "SAT1_CN_R",
    "SAT1_CN_T",
    "SAT1_CN_N",
    "SAT1_CRDOT_R",
    "SAT1_CRDOT_T",
    "SAT1_CRDOT_N",
    "SAT1_CRDOT_RDOT",
    "SAT1_CTDOT_R",
    "SAT1_CTDOT_T",
    "SAT1_CTDOT_N",
    "SAT1_CTDOT_RDOT",
    "SAT1_CTDOT_TDOT",
    "SAT1_CNDOT_R",
    "SAT1_CNDOT_T",
    "SAT1_CNDOT_N",
    "SAT1_CNDOT_RDOT",
    "SAT1_CNDOT_TDOT",
    "SAT1_CNDOT_NDOT",
    "SAT1_CDRG_R",
    "SAT1_CDRG_T",
    "SAT1_CDRG_N",
    "SAT1_CDRG_RDOT",
    "SAT1_CDRG_TDOT",
    "SAT1_CDRG_NDOT",
    "SAT1_CDRG_DRG",
    "SAT1_CSRP_R",
    "SAT1_CSRP_T",
    "SAT1_CSRP_N",
    "SAT1_CSRP_RDOT",
    "SAT1_CSRP_TDOT",
    "SAT1_CSRP_NDOT",
    "SAT1_CSRP_DRG",
    "SAT1_CSRP_SRP",
    "SAT2_OBJECT",
    "SAT2_OBJECT_DESIGNATOR",
    "SAT2_CATALOG_NAME",
    "SAT2_OBJECT_NAME",
    "SAT2_INTERNATIONAL_DESIGNATOR",
    "SAT2_OBJECT_TYPE",
    "SAT2_OPERATOR_ORGANIZATION",
    "SAT2_COVARIANCE_METHOD",
    "SAT2_MANEUVERABLE",
    "SAT2_REF_FRAME",
    "SAT2_GRAVITY_MODEL",
    "SAT2_ATMOSPHERIC_MODEL",
    "SAT2_N_BODY_PERTURBATIONS",
    "SAT2_SOLAR_RAD_PRESSURE",
    "SAT2_EARTH_TIDES",
    "SAT2_INTRACK_THRUST",
    "SAT2_TIME_LASTOB_START",
    "SAT2_TIME_LASTOB_END",
    "SAT2_RECOMMENDED_OD_SPAN",
    "SAT2_ACTUAL_OD_SPAN",
    "SAT2_OBS_AVAILABLE",
    "SAT2_OBS_USED",
    "SAT2_RESIDUALS_ACCEPTED",
    "SAT2_WEIGHTED_RMS",
    "SAT2_AREA_PC",
    "SAT2_CD_AREA_OVER_MASS",
    "SAT2_CR_AREA_OVER_MASS",
    "SAT2_THRUST_ACCELERATION",
    "SAT2_SEDR",
    "SAT2_X",
    "SAT2_Y",
    "SAT2_Z",
    "SAT2_X_DOT",
    "SAT2_Y_DOT",
    "SAT2_Z_DOT",
    "SAT2_CR_R",
    "SAT2_CT_R",
    "SAT2_CT_T",
    "SAT2_CN_R",
    "SAT2_CN_T",
    "SAT2_CN_N",
    "SAT2_CRDOT_R",
    "SAT2_CRDOT_T",
    "SAT2_CRDOT_N",
    "SAT2_CRDOT_RDOT",
    "SAT2_CTDOT_R",
    "SAT2_CTDOT_T",
    "SAT2_CTDOT_N",
    "SAT2_CTDOT_RDOT",
    "SAT2_CTDOT_TDOT",
    "SAT2_CNDOT_R",
    "SAT2_CNDOT_T",
    "SAT2_CNDOT_N",
    "SAT2_CNDOT_RDOT",
    "SAT2_CNDOT_TDOT",
    "SAT2_CNDOT_NDOT",
    "SAT2_CDRG_R",
    "SAT2_CDRG_T",
    "SAT2_CDRG_N",
    "SAT2_CDRG_RDOT",
    "SAT2_CDRG_TDOT",
    "SAT2_CDRG_NDOT",
    "SAT2_CDRG_DRG",
    "SAT2_CSRP_R",
    "SAT2_CSRP_T",
    "SAT2_CSRP_N",
    "SAT2_CSRP_RDOT",
    "SAT2_CSRP_TDOT",
    "SAT2_CSRP_NDOT",
    "SAT2_CSRP_DRG",
    "SAT2_CSRP_SRP"
})
public class CcsdsCdm {

    /**
     * Version of the CDM format
     * (Required)
     * 
     */
    @JsonProperty("CCSDS_CDM_VERS")
    @JsonPropertyDescription("Version of the CDM format")
    private Double ccsdsCdmVers;
    /**
     * Message creation date/time in Coordinated Universal Time (UTC).
     * 
     */
    @JsonProperty("CREATION_DATE")
    @JsonPropertyDescription("Message creation date/time in Coordinated Universal Time (UTC).")
    private Date creationDate;
    /**
     * Creating agency or owner/operator. Value should be the ‘Abbreviation’ value from the [SANA Organizations registry](https://sanaregistry.org/r/organizations) for an organization that has the Role of ‘Conjunction Data Message Originator’.
     * 
     */
    @JsonProperty("ORIGINATOR")
    @JsonPropertyDescription("Creating agency or owner/operator. Value should be the \u2018Abbreviation\u2019 value from the [SANA Organizations registry](https://sanaregistry.org/r/organizations) for an organization that has the Role of \u2018Conjunction Data Message Originator\u2019.")
    private String originator;
    /**
     * Spacecraft name(s) for which the CDM is provided.
     * 
     */
    @JsonProperty("MESSAGE_FOR")
    @JsonPropertyDescription("Spacecraft name(s) for which the CDM is provided.")
    private String messageFor;
    /**
     * ID that uniquely identifies a message from a given originator. The format and content of the message identifier value are at the discretion of the originator.
     * 
     */
    @JsonProperty("MESSAGE_ID")
    @JsonPropertyDescription("ID that uniquely identifies a message from a given originator. The format and content of the message identifier value are at the discretion of the originator.")
    private String messageId;
    /**
     * The date and time in UTC of the closest approach.
     * (Required)
     * 
     */
    @JsonProperty("TCA")
    @JsonPropertyDescription("The date and time in UTC of the closest approach.")
    private Date tca;
    /**
     * The norm of the relative position vector. It indicates how close the two objects are at TCA.
     * 
     */
    @JsonProperty("MISS_DISTANCE")
    @JsonPropertyDescription("The norm of the relative position vector. It indicates how close the two objects are at TCA.")
    private Double missDistance;
    /**
     * The norm of the relative velocity vector. It indicates how fast the two objects are moving relative to each other at TCA.
     * 
     */
    @JsonProperty("RELATIVE_SPEED")
    @JsonPropertyDescription("The norm of the relative velocity vector. It indicates how fast the two objects are moving relative to each other at TCA.")
    private Double relativeSpeed;
    /**
     * The R component of Object2’s position relative to Object1’s position in the Radial, Transverse, and Normal (RTN) coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_R")
    @JsonPropertyDescription("The R component of Object2\u2019s position relative to Object1\u2019s position in the Radial, Transverse, and Normal (RTN) coordinate frame.")
    private Double relativePositionR;
    /**
     * The T component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_T")
    @JsonPropertyDescription("The T component of Object2\u2019s position relative to Object1\u2019s position in the RTN coordinate frame.")
    private Double relativePositionT;
    /**
     * The N component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_N")
    @JsonPropertyDescription("The N component of Object2\u2019s position relative to Object1\u2019s position in the RTN coordinate frame.")
    private Double relativePositionN;
    /**
     * The R component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_R")
    @JsonPropertyDescription("The R component of Object2\u2019s velocity relative to Object1\u2019s velocity in the RTN coordinate frame.")
    private Double relativeVelocityR;
    /**
     * The T component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_T")
    @JsonPropertyDescription("The T component of Object2\u2019s velocity relative to Object1\u2019s velocity in the RTN coordinate frame.")
    private Double relativeVelocityT;
    /**
     * The N component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_N")
    @JsonPropertyDescription("The N component of Object2\u2019s velocity relative to Object1\u2019s velocity in the RTN coordinate frame.")
    private Double relativeVelocityN;
    /**
     * The probability (denoted ‘p’ where 0.0<=p<=1.0), that Object1 and Object2 will collide.
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY")
    @JsonPropertyDescription("The probability (denoted \u2018p\u2019 where 0.0<=p<=1.0), that Object1 and Object2 will collide.")
    private Double collisionProbability;
    /**
     * The method that was used to calculate the collision probability. (FOSTER-1992;CHAN-1997;PATERA-2001;ALFANO-2005;MCKINLEY-2006 from [CPM registry](https://sanaregistry.org/r/cdm_cpm)
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY_METHOD")
    @JsonPropertyDescription("The method that was used to calculate the collision probability. (FOSTER-1992;CHAN-1997;PATERA-2001;ALFANO-2005;MCKINLEY-2006 from [CPM registry](https://sanaregistry.org/r/cdm_cpm)")
    private String collisionProbabilityMethod;
    /**
     * The object to which the metadata and data apply
     * (Required)
     * 
     */
    @JsonProperty("SAT1_OBJECT")
    @JsonPropertyDescription("The object to which the metadata and data apply")
    private String sat1Object;
    /**
     * The satellite catalog designator for the object.
     * 
     */
    @JsonProperty("SAT1_OBJECT_DESIGNATOR")
    @JsonPropertyDescription("The satellite catalog designator for the object.")
    private String sat1ObjectDesignator;
    /**
     * The satellite catalog used for the object. Value should be taken from the [SANA ‘Conjunction Data Message CATALOG_NAME’ registry](https://sanaregistry.org/r/cdm_catalog).
     * 
     */
    @JsonProperty("SAT1_CATALOG_NAME")
    @JsonPropertyDescription("The satellite catalog used for the object. Value should be taken from the [SANA \u2018Conjunction Data Message CATALOG_NAME\u2019 registry](https://sanaregistry.org/r/cdm_catalog).")
    private String sat1CatalogName;
    /**
     * Spacecraft name for the object.
     * 
     */
    @JsonProperty("SAT1_OBJECT_NAME")
    @JsonPropertyDescription("Spacecraft name for the object.")
    private String sat1ObjectName;
    /**
     * The full international designator for the object. Values shall have the format YYYY-NNNP{PP}, where: YYYY = year of launch; NNN = three-digit serial number of launch (with leading zeros); P{PP} = At least one capital letter for the identification of the part brought into space by the launch. In cases where the object has no international designator, the value UNKNOWN should be used.
     * 
     */
    @JsonProperty("SAT1_INTERNATIONAL_DESIGNATOR")
    @JsonPropertyDescription("The full international designator for the object. Values shall have the format YYYY-NNNP{PP}, where: YYYY = year of launch; NNN = three-digit serial number of launch (with leading zeros); P{PP} = At least one capital letter for the identification of the part brought into space by the launch. In cases where the object has no international designator, the value UNKNOWN should be used.")
    private String sat1InternationalDesignator;
    /**
     * The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)
     * (Required)
     * 
     */
    @JsonProperty("SAT1_OBJECT_TYPE")
    @JsonPropertyDescription("The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)")
    private String sat1ObjectType;
    /**
     * Contact organization of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_ORGANIZATION")
    @JsonPropertyDescription("Contact organization of the object.")
    private String sat1OperatorOrganization;
    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_COVARIANCE_METHOD")
    @JsonPropertyDescription("Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.")
    private String sat1CovarianceMethod;
    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * (Required)
     * 
     */
    @JsonProperty("SAT1_MANEUVERABLE")
    @JsonPropertyDescription("The maneuver capacity of the object. (YES;NO;N/A)")
    private String sat1Maneuverable;
    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2. (GCRF;EME2000;ITRF)
     * (Required)
     * 
     */
    @JsonProperty("SAT1_REF_FRAME")
    @JsonPropertyDescription("Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2. (GCRF;EME2000;ITRF)")
    private String sat1RefFrame;
    /**
     * The gravity model used for the OD of the object. (EGM-96: 36D 36O; WGS-84_GEOID: 24D 24O; JGM-2 : 41D 41O)
     * 
     */
    @JsonProperty("SAT1_GRAVITY_MODEL")
    @JsonPropertyDescription("The gravity model used for the OD of the object. (EGM-96: 36D 36O; WGS-84_GEOID: 24D 24O; JGM-2 : 41D 41O)")
    private String sat1GravityModel;
    /**
     * The atmospheric density model used for the OD of the object. If ‘NONE’ is specified, then no atmospheric model was used. (JACCHIA 70; MSIS; JACCHIA 70 DCA; NONE)
     * 
     */
    @JsonProperty("SAT1_ATMOSPHERIC_MODEL")
    @JsonPropertyDescription("The atmospheric density model used for the OD of the object. If \u2018NONE\u2019 is specified, then no atmospheric model was used. (JACCHIA 70; MSIS; JACCHIA 70 DCA; NONE)")
    private String sat1AtmosphericModel;
    /**
     * The N-body gravitational perturbations used for the OD of the object. If ‘NONE’ is specified, then no third-body gravitational perturbations were used. (MOON, SUN, JUPITER, NONE)
     * 
     */
    @JsonProperty("SAT1_N_BODY_PERTURBATIONS")
    @JsonPropertyDescription("The N-body gravitational perturbations used for the OD of the object. If \u2018NONE\u2019 is specified, then no third-body gravitational perturbations were used. (MOON, SUN, JUPITER, NONE)")
    private String sat1NBodyPerturbations;
    /**
     * Indication of whether solar radiation pressure perturbations were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_SOLAR_RAD_PRESSURE")
    @JsonPropertyDescription("Indication of whether solar radiation pressure perturbations were used for the OD of the object.")
    private String sat1SolarRadPressure;
    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_EARTH_TIDES")
    @JsonPropertyDescription("Indication of whether solid Earth and ocean tides were used for the OD of the object.")
    private String sat1EarthTides;
    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_INTRACK_THRUST")
    @JsonPropertyDescription("Indication of whether in-track thrust modeling was used for the OD of the object.")
    private String sat1IntrackThrust;
    /**
     * The start of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_START")
    @JsonPropertyDescription("The start of a time interval (UTC) that contains the time of the last accepted observation.")
    private String sat1TimeLastobStart;
    /**
     * The end of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_END")
    @JsonPropertyDescription("The end of a time interval (UTC) that contains the time of the last accepted observation.")
    private String sat1TimeLastobEnd;
    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT1_RECOMMENDED_OD_SPAN")
    @JsonPropertyDescription("The recommended OD time span calculated for the object.")
    private Double sat1RecommendedOdSpan;
    @JsonProperty("SAT1_ACTUAL_OD_SPAN")
    private Double sat1ActualOdSpan;
    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_AVAILABLE")
    @JsonPropertyDescription("The number of sensor tracks available for the OD of the object.")
    private Integer sat1ObsAvailable;
    /**
     * The number of sensor tracks accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_USED")
    @JsonPropertyDescription("The number of sensor tracks accepted for the OD of the object.")
    private Integer sat1ObsUsed;
    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT1_RESIDUALS_ACCEPTED")
    @JsonPropertyDescription("The percentage of residuals accepted in the OD of the object")
    private Double sat1ResidualsAccepted;
    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT1_WEIGHTED_RMS")
    @JsonPropertyDescription("The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD")
    private Double sat1WeightedRms;
    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT1_AREA_PC")
    @JsonPropertyDescription("The actual area of the object in m**2.")
    private Double sat1AreaPc;
    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CD_AREA_OVER_MASS")
    @JsonPropertyDescription("The objects CD*A/m used to propagate the state vector and covariance to TCA.")
    private Double sat1CdAreaOverMass;
    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CR_AREA_OVER_MASS")
    @JsonPropertyDescription("The objects CR*A/m used to propagate the state vector and covariance to TCA.")
    private Double sat1CrAreaOverMass;
    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_THRUST_ACCELERATION")
    @JsonPropertyDescription("The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.")
    private Double sat1ThrustAcceleration;
    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT1_SEDR")
    @JsonPropertyDescription("The amount of energy being removed from the object\u2019s orbit by atmospheric drag. This value is an average calculated during the OD.")
    private Double sat1Sedr;
    /**
     * Object position vector X component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_X")
    @JsonPropertyDescription("Object position vector X component")
    private Double sat1X;
    /**
     * Object position vector Y component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Y")
    @JsonPropertyDescription("Object position vector Y component")
    private Double sat1Y;
    /**
     * Object position vector Z component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Z")
    @JsonPropertyDescription("Object position vector Z component")
    private Double sat1Z;
    /**
     * Object position vector X_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_X_DOT")
    @JsonPropertyDescription("Object position vector X_DOT component")
    private Double sat1XDot;
    /**
     * Object position vector Y_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Y_DOT")
    @JsonPropertyDescription("Object position vector Y_DOT component")
    private Double sat1YDot;
    /**
     * Object position vector Z_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Z_DOT")
    @JsonPropertyDescription("Object position vector Z_DOT component")
    private Double sat1ZDot;
    /**
     * Object covariance matrix [1,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CR_R")
    @JsonPropertyDescription("Object covariance matrix [1,1]")
    private Double sat1CrR;
    /**
     * Object covariance matrix [2,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CT_R")
    @JsonPropertyDescription("Object covariance matrix [2,1]")
    private Double sat1CtR;
    /**
     * Object covariance matrix [2,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CT_T")
    @JsonPropertyDescription("Object covariance matrix [2,2]")
    private Double sat1CtT;
    /**
     * Object covariance matrix [3,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CN_R")
    @JsonPropertyDescription("Object covariance matrix [3,1]")
    private Double sat1CnR;
    /**
     * Object covariance matrix [3,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CN_T")
    @JsonPropertyDescription("Object covariance matrix [3,2]")
    private Double sat1CnT;
    /**
     * Object covariance matrix [3,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CN_N")
    @JsonPropertyDescription("Object covariance matrix [3,3]")
    private Double sat1CnN;
    /**
     * Object covariance matrix [4,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_R")
    @JsonPropertyDescription("Object covariance matrix [4,1]")
    private Double sat1CrdotR;
    /**
     * Object covariance matrix [4,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_T")
    @JsonPropertyDescription("Object covariance matrix [4,2]")
    private Double sat1CrdotT;
    /**
     * Object covariance matrix [4,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_N")
    @JsonPropertyDescription("Object covariance matrix [4,3]")
    private Double sat1CrdotN;
    /**
     * Object covariance matrix [4,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_RDOT")
    @JsonPropertyDescription("Object covariance matrix [4,4]")
    private Double sat1CrdotRdot;
    /**
     * Object covariance matrix [5,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_R")
    @JsonPropertyDescription("Object covariance matrix [5,1]")
    private Double sat1CtdotR;
    /**
     * Object covariance matrix [5,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_T")
    @JsonPropertyDescription("Object covariance matrix [5,2]")
    private Double sat1CtdotT;
    /**
     * Object covariance matrix [5,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_N")
    @JsonPropertyDescription("Object covariance matrix [5,3]")
    private Double sat1CtdotN;
    /**
     * Object covariance matrix [5,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_RDOT")
    @JsonPropertyDescription("Object covariance matrix [5,4]")
    private Double sat1CtdotRdot;
    /**
     * Object covariance matrix [5,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_TDOT")
    @JsonPropertyDescription("Object covariance matrix [5,5]")
    private Double sat1CtdotTdot;
    /**
     * Object covariance matrix [6,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_R")
    @JsonPropertyDescription("Object covariance matrix [6,1]")
    private Double sat1CndotR;
    /**
     * Object covariance matrix [6,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_T")
    @JsonPropertyDescription("Object covariance matrix [6,2]")
    private Double sat1CndotT;
    /**
     * Object covariance matrix [6,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_N")
    @JsonPropertyDescription("Object covariance matrix [6,3]")
    private Double sat1CndotN;
    /**
     * Object covariance matrix [6,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_RDOT")
    @JsonPropertyDescription("Object covariance matrix [6,4]")
    private Double sat1CndotRdot;
    /**
     * Object covariance matrix [6,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_TDOT")
    @JsonPropertyDescription("Object covariance matrix [6,5]")
    private Double sat1CndotTdot;
    /**
     * Object covariance matrix [6,6]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_NDOT")
    @JsonPropertyDescription("Object covariance matrix [6,6]")
    private Double sat1CndotNdot;
    /**
     * Object covariance matrix [7,1]
     * 
     */
    @JsonProperty("SAT1_CDRG_R")
    @JsonPropertyDescription("Object covariance matrix [7,1]")
    private Double sat1CdrgR;
    /**
     * Object covariance matrix [7,2]
     * 
     */
    @JsonProperty("SAT1_CDRG_T")
    @JsonPropertyDescription("Object covariance matrix [7,2]")
    private Double sat1CdrgT;
    /**
     * Object covariance matrix [7,3]
     * 
     */
    @JsonProperty("SAT1_CDRG_N")
    @JsonPropertyDescription("Object covariance matrix [7,3]")
    private Double sat1CdrgN;
    /**
     * Object covariance matrix [7,4]
     * 
     */
    @JsonProperty("SAT1_CDRG_RDOT")
    @JsonPropertyDescription("Object covariance matrix [7,4]")
    private Double sat1CdrgRdot;
    /**
     * Object covariance matrix [7,5]
     * 
     */
    @JsonProperty("SAT1_CDRG_TDOT")
    @JsonPropertyDescription("Object covariance matrix [7,5]")
    private Double sat1CdrgTdot;
    /**
     * Object covariance matrix [7,6]
     * 
     */
    @JsonProperty("SAT1_CDRG_NDOT")
    @JsonPropertyDescription("Object covariance matrix [7,6]")
    private Double sat1CdrgNdot;
    /**
     * Object covariance matrix [7,7]
     * 
     */
    @JsonProperty("SAT1_CDRG_DRG")
    @JsonPropertyDescription("Object covariance matrix [7,7]")
    private Double sat1CdrgDrg;
    /**
     * Object covariance matrix [8,1]
     * 
     */
    @JsonProperty("SAT1_CSRP_R")
    @JsonPropertyDescription("Object covariance matrix [8,1]")
    private Double sat1CsrpR;
    /**
     * Object covariance matrix [8,2]
     * 
     */
    @JsonProperty("SAT1_CSRP_T")
    @JsonPropertyDescription("Object covariance matrix [8,2]")
    private Double sat1CsrpT;
    /**
     * Object covariance matrix [8,3]
     * 
     */
    @JsonProperty("SAT1_CSRP_N")
    @JsonPropertyDescription("Object covariance matrix [8,3]")
    private Double sat1CsrpN;
    /**
     * Object covariance matrix [8,4]
     * 
     */
    @JsonProperty("SAT1_CSRP_RDOT")
    @JsonPropertyDescription("Object covariance matrix [8,4]")
    private Double sat1CsrpRdot;
    /**
     * Object covariance matrix [8,5]
     * 
     */
    @JsonProperty("SAT1_CSRP_TDOT")
    @JsonPropertyDescription("Object covariance matrix [8,5]")
    private Double sat1CsrpTdot;
    /**
     * Object covariance matrix [8,6]
     * 
     */
    @JsonProperty("SAT1_CSRP_NDOT")
    @JsonPropertyDescription("Object covariance matrix [8,6]")
    private Double sat1CsrpNdot;
    /**
     * Object covariance matrix [8,7]
     * 
     */
    @JsonProperty("SAT1_CSRP_DRG")
    @JsonPropertyDescription("Object covariance matrix [8,7]")
    private Double sat1CsrpDrg;
    /**
     * Object covariance matrix [8,8]
     * 
     */
    @JsonProperty("SAT1_CSRP_SRP")
    @JsonPropertyDescription("Object covariance matrix [8,8]")
    private Double sat1CsrpSrp;
    /**
     * The object to which the metadata and data apply.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_OBJECT")
    @JsonPropertyDescription("The object to which the metadata and data apply.")
    private String sat2Object;
    /**
     * The satellite catalog designator for the object.
     * 
     */
    @JsonProperty("SAT2_OBJECT_DESIGNATOR")
    @JsonPropertyDescription("The satellite catalog designator for the object.")
    private String sat2ObjectDesignator;
    /**
     * The satellite catalog used for the object. Value should be taken from the SANA ‘Conjunction Data Message CATALOG_NAME’ registry (https://sanaregistry.org/r/cdm_catalog).
     * 
     */
    @JsonProperty("SAT2_CATALOG_NAME")
    @JsonPropertyDescription("The satellite catalog used for the object. Value should be taken from the SANA \u2018Conjunction Data Message CATALOG_NAME\u2019 registry (https://sanaregistry.org/r/cdm_catalog).")
    private String sat2CatalogName;
    /**
     * Spacecraft name for the object.
     * 
     */
    @JsonProperty("SAT2_OBJECT_NAME")
    @JsonPropertyDescription("Spacecraft name for the object.")
    private String sat2ObjectName;
    /**
     * The full international designator for the object. Values shall have the format YYYY-NNNP{PP}, where: YYYY = year of launch; NNN = three-digit serial number of launch (with leading zeros); P{PP} = At least one capital letter for the identification of the part brought into space by the launch. In cases where the object has no international designator, the value UNKNOWN should be used.
     * 
     */
    @JsonProperty("SAT2_INTERNATIONAL_DESIGNATOR")
    @JsonPropertyDescription("The full international designator for the object. Values shall have the format YYYY-NNNP{PP}, where: YYYY = year of launch; NNN = three-digit serial number of launch (with leading zeros); P{PP} = At least one capital letter for the identification of the part brought into space by the launch. In cases where the object has no international designator, the value UNKNOWN should be used.")
    private String sat2InternationalDesignator;
    /**
     * The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)
     * (Required)
     * 
     */
    @JsonProperty("SAT2_OBJECT_TYPE")
    @JsonPropertyDescription("The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)")
    private String sat2ObjectType;
    /**
     * Contact organization of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_ORGANIZATION")
    @JsonPropertyDescription("Contact organization of the object.")
    private String sat2OperatorOrganization;
    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_COVARIANCE_METHOD")
    @JsonPropertyDescription("Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.")
    private String sat2CovarianceMethod;
    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * (Required)
     * 
     */
    @JsonProperty("SAT2_MANEUVERABLE")
    @JsonPropertyDescription("The maneuver capacity of the object. (YES;NO;N/A)")
    private String sat2Maneuverable;
    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_REF_FRAME")
    @JsonPropertyDescription("Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2.")
    private String sat2RefFrame;
    /**
     * The gravity model used for the OD of the object. (EGM-96: 36D 36O; WGS-84_GEOID: 24D 24O; JGM-2 : 41D 41O)
     * 
     */
    @JsonProperty("SAT2_GRAVITY_MODEL")
    @JsonPropertyDescription("The gravity model used for the OD of the object. (EGM-96: 36D 36O; WGS-84_GEOID: 24D 24O; JGM-2 : 41D 41O)")
    private String sat2GravityModel;
    /**
     * The atmospheric density model used for the OD of the object. If ‘NONE’ is specified, then no atmospheric model was used. (JACCHIA 70; MSIS; JACCHIA 70 DCA; NONE)
     * 
     */
    @JsonProperty("SAT2_ATMOSPHERIC_MODEL")
    @JsonPropertyDescription("The atmospheric density model used for the OD of the object. If \u2018NONE\u2019 is specified, then no atmospheric model was used. (JACCHIA 70; MSIS; JACCHIA 70 DCA; NONE)")
    private String sat2AtmosphericModel;
    /**
     * The N-body gravitational perturbations used for the OD of the object. If ‘NONE’ is specified, then no third-body gravitational perturbations were used. (MOON, SUN, JUPITER, NONE)
     * 
     */
    @JsonProperty("SAT2_N_BODY_PERTURBATIONS")
    @JsonPropertyDescription("The N-body gravitational perturbations used for the OD of the object. If \u2018NONE\u2019 is specified, then no third-body gravitational perturbations were used. (MOON, SUN, JUPITER, NONE)")
    private String sat2NBodyPerturbations;
    /**
     * Indication of whether solar radiation pressure perturbations were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_SOLAR_RAD_PRESSURE")
    @JsonPropertyDescription("Indication of whether solar radiation pressure perturbations were used for the OD of the object.")
    private String sat2SolarRadPressure;
    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_EARTH_TIDES")
    @JsonPropertyDescription("Indication of whether solid Earth and ocean tides were used for the OD of the object.")
    private String sat2EarthTides;
    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_INTRACK_THRUST")
    @JsonPropertyDescription("Indication of whether in-track thrust modeling was used for the OD of the object.")
    private String sat2IntrackThrust;
    /**
     * The start of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_START")
    @JsonPropertyDescription("The start of a time interval (UTC) that contains the time of the last accepted observation.")
    private Date sat2TimeLastobStart;
    /**
     * The end of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_END")
    @JsonPropertyDescription("The end of a time interval (UTC) that contains the time of the last accepted observation.")
    private Date sat2TimeLastobEnd;
    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT2_RECOMMENDED_OD_SPAN")
    @JsonPropertyDescription("The recommended OD time span calculated for the object.")
    private Double sat2RecommendedOdSpan;
    /**
     * Based on the observations available and the RECOMMENDED_OD_SPAN, the actual time span used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_ACTUAL_OD_SPAN")
    @JsonPropertyDescription("Based on the observations available and the RECOMMENDED_OD_SPAN, the actual time span used for the OD of the object.")
    private Double sat2ActualOdSpan;
    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_AVAILABLE")
    @JsonPropertyDescription("The number of sensor tracks available for the OD of the object.")
    private Integer sat2ObsAvailable;
    /**
     * The number of observations accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_USED")
    @JsonPropertyDescription("The number of observations accepted for the OD of the object.")
    private Integer sat2ObsUsed;
    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT2_RESIDUALS_ACCEPTED")
    @JsonPropertyDescription("The percentage of residuals accepted in the OD of the object")
    private Double sat2ResidualsAccepted;
    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT2_WEIGHTED_RMS")
    @JsonPropertyDescription("The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD")
    private Double sat2WeightedRms;
    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT2_AREA_PC")
    @JsonPropertyDescription("The actual area of the object in m**2.")
    private Double sat2AreaPc;
    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CD_AREA_OVER_MASS")
    @JsonPropertyDescription("The objects CD*A/m used to propagate the state vector and covariance to TCA.")
    private Double sat2CdAreaOverMass;
    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CR_AREA_OVER_MASS")
    @JsonPropertyDescription("The objects CR*A/m used to propagate the state vector and covariance to TCA.")
    private Double sat2CrAreaOverMass;
    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_THRUST_ACCELERATION")
    @JsonPropertyDescription("The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.")
    private Double sat2ThrustAcceleration;
    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT2_SEDR")
    @JsonPropertyDescription("The amount of energy being removed from the object\u2019s orbit by atmospheric drag. This value is an average calculated during the OD.")
    private Double sat2Sedr;
    /**
     * Object position vector X component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_X")
    @JsonPropertyDescription("Object position vector X component")
    private Double sat2X;
    /**
     * Object position vector Y component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Y")
    @JsonPropertyDescription("Object position vector Y component")
    private Double sat2Y;
    /**
     * Object position vector Z component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Z")
    @JsonPropertyDescription("Object position vector Z component")
    private Double sat2Z;
    /**
     * Object position vector X_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_X_DOT")
    @JsonPropertyDescription("Object position vector X_DOT component")
    private Double sat2XDot;
    /**
     * Object position vector Y_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Y_DOT")
    @JsonPropertyDescription("Object position vector Y_DOT component")
    private Double sat2YDot;
    /**
     * Object position vector Z_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Z_DOT")
    @JsonPropertyDescription("Object position vector Z_DOT component")
    private Double sat2ZDot;
    /**
     * Object covariance matrix [1,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CR_R")
    @JsonPropertyDescription("Object covariance matrix [1,1]")
    private Double sat2CrR;
    /**
     * Object covariance matrix [2,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CT_R")
    @JsonPropertyDescription("Object covariance matrix [2,1]")
    private Double sat2CtR;
    /**
     * Object covariance matrix [2,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CT_T")
    @JsonPropertyDescription("Object covariance matrix [2,2]")
    private Double sat2CtT;
    /**
     * Object covariance matrix [3,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CN_R")
    @JsonPropertyDescription("Object covariance matrix [3,1]")
    private Double sat2CnR;
    /**
     * Object covariance matrix [3,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CN_T")
    @JsonPropertyDescription("Object covariance matrix [3,2]")
    private Double sat2CnT;
    /**
     * Object covariance matrix [3,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CN_N")
    @JsonPropertyDescription("Object covariance matrix [3,3]")
    private Double sat2CnN;
    /**
     * Object covariance matrix [4,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_R")
    @JsonPropertyDescription("Object covariance matrix [4,1]")
    private Double sat2CrdotR;
    /**
     * Object covariance matrix [4,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_T")
    @JsonPropertyDescription("Object covariance matrix [4,2]")
    private Double sat2CrdotT;
    /**
     * Object covariance matrix [4,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_N")
    @JsonPropertyDescription("Object covariance matrix [4,3]")
    private Double sat2CrdotN;
    /**
     * Object covariance matrix [4,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_RDOT")
    @JsonPropertyDescription("Object covariance matrix [4,4]")
    private Double sat2CrdotRdot;
    /**
     * Object covariance matrix [5,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_R")
    @JsonPropertyDescription("Object covariance matrix [5,1]")
    private Double sat2CtdotR;
    /**
     * Object covariance matrix [5,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_T")
    @JsonPropertyDescription("Object covariance matrix [5,2]")
    private Double sat2CtdotT;
    /**
     * Object covariance matrix [5,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_N")
    @JsonPropertyDescription("Object covariance matrix [5,3]")
    private Double sat2CtdotN;
    /**
     * Object covariance matrix [5,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_RDOT")
    @JsonPropertyDescription("Object covariance matrix [5,4]")
    private Double sat2CtdotRdot;
    /**
     * Object covariance matrix [5,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_TDOT")
    @JsonPropertyDescription("Object covariance matrix [5,5]")
    private Double sat2CtdotTdot;
    /**
     * Object covariance matrix [6,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_R")
    @JsonPropertyDescription("Object covariance matrix [6,1]")
    private Double sat2CndotR;
    /**
     * Object covariance matrix [6,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_T")
    @JsonPropertyDescription("Object covariance matrix [6,2]")
    private Double sat2CndotT;
    /**
     * Object covariance matrix [6,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_N")
    @JsonPropertyDescription("Object covariance matrix [6,3]")
    private Double sat2CndotN;
    /**
     * Object covariance matrix [6,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_RDOT")
    @JsonPropertyDescription("Object covariance matrix [6,4]")
    private Double sat2CndotRdot;
    /**
     * Object covariance matrix [6,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_TDOT")
    @JsonPropertyDescription("Object covariance matrix [6,5]")
    private Double sat2CndotTdot;
    /**
     * Object covariance matrix [6,6]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_NDOT")
    @JsonPropertyDescription("Object covariance matrix [6,6]")
    private Double sat2CndotNdot;
    /**
     * Object covariance matrix [7,1]
     * 
     */
    @JsonProperty("SAT2_CDRG_R")
    @JsonPropertyDescription("Object covariance matrix [7,1]")
    private Double sat2CdrgR;
    /**
     * Object covariance matrix [7,2]
     * 
     */
    @JsonProperty("SAT2_CDRG_T")
    @JsonPropertyDescription("Object covariance matrix [7,2]")
    private Double sat2CdrgT;
    /**
     * Object covariance matrix [7,3]
     * 
     */
    @JsonProperty("SAT2_CDRG_N")
    @JsonPropertyDescription("Object covariance matrix [7,3]")
    private Double sat2CdrgN;
    /**
     * Object covariance matrix [7,4]
     * 
     */
    @JsonProperty("SAT2_CDRG_RDOT")
    @JsonPropertyDescription("Object covariance matrix [7,4]")
    private Double sat2CdrgRdot;
    /**
     * Object covariance matrix [7,5]
     * 
     */
    @JsonProperty("SAT2_CDRG_TDOT")
    @JsonPropertyDescription("Object covariance matrix [7,5]")
    private Double sat2CdrgTdot;
    /**
     * Object covariance matrix [7,6]
     * 
     */
    @JsonProperty("SAT2_CDRG_NDOT")
    @JsonPropertyDescription("Object covariance matrix [7,6]")
    private Double sat2CdrgNdot;
    /**
     * Object covariance matrix [7,7]
     * 
     */
    @JsonProperty("SAT2_CDRG_DRG")
    @JsonPropertyDescription("Object covariance matrix [7,7]")
    private Double sat2CdrgDrg;
    /**
     * Object covariance matrix [8,1]
     * 
     */
    @JsonProperty("SAT2_CSRP_R")
    @JsonPropertyDescription("Object covariance matrix [8,1]")
    private String sat2CsrpR;
    /**
     * Object covariance matrix [8,2]
     * 
     */
    @JsonProperty("SAT2_CSRP_T")
    @JsonPropertyDescription("Object covariance matrix [8,2]")
    private Double sat2CsrpT;
    /**
     * Object covariance matrix [8,3]
     * 
     */
    @JsonProperty("SAT2_CSRP_N")
    @JsonPropertyDescription("Object covariance matrix [8,3]")
    private Double sat2CsrpN;
    /**
     * Object covariance matrix [8,4]
     * 
     */
    @JsonProperty("SAT2_CSRP_RDOT")
    @JsonPropertyDescription("Object covariance matrix [8,4]")
    private Double sat2CsrpRdot;
    /**
     * Object covariance matrix [8,5]
     * 
     */
    @JsonProperty("SAT2_CSRP_TDOT")
    @JsonPropertyDescription("Object covariance matrix [8,5]")
    private Double sat2CsrpTdot;
    /**
     * Object covariance matrix [8,6]
     * 
     */
    @JsonProperty("SAT2_CSRP_NDOT")
    @JsonPropertyDescription("Object covariance matrix [8,6]")
    private Double sat2CsrpNdot;
    /**
     * Object covariance matrix [8,7]
     * 
     */
    @JsonProperty("SAT2_CSRP_DRG")
    @JsonPropertyDescription("Object covariance matrix [8,7]")
    private Double sat2CsrpDrg;
    /**
     * Object covariance matrix [8,8]
     * 
     */
    @JsonProperty("SAT2_CSRP_SRP")
    @JsonPropertyDescription("Object covariance matrix [8,8]")
    private Double sat2CsrpSrp;

    /**
     * Version of the CDM format
     * (Required)
     * 
     */
    @JsonProperty("CCSDS_CDM_VERS")
    public Double getCcsdsCdmVers() {
        return ccsdsCdmVers;
    }

    /**
     * Version of the CDM format
     * (Required)
     * 
     */
    @JsonProperty("CCSDS_CDM_VERS")
    public void setCcsdsCdmVers(Double ccsdsCdmVers) {
        this.ccsdsCdmVers = ccsdsCdmVers;
    }

    /**
     * Message creation date/time in Coordinated Universal Time (UTC).
     * 
     */
    @JsonProperty("CREATION_DATE")
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Message creation date/time in Coordinated Universal Time (UTC).
     * 
     */
    @JsonProperty("CREATION_DATE")
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Creating agency or owner/operator. Value should be the ‘Abbreviation’ value from the [SANA Organizations registry](https://sanaregistry.org/r/organizations) for an organization that has the Role of ‘Conjunction Data Message Originator’.
     * 
     */
    @JsonProperty("ORIGINATOR")
    public String getOriginator() {
        return originator;
    }

    /**
     * Creating agency or owner/operator. Value should be the ‘Abbreviation’ value from the [SANA Organizations registry](https://sanaregistry.org/r/organizations) for an organization that has the Role of ‘Conjunction Data Message Originator’.
     * 
     */
    @JsonProperty("ORIGINATOR")
    public void setOriginator(String originator) {
        this.originator = originator;
    }

    /**
     * Spacecraft name(s) for which the CDM is provided.
     * 
     */
    @JsonProperty("MESSAGE_FOR")
    public String getMessageFor() {
        return messageFor;
    }

    /**
     * Spacecraft name(s) for which the CDM is provided.
     * 
     */
    @JsonProperty("MESSAGE_FOR")
    public void setMessageFor(String messageFor) {
        this.messageFor = messageFor;
    }

    /**
     * ID that uniquely identifies a message from a given originator. The format and content of the message identifier value are at the discretion of the originator.
     * 
     */
    @JsonProperty("MESSAGE_ID")
    public String getMessageId() {
        return messageId;
    }

    /**
     * ID that uniquely identifies a message from a given originator. The format and content of the message identifier value are at the discretion of the originator.
     * 
     */
    @JsonProperty("MESSAGE_ID")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * The date and time in UTC of the closest approach.
     * (Required)
     * 
     */
    @JsonProperty("TCA")
    public Date getTca() {
        return tca;
    }

    /**
     * The date and time in UTC of the closest approach.
     * (Required)
     * 
     */
    @JsonProperty("TCA")
    public void setTca(Date tca) {
        this.tca = tca;
    }

    /**
     * The norm of the relative position vector. It indicates how close the two objects are at TCA.
     * 
     */
    @JsonProperty("MISS_DISTANCE")
    public Double getMissDistance() {
        return missDistance;
    }

    /**
     * The norm of the relative position vector. It indicates how close the two objects are at TCA.
     * 
     */
    @JsonProperty("MISS_DISTANCE")
    public void setMissDistance(Double missDistance) {
        this.missDistance = missDistance;
    }

    /**
     * The norm of the relative velocity vector. It indicates how fast the two objects are moving relative to each other at TCA.
     * 
     */
    @JsonProperty("RELATIVE_SPEED")
    public Double getRelativeSpeed() {
        return relativeSpeed;
    }

    /**
     * The norm of the relative velocity vector. It indicates how fast the two objects are moving relative to each other at TCA.
     * 
     */
    @JsonProperty("RELATIVE_SPEED")
    public void setRelativeSpeed(Double relativeSpeed) {
        this.relativeSpeed = relativeSpeed;
    }

    /**
     * The R component of Object2’s position relative to Object1’s position in the Radial, Transverse, and Normal (RTN) coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_R")
    public Double getRelativePositionR() {
        return relativePositionR;
    }

    /**
     * The R component of Object2’s position relative to Object1’s position in the Radial, Transverse, and Normal (RTN) coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_R")
    public void setRelativePositionR(Double relativePositionR) {
        this.relativePositionR = relativePositionR;
    }

    /**
     * The T component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_T")
    public Double getRelativePositionT() {
        return relativePositionT;
    }

    /**
     * The T component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_T")
    public void setRelativePositionT(Double relativePositionT) {
        this.relativePositionT = relativePositionT;
    }

    /**
     * The N component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_N")
    public Double getRelativePositionN() {
        return relativePositionN;
    }

    /**
     * The N component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_N")
    public void setRelativePositionN(Double relativePositionN) {
        this.relativePositionN = relativePositionN;
    }

    /**
     * The R component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_R")
    public Double getRelativeVelocityR() {
        return relativeVelocityR;
    }

    /**
     * The R component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_R")
    public void setRelativeVelocityR(Double relativeVelocityR) {
        this.relativeVelocityR = relativeVelocityR;
    }

    /**
     * The T component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_T")
    public Double getRelativeVelocityT() {
        return relativeVelocityT;
    }

    /**
     * The T component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_T")
    public void setRelativeVelocityT(Double relativeVelocityT) {
        this.relativeVelocityT = relativeVelocityT;
    }

    /**
     * The N component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_N")
    public Double getRelativeVelocityN() {
        return relativeVelocityN;
    }

    /**
     * The N component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_N")
    public void setRelativeVelocityN(Double relativeVelocityN) {
        this.relativeVelocityN = relativeVelocityN;
    }

    /**
     * The probability (denoted ‘p’ where 0.0<=p<=1.0), that Object1 and Object2 will collide.
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY")
    public Double getCollisionProbability() {
        return collisionProbability;
    }

    /**
     * The probability (denoted ‘p’ where 0.0<=p<=1.0), that Object1 and Object2 will collide.
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY")
    public void setCollisionProbability(Double collisionProbability) {
        this.collisionProbability = collisionProbability;
    }

    /**
     * The method that was used to calculate the collision probability. (FOSTER-1992;CHAN-1997;PATERA-2001;ALFANO-2005;MCKINLEY-2006 from [CPM registry](https://sanaregistry.org/r/cdm_cpm)
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY_METHOD")
    public String getCollisionProbabilityMethod() {
        return collisionProbabilityMethod;
    }

    /**
     * The method that was used to calculate the collision probability. (FOSTER-1992;CHAN-1997;PATERA-2001;ALFANO-2005;MCKINLEY-2006 from [CPM registry](https://sanaregistry.org/r/cdm_cpm)
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY_METHOD")
    public void setCollisionProbabilityMethod(String collisionProbabilityMethod) {
        this.collisionProbabilityMethod = collisionProbabilityMethod;
    }

    /**
     * The object to which the metadata and data apply
     * (Required)
     * 
     */
    @JsonProperty("SAT1_OBJECT")
    public String getSat1Object() {
        return sat1Object;
    }

    /**
     * The object to which the metadata and data apply
     * (Required)
     * 
     */
    @JsonProperty("SAT1_OBJECT")
    public void setSat1Object(String sat1Object) {
        this.sat1Object = sat1Object;
    }

    /**
     * The satellite catalog designator for the object.
     * 
     */
    @JsonProperty("SAT1_OBJECT_DESIGNATOR")
    public String getSat1ObjectDesignator() {
        return sat1ObjectDesignator;
    }

    /**
     * The satellite catalog designator for the object.
     * 
     */
    @JsonProperty("SAT1_OBJECT_DESIGNATOR")
    public void setSat1ObjectDesignator(String sat1ObjectDesignator) {
        this.sat1ObjectDesignator = sat1ObjectDesignator;
    }

    /**
     * The satellite catalog used for the object. Value should be taken from the [SANA ‘Conjunction Data Message CATALOG_NAME’ registry](https://sanaregistry.org/r/cdm_catalog).
     * 
     */
    @JsonProperty("SAT1_CATALOG_NAME")
    public String getSat1CatalogName() {
        return sat1CatalogName;
    }

    /**
     * The satellite catalog used for the object. Value should be taken from the [SANA ‘Conjunction Data Message CATALOG_NAME’ registry](https://sanaregistry.org/r/cdm_catalog).
     * 
     */
    @JsonProperty("SAT1_CATALOG_NAME")
    public void setSat1CatalogName(String sat1CatalogName) {
        this.sat1CatalogName = sat1CatalogName;
    }

    /**
     * Spacecraft name for the object.
     * 
     */
    @JsonProperty("SAT1_OBJECT_NAME")
    public String getSat1ObjectName() {
        return sat1ObjectName;
    }

    /**
     * Spacecraft name for the object.
     * 
     */
    @JsonProperty("SAT1_OBJECT_NAME")
    public void setSat1ObjectName(String sat1ObjectName) {
        this.sat1ObjectName = sat1ObjectName;
    }

    /**
     * The full international designator for the object. Values shall have the format YYYY-NNNP{PP}, where: YYYY = year of launch; NNN = three-digit serial number of launch (with leading zeros); P{PP} = At least one capital letter for the identification of the part brought into space by the launch. In cases where the object has no international designator, the value UNKNOWN should be used.
     * 
     */
    @JsonProperty("SAT1_INTERNATIONAL_DESIGNATOR")
    public String getSat1InternationalDesignator() {
        return sat1InternationalDesignator;
    }

    /**
     * The full international designator for the object. Values shall have the format YYYY-NNNP{PP}, where: YYYY = year of launch; NNN = three-digit serial number of launch (with leading zeros); P{PP} = At least one capital letter for the identification of the part brought into space by the launch. In cases where the object has no international designator, the value UNKNOWN should be used.
     * 
     */
    @JsonProperty("SAT1_INTERNATIONAL_DESIGNATOR")
    public void setSat1InternationalDesignator(String sat1InternationalDesignator) {
        this.sat1InternationalDesignator = sat1InternationalDesignator;
    }

    /**
     * The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)
     * (Required)
     * 
     */
    @JsonProperty("SAT1_OBJECT_TYPE")
    public String getSat1ObjectType() {
        return sat1ObjectType;
    }

    /**
     * The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)
     * (Required)
     * 
     */
    @JsonProperty("SAT1_OBJECT_TYPE")
    public void setSat1ObjectType(String sat1ObjectType) {
        this.sat1ObjectType = sat1ObjectType;
    }

    /**
     * Contact organization of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_ORGANIZATION")
    public String getSat1OperatorOrganization() {
        return sat1OperatorOrganization;
    }

    /**
     * Contact organization of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_ORGANIZATION")
    public void setSat1OperatorOrganization(String sat1OperatorOrganization) {
        this.sat1OperatorOrganization = sat1OperatorOrganization;
    }

    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_COVARIANCE_METHOD")
    public String getSat1CovarianceMethod() {
        return sat1CovarianceMethod;
    }

    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_COVARIANCE_METHOD")
    public void setSat1CovarianceMethod(String sat1CovarianceMethod) {
        this.sat1CovarianceMethod = sat1CovarianceMethod;
    }

    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * (Required)
     * 
     */
    @JsonProperty("SAT1_MANEUVERABLE")
    public String getSat1Maneuverable() {
        return sat1Maneuverable;
    }

    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * (Required)
     * 
     */
    @JsonProperty("SAT1_MANEUVERABLE")
    public void setSat1Maneuverable(String sat1Maneuverable) {
        this.sat1Maneuverable = sat1Maneuverable;
    }

    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2. (GCRF;EME2000;ITRF)
     * (Required)
     * 
     */
    @JsonProperty("SAT1_REF_FRAME")
    public String getSat1RefFrame() {
        return sat1RefFrame;
    }

    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2. (GCRF;EME2000;ITRF)
     * (Required)
     * 
     */
    @JsonProperty("SAT1_REF_FRAME")
    public void setSat1RefFrame(String sat1RefFrame) {
        this.sat1RefFrame = sat1RefFrame;
    }

    /**
     * The gravity model used for the OD of the object. (EGM-96: 36D 36O; WGS-84_GEOID: 24D 24O; JGM-2 : 41D 41O)
     * 
     */
    @JsonProperty("SAT1_GRAVITY_MODEL")
    public String getSat1GravityModel() {
        return sat1GravityModel;
    }

    /**
     * The gravity model used for the OD of the object. (EGM-96: 36D 36O; WGS-84_GEOID: 24D 24O; JGM-2 : 41D 41O)
     * 
     */
    @JsonProperty("SAT1_GRAVITY_MODEL")
    public void setSat1GravityModel(String sat1GravityModel) {
        this.sat1GravityModel = sat1GravityModel;
    }

    /**
     * The atmospheric density model used for the OD of the object. If ‘NONE’ is specified, then no atmospheric model was used. (JACCHIA 70; MSIS; JACCHIA 70 DCA; NONE)
     * 
     */
    @JsonProperty("SAT1_ATMOSPHERIC_MODEL")
    public String getSat1AtmosphericModel() {
        return sat1AtmosphericModel;
    }

    /**
     * The atmospheric density model used for the OD of the object. If ‘NONE’ is specified, then no atmospheric model was used. (JACCHIA 70; MSIS; JACCHIA 70 DCA; NONE)
     * 
     */
    @JsonProperty("SAT1_ATMOSPHERIC_MODEL")
    public void setSat1AtmosphericModel(String sat1AtmosphericModel) {
        this.sat1AtmosphericModel = sat1AtmosphericModel;
    }

    /**
     * The N-body gravitational perturbations used for the OD of the object. If ‘NONE’ is specified, then no third-body gravitational perturbations were used. (MOON, SUN, JUPITER, NONE)
     * 
     */
    @JsonProperty("SAT1_N_BODY_PERTURBATIONS")
    public String getSat1NBodyPerturbations() {
        return sat1NBodyPerturbations;
    }

    /**
     * The N-body gravitational perturbations used for the OD of the object. If ‘NONE’ is specified, then no third-body gravitational perturbations were used. (MOON, SUN, JUPITER, NONE)
     * 
     */
    @JsonProperty("SAT1_N_BODY_PERTURBATIONS")
    public void setSat1NBodyPerturbations(String sat1NBodyPerturbations) {
        this.sat1NBodyPerturbations = sat1NBodyPerturbations;
    }

    /**
     * Indication of whether solar radiation pressure perturbations were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_SOLAR_RAD_PRESSURE")
    public String getSat1SolarRadPressure() {
        return sat1SolarRadPressure;
    }

    /**
     * Indication of whether solar radiation pressure perturbations were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_SOLAR_RAD_PRESSURE")
    public void setSat1SolarRadPressure(String sat1SolarRadPressure) {
        this.sat1SolarRadPressure = sat1SolarRadPressure;
    }

    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_EARTH_TIDES")
    public String getSat1EarthTides() {
        return sat1EarthTides;
    }

    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_EARTH_TIDES")
    public void setSat1EarthTides(String sat1EarthTides) {
        this.sat1EarthTides = sat1EarthTides;
    }

    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_INTRACK_THRUST")
    public String getSat1IntrackThrust() {
        return sat1IntrackThrust;
    }

    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT1_INTRACK_THRUST")
    public void setSat1IntrackThrust(String sat1IntrackThrust) {
        this.sat1IntrackThrust = sat1IntrackThrust;
    }

    /**
     * The start of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_START")
    public String getSat1TimeLastobStart() {
        return sat1TimeLastobStart;
    }

    /**
     * The start of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_START")
    public void setSat1TimeLastobStart(String sat1TimeLastobStart) {
        this.sat1TimeLastobStart = sat1TimeLastobStart;
    }

    /**
     * The end of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_END")
    public String getSat1TimeLastobEnd() {
        return sat1TimeLastobEnd;
    }

    /**
     * The end of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_END")
    public void setSat1TimeLastobEnd(String sat1TimeLastobEnd) {
        this.sat1TimeLastobEnd = sat1TimeLastobEnd;
    }

    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT1_RECOMMENDED_OD_SPAN")
    public Double getSat1RecommendedOdSpan() {
        return sat1RecommendedOdSpan;
    }

    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT1_RECOMMENDED_OD_SPAN")
    public void setSat1RecommendedOdSpan(Double sat1RecommendedOdSpan) {
        this.sat1RecommendedOdSpan = sat1RecommendedOdSpan;
    }

    @JsonProperty("SAT1_ACTUAL_OD_SPAN")
    public Double getSat1ActualOdSpan() {
        return sat1ActualOdSpan;
    }

    @JsonProperty("SAT1_ACTUAL_OD_SPAN")
    public void setSat1ActualOdSpan(Double sat1ActualOdSpan) {
        this.sat1ActualOdSpan = sat1ActualOdSpan;
    }

    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_AVAILABLE")
    public Integer getSat1ObsAvailable() {
        return sat1ObsAvailable;
    }

    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_AVAILABLE")
    public void setSat1ObsAvailable(Integer sat1ObsAvailable) {
        this.sat1ObsAvailable = sat1ObsAvailable;
    }

    /**
     * The number of sensor tracks accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_USED")
    public Integer getSat1ObsUsed() {
        return sat1ObsUsed;
    }

    /**
     * The number of sensor tracks accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_USED")
    public void setSat1ObsUsed(Integer sat1ObsUsed) {
        this.sat1ObsUsed = sat1ObsUsed;
    }

    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT1_RESIDUALS_ACCEPTED")
    public Double getSat1ResidualsAccepted() {
        return sat1ResidualsAccepted;
    }

    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT1_RESIDUALS_ACCEPTED")
    public void setSat1ResidualsAccepted(Double sat1ResidualsAccepted) {
        this.sat1ResidualsAccepted = sat1ResidualsAccepted;
    }

    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT1_WEIGHTED_RMS")
    public Double getSat1WeightedRms() {
        return sat1WeightedRms;
    }

    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT1_WEIGHTED_RMS")
    public void setSat1WeightedRms(Double sat1WeightedRms) {
        this.sat1WeightedRms = sat1WeightedRms;
    }

    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT1_AREA_PC")
    public Double getSat1AreaPc() {
        return sat1AreaPc;
    }

    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT1_AREA_PC")
    public void setSat1AreaPc(Double sat1AreaPc) {
        this.sat1AreaPc = sat1AreaPc;
    }

    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CD_AREA_OVER_MASS")
    public Double getSat1CdAreaOverMass() {
        return sat1CdAreaOverMass;
    }

    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CD_AREA_OVER_MASS")
    public void setSat1CdAreaOverMass(Double sat1CdAreaOverMass) {
        this.sat1CdAreaOverMass = sat1CdAreaOverMass;
    }

    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CR_AREA_OVER_MASS")
    public Double getSat1CrAreaOverMass() {
        return sat1CrAreaOverMass;
    }

    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CR_AREA_OVER_MASS")
    public void setSat1CrAreaOverMass(Double sat1CrAreaOverMass) {
        this.sat1CrAreaOverMass = sat1CrAreaOverMass;
    }

    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_THRUST_ACCELERATION")
    public Double getSat1ThrustAcceleration() {
        return sat1ThrustAcceleration;
    }

    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_THRUST_ACCELERATION")
    public void setSat1ThrustAcceleration(Double sat1ThrustAcceleration) {
        this.sat1ThrustAcceleration = sat1ThrustAcceleration;
    }

    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT1_SEDR")
    public Double getSat1Sedr() {
        return sat1Sedr;
    }

    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT1_SEDR")
    public void setSat1Sedr(Double sat1Sedr) {
        this.sat1Sedr = sat1Sedr;
    }

    /**
     * Object position vector X component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_X")
    public Double getSat1X() {
        return sat1X;
    }

    /**
     * Object position vector X component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_X")
    public void setSat1X(Double sat1X) {
        this.sat1X = sat1X;
    }

    /**
     * Object position vector Y component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Y")
    public Double getSat1Y() {
        return sat1Y;
    }

    /**
     * Object position vector Y component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Y")
    public void setSat1Y(Double sat1Y) {
        this.sat1Y = sat1Y;
    }

    /**
     * Object position vector Z component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Z")
    public Double getSat1Z() {
        return sat1Z;
    }

    /**
     * Object position vector Z component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Z")
    public void setSat1Z(Double sat1Z) {
        this.sat1Z = sat1Z;
    }

    /**
     * Object position vector X_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_X_DOT")
    public Double getSat1XDot() {
        return sat1XDot;
    }

    /**
     * Object position vector X_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_X_DOT")
    public void setSat1XDot(Double sat1XDot) {
        this.sat1XDot = sat1XDot;
    }

    /**
     * Object position vector Y_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Y_DOT")
    public Double getSat1YDot() {
        return sat1YDot;
    }

    /**
     * Object position vector Y_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Y_DOT")
    public void setSat1YDot(Double sat1YDot) {
        this.sat1YDot = sat1YDot;
    }

    /**
     * Object position vector Z_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Z_DOT")
    public Double getSat1ZDot() {
        return sat1ZDot;
    }

    /**
     * Object position vector Z_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT1_Z_DOT")
    public void setSat1ZDot(Double sat1ZDot) {
        this.sat1ZDot = sat1ZDot;
    }

    /**
     * Object covariance matrix [1,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CR_R")
    public Double getSat1CrR() {
        return sat1CrR;
    }

    /**
     * Object covariance matrix [1,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CR_R")
    public void setSat1CrR(Double sat1CrR) {
        this.sat1CrR = sat1CrR;
    }

    /**
     * Object covariance matrix [2,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CT_R")
    public Double getSat1CtR() {
        return sat1CtR;
    }

    /**
     * Object covariance matrix [2,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CT_R")
    public void setSat1CtR(Double sat1CtR) {
        this.sat1CtR = sat1CtR;
    }

    /**
     * Object covariance matrix [2,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CT_T")
    public Double getSat1CtT() {
        return sat1CtT;
    }

    /**
     * Object covariance matrix [2,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CT_T")
    public void setSat1CtT(Double sat1CtT) {
        this.sat1CtT = sat1CtT;
    }

    /**
     * Object covariance matrix [3,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CN_R")
    public Double getSat1CnR() {
        return sat1CnR;
    }

    /**
     * Object covariance matrix [3,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CN_R")
    public void setSat1CnR(Double sat1CnR) {
        this.sat1CnR = sat1CnR;
    }

    /**
     * Object covariance matrix [3,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CN_T")
    public Double getSat1CnT() {
        return sat1CnT;
    }

    /**
     * Object covariance matrix [3,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CN_T")
    public void setSat1CnT(Double sat1CnT) {
        this.sat1CnT = sat1CnT;
    }

    /**
     * Object covariance matrix [3,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CN_N")
    public Double getSat1CnN() {
        return sat1CnN;
    }

    /**
     * Object covariance matrix [3,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CN_N")
    public void setSat1CnN(Double sat1CnN) {
        this.sat1CnN = sat1CnN;
    }

    /**
     * Object covariance matrix [4,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_R")
    public Double getSat1CrdotR() {
        return sat1CrdotR;
    }

    /**
     * Object covariance matrix [4,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_R")
    public void setSat1CrdotR(Double sat1CrdotR) {
        this.sat1CrdotR = sat1CrdotR;
    }

    /**
     * Object covariance matrix [4,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_T")
    public Double getSat1CrdotT() {
        return sat1CrdotT;
    }

    /**
     * Object covariance matrix [4,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_T")
    public void setSat1CrdotT(Double sat1CrdotT) {
        this.sat1CrdotT = sat1CrdotT;
    }

    /**
     * Object covariance matrix [4,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_N")
    public Double getSat1CrdotN() {
        return sat1CrdotN;
    }

    /**
     * Object covariance matrix [4,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_N")
    public void setSat1CrdotN(Double sat1CrdotN) {
        this.sat1CrdotN = sat1CrdotN;
    }

    /**
     * Object covariance matrix [4,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_RDOT")
    public Double getSat1CrdotRdot() {
        return sat1CrdotRdot;
    }

    /**
     * Object covariance matrix [4,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CRDOT_RDOT")
    public void setSat1CrdotRdot(Double sat1CrdotRdot) {
        this.sat1CrdotRdot = sat1CrdotRdot;
    }

    /**
     * Object covariance matrix [5,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_R")
    public Double getSat1CtdotR() {
        return sat1CtdotR;
    }

    /**
     * Object covariance matrix [5,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_R")
    public void setSat1CtdotR(Double sat1CtdotR) {
        this.sat1CtdotR = sat1CtdotR;
    }

    /**
     * Object covariance matrix [5,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_T")
    public Double getSat1CtdotT() {
        return sat1CtdotT;
    }

    /**
     * Object covariance matrix [5,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_T")
    public void setSat1CtdotT(Double sat1CtdotT) {
        this.sat1CtdotT = sat1CtdotT;
    }

    /**
     * Object covariance matrix [5,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_N")
    public Double getSat1CtdotN() {
        return sat1CtdotN;
    }

    /**
     * Object covariance matrix [5,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_N")
    public void setSat1CtdotN(Double sat1CtdotN) {
        this.sat1CtdotN = sat1CtdotN;
    }

    /**
     * Object covariance matrix [5,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_RDOT")
    public Double getSat1CtdotRdot() {
        return sat1CtdotRdot;
    }

    /**
     * Object covariance matrix [5,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_RDOT")
    public void setSat1CtdotRdot(Double sat1CtdotRdot) {
        this.sat1CtdotRdot = sat1CtdotRdot;
    }

    /**
     * Object covariance matrix [5,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_TDOT")
    public Double getSat1CtdotTdot() {
        return sat1CtdotTdot;
    }

    /**
     * Object covariance matrix [5,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CTDOT_TDOT")
    public void setSat1CtdotTdot(Double sat1CtdotTdot) {
        this.sat1CtdotTdot = sat1CtdotTdot;
    }

    /**
     * Object covariance matrix [6,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_R")
    public Double getSat1CndotR() {
        return sat1CndotR;
    }

    /**
     * Object covariance matrix [6,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_R")
    public void setSat1CndotR(Double sat1CndotR) {
        this.sat1CndotR = sat1CndotR;
    }

    /**
     * Object covariance matrix [6,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_T")
    public Double getSat1CndotT() {
        return sat1CndotT;
    }

    /**
     * Object covariance matrix [6,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_T")
    public void setSat1CndotT(Double sat1CndotT) {
        this.sat1CndotT = sat1CndotT;
    }

    /**
     * Object covariance matrix [6,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_N")
    public Double getSat1CndotN() {
        return sat1CndotN;
    }

    /**
     * Object covariance matrix [6,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_N")
    public void setSat1CndotN(Double sat1CndotN) {
        this.sat1CndotN = sat1CndotN;
    }

    /**
     * Object covariance matrix [6,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_RDOT")
    public Double getSat1CndotRdot() {
        return sat1CndotRdot;
    }

    /**
     * Object covariance matrix [6,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_RDOT")
    public void setSat1CndotRdot(Double sat1CndotRdot) {
        this.sat1CndotRdot = sat1CndotRdot;
    }

    /**
     * Object covariance matrix [6,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_TDOT")
    public Double getSat1CndotTdot() {
        return sat1CndotTdot;
    }

    /**
     * Object covariance matrix [6,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_TDOT")
    public void setSat1CndotTdot(Double sat1CndotTdot) {
        this.sat1CndotTdot = sat1CndotTdot;
    }

    /**
     * Object covariance matrix [6,6]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_NDOT")
    public Double getSat1CndotNdot() {
        return sat1CndotNdot;
    }

    /**
     * Object covariance matrix [6,6]
     * (Required)
     * 
     */
    @JsonProperty("SAT1_CNDOT_NDOT")
    public void setSat1CndotNdot(Double sat1CndotNdot) {
        this.sat1CndotNdot = sat1CndotNdot;
    }

    /**
     * Object covariance matrix [7,1]
     * 
     */
    @JsonProperty("SAT1_CDRG_R")
    public Double getSat1CdrgR() {
        return sat1CdrgR;
    }

    /**
     * Object covariance matrix [7,1]
     * 
     */
    @JsonProperty("SAT1_CDRG_R")
    public void setSat1CdrgR(Double sat1CdrgR) {
        this.sat1CdrgR = sat1CdrgR;
    }

    /**
     * Object covariance matrix [7,2]
     * 
     */
    @JsonProperty("SAT1_CDRG_T")
    public Double getSat1CdrgT() {
        return sat1CdrgT;
    }

    /**
     * Object covariance matrix [7,2]
     * 
     */
    @JsonProperty("SAT1_CDRG_T")
    public void setSat1CdrgT(Double sat1CdrgT) {
        this.sat1CdrgT = sat1CdrgT;
    }

    /**
     * Object covariance matrix [7,3]
     * 
     */
    @JsonProperty("SAT1_CDRG_N")
    public Double getSat1CdrgN() {
        return sat1CdrgN;
    }

    /**
     * Object covariance matrix [7,3]
     * 
     */
    @JsonProperty("SAT1_CDRG_N")
    public void setSat1CdrgN(Double sat1CdrgN) {
        this.sat1CdrgN = sat1CdrgN;
    }

    /**
     * Object covariance matrix [7,4]
     * 
     */
    @JsonProperty("SAT1_CDRG_RDOT")
    public Double getSat1CdrgRdot() {
        return sat1CdrgRdot;
    }

    /**
     * Object covariance matrix [7,4]
     * 
     */
    @JsonProperty("SAT1_CDRG_RDOT")
    public void setSat1CdrgRdot(Double sat1CdrgRdot) {
        this.sat1CdrgRdot = sat1CdrgRdot;
    }

    /**
     * Object covariance matrix [7,5]
     * 
     */
    @JsonProperty("SAT1_CDRG_TDOT")
    public Double getSat1CdrgTdot() {
        return sat1CdrgTdot;
    }

    /**
     * Object covariance matrix [7,5]
     * 
     */
    @JsonProperty("SAT1_CDRG_TDOT")
    public void setSat1CdrgTdot(Double sat1CdrgTdot) {
        this.sat1CdrgTdot = sat1CdrgTdot;
    }

    /**
     * Object covariance matrix [7,6]
     * 
     */
    @JsonProperty("SAT1_CDRG_NDOT")
    public Double getSat1CdrgNdot() {
        return sat1CdrgNdot;
    }

    /**
     * Object covariance matrix [7,6]
     * 
     */
    @JsonProperty("SAT1_CDRG_NDOT")
    public void setSat1CdrgNdot(Double sat1CdrgNdot) {
        this.sat1CdrgNdot = sat1CdrgNdot;
    }

    /**
     * Object covariance matrix [7,7]
     * 
     */
    @JsonProperty("SAT1_CDRG_DRG")
    public Double getSat1CdrgDrg() {
        return sat1CdrgDrg;
    }

    /**
     * Object covariance matrix [7,7]
     * 
     */
    @JsonProperty("SAT1_CDRG_DRG")
    public void setSat1CdrgDrg(Double sat1CdrgDrg) {
        this.sat1CdrgDrg = sat1CdrgDrg;
    }

    /**
     * Object covariance matrix [8,1]
     * 
     */
    @JsonProperty("SAT1_CSRP_R")
    public Double getSat1CsrpR() {
        return sat1CsrpR;
    }

    /**
     * Object covariance matrix [8,1]
     * 
     */
    @JsonProperty("SAT1_CSRP_R")
    public void setSat1CsrpR(Double sat1CsrpR) {
        this.sat1CsrpR = sat1CsrpR;
    }

    /**
     * Object covariance matrix [8,2]
     * 
     */
    @JsonProperty("SAT1_CSRP_T")
    public Double getSat1CsrpT() {
        return sat1CsrpT;
    }

    /**
     * Object covariance matrix [8,2]
     * 
     */
    @JsonProperty("SAT1_CSRP_T")
    public void setSat1CsrpT(Double sat1CsrpT) {
        this.sat1CsrpT = sat1CsrpT;
    }

    /**
     * Object covariance matrix [8,3]
     * 
     */
    @JsonProperty("SAT1_CSRP_N")
    public Double getSat1CsrpN() {
        return sat1CsrpN;
    }

    /**
     * Object covariance matrix [8,3]
     * 
     */
    @JsonProperty("SAT1_CSRP_N")
    public void setSat1CsrpN(Double sat1CsrpN) {
        this.sat1CsrpN = sat1CsrpN;
    }

    /**
     * Object covariance matrix [8,4]
     * 
     */
    @JsonProperty("SAT1_CSRP_RDOT")
    public Double getSat1CsrpRdot() {
        return sat1CsrpRdot;
    }

    /**
     * Object covariance matrix [8,4]
     * 
     */
    @JsonProperty("SAT1_CSRP_RDOT")
    public void setSat1CsrpRdot(Double sat1CsrpRdot) {
        this.sat1CsrpRdot = sat1CsrpRdot;
    }

    /**
     * Object covariance matrix [8,5]
     * 
     */
    @JsonProperty("SAT1_CSRP_TDOT")
    public Double getSat1CsrpTdot() {
        return sat1CsrpTdot;
    }

    /**
     * Object covariance matrix [8,5]
     * 
     */
    @JsonProperty("SAT1_CSRP_TDOT")
    public void setSat1CsrpTdot(Double sat1CsrpTdot) {
        this.sat1CsrpTdot = sat1CsrpTdot;
    }

    /**
     * Object covariance matrix [8,6]
     * 
     */
    @JsonProperty("SAT1_CSRP_NDOT")
    public Double getSat1CsrpNdot() {
        return sat1CsrpNdot;
    }

    /**
     * Object covariance matrix [8,6]
     * 
     */
    @JsonProperty("SAT1_CSRP_NDOT")
    public void setSat1CsrpNdot(Double sat1CsrpNdot) {
        this.sat1CsrpNdot = sat1CsrpNdot;
    }

    /**
     * Object covariance matrix [8,7]
     * 
     */
    @JsonProperty("SAT1_CSRP_DRG")
    public Double getSat1CsrpDrg() {
        return sat1CsrpDrg;
    }

    /**
     * Object covariance matrix [8,7]
     * 
     */
    @JsonProperty("SAT1_CSRP_DRG")
    public void setSat1CsrpDrg(Double sat1CsrpDrg) {
        this.sat1CsrpDrg = sat1CsrpDrg;
    }

    /**
     * Object covariance matrix [8,8]
     * 
     */
    @JsonProperty("SAT1_CSRP_SRP")
    public Double getSat1CsrpSrp() {
        return sat1CsrpSrp;
    }

    /**
     * Object covariance matrix [8,8]
     * 
     */
    @JsonProperty("SAT1_CSRP_SRP")
    public void setSat1CsrpSrp(Double sat1CsrpSrp) {
        this.sat1CsrpSrp = sat1CsrpSrp;
    }

    /**
     * The object to which the metadata and data apply.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_OBJECT")
    public String getSat2Object() {
        return sat2Object;
    }

    /**
     * The object to which the metadata and data apply.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_OBJECT")
    public void setSat2Object(String sat2Object) {
        this.sat2Object = sat2Object;
    }

    /**
     * The satellite catalog designator for the object.
     * 
     */
    @JsonProperty("SAT2_OBJECT_DESIGNATOR")
    public String getSat2ObjectDesignator() {
        return sat2ObjectDesignator;
    }

    /**
     * The satellite catalog designator for the object.
     * 
     */
    @JsonProperty("SAT2_OBJECT_DESIGNATOR")
    public void setSat2ObjectDesignator(String sat2ObjectDesignator) {
        this.sat2ObjectDesignator = sat2ObjectDesignator;
    }

    /**
     * The satellite catalog used for the object. Value should be taken from the SANA ‘Conjunction Data Message CATALOG_NAME’ registry (https://sanaregistry.org/r/cdm_catalog).
     * 
     */
    @JsonProperty("SAT2_CATALOG_NAME")
    public String getSat2CatalogName() {
        return sat2CatalogName;
    }

    /**
     * The satellite catalog used for the object. Value should be taken from the SANA ‘Conjunction Data Message CATALOG_NAME’ registry (https://sanaregistry.org/r/cdm_catalog).
     * 
     */
    @JsonProperty("SAT2_CATALOG_NAME")
    public void setSat2CatalogName(String sat2CatalogName) {
        this.sat2CatalogName = sat2CatalogName;
    }

    /**
     * Spacecraft name for the object.
     * 
     */
    @JsonProperty("SAT2_OBJECT_NAME")
    public String getSat2ObjectName() {
        return sat2ObjectName;
    }

    /**
     * Spacecraft name for the object.
     * 
     */
    @JsonProperty("SAT2_OBJECT_NAME")
    public void setSat2ObjectName(String sat2ObjectName) {
        this.sat2ObjectName = sat2ObjectName;
    }

    /**
     * The full international designator for the object. Values shall have the format YYYY-NNNP{PP}, where: YYYY = year of launch; NNN = three-digit serial number of launch (with leading zeros); P{PP} = At least one capital letter for the identification of the part brought into space by the launch. In cases where the object has no international designator, the value UNKNOWN should be used.
     * 
     */
    @JsonProperty("SAT2_INTERNATIONAL_DESIGNATOR")
    public String getSat2InternationalDesignator() {
        return sat2InternationalDesignator;
    }

    /**
     * The full international designator for the object. Values shall have the format YYYY-NNNP{PP}, where: YYYY = year of launch; NNN = three-digit serial number of launch (with leading zeros); P{PP} = At least one capital letter for the identification of the part brought into space by the launch. In cases where the object has no international designator, the value UNKNOWN should be used.
     * 
     */
    @JsonProperty("SAT2_INTERNATIONAL_DESIGNATOR")
    public void setSat2InternationalDesignator(String sat2InternationalDesignator) {
        this.sat2InternationalDesignator = sat2InternationalDesignator;
    }

    /**
     * The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)
     * (Required)
     * 
     */
    @JsonProperty("SAT2_OBJECT_TYPE")
    public String getSat2ObjectType() {
        return sat2ObjectType;
    }

    /**
     * The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)
     * (Required)
     * 
     */
    @JsonProperty("SAT2_OBJECT_TYPE")
    public void setSat2ObjectType(String sat2ObjectType) {
        this.sat2ObjectType = sat2ObjectType;
    }

    /**
     * Contact organization of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_ORGANIZATION")
    public String getSat2OperatorOrganization() {
        return sat2OperatorOrganization;
    }

    /**
     * Contact organization of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_ORGANIZATION")
    public void setSat2OperatorOrganization(String sat2OperatorOrganization) {
        this.sat2OperatorOrganization = sat2OperatorOrganization;
    }

    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_COVARIANCE_METHOD")
    public String getSat2CovarianceMethod() {
        return sat2CovarianceMethod;
    }

    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_COVARIANCE_METHOD")
    public void setSat2CovarianceMethod(String sat2CovarianceMethod) {
        this.sat2CovarianceMethod = sat2CovarianceMethod;
    }

    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * (Required)
     * 
     */
    @JsonProperty("SAT2_MANEUVERABLE")
    public String getSat2Maneuverable() {
        return sat2Maneuverable;
    }

    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * (Required)
     * 
     */
    @JsonProperty("SAT2_MANEUVERABLE")
    public void setSat2Maneuverable(String sat2Maneuverable) {
        this.sat2Maneuverable = sat2Maneuverable;
    }

    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_REF_FRAME")
    public String getSat2RefFrame() {
        return sat2RefFrame;
    }

    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_REF_FRAME")
    public void setSat2RefFrame(String sat2RefFrame) {
        this.sat2RefFrame = sat2RefFrame;
    }

    /**
     * The gravity model used for the OD of the object. (EGM-96: 36D 36O; WGS-84_GEOID: 24D 24O; JGM-2 : 41D 41O)
     * 
     */
    @JsonProperty("SAT2_GRAVITY_MODEL")
    public String getSat2GravityModel() {
        return sat2GravityModel;
    }

    /**
     * The gravity model used for the OD of the object. (EGM-96: 36D 36O; WGS-84_GEOID: 24D 24O; JGM-2 : 41D 41O)
     * 
     */
    @JsonProperty("SAT2_GRAVITY_MODEL")
    public void setSat2GravityModel(String sat2GravityModel) {
        this.sat2GravityModel = sat2GravityModel;
    }

    /**
     * The atmospheric density model used for the OD of the object. If ‘NONE’ is specified, then no atmospheric model was used. (JACCHIA 70; MSIS; JACCHIA 70 DCA; NONE)
     * 
     */
    @JsonProperty("SAT2_ATMOSPHERIC_MODEL")
    public String getSat2AtmosphericModel() {
        return sat2AtmosphericModel;
    }

    /**
     * The atmospheric density model used for the OD of the object. If ‘NONE’ is specified, then no atmospheric model was used. (JACCHIA 70; MSIS; JACCHIA 70 DCA; NONE)
     * 
     */
    @JsonProperty("SAT2_ATMOSPHERIC_MODEL")
    public void setSat2AtmosphericModel(String sat2AtmosphericModel) {
        this.sat2AtmosphericModel = sat2AtmosphericModel;
    }

    /**
     * The N-body gravitational perturbations used for the OD of the object. If ‘NONE’ is specified, then no third-body gravitational perturbations were used. (MOON, SUN, JUPITER, NONE)
     * 
     */
    @JsonProperty("SAT2_N_BODY_PERTURBATIONS")
    public String getSat2NBodyPerturbations() {
        return sat2NBodyPerturbations;
    }

    /**
     * The N-body gravitational perturbations used for the OD of the object. If ‘NONE’ is specified, then no third-body gravitational perturbations were used. (MOON, SUN, JUPITER, NONE)
     * 
     */
    @JsonProperty("SAT2_N_BODY_PERTURBATIONS")
    public void setSat2NBodyPerturbations(String sat2NBodyPerturbations) {
        this.sat2NBodyPerturbations = sat2NBodyPerturbations;
    }

    /**
     * Indication of whether solar radiation pressure perturbations were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_SOLAR_RAD_PRESSURE")
    public String getSat2SolarRadPressure() {
        return sat2SolarRadPressure;
    }

    /**
     * Indication of whether solar radiation pressure perturbations were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_SOLAR_RAD_PRESSURE")
    public void setSat2SolarRadPressure(String sat2SolarRadPressure) {
        this.sat2SolarRadPressure = sat2SolarRadPressure;
    }

    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_EARTH_TIDES")
    public String getSat2EarthTides() {
        return sat2EarthTides;
    }

    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_EARTH_TIDES")
    public void setSat2EarthTides(String sat2EarthTides) {
        this.sat2EarthTides = sat2EarthTides;
    }

    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_INTRACK_THRUST")
    public String getSat2IntrackThrust() {
        return sat2IntrackThrust;
    }

    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * (Required)
     * 
     */
    @JsonProperty("SAT2_INTRACK_THRUST")
    public void setSat2IntrackThrust(String sat2IntrackThrust) {
        this.sat2IntrackThrust = sat2IntrackThrust;
    }

    /**
     * The start of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_START")
    public Date getSat2TimeLastobStart() {
        return sat2TimeLastobStart;
    }

    /**
     * The start of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_START")
    public void setSat2TimeLastobStart(Date sat2TimeLastobStart) {
        this.sat2TimeLastobStart = sat2TimeLastobStart;
    }

    /**
     * The end of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_END")
    public Date getSat2TimeLastobEnd() {
        return sat2TimeLastobEnd;
    }

    /**
     * The end of a time interval (UTC) that contains the time of the last accepted observation.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_END")
    public void setSat2TimeLastobEnd(Date sat2TimeLastobEnd) {
        this.sat2TimeLastobEnd = sat2TimeLastobEnd;
    }

    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT2_RECOMMENDED_OD_SPAN")
    public Double getSat2RecommendedOdSpan() {
        return sat2RecommendedOdSpan;
    }

    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT2_RECOMMENDED_OD_SPAN")
    public void setSat2RecommendedOdSpan(Double sat2RecommendedOdSpan) {
        this.sat2RecommendedOdSpan = sat2RecommendedOdSpan;
    }

    /**
     * Based on the observations available and the RECOMMENDED_OD_SPAN, the actual time span used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_ACTUAL_OD_SPAN")
    public Double getSat2ActualOdSpan() {
        return sat2ActualOdSpan;
    }

    /**
     * Based on the observations available and the RECOMMENDED_OD_SPAN, the actual time span used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_ACTUAL_OD_SPAN")
    public void setSat2ActualOdSpan(Double sat2ActualOdSpan) {
        this.sat2ActualOdSpan = sat2ActualOdSpan;
    }

    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_AVAILABLE")
    public Integer getSat2ObsAvailable() {
        return sat2ObsAvailable;
    }

    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_AVAILABLE")
    public void setSat2ObsAvailable(Integer sat2ObsAvailable) {
        this.sat2ObsAvailable = sat2ObsAvailable;
    }

    /**
     * The number of observations accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_USED")
    public Integer getSat2ObsUsed() {
        return sat2ObsUsed;
    }

    /**
     * The number of observations accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_USED")
    public void setSat2ObsUsed(Integer sat2ObsUsed) {
        this.sat2ObsUsed = sat2ObsUsed;
    }

    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT2_RESIDUALS_ACCEPTED")
    public Double getSat2ResidualsAccepted() {
        return sat2ResidualsAccepted;
    }

    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT2_RESIDUALS_ACCEPTED")
    public void setSat2ResidualsAccepted(Double sat2ResidualsAccepted) {
        this.sat2ResidualsAccepted = sat2ResidualsAccepted;
    }

    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT2_WEIGHTED_RMS")
    public Double getSat2WeightedRms() {
        return sat2WeightedRms;
    }

    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT2_WEIGHTED_RMS")
    public void setSat2WeightedRms(Double sat2WeightedRms) {
        this.sat2WeightedRms = sat2WeightedRms;
    }

    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT2_AREA_PC")
    public Double getSat2AreaPc() {
        return sat2AreaPc;
    }

    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT2_AREA_PC")
    public void setSat2AreaPc(Double sat2AreaPc) {
        this.sat2AreaPc = sat2AreaPc;
    }

    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CD_AREA_OVER_MASS")
    public Double getSat2CdAreaOverMass() {
        return sat2CdAreaOverMass;
    }

    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CD_AREA_OVER_MASS")
    public void setSat2CdAreaOverMass(Double sat2CdAreaOverMass) {
        this.sat2CdAreaOverMass = sat2CdAreaOverMass;
    }

    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CR_AREA_OVER_MASS")
    public Double getSat2CrAreaOverMass() {
        return sat2CrAreaOverMass;
    }

    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CR_AREA_OVER_MASS")
    public void setSat2CrAreaOverMass(Double sat2CrAreaOverMass) {
        this.sat2CrAreaOverMass = sat2CrAreaOverMass;
    }

    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_THRUST_ACCELERATION")
    public Double getSat2ThrustAcceleration() {
        return sat2ThrustAcceleration;
    }

    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_THRUST_ACCELERATION")
    public void setSat2ThrustAcceleration(Double sat2ThrustAcceleration) {
        this.sat2ThrustAcceleration = sat2ThrustAcceleration;
    }

    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT2_SEDR")
    public Double getSat2Sedr() {
        return sat2Sedr;
    }

    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT2_SEDR")
    public void setSat2Sedr(Double sat2Sedr) {
        this.sat2Sedr = sat2Sedr;
    }

    /**
     * Object position vector X component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_X")
    public Double getSat2X() {
        return sat2X;
    }

    /**
     * Object position vector X component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_X")
    public void setSat2X(Double sat2X) {
        this.sat2X = sat2X;
    }

    /**
     * Object position vector Y component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Y")
    public Double getSat2Y() {
        return sat2Y;
    }

    /**
     * Object position vector Y component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Y")
    public void setSat2Y(Double sat2Y) {
        this.sat2Y = sat2Y;
    }

    /**
     * Object position vector Z component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Z")
    public Double getSat2Z() {
        return sat2Z;
    }

    /**
     * Object position vector Z component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Z")
    public void setSat2Z(Double sat2Z) {
        this.sat2Z = sat2Z;
    }

    /**
     * Object position vector X_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_X_DOT")
    public Double getSat2XDot() {
        return sat2XDot;
    }

    /**
     * Object position vector X_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_X_DOT")
    public void setSat2XDot(Double sat2XDot) {
        this.sat2XDot = sat2XDot;
    }

    /**
     * Object position vector Y_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Y_DOT")
    public Double getSat2YDot() {
        return sat2YDot;
    }

    /**
     * Object position vector Y_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Y_DOT")
    public void setSat2YDot(Double sat2YDot) {
        this.sat2YDot = sat2YDot;
    }

    /**
     * Object position vector Z_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Z_DOT")
    public Double getSat2ZDot() {
        return sat2ZDot;
    }

    /**
     * Object position vector Z_DOT component
     * (Required)
     * 
     */
    @JsonProperty("SAT2_Z_DOT")
    public void setSat2ZDot(Double sat2ZDot) {
        this.sat2ZDot = sat2ZDot;
    }

    /**
     * Object covariance matrix [1,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CR_R")
    public Double getSat2CrR() {
        return sat2CrR;
    }

    /**
     * Object covariance matrix [1,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CR_R")
    public void setSat2CrR(Double sat2CrR) {
        this.sat2CrR = sat2CrR;
    }

    /**
     * Object covariance matrix [2,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CT_R")
    public Double getSat2CtR() {
        return sat2CtR;
    }

    /**
     * Object covariance matrix [2,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CT_R")
    public void setSat2CtR(Double sat2CtR) {
        this.sat2CtR = sat2CtR;
    }

    /**
     * Object covariance matrix [2,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CT_T")
    public Double getSat2CtT() {
        return sat2CtT;
    }

    /**
     * Object covariance matrix [2,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CT_T")
    public void setSat2CtT(Double sat2CtT) {
        this.sat2CtT = sat2CtT;
    }

    /**
     * Object covariance matrix [3,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CN_R")
    public Double getSat2CnR() {
        return sat2CnR;
    }

    /**
     * Object covariance matrix [3,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CN_R")
    public void setSat2CnR(Double sat2CnR) {
        this.sat2CnR = sat2CnR;
    }

    /**
     * Object covariance matrix [3,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CN_T")
    public Double getSat2CnT() {
        return sat2CnT;
    }

    /**
     * Object covariance matrix [3,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CN_T")
    public void setSat2CnT(Double sat2CnT) {
        this.sat2CnT = sat2CnT;
    }

    /**
     * Object covariance matrix [3,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CN_N")
    public Double getSat2CnN() {
        return sat2CnN;
    }

    /**
     * Object covariance matrix [3,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CN_N")
    public void setSat2CnN(Double sat2CnN) {
        this.sat2CnN = sat2CnN;
    }

    /**
     * Object covariance matrix [4,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_R")
    public Double getSat2CrdotR() {
        return sat2CrdotR;
    }

    /**
     * Object covariance matrix [4,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_R")
    public void setSat2CrdotR(Double sat2CrdotR) {
        this.sat2CrdotR = sat2CrdotR;
    }

    /**
     * Object covariance matrix [4,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_T")
    public Double getSat2CrdotT() {
        return sat2CrdotT;
    }

    /**
     * Object covariance matrix [4,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_T")
    public void setSat2CrdotT(Double sat2CrdotT) {
        this.sat2CrdotT = sat2CrdotT;
    }

    /**
     * Object covariance matrix [4,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_N")
    public Double getSat2CrdotN() {
        return sat2CrdotN;
    }

    /**
     * Object covariance matrix [4,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_N")
    public void setSat2CrdotN(Double sat2CrdotN) {
        this.sat2CrdotN = sat2CrdotN;
    }

    /**
     * Object covariance matrix [4,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_RDOT")
    public Double getSat2CrdotRdot() {
        return sat2CrdotRdot;
    }

    /**
     * Object covariance matrix [4,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CRDOT_RDOT")
    public void setSat2CrdotRdot(Double sat2CrdotRdot) {
        this.sat2CrdotRdot = sat2CrdotRdot;
    }

    /**
     * Object covariance matrix [5,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_R")
    public Double getSat2CtdotR() {
        return sat2CtdotR;
    }

    /**
     * Object covariance matrix [5,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_R")
    public void setSat2CtdotR(Double sat2CtdotR) {
        this.sat2CtdotR = sat2CtdotR;
    }

    /**
     * Object covariance matrix [5,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_T")
    public Double getSat2CtdotT() {
        return sat2CtdotT;
    }

    /**
     * Object covariance matrix [5,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_T")
    public void setSat2CtdotT(Double sat2CtdotT) {
        this.sat2CtdotT = sat2CtdotT;
    }

    /**
     * Object covariance matrix [5,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_N")
    public Double getSat2CtdotN() {
        return sat2CtdotN;
    }

    /**
     * Object covariance matrix [5,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_N")
    public void setSat2CtdotN(Double sat2CtdotN) {
        this.sat2CtdotN = sat2CtdotN;
    }

    /**
     * Object covariance matrix [5,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_RDOT")
    public Double getSat2CtdotRdot() {
        return sat2CtdotRdot;
    }

    /**
     * Object covariance matrix [5,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_RDOT")
    public void setSat2CtdotRdot(Double sat2CtdotRdot) {
        this.sat2CtdotRdot = sat2CtdotRdot;
    }

    /**
     * Object covariance matrix [5,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_TDOT")
    public Double getSat2CtdotTdot() {
        return sat2CtdotTdot;
    }

    /**
     * Object covariance matrix [5,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CTDOT_TDOT")
    public void setSat2CtdotTdot(Double sat2CtdotTdot) {
        this.sat2CtdotTdot = sat2CtdotTdot;
    }

    /**
     * Object covariance matrix [6,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_R")
    public Double getSat2CndotR() {
        return sat2CndotR;
    }

    /**
     * Object covariance matrix [6,1]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_R")
    public void setSat2CndotR(Double sat2CndotR) {
        this.sat2CndotR = sat2CndotR;
    }

    /**
     * Object covariance matrix [6,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_T")
    public Double getSat2CndotT() {
        return sat2CndotT;
    }

    /**
     * Object covariance matrix [6,2]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_T")
    public void setSat2CndotT(Double sat2CndotT) {
        this.sat2CndotT = sat2CndotT;
    }

    /**
     * Object covariance matrix [6,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_N")
    public Double getSat2CndotN() {
        return sat2CndotN;
    }

    /**
     * Object covariance matrix [6,3]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_N")
    public void setSat2CndotN(Double sat2CndotN) {
        this.sat2CndotN = sat2CndotN;
    }

    /**
     * Object covariance matrix [6,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_RDOT")
    public Double getSat2CndotRdot() {
        return sat2CndotRdot;
    }

    /**
     * Object covariance matrix [6,4]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_RDOT")
    public void setSat2CndotRdot(Double sat2CndotRdot) {
        this.sat2CndotRdot = sat2CndotRdot;
    }

    /**
     * Object covariance matrix [6,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_TDOT")
    public Double getSat2CndotTdot() {
        return sat2CndotTdot;
    }

    /**
     * Object covariance matrix [6,5]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_TDOT")
    public void setSat2CndotTdot(Double sat2CndotTdot) {
        this.sat2CndotTdot = sat2CndotTdot;
    }

    /**
     * Object covariance matrix [6,6]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_NDOT")
    public Double getSat2CndotNdot() {
        return sat2CndotNdot;
    }

    /**
     * Object covariance matrix [6,6]
     * (Required)
     * 
     */
    @JsonProperty("SAT2_CNDOT_NDOT")
    public void setSat2CndotNdot(Double sat2CndotNdot) {
        this.sat2CndotNdot = sat2CndotNdot;
    }

    /**
     * Object covariance matrix [7,1]
     * 
     */
    @JsonProperty("SAT2_CDRG_R")
    public Double getSat2CdrgR() {
        return sat2CdrgR;
    }

    /**
     * Object covariance matrix [7,1]
     * 
     */
    @JsonProperty("SAT2_CDRG_R")
    public void setSat2CdrgR(Double sat2CdrgR) {
        this.sat2CdrgR = sat2CdrgR;
    }

    /**
     * Object covariance matrix [7,2]
     * 
     */
    @JsonProperty("SAT2_CDRG_T")
    public Double getSat2CdrgT() {
        return sat2CdrgT;
    }

    /**
     * Object covariance matrix [7,2]
     * 
     */
    @JsonProperty("SAT2_CDRG_T")
    public void setSat2CdrgT(Double sat2CdrgT) {
        this.sat2CdrgT = sat2CdrgT;
    }

    /**
     * Object covariance matrix [7,3]
     * 
     */
    @JsonProperty("SAT2_CDRG_N")
    public Double getSat2CdrgN() {
        return sat2CdrgN;
    }

    /**
     * Object covariance matrix [7,3]
     * 
     */
    @JsonProperty("SAT2_CDRG_N")
    public void setSat2CdrgN(Double sat2CdrgN) {
        this.sat2CdrgN = sat2CdrgN;
    }

    /**
     * Object covariance matrix [7,4]
     * 
     */
    @JsonProperty("SAT2_CDRG_RDOT")
    public Double getSat2CdrgRdot() {
        return sat2CdrgRdot;
    }

    /**
     * Object covariance matrix [7,4]
     * 
     */
    @JsonProperty("SAT2_CDRG_RDOT")
    public void setSat2CdrgRdot(Double sat2CdrgRdot) {
        this.sat2CdrgRdot = sat2CdrgRdot;
    }

    /**
     * Object covariance matrix [7,5]
     * 
     */
    @JsonProperty("SAT2_CDRG_TDOT")
    public Double getSat2CdrgTdot() {
        return sat2CdrgTdot;
    }

    /**
     * Object covariance matrix [7,5]
     * 
     */
    @JsonProperty("SAT2_CDRG_TDOT")
    public void setSat2CdrgTdot(Double sat2CdrgTdot) {
        this.sat2CdrgTdot = sat2CdrgTdot;
    }

    /**
     * Object covariance matrix [7,6]
     * 
     */
    @JsonProperty("SAT2_CDRG_NDOT")
    public Double getSat2CdrgNdot() {
        return sat2CdrgNdot;
    }

    /**
     * Object covariance matrix [7,6]
     * 
     */
    @JsonProperty("SAT2_CDRG_NDOT")
    public void setSat2CdrgNdot(Double sat2CdrgNdot) {
        this.sat2CdrgNdot = sat2CdrgNdot;
    }

    /**
     * Object covariance matrix [7,7]
     * 
     */
    @JsonProperty("SAT2_CDRG_DRG")
    public Double getSat2CdrgDrg() {
        return sat2CdrgDrg;
    }

    /**
     * Object covariance matrix [7,7]
     * 
     */
    @JsonProperty("SAT2_CDRG_DRG")
    public void setSat2CdrgDrg(Double sat2CdrgDrg) {
        this.sat2CdrgDrg = sat2CdrgDrg;
    }

    /**
     * Object covariance matrix [8,1]
     * 
     */
    @JsonProperty("SAT2_CSRP_R")
    public String getSat2CsrpR() {
        return sat2CsrpR;
    }

    /**
     * Object covariance matrix [8,1]
     * 
     */
    @JsonProperty("SAT2_CSRP_R")
    public void setSat2CsrpR(String sat2CsrpR) {
        this.sat2CsrpR = sat2CsrpR;
    }

    /**
     * Object covariance matrix [8,2]
     * 
     */
    @JsonProperty("SAT2_CSRP_T")
    public Double getSat2CsrpT() {
        return sat2CsrpT;
    }

    /**
     * Object covariance matrix [8,2]
     * 
     */
    @JsonProperty("SAT2_CSRP_T")
    public void setSat2CsrpT(Double sat2CsrpT) {
        this.sat2CsrpT = sat2CsrpT;
    }

    /**
     * Object covariance matrix [8,3]
     * 
     */
    @JsonProperty("SAT2_CSRP_N")
    public Double getSat2CsrpN() {
        return sat2CsrpN;
    }

    /**
     * Object covariance matrix [8,3]
     * 
     */
    @JsonProperty("SAT2_CSRP_N")
    public void setSat2CsrpN(Double sat2CsrpN) {
        this.sat2CsrpN = sat2CsrpN;
    }

    /**
     * Object covariance matrix [8,4]
     * 
     */
    @JsonProperty("SAT2_CSRP_RDOT")
    public Double getSat2CsrpRdot() {
        return sat2CsrpRdot;
    }

    /**
     * Object covariance matrix [8,4]
     * 
     */
    @JsonProperty("SAT2_CSRP_RDOT")
    public void setSat2CsrpRdot(Double sat2CsrpRdot) {
        this.sat2CsrpRdot = sat2CsrpRdot;
    }

    /**
     * Object covariance matrix [8,5]
     * 
     */
    @JsonProperty("SAT2_CSRP_TDOT")
    public Double getSat2CsrpTdot() {
        return sat2CsrpTdot;
    }

    /**
     * Object covariance matrix [8,5]
     * 
     */
    @JsonProperty("SAT2_CSRP_TDOT")
    public void setSat2CsrpTdot(Double sat2CsrpTdot) {
        this.sat2CsrpTdot = sat2CsrpTdot;
    }

    /**
     * Object covariance matrix [8,6]
     * 
     */
    @JsonProperty("SAT2_CSRP_NDOT")
    public Double getSat2CsrpNdot() {
        return sat2CsrpNdot;
    }

    /**
     * Object covariance matrix [8,6]
     * 
     */
    @JsonProperty("SAT2_CSRP_NDOT")
    public void setSat2CsrpNdot(Double sat2CsrpNdot) {
        this.sat2CsrpNdot = sat2CsrpNdot;
    }

    /**
     * Object covariance matrix [8,7]
     * 
     */
    @JsonProperty("SAT2_CSRP_DRG")
    public Double getSat2CsrpDrg() {
        return sat2CsrpDrg;
    }

    /**
     * Object covariance matrix [8,7]
     * 
     */
    @JsonProperty("SAT2_CSRP_DRG")
    public void setSat2CsrpDrg(Double sat2CsrpDrg) {
        this.sat2CsrpDrg = sat2CsrpDrg;
    }

    /**
     * Object covariance matrix [8,8]
     * 
     */
    @JsonProperty("SAT2_CSRP_SRP")
    public Double getSat2CsrpSrp() {
        return sat2CsrpSrp;
    }

    /**
     * Object covariance matrix [8,8]
     * 
     */
    @JsonProperty("SAT2_CSRP_SRP")
    public void setSat2CsrpSrp(Double sat2CsrpSrp) {
        this.sat2CsrpSrp = sat2CsrpSrp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CcsdsCdm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ccsdsCdmVers");
        sb.append('=');
        sb.append(((this.ccsdsCdmVers == null)?"<null>":this.ccsdsCdmVers));
        sb.append(',');
        sb.append("creationDate");
        sb.append('=');
        sb.append(((this.creationDate == null)?"<null>":this.creationDate));
        sb.append(',');
        sb.append("originator");
        sb.append('=');
        sb.append(((this.originator == null)?"<null>":this.originator));
        sb.append(',');
        sb.append("messageFor");
        sb.append('=');
        sb.append(((this.messageFor == null)?"<null>":this.messageFor));
        sb.append(',');
        sb.append("messageId");
        sb.append('=');
        sb.append(((this.messageId == null)?"<null>":this.messageId));
        sb.append(',');
        sb.append("tca");
        sb.append('=');
        sb.append(((this.tca == null)?"<null>":this.tca));
        sb.append(',');
        sb.append("missDistance");
        sb.append('=');
        sb.append(((this.missDistance == null)?"<null>":this.missDistance));
        sb.append(',');
        sb.append("relativeSpeed");
        sb.append('=');
        sb.append(((this.relativeSpeed == null)?"<null>":this.relativeSpeed));
        sb.append(',');
        sb.append("relativePositionR");
        sb.append('=');
        sb.append(((this.relativePositionR == null)?"<null>":this.relativePositionR));
        sb.append(',');
        sb.append("relativePositionT");
        sb.append('=');
        sb.append(((this.relativePositionT == null)?"<null>":this.relativePositionT));
        sb.append(',');
        sb.append("relativePositionN");
        sb.append('=');
        sb.append(((this.relativePositionN == null)?"<null>":this.relativePositionN));
        sb.append(',');
        sb.append("relativeVelocityR");
        sb.append('=');
        sb.append(((this.relativeVelocityR == null)?"<null>":this.relativeVelocityR));
        sb.append(',');
        sb.append("relativeVelocityT");
        sb.append('=');
        sb.append(((this.relativeVelocityT == null)?"<null>":this.relativeVelocityT));
        sb.append(',');
        sb.append("relativeVelocityN");
        sb.append('=');
        sb.append(((this.relativeVelocityN == null)?"<null>":this.relativeVelocityN));
        sb.append(',');
        sb.append("collisionProbability");
        sb.append('=');
        sb.append(((this.collisionProbability == null)?"<null>":this.collisionProbability));
        sb.append(',');
        sb.append("collisionProbabilityMethod");
        sb.append('=');
        sb.append(((this.collisionProbabilityMethod == null)?"<null>":this.collisionProbabilityMethod));
        sb.append(',');
        sb.append("sat1Object");
        sb.append('=');
        sb.append(((this.sat1Object == null)?"<null>":this.sat1Object));
        sb.append(',');
        sb.append("sat1ObjectDesignator");
        sb.append('=');
        sb.append(((this.sat1ObjectDesignator == null)?"<null>":this.sat1ObjectDesignator));
        sb.append(',');
        sb.append("sat1CatalogName");
        sb.append('=');
        sb.append(((this.sat1CatalogName == null)?"<null>":this.sat1CatalogName));
        sb.append(',');
        sb.append("sat1ObjectName");
        sb.append('=');
        sb.append(((this.sat1ObjectName == null)?"<null>":this.sat1ObjectName));
        sb.append(',');
        sb.append("sat1InternationalDesignator");
        sb.append('=');
        sb.append(((this.sat1InternationalDesignator == null)?"<null>":this.sat1InternationalDesignator));
        sb.append(',');
        sb.append("sat1ObjectType");
        sb.append('=');
        sb.append(((this.sat1ObjectType == null)?"<null>":this.sat1ObjectType));
        sb.append(',');
        sb.append("sat1OperatorOrganization");
        sb.append('=');
        sb.append(((this.sat1OperatorOrganization == null)?"<null>":this.sat1OperatorOrganization));
        sb.append(',');
        sb.append("sat1CovarianceMethod");
        sb.append('=');
        sb.append(((this.sat1CovarianceMethod == null)?"<null>":this.sat1CovarianceMethod));
        sb.append(',');
        sb.append("sat1Maneuverable");
        sb.append('=');
        sb.append(((this.sat1Maneuverable == null)?"<null>":this.sat1Maneuverable));
        sb.append(',');
        sb.append("sat1RefFrame");
        sb.append('=');
        sb.append(((this.sat1RefFrame == null)?"<null>":this.sat1RefFrame));
        sb.append(',');
        sb.append("sat1GravityModel");
        sb.append('=');
        sb.append(((this.sat1GravityModel == null)?"<null>":this.sat1GravityModel));
        sb.append(',');
        sb.append("sat1AtmosphericModel");
        sb.append('=');
        sb.append(((this.sat1AtmosphericModel == null)?"<null>":this.sat1AtmosphericModel));
        sb.append(',');
        sb.append("sat1NBodyPerturbations");
        sb.append('=');
        sb.append(((this.sat1NBodyPerturbations == null)?"<null>":this.sat1NBodyPerturbations));
        sb.append(',');
        sb.append("sat1SolarRadPressure");
        sb.append('=');
        sb.append(((this.sat1SolarRadPressure == null)?"<null>":this.sat1SolarRadPressure));
        sb.append(',');
        sb.append("sat1EarthTides");
        sb.append('=');
        sb.append(((this.sat1EarthTides == null)?"<null>":this.sat1EarthTides));
        sb.append(',');
        sb.append("sat1IntrackThrust");
        sb.append('=');
        sb.append(((this.sat1IntrackThrust == null)?"<null>":this.sat1IntrackThrust));
        sb.append(',');
        sb.append("sat1TimeLastobStart");
        sb.append('=');
        sb.append(((this.sat1TimeLastobStart == null)?"<null>":this.sat1TimeLastobStart));
        sb.append(',');
        sb.append("sat1TimeLastobEnd");
        sb.append('=');
        sb.append(((this.sat1TimeLastobEnd == null)?"<null>":this.sat1TimeLastobEnd));
        sb.append(',');
        sb.append("sat1RecommendedOdSpan");
        sb.append('=');
        sb.append(((this.sat1RecommendedOdSpan == null)?"<null>":this.sat1RecommendedOdSpan));
        sb.append(',');
        sb.append("sat1ActualOdSpan");
        sb.append('=');
        sb.append(((this.sat1ActualOdSpan == null)?"<null>":this.sat1ActualOdSpan));
        sb.append(',');
        sb.append("sat1ObsAvailable");
        sb.append('=');
        sb.append(((this.sat1ObsAvailable == null)?"<null>":this.sat1ObsAvailable));
        sb.append(',');
        sb.append("sat1ObsUsed");
        sb.append('=');
        sb.append(((this.sat1ObsUsed == null)?"<null>":this.sat1ObsUsed));
        sb.append(',');
        sb.append("sat1ResidualsAccepted");
        sb.append('=');
        sb.append(((this.sat1ResidualsAccepted == null)?"<null>":this.sat1ResidualsAccepted));
        sb.append(',');
        sb.append("sat1WeightedRms");
        sb.append('=');
        sb.append(((this.sat1WeightedRms == null)?"<null>":this.sat1WeightedRms));
        sb.append(',');
        sb.append("sat1AreaPc");
        sb.append('=');
        sb.append(((this.sat1AreaPc == null)?"<null>":this.sat1AreaPc));
        sb.append(',');
        sb.append("sat1CdAreaOverMass");
        sb.append('=');
        sb.append(((this.sat1CdAreaOverMass == null)?"<null>":this.sat1CdAreaOverMass));
        sb.append(',');
        sb.append("sat1CrAreaOverMass");
        sb.append('=');
        sb.append(((this.sat1CrAreaOverMass == null)?"<null>":this.sat1CrAreaOverMass));
        sb.append(',');
        sb.append("sat1ThrustAcceleration");
        sb.append('=');
        sb.append(((this.sat1ThrustAcceleration == null)?"<null>":this.sat1ThrustAcceleration));
        sb.append(',');
        sb.append("sat1Sedr");
        sb.append('=');
        sb.append(((this.sat1Sedr == null)?"<null>":this.sat1Sedr));
        sb.append(',');
        sb.append("sat1X");
        sb.append('=');
        sb.append(((this.sat1X == null)?"<null>":this.sat1X));
        sb.append(',');
        sb.append("sat1Y");
        sb.append('=');
        sb.append(((this.sat1Y == null)?"<null>":this.sat1Y));
        sb.append(',');
        sb.append("sat1Z");
        sb.append('=');
        sb.append(((this.sat1Z == null)?"<null>":this.sat1Z));
        sb.append(',');
        sb.append("sat1XDot");
        sb.append('=');
        sb.append(((this.sat1XDot == null)?"<null>":this.sat1XDot));
        sb.append(',');
        sb.append("sat1YDot");
        sb.append('=');
        sb.append(((this.sat1YDot == null)?"<null>":this.sat1YDot));
        sb.append(',');
        sb.append("sat1ZDot");
        sb.append('=');
        sb.append(((this.sat1ZDot == null)?"<null>":this.sat1ZDot));
        sb.append(',');
        sb.append("sat1CrR");
        sb.append('=');
        sb.append(((this.sat1CrR == null)?"<null>":this.sat1CrR));
        sb.append(',');
        sb.append("sat1CtR");
        sb.append('=');
        sb.append(((this.sat1CtR == null)?"<null>":this.sat1CtR));
        sb.append(',');
        sb.append("sat1CtT");
        sb.append('=');
        sb.append(((this.sat1CtT == null)?"<null>":this.sat1CtT));
        sb.append(',');
        sb.append("sat1CnR");
        sb.append('=');
        sb.append(((this.sat1CnR == null)?"<null>":this.sat1CnR));
        sb.append(',');
        sb.append("sat1CnT");
        sb.append('=');
        sb.append(((this.sat1CnT == null)?"<null>":this.sat1CnT));
        sb.append(',');
        sb.append("sat1CnN");
        sb.append('=');
        sb.append(((this.sat1CnN == null)?"<null>":this.sat1CnN));
        sb.append(',');
        sb.append("sat1CrdotR");
        sb.append('=');
        sb.append(((this.sat1CrdotR == null)?"<null>":this.sat1CrdotR));
        sb.append(',');
        sb.append("sat1CrdotT");
        sb.append('=');
        sb.append(((this.sat1CrdotT == null)?"<null>":this.sat1CrdotT));
        sb.append(',');
        sb.append("sat1CrdotN");
        sb.append('=');
        sb.append(((this.sat1CrdotN == null)?"<null>":this.sat1CrdotN));
        sb.append(',');
        sb.append("sat1CrdotRdot");
        sb.append('=');
        sb.append(((this.sat1CrdotRdot == null)?"<null>":this.sat1CrdotRdot));
        sb.append(',');
        sb.append("sat1CtdotR");
        sb.append('=');
        sb.append(((this.sat1CtdotR == null)?"<null>":this.sat1CtdotR));
        sb.append(',');
        sb.append("sat1CtdotT");
        sb.append('=');
        sb.append(((this.sat1CtdotT == null)?"<null>":this.sat1CtdotT));
        sb.append(',');
        sb.append("sat1CtdotN");
        sb.append('=');
        sb.append(((this.sat1CtdotN == null)?"<null>":this.sat1CtdotN));
        sb.append(',');
        sb.append("sat1CtdotRdot");
        sb.append('=');
        sb.append(((this.sat1CtdotRdot == null)?"<null>":this.sat1CtdotRdot));
        sb.append(',');
        sb.append("sat1CtdotTdot");
        sb.append('=');
        sb.append(((this.sat1CtdotTdot == null)?"<null>":this.sat1CtdotTdot));
        sb.append(',');
        sb.append("sat1CndotR");
        sb.append('=');
        sb.append(((this.sat1CndotR == null)?"<null>":this.sat1CndotR));
        sb.append(',');
        sb.append("sat1CndotT");
        sb.append('=');
        sb.append(((this.sat1CndotT == null)?"<null>":this.sat1CndotT));
        sb.append(',');
        sb.append("sat1CndotN");
        sb.append('=');
        sb.append(((this.sat1CndotN == null)?"<null>":this.sat1CndotN));
        sb.append(',');
        sb.append("sat1CndotRdot");
        sb.append('=');
        sb.append(((this.sat1CndotRdot == null)?"<null>":this.sat1CndotRdot));
        sb.append(',');
        sb.append("sat1CndotTdot");
        sb.append('=');
        sb.append(((this.sat1CndotTdot == null)?"<null>":this.sat1CndotTdot));
        sb.append(',');
        sb.append("sat1CndotNdot");
        sb.append('=');
        sb.append(((this.sat1CndotNdot == null)?"<null>":this.sat1CndotNdot));
        sb.append(',');
        sb.append("sat1CdrgR");
        sb.append('=');
        sb.append(((this.sat1CdrgR == null)?"<null>":this.sat1CdrgR));
        sb.append(',');
        sb.append("sat1CdrgT");
        sb.append('=');
        sb.append(((this.sat1CdrgT == null)?"<null>":this.sat1CdrgT));
        sb.append(',');
        sb.append("sat1CdrgN");
        sb.append('=');
        sb.append(((this.sat1CdrgN == null)?"<null>":this.sat1CdrgN));
        sb.append(',');
        sb.append("sat1CdrgRdot");
        sb.append('=');
        sb.append(((this.sat1CdrgRdot == null)?"<null>":this.sat1CdrgRdot));
        sb.append(',');
        sb.append("sat1CdrgTdot");
        sb.append('=');
        sb.append(((this.sat1CdrgTdot == null)?"<null>":this.sat1CdrgTdot));
        sb.append(',');
        sb.append("sat1CdrgNdot");
        sb.append('=');
        sb.append(((this.sat1CdrgNdot == null)?"<null>":this.sat1CdrgNdot));
        sb.append(',');
        sb.append("sat1CdrgDrg");
        sb.append('=');
        sb.append(((this.sat1CdrgDrg == null)?"<null>":this.sat1CdrgDrg));
        sb.append(',');
        sb.append("sat1CsrpR");
        sb.append('=');
        sb.append(((this.sat1CsrpR == null)?"<null>":this.sat1CsrpR));
        sb.append(',');
        sb.append("sat1CsrpT");
        sb.append('=');
        sb.append(((this.sat1CsrpT == null)?"<null>":this.sat1CsrpT));
        sb.append(',');
        sb.append("sat1CsrpN");
        sb.append('=');
        sb.append(((this.sat1CsrpN == null)?"<null>":this.sat1CsrpN));
        sb.append(',');
        sb.append("sat1CsrpRdot");
        sb.append('=');
        sb.append(((this.sat1CsrpRdot == null)?"<null>":this.sat1CsrpRdot));
        sb.append(',');
        sb.append("sat1CsrpTdot");
        sb.append('=');
        sb.append(((this.sat1CsrpTdot == null)?"<null>":this.sat1CsrpTdot));
        sb.append(',');
        sb.append("sat1CsrpNdot");
        sb.append('=');
        sb.append(((this.sat1CsrpNdot == null)?"<null>":this.sat1CsrpNdot));
        sb.append(',');
        sb.append("sat1CsrpDrg");
        sb.append('=');
        sb.append(((this.sat1CsrpDrg == null)?"<null>":this.sat1CsrpDrg));
        sb.append(',');
        sb.append("sat1CsrpSrp");
        sb.append('=');
        sb.append(((this.sat1CsrpSrp == null)?"<null>":this.sat1CsrpSrp));
        sb.append(',');
        sb.append("sat2Object");
        sb.append('=');
        sb.append(((this.sat2Object == null)?"<null>":this.sat2Object));
        sb.append(',');
        sb.append("sat2ObjectDesignator");
        sb.append('=');
        sb.append(((this.sat2ObjectDesignator == null)?"<null>":this.sat2ObjectDesignator));
        sb.append(',');
        sb.append("sat2CatalogName");
        sb.append('=');
        sb.append(((this.sat2CatalogName == null)?"<null>":this.sat2CatalogName));
        sb.append(',');
        sb.append("sat2ObjectName");
        sb.append('=');
        sb.append(((this.sat2ObjectName == null)?"<null>":this.sat2ObjectName));
        sb.append(',');
        sb.append("sat2InternationalDesignator");
        sb.append('=');
        sb.append(((this.sat2InternationalDesignator == null)?"<null>":this.sat2InternationalDesignator));
        sb.append(',');
        sb.append("sat2ObjectType");
        sb.append('=');
        sb.append(((this.sat2ObjectType == null)?"<null>":this.sat2ObjectType));
        sb.append(',');
        sb.append("sat2OperatorOrganization");
        sb.append('=');
        sb.append(((this.sat2OperatorOrganization == null)?"<null>":this.sat2OperatorOrganization));
        sb.append(',');
        sb.append("sat2CovarianceMethod");
        sb.append('=');
        sb.append(((this.sat2CovarianceMethod == null)?"<null>":this.sat2CovarianceMethod));
        sb.append(',');
        sb.append("sat2Maneuverable");
        sb.append('=');
        sb.append(((this.sat2Maneuverable == null)?"<null>":this.sat2Maneuverable));
        sb.append(',');
        sb.append("sat2RefFrame");
        sb.append('=');
        sb.append(((this.sat2RefFrame == null)?"<null>":this.sat2RefFrame));
        sb.append(',');
        sb.append("sat2GravityModel");
        sb.append('=');
        sb.append(((this.sat2GravityModel == null)?"<null>":this.sat2GravityModel));
        sb.append(',');
        sb.append("sat2AtmosphericModel");
        sb.append('=');
        sb.append(((this.sat2AtmosphericModel == null)?"<null>":this.sat2AtmosphericModel));
        sb.append(',');
        sb.append("sat2NBodyPerturbations");
        sb.append('=');
        sb.append(((this.sat2NBodyPerturbations == null)?"<null>":this.sat2NBodyPerturbations));
        sb.append(',');
        sb.append("sat2SolarRadPressure");
        sb.append('=');
        sb.append(((this.sat2SolarRadPressure == null)?"<null>":this.sat2SolarRadPressure));
        sb.append(',');
        sb.append("sat2EarthTides");
        sb.append('=');
        sb.append(((this.sat2EarthTides == null)?"<null>":this.sat2EarthTides));
        sb.append(',');
        sb.append("sat2IntrackThrust");
        sb.append('=');
        sb.append(((this.sat2IntrackThrust == null)?"<null>":this.sat2IntrackThrust));
        sb.append(',');
        sb.append("sat2TimeLastobStart");
        sb.append('=');
        sb.append(((this.sat2TimeLastobStart == null)?"<null>":this.sat2TimeLastobStart));
        sb.append(',');
        sb.append("sat2TimeLastobEnd");
        sb.append('=');
        sb.append(((this.sat2TimeLastobEnd == null)?"<null>":this.sat2TimeLastobEnd));
        sb.append(',');
        sb.append("sat2RecommendedOdSpan");
        sb.append('=');
        sb.append(((this.sat2RecommendedOdSpan == null)?"<null>":this.sat2RecommendedOdSpan));
        sb.append(',');
        sb.append("sat2ActualOdSpan");
        sb.append('=');
        sb.append(((this.sat2ActualOdSpan == null)?"<null>":this.sat2ActualOdSpan));
        sb.append(',');
        sb.append("sat2ObsAvailable");
        sb.append('=');
        sb.append(((this.sat2ObsAvailable == null)?"<null>":this.sat2ObsAvailable));
        sb.append(',');
        sb.append("sat2ObsUsed");
        sb.append('=');
        sb.append(((this.sat2ObsUsed == null)?"<null>":this.sat2ObsUsed));
        sb.append(',');
        sb.append("sat2ResidualsAccepted");
        sb.append('=');
        sb.append(((this.sat2ResidualsAccepted == null)?"<null>":this.sat2ResidualsAccepted));
        sb.append(',');
        sb.append("sat2WeightedRms");
        sb.append('=');
        sb.append(((this.sat2WeightedRms == null)?"<null>":this.sat2WeightedRms));
        sb.append(',');
        sb.append("sat2AreaPc");
        sb.append('=');
        sb.append(((this.sat2AreaPc == null)?"<null>":this.sat2AreaPc));
        sb.append(',');
        sb.append("sat2CdAreaOverMass");
        sb.append('=');
        sb.append(((this.sat2CdAreaOverMass == null)?"<null>":this.sat2CdAreaOverMass));
        sb.append(',');
        sb.append("sat2CrAreaOverMass");
        sb.append('=');
        sb.append(((this.sat2CrAreaOverMass == null)?"<null>":this.sat2CrAreaOverMass));
        sb.append(',');
        sb.append("sat2ThrustAcceleration");
        sb.append('=');
        sb.append(((this.sat2ThrustAcceleration == null)?"<null>":this.sat2ThrustAcceleration));
        sb.append(',');
        sb.append("sat2Sedr");
        sb.append('=');
        sb.append(((this.sat2Sedr == null)?"<null>":this.sat2Sedr));
        sb.append(',');
        sb.append("sat2X");
        sb.append('=');
        sb.append(((this.sat2X == null)?"<null>":this.sat2X));
        sb.append(',');
        sb.append("sat2Y");
        sb.append('=');
        sb.append(((this.sat2Y == null)?"<null>":this.sat2Y));
        sb.append(',');
        sb.append("sat2Z");
        sb.append('=');
        sb.append(((this.sat2Z == null)?"<null>":this.sat2Z));
        sb.append(',');
        sb.append("sat2XDot");
        sb.append('=');
        sb.append(((this.sat2XDot == null)?"<null>":this.sat2XDot));
        sb.append(',');
        sb.append("sat2YDot");
        sb.append('=');
        sb.append(((this.sat2YDot == null)?"<null>":this.sat2YDot));
        sb.append(',');
        sb.append("sat2ZDot");
        sb.append('=');
        sb.append(((this.sat2ZDot == null)?"<null>":this.sat2ZDot));
        sb.append(',');
        sb.append("sat2CrR");
        sb.append('=');
        sb.append(((this.sat2CrR == null)?"<null>":this.sat2CrR));
        sb.append(',');
        sb.append("sat2CtR");
        sb.append('=');
        sb.append(((this.sat2CtR == null)?"<null>":this.sat2CtR));
        sb.append(',');
        sb.append("sat2CtT");
        sb.append('=');
        sb.append(((this.sat2CtT == null)?"<null>":this.sat2CtT));
        sb.append(',');
        sb.append("sat2CnR");
        sb.append('=');
        sb.append(((this.sat2CnR == null)?"<null>":this.sat2CnR));
        sb.append(',');
        sb.append("sat2CnT");
        sb.append('=');
        sb.append(((this.sat2CnT == null)?"<null>":this.sat2CnT));
        sb.append(',');
        sb.append("sat2CnN");
        sb.append('=');
        sb.append(((this.sat2CnN == null)?"<null>":this.sat2CnN));
        sb.append(',');
        sb.append("sat2CrdotR");
        sb.append('=');
        sb.append(((this.sat2CrdotR == null)?"<null>":this.sat2CrdotR));
        sb.append(',');
        sb.append("sat2CrdotT");
        sb.append('=');
        sb.append(((this.sat2CrdotT == null)?"<null>":this.sat2CrdotT));
        sb.append(',');
        sb.append("sat2CrdotN");
        sb.append('=');
        sb.append(((this.sat2CrdotN == null)?"<null>":this.sat2CrdotN));
        sb.append(',');
        sb.append("sat2CrdotRdot");
        sb.append('=');
        sb.append(((this.sat2CrdotRdot == null)?"<null>":this.sat2CrdotRdot));
        sb.append(',');
        sb.append("sat2CtdotR");
        sb.append('=');
        sb.append(((this.sat2CtdotR == null)?"<null>":this.sat2CtdotR));
        sb.append(',');
        sb.append("sat2CtdotT");
        sb.append('=');
        sb.append(((this.sat2CtdotT == null)?"<null>":this.sat2CtdotT));
        sb.append(',');
        sb.append("sat2CtdotN");
        sb.append('=');
        sb.append(((this.sat2CtdotN == null)?"<null>":this.sat2CtdotN));
        sb.append(',');
        sb.append("sat2CtdotRdot");
        sb.append('=');
        sb.append(((this.sat2CtdotRdot == null)?"<null>":this.sat2CtdotRdot));
        sb.append(',');
        sb.append("sat2CtdotTdot");
        sb.append('=');
        sb.append(((this.sat2CtdotTdot == null)?"<null>":this.sat2CtdotTdot));
        sb.append(',');
        sb.append("sat2CndotR");
        sb.append('=');
        sb.append(((this.sat2CndotR == null)?"<null>":this.sat2CndotR));
        sb.append(',');
        sb.append("sat2CndotT");
        sb.append('=');
        sb.append(((this.sat2CndotT == null)?"<null>":this.sat2CndotT));
        sb.append(',');
        sb.append("sat2CndotN");
        sb.append('=');
        sb.append(((this.sat2CndotN == null)?"<null>":this.sat2CndotN));
        sb.append(',');
        sb.append("sat2CndotRdot");
        sb.append('=');
        sb.append(((this.sat2CndotRdot == null)?"<null>":this.sat2CndotRdot));
        sb.append(',');
        sb.append("sat2CndotTdot");
        sb.append('=');
        sb.append(((this.sat2CndotTdot == null)?"<null>":this.sat2CndotTdot));
        sb.append(',');
        sb.append("sat2CndotNdot");
        sb.append('=');
        sb.append(((this.sat2CndotNdot == null)?"<null>":this.sat2CndotNdot));
        sb.append(',');
        sb.append("sat2CdrgR");
        sb.append('=');
        sb.append(((this.sat2CdrgR == null)?"<null>":this.sat2CdrgR));
        sb.append(',');
        sb.append("sat2CdrgT");
        sb.append('=');
        sb.append(((this.sat2CdrgT == null)?"<null>":this.sat2CdrgT));
        sb.append(',');
        sb.append("sat2CdrgN");
        sb.append('=');
        sb.append(((this.sat2CdrgN == null)?"<null>":this.sat2CdrgN));
        sb.append(',');
        sb.append("sat2CdrgRdot");
        sb.append('=');
        sb.append(((this.sat2CdrgRdot == null)?"<null>":this.sat2CdrgRdot));
        sb.append(',');
        sb.append("sat2CdrgTdot");
        sb.append('=');
        sb.append(((this.sat2CdrgTdot == null)?"<null>":this.sat2CdrgTdot));
        sb.append(',');
        sb.append("sat2CdrgNdot");
        sb.append('=');
        sb.append(((this.sat2CdrgNdot == null)?"<null>":this.sat2CdrgNdot));
        sb.append(',');
        sb.append("sat2CdrgDrg");
        sb.append('=');
        sb.append(((this.sat2CdrgDrg == null)?"<null>":this.sat2CdrgDrg));
        sb.append(',');
        sb.append("sat2CsrpR");
        sb.append('=');
        sb.append(((this.sat2CsrpR == null)?"<null>":this.sat2CsrpR));
        sb.append(',');
        sb.append("sat2CsrpT");
        sb.append('=');
        sb.append(((this.sat2CsrpT == null)?"<null>":this.sat2CsrpT));
        sb.append(',');
        sb.append("sat2CsrpN");
        sb.append('=');
        sb.append(((this.sat2CsrpN == null)?"<null>":this.sat2CsrpN));
        sb.append(',');
        sb.append("sat2CsrpRdot");
        sb.append('=');
        sb.append(((this.sat2CsrpRdot == null)?"<null>":this.sat2CsrpRdot));
        sb.append(',');
        sb.append("sat2CsrpTdot");
        sb.append('=');
        sb.append(((this.sat2CsrpTdot == null)?"<null>":this.sat2CsrpTdot));
        sb.append(',');
        sb.append("sat2CsrpNdot");
        sb.append('=');
        sb.append(((this.sat2CsrpNdot == null)?"<null>":this.sat2CsrpNdot));
        sb.append(',');
        sb.append("sat2CsrpDrg");
        sb.append('=');
        sb.append(((this.sat2CsrpDrg == null)?"<null>":this.sat2CsrpDrg));
        sb.append(',');
        sb.append("sat2CsrpSrp");
        sb.append('=');
        sb.append(((this.sat2CsrpSrp == null)?"<null>":this.sat2CsrpSrp));
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
        result = ((result* 31)+((this.sat1CovarianceMethod == null)? 0 :this.sat1CovarianceMethod.hashCode()));
        result = ((result* 31)+((this.sat2CsrpTdot == null)? 0 :this.sat2CsrpTdot.hashCode()));
        result = ((result* 31)+((this.sat2YDot == null)? 0 :this.sat2YDot.hashCode()));
        result = ((result* 31)+((this.sat2ObsAvailable == null)? 0 :this.sat2ObsAvailable.hashCode()));
        result = ((result* 31)+((this.sat1CndotNdot == null)? 0 :this.sat1CndotNdot.hashCode()));
        result = ((result* 31)+((this.collisionProbability == null)? 0 :this.collisionProbability.hashCode()));
        result = ((result* 31)+((this.sat1ObjectDesignator == null)? 0 :this.sat1ObjectDesignator.hashCode()));
        result = ((result* 31)+((this.sat1AtmosphericModel == null)? 0 :this.sat1AtmosphericModel.hashCode()));
        result = ((result* 31)+((this.sat1IntrackThrust == null)? 0 :this.sat1IntrackThrust.hashCode()));
        result = ((result* 31)+((this.sat1CrAreaOverMass == null)? 0 :this.sat1CrAreaOverMass.hashCode()));
        result = ((result* 31)+((this.sat2NBodyPerturbations == null)? 0 :this.sat2NBodyPerturbations.hashCode()));
        result = ((result* 31)+((this.sat2WeightedRms == null)? 0 :this.sat2WeightedRms.hashCode()));
        result = ((result* 31)+((this.sat1ObsAvailable == null)? 0 :this.sat1ObsAvailable.hashCode()));
        result = ((result* 31)+((this.sat1ResidualsAccepted == null)? 0 :this.sat1ResidualsAccepted.hashCode()));
        result = ((result* 31)+((this.sat1CsrpNdot == null)? 0 :this.sat1CsrpNdot.hashCode()));
        result = ((result* 31)+((this.sat1SolarRadPressure == null)? 0 :this.sat1SolarRadPressure.hashCode()));
        result = ((result* 31)+((this.sat2CsrpT == null)? 0 :this.sat2CsrpT.hashCode()));
        result = ((result* 31)+((this.sat1ObsUsed == null)? 0 :this.sat1ObsUsed.hashCode()));
        result = ((result* 31)+((this.sat2CndotNdot == null)? 0 :this.sat2CndotNdot.hashCode()));
        result = ((result* 31)+((this.sat2CsrpR == null)? 0 :this.sat2CsrpR.hashCode()));
        result = ((result* 31)+((this.sat1ObjectName == null)? 0 :this.sat1ObjectName.hashCode()));
        result = ((result* 31)+((this.sat1Sedr == null)? 0 :this.sat1Sedr.hashCode()));
        result = ((result* 31)+((this.sat1CsrpDrg == null)? 0 :this.sat1CsrpDrg.hashCode()));
        result = ((result* 31)+((this.sat1ZDot == null)? 0 :this.sat1ZDot.hashCode()));
        result = ((result* 31)+((this.ccsdsCdmVers == null)? 0 :this.ccsdsCdmVers.hashCode()));
        result = ((result* 31)+((this.missDistance == null)? 0 :this.missDistance.hashCode()));
        result = ((result* 31)+((this.sat1RefFrame == null)? 0 :this.sat1RefFrame.hashCode()));
        result = ((result* 31)+((this.sat1Y == null)? 0 :this.sat1Y.hashCode()));
        result = ((result* 31)+((this.sat1AreaPc == null)? 0 :this.sat1AreaPc.hashCode()));
        result = ((result* 31)+((this.sat1Z == null)? 0 :this.sat1Z.hashCode()));
        result = ((result* 31)+((this.sat1X == null)? 0 :this.sat1X.hashCode()));
        result = ((result* 31)+((this.sat2CsrpN == null)? 0 :this.sat2CsrpN.hashCode()));
        result = ((result* 31)+((this.sat1CrdotN == null)? 0 :this.sat1CrdotN.hashCode()));
        result = ((result* 31)+((this.sat2CsrpSrp == null)? 0 :this.sat2CsrpSrp.hashCode()));
        result = ((result* 31)+((this.sat2TimeLastobStart == null)? 0 :this.sat2TimeLastobStart.hashCode()));
        result = ((result* 31)+((this.sat1NBodyPerturbations == null)? 0 :this.sat1NBodyPerturbations.hashCode()));
        result = ((result* 31)+((this.sat1CdrgRdot == null)? 0 :this.sat1CdrgRdot.hashCode()));
        result = ((result* 31)+((this.sat2CtR == null)? 0 :this.sat2CtR.hashCode()));
        result = ((result* 31)+((this.sat2Object == null)? 0 :this.sat2Object.hashCode()));
        result = ((result* 31)+((this.sat2CtT == null)? 0 :this.sat2CtT.hashCode()));
        result = ((result* 31)+((this.sat2CndotR == null)? 0 :this.sat2CndotR.hashCode()));
        result = ((result* 31)+((this.sat2CndotT == null)? 0 :this.sat2CndotT.hashCode()));
        result = ((result* 31)+((this.sat2ObjectName == null)? 0 :this.sat2ObjectName.hashCode()));
        result = ((result* 31)+((this.relativePositionT == null)? 0 :this.relativePositionT.hashCode()));
        result = ((result* 31)+((this.sat1Object == null)? 0 :this.sat1Object.hashCode()));
        result = ((result* 31)+((this.sat2CndotN == null)? 0 :this.sat2CndotN.hashCode()));
        result = ((result* 31)+((this.relativePositionR == null)? 0 :this.relativePositionR.hashCode()));
        result = ((result* 31)+((this.sat1CsrpTdot == null)? 0 :this.sat1CsrpTdot.hashCode()));
        result = ((result* 31)+((this.relativePositionN == null)? 0 :this.relativePositionN.hashCode()));
        result = ((result* 31)+((this.sat2Z == null)? 0 :this.sat2Z.hashCode()));
        result = ((result* 31)+((this.sat2IntrackThrust == null)? 0 :this.sat2IntrackThrust.hashCode()));
        result = ((result* 31)+((this.sat2X == null)? 0 :this.sat2X.hashCode()));
        result = ((result* 31)+((this.sat2Y == null)? 0 :this.sat2Y.hashCode()));
        result = ((result* 31)+((this.sat1CnR == null)? 0 :this.sat1CnR.hashCode()));
        result = ((result* 31)+((this.sat1CnT == null)? 0 :this.sat1CnT.hashCode()));
        result = ((result* 31)+((this.sat1CtdotTdot == null)? 0 :this.sat1CtdotTdot.hashCode()));
        result = ((result* 31)+((this.sat1CnN == null)? 0 :this.sat1CnN.hashCode()));
        result = ((result* 31)+((this.sat2CsrpNdot == null)? 0 :this.sat2CsrpNdot.hashCode()));
        result = ((result* 31)+((this.sat2AtmosphericModel == null)? 0 :this.sat2AtmosphericModel.hashCode()));
        result = ((result* 31)+((this.sat2CdrgDrg == null)? 0 :this.sat2CdrgDrg.hashCode()));
        result = ((result* 31)+((this.sat2ObsUsed == null)? 0 :this.sat2ObsUsed.hashCode()));
        result = ((result* 31)+((this.sat1CndotR == null)? 0 :this.sat1CndotR.hashCode()));
        result = ((result* 31)+((this.sat1TimeLastobEnd == null)? 0 :this.sat1TimeLastobEnd.hashCode()));
        result = ((result* 31)+((this.sat2CdrgRdot == null)? 0 :this.sat2CdrgRdot.hashCode()));
        result = ((result* 31)+((this.sat1CndotN == null)? 0 :this.sat1CndotN.hashCode()));
        result = ((result* 31)+((this.sat1XDot == null)? 0 :this.sat1XDot.hashCode()));
        result = ((result* 31)+((this.sat1CatalogName == null)? 0 :this.sat1CatalogName.hashCode()));
        result = ((result* 31)+((this.sat1ObjectType == null)? 0 :this.sat1ObjectType.hashCode()));
        result = ((result* 31)+((this.sat2GravityModel == null)? 0 :this.sat2GravityModel.hashCode()));
        result = ((result* 31)+((this.sat2EarthTides == null)? 0 :this.sat2EarthTides.hashCode()));
        result = ((result* 31)+((this.sat1GravityModel == null)? 0 :this.sat1GravityModel.hashCode()));
        result = ((result* 31)+((this.sat2CndotTdot == null)? 0 :this.sat2CndotTdot.hashCode()));
        result = ((result* 31)+((this.sat1WeightedRms == null)? 0 :this.sat1WeightedRms.hashCode()));
        result = ((result* 31)+((this.sat2CrR == null)? 0 :this.sat2CrR.hashCode()));
        result = ((result* 31)+((this.messageFor == null)? 0 :this.messageFor.hashCode()));
        result = ((result* 31)+((this.sat1RecommendedOdSpan == null)? 0 :this.sat1RecommendedOdSpan.hashCode()));
        result = ((result* 31)+((this.sat1CsrpSrp == null)? 0 :this.sat1CsrpSrp.hashCode()));
        result = ((result* 31)+((this.relativeSpeed == null)? 0 :this.relativeSpeed.hashCode()));
        result = ((result* 31)+((this.sat1TimeLastobStart == null)? 0 :this.sat1TimeLastobStart.hashCode()));
        result = ((result* 31)+((this.sat1CndotRdot == null)? 0 :this.sat1CndotRdot.hashCode()));
        result = ((result* 31)+((this.sat2CdrgR == null)? 0 :this.sat2CdrgR.hashCode()));
        result = ((result* 31)+((this.sat2InternationalDesignator == null)? 0 :this.sat2InternationalDesignator.hashCode()));
        result = ((result* 31)+((this.sat2CdrgT == null)? 0 :this.sat2CdrgT.hashCode()));
        result = ((result* 31)+((this.sat1YDot == null)? 0 :this.sat1YDot.hashCode()));
        result = ((result* 31)+((this.sat1CrdotRdot == null)? 0 :this.sat1CrdotRdot.hashCode()));
        result = ((result* 31)+((this.sat1CtdotRdot == null)? 0 :this.sat1CtdotRdot.hashCode()));
        result = ((result* 31)+((this.sat2ResidualsAccepted == null)? 0 :this.sat2ResidualsAccepted.hashCode()));
        result = ((result* 31)+((this.sat2CdAreaOverMass == null)? 0 :this.sat2CdAreaOverMass.hashCode()));
        result = ((result* 31)+((this.sat1ThrustAcceleration == null)? 0 :this.sat1ThrustAcceleration.hashCode()));
        result = ((result* 31)+((this.sat2CtdotN == null)? 0 :this.sat2CtdotN.hashCode()));
        result = ((result* 31)+((this.sat2CatalogName == null)? 0 :this.sat2CatalogName.hashCode()));
        result = ((result* 31)+((this.sat1CtT == null)? 0 :this.sat1CtT.hashCode()));
        result = ((result* 31)+((this.sat2CtdotR == null)? 0 :this.sat2CtdotR.hashCode()));
        result = ((result* 31)+((this.sat1CndotT == null)? 0 :this.sat1CndotT.hashCode()));
        result = ((result* 31)+((this.sat2CdrgN == null)? 0 :this.sat2CdrgN.hashCode()));
        result = ((result* 31)+((this.sat1EarthTides == null)? 0 :this.sat1EarthTides.hashCode()));
        result = ((result* 31)+((this.sat1CtR == null)? 0 :this.sat1CtR.hashCode()));
        result = ((result* 31)+((this.sat1CsrpRdot == null)? 0 :this.sat1CsrpRdot.hashCode()));
        result = ((result* 31)+((this.sat2CtdotT == null)? 0 :this.sat2CtdotT.hashCode()));
        result = ((result* 31)+((this.sat2ObjectType == null)? 0 :this.sat2ObjectType.hashCode()));
        result = ((result* 31)+((this.sat2ObjectDesignator == null)? 0 :this.sat2ObjectDesignator.hashCode()));
        result = ((result* 31)+((this.sat2CdrgTdot == null)? 0 :this.sat2CdrgTdot.hashCode()));
        result = ((result* 31)+((this.sat1InternationalDesignator == null)? 0 :this.sat1InternationalDesignator.hashCode()));
        result = ((result* 31)+((this.sat2CrAreaOverMass == null)? 0 :this.sat2CrAreaOverMass.hashCode()));
        result = ((result* 31)+((this.messageId == null)? 0 :this.messageId.hashCode()));
        result = ((result* 31)+((this.sat2RecommendedOdSpan == null)? 0 :this.sat2RecommendedOdSpan.hashCode()));
        result = ((result* 31)+((this.creationDate == null)? 0 :this.creationDate.hashCode()));
        result = ((result* 31)+((this.sat1CdrgT == null)? 0 :this.sat1CdrgT.hashCode()));
        result = ((result* 31)+((this.sat1CdrgR == null)? 0 :this.sat1CdrgR.hashCode()));
        result = ((result* 31)+((this.sat1CdrgNdot == null)? 0 :this.sat1CdrgNdot.hashCode()));
        result = ((result* 31)+((this.sat2Sedr == null)? 0 :this.sat2Sedr.hashCode()));
        result = ((result* 31)+((this.sat1CdrgN == null)? 0 :this.sat1CdrgN.hashCode()));
        result = ((result* 31)+((this.sat2CrdotRdot == null)? 0 :this.sat2CrdotRdot.hashCode()));
        result = ((result* 31)+((this.sat2CndotRdot == null)? 0 :this.sat2CndotRdot.hashCode()));
        result = ((result* 31)+((this.sat2CovarianceMethod == null)? 0 :this.sat2CovarianceMethod.hashCode()));
        result = ((result* 31)+((this.sat2ThrustAcceleration == null)? 0 :this.sat2ThrustAcceleration.hashCode()));
        result = ((result* 31)+((this.sat2CtdotRdot == null)? 0 :this.sat2CtdotRdot.hashCode()));
        result = ((result* 31)+((this.sat1CndotTdot == null)? 0 :this.sat1CndotTdot.hashCode()));
        result = ((result* 31)+((this.sat2AreaPc == null)? 0 :this.sat2AreaPc.hashCode()));
        result = ((result* 31)+((this.relativeVelocityT == null)? 0 :this.relativeVelocityT.hashCode()));
        result = ((result* 31)+((this.sat2SolarRadPressure == null)? 0 :this.sat2SolarRadPressure.hashCode()));
        result = ((result* 31)+((this.relativeVelocityR == null)? 0 :this.relativeVelocityR.hashCode()));
        result = ((result* 31)+((this.collisionProbabilityMethod == null)? 0 :this.collisionProbabilityMethod.hashCode()));
        result = ((result* 31)+((this.sat2OperatorOrganization == null)? 0 :this.sat2OperatorOrganization.hashCode()));
        result = ((result* 31)+((this.sat1CrdotT == null)? 0 :this.sat1CrdotT.hashCode()));
        result = ((result* 31)+((this.originator == null)? 0 :this.originator.hashCode()));
        result = ((result* 31)+((this.relativeVelocityN == null)? 0 :this.relativeVelocityN.hashCode()));
        result = ((result* 31)+((this.sat1CrdotR == null)? 0 :this.sat1CrdotR.hashCode()));
        result = ((result* 31)+((this.sat1CdrgDrg == null)? 0 :this.sat1CdrgDrg.hashCode()));
        result = ((result* 31)+((this.tca == null)? 0 :this.tca.hashCode()));
        result = ((result* 31)+((this.sat1CrR == null)? 0 :this.sat1CrR.hashCode()));
        result = ((result* 31)+((this.sat2CsrpDrg == null)? 0 :this.sat2CsrpDrg.hashCode()));
        result = ((result* 31)+((this.sat1ActualOdSpan == null)? 0 :this.sat1ActualOdSpan.hashCode()));
        result = ((result* 31)+((this.sat2ZDot == null)? 0 :this.sat2ZDot.hashCode()));
        result = ((result* 31)+((this.sat2ActualOdSpan == null)? 0 :this.sat2ActualOdSpan.hashCode()));
        result = ((result* 31)+((this.sat2CsrpRdot == null)? 0 :this.sat2CsrpRdot.hashCode()));
        result = ((result* 31)+((this.sat2XDot == null)? 0 :this.sat2XDot.hashCode()));
        result = ((result* 31)+((this.sat2Maneuverable == null)? 0 :this.sat2Maneuverable.hashCode()));
        result = ((result* 31)+((this.sat1Maneuverable == null)? 0 :this.sat1Maneuverable.hashCode()));
        result = ((result* 31)+((this.sat2TimeLastobEnd == null)? 0 :this.sat2TimeLastobEnd.hashCode()));
        result = ((result* 31)+((this.sat1CtdotR == null)? 0 :this.sat1CtdotR.hashCode()));
        result = ((result* 31)+((this.sat1CtdotT == null)? 0 :this.sat1CtdotT.hashCode()));
        result = ((result* 31)+((this.sat2RefFrame == null)? 0 :this.sat2RefFrame.hashCode()));
        result = ((result* 31)+((this.sat1CtdotN == null)? 0 :this.sat1CtdotN.hashCode()));
        result = ((result* 31)+((this.sat2CdrgNdot == null)? 0 :this.sat2CdrgNdot.hashCode()));
        result = ((result* 31)+((this.sat2CnT == null)? 0 :this.sat2CnT.hashCode()));
        result = ((result* 31)+((this.sat2CrdotT == null)? 0 :this.sat2CrdotT.hashCode()));
        result = ((result* 31)+((this.sat2CrdotR == null)? 0 :this.sat2CrdotR.hashCode()));
        result = ((result* 31)+((this.sat1OperatorOrganization == null)? 0 :this.sat1OperatorOrganization.hashCode()));
        result = ((result* 31)+((this.sat1CdAreaOverMass == null)? 0 :this.sat1CdAreaOverMass.hashCode()));
        result = ((result* 31)+((this.sat1CsrpN == null)? 0 :this.sat1CsrpN.hashCode()));
        result = ((result* 31)+((this.sat2CnR == null)? 0 :this.sat2CnR.hashCode()));
        result = ((result* 31)+((this.sat2CrdotN == null)? 0 :this.sat2CrdotN.hashCode()));
        result = ((result* 31)+((this.sat2CtdotTdot == null)? 0 :this.sat2CtdotTdot.hashCode()));
        result = ((result* 31)+((this.sat1CdrgTdot == null)? 0 :this.sat1CdrgTdot.hashCode()));
        result = ((result* 31)+((this.sat2CnN == null)? 0 :this.sat2CnN.hashCode()));
        result = ((result* 31)+((this.sat1CsrpT == null)? 0 :this.sat1CsrpT.hashCode()));
        result = ((result* 31)+((this.sat1CsrpR == null)? 0 :this.sat1CsrpR.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CcsdsCdm) == false) {
            return false;
        }
        CcsdsCdm rhs = ((CcsdsCdm) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.sat1CovarianceMethod == rhs.sat1CovarianceMethod)||((this.sat1CovarianceMethod!= null)&&this.sat1CovarianceMethod.equals(rhs.sat1CovarianceMethod)))&&((this.sat2CsrpTdot == rhs.sat2CsrpTdot)||((this.sat2CsrpTdot!= null)&&this.sat2CsrpTdot.equals(rhs.sat2CsrpTdot))))&&((this.sat2YDot == rhs.sat2YDot)||((this.sat2YDot!= null)&&this.sat2YDot.equals(rhs.sat2YDot))))&&((this.sat2ObsAvailable == rhs.sat2ObsAvailable)||((this.sat2ObsAvailable!= null)&&this.sat2ObsAvailable.equals(rhs.sat2ObsAvailable))))&&((this.sat1CndotNdot == rhs.sat1CndotNdot)||((this.sat1CndotNdot!= null)&&this.sat1CndotNdot.equals(rhs.sat1CndotNdot))))&&((this.collisionProbability == rhs.collisionProbability)||((this.collisionProbability!= null)&&this.collisionProbability.equals(rhs.collisionProbability))))&&((this.sat1ObjectDesignator == rhs.sat1ObjectDesignator)||((this.sat1ObjectDesignator!= null)&&this.sat1ObjectDesignator.equals(rhs.sat1ObjectDesignator))))&&((this.sat1AtmosphericModel == rhs.sat1AtmosphericModel)||((this.sat1AtmosphericModel!= null)&&this.sat1AtmosphericModel.equals(rhs.sat1AtmosphericModel))))&&((this.sat1IntrackThrust == rhs.sat1IntrackThrust)||((this.sat1IntrackThrust!= null)&&this.sat1IntrackThrust.equals(rhs.sat1IntrackThrust))))&&((this.sat1CrAreaOverMass == rhs.sat1CrAreaOverMass)||((this.sat1CrAreaOverMass!= null)&&this.sat1CrAreaOverMass.equals(rhs.sat1CrAreaOverMass))))&&((this.sat2NBodyPerturbations == rhs.sat2NBodyPerturbations)||((this.sat2NBodyPerturbations!= null)&&this.sat2NBodyPerturbations.equals(rhs.sat2NBodyPerturbations))))&&((this.sat2WeightedRms == rhs.sat2WeightedRms)||((this.sat2WeightedRms!= null)&&this.sat2WeightedRms.equals(rhs.sat2WeightedRms))))&&((this.sat1ObsAvailable == rhs.sat1ObsAvailable)||((this.sat1ObsAvailable!= null)&&this.sat1ObsAvailable.equals(rhs.sat1ObsAvailable))))&&((this.sat1ResidualsAccepted == rhs.sat1ResidualsAccepted)||((this.sat1ResidualsAccepted!= null)&&this.sat1ResidualsAccepted.equals(rhs.sat1ResidualsAccepted))))&&((this.sat1CsrpNdot == rhs.sat1CsrpNdot)||((this.sat1CsrpNdot!= null)&&this.sat1CsrpNdot.equals(rhs.sat1CsrpNdot))))&&((this.sat1SolarRadPressure == rhs.sat1SolarRadPressure)||((this.sat1SolarRadPressure!= null)&&this.sat1SolarRadPressure.equals(rhs.sat1SolarRadPressure))))&&((this.sat2CsrpT == rhs.sat2CsrpT)||((this.sat2CsrpT!= null)&&this.sat2CsrpT.equals(rhs.sat2CsrpT))))&&((this.sat1ObsUsed == rhs.sat1ObsUsed)||((this.sat1ObsUsed!= null)&&this.sat1ObsUsed.equals(rhs.sat1ObsUsed))))&&((this.sat2CndotNdot == rhs.sat2CndotNdot)||((this.sat2CndotNdot!= null)&&this.sat2CndotNdot.equals(rhs.sat2CndotNdot))))&&((this.sat2CsrpR == rhs.sat2CsrpR)||((this.sat2CsrpR!= null)&&this.sat2CsrpR.equals(rhs.sat2CsrpR))))&&((this.sat1ObjectName == rhs.sat1ObjectName)||((this.sat1ObjectName!= null)&&this.sat1ObjectName.equals(rhs.sat1ObjectName))))&&((this.sat1Sedr == rhs.sat1Sedr)||((this.sat1Sedr!= null)&&this.sat1Sedr.equals(rhs.sat1Sedr))))&&((this.sat1CsrpDrg == rhs.sat1CsrpDrg)||((this.sat1CsrpDrg!= null)&&this.sat1CsrpDrg.equals(rhs.sat1CsrpDrg))))&&((this.sat1ZDot == rhs.sat1ZDot)||((this.sat1ZDot!= null)&&this.sat1ZDot.equals(rhs.sat1ZDot))))&&((this.ccsdsCdmVers == rhs.ccsdsCdmVers)||((this.ccsdsCdmVers!= null)&&this.ccsdsCdmVers.equals(rhs.ccsdsCdmVers))))&&((this.missDistance == rhs.missDistance)||((this.missDistance!= null)&&this.missDistance.equals(rhs.missDistance))))&&((this.sat1RefFrame == rhs.sat1RefFrame)||((this.sat1RefFrame!= null)&&this.sat1RefFrame.equals(rhs.sat1RefFrame))))&&((this.sat1Y == rhs.sat1Y)||((this.sat1Y!= null)&&this.sat1Y.equals(rhs.sat1Y))))&&((this.sat1AreaPc == rhs.sat1AreaPc)||((this.sat1AreaPc!= null)&&this.sat1AreaPc.equals(rhs.sat1AreaPc))))&&((this.sat1Z == rhs.sat1Z)||((this.sat1Z!= null)&&this.sat1Z.equals(rhs.sat1Z))))&&((this.sat1X == rhs.sat1X)||((this.sat1X!= null)&&this.sat1X.equals(rhs.sat1X))))&&((this.sat2CsrpN == rhs.sat2CsrpN)||((this.sat2CsrpN!= null)&&this.sat2CsrpN.equals(rhs.sat2CsrpN))))&&((this.sat1CrdotN == rhs.sat1CrdotN)||((this.sat1CrdotN!= null)&&this.sat1CrdotN.equals(rhs.sat1CrdotN))))&&((this.sat2CsrpSrp == rhs.sat2CsrpSrp)||((this.sat2CsrpSrp!= null)&&this.sat2CsrpSrp.equals(rhs.sat2CsrpSrp))))&&((this.sat2TimeLastobStart == rhs.sat2TimeLastobStart)||((this.sat2TimeLastobStart!= null)&&this.sat2TimeLastobStart.equals(rhs.sat2TimeLastobStart))))&&((this.sat1NBodyPerturbations == rhs.sat1NBodyPerturbations)||((this.sat1NBodyPerturbations!= null)&&this.sat1NBodyPerturbations.equals(rhs.sat1NBodyPerturbations))))&&((this.sat1CdrgRdot == rhs.sat1CdrgRdot)||((this.sat1CdrgRdot!= null)&&this.sat1CdrgRdot.equals(rhs.sat1CdrgRdot))))&&((this.sat2CtR == rhs.sat2CtR)||((this.sat2CtR!= null)&&this.sat2CtR.equals(rhs.sat2CtR))))&&((this.sat2Object == rhs.sat2Object)||((this.sat2Object!= null)&&this.sat2Object.equals(rhs.sat2Object))))&&((this.sat2CtT == rhs.sat2CtT)||((this.sat2CtT!= null)&&this.sat2CtT.equals(rhs.sat2CtT))))&&((this.sat2CndotR == rhs.sat2CndotR)||((this.sat2CndotR!= null)&&this.sat2CndotR.equals(rhs.sat2CndotR))))&&((this.sat2CndotT == rhs.sat2CndotT)||((this.sat2CndotT!= null)&&this.sat2CndotT.equals(rhs.sat2CndotT))))&&((this.sat2ObjectName == rhs.sat2ObjectName)||((this.sat2ObjectName!= null)&&this.sat2ObjectName.equals(rhs.sat2ObjectName))))&&((this.relativePositionT == rhs.relativePositionT)||((this.relativePositionT!= null)&&this.relativePositionT.equals(rhs.relativePositionT))))&&((this.sat1Object == rhs.sat1Object)||((this.sat1Object!= null)&&this.sat1Object.equals(rhs.sat1Object))))&&((this.sat2CndotN == rhs.sat2CndotN)||((this.sat2CndotN!= null)&&this.sat2CndotN.equals(rhs.sat2CndotN))))&&((this.relativePositionR == rhs.relativePositionR)||((this.relativePositionR!= null)&&this.relativePositionR.equals(rhs.relativePositionR))))&&((this.sat1CsrpTdot == rhs.sat1CsrpTdot)||((this.sat1CsrpTdot!= null)&&this.sat1CsrpTdot.equals(rhs.sat1CsrpTdot))))&&((this.relativePositionN == rhs.relativePositionN)||((this.relativePositionN!= null)&&this.relativePositionN.equals(rhs.relativePositionN))))&&((this.sat2Z == rhs.sat2Z)||((this.sat2Z!= null)&&this.sat2Z.equals(rhs.sat2Z))))&&((this.sat2IntrackThrust == rhs.sat2IntrackThrust)||((this.sat2IntrackThrust!= null)&&this.sat2IntrackThrust.equals(rhs.sat2IntrackThrust))))&&((this.sat2X == rhs.sat2X)||((this.sat2X!= null)&&this.sat2X.equals(rhs.sat2X))))&&((this.sat2Y == rhs.sat2Y)||((this.sat2Y!= null)&&this.sat2Y.equals(rhs.sat2Y))))&&((this.sat1CnR == rhs.sat1CnR)||((this.sat1CnR!= null)&&this.sat1CnR.equals(rhs.sat1CnR))))&&((this.sat1CnT == rhs.sat1CnT)||((this.sat1CnT!= null)&&this.sat1CnT.equals(rhs.sat1CnT))))&&((this.sat1CtdotTdot == rhs.sat1CtdotTdot)||((this.sat1CtdotTdot!= null)&&this.sat1CtdotTdot.equals(rhs.sat1CtdotTdot))))&&((this.sat1CnN == rhs.sat1CnN)||((this.sat1CnN!= null)&&this.sat1CnN.equals(rhs.sat1CnN))))&&((this.sat2CsrpNdot == rhs.sat2CsrpNdot)||((this.sat2CsrpNdot!= null)&&this.sat2CsrpNdot.equals(rhs.sat2CsrpNdot))))&&((this.sat2AtmosphericModel == rhs.sat2AtmosphericModel)||((this.sat2AtmosphericModel!= null)&&this.sat2AtmosphericModel.equals(rhs.sat2AtmosphericModel))))&&((this.sat2CdrgDrg == rhs.sat2CdrgDrg)||((this.sat2CdrgDrg!= null)&&this.sat2CdrgDrg.equals(rhs.sat2CdrgDrg))))&&((this.sat2ObsUsed == rhs.sat2ObsUsed)||((this.sat2ObsUsed!= null)&&this.sat2ObsUsed.equals(rhs.sat2ObsUsed))))&&((this.sat1CndotR == rhs.sat1CndotR)||((this.sat1CndotR!= null)&&this.sat1CndotR.equals(rhs.sat1CndotR))))&&((this.sat1TimeLastobEnd == rhs.sat1TimeLastobEnd)||((this.sat1TimeLastobEnd!= null)&&this.sat1TimeLastobEnd.equals(rhs.sat1TimeLastobEnd))))&&((this.sat2CdrgRdot == rhs.sat2CdrgRdot)||((this.sat2CdrgRdot!= null)&&this.sat2CdrgRdot.equals(rhs.sat2CdrgRdot))))&&((this.sat1CndotN == rhs.sat1CndotN)||((this.sat1CndotN!= null)&&this.sat1CndotN.equals(rhs.sat1CndotN))))&&((this.sat1XDot == rhs.sat1XDot)||((this.sat1XDot!= null)&&this.sat1XDot.equals(rhs.sat1XDot))))&&((this.sat1CatalogName == rhs.sat1CatalogName)||((this.sat1CatalogName!= null)&&this.sat1CatalogName.equals(rhs.sat1CatalogName))))&&((this.sat1ObjectType == rhs.sat1ObjectType)||((this.sat1ObjectType!= null)&&this.sat1ObjectType.equals(rhs.sat1ObjectType))))&&((this.sat2GravityModel == rhs.sat2GravityModel)||((this.sat2GravityModel!= null)&&this.sat2GravityModel.equals(rhs.sat2GravityModel))))&&((this.sat2EarthTides == rhs.sat2EarthTides)||((this.sat2EarthTides!= null)&&this.sat2EarthTides.equals(rhs.sat2EarthTides))))&&((this.sat1GravityModel == rhs.sat1GravityModel)||((this.sat1GravityModel!= null)&&this.sat1GravityModel.equals(rhs.sat1GravityModel))))&&((this.sat2CndotTdot == rhs.sat2CndotTdot)||((this.sat2CndotTdot!= null)&&this.sat2CndotTdot.equals(rhs.sat2CndotTdot))))&&((this.sat1WeightedRms == rhs.sat1WeightedRms)||((this.sat1WeightedRms!= null)&&this.sat1WeightedRms.equals(rhs.sat1WeightedRms))))&&((this.sat2CrR == rhs.sat2CrR)||((this.sat2CrR!= null)&&this.sat2CrR.equals(rhs.sat2CrR))))&&((this.messageFor == rhs.messageFor)||((this.messageFor!= null)&&this.messageFor.equals(rhs.messageFor))))&&((this.sat1RecommendedOdSpan == rhs.sat1RecommendedOdSpan)||((this.sat1RecommendedOdSpan!= null)&&this.sat1RecommendedOdSpan.equals(rhs.sat1RecommendedOdSpan))))&&((this.sat1CsrpSrp == rhs.sat1CsrpSrp)||((this.sat1CsrpSrp!= null)&&this.sat1CsrpSrp.equals(rhs.sat1CsrpSrp))))&&((this.relativeSpeed == rhs.relativeSpeed)||((this.relativeSpeed!= null)&&this.relativeSpeed.equals(rhs.relativeSpeed))))&&((this.sat1TimeLastobStart == rhs.sat1TimeLastobStart)||((this.sat1TimeLastobStart!= null)&&this.sat1TimeLastobStart.equals(rhs.sat1TimeLastobStart))))&&((this.sat1CndotRdot == rhs.sat1CndotRdot)||((this.sat1CndotRdot!= null)&&this.sat1CndotRdot.equals(rhs.sat1CndotRdot))))&&((this.sat2CdrgR == rhs.sat2CdrgR)||((this.sat2CdrgR!= null)&&this.sat2CdrgR.equals(rhs.sat2CdrgR))))&&((this.sat2InternationalDesignator == rhs.sat2InternationalDesignator)||((this.sat2InternationalDesignator!= null)&&this.sat2InternationalDesignator.equals(rhs.sat2InternationalDesignator))))&&((this.sat2CdrgT == rhs.sat2CdrgT)||((this.sat2CdrgT!= null)&&this.sat2CdrgT.equals(rhs.sat2CdrgT))))&&((this.sat1YDot == rhs.sat1YDot)||((this.sat1YDot!= null)&&this.sat1YDot.equals(rhs.sat1YDot))))&&((this.sat1CrdotRdot == rhs.sat1CrdotRdot)||((this.sat1CrdotRdot!= null)&&this.sat1CrdotRdot.equals(rhs.sat1CrdotRdot))))&&((this.sat1CtdotRdot == rhs.sat1CtdotRdot)||((this.sat1CtdotRdot!= null)&&this.sat1CtdotRdot.equals(rhs.sat1CtdotRdot))))&&((this.sat2ResidualsAccepted == rhs.sat2ResidualsAccepted)||((this.sat2ResidualsAccepted!= null)&&this.sat2ResidualsAccepted.equals(rhs.sat2ResidualsAccepted))))&&((this.sat2CdAreaOverMass == rhs.sat2CdAreaOverMass)||((this.sat2CdAreaOverMass!= null)&&this.sat2CdAreaOverMass.equals(rhs.sat2CdAreaOverMass))))&&((this.sat1ThrustAcceleration == rhs.sat1ThrustAcceleration)||((this.sat1ThrustAcceleration!= null)&&this.sat1ThrustAcceleration.equals(rhs.sat1ThrustAcceleration))))&&((this.sat2CtdotN == rhs.sat2CtdotN)||((this.sat2CtdotN!= null)&&this.sat2CtdotN.equals(rhs.sat2CtdotN))))&&((this.sat2CatalogName == rhs.sat2CatalogName)||((this.sat2CatalogName!= null)&&this.sat2CatalogName.equals(rhs.sat2CatalogName))))&&((this.sat1CtT == rhs.sat1CtT)||((this.sat1CtT!= null)&&this.sat1CtT.equals(rhs.sat1CtT))))&&((this.sat2CtdotR == rhs.sat2CtdotR)||((this.sat2CtdotR!= null)&&this.sat2CtdotR.equals(rhs.sat2CtdotR))))&&((this.sat1CndotT == rhs.sat1CndotT)||((this.sat1CndotT!= null)&&this.sat1CndotT.equals(rhs.sat1CndotT))))&&((this.sat2CdrgN == rhs.sat2CdrgN)||((this.sat2CdrgN!= null)&&this.sat2CdrgN.equals(rhs.sat2CdrgN))))&&((this.sat1EarthTides == rhs.sat1EarthTides)||((this.sat1EarthTides!= null)&&this.sat1EarthTides.equals(rhs.sat1EarthTides))))&&((this.sat1CtR == rhs.sat1CtR)||((this.sat1CtR!= null)&&this.sat1CtR.equals(rhs.sat1CtR))))&&((this.sat1CsrpRdot == rhs.sat1CsrpRdot)||((this.sat1CsrpRdot!= null)&&this.sat1CsrpRdot.equals(rhs.sat1CsrpRdot))))&&((this.sat2CtdotT == rhs.sat2CtdotT)||((this.sat2CtdotT!= null)&&this.sat2CtdotT.equals(rhs.sat2CtdotT))))&&((this.sat2ObjectType == rhs.sat2ObjectType)||((this.sat2ObjectType!= null)&&this.sat2ObjectType.equals(rhs.sat2ObjectType))))&&((this.sat2ObjectDesignator == rhs.sat2ObjectDesignator)||((this.sat2ObjectDesignator!= null)&&this.sat2ObjectDesignator.equals(rhs.sat2ObjectDesignator))))&&((this.sat2CdrgTdot == rhs.sat2CdrgTdot)||((this.sat2CdrgTdot!= null)&&this.sat2CdrgTdot.equals(rhs.sat2CdrgTdot))))&&((this.sat1InternationalDesignator == rhs.sat1InternationalDesignator)||((this.sat1InternationalDesignator!= null)&&this.sat1InternationalDesignator.equals(rhs.sat1InternationalDesignator))))&&((this.sat2CrAreaOverMass == rhs.sat2CrAreaOverMass)||((this.sat2CrAreaOverMass!= null)&&this.sat2CrAreaOverMass.equals(rhs.sat2CrAreaOverMass))))&&((this.messageId == rhs.messageId)||((this.messageId!= null)&&this.messageId.equals(rhs.messageId))))&&((this.sat2RecommendedOdSpan == rhs.sat2RecommendedOdSpan)||((this.sat2RecommendedOdSpan!= null)&&this.sat2RecommendedOdSpan.equals(rhs.sat2RecommendedOdSpan))))&&((this.creationDate == rhs.creationDate)||((this.creationDate!= null)&&this.creationDate.equals(rhs.creationDate))))&&((this.sat1CdrgT == rhs.sat1CdrgT)||((this.sat1CdrgT!= null)&&this.sat1CdrgT.equals(rhs.sat1CdrgT))))&&((this.sat1CdrgR == rhs.sat1CdrgR)||((this.sat1CdrgR!= null)&&this.sat1CdrgR.equals(rhs.sat1CdrgR))))&&((this.sat1CdrgNdot == rhs.sat1CdrgNdot)||((this.sat1CdrgNdot!= null)&&this.sat1CdrgNdot.equals(rhs.sat1CdrgNdot))))&&((this.sat2Sedr == rhs.sat2Sedr)||((this.sat2Sedr!= null)&&this.sat2Sedr.equals(rhs.sat2Sedr))))&&((this.sat1CdrgN == rhs.sat1CdrgN)||((this.sat1CdrgN!= null)&&this.sat1CdrgN.equals(rhs.sat1CdrgN))))&&((this.sat2CrdotRdot == rhs.sat2CrdotRdot)||((this.sat2CrdotRdot!= null)&&this.sat2CrdotRdot.equals(rhs.sat2CrdotRdot))))&&((this.sat2CndotRdot == rhs.sat2CndotRdot)||((this.sat2CndotRdot!= null)&&this.sat2CndotRdot.equals(rhs.sat2CndotRdot))))&&((this.sat2CovarianceMethod == rhs.sat2CovarianceMethod)||((this.sat2CovarianceMethod!= null)&&this.sat2CovarianceMethod.equals(rhs.sat2CovarianceMethod))))&&((this.sat2ThrustAcceleration == rhs.sat2ThrustAcceleration)||((this.sat2ThrustAcceleration!= null)&&this.sat2ThrustAcceleration.equals(rhs.sat2ThrustAcceleration))))&&((this.sat2CtdotRdot == rhs.sat2CtdotRdot)||((this.sat2CtdotRdot!= null)&&this.sat2CtdotRdot.equals(rhs.sat2CtdotRdot))))&&((this.sat1CndotTdot == rhs.sat1CndotTdot)||((this.sat1CndotTdot!= null)&&this.sat1CndotTdot.equals(rhs.sat1CndotTdot))))&&((this.sat2AreaPc == rhs.sat2AreaPc)||((this.sat2AreaPc!= null)&&this.sat2AreaPc.equals(rhs.sat2AreaPc))))&&((this.relativeVelocityT == rhs.relativeVelocityT)||((this.relativeVelocityT!= null)&&this.relativeVelocityT.equals(rhs.relativeVelocityT))))&&((this.sat2SolarRadPressure == rhs.sat2SolarRadPressure)||((this.sat2SolarRadPressure!= null)&&this.sat2SolarRadPressure.equals(rhs.sat2SolarRadPressure))))&&((this.relativeVelocityR == rhs.relativeVelocityR)||((this.relativeVelocityR!= null)&&this.relativeVelocityR.equals(rhs.relativeVelocityR))))&&((this.collisionProbabilityMethod == rhs.collisionProbabilityMethod)||((this.collisionProbabilityMethod!= null)&&this.collisionProbabilityMethod.equals(rhs.collisionProbabilityMethod))))&&((this.sat2OperatorOrganization == rhs.sat2OperatorOrganization)||((this.sat2OperatorOrganization!= null)&&this.sat2OperatorOrganization.equals(rhs.sat2OperatorOrganization))))&&((this.sat1CrdotT == rhs.sat1CrdotT)||((this.sat1CrdotT!= null)&&this.sat1CrdotT.equals(rhs.sat1CrdotT))))&&((this.originator == rhs.originator)||((this.originator!= null)&&this.originator.equals(rhs.originator))))&&((this.relativeVelocityN == rhs.relativeVelocityN)||((this.relativeVelocityN!= null)&&this.relativeVelocityN.equals(rhs.relativeVelocityN))))&&((this.sat1CrdotR == rhs.sat1CrdotR)||((this.sat1CrdotR!= null)&&this.sat1CrdotR.equals(rhs.sat1CrdotR))))&&((this.sat1CdrgDrg == rhs.sat1CdrgDrg)||((this.sat1CdrgDrg!= null)&&this.sat1CdrgDrg.equals(rhs.sat1CdrgDrg))))&&((this.tca == rhs.tca)||((this.tca!= null)&&this.tca.equals(rhs.tca))))&&((this.sat1CrR == rhs.sat1CrR)||((this.sat1CrR!= null)&&this.sat1CrR.equals(rhs.sat1CrR))))&&((this.sat2CsrpDrg == rhs.sat2CsrpDrg)||((this.sat2CsrpDrg!= null)&&this.sat2CsrpDrg.equals(rhs.sat2CsrpDrg))))&&((this.sat1ActualOdSpan == rhs.sat1ActualOdSpan)||((this.sat1ActualOdSpan!= null)&&this.sat1ActualOdSpan.equals(rhs.sat1ActualOdSpan))))&&((this.sat2ZDot == rhs.sat2ZDot)||((this.sat2ZDot!= null)&&this.sat2ZDot.equals(rhs.sat2ZDot))))&&((this.sat2ActualOdSpan == rhs.sat2ActualOdSpan)||((this.sat2ActualOdSpan!= null)&&this.sat2ActualOdSpan.equals(rhs.sat2ActualOdSpan))))&&((this.sat2CsrpRdot == rhs.sat2CsrpRdot)||((this.sat2CsrpRdot!= null)&&this.sat2CsrpRdot.equals(rhs.sat2CsrpRdot))))&&((this.sat2XDot == rhs.sat2XDot)||((this.sat2XDot!= null)&&this.sat2XDot.equals(rhs.sat2XDot))))&&((this.sat2Maneuverable == rhs.sat2Maneuverable)||((this.sat2Maneuverable!= null)&&this.sat2Maneuverable.equals(rhs.sat2Maneuverable))))&&((this.sat1Maneuverable == rhs.sat1Maneuverable)||((this.sat1Maneuverable!= null)&&this.sat1Maneuverable.equals(rhs.sat1Maneuverable))))&&((this.sat2TimeLastobEnd == rhs.sat2TimeLastobEnd)||((this.sat2TimeLastobEnd!= null)&&this.sat2TimeLastobEnd.equals(rhs.sat2TimeLastobEnd))))&&((this.sat1CtdotR == rhs.sat1CtdotR)||((this.sat1CtdotR!= null)&&this.sat1CtdotR.equals(rhs.sat1CtdotR))))&&((this.sat1CtdotT == rhs.sat1CtdotT)||((this.sat1CtdotT!= null)&&this.sat1CtdotT.equals(rhs.sat1CtdotT))))&&((this.sat2RefFrame == rhs.sat2RefFrame)||((this.sat2RefFrame!= null)&&this.sat2RefFrame.equals(rhs.sat2RefFrame))))&&((this.sat1CtdotN == rhs.sat1CtdotN)||((this.sat1CtdotN!= null)&&this.sat1CtdotN.equals(rhs.sat1CtdotN))))&&((this.sat2CdrgNdot == rhs.sat2CdrgNdot)||((this.sat2CdrgNdot!= null)&&this.sat2CdrgNdot.equals(rhs.sat2CdrgNdot))))&&((this.sat2CnT == rhs.sat2CnT)||((this.sat2CnT!= null)&&this.sat2CnT.equals(rhs.sat2CnT))))&&((this.sat2CrdotT == rhs.sat2CrdotT)||((this.sat2CrdotT!= null)&&this.sat2CrdotT.equals(rhs.sat2CrdotT))))&&((this.sat2CrdotR == rhs.sat2CrdotR)||((this.sat2CrdotR!= null)&&this.sat2CrdotR.equals(rhs.sat2CrdotR))))&&((this.sat1OperatorOrganization == rhs.sat1OperatorOrganization)||((this.sat1OperatorOrganization!= null)&&this.sat1OperatorOrganization.equals(rhs.sat1OperatorOrganization))))&&((this.sat1CdAreaOverMass == rhs.sat1CdAreaOverMass)||((this.sat1CdAreaOverMass!= null)&&this.sat1CdAreaOverMass.equals(rhs.sat1CdAreaOverMass))))&&((this.sat1CsrpN == rhs.sat1CsrpN)||((this.sat1CsrpN!= null)&&this.sat1CsrpN.equals(rhs.sat1CsrpN))))&&((this.sat2CnR == rhs.sat2CnR)||((this.sat2CnR!= null)&&this.sat2CnR.equals(rhs.sat2CnR))))&&((this.sat2CrdotN == rhs.sat2CrdotN)||((this.sat2CrdotN!= null)&&this.sat2CrdotN.equals(rhs.sat2CrdotN))))&&((this.sat2CtdotTdot == rhs.sat2CtdotTdot)||((this.sat2CtdotTdot!= null)&&this.sat2CtdotTdot.equals(rhs.sat2CtdotTdot))))&&((this.sat1CdrgTdot == rhs.sat1CdrgTdot)||((this.sat1CdrgTdot!= null)&&this.sat1CdrgTdot.equals(rhs.sat1CdrgTdot))))&&((this.sat2CnN == rhs.sat2CnN)||((this.sat2CnN!= null)&&this.sat2CnN.equals(rhs.sat2CnN))))&&((this.sat1CsrpT == rhs.sat1CsrpT)||((this.sat1CsrpT!= null)&&this.sat1CsrpT.equals(rhs.sat1CsrpT))))&&((this.sat1CsrpR == rhs.sat1CsrpR)||((this.sat1CsrpR!= null)&&this.sat1CsrpR.equals(rhs.sat1CsrpR))));
    }

}
