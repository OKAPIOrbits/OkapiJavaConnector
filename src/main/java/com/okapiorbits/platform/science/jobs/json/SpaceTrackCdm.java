
package com.okapiorbits.platform.science.jobs.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SpaceTrackCdm
 * <p>
 * A CDM - with adaptions to what SpaceTrack produces
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CONSTELLATION",
    "CDM_ID",
    "FILENAME",
    "INSERT_EPOCH",
    "CCSDS_CDM_VERS",
    "CREATION_DATE",
    "CREATION_DATE_FRACTION",
    "ORIGINATOR",
    "MESSAGE_FOR",
    "MESSAGE_ID",
    "COMMENT_EMERGENCY_REPORTABLE",
    "TCA",
    "TCA_FRACTION",
    "MISS_DISTANCE",
    "MISS_DISTANCE_UNIT",
    "RELATIVE_SPEED",
    "RELATIVE_SPEED_UNIT",
    "RELATIVE_POSITION_R",
    "RELATIVE_POSITION_R_UNIT",
    "RELATIVE_POSITION_T",
    "RELATIVE_POSITION_T_UNIT",
    "RELATIVE_POSITION_N",
    "RELATIVE_POSITION_N_UNIT",
    "RELATIVE_VELOCITY_R",
    "RELATIVE_VELOCITY_R_UNIT",
    "RELATIVE_VELOCITY_T",
    "RELATIVE_VELOCITY_T_UNIT",
    "RELATIVE_VELOCITY_N",
    "RELATIVE_VELOCITY_N_UNIT",
    "COMMENT_SCREENING_OPTION",
    "COLLISION_PROBABILITY",
    "COLLISION_PROBABILITY_METHOD",
    "SAT1_COMMENT_SCREENING_DATA_SOURCE",
    "SAT1_OBJECT",
    "SAT1_OBJECT_DESIGNATOR",
    "SAT1_CATALOG_NAME",
    "SAT1_OBJECT_NAME",
    "SAT1_INTERNATIONAL_DESIGNATOR",
    "SAT1_OBJECT_TYPE",
    "SAT1_OPERATOR_CONTACT_POSITION",
    "SAT1_OPERATOR_ORGANIZATION",
    "SAT1_OPERATOR_PHONE",
    "SAT1_OPERATOR_EMAIL",
    "SAT1_EPHEMERIS_NAME",
    "SAT1_COVARIANCE_METHOD",
    "SAT1_MANEUVERABLE",
    "SAT1_REF_FRAME",
    "SAT1_GRAVITY_MODEL",
    "SAT1_ATMOSPHERIC_MODEL",
    "SAT1_N_BODY_PERTURBATIONS",
    "SAT1_SOLAR_RAD_PRESSURE",
    "SAT1_EARTH_TIDES",
    "SAT1_INTRACK_THRUST",
    "SAT1_COMMENT_COVARIANCE_SCALE_FACTOR",
    "SAT1_COMMENT_EXCLUSION_VOLUME_RADIUS",
    "SAT1_TIME_LASTOB_START",
    "SAT1_TIME_LASTOB_START_FRACTION",
    "SAT1_TIME_LASTOB_END",
    "SAT1_TIME_LASTOB_END_FRACTION",
    "SAT1_RECOMMENDED_OD_SPAN",
    "SAT1_RECOMMENDED_OD_SPAN_UNIT",
    "SAT1_ACTUAL_OD_SPAN",
    "SAT1_ACTUAL_OD_SPAN_UNIT",
    "SAT1_OBS_AVAILABLE",
    "SAT1_OBS_USED",
    "SAT1_RESIDUALS_ACCEPTED",
    "SAT1_RESIDUALS_ACCEPTED_UNIT",
    "SAT1_WEIGHTED_RMS",
    "SAT1_COMMENT_APOGEE",
    "SAT1_COMMENT_PERIGEE",
    "SAT1_COMMENT_INCLINATION",
    "SAT1_COMMENT_OPERATOR_HARD_BODY_RADIUS",
    "SAT1_AREA_PC",
    "SAT1_AREA_PC_UNIT",
    "SAT1_CD_AREA_OVER_MASS",
    "SAT1_CD_AREA_OVER_MASS_UNIT",
    "SAT1_CR_AREA_OVER_MASS",
    "SAT1_CR_AREA_OVER_MASS_UNIT",
    "SAT1_THRUST_ACCELERATION",
    "SAT1_THRUST_ACCELERATION_UNIT",
    "SAT1_SEDR",
    "SAT1_SEDR_UNIT",
    "SAT1_X",
    "SAT1_X_UNIT",
    "SAT1_Y",
    "SAT1_Y_UNIT",
    "SAT1_Z",
    "SAT1_Z_UNIT",
    "SAT1_X_DOT",
    "SAT1_X_DOT_UNIT",
    "SAT1_Y_DOT",
    "SAT1_Y_DOT_UNIT",
    "SAT1_Z_DOT",
    "SAT1_Z_DOT_UNIT",
    "SAT1_COMMENT_DCP_DENSITY_FORECAST_UNCERTAINTY",
    "SAT1_COMMENT_DCP_SENSITIVITY_VECTOR_POSITION",
    "SAT1_COMMENT_DCP_SENSITIVITY_VECTOR_VELOCITY",
    "SAT1_CR_R",
    "SAT1_CR_R_UNIT",
    "SAT1_CT_R",
    "SAT1_CT_R_UNIT",
    "SAT1_CT_T",
    "SAT1_CT_T_UNIT",
    "SAT1_CN_R",
    "SAT1_CN_R_UNIT",
    "SAT1_CN_T",
    "SAT1_CN_T_UNIT",
    "SAT1_CN_N",
    "SAT1_CN_N_UNIT",
    "SAT1_CRDOT_R",
    "SAT1_CRDOT_R_UNIT",
    "SAT1_CRDOT_T",
    "SAT1_CRDOT_T_UNIT",
    "SAT1_CRDOT_N",
    "SAT1_CRDOT_N_UNIT",
    "SAT1_CRDOT_RDOT",
    "SAT1_CRDOT_RDOT_UNIT",
    "SAT1_CTDOT_R",
    "SAT1_CTDOT_R_UNIT",
    "SAT1_CTDOT_T",
    "SAT1_CTDOT_T_UNIT",
    "SAT1_CTDOT_N",
    "SAT1_CTDOT_N_UNIT",
    "SAT1_CTDOT_RDOT",
    "SAT1_CTDOT_RDOT_UNIT",
    "SAT1_CTDOT_TDOT",
    "SAT1_CTDOT_TDOT_UNIT",
    "SAT1_CNDOT_R",
    "SAT1_CNDOT_R_UNIT",
    "SAT1_CNDOT_T",
    "SAT1_CNDOT_T_UNIT",
    "SAT1_CNDOT_N",
    "SAT1_CNDOT_N_UNIT",
    "SAT1_CNDOT_RDOT",
    "SAT1_CNDOT_RDOT_UNIT",
    "SAT1_CNDOT_TDOT",
    "SAT1_CNDOT_TDOT_UNIT",
    "SAT1_CNDOT_NDOT",
    "SAT1_CNDOT_NDOT_UNIT",
    "SAT1_CDRG_R",
    "SAT1_CDRG_R_UNIT",
    "SAT1_CDRG_T",
    "SAT1_CDRG_T_UNIT",
    "SAT1_CDRG_N",
    "SAT1_CDRG_N_UNIT",
    "SAT1_CDRG_RDOT",
    "SAT1_CDRG_RDOT_UNIT",
    "SAT1_CDRG_TDOT",
    "SAT1_CDRG_TDOT_UNIT",
    "SAT1_CDRG_NDOT",
    "SAT1_CDRG_NDOT_UNIT",
    "SAT1_CDRG_DRG",
    "SAT1_CDRG_DRG_UNIT",
    "SAT1_CSRP_R",
    "SAT1_CSRP_R_UNIT",
    "SAT1_CSRP_T",
    "SAT1_CSRP_T_UNIT",
    "SAT1_CSRP_N",
    "SAT1_CSRP_N_UNIT",
    "SAT1_CSRP_RDOT",
    "SAT1_CSRP_RDOT_UNIT",
    "SAT1_CSRP_TDOT",
    "SAT1_CSRP_TDOT_UNIT",
    "SAT1_CSRP_NDOT",
    "SAT1_CSRP_NDOT_UNIT",
    "SAT1_CSRP_DRG",
    "SAT1_CSRP_DRG_UNIT",
    "SAT1_CSRP_SRP",
    "SAT1_CSRP_SRP_UNIT",
    "SAT2_COMMENT_SCREENING_DATA_SOURCE",
    "SAT2_OBJECT",
    "SAT2_OBJECT_DESIGNATOR",
    "SAT2_CATALOG_NAME",
    "SAT2_OBJECT_NAME",
    "SAT2_INTERNATIONAL_DESIGNATOR",
    "SAT2_OBJECT_TYPE",
    "SAT2_OPERATOR_CONTACT_POSITION",
    "SAT2_OPERATOR_ORGANIZATION",
    "SAT2_OPERATOR_PHONE",
    "SAT2_OPERATOR_EMAIL",
    "SAT2_EPHEMERIS_NAME",
    "SAT2_COVARIANCE_METHOD",
    "SAT2_MANEUVERABLE",
    "SAT2_REF_FRAME",
    "SAT2_GRAVITY_MODEL",
    "SAT2_ATMOSPHERIC_MODEL",
    "SAT2_N_BODY_PERTURBATIONS",
    "SAT2_SOLAR_RAD_PRESSURE",
    "SAT2_EARTH_TIDES",
    "SAT2_INTRACK_THRUST",
    "SAT2_COMMENT_COVARIANCE_SCALE_FACTOR",
    "SAT2_COMMENT_EXCLUSION_VOLUME_RADIUS",
    "SAT2_TIME_LASTOB_START",
    "SAT2_TIME_LASTOB_START_FRACTION",
    "SAT2_TIME_LASTOB_END",
    "SAT2_TIME_LASTOB_END_FRACTION",
    "SAT2_RECOMMENDED_OD_SPAN",
    "SAT2_RECOMMENDED_OD_SPAN_UNIT",
    "SAT2_ACTUAL_OD_SPAN",
    "SAT2_ACTUAL_OD_SPAN_UNIT",
    "SAT2_OBS_AVAILABLE",
    "SAT2_OBS_USED",
    "SAT2_RESIDUALS_ACCEPTED",
    "SAT2_RESIDUALS_ACCEPTED_UNIT",
    "SAT2_WEIGHTED_RMS",
    "SAT2_COMMENT_APOGEE",
    "SAT2_COMMENT_PERIGEE",
    "SAT2_COMMENT_INCLINATION",
    "SAT2_COMMENT_OPERATOR_HARD_BODY_RADIUS",
    "SAT2_AREA_PC",
    "SAT2_AREA_PC_UNIT",
    "SAT2_CD_AREA_OVER_MASS",
    "SAT2_CD_AREA_OVER_MASS_UNIT",
    "SAT2_CR_AREA_OVER_MASS",
    "SAT2_CR_AREA_OVER_MASS_UNIT",
    "SAT2_THRUST_ACCELERATION",
    "SAT2_THRUST_ACCELERATION_UNIT",
    "SAT2_SEDR",
    "SAT2_SEDR_UNIT",
    "SAT2_X",
    "SAT2_X_UNIT",
    "SAT2_Y",
    "SAT2_Y_UNIT",
    "SAT2_Z",
    "SAT2_Z_UNIT",
    "SAT2_X_DOT",
    "SAT2_X_DOT_UNIT",
    "SAT2_Y_DOT",
    "SAT2_Y_DOT_UNIT",
    "SAT2_Z_DOT",
    "SAT2_Z_DOT_UNIT",
    "SAT2_COMMENT_DCP_DENSITY_FORECAST_UNCERTAINTY",
    "SAT2_COMMENT_DCP_SENSITIVITY_VECTOR_POSITION",
    "SAT2_COMMENT_DCP_SENSITIVITY_VECTOR_VELOCITY",
    "SAT2_CR_R",
    "SAT2_CR_R_UNIT",
    "SAT2_CT_R",
    "SAT2_CT_R_UNIT",
    "SAT2_CT_T",
    "SAT2_CT_T_UNIT",
    "SAT2_CN_R",
    "SAT2_CN_R_UNIT",
    "SAT2_CN_T",
    "SAT2_CN_T_UNIT",
    "SAT2_CN_N",
    "SAT2_CN_N_UNIT",
    "SAT2_CRDOT_R",
    "SAT2_CRDOT_R_UNIT",
    "SAT2_CRDOT_T",
    "SAT2_CRDOT_T_UNIT",
    "SAT2_CRDOT_N",
    "SAT2_CRDOT_N_UNIT",
    "SAT2_CRDOT_RDOT",
    "SAT2_CRDOT_RDOT_UNIT",
    "SAT2_CTDOT_R",
    "SAT2_CTDOT_R_UNIT",
    "SAT2_CTDOT_T",
    "SAT2_CTDOT_T_UNIT",
    "SAT2_CTDOT_N",
    "SAT2_CTDOT_N_UNIT",
    "SAT2_CTDOT_RDOT",
    "SAT2_CTDOT_RDOT_UNIT",
    "SAT2_CTDOT_TDOT",
    "SAT2_CTDOT_TDOT_UNIT",
    "SAT2_CNDOT_R",
    "SAT2_CNDOT_R_UNIT",
    "SAT2_CNDOT_T",
    "SAT2_CNDOT_T_UNIT",
    "SAT2_CNDOT_N",
    "SAT2_CNDOT_N_UNIT",
    "SAT2_CNDOT_RDOT",
    "SAT2_CNDOT_RDOT_UNIT",
    "SAT2_CNDOT_TDOT",
    "SAT2_CNDOT_TDOT_UNIT",
    "SAT2_CNDOT_NDOT",
    "SAT2_CNDOT_NDOT_UNIT",
    "SAT2_CDRG_R",
    "SAT2_CDRG_R_UNIT",
    "SAT2_CDRG_T",
    "SAT2_CDRG_T_UNIT",
    "SAT2_CDRG_N",
    "SAT2_CDRG_N_UNIT",
    "SAT2_CDRG_RDOT",
    "SAT2_CDRG_RDOT_UNIT",
    "SAT2_CDRG_TDOT",
    "SAT2_CDRG_TDOT_UNIT",
    "SAT2_CDRG_NDOT",
    "SAT2_CDRG_NDOT_UNIT",
    "SAT2_CDRG_DRG",
    "SAT2_CDRG_DRG_UNIT",
    "SAT2_CSRP_R",
    "SAT2_CSRP_R_UNIT",
    "SAT2_CSRP_T",
    "SAT2_CSRP_T_UNIT",
    "SAT2_CSRP_N",
    "SAT2_CSRP_N_UNIT",
    "SAT2_CSRP_RDOT",
    "SAT2_CSRP_RDOT_UNIT",
    "SAT2_CSRP_TDOT",
    "SAT2_CSRP_TDOT_UNIT",
    "SAT2_CSRP_NDOT",
    "SAT2_CSRP_NDOT_UNIT",
    "SAT2_CSRP_DRG",
    "SAT2_CSRP_DRG_UNIT",
    "SAT2_CSRP_SRP",
    "SAT2_CSRP_SRP_UNIT",
    "GID"
})
public class SpaceTrackCdm {

    /**
     * The organisation this message is meant to reach
     * (Required)
     * 
     */
    @JsonProperty("CONSTELLATION")
    @JsonPropertyDescription("The organisation this message is meant to reach")
    private String constellation;
    /**
     * Space-Track CDM ID
     * (Required)
     * 
     */
    @JsonProperty("CDM_ID")
    @JsonPropertyDescription("Space-Track CDM ID")
    private String cdmId;
    /**
     * Space-Track Filename
     * 
     */
    @JsonProperty("FILENAME")
    @JsonPropertyDescription("Space-Track Filename")
    private String filename;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("INSERT_EPOCH")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private String insertEpoch;
    /**
     * Verison of the CDM format
     * 
     */
    @JsonProperty("CCSDS_CDM_VERS")
    @JsonPropertyDescription("Verison of the CDM format")
    private String ccsdsCdmVers;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("CREATION_DATE")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private String creationDate;
    @JsonProperty("CREATION_DATE_FRACTION")
    private String creationDateFraction;
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
    @JsonProperty("COMMENT_EMERGENCY_REPORTABLE")
    private String commentEmergencyReportable;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("TCA")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private String tca;
    /**
     * Extension of the TCA adding milliseconds.
     * 
     */
    @JsonProperty("TCA_FRACTION")
    @JsonPropertyDescription("Extension of the TCA adding milliseconds.")
    private String tcaFraction;
    /**
     * The norm of the relative position vector. It indicates how close the two objects are at TCA.
     * 
     */
    @JsonProperty("MISS_DISTANCE")
    @JsonPropertyDescription("The norm of the relative position vector. It indicates how close the two objects are at TCA.")
    private String missDistance;
    @JsonProperty("MISS_DISTANCE_UNIT")
    private String missDistanceUnit;
    /**
     * The norm of the relative velocity vector. It indicates how fast the two objects are moving relative to each other at TCA.
     * 
     */
    @JsonProperty("RELATIVE_SPEED")
    @JsonPropertyDescription("The norm of the relative velocity vector. It indicates how fast the two objects are moving relative to each other at TCA.")
    private String relativeSpeed;
    @JsonProperty("RELATIVE_SPEED_UNIT")
    private String relativeSpeedUnit;
    /**
     * The R component of Object2’s position relative to Object1’s position in the Radial, Transverse, and Normal (RTN) coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_R")
    @JsonPropertyDescription("The R component of Object2\u2019s position relative to Object1\u2019s position in the Radial, Transverse, and Normal (RTN) coordinate frame.")
    private String relativePositionR;
    @JsonProperty("RELATIVE_POSITION_R_UNIT")
    private String relativePositionRUnit;
    /**
     * The T component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_T")
    @JsonPropertyDescription("The T component of Object2\u2019s position relative to Object1\u2019s position in the RTN coordinate frame.")
    private String relativePositionT;
    @JsonProperty("RELATIVE_POSITION_T_UNIT")
    private String relativePositionTUnit;
    /**
     * The N component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_N")
    @JsonPropertyDescription("The N component of Object2\u2019s position relative to Object1\u2019s position in the RTN coordinate frame.")
    private String relativePositionN;
    @JsonProperty("RELATIVE_POSITION_N_UNIT")
    private String relativePositionNUnit;
    /**
     * The R component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_R")
    @JsonPropertyDescription("The R component of Object2\u2019s velocity relative to Object1\u2019s velocity in the RTN coordinate frame.")
    private String relativeVelocityR;
    @JsonProperty("RELATIVE_VELOCITY_R_UNIT")
    private String relativeVelocityRUnit;
    /**
     * The T component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame. 
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_T")
    @JsonPropertyDescription("The T component of Object2\u2019s velocity relative to Object1\u2019s velocity in the RTN coordinate frame. ")
    private String relativeVelocityT;
    @JsonProperty("RELATIVE_VELOCITY_T_UNIT")
    private String relativeVelocityTUnit;
    /**
     * The N component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame. 
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_N")
    @JsonPropertyDescription("The N component of Object2\u2019s velocity relative to Object1\u2019s velocity in the RTN coordinate frame. ")
    private String relativeVelocityN;
    @JsonProperty("RELATIVE_VELOCITY_N_UNIT")
    private String relativeVelocityNUnit;
    @JsonProperty("COMMENT_SCREENING_OPTION")
    private String commentScreeningOption;
    /**
     * The probability (denoted ‘p’ where 0.0<=p<=1.0), that Object1 and Object2 will collide.
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY")
    @JsonPropertyDescription("The probability (denoted \u2018p\u2019 where 0.0<=p<=1.0), that Object1 and Object2 will collide.")
    private String collisionProbability;
    /**
     * The method that was used to calculate the collision probability. (FOSTER- 1992;CHAN-1997;PATERA-2001;ALFANO-2005;MCKINLEY-2006 from [CPM registry](https://sanaregistry.org/r/cdm_cpm)
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY_METHOD")
    @JsonPropertyDescription("The method that was used to calculate the collision probability. (FOSTER- 1992;CHAN-1997;PATERA-2001;ALFANO-2005;MCKINLEY-2006 from [CPM registry](https://sanaregistry.org/r/cdm_cpm)")
    private String collisionProbabilityMethod;
    @JsonProperty("SAT1_COMMENT_SCREENING_DATA_SOURCE")
    private String sat1CommentScreeningDataSource;
    /**
     * The object to which the metadata and data apply
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
     * 
     */
    @JsonProperty("SAT1_OBJECT_TYPE")
    @JsonPropertyDescription("The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)")
    private String sat1ObjectType;
    /**
     * Contact position of the owner/operator of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_CONTACT_POSITION")
    @JsonPropertyDescription("Contact position of the owner/operator of the object.")
    private String sat1OperatorContactPosition;
    /**
     * Contact organization of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_ORGANIZATION")
    @JsonPropertyDescription("Contact organization of the object.")
    private String sat1OperatorOrganization;
    /**
     * Phone number of the contact position or organization for the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_PHONE")
    @JsonPropertyDescription("Phone number of the contact position or organization for the object.")
    private String sat1OperatorPhone;
    /**
     * Email address of the contact position or organization of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_EMAIL")
    @JsonPropertyDescription("Email address of the contact position or organization of the object.")
    private String sat1OperatorEmail;
    /**
     * Unique name of the external ephemeris file used for the object or NONE. This is used to indicate whether an external (i.e., Owner/Operator [O/O] provided) ephemeris file was used to calculate the CA. If ‘NONE’ is specified, then the output of the most current Orbit Determination (OD) of the CDM originator was used in the CA. (EPHEMERIS;SATELLITE A;NONE)
     * 
     */
    @JsonProperty("SAT1_EPHEMERIS_NAME")
    @JsonPropertyDescription("Unique name of the external ephemeris file used for the object or NONE. This is used to indicate whether an external (i.e., Owner/Operator [O/O] provided) ephemeris file was used to calculate the CA. If \u2018NONE\u2019 is specified, then the output of the most current Orbit Determination (OD) of the CDM originator was used in the CA. (EPHEMERIS;SATELLITE A;NONE)")
    private String sat1EphemerisName;
    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * 
     */
    @JsonProperty("SAT1_COVARIANCE_METHOD")
    @JsonPropertyDescription("Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.")
    private String sat1CovarianceMethod;
    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * 
     */
    @JsonProperty("SAT1_MANEUVERABLE")
    @JsonPropertyDescription("The maneuver capacity of the object. (YES;NO;N/A)")
    private String sat1Maneuverable;
    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2. (GCRF;EME2000;ITRF)
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
     * 
     */
    @JsonProperty("SAT1_SOLAR_RAD_PRESSURE")
    @JsonPropertyDescription("Indication of whether solar radiation pressure perturbations were used for the OD of the object.")
    private String sat1SolarRadPressure;
    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_EARTH_TIDES")
    @JsonPropertyDescription("Indication of whether solid Earth and ocean tides were used for the OD of the object.")
    private String sat1EarthTides;
    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_INTRACK_THRUST")
    @JsonPropertyDescription("Indication of whether in-track thrust modeling was used for the OD of the object.")
    private String sat1IntrackThrust;
    @JsonProperty("SAT1_COMMENT_COVARIANCE_SCALE_FACTOR")
    private String sat1CommentCovarianceScaleFactor;
    @JsonProperty("SAT1_COMMENT_EXCLUSION_VOLUME_RADIUS")
    private String sat1CommentExclusionVolumeRadius;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_START")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private String sat1TimeLastobStart;
    @JsonProperty("SAT1_TIME_LASTOB_START_FRACTION")
    private String sat1TimeLastobStartFraction;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_END")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private String sat1TimeLastobEnd;
    @JsonProperty("SAT1_TIME_LASTOB_END_FRACTION")
    private String sat1TimeLastobEndFraction;
    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT1_RECOMMENDED_OD_SPAN")
    @JsonPropertyDescription("The recommended OD time span calculated for the object.")
    private String sat1RecommendedOdSpan;
    @JsonProperty("SAT1_RECOMMENDED_OD_SPAN_UNIT")
    private String sat1RecommendedOdSpanUnit;
    @JsonProperty("SAT1_ACTUAL_OD_SPAN")
    private String sat1ActualOdSpan;
    @JsonProperty("SAT1_ACTUAL_OD_SPAN_UNIT")
    private String sat1ActualOdSpanUnit;
    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_AVAILABLE")
    @JsonPropertyDescription("The number of sensor tracks available for the OD of the object.")
    private String sat1ObsAvailable;
    /**
     * The number of sensor tracks accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_USED")
    @JsonPropertyDescription("The number of sensor tracks accepted for the OD of the object.")
    private String sat1ObsUsed;
    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT1_RESIDUALS_ACCEPTED")
    @JsonPropertyDescription("The percentage of residuals accepted in the OD of the object")
    private String sat1ResidualsAccepted;
    @JsonProperty("SAT1_RESIDUALS_ACCEPTED_UNIT")
    private String sat1ResidualsAcceptedUnit;
    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT1_WEIGHTED_RMS")
    @JsonPropertyDescription("The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD")
    private String sat1WeightedRms;
    @JsonProperty("SAT1_COMMENT_APOGEE")
    private String sat1CommentApogee;
    @JsonProperty("SAT1_COMMENT_PERIGEE")
    private String sat1CommentPerigee;
    @JsonProperty("SAT1_COMMENT_INCLINATION")
    private String sat1CommentInclination;
    @JsonProperty("SAT1_COMMENT_OPERATOR_HARD_BODY_RADIUS")
    private String sat1CommentOperatorHardBodyRadius;
    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT1_AREA_PC")
    @JsonPropertyDescription("The actual area of the object in m**2.")
    private String sat1AreaPc;
    @JsonProperty("SAT1_AREA_PC_UNIT")
    private String sat1AreaPcUnit;
    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CD_AREA_OVER_MASS")
    @JsonPropertyDescription("The objects CD*A/m used to propagate the state vector and covariance to TCA.")
    private String sat1CdAreaOverMass;
    @JsonProperty("SAT1_CD_AREA_OVER_MASS_UNIT")
    private String sat1CdAreaOverMassUnit;
    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CR_AREA_OVER_MASS")
    @JsonPropertyDescription("The objects CR*A/m used to propagate the state vector and covariance to TCA.")
    private String sat1CrAreaOverMass;
    @JsonProperty("SAT1_CR_AREA_OVER_MASS_UNIT")
    private String sat1CrAreaOverMassUnit;
    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_THRUST_ACCELERATION")
    @JsonPropertyDescription("The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.")
    private String sat1ThrustAcceleration;
    @JsonProperty("SAT1_THRUST_ACCELERATION_UNIT")
    private String sat1ThrustAccelerationUnit;
    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT1_SEDR")
    @JsonPropertyDescription("The amount of energy being removed from the object\u2019s orbit by atmospheric drag. This value is an average calculated during the OD.")
    private String sat1Sedr;
    @JsonProperty("SAT1_SEDR_UNIT")
    private String sat1SedrUnit;
    /**
     * Object position vector X component
     * 
     */
    @JsonProperty("SAT1_X")
    @JsonPropertyDescription("Object position vector X component")
    private String sat1X;
    @JsonProperty("SAT1_X_UNIT")
    private String sat1XUnit;
    /**
     * Object position vector Y component
     * 
     */
    @JsonProperty("SAT1_Y")
    @JsonPropertyDescription("Object position vector Y component")
    private String sat1Y;
    @JsonProperty("SAT1_Y_UNIT")
    private String sat1YUnit;
    /**
     * Object position vector Z component
     * 
     */
    @JsonProperty("SAT1_Z")
    @JsonPropertyDescription("Object position vector Z component")
    private String sat1Z;
    @JsonProperty("SAT1_Z_UNIT")
    private String sat1ZUnit;
    /**
     * Object position vector X_DOT component
     * 
     */
    @JsonProperty("SAT1_X_DOT")
    @JsonPropertyDescription("Object position vector X_DOT component")
    private String sat1XDot;
    @JsonProperty("SAT1_X_DOT_UNIT")
    private String sat1XDotUnit;
    /**
     * Object position vector Y_DOT component
     * 
     */
    @JsonProperty("SAT1_Y_DOT")
    @JsonPropertyDescription("Object position vector Y_DOT component")
    private String sat1YDot;
    @JsonProperty("SAT1_Y_DOT_UNIT")
    private String sat1YDotUnit;
    /**
     * Object position vector Z_DOT component
     * 
     */
    @JsonProperty("SAT1_Z_DOT")
    @JsonPropertyDescription("Object position vector Z_DOT component")
    private String sat1ZDot;
    @JsonProperty("SAT1_Z_DOT_UNIT")
    private String sat1ZDotUnit;
    @JsonProperty("SAT1_COMMENT_DCP_DENSITY_FORECAST_UNCERTAINTY")
    private String sat1CommentDcpDensityForecastUncertainty;
    @JsonProperty("SAT1_COMMENT_DCP_SENSITIVITY_VECTOR_POSITION")
    private String sat1CommentDcpSensitivityVectorPosition;
    @JsonProperty("SAT1_COMMENT_DCP_SENSITIVITY_VECTOR_VELOCITY")
    private String sat1CommentDcpSensitivityVectorVelocity;
    @JsonProperty("SAT1_CR_R")
    private String sat1CrR;
    @JsonProperty("SAT1_CR_R_UNIT")
    private String sat1CrRUnit;
    @JsonProperty("SAT1_CT_R")
    private String sat1CtR;
    @JsonProperty("SAT1_CT_R_UNIT")
    private String sat1CtRUnit;
    @JsonProperty("SAT1_CT_T")
    private String sat1CtT;
    @JsonProperty("SAT1_CT_T_UNIT")
    private String sat1CtTUnit;
    @JsonProperty("SAT1_CN_R")
    private String sat1CnR;
    @JsonProperty("SAT1_CN_R_UNIT")
    private String sat1CnRUnit;
    @JsonProperty("SAT1_CN_T")
    private String sat1CnT;
    @JsonProperty("SAT1_CN_T_UNIT")
    private String sat1CnTUnit;
    @JsonProperty("SAT1_CN_N")
    private String sat1CnN;
    @JsonProperty("SAT1_CN_N_UNIT")
    private String sat1CnNUnit;
    @JsonProperty("SAT1_CRDOT_R")
    private String sat1CrdotR;
    @JsonProperty("SAT1_CRDOT_R_UNIT")
    private String sat1CrdotRUnit;
    @JsonProperty("SAT1_CRDOT_T")
    private String sat1CrdotT;
    @JsonProperty("SAT1_CRDOT_T_UNIT")
    private String sat1CrdotTUnit;
    @JsonProperty("SAT1_CRDOT_N")
    private String sat1CrdotN;
    @JsonProperty("SAT1_CRDOT_N_UNIT")
    private String sat1CrdotNUnit;
    @JsonProperty("SAT1_CRDOT_RDOT")
    private String sat1CrdotRdot;
    @JsonProperty("SAT1_CRDOT_RDOT_UNIT")
    private String sat1CrdotRdotUnit;
    @JsonProperty("SAT1_CTDOT_R")
    private String sat1CtdotR;
    @JsonProperty("SAT1_CTDOT_R_UNIT")
    private String sat1CtdotRUnit;
    @JsonProperty("SAT1_CTDOT_T")
    private String sat1CtdotT;
    @JsonProperty("SAT1_CTDOT_T_UNIT")
    private String sat1CtdotTUnit;
    @JsonProperty("SAT1_CTDOT_N")
    private String sat1CtdotN;
    @JsonProperty("SAT1_CTDOT_N_UNIT")
    private String sat1CtdotNUnit;
    @JsonProperty("SAT1_CTDOT_RDOT")
    private String sat1CtdotRdot;
    @JsonProperty("SAT1_CTDOT_RDOT_UNIT")
    private String sat1CtdotRdotUnit;
    @JsonProperty("SAT1_CTDOT_TDOT")
    private String sat1CtdotTdot;
    @JsonProperty("SAT1_CTDOT_TDOT_UNIT")
    private String sat1CtdotTdotUnit;
    @JsonProperty("SAT1_CNDOT_R")
    private String sat1CndotR;
    @JsonProperty("SAT1_CNDOT_R_UNIT")
    private String sat1CndotRUnit;
    @JsonProperty("SAT1_CNDOT_T")
    private String sat1CndotT;
    @JsonProperty("SAT1_CNDOT_T_UNIT")
    private String sat1CndotTUnit;
    @JsonProperty("SAT1_CNDOT_N")
    private String sat1CndotN;
    @JsonProperty("SAT1_CNDOT_N_UNIT")
    private String sat1CndotNUnit;
    @JsonProperty("SAT1_CNDOT_RDOT")
    private String sat1CndotRdot;
    @JsonProperty("SAT1_CNDOT_RDOT_UNIT")
    private String sat1CndotRdotUnit;
    @JsonProperty("SAT1_CNDOT_TDOT")
    private String sat1CndotTdot;
    @JsonProperty("SAT1_CNDOT_TDOT_UNIT")
    private String sat1CndotTdotUnit;
    @JsonProperty("SAT1_CNDOT_NDOT")
    private String sat1CndotNdot;
    @JsonProperty("SAT1_CNDOT_NDOT_UNIT")
    private String sat1CndotNdotUnit;
    @JsonProperty("SAT1_CDRG_R")
    private String sat1CdrgR;
    @JsonProperty("SAT1_CDRG_R_UNIT")
    private String sat1CdrgRUnit;
    @JsonProperty("SAT1_CDRG_T")
    private String sat1CdrgT;
    @JsonProperty("SAT1_CDRG_T_UNIT")
    private String sat1CdrgTUnit;
    @JsonProperty("SAT1_CDRG_N")
    private String sat1CdrgN;
    @JsonProperty("SAT1_CDRG_N_UNIT")
    private String sat1CdrgNUnit;
    @JsonProperty("SAT1_CDRG_RDOT")
    private String sat1CdrgRdot;
    @JsonProperty("SAT1_CDRG_RDOT_UNIT")
    private String sat1CdrgRdotUnit;
    @JsonProperty("SAT1_CDRG_TDOT")
    private String sat1CdrgTdot;
    @JsonProperty("SAT1_CDRG_TDOT_UNIT")
    private String sat1CdrgTdotUnit;
    @JsonProperty("SAT1_CDRG_NDOT")
    private String sat1CdrgNdot;
    @JsonProperty("SAT1_CDRG_NDOT_UNIT")
    private String sat1CdrgNdotUnit;
    @JsonProperty("SAT1_CDRG_DRG")
    private String sat1CdrgDrg;
    @JsonProperty("SAT1_CDRG_DRG_UNIT")
    private String sat1CdrgDrgUnit;
    @JsonProperty("SAT1_CSRP_R")
    private String sat1CsrpR;
    @JsonProperty("SAT1_CSRP_R_UNIT")
    private String sat1CsrpRUnit;
    @JsonProperty("SAT1_CSRP_T")
    private String sat1CsrpT;
    @JsonProperty("SAT1_CSRP_T_UNIT")
    private String sat1CsrpTUnit;
    @JsonProperty("SAT1_CSRP_N")
    private String sat1CsrpN;
    @JsonProperty("SAT1_CSRP_N_UNIT")
    private String sat1CsrpNUnit;
    @JsonProperty("SAT1_CSRP_RDOT")
    private String sat1CsrpRdot;
    @JsonProperty("SAT1_CSRP_RDOT_UNIT")
    private String sat1CsrpRdotUnit;
    @JsonProperty("SAT1_CSRP_TDOT")
    private String sat1CsrpTdot;
    @JsonProperty("SAT1_CSRP_TDOT_UNIT")
    private String sat1CsrpTdotUnit;
    @JsonProperty("SAT1_CSRP_NDOT")
    private String sat1CsrpNdot;
    @JsonProperty("SAT1_CSRP_NDOT_UNIT")
    private String sat1CsrpNdotUnit;
    @JsonProperty("SAT1_CSRP_DRG")
    private String sat1CsrpDrg;
    @JsonProperty("SAT1_CSRP_DRG_UNIT")
    private String sat1CsrpDrgUnit;
    @JsonProperty("SAT1_CSRP_SRP")
    private String sat1CsrpSrp;
    @JsonProperty("SAT1_CSRP_SRP_UNIT")
    private String sat1CsrpSrpUnit;
    @JsonProperty("SAT2_COMMENT_SCREENING_DATA_SOURCE")
    private String sat2CommentScreeningDataSource;
    /**
     * The object to which the metadata and data apply.
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
     * 
     */
    @JsonProperty("SAT2_OBJECT_TYPE")
    @JsonPropertyDescription("The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)")
    private String sat2ObjectType;
    /**
     * Contact position of the owner/operator of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_CONTACT_POSITION")
    @JsonPropertyDescription("Contact position of the owner/operator of the object.")
    private String sat2OperatorContactPosition;
    /**
     * Contact organization of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_ORGANIZATION")
    @JsonPropertyDescription("Contact organization of the object.")
    private String sat2OperatorOrganization;
    /**
     * Phone number of the contact position or organization for the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_PHONE")
    @JsonPropertyDescription("Phone number of the contact position or organization for the object.")
    private String sat2OperatorPhone;
    /**
     * Email address of the contact position or organization of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_EMAIL")
    @JsonPropertyDescription("Email address of the contact position or organization of the object.")
    private String sat2OperatorEmail;
    /**
     * Unique name of the external ephemeris file used for the object or NONE. This is used to indicate whether an external (i.e., Owner/Operator [O/O] provided) ephemeris file was used to calculate the CA. If ‘NONE’ is specified, then the output of the most current Orbit Determination (OD) of the CDM originator was used in the CA. (EPHEMERIS;SATELLITE A;NONE)
     * 
     */
    @JsonProperty("SAT2_EPHEMERIS_NAME")
    @JsonPropertyDescription("Unique name of the external ephemeris file used for the object or NONE. This is used to indicate whether an external (i.e., Owner/Operator [O/O] provided) ephemeris file was used to calculate the CA. If \u2018NONE\u2019 is specified, then the output of the most current Orbit Determination (OD) of the CDM originator was used in the CA. (EPHEMERIS;SATELLITE A;NONE)")
    private String sat2EphemerisName;
    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * 
     */
    @JsonProperty("SAT2_COVARIANCE_METHOD")
    @JsonPropertyDescription("Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.")
    private String sat2CovarianceMethod;
    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * 
     */
    @JsonProperty("SAT2_MANEUVERABLE")
    @JsonPropertyDescription("The maneuver capacity of the object. (YES;NO;N/A)")
    private String sat2Maneuverable;
    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2.
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
     * 
     */
    @JsonProperty("SAT2_SOLAR_RAD_PRESSURE")
    @JsonPropertyDescription("Indication of whether solar radiation pressure perturbations were used for the OD of the object.")
    private String sat2SolarRadPressure;
    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_EARTH_TIDES")
    @JsonPropertyDescription("Indication of whether solid Earth and ocean tides were used for the OD of the object.")
    private String sat2EarthTides;
    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_INTRACK_THRUST")
    @JsonPropertyDescription("Indication of whether in-track thrust modeling was used for the OD of the object.")
    private String sat2IntrackThrust;
    @JsonProperty("SAT2_COMMENT_COVARIANCE_SCALE_FACTOR")
    private String sat2CommentCovarianceScaleFactor;
    @JsonProperty("SAT2_COMMENT_EXCLUSION_VOLUME_RADIUS")
    private String sat2CommentExclusionVolumeRadius;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_START")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private String sat2TimeLastobStart;
    @JsonProperty("SAT2_TIME_LASTOB_START_FRACTION")
    private String sat2TimeLastobStartFraction;
    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_END")
    @JsonPropertyDescription("ISO8601 date/time definition.")
    private String sat2TimeLastobEnd;
    @JsonProperty("SAT2_TIME_LASTOB_END_FRACTION")
    private String sat2TimeLastobEndFraction;
    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT2_RECOMMENDED_OD_SPAN")
    @JsonPropertyDescription("The recommended OD time span calculated for the object.")
    private String sat2RecommendedOdSpan;
    @JsonProperty("SAT2_RECOMMENDED_OD_SPAN_UNIT")
    private String sat2RecommendedOdSpanUnit;
    /**
     * Based on the observations available and the RECOMMENDED_OD_SPAN, the actual time span used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_ACTUAL_OD_SPAN")
    @JsonPropertyDescription("Based on the observations available and the RECOMMENDED_OD_SPAN, the actual time span used for the OD of the object.")
    private String sat2ActualOdSpan;
    @JsonProperty("SAT2_ACTUAL_OD_SPAN_UNIT")
    private String sat2ActualOdSpanUnit;
    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_AVAILABLE")
    @JsonPropertyDescription("The number of sensor tracks available for the OD of the object.")
    private String sat2ObsAvailable;
    /**
     * The number of observations accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_USED")
    @JsonPropertyDescription("The number of observations accepted for the OD of the object.")
    private String sat2ObsUsed;
    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT2_RESIDUALS_ACCEPTED")
    @JsonPropertyDescription("The percentage of residuals accepted in the OD of the object")
    private String sat2ResidualsAccepted;
    @JsonProperty("SAT2_RESIDUALS_ACCEPTED_UNIT")
    private String sat2ResidualsAcceptedUnit;
    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT2_WEIGHTED_RMS")
    @JsonPropertyDescription("The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD")
    private String sat2WeightedRms;
    @JsonProperty("SAT2_COMMENT_APOGEE")
    private String sat2CommentApogee;
    @JsonProperty("SAT2_COMMENT_PERIGEE")
    private String sat2CommentPerigee;
    @JsonProperty("SAT2_COMMENT_INCLINATION")
    private String sat2CommentInclination;
    @JsonProperty("SAT2_COMMENT_OPERATOR_HARD_BODY_RADIUS")
    private String sat2CommentOperatorHardBodyRadius;
    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT2_AREA_PC")
    @JsonPropertyDescription("The actual area of the object in m**2.")
    private String sat2AreaPc;
    @JsonProperty("SAT2_AREA_PC_UNIT")
    private String sat2AreaPcUnit;
    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CD_AREA_OVER_MASS")
    @JsonPropertyDescription("The objects CD*A/m used to propagate the state vector and covariance to TCA.")
    private String sat2CdAreaOverMass;
    @JsonProperty("SAT2_CD_AREA_OVER_MASS_UNIT")
    private String sat2CdAreaOverMassUnit;
    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CR_AREA_OVER_MASS")
    @JsonPropertyDescription("The objects CR*A/m used to propagate the state vector and covariance to TCA.")
    private String sat2CrAreaOverMass;
    @JsonProperty("SAT2_CR_AREA_OVER_MASS_UNIT")
    private String sat2CrAreaOverMassUnit;
    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_THRUST_ACCELERATION")
    @JsonPropertyDescription("The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.")
    private String sat2ThrustAcceleration;
    @JsonProperty("SAT2_THRUST_ACCELERATION_UNIT")
    private String sat2ThrustAccelerationUnit;
    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT2_SEDR")
    @JsonPropertyDescription("The amount of energy being removed from the object\u2019s orbit by atmospheric drag. This value is an average calculated during the OD.")
    private String sat2Sedr;
    @JsonProperty("SAT2_SEDR_UNIT")
    private String sat2SedrUnit;
    /**
     * Object position vector X component
     * 
     */
    @JsonProperty("SAT2_X")
    @JsonPropertyDescription("Object position vector X component")
    private String sat2X;
    @JsonProperty("SAT2_X_UNIT")
    private String sat2XUnit;
    /**
     * Object position vector Y component
     * 
     */
    @JsonProperty("SAT2_Y")
    @JsonPropertyDescription("Object position vector Y component")
    private String sat2Y;
    @JsonProperty("SAT2_Y_UNIT")
    private String sat2YUnit;
    /**
     * Object position vector Z component
     * 
     */
    @JsonProperty("SAT2_Z")
    @JsonPropertyDescription("Object position vector Z component")
    private String sat2Z;
    @JsonProperty("SAT2_Z_UNIT")
    private String sat2ZUnit;
    /**
     * Object position vector X_DOT component
     * 
     */
    @JsonProperty("SAT2_X_DOT")
    @JsonPropertyDescription("Object position vector X_DOT component")
    private String sat2XDot;
    @JsonProperty("SAT2_X_DOT_UNIT")
    private String sat2XDotUnit;
    /**
     * Object position vector Y_DOT component
     * 
     */
    @JsonProperty("SAT2_Y_DOT")
    @JsonPropertyDescription("Object position vector Y_DOT component")
    private String sat2YDot;
    @JsonProperty("SAT2_Y_DOT_UNIT")
    private String sat2YDotUnit;
    /**
     * Object position vector Z_DOT component
     * 
     */
    @JsonProperty("SAT2_Z_DOT")
    @JsonPropertyDescription("Object position vector Z_DOT component")
    private String sat2ZDot;
    @JsonProperty("SAT2_Z_DOT_UNIT")
    private String sat2ZDotUnit;
    @JsonProperty("SAT2_COMMENT_DCP_DENSITY_FORECAST_UNCERTAINTY")
    private String sat2CommentDcpDensityForecastUncertainty;
    @JsonProperty("SAT2_COMMENT_DCP_SENSITIVITY_VECTOR_POSITION")
    private String sat2CommentDcpSensitivityVectorPosition;
    @JsonProperty("SAT2_COMMENT_DCP_SENSITIVITY_VECTOR_VELOCITY")
    private String sat2CommentDcpSensitivityVectorVelocity;
    @JsonProperty("SAT2_CR_R")
    private String sat2CrR;
    @JsonProperty("SAT2_CR_R_UNIT")
    private String sat2CrRUnit;
    @JsonProperty("SAT2_CT_R")
    private String sat2CtR;
    @JsonProperty("SAT2_CT_R_UNIT")
    private String sat2CtRUnit;
    @JsonProperty("SAT2_CT_T")
    private String sat2CtT;
    @JsonProperty("SAT2_CT_T_UNIT")
    private String sat2CtTUnit;
    @JsonProperty("SAT2_CN_R")
    private String sat2CnR;
    @JsonProperty("SAT2_CN_R_UNIT")
    private String sat2CnRUnit;
    @JsonProperty("SAT2_CN_T")
    private String sat2CnT;
    @JsonProperty("SAT2_CN_T_UNIT")
    private String sat2CnTUnit;
    @JsonProperty("SAT2_CN_N")
    private String sat2CnN;
    @JsonProperty("SAT2_CN_N_UNIT")
    private String sat2CnNUnit;
    @JsonProperty("SAT2_CRDOT_R")
    private String sat2CrdotR;
    @JsonProperty("SAT2_CRDOT_R_UNIT")
    private String sat2CrdotRUnit;
    @JsonProperty("SAT2_CRDOT_T")
    private String sat2CrdotT;
    @JsonProperty("SAT2_CRDOT_T_UNIT")
    private String sat2CrdotTUnit;
    @JsonProperty("SAT2_CRDOT_N")
    private String sat2CrdotN;
    @JsonProperty("SAT2_CRDOT_N_UNIT")
    private String sat2CrdotNUnit;
    @JsonProperty("SAT2_CRDOT_RDOT")
    private String sat2CrdotRdot;
    @JsonProperty("SAT2_CRDOT_RDOT_UNIT")
    private String sat2CrdotRdotUnit;
    @JsonProperty("SAT2_CTDOT_R")
    private String sat2CtdotR;
    @JsonProperty("SAT2_CTDOT_R_UNIT")
    private String sat2CtdotRUnit;
    @JsonProperty("SAT2_CTDOT_T")
    private String sat2CtdotT;
    @JsonProperty("SAT2_CTDOT_T_UNIT")
    private String sat2CtdotTUnit;
    @JsonProperty("SAT2_CTDOT_N")
    private String sat2CtdotN;
    @JsonProperty("SAT2_CTDOT_N_UNIT")
    private String sat2CtdotNUnit;
    @JsonProperty("SAT2_CTDOT_RDOT")
    private String sat2CtdotRdot;
    @JsonProperty("SAT2_CTDOT_RDOT_UNIT")
    private String sat2CtdotRdotUnit;
    @JsonProperty("SAT2_CTDOT_TDOT")
    private String sat2CtdotTdot;
    @JsonProperty("SAT2_CTDOT_TDOT_UNIT")
    private String sat2CtdotTdotUnit;
    @JsonProperty("SAT2_CNDOT_R")
    private String sat2CndotR;
    @JsonProperty("SAT2_CNDOT_R_UNIT")
    private String sat2CndotRUnit;
    @JsonProperty("SAT2_CNDOT_T")
    private String sat2CndotT;
    @JsonProperty("SAT2_CNDOT_T_UNIT")
    private String sat2CndotTUnit;
    @JsonProperty("SAT2_CNDOT_N")
    private String sat2CndotN;
    @JsonProperty("SAT2_CNDOT_N_UNIT")
    private String sat2CndotNUnit;
    @JsonProperty("SAT2_CNDOT_RDOT")
    private String sat2CndotRdot;
    @JsonProperty("SAT2_CNDOT_RDOT_UNIT")
    private String sat2CndotRdotUnit;
    @JsonProperty("SAT2_CNDOT_TDOT")
    private String sat2CndotTdot;
    @JsonProperty("SAT2_CNDOT_TDOT_UNIT")
    private String sat2CndotTdotUnit;
    @JsonProperty("SAT2_CNDOT_NDOT")
    private String sat2CndotNdot;
    @JsonProperty("SAT2_CNDOT_NDOT_UNIT")
    private String sat2CndotNdotUnit;
    @JsonProperty("SAT2_CDRG_R")
    private String sat2CdrgR;
    @JsonProperty("SAT2_CDRG_R_UNIT")
    private String sat2CdrgRUnit;
    @JsonProperty("SAT2_CDRG_T")
    private String sat2CdrgT;
    @JsonProperty("SAT2_CDRG_T_UNIT")
    private String sat2CdrgTUnit;
    @JsonProperty("SAT2_CDRG_N")
    private String sat2CdrgN;
    @JsonProperty("SAT2_CDRG_N_UNIT")
    private String sat2CdrgNUnit;
    @JsonProperty("SAT2_CDRG_RDOT")
    private String sat2CdrgRdot;
    @JsonProperty("SAT2_CDRG_RDOT_UNIT")
    private String sat2CdrgRdotUnit;
    @JsonProperty("SAT2_CDRG_TDOT")
    private String sat2CdrgTdot;
    @JsonProperty("SAT2_CDRG_TDOT_UNIT")
    private String sat2CdrgTdotUnit;
    @JsonProperty("SAT2_CDRG_NDOT")
    private String sat2CdrgNdot;
    @JsonProperty("SAT2_CDRG_NDOT_UNIT")
    private String sat2CdrgNdotUnit;
    @JsonProperty("SAT2_CDRG_DRG")
    private String sat2CdrgDrg;
    @JsonProperty("SAT2_CDRG_DRG_UNIT")
    private String sat2CdrgDrgUnit;
    @JsonProperty("SAT2_CSRP_R")
    private String sat2CsrpR;
    @JsonProperty("SAT2_CSRP_R_UNIT")
    private String sat2CsrpRUnit;
    @JsonProperty("SAT2_CSRP_T")
    private String sat2CsrpT;
    @JsonProperty("SAT2_CSRP_T_UNIT")
    private String sat2CsrpTUnit;
    @JsonProperty("SAT2_CSRP_N")
    private String sat2CsrpN;
    @JsonProperty("SAT2_CSRP_N_UNIT")
    private String sat2CsrpNUnit;
    @JsonProperty("SAT2_CSRP_RDOT")
    private String sat2CsrpRdot;
    @JsonProperty("SAT2_CSRP_RDOT_UNIT")
    private String sat2CsrpRdotUnit;
    @JsonProperty("SAT2_CSRP_TDOT")
    private String sat2CsrpTdot;
    @JsonProperty("SAT2_CSRP_TDOT_UNIT")
    private String sat2CsrpTdotUnit;
    @JsonProperty("SAT2_CSRP_NDOT")
    private String sat2CsrpNdot;
    @JsonProperty("SAT2_CSRP_NDOT_UNIT")
    private String sat2CsrpNdotUnit;
    @JsonProperty("SAT2_CSRP_DRG")
    private String sat2CsrpDrg;
    @JsonProperty("SAT2_CSRP_DRG_UNIT")
    private String sat2CsrpDrgUnit;
    @JsonProperty("SAT2_CSRP_SRP")
    private String sat2CsrpSrp;
    @JsonProperty("SAT2_CSRP_SRP_UNIT")
    private String sat2CsrpSrpUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("GID")
    private String gid;

    /**
     * The organisation this message is meant to reach
     * (Required)
     * 
     */
    @JsonProperty("CONSTELLATION")
    public String getConstellation() {
        return constellation;
    }

    /**
     * The organisation this message is meant to reach
     * (Required)
     * 
     */
    @JsonProperty("CONSTELLATION")
    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    /**
     * Space-Track CDM ID
     * (Required)
     * 
     */
    @JsonProperty("CDM_ID")
    public String getCdmId() {
        return cdmId;
    }

    /**
     * Space-Track CDM ID
     * (Required)
     * 
     */
    @JsonProperty("CDM_ID")
    public void setCdmId(String cdmId) {
        this.cdmId = cdmId;
    }

    /**
     * Space-Track Filename
     * 
     */
    @JsonProperty("FILENAME")
    public String getFilename() {
        return filename;
    }

    /**
     * Space-Track Filename
     * 
     */
    @JsonProperty("FILENAME")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("INSERT_EPOCH")
    public String getInsertEpoch() {
        return insertEpoch;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * (Required)
     * 
     */
    @JsonProperty("INSERT_EPOCH")
    public void setInsertEpoch(String insertEpoch) {
        this.insertEpoch = insertEpoch;
    }

    /**
     * Verison of the CDM format
     * 
     */
    @JsonProperty("CCSDS_CDM_VERS")
    public String getCcsdsCdmVers() {
        return ccsdsCdmVers;
    }

    /**
     * Verison of the CDM format
     * 
     */
    @JsonProperty("CCSDS_CDM_VERS")
    public void setCcsdsCdmVers(String ccsdsCdmVers) {
        this.ccsdsCdmVers = ccsdsCdmVers;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("CREATION_DATE")
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("CREATION_DATE")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("CREATION_DATE_FRACTION")
    public String getCreationDateFraction() {
        return creationDateFraction;
    }

    @JsonProperty("CREATION_DATE_FRACTION")
    public void setCreationDateFraction(String creationDateFraction) {
        this.creationDateFraction = creationDateFraction;
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

    @JsonProperty("COMMENT_EMERGENCY_REPORTABLE")
    public String getCommentEmergencyReportable() {
        return commentEmergencyReportable;
    }

    @JsonProperty("COMMENT_EMERGENCY_REPORTABLE")
    public void setCommentEmergencyReportable(String commentEmergencyReportable) {
        this.commentEmergencyReportable = commentEmergencyReportable;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("TCA")
    public String getTca() {
        return tca;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("TCA")
    public void setTca(String tca) {
        this.tca = tca;
    }

    /**
     * Extension of the TCA adding milliseconds.
     * 
     */
    @JsonProperty("TCA_FRACTION")
    public String getTcaFraction() {
        return tcaFraction;
    }

    /**
     * Extension of the TCA adding milliseconds.
     * 
     */
    @JsonProperty("TCA_FRACTION")
    public void setTcaFraction(String tcaFraction) {
        this.tcaFraction = tcaFraction;
    }

    /**
     * The norm of the relative position vector. It indicates how close the two objects are at TCA.
     * 
     */
    @JsonProperty("MISS_DISTANCE")
    public String getMissDistance() {
        return missDistance;
    }

    /**
     * The norm of the relative position vector. It indicates how close the two objects are at TCA.
     * 
     */
    @JsonProperty("MISS_DISTANCE")
    public void setMissDistance(String missDistance) {
        this.missDistance = missDistance;
    }

    @JsonProperty("MISS_DISTANCE_UNIT")
    public String getMissDistanceUnit() {
        return missDistanceUnit;
    }

    @JsonProperty("MISS_DISTANCE_UNIT")
    public void setMissDistanceUnit(String missDistanceUnit) {
        this.missDistanceUnit = missDistanceUnit;
    }

    /**
     * The norm of the relative velocity vector. It indicates how fast the two objects are moving relative to each other at TCA.
     * 
     */
    @JsonProperty("RELATIVE_SPEED")
    public String getRelativeSpeed() {
        return relativeSpeed;
    }

    /**
     * The norm of the relative velocity vector. It indicates how fast the two objects are moving relative to each other at TCA.
     * 
     */
    @JsonProperty("RELATIVE_SPEED")
    public void setRelativeSpeed(String relativeSpeed) {
        this.relativeSpeed = relativeSpeed;
    }

    @JsonProperty("RELATIVE_SPEED_UNIT")
    public String getRelativeSpeedUnit() {
        return relativeSpeedUnit;
    }

    @JsonProperty("RELATIVE_SPEED_UNIT")
    public void setRelativeSpeedUnit(String relativeSpeedUnit) {
        this.relativeSpeedUnit = relativeSpeedUnit;
    }

    /**
     * The R component of Object2’s position relative to Object1’s position in the Radial, Transverse, and Normal (RTN) coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_R")
    public String getRelativePositionR() {
        return relativePositionR;
    }

    /**
     * The R component of Object2’s position relative to Object1’s position in the Radial, Transverse, and Normal (RTN) coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_R")
    public void setRelativePositionR(String relativePositionR) {
        this.relativePositionR = relativePositionR;
    }

    @JsonProperty("RELATIVE_POSITION_R_UNIT")
    public String getRelativePositionRUnit() {
        return relativePositionRUnit;
    }

    @JsonProperty("RELATIVE_POSITION_R_UNIT")
    public void setRelativePositionRUnit(String relativePositionRUnit) {
        this.relativePositionRUnit = relativePositionRUnit;
    }

    /**
     * The T component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_T")
    public String getRelativePositionT() {
        return relativePositionT;
    }

    /**
     * The T component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_T")
    public void setRelativePositionT(String relativePositionT) {
        this.relativePositionT = relativePositionT;
    }

    @JsonProperty("RELATIVE_POSITION_T_UNIT")
    public String getRelativePositionTUnit() {
        return relativePositionTUnit;
    }

    @JsonProperty("RELATIVE_POSITION_T_UNIT")
    public void setRelativePositionTUnit(String relativePositionTUnit) {
        this.relativePositionTUnit = relativePositionTUnit;
    }

    /**
     * The N component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_N")
    public String getRelativePositionN() {
        return relativePositionN;
    }

    /**
     * The N component of Object2’s position relative to Object1’s position in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_POSITION_N")
    public void setRelativePositionN(String relativePositionN) {
        this.relativePositionN = relativePositionN;
    }

    @JsonProperty("RELATIVE_POSITION_N_UNIT")
    public String getRelativePositionNUnit() {
        return relativePositionNUnit;
    }

    @JsonProperty("RELATIVE_POSITION_N_UNIT")
    public void setRelativePositionNUnit(String relativePositionNUnit) {
        this.relativePositionNUnit = relativePositionNUnit;
    }

    /**
     * The R component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_R")
    public String getRelativeVelocityR() {
        return relativeVelocityR;
    }

    /**
     * The R component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame.
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_R")
    public void setRelativeVelocityR(String relativeVelocityR) {
        this.relativeVelocityR = relativeVelocityR;
    }

    @JsonProperty("RELATIVE_VELOCITY_R_UNIT")
    public String getRelativeVelocityRUnit() {
        return relativeVelocityRUnit;
    }

    @JsonProperty("RELATIVE_VELOCITY_R_UNIT")
    public void setRelativeVelocityRUnit(String relativeVelocityRUnit) {
        this.relativeVelocityRUnit = relativeVelocityRUnit;
    }

    /**
     * The T component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame. 
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_T")
    public String getRelativeVelocityT() {
        return relativeVelocityT;
    }

    /**
     * The T component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame. 
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_T")
    public void setRelativeVelocityT(String relativeVelocityT) {
        this.relativeVelocityT = relativeVelocityT;
    }

    @JsonProperty("RELATIVE_VELOCITY_T_UNIT")
    public String getRelativeVelocityTUnit() {
        return relativeVelocityTUnit;
    }

    @JsonProperty("RELATIVE_VELOCITY_T_UNIT")
    public void setRelativeVelocityTUnit(String relativeVelocityTUnit) {
        this.relativeVelocityTUnit = relativeVelocityTUnit;
    }

    /**
     * The N component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame. 
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_N")
    public String getRelativeVelocityN() {
        return relativeVelocityN;
    }

    /**
     * The N component of Object2’s velocity relative to Object1’s velocity in the RTN coordinate frame. 
     * 
     */
    @JsonProperty("RELATIVE_VELOCITY_N")
    public void setRelativeVelocityN(String relativeVelocityN) {
        this.relativeVelocityN = relativeVelocityN;
    }

    @JsonProperty("RELATIVE_VELOCITY_N_UNIT")
    public String getRelativeVelocityNUnit() {
        return relativeVelocityNUnit;
    }

    @JsonProperty("RELATIVE_VELOCITY_N_UNIT")
    public void setRelativeVelocityNUnit(String relativeVelocityNUnit) {
        this.relativeVelocityNUnit = relativeVelocityNUnit;
    }

    @JsonProperty("COMMENT_SCREENING_OPTION")
    public String getCommentScreeningOption() {
        return commentScreeningOption;
    }

    @JsonProperty("COMMENT_SCREENING_OPTION")
    public void setCommentScreeningOption(String commentScreeningOption) {
        this.commentScreeningOption = commentScreeningOption;
    }

    /**
     * The probability (denoted ‘p’ where 0.0<=p<=1.0), that Object1 and Object2 will collide.
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY")
    public String getCollisionProbability() {
        return collisionProbability;
    }

    /**
     * The probability (denoted ‘p’ where 0.0<=p<=1.0), that Object1 and Object2 will collide.
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY")
    public void setCollisionProbability(String collisionProbability) {
        this.collisionProbability = collisionProbability;
    }

    /**
     * The method that was used to calculate the collision probability. (FOSTER- 1992;CHAN-1997;PATERA-2001;ALFANO-2005;MCKINLEY-2006 from [CPM registry](https://sanaregistry.org/r/cdm_cpm)
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY_METHOD")
    public String getCollisionProbabilityMethod() {
        return collisionProbabilityMethod;
    }

    /**
     * The method that was used to calculate the collision probability. (FOSTER- 1992;CHAN-1997;PATERA-2001;ALFANO-2005;MCKINLEY-2006 from [CPM registry](https://sanaregistry.org/r/cdm_cpm)
     * 
     */
    @JsonProperty("COLLISION_PROBABILITY_METHOD")
    public void setCollisionProbabilityMethod(String collisionProbabilityMethod) {
        this.collisionProbabilityMethod = collisionProbabilityMethod;
    }

    @JsonProperty("SAT1_COMMENT_SCREENING_DATA_SOURCE")
    public String getSat1CommentScreeningDataSource() {
        return sat1CommentScreeningDataSource;
    }

    @JsonProperty("SAT1_COMMENT_SCREENING_DATA_SOURCE")
    public void setSat1CommentScreeningDataSource(String sat1CommentScreeningDataSource) {
        this.sat1CommentScreeningDataSource = sat1CommentScreeningDataSource;
    }

    /**
     * The object to which the metadata and data apply
     * 
     */
    @JsonProperty("SAT1_OBJECT")
    public String getSat1Object() {
        return sat1Object;
    }

    /**
     * The object to which the metadata and data apply
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
     * 
     */
    @JsonProperty("SAT1_OBJECT_TYPE")
    public String getSat1ObjectType() {
        return sat1ObjectType;
    }

    /**
     * The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)
     * 
     */
    @JsonProperty("SAT1_OBJECT_TYPE")
    public void setSat1ObjectType(String sat1ObjectType) {
        this.sat1ObjectType = sat1ObjectType;
    }

    /**
     * Contact position of the owner/operator of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_CONTACT_POSITION")
    public String getSat1OperatorContactPosition() {
        return sat1OperatorContactPosition;
    }

    /**
     * Contact position of the owner/operator of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_CONTACT_POSITION")
    public void setSat1OperatorContactPosition(String sat1OperatorContactPosition) {
        this.sat1OperatorContactPosition = sat1OperatorContactPosition;
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
     * Phone number of the contact position or organization for the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_PHONE")
    public String getSat1OperatorPhone() {
        return sat1OperatorPhone;
    }

    /**
     * Phone number of the contact position or organization for the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_PHONE")
    public void setSat1OperatorPhone(String sat1OperatorPhone) {
        this.sat1OperatorPhone = sat1OperatorPhone;
    }

    /**
     * Email address of the contact position or organization of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_EMAIL")
    public String getSat1OperatorEmail() {
        return sat1OperatorEmail;
    }

    /**
     * Email address of the contact position or organization of the object.
     * 
     */
    @JsonProperty("SAT1_OPERATOR_EMAIL")
    public void setSat1OperatorEmail(String sat1OperatorEmail) {
        this.sat1OperatorEmail = sat1OperatorEmail;
    }

    /**
     * Unique name of the external ephemeris file used for the object or NONE. This is used to indicate whether an external (i.e., Owner/Operator [O/O] provided) ephemeris file was used to calculate the CA. If ‘NONE’ is specified, then the output of the most current Orbit Determination (OD) of the CDM originator was used in the CA. (EPHEMERIS;SATELLITE A;NONE)
     * 
     */
    @JsonProperty("SAT1_EPHEMERIS_NAME")
    public String getSat1EphemerisName() {
        return sat1EphemerisName;
    }

    /**
     * Unique name of the external ephemeris file used for the object or NONE. This is used to indicate whether an external (i.e., Owner/Operator [O/O] provided) ephemeris file was used to calculate the CA. If ‘NONE’ is specified, then the output of the most current Orbit Determination (OD) of the CDM originator was used in the CA. (EPHEMERIS;SATELLITE A;NONE)
     * 
     */
    @JsonProperty("SAT1_EPHEMERIS_NAME")
    public void setSat1EphemerisName(String sat1EphemerisName) {
        this.sat1EphemerisName = sat1EphemerisName;
    }

    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * 
     */
    @JsonProperty("SAT1_COVARIANCE_METHOD")
    public String getSat1CovarianceMethod() {
        return sat1CovarianceMethod;
    }

    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * 
     */
    @JsonProperty("SAT1_COVARIANCE_METHOD")
    public void setSat1CovarianceMethod(String sat1CovarianceMethod) {
        this.sat1CovarianceMethod = sat1CovarianceMethod;
    }

    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * 
     */
    @JsonProperty("SAT1_MANEUVERABLE")
    public String getSat1Maneuverable() {
        return sat1Maneuverable;
    }

    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * 
     */
    @JsonProperty("SAT1_MANEUVERABLE")
    public void setSat1Maneuverable(String sat1Maneuverable) {
        this.sat1Maneuverable = sat1Maneuverable;
    }

    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2. (GCRF;EME2000;ITRF)
     * 
     */
    @JsonProperty("SAT1_REF_FRAME")
    public String getSat1RefFrame() {
        return sat1RefFrame;
    }

    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2. (GCRF;EME2000;ITRF)
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
     * 
     */
    @JsonProperty("SAT1_SOLAR_RAD_PRESSURE")
    public String getSat1SolarRadPressure() {
        return sat1SolarRadPressure;
    }

    /**
     * Indication of whether solar radiation pressure perturbations were used for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_SOLAR_RAD_PRESSURE")
    public void setSat1SolarRadPressure(String sat1SolarRadPressure) {
        this.sat1SolarRadPressure = sat1SolarRadPressure;
    }

    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_EARTH_TIDES")
    public String getSat1EarthTides() {
        return sat1EarthTides;
    }

    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_EARTH_TIDES")
    public void setSat1EarthTides(String sat1EarthTides) {
        this.sat1EarthTides = sat1EarthTides;
    }

    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_INTRACK_THRUST")
    public String getSat1IntrackThrust() {
        return sat1IntrackThrust;
    }

    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_INTRACK_THRUST")
    public void setSat1IntrackThrust(String sat1IntrackThrust) {
        this.sat1IntrackThrust = sat1IntrackThrust;
    }

    @JsonProperty("SAT1_COMMENT_COVARIANCE_SCALE_FACTOR")
    public String getSat1CommentCovarianceScaleFactor() {
        return sat1CommentCovarianceScaleFactor;
    }

    @JsonProperty("SAT1_COMMENT_COVARIANCE_SCALE_FACTOR")
    public void setSat1CommentCovarianceScaleFactor(String sat1CommentCovarianceScaleFactor) {
        this.sat1CommentCovarianceScaleFactor = sat1CommentCovarianceScaleFactor;
    }

    @JsonProperty("SAT1_COMMENT_EXCLUSION_VOLUME_RADIUS")
    public String getSat1CommentExclusionVolumeRadius() {
        return sat1CommentExclusionVolumeRadius;
    }

    @JsonProperty("SAT1_COMMENT_EXCLUSION_VOLUME_RADIUS")
    public void setSat1CommentExclusionVolumeRadius(String sat1CommentExclusionVolumeRadius) {
        this.sat1CommentExclusionVolumeRadius = sat1CommentExclusionVolumeRadius;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_START")
    public String getSat1TimeLastobStart() {
        return sat1TimeLastobStart;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_START")
    public void setSat1TimeLastobStart(String sat1TimeLastobStart) {
        this.sat1TimeLastobStart = sat1TimeLastobStart;
    }

    @JsonProperty("SAT1_TIME_LASTOB_START_FRACTION")
    public String getSat1TimeLastobStartFraction() {
        return sat1TimeLastobStartFraction;
    }

    @JsonProperty("SAT1_TIME_LASTOB_START_FRACTION")
    public void setSat1TimeLastobStartFraction(String sat1TimeLastobStartFraction) {
        this.sat1TimeLastobStartFraction = sat1TimeLastobStartFraction;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_END")
    public String getSat1TimeLastobEnd() {
        return sat1TimeLastobEnd;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT1_TIME_LASTOB_END")
    public void setSat1TimeLastobEnd(String sat1TimeLastobEnd) {
        this.sat1TimeLastobEnd = sat1TimeLastobEnd;
    }

    @JsonProperty("SAT1_TIME_LASTOB_END_FRACTION")
    public String getSat1TimeLastobEndFraction() {
        return sat1TimeLastobEndFraction;
    }

    @JsonProperty("SAT1_TIME_LASTOB_END_FRACTION")
    public void setSat1TimeLastobEndFraction(String sat1TimeLastobEndFraction) {
        this.sat1TimeLastobEndFraction = sat1TimeLastobEndFraction;
    }

    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT1_RECOMMENDED_OD_SPAN")
    public String getSat1RecommendedOdSpan() {
        return sat1RecommendedOdSpan;
    }

    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT1_RECOMMENDED_OD_SPAN")
    public void setSat1RecommendedOdSpan(String sat1RecommendedOdSpan) {
        this.sat1RecommendedOdSpan = sat1RecommendedOdSpan;
    }

    @JsonProperty("SAT1_RECOMMENDED_OD_SPAN_UNIT")
    public String getSat1RecommendedOdSpanUnit() {
        return sat1RecommendedOdSpanUnit;
    }

    @JsonProperty("SAT1_RECOMMENDED_OD_SPAN_UNIT")
    public void setSat1RecommendedOdSpanUnit(String sat1RecommendedOdSpanUnit) {
        this.sat1RecommendedOdSpanUnit = sat1RecommendedOdSpanUnit;
    }

    @JsonProperty("SAT1_ACTUAL_OD_SPAN")
    public String getSat1ActualOdSpan() {
        return sat1ActualOdSpan;
    }

    @JsonProperty("SAT1_ACTUAL_OD_SPAN")
    public void setSat1ActualOdSpan(String sat1ActualOdSpan) {
        this.sat1ActualOdSpan = sat1ActualOdSpan;
    }

    @JsonProperty("SAT1_ACTUAL_OD_SPAN_UNIT")
    public String getSat1ActualOdSpanUnit() {
        return sat1ActualOdSpanUnit;
    }

    @JsonProperty("SAT1_ACTUAL_OD_SPAN_UNIT")
    public void setSat1ActualOdSpanUnit(String sat1ActualOdSpanUnit) {
        this.sat1ActualOdSpanUnit = sat1ActualOdSpanUnit;
    }

    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_AVAILABLE")
    public String getSat1ObsAvailable() {
        return sat1ObsAvailable;
    }

    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_AVAILABLE")
    public void setSat1ObsAvailable(String sat1ObsAvailable) {
        this.sat1ObsAvailable = sat1ObsAvailable;
    }

    /**
     * The number of sensor tracks accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_USED")
    public String getSat1ObsUsed() {
        return sat1ObsUsed;
    }

    /**
     * The number of sensor tracks accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT1_OBS_USED")
    public void setSat1ObsUsed(String sat1ObsUsed) {
        this.sat1ObsUsed = sat1ObsUsed;
    }

    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT1_RESIDUALS_ACCEPTED")
    public String getSat1ResidualsAccepted() {
        return sat1ResidualsAccepted;
    }

    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT1_RESIDUALS_ACCEPTED")
    public void setSat1ResidualsAccepted(String sat1ResidualsAccepted) {
        this.sat1ResidualsAccepted = sat1ResidualsAccepted;
    }

    @JsonProperty("SAT1_RESIDUALS_ACCEPTED_UNIT")
    public String getSat1ResidualsAcceptedUnit() {
        return sat1ResidualsAcceptedUnit;
    }

    @JsonProperty("SAT1_RESIDUALS_ACCEPTED_UNIT")
    public void setSat1ResidualsAcceptedUnit(String sat1ResidualsAcceptedUnit) {
        this.sat1ResidualsAcceptedUnit = sat1ResidualsAcceptedUnit;
    }

    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT1_WEIGHTED_RMS")
    public String getSat1WeightedRms() {
        return sat1WeightedRms;
    }

    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT1_WEIGHTED_RMS")
    public void setSat1WeightedRms(String sat1WeightedRms) {
        this.sat1WeightedRms = sat1WeightedRms;
    }

    @JsonProperty("SAT1_COMMENT_APOGEE")
    public String getSat1CommentApogee() {
        return sat1CommentApogee;
    }

    @JsonProperty("SAT1_COMMENT_APOGEE")
    public void setSat1CommentApogee(String sat1CommentApogee) {
        this.sat1CommentApogee = sat1CommentApogee;
    }

    @JsonProperty("SAT1_COMMENT_PERIGEE")
    public String getSat1CommentPerigee() {
        return sat1CommentPerigee;
    }

    @JsonProperty("SAT1_COMMENT_PERIGEE")
    public void setSat1CommentPerigee(String sat1CommentPerigee) {
        this.sat1CommentPerigee = sat1CommentPerigee;
    }

    @JsonProperty("SAT1_COMMENT_INCLINATION")
    public String getSat1CommentInclination() {
        return sat1CommentInclination;
    }

    @JsonProperty("SAT1_COMMENT_INCLINATION")
    public void setSat1CommentInclination(String sat1CommentInclination) {
        this.sat1CommentInclination = sat1CommentInclination;
    }

    @JsonProperty("SAT1_COMMENT_OPERATOR_HARD_BODY_RADIUS")
    public String getSat1CommentOperatorHardBodyRadius() {
        return sat1CommentOperatorHardBodyRadius;
    }

    @JsonProperty("SAT1_COMMENT_OPERATOR_HARD_BODY_RADIUS")
    public void setSat1CommentOperatorHardBodyRadius(String sat1CommentOperatorHardBodyRadius) {
        this.sat1CommentOperatorHardBodyRadius = sat1CommentOperatorHardBodyRadius;
    }

    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT1_AREA_PC")
    public String getSat1AreaPc() {
        return sat1AreaPc;
    }

    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT1_AREA_PC")
    public void setSat1AreaPc(String sat1AreaPc) {
        this.sat1AreaPc = sat1AreaPc;
    }

    @JsonProperty("SAT1_AREA_PC_UNIT")
    public String getSat1AreaPcUnit() {
        return sat1AreaPcUnit;
    }

    @JsonProperty("SAT1_AREA_PC_UNIT")
    public void setSat1AreaPcUnit(String sat1AreaPcUnit) {
        this.sat1AreaPcUnit = sat1AreaPcUnit;
    }

    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CD_AREA_OVER_MASS")
    public String getSat1CdAreaOverMass() {
        return sat1CdAreaOverMass;
    }

    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CD_AREA_OVER_MASS")
    public void setSat1CdAreaOverMass(String sat1CdAreaOverMass) {
        this.sat1CdAreaOverMass = sat1CdAreaOverMass;
    }

    @JsonProperty("SAT1_CD_AREA_OVER_MASS_UNIT")
    public String getSat1CdAreaOverMassUnit() {
        return sat1CdAreaOverMassUnit;
    }

    @JsonProperty("SAT1_CD_AREA_OVER_MASS_UNIT")
    public void setSat1CdAreaOverMassUnit(String sat1CdAreaOverMassUnit) {
        this.sat1CdAreaOverMassUnit = sat1CdAreaOverMassUnit;
    }

    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CR_AREA_OVER_MASS")
    public String getSat1CrAreaOverMass() {
        return sat1CrAreaOverMass;
    }

    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_CR_AREA_OVER_MASS")
    public void setSat1CrAreaOverMass(String sat1CrAreaOverMass) {
        this.sat1CrAreaOverMass = sat1CrAreaOverMass;
    }

    @JsonProperty("SAT1_CR_AREA_OVER_MASS_UNIT")
    public String getSat1CrAreaOverMassUnit() {
        return sat1CrAreaOverMassUnit;
    }

    @JsonProperty("SAT1_CR_AREA_OVER_MASS_UNIT")
    public void setSat1CrAreaOverMassUnit(String sat1CrAreaOverMassUnit) {
        this.sat1CrAreaOverMassUnit = sat1CrAreaOverMassUnit;
    }

    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_THRUST_ACCELERATION")
    public String getSat1ThrustAcceleration() {
        return sat1ThrustAcceleration;
    }

    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT1_THRUST_ACCELERATION")
    public void setSat1ThrustAcceleration(String sat1ThrustAcceleration) {
        this.sat1ThrustAcceleration = sat1ThrustAcceleration;
    }

    @JsonProperty("SAT1_THRUST_ACCELERATION_UNIT")
    public String getSat1ThrustAccelerationUnit() {
        return sat1ThrustAccelerationUnit;
    }

    @JsonProperty("SAT1_THRUST_ACCELERATION_UNIT")
    public void setSat1ThrustAccelerationUnit(String sat1ThrustAccelerationUnit) {
        this.sat1ThrustAccelerationUnit = sat1ThrustAccelerationUnit;
    }

    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT1_SEDR")
    public String getSat1Sedr() {
        return sat1Sedr;
    }

    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT1_SEDR")
    public void setSat1Sedr(String sat1Sedr) {
        this.sat1Sedr = sat1Sedr;
    }

    @JsonProperty("SAT1_SEDR_UNIT")
    public String getSat1SedrUnit() {
        return sat1SedrUnit;
    }

    @JsonProperty("SAT1_SEDR_UNIT")
    public void setSat1SedrUnit(String sat1SedrUnit) {
        this.sat1SedrUnit = sat1SedrUnit;
    }

    /**
     * Object position vector X component
     * 
     */
    @JsonProperty("SAT1_X")
    public String getSat1X() {
        return sat1X;
    }

    /**
     * Object position vector X component
     * 
     */
    @JsonProperty("SAT1_X")
    public void setSat1X(String sat1X) {
        this.sat1X = sat1X;
    }

    @JsonProperty("SAT1_X_UNIT")
    public String getSat1XUnit() {
        return sat1XUnit;
    }

    @JsonProperty("SAT1_X_UNIT")
    public void setSat1XUnit(String sat1XUnit) {
        this.sat1XUnit = sat1XUnit;
    }

    /**
     * Object position vector Y component
     * 
     */
    @JsonProperty("SAT1_Y")
    public String getSat1Y() {
        return sat1Y;
    }

    /**
     * Object position vector Y component
     * 
     */
    @JsonProperty("SAT1_Y")
    public void setSat1Y(String sat1Y) {
        this.sat1Y = sat1Y;
    }

    @JsonProperty("SAT1_Y_UNIT")
    public String getSat1YUnit() {
        return sat1YUnit;
    }

    @JsonProperty("SAT1_Y_UNIT")
    public void setSat1YUnit(String sat1YUnit) {
        this.sat1YUnit = sat1YUnit;
    }

    /**
     * Object position vector Z component
     * 
     */
    @JsonProperty("SAT1_Z")
    public String getSat1Z() {
        return sat1Z;
    }

    /**
     * Object position vector Z component
     * 
     */
    @JsonProperty("SAT1_Z")
    public void setSat1Z(String sat1Z) {
        this.sat1Z = sat1Z;
    }

    @JsonProperty("SAT1_Z_UNIT")
    public String getSat1ZUnit() {
        return sat1ZUnit;
    }

    @JsonProperty("SAT1_Z_UNIT")
    public void setSat1ZUnit(String sat1ZUnit) {
        this.sat1ZUnit = sat1ZUnit;
    }

    /**
     * Object position vector X_DOT component
     * 
     */
    @JsonProperty("SAT1_X_DOT")
    public String getSat1XDot() {
        return sat1XDot;
    }

    /**
     * Object position vector X_DOT component
     * 
     */
    @JsonProperty("SAT1_X_DOT")
    public void setSat1XDot(String sat1XDot) {
        this.sat1XDot = sat1XDot;
    }

    @JsonProperty("SAT1_X_DOT_UNIT")
    public String getSat1XDotUnit() {
        return sat1XDotUnit;
    }

    @JsonProperty("SAT1_X_DOT_UNIT")
    public void setSat1XDotUnit(String sat1XDotUnit) {
        this.sat1XDotUnit = sat1XDotUnit;
    }

    /**
     * Object position vector Y_DOT component
     * 
     */
    @JsonProperty("SAT1_Y_DOT")
    public String getSat1YDot() {
        return sat1YDot;
    }

    /**
     * Object position vector Y_DOT component
     * 
     */
    @JsonProperty("SAT1_Y_DOT")
    public void setSat1YDot(String sat1YDot) {
        this.sat1YDot = sat1YDot;
    }

    @JsonProperty("SAT1_Y_DOT_UNIT")
    public String getSat1YDotUnit() {
        return sat1YDotUnit;
    }

    @JsonProperty("SAT1_Y_DOT_UNIT")
    public void setSat1YDotUnit(String sat1YDotUnit) {
        this.sat1YDotUnit = sat1YDotUnit;
    }

    /**
     * Object position vector Z_DOT component
     * 
     */
    @JsonProperty("SAT1_Z_DOT")
    public String getSat1ZDot() {
        return sat1ZDot;
    }

    /**
     * Object position vector Z_DOT component
     * 
     */
    @JsonProperty("SAT1_Z_DOT")
    public void setSat1ZDot(String sat1ZDot) {
        this.sat1ZDot = sat1ZDot;
    }

    @JsonProperty("SAT1_Z_DOT_UNIT")
    public String getSat1ZDotUnit() {
        return sat1ZDotUnit;
    }

    @JsonProperty("SAT1_Z_DOT_UNIT")
    public void setSat1ZDotUnit(String sat1ZDotUnit) {
        this.sat1ZDotUnit = sat1ZDotUnit;
    }

    @JsonProperty("SAT1_COMMENT_DCP_DENSITY_FORECAST_UNCERTAINTY")
    public String getSat1CommentDcpDensityForecastUncertainty() {
        return sat1CommentDcpDensityForecastUncertainty;
    }

    @JsonProperty("SAT1_COMMENT_DCP_DENSITY_FORECAST_UNCERTAINTY")
    public void setSat1CommentDcpDensityForecastUncertainty(String sat1CommentDcpDensityForecastUncertainty) {
        this.sat1CommentDcpDensityForecastUncertainty = sat1CommentDcpDensityForecastUncertainty;
    }

    @JsonProperty("SAT1_COMMENT_DCP_SENSITIVITY_VECTOR_POSITION")
    public String getSat1CommentDcpSensitivityVectorPosition() {
        return sat1CommentDcpSensitivityVectorPosition;
    }

    @JsonProperty("SAT1_COMMENT_DCP_SENSITIVITY_VECTOR_POSITION")
    public void setSat1CommentDcpSensitivityVectorPosition(String sat1CommentDcpSensitivityVectorPosition) {
        this.sat1CommentDcpSensitivityVectorPosition = sat1CommentDcpSensitivityVectorPosition;
    }

    @JsonProperty("SAT1_COMMENT_DCP_SENSITIVITY_VECTOR_VELOCITY")
    public String getSat1CommentDcpSensitivityVectorVelocity() {
        return sat1CommentDcpSensitivityVectorVelocity;
    }

    @JsonProperty("SAT1_COMMENT_DCP_SENSITIVITY_VECTOR_VELOCITY")
    public void setSat1CommentDcpSensitivityVectorVelocity(String sat1CommentDcpSensitivityVectorVelocity) {
        this.sat1CommentDcpSensitivityVectorVelocity = sat1CommentDcpSensitivityVectorVelocity;
    }

    @JsonProperty("SAT1_CR_R")
    public String getSat1CrR() {
        return sat1CrR;
    }

    @JsonProperty("SAT1_CR_R")
    public void setSat1CrR(String sat1CrR) {
        this.sat1CrR = sat1CrR;
    }

    @JsonProperty("SAT1_CR_R_UNIT")
    public String getSat1CrRUnit() {
        return sat1CrRUnit;
    }

    @JsonProperty("SAT1_CR_R_UNIT")
    public void setSat1CrRUnit(String sat1CrRUnit) {
        this.sat1CrRUnit = sat1CrRUnit;
    }

    @JsonProperty("SAT1_CT_R")
    public String getSat1CtR() {
        return sat1CtR;
    }

    @JsonProperty("SAT1_CT_R")
    public void setSat1CtR(String sat1CtR) {
        this.sat1CtR = sat1CtR;
    }

    @JsonProperty("SAT1_CT_R_UNIT")
    public String getSat1CtRUnit() {
        return sat1CtRUnit;
    }

    @JsonProperty("SAT1_CT_R_UNIT")
    public void setSat1CtRUnit(String sat1CtRUnit) {
        this.sat1CtRUnit = sat1CtRUnit;
    }

    @JsonProperty("SAT1_CT_T")
    public String getSat1CtT() {
        return sat1CtT;
    }

    @JsonProperty("SAT1_CT_T")
    public void setSat1CtT(String sat1CtT) {
        this.sat1CtT = sat1CtT;
    }

    @JsonProperty("SAT1_CT_T_UNIT")
    public String getSat1CtTUnit() {
        return sat1CtTUnit;
    }

    @JsonProperty("SAT1_CT_T_UNIT")
    public void setSat1CtTUnit(String sat1CtTUnit) {
        this.sat1CtTUnit = sat1CtTUnit;
    }

    @JsonProperty("SAT1_CN_R")
    public String getSat1CnR() {
        return sat1CnR;
    }

    @JsonProperty("SAT1_CN_R")
    public void setSat1CnR(String sat1CnR) {
        this.sat1CnR = sat1CnR;
    }

    @JsonProperty("SAT1_CN_R_UNIT")
    public String getSat1CnRUnit() {
        return sat1CnRUnit;
    }

    @JsonProperty("SAT1_CN_R_UNIT")
    public void setSat1CnRUnit(String sat1CnRUnit) {
        this.sat1CnRUnit = sat1CnRUnit;
    }

    @JsonProperty("SAT1_CN_T")
    public String getSat1CnT() {
        return sat1CnT;
    }

    @JsonProperty("SAT1_CN_T")
    public void setSat1CnT(String sat1CnT) {
        this.sat1CnT = sat1CnT;
    }

    @JsonProperty("SAT1_CN_T_UNIT")
    public String getSat1CnTUnit() {
        return sat1CnTUnit;
    }

    @JsonProperty("SAT1_CN_T_UNIT")
    public void setSat1CnTUnit(String sat1CnTUnit) {
        this.sat1CnTUnit = sat1CnTUnit;
    }

    @JsonProperty("SAT1_CN_N")
    public String getSat1CnN() {
        return sat1CnN;
    }

    @JsonProperty("SAT1_CN_N")
    public void setSat1CnN(String sat1CnN) {
        this.sat1CnN = sat1CnN;
    }

    @JsonProperty("SAT1_CN_N_UNIT")
    public String getSat1CnNUnit() {
        return sat1CnNUnit;
    }

    @JsonProperty("SAT1_CN_N_UNIT")
    public void setSat1CnNUnit(String sat1CnNUnit) {
        this.sat1CnNUnit = sat1CnNUnit;
    }

    @JsonProperty("SAT1_CRDOT_R")
    public String getSat1CrdotR() {
        return sat1CrdotR;
    }

    @JsonProperty("SAT1_CRDOT_R")
    public void setSat1CrdotR(String sat1CrdotR) {
        this.sat1CrdotR = sat1CrdotR;
    }

    @JsonProperty("SAT1_CRDOT_R_UNIT")
    public String getSat1CrdotRUnit() {
        return sat1CrdotRUnit;
    }

    @JsonProperty("SAT1_CRDOT_R_UNIT")
    public void setSat1CrdotRUnit(String sat1CrdotRUnit) {
        this.sat1CrdotRUnit = sat1CrdotRUnit;
    }

    @JsonProperty("SAT1_CRDOT_T")
    public String getSat1CrdotT() {
        return sat1CrdotT;
    }

    @JsonProperty("SAT1_CRDOT_T")
    public void setSat1CrdotT(String sat1CrdotT) {
        this.sat1CrdotT = sat1CrdotT;
    }

    @JsonProperty("SAT1_CRDOT_T_UNIT")
    public String getSat1CrdotTUnit() {
        return sat1CrdotTUnit;
    }

    @JsonProperty("SAT1_CRDOT_T_UNIT")
    public void setSat1CrdotTUnit(String sat1CrdotTUnit) {
        this.sat1CrdotTUnit = sat1CrdotTUnit;
    }

    @JsonProperty("SAT1_CRDOT_N")
    public String getSat1CrdotN() {
        return sat1CrdotN;
    }

    @JsonProperty("SAT1_CRDOT_N")
    public void setSat1CrdotN(String sat1CrdotN) {
        this.sat1CrdotN = sat1CrdotN;
    }

    @JsonProperty("SAT1_CRDOT_N_UNIT")
    public String getSat1CrdotNUnit() {
        return sat1CrdotNUnit;
    }

    @JsonProperty("SAT1_CRDOT_N_UNIT")
    public void setSat1CrdotNUnit(String sat1CrdotNUnit) {
        this.sat1CrdotNUnit = sat1CrdotNUnit;
    }

    @JsonProperty("SAT1_CRDOT_RDOT")
    public String getSat1CrdotRdot() {
        return sat1CrdotRdot;
    }

    @JsonProperty("SAT1_CRDOT_RDOT")
    public void setSat1CrdotRdot(String sat1CrdotRdot) {
        this.sat1CrdotRdot = sat1CrdotRdot;
    }

    @JsonProperty("SAT1_CRDOT_RDOT_UNIT")
    public String getSat1CrdotRdotUnit() {
        return sat1CrdotRdotUnit;
    }

    @JsonProperty("SAT1_CRDOT_RDOT_UNIT")
    public void setSat1CrdotRdotUnit(String sat1CrdotRdotUnit) {
        this.sat1CrdotRdotUnit = sat1CrdotRdotUnit;
    }

    @JsonProperty("SAT1_CTDOT_R")
    public String getSat1CtdotR() {
        return sat1CtdotR;
    }

    @JsonProperty("SAT1_CTDOT_R")
    public void setSat1CtdotR(String sat1CtdotR) {
        this.sat1CtdotR = sat1CtdotR;
    }

    @JsonProperty("SAT1_CTDOT_R_UNIT")
    public String getSat1CtdotRUnit() {
        return sat1CtdotRUnit;
    }

    @JsonProperty("SAT1_CTDOT_R_UNIT")
    public void setSat1CtdotRUnit(String sat1CtdotRUnit) {
        this.sat1CtdotRUnit = sat1CtdotRUnit;
    }

    @JsonProperty("SAT1_CTDOT_T")
    public String getSat1CtdotT() {
        return sat1CtdotT;
    }

    @JsonProperty("SAT1_CTDOT_T")
    public void setSat1CtdotT(String sat1CtdotT) {
        this.sat1CtdotT = sat1CtdotT;
    }

    @JsonProperty("SAT1_CTDOT_T_UNIT")
    public String getSat1CtdotTUnit() {
        return sat1CtdotTUnit;
    }

    @JsonProperty("SAT1_CTDOT_T_UNIT")
    public void setSat1CtdotTUnit(String sat1CtdotTUnit) {
        this.sat1CtdotTUnit = sat1CtdotTUnit;
    }

    @JsonProperty("SAT1_CTDOT_N")
    public String getSat1CtdotN() {
        return sat1CtdotN;
    }

    @JsonProperty("SAT1_CTDOT_N")
    public void setSat1CtdotN(String sat1CtdotN) {
        this.sat1CtdotN = sat1CtdotN;
    }

    @JsonProperty("SAT1_CTDOT_N_UNIT")
    public String getSat1CtdotNUnit() {
        return sat1CtdotNUnit;
    }

    @JsonProperty("SAT1_CTDOT_N_UNIT")
    public void setSat1CtdotNUnit(String sat1CtdotNUnit) {
        this.sat1CtdotNUnit = sat1CtdotNUnit;
    }

    @JsonProperty("SAT1_CTDOT_RDOT")
    public String getSat1CtdotRdot() {
        return sat1CtdotRdot;
    }

    @JsonProperty("SAT1_CTDOT_RDOT")
    public void setSat1CtdotRdot(String sat1CtdotRdot) {
        this.sat1CtdotRdot = sat1CtdotRdot;
    }

    @JsonProperty("SAT1_CTDOT_RDOT_UNIT")
    public String getSat1CtdotRdotUnit() {
        return sat1CtdotRdotUnit;
    }

    @JsonProperty("SAT1_CTDOT_RDOT_UNIT")
    public void setSat1CtdotRdotUnit(String sat1CtdotRdotUnit) {
        this.sat1CtdotRdotUnit = sat1CtdotRdotUnit;
    }

    @JsonProperty("SAT1_CTDOT_TDOT")
    public String getSat1CtdotTdot() {
        return sat1CtdotTdot;
    }

    @JsonProperty("SAT1_CTDOT_TDOT")
    public void setSat1CtdotTdot(String sat1CtdotTdot) {
        this.sat1CtdotTdot = sat1CtdotTdot;
    }

    @JsonProperty("SAT1_CTDOT_TDOT_UNIT")
    public String getSat1CtdotTdotUnit() {
        return sat1CtdotTdotUnit;
    }

    @JsonProperty("SAT1_CTDOT_TDOT_UNIT")
    public void setSat1CtdotTdotUnit(String sat1CtdotTdotUnit) {
        this.sat1CtdotTdotUnit = sat1CtdotTdotUnit;
    }

    @JsonProperty("SAT1_CNDOT_R")
    public String getSat1CndotR() {
        return sat1CndotR;
    }

    @JsonProperty("SAT1_CNDOT_R")
    public void setSat1CndotR(String sat1CndotR) {
        this.sat1CndotR = sat1CndotR;
    }

    @JsonProperty("SAT1_CNDOT_R_UNIT")
    public String getSat1CndotRUnit() {
        return sat1CndotRUnit;
    }

    @JsonProperty("SAT1_CNDOT_R_UNIT")
    public void setSat1CndotRUnit(String sat1CndotRUnit) {
        this.sat1CndotRUnit = sat1CndotRUnit;
    }

    @JsonProperty("SAT1_CNDOT_T")
    public String getSat1CndotT() {
        return sat1CndotT;
    }

    @JsonProperty("SAT1_CNDOT_T")
    public void setSat1CndotT(String sat1CndotT) {
        this.sat1CndotT = sat1CndotT;
    }

    @JsonProperty("SAT1_CNDOT_T_UNIT")
    public String getSat1CndotTUnit() {
        return sat1CndotTUnit;
    }

    @JsonProperty("SAT1_CNDOT_T_UNIT")
    public void setSat1CndotTUnit(String sat1CndotTUnit) {
        this.sat1CndotTUnit = sat1CndotTUnit;
    }

    @JsonProperty("SAT1_CNDOT_N")
    public String getSat1CndotN() {
        return sat1CndotN;
    }

    @JsonProperty("SAT1_CNDOT_N")
    public void setSat1CndotN(String sat1CndotN) {
        this.sat1CndotN = sat1CndotN;
    }

    @JsonProperty("SAT1_CNDOT_N_UNIT")
    public String getSat1CndotNUnit() {
        return sat1CndotNUnit;
    }

    @JsonProperty("SAT1_CNDOT_N_UNIT")
    public void setSat1CndotNUnit(String sat1CndotNUnit) {
        this.sat1CndotNUnit = sat1CndotNUnit;
    }

    @JsonProperty("SAT1_CNDOT_RDOT")
    public String getSat1CndotRdot() {
        return sat1CndotRdot;
    }

    @JsonProperty("SAT1_CNDOT_RDOT")
    public void setSat1CndotRdot(String sat1CndotRdot) {
        this.sat1CndotRdot = sat1CndotRdot;
    }

    @JsonProperty("SAT1_CNDOT_RDOT_UNIT")
    public String getSat1CndotRdotUnit() {
        return sat1CndotRdotUnit;
    }

    @JsonProperty("SAT1_CNDOT_RDOT_UNIT")
    public void setSat1CndotRdotUnit(String sat1CndotRdotUnit) {
        this.sat1CndotRdotUnit = sat1CndotRdotUnit;
    }

    @JsonProperty("SAT1_CNDOT_TDOT")
    public String getSat1CndotTdot() {
        return sat1CndotTdot;
    }

    @JsonProperty("SAT1_CNDOT_TDOT")
    public void setSat1CndotTdot(String sat1CndotTdot) {
        this.sat1CndotTdot = sat1CndotTdot;
    }

    @JsonProperty("SAT1_CNDOT_TDOT_UNIT")
    public String getSat1CndotTdotUnit() {
        return sat1CndotTdotUnit;
    }

    @JsonProperty("SAT1_CNDOT_TDOT_UNIT")
    public void setSat1CndotTdotUnit(String sat1CndotTdotUnit) {
        this.sat1CndotTdotUnit = sat1CndotTdotUnit;
    }

    @JsonProperty("SAT1_CNDOT_NDOT")
    public String getSat1CndotNdot() {
        return sat1CndotNdot;
    }

    @JsonProperty("SAT1_CNDOT_NDOT")
    public void setSat1CndotNdot(String sat1CndotNdot) {
        this.sat1CndotNdot = sat1CndotNdot;
    }

    @JsonProperty("SAT1_CNDOT_NDOT_UNIT")
    public String getSat1CndotNdotUnit() {
        return sat1CndotNdotUnit;
    }

    @JsonProperty("SAT1_CNDOT_NDOT_UNIT")
    public void setSat1CndotNdotUnit(String sat1CndotNdotUnit) {
        this.sat1CndotNdotUnit = sat1CndotNdotUnit;
    }

    @JsonProperty("SAT1_CDRG_R")
    public String getSat1CdrgR() {
        return sat1CdrgR;
    }

    @JsonProperty("SAT1_CDRG_R")
    public void setSat1CdrgR(String sat1CdrgR) {
        this.sat1CdrgR = sat1CdrgR;
    }

    @JsonProperty("SAT1_CDRG_R_UNIT")
    public String getSat1CdrgRUnit() {
        return sat1CdrgRUnit;
    }

    @JsonProperty("SAT1_CDRG_R_UNIT")
    public void setSat1CdrgRUnit(String sat1CdrgRUnit) {
        this.sat1CdrgRUnit = sat1CdrgRUnit;
    }

    @JsonProperty("SAT1_CDRG_T")
    public String getSat1CdrgT() {
        return sat1CdrgT;
    }

    @JsonProperty("SAT1_CDRG_T")
    public void setSat1CdrgT(String sat1CdrgT) {
        this.sat1CdrgT = sat1CdrgT;
    }

    @JsonProperty("SAT1_CDRG_T_UNIT")
    public String getSat1CdrgTUnit() {
        return sat1CdrgTUnit;
    }

    @JsonProperty("SAT1_CDRG_T_UNIT")
    public void setSat1CdrgTUnit(String sat1CdrgTUnit) {
        this.sat1CdrgTUnit = sat1CdrgTUnit;
    }

    @JsonProperty("SAT1_CDRG_N")
    public String getSat1CdrgN() {
        return sat1CdrgN;
    }

    @JsonProperty("SAT1_CDRG_N")
    public void setSat1CdrgN(String sat1CdrgN) {
        this.sat1CdrgN = sat1CdrgN;
    }

    @JsonProperty("SAT1_CDRG_N_UNIT")
    public String getSat1CdrgNUnit() {
        return sat1CdrgNUnit;
    }

    @JsonProperty("SAT1_CDRG_N_UNIT")
    public void setSat1CdrgNUnit(String sat1CdrgNUnit) {
        this.sat1CdrgNUnit = sat1CdrgNUnit;
    }

    @JsonProperty("SAT1_CDRG_RDOT")
    public String getSat1CdrgRdot() {
        return sat1CdrgRdot;
    }

    @JsonProperty("SAT1_CDRG_RDOT")
    public void setSat1CdrgRdot(String sat1CdrgRdot) {
        this.sat1CdrgRdot = sat1CdrgRdot;
    }

    @JsonProperty("SAT1_CDRG_RDOT_UNIT")
    public String getSat1CdrgRdotUnit() {
        return sat1CdrgRdotUnit;
    }

    @JsonProperty("SAT1_CDRG_RDOT_UNIT")
    public void setSat1CdrgRdotUnit(String sat1CdrgRdotUnit) {
        this.sat1CdrgRdotUnit = sat1CdrgRdotUnit;
    }

    @JsonProperty("SAT1_CDRG_TDOT")
    public String getSat1CdrgTdot() {
        return sat1CdrgTdot;
    }

    @JsonProperty("SAT1_CDRG_TDOT")
    public void setSat1CdrgTdot(String sat1CdrgTdot) {
        this.sat1CdrgTdot = sat1CdrgTdot;
    }

    @JsonProperty("SAT1_CDRG_TDOT_UNIT")
    public String getSat1CdrgTdotUnit() {
        return sat1CdrgTdotUnit;
    }

    @JsonProperty("SAT1_CDRG_TDOT_UNIT")
    public void setSat1CdrgTdotUnit(String sat1CdrgTdotUnit) {
        this.sat1CdrgTdotUnit = sat1CdrgTdotUnit;
    }

    @JsonProperty("SAT1_CDRG_NDOT")
    public String getSat1CdrgNdot() {
        return sat1CdrgNdot;
    }

    @JsonProperty("SAT1_CDRG_NDOT")
    public void setSat1CdrgNdot(String sat1CdrgNdot) {
        this.sat1CdrgNdot = sat1CdrgNdot;
    }

    @JsonProperty("SAT1_CDRG_NDOT_UNIT")
    public String getSat1CdrgNdotUnit() {
        return sat1CdrgNdotUnit;
    }

    @JsonProperty("SAT1_CDRG_NDOT_UNIT")
    public void setSat1CdrgNdotUnit(String sat1CdrgNdotUnit) {
        this.sat1CdrgNdotUnit = sat1CdrgNdotUnit;
    }

    @JsonProperty("SAT1_CDRG_DRG")
    public String getSat1CdrgDrg() {
        return sat1CdrgDrg;
    }

    @JsonProperty("SAT1_CDRG_DRG")
    public void setSat1CdrgDrg(String sat1CdrgDrg) {
        this.sat1CdrgDrg = sat1CdrgDrg;
    }

    @JsonProperty("SAT1_CDRG_DRG_UNIT")
    public String getSat1CdrgDrgUnit() {
        return sat1CdrgDrgUnit;
    }

    @JsonProperty("SAT1_CDRG_DRG_UNIT")
    public void setSat1CdrgDrgUnit(String sat1CdrgDrgUnit) {
        this.sat1CdrgDrgUnit = sat1CdrgDrgUnit;
    }

    @JsonProperty("SAT1_CSRP_R")
    public String getSat1CsrpR() {
        return sat1CsrpR;
    }

    @JsonProperty("SAT1_CSRP_R")
    public void setSat1CsrpR(String sat1CsrpR) {
        this.sat1CsrpR = sat1CsrpR;
    }

    @JsonProperty("SAT1_CSRP_R_UNIT")
    public String getSat1CsrpRUnit() {
        return sat1CsrpRUnit;
    }

    @JsonProperty("SAT1_CSRP_R_UNIT")
    public void setSat1CsrpRUnit(String sat1CsrpRUnit) {
        this.sat1CsrpRUnit = sat1CsrpRUnit;
    }

    @JsonProperty("SAT1_CSRP_T")
    public String getSat1CsrpT() {
        return sat1CsrpT;
    }

    @JsonProperty("SAT1_CSRP_T")
    public void setSat1CsrpT(String sat1CsrpT) {
        this.sat1CsrpT = sat1CsrpT;
    }

    @JsonProperty("SAT1_CSRP_T_UNIT")
    public String getSat1CsrpTUnit() {
        return sat1CsrpTUnit;
    }

    @JsonProperty("SAT1_CSRP_T_UNIT")
    public void setSat1CsrpTUnit(String sat1CsrpTUnit) {
        this.sat1CsrpTUnit = sat1CsrpTUnit;
    }

    @JsonProperty("SAT1_CSRP_N")
    public String getSat1CsrpN() {
        return sat1CsrpN;
    }

    @JsonProperty("SAT1_CSRP_N")
    public void setSat1CsrpN(String sat1CsrpN) {
        this.sat1CsrpN = sat1CsrpN;
    }

    @JsonProperty("SAT1_CSRP_N_UNIT")
    public String getSat1CsrpNUnit() {
        return sat1CsrpNUnit;
    }

    @JsonProperty("SAT1_CSRP_N_UNIT")
    public void setSat1CsrpNUnit(String sat1CsrpNUnit) {
        this.sat1CsrpNUnit = sat1CsrpNUnit;
    }

    @JsonProperty("SAT1_CSRP_RDOT")
    public String getSat1CsrpRdot() {
        return sat1CsrpRdot;
    }

    @JsonProperty("SAT1_CSRP_RDOT")
    public void setSat1CsrpRdot(String sat1CsrpRdot) {
        this.sat1CsrpRdot = sat1CsrpRdot;
    }

    @JsonProperty("SAT1_CSRP_RDOT_UNIT")
    public String getSat1CsrpRdotUnit() {
        return sat1CsrpRdotUnit;
    }

    @JsonProperty("SAT1_CSRP_RDOT_UNIT")
    public void setSat1CsrpRdotUnit(String sat1CsrpRdotUnit) {
        this.sat1CsrpRdotUnit = sat1CsrpRdotUnit;
    }

    @JsonProperty("SAT1_CSRP_TDOT")
    public String getSat1CsrpTdot() {
        return sat1CsrpTdot;
    }

    @JsonProperty("SAT1_CSRP_TDOT")
    public void setSat1CsrpTdot(String sat1CsrpTdot) {
        this.sat1CsrpTdot = sat1CsrpTdot;
    }

    @JsonProperty("SAT1_CSRP_TDOT_UNIT")
    public String getSat1CsrpTdotUnit() {
        return sat1CsrpTdotUnit;
    }

    @JsonProperty("SAT1_CSRP_TDOT_UNIT")
    public void setSat1CsrpTdotUnit(String sat1CsrpTdotUnit) {
        this.sat1CsrpTdotUnit = sat1CsrpTdotUnit;
    }

    @JsonProperty("SAT1_CSRP_NDOT")
    public String getSat1CsrpNdot() {
        return sat1CsrpNdot;
    }

    @JsonProperty("SAT1_CSRP_NDOT")
    public void setSat1CsrpNdot(String sat1CsrpNdot) {
        this.sat1CsrpNdot = sat1CsrpNdot;
    }

    @JsonProperty("SAT1_CSRP_NDOT_UNIT")
    public String getSat1CsrpNdotUnit() {
        return sat1CsrpNdotUnit;
    }

    @JsonProperty("SAT1_CSRP_NDOT_UNIT")
    public void setSat1CsrpNdotUnit(String sat1CsrpNdotUnit) {
        this.sat1CsrpNdotUnit = sat1CsrpNdotUnit;
    }

    @JsonProperty("SAT1_CSRP_DRG")
    public String getSat1CsrpDrg() {
        return sat1CsrpDrg;
    }

    @JsonProperty("SAT1_CSRP_DRG")
    public void setSat1CsrpDrg(String sat1CsrpDrg) {
        this.sat1CsrpDrg = sat1CsrpDrg;
    }

    @JsonProperty("SAT1_CSRP_DRG_UNIT")
    public String getSat1CsrpDrgUnit() {
        return sat1CsrpDrgUnit;
    }

    @JsonProperty("SAT1_CSRP_DRG_UNIT")
    public void setSat1CsrpDrgUnit(String sat1CsrpDrgUnit) {
        this.sat1CsrpDrgUnit = sat1CsrpDrgUnit;
    }

    @JsonProperty("SAT1_CSRP_SRP")
    public String getSat1CsrpSrp() {
        return sat1CsrpSrp;
    }

    @JsonProperty("SAT1_CSRP_SRP")
    public void setSat1CsrpSrp(String sat1CsrpSrp) {
        this.sat1CsrpSrp = sat1CsrpSrp;
    }

    @JsonProperty("SAT1_CSRP_SRP_UNIT")
    public String getSat1CsrpSrpUnit() {
        return sat1CsrpSrpUnit;
    }

    @JsonProperty("SAT1_CSRP_SRP_UNIT")
    public void setSat1CsrpSrpUnit(String sat1CsrpSrpUnit) {
        this.sat1CsrpSrpUnit = sat1CsrpSrpUnit;
    }

    @JsonProperty("SAT2_COMMENT_SCREENING_DATA_SOURCE")
    public String getSat2CommentScreeningDataSource() {
        return sat2CommentScreeningDataSource;
    }

    @JsonProperty("SAT2_COMMENT_SCREENING_DATA_SOURCE")
    public void setSat2CommentScreeningDataSource(String sat2CommentScreeningDataSource) {
        this.sat2CommentScreeningDataSource = sat2CommentScreeningDataSource;
    }

    /**
     * The object to which the metadata and data apply.
     * 
     */
    @JsonProperty("SAT2_OBJECT")
    public String getSat2Object() {
        return sat2Object;
    }

    /**
     * The object to which the metadata and data apply.
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
     * 
     */
    @JsonProperty("SAT2_OBJECT_TYPE")
    public String getSat2ObjectType() {
        return sat2ObjectType;
    }

    /**
     * The object type. (PAYLOAD;ROCKET BODY;DEBRIS;UNKNOWN;OTHER)
     * 
     */
    @JsonProperty("SAT2_OBJECT_TYPE")
    public void setSat2ObjectType(String sat2ObjectType) {
        this.sat2ObjectType = sat2ObjectType;
    }

    /**
     * Contact position of the owner/operator of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_CONTACT_POSITION")
    public String getSat2OperatorContactPosition() {
        return sat2OperatorContactPosition;
    }

    /**
     * Contact position of the owner/operator of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_CONTACT_POSITION")
    public void setSat2OperatorContactPosition(String sat2OperatorContactPosition) {
        this.sat2OperatorContactPosition = sat2OperatorContactPosition;
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
     * Phone number of the contact position or organization for the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_PHONE")
    public String getSat2OperatorPhone() {
        return sat2OperatorPhone;
    }

    /**
     * Phone number of the contact position or organization for the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_PHONE")
    public void setSat2OperatorPhone(String sat2OperatorPhone) {
        this.sat2OperatorPhone = sat2OperatorPhone;
    }

    /**
     * Email address of the contact position or organization of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_EMAIL")
    public String getSat2OperatorEmail() {
        return sat2OperatorEmail;
    }

    /**
     * Email address of the contact position or organization of the object.
     * 
     */
    @JsonProperty("SAT2_OPERATOR_EMAIL")
    public void setSat2OperatorEmail(String sat2OperatorEmail) {
        this.sat2OperatorEmail = sat2OperatorEmail;
    }

    /**
     * Unique name of the external ephemeris file used for the object or NONE. This is used to indicate whether an external (i.e., Owner/Operator [O/O] provided) ephemeris file was used to calculate the CA. If ‘NONE’ is specified, then the output of the most current Orbit Determination (OD) of the CDM originator was used in the CA. (EPHEMERIS;SATELLITE A;NONE)
     * 
     */
    @JsonProperty("SAT2_EPHEMERIS_NAME")
    public String getSat2EphemerisName() {
        return sat2EphemerisName;
    }

    /**
     * Unique name of the external ephemeris file used for the object or NONE. This is used to indicate whether an external (i.e., Owner/Operator [O/O] provided) ephemeris file was used to calculate the CA. If ‘NONE’ is specified, then the output of the most current Orbit Determination (OD) of the CDM originator was used in the CA. (EPHEMERIS;SATELLITE A;NONE)
     * 
     */
    @JsonProperty("SAT2_EPHEMERIS_NAME")
    public void setSat2EphemerisName(String sat2EphemerisName) {
        this.sat2EphemerisName = sat2EphemerisName;
    }

    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * 
     */
    @JsonProperty("SAT2_COVARIANCE_METHOD")
    public String getSat2CovarianceMethod() {
        return sat2CovarianceMethod;
    }

    /**
     * Method used to calculate the covariance during the OD that produced the state vector, or whether an arbitrary, non-calculated default value was used. Caution should be used when using the default value for calculating collision probability.
     * 
     */
    @JsonProperty("SAT2_COVARIANCE_METHOD")
    public void setSat2CovarianceMethod(String sat2CovarianceMethod) {
        this.sat2CovarianceMethod = sat2CovarianceMethod;
    }

    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * 
     */
    @JsonProperty("SAT2_MANEUVERABLE")
    public String getSat2Maneuverable() {
        return sat2Maneuverable;
    }

    /**
     * The maneuver capacity of the object. (YES;NO;N/A)
     * 
     */
    @JsonProperty("SAT2_MANEUVERABLE")
    public void setSat2Maneuverable(String sat2Maneuverable) {
        this.sat2Maneuverable = sat2Maneuverable;
    }

    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2.
     * 
     */
    @JsonProperty("SAT2_REF_FRAME")
    public String getSat2RefFrame() {
        return sat2RefFrame;
    }

    /**
     * Name of the reference frame in which the state vector data are given. Value must be selected from the list of values to the right and be the same for both Object1 and Object2.
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
     * 
     */
    @JsonProperty("SAT2_SOLAR_RAD_PRESSURE")
    public String getSat2SolarRadPressure() {
        return sat2SolarRadPressure;
    }

    /**
     * Indication of whether solar radiation pressure perturbations were used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_SOLAR_RAD_PRESSURE")
    public void setSat2SolarRadPressure(String sat2SolarRadPressure) {
        this.sat2SolarRadPressure = sat2SolarRadPressure;
    }

    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_EARTH_TIDES")
    public String getSat2EarthTides() {
        return sat2EarthTides;
    }

    /**
     * Indication of whether solid Earth and ocean tides were used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_EARTH_TIDES")
    public void setSat2EarthTides(String sat2EarthTides) {
        this.sat2EarthTides = sat2EarthTides;
    }

    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_INTRACK_THRUST")
    public String getSat2IntrackThrust() {
        return sat2IntrackThrust;
    }

    /**
     * Indication of whether in-track thrust modeling was used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_INTRACK_THRUST")
    public void setSat2IntrackThrust(String sat2IntrackThrust) {
        this.sat2IntrackThrust = sat2IntrackThrust;
    }

    @JsonProperty("SAT2_COMMENT_COVARIANCE_SCALE_FACTOR")
    public String getSat2CommentCovarianceScaleFactor() {
        return sat2CommentCovarianceScaleFactor;
    }

    @JsonProperty("SAT2_COMMENT_COVARIANCE_SCALE_FACTOR")
    public void setSat2CommentCovarianceScaleFactor(String sat2CommentCovarianceScaleFactor) {
        this.sat2CommentCovarianceScaleFactor = sat2CommentCovarianceScaleFactor;
    }

    @JsonProperty("SAT2_COMMENT_EXCLUSION_VOLUME_RADIUS")
    public String getSat2CommentExclusionVolumeRadius() {
        return sat2CommentExclusionVolumeRadius;
    }

    @JsonProperty("SAT2_COMMENT_EXCLUSION_VOLUME_RADIUS")
    public void setSat2CommentExclusionVolumeRadius(String sat2CommentExclusionVolumeRadius) {
        this.sat2CommentExclusionVolumeRadius = sat2CommentExclusionVolumeRadius;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_START")
    public String getSat2TimeLastobStart() {
        return sat2TimeLastobStart;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_START")
    public void setSat2TimeLastobStart(String sat2TimeLastobStart) {
        this.sat2TimeLastobStart = sat2TimeLastobStart;
    }

    @JsonProperty("SAT2_TIME_LASTOB_START_FRACTION")
    public String getSat2TimeLastobStartFraction() {
        return sat2TimeLastobStartFraction;
    }

    @JsonProperty("SAT2_TIME_LASTOB_START_FRACTION")
    public void setSat2TimeLastobStartFraction(String sat2TimeLastobStartFraction) {
        this.sat2TimeLastobStartFraction = sat2TimeLastobStartFraction;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_END")
    public String getSat2TimeLastobEnd() {
        return sat2TimeLastobEnd;
    }

    /**
     * IsoDateTime
     * <p>
     * ISO8601 date/time definition.
     * 
     */
    @JsonProperty("SAT2_TIME_LASTOB_END")
    public void setSat2TimeLastobEnd(String sat2TimeLastobEnd) {
        this.sat2TimeLastobEnd = sat2TimeLastobEnd;
    }

    @JsonProperty("SAT2_TIME_LASTOB_END_FRACTION")
    public String getSat2TimeLastobEndFraction() {
        return sat2TimeLastobEndFraction;
    }

    @JsonProperty("SAT2_TIME_LASTOB_END_FRACTION")
    public void setSat2TimeLastobEndFraction(String sat2TimeLastobEndFraction) {
        this.sat2TimeLastobEndFraction = sat2TimeLastobEndFraction;
    }

    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT2_RECOMMENDED_OD_SPAN")
    public String getSat2RecommendedOdSpan() {
        return sat2RecommendedOdSpan;
    }

    /**
     * The recommended OD time span calculated for the object.
     * 
     */
    @JsonProperty("SAT2_RECOMMENDED_OD_SPAN")
    public void setSat2RecommendedOdSpan(String sat2RecommendedOdSpan) {
        this.sat2RecommendedOdSpan = sat2RecommendedOdSpan;
    }

    @JsonProperty("SAT2_RECOMMENDED_OD_SPAN_UNIT")
    public String getSat2RecommendedOdSpanUnit() {
        return sat2RecommendedOdSpanUnit;
    }

    @JsonProperty("SAT2_RECOMMENDED_OD_SPAN_UNIT")
    public void setSat2RecommendedOdSpanUnit(String sat2RecommendedOdSpanUnit) {
        this.sat2RecommendedOdSpanUnit = sat2RecommendedOdSpanUnit;
    }

    /**
     * Based on the observations available and the RECOMMENDED_OD_SPAN, the actual time span used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_ACTUAL_OD_SPAN")
    public String getSat2ActualOdSpan() {
        return sat2ActualOdSpan;
    }

    /**
     * Based on the observations available and the RECOMMENDED_OD_SPAN, the actual time span used for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_ACTUAL_OD_SPAN")
    public void setSat2ActualOdSpan(String sat2ActualOdSpan) {
        this.sat2ActualOdSpan = sat2ActualOdSpan;
    }

    @JsonProperty("SAT2_ACTUAL_OD_SPAN_UNIT")
    public String getSat2ActualOdSpanUnit() {
        return sat2ActualOdSpanUnit;
    }

    @JsonProperty("SAT2_ACTUAL_OD_SPAN_UNIT")
    public void setSat2ActualOdSpanUnit(String sat2ActualOdSpanUnit) {
        this.sat2ActualOdSpanUnit = sat2ActualOdSpanUnit;
    }

    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_AVAILABLE")
    public String getSat2ObsAvailable() {
        return sat2ObsAvailable;
    }

    /**
     * The number of sensor tracks available for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_AVAILABLE")
    public void setSat2ObsAvailable(String sat2ObsAvailable) {
        this.sat2ObsAvailable = sat2ObsAvailable;
    }

    /**
     * The number of observations accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_USED")
    public String getSat2ObsUsed() {
        return sat2ObsUsed;
    }

    /**
     * The number of observations accepted for the OD of the object.
     * 
     */
    @JsonProperty("SAT2_OBS_USED")
    public void setSat2ObsUsed(String sat2ObsUsed) {
        this.sat2ObsUsed = sat2ObsUsed;
    }

    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT2_RESIDUALS_ACCEPTED")
    public String getSat2ResidualsAccepted() {
        return sat2ResidualsAccepted;
    }

    /**
     * The percentage of residuals accepted in the OD of the object
     * 
     */
    @JsonProperty("SAT2_RESIDUALS_ACCEPTED")
    public void setSat2ResidualsAccepted(String sat2ResidualsAccepted) {
        this.sat2ResidualsAccepted = sat2ResidualsAccepted;
    }

    @JsonProperty("SAT2_RESIDUALS_ACCEPTED_UNIT")
    public String getSat2ResidualsAcceptedUnit() {
        return sat2ResidualsAcceptedUnit;
    }

    @JsonProperty("SAT2_RESIDUALS_ACCEPTED_UNIT")
    public void setSat2ResidualsAcceptedUnit(String sat2ResidualsAcceptedUnit) {
        this.sat2ResidualsAcceptedUnit = sat2ResidualsAcceptedUnit;
    }

    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT2_WEIGHTED_RMS")
    public String getSat2WeightedRms() {
        return sat2WeightedRms;
    }

    /**
     * The weighted Root Mean Square (RMS) of the residuals from a batch least squares OD
     * 
     */
    @JsonProperty("SAT2_WEIGHTED_RMS")
    public void setSat2WeightedRms(String sat2WeightedRms) {
        this.sat2WeightedRms = sat2WeightedRms;
    }

    @JsonProperty("SAT2_COMMENT_APOGEE")
    public String getSat2CommentApogee() {
        return sat2CommentApogee;
    }

    @JsonProperty("SAT2_COMMENT_APOGEE")
    public void setSat2CommentApogee(String sat2CommentApogee) {
        this.sat2CommentApogee = sat2CommentApogee;
    }

    @JsonProperty("SAT2_COMMENT_PERIGEE")
    public String getSat2CommentPerigee() {
        return sat2CommentPerigee;
    }

    @JsonProperty("SAT2_COMMENT_PERIGEE")
    public void setSat2CommentPerigee(String sat2CommentPerigee) {
        this.sat2CommentPerigee = sat2CommentPerigee;
    }

    @JsonProperty("SAT2_COMMENT_INCLINATION")
    public String getSat2CommentInclination() {
        return sat2CommentInclination;
    }

    @JsonProperty("SAT2_COMMENT_INCLINATION")
    public void setSat2CommentInclination(String sat2CommentInclination) {
        this.sat2CommentInclination = sat2CommentInclination;
    }

    @JsonProperty("SAT2_COMMENT_OPERATOR_HARD_BODY_RADIUS")
    public String getSat2CommentOperatorHardBodyRadius() {
        return sat2CommentOperatorHardBodyRadius;
    }

    @JsonProperty("SAT2_COMMENT_OPERATOR_HARD_BODY_RADIUS")
    public void setSat2CommentOperatorHardBodyRadius(String sat2CommentOperatorHardBodyRadius) {
        this.sat2CommentOperatorHardBodyRadius = sat2CommentOperatorHardBodyRadius;
    }

    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT2_AREA_PC")
    public String getSat2AreaPc() {
        return sat2AreaPc;
    }

    /**
     * The actual area of the object in m**2.
     * 
     */
    @JsonProperty("SAT2_AREA_PC")
    public void setSat2AreaPc(String sat2AreaPc) {
        this.sat2AreaPc = sat2AreaPc;
    }

    @JsonProperty("SAT2_AREA_PC_UNIT")
    public String getSat2AreaPcUnit() {
        return sat2AreaPcUnit;
    }

    @JsonProperty("SAT2_AREA_PC_UNIT")
    public void setSat2AreaPcUnit(String sat2AreaPcUnit) {
        this.sat2AreaPcUnit = sat2AreaPcUnit;
    }

    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CD_AREA_OVER_MASS")
    public String getSat2CdAreaOverMass() {
        return sat2CdAreaOverMass;
    }

    /**
     * The objects CD*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CD_AREA_OVER_MASS")
    public void setSat2CdAreaOverMass(String sat2CdAreaOverMass) {
        this.sat2CdAreaOverMass = sat2CdAreaOverMass;
    }

    @JsonProperty("SAT2_CD_AREA_OVER_MASS_UNIT")
    public String getSat2CdAreaOverMassUnit() {
        return sat2CdAreaOverMassUnit;
    }

    @JsonProperty("SAT2_CD_AREA_OVER_MASS_UNIT")
    public void setSat2CdAreaOverMassUnit(String sat2CdAreaOverMassUnit) {
        this.sat2CdAreaOverMassUnit = sat2CdAreaOverMassUnit;
    }

    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CR_AREA_OVER_MASS")
    public String getSat2CrAreaOverMass() {
        return sat2CrAreaOverMass;
    }

    /**
     * The objects CR*A/m used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_CR_AREA_OVER_MASS")
    public void setSat2CrAreaOverMass(String sat2CrAreaOverMass) {
        this.sat2CrAreaOverMass = sat2CrAreaOverMass;
    }

    @JsonProperty("SAT2_CR_AREA_OVER_MASS_UNIT")
    public String getSat2CrAreaOverMassUnit() {
        return sat2CrAreaOverMassUnit;
    }

    @JsonProperty("SAT2_CR_AREA_OVER_MASS_UNIT")
    public void setSat2CrAreaOverMassUnit(String sat2CrAreaOverMassUnit) {
        this.sat2CrAreaOverMassUnit = sat2CrAreaOverMassUnit;
    }

    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_THRUST_ACCELERATION")
    public String getSat2ThrustAcceleration() {
        return sat2ThrustAcceleration;
    }

    /**
     * The object's acceleration due to in-track thrust used to propagate the state vector and covariance to TCA.
     * 
     */
    @JsonProperty("SAT2_THRUST_ACCELERATION")
    public void setSat2ThrustAcceleration(String sat2ThrustAcceleration) {
        this.sat2ThrustAcceleration = sat2ThrustAcceleration;
    }

    @JsonProperty("SAT2_THRUST_ACCELERATION_UNIT")
    public String getSat2ThrustAccelerationUnit() {
        return sat2ThrustAccelerationUnit;
    }

    @JsonProperty("SAT2_THRUST_ACCELERATION_UNIT")
    public void setSat2ThrustAccelerationUnit(String sat2ThrustAccelerationUnit) {
        this.sat2ThrustAccelerationUnit = sat2ThrustAccelerationUnit;
    }

    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT2_SEDR")
    public String getSat2Sedr() {
        return sat2Sedr;
    }

    /**
     * The amount of energy being removed from the object’s orbit by atmospheric drag. This value is an average calculated during the OD.
     * 
     */
    @JsonProperty("SAT2_SEDR")
    public void setSat2Sedr(String sat2Sedr) {
        this.sat2Sedr = sat2Sedr;
    }

    @JsonProperty("SAT2_SEDR_UNIT")
    public String getSat2SedrUnit() {
        return sat2SedrUnit;
    }

    @JsonProperty("SAT2_SEDR_UNIT")
    public void setSat2SedrUnit(String sat2SedrUnit) {
        this.sat2SedrUnit = sat2SedrUnit;
    }

    /**
     * Object position vector X component
     * 
     */
    @JsonProperty("SAT2_X")
    public String getSat2X() {
        return sat2X;
    }

    /**
     * Object position vector X component
     * 
     */
    @JsonProperty("SAT2_X")
    public void setSat2X(String sat2X) {
        this.sat2X = sat2X;
    }

    @JsonProperty("SAT2_X_UNIT")
    public String getSat2XUnit() {
        return sat2XUnit;
    }

    @JsonProperty("SAT2_X_UNIT")
    public void setSat2XUnit(String sat2XUnit) {
        this.sat2XUnit = sat2XUnit;
    }

    /**
     * Object position vector Y component
     * 
     */
    @JsonProperty("SAT2_Y")
    public String getSat2Y() {
        return sat2Y;
    }

    /**
     * Object position vector Y component
     * 
     */
    @JsonProperty("SAT2_Y")
    public void setSat2Y(String sat2Y) {
        this.sat2Y = sat2Y;
    }

    @JsonProperty("SAT2_Y_UNIT")
    public String getSat2YUnit() {
        return sat2YUnit;
    }

    @JsonProperty("SAT2_Y_UNIT")
    public void setSat2YUnit(String sat2YUnit) {
        this.sat2YUnit = sat2YUnit;
    }

    /**
     * Object position vector Z component
     * 
     */
    @JsonProperty("SAT2_Z")
    public String getSat2Z() {
        return sat2Z;
    }

    /**
     * Object position vector Z component
     * 
     */
    @JsonProperty("SAT2_Z")
    public void setSat2Z(String sat2Z) {
        this.sat2Z = sat2Z;
    }

    @JsonProperty("SAT2_Z_UNIT")
    public String getSat2ZUnit() {
        return sat2ZUnit;
    }

    @JsonProperty("SAT2_Z_UNIT")
    public void setSat2ZUnit(String sat2ZUnit) {
        this.sat2ZUnit = sat2ZUnit;
    }

    /**
     * Object position vector X_DOT component
     * 
     */
    @JsonProperty("SAT2_X_DOT")
    public String getSat2XDot() {
        return sat2XDot;
    }

    /**
     * Object position vector X_DOT component
     * 
     */
    @JsonProperty("SAT2_X_DOT")
    public void setSat2XDot(String sat2XDot) {
        this.sat2XDot = sat2XDot;
    }

    @JsonProperty("SAT2_X_DOT_UNIT")
    public String getSat2XDotUnit() {
        return sat2XDotUnit;
    }

    @JsonProperty("SAT2_X_DOT_UNIT")
    public void setSat2XDotUnit(String sat2XDotUnit) {
        this.sat2XDotUnit = sat2XDotUnit;
    }

    /**
     * Object position vector Y_DOT component
     * 
     */
    @JsonProperty("SAT2_Y_DOT")
    public String getSat2YDot() {
        return sat2YDot;
    }

    /**
     * Object position vector Y_DOT component
     * 
     */
    @JsonProperty("SAT2_Y_DOT")
    public void setSat2YDot(String sat2YDot) {
        this.sat2YDot = sat2YDot;
    }

    @JsonProperty("SAT2_Y_DOT_UNIT")
    public String getSat2YDotUnit() {
        return sat2YDotUnit;
    }

    @JsonProperty("SAT2_Y_DOT_UNIT")
    public void setSat2YDotUnit(String sat2YDotUnit) {
        this.sat2YDotUnit = sat2YDotUnit;
    }

    /**
     * Object position vector Z_DOT component
     * 
     */
    @JsonProperty("SAT2_Z_DOT")
    public String getSat2ZDot() {
        return sat2ZDot;
    }

    /**
     * Object position vector Z_DOT component
     * 
     */
    @JsonProperty("SAT2_Z_DOT")
    public void setSat2ZDot(String sat2ZDot) {
        this.sat2ZDot = sat2ZDot;
    }

    @JsonProperty("SAT2_Z_DOT_UNIT")
    public String getSat2ZDotUnit() {
        return sat2ZDotUnit;
    }

    @JsonProperty("SAT2_Z_DOT_UNIT")
    public void setSat2ZDotUnit(String sat2ZDotUnit) {
        this.sat2ZDotUnit = sat2ZDotUnit;
    }

    @JsonProperty("SAT2_COMMENT_DCP_DENSITY_FORECAST_UNCERTAINTY")
    public String getSat2CommentDcpDensityForecastUncertainty() {
        return sat2CommentDcpDensityForecastUncertainty;
    }

    @JsonProperty("SAT2_COMMENT_DCP_DENSITY_FORECAST_UNCERTAINTY")
    public void setSat2CommentDcpDensityForecastUncertainty(String sat2CommentDcpDensityForecastUncertainty) {
        this.sat2CommentDcpDensityForecastUncertainty = sat2CommentDcpDensityForecastUncertainty;
    }

    @JsonProperty("SAT2_COMMENT_DCP_SENSITIVITY_VECTOR_POSITION")
    public String getSat2CommentDcpSensitivityVectorPosition() {
        return sat2CommentDcpSensitivityVectorPosition;
    }

    @JsonProperty("SAT2_COMMENT_DCP_SENSITIVITY_VECTOR_POSITION")
    public void setSat2CommentDcpSensitivityVectorPosition(String sat2CommentDcpSensitivityVectorPosition) {
        this.sat2CommentDcpSensitivityVectorPosition = sat2CommentDcpSensitivityVectorPosition;
    }

    @JsonProperty("SAT2_COMMENT_DCP_SENSITIVITY_VECTOR_VELOCITY")
    public String getSat2CommentDcpSensitivityVectorVelocity() {
        return sat2CommentDcpSensitivityVectorVelocity;
    }

    @JsonProperty("SAT2_COMMENT_DCP_SENSITIVITY_VECTOR_VELOCITY")
    public void setSat2CommentDcpSensitivityVectorVelocity(String sat2CommentDcpSensitivityVectorVelocity) {
        this.sat2CommentDcpSensitivityVectorVelocity = sat2CommentDcpSensitivityVectorVelocity;
    }

    @JsonProperty("SAT2_CR_R")
    public String getSat2CrR() {
        return sat2CrR;
    }

    @JsonProperty("SAT2_CR_R")
    public void setSat2CrR(String sat2CrR) {
        this.sat2CrR = sat2CrR;
    }

    @JsonProperty("SAT2_CR_R_UNIT")
    public String getSat2CrRUnit() {
        return sat2CrRUnit;
    }

    @JsonProperty("SAT2_CR_R_UNIT")
    public void setSat2CrRUnit(String sat2CrRUnit) {
        this.sat2CrRUnit = sat2CrRUnit;
    }

    @JsonProperty("SAT2_CT_R")
    public String getSat2CtR() {
        return sat2CtR;
    }

    @JsonProperty("SAT2_CT_R")
    public void setSat2CtR(String sat2CtR) {
        this.sat2CtR = sat2CtR;
    }

    @JsonProperty("SAT2_CT_R_UNIT")
    public String getSat2CtRUnit() {
        return sat2CtRUnit;
    }

    @JsonProperty("SAT2_CT_R_UNIT")
    public void setSat2CtRUnit(String sat2CtRUnit) {
        this.sat2CtRUnit = sat2CtRUnit;
    }

    @JsonProperty("SAT2_CT_T")
    public String getSat2CtT() {
        return sat2CtT;
    }

    @JsonProperty("SAT2_CT_T")
    public void setSat2CtT(String sat2CtT) {
        this.sat2CtT = sat2CtT;
    }

    @JsonProperty("SAT2_CT_T_UNIT")
    public String getSat2CtTUnit() {
        return sat2CtTUnit;
    }

    @JsonProperty("SAT2_CT_T_UNIT")
    public void setSat2CtTUnit(String sat2CtTUnit) {
        this.sat2CtTUnit = sat2CtTUnit;
    }

    @JsonProperty("SAT2_CN_R")
    public String getSat2CnR() {
        return sat2CnR;
    }

    @JsonProperty("SAT2_CN_R")
    public void setSat2CnR(String sat2CnR) {
        this.sat2CnR = sat2CnR;
    }

    @JsonProperty("SAT2_CN_R_UNIT")
    public String getSat2CnRUnit() {
        return sat2CnRUnit;
    }

    @JsonProperty("SAT2_CN_R_UNIT")
    public void setSat2CnRUnit(String sat2CnRUnit) {
        this.sat2CnRUnit = sat2CnRUnit;
    }

    @JsonProperty("SAT2_CN_T")
    public String getSat2CnT() {
        return sat2CnT;
    }

    @JsonProperty("SAT2_CN_T")
    public void setSat2CnT(String sat2CnT) {
        this.sat2CnT = sat2CnT;
    }

    @JsonProperty("SAT2_CN_T_UNIT")
    public String getSat2CnTUnit() {
        return sat2CnTUnit;
    }

    @JsonProperty("SAT2_CN_T_UNIT")
    public void setSat2CnTUnit(String sat2CnTUnit) {
        this.sat2CnTUnit = sat2CnTUnit;
    }

    @JsonProperty("SAT2_CN_N")
    public String getSat2CnN() {
        return sat2CnN;
    }

    @JsonProperty("SAT2_CN_N")
    public void setSat2CnN(String sat2CnN) {
        this.sat2CnN = sat2CnN;
    }

    @JsonProperty("SAT2_CN_N_UNIT")
    public String getSat2CnNUnit() {
        return sat2CnNUnit;
    }

    @JsonProperty("SAT2_CN_N_UNIT")
    public void setSat2CnNUnit(String sat2CnNUnit) {
        this.sat2CnNUnit = sat2CnNUnit;
    }

    @JsonProperty("SAT2_CRDOT_R")
    public String getSat2CrdotR() {
        return sat2CrdotR;
    }

    @JsonProperty("SAT2_CRDOT_R")
    public void setSat2CrdotR(String sat2CrdotR) {
        this.sat2CrdotR = sat2CrdotR;
    }

    @JsonProperty("SAT2_CRDOT_R_UNIT")
    public String getSat2CrdotRUnit() {
        return sat2CrdotRUnit;
    }

    @JsonProperty("SAT2_CRDOT_R_UNIT")
    public void setSat2CrdotRUnit(String sat2CrdotRUnit) {
        this.sat2CrdotRUnit = sat2CrdotRUnit;
    }

    @JsonProperty("SAT2_CRDOT_T")
    public String getSat2CrdotT() {
        return sat2CrdotT;
    }

    @JsonProperty("SAT2_CRDOT_T")
    public void setSat2CrdotT(String sat2CrdotT) {
        this.sat2CrdotT = sat2CrdotT;
    }

    @JsonProperty("SAT2_CRDOT_T_UNIT")
    public String getSat2CrdotTUnit() {
        return sat2CrdotTUnit;
    }

    @JsonProperty("SAT2_CRDOT_T_UNIT")
    public void setSat2CrdotTUnit(String sat2CrdotTUnit) {
        this.sat2CrdotTUnit = sat2CrdotTUnit;
    }

    @JsonProperty("SAT2_CRDOT_N")
    public String getSat2CrdotN() {
        return sat2CrdotN;
    }

    @JsonProperty("SAT2_CRDOT_N")
    public void setSat2CrdotN(String sat2CrdotN) {
        this.sat2CrdotN = sat2CrdotN;
    }

    @JsonProperty("SAT2_CRDOT_N_UNIT")
    public String getSat2CrdotNUnit() {
        return sat2CrdotNUnit;
    }

    @JsonProperty("SAT2_CRDOT_N_UNIT")
    public void setSat2CrdotNUnit(String sat2CrdotNUnit) {
        this.sat2CrdotNUnit = sat2CrdotNUnit;
    }

    @JsonProperty("SAT2_CRDOT_RDOT")
    public String getSat2CrdotRdot() {
        return sat2CrdotRdot;
    }

    @JsonProperty("SAT2_CRDOT_RDOT")
    public void setSat2CrdotRdot(String sat2CrdotRdot) {
        this.sat2CrdotRdot = sat2CrdotRdot;
    }

    @JsonProperty("SAT2_CRDOT_RDOT_UNIT")
    public String getSat2CrdotRdotUnit() {
        return sat2CrdotRdotUnit;
    }

    @JsonProperty("SAT2_CRDOT_RDOT_UNIT")
    public void setSat2CrdotRdotUnit(String sat2CrdotRdotUnit) {
        this.sat2CrdotRdotUnit = sat2CrdotRdotUnit;
    }

    @JsonProperty("SAT2_CTDOT_R")
    public String getSat2CtdotR() {
        return sat2CtdotR;
    }

    @JsonProperty("SAT2_CTDOT_R")
    public void setSat2CtdotR(String sat2CtdotR) {
        this.sat2CtdotR = sat2CtdotR;
    }

    @JsonProperty("SAT2_CTDOT_R_UNIT")
    public String getSat2CtdotRUnit() {
        return sat2CtdotRUnit;
    }

    @JsonProperty("SAT2_CTDOT_R_UNIT")
    public void setSat2CtdotRUnit(String sat2CtdotRUnit) {
        this.sat2CtdotRUnit = sat2CtdotRUnit;
    }

    @JsonProperty("SAT2_CTDOT_T")
    public String getSat2CtdotT() {
        return sat2CtdotT;
    }

    @JsonProperty("SAT2_CTDOT_T")
    public void setSat2CtdotT(String sat2CtdotT) {
        this.sat2CtdotT = sat2CtdotT;
    }

    @JsonProperty("SAT2_CTDOT_T_UNIT")
    public String getSat2CtdotTUnit() {
        return sat2CtdotTUnit;
    }

    @JsonProperty("SAT2_CTDOT_T_UNIT")
    public void setSat2CtdotTUnit(String sat2CtdotTUnit) {
        this.sat2CtdotTUnit = sat2CtdotTUnit;
    }

    @JsonProperty("SAT2_CTDOT_N")
    public String getSat2CtdotN() {
        return sat2CtdotN;
    }

    @JsonProperty("SAT2_CTDOT_N")
    public void setSat2CtdotN(String sat2CtdotN) {
        this.sat2CtdotN = sat2CtdotN;
    }

    @JsonProperty("SAT2_CTDOT_N_UNIT")
    public String getSat2CtdotNUnit() {
        return sat2CtdotNUnit;
    }

    @JsonProperty("SAT2_CTDOT_N_UNIT")
    public void setSat2CtdotNUnit(String sat2CtdotNUnit) {
        this.sat2CtdotNUnit = sat2CtdotNUnit;
    }

    @JsonProperty("SAT2_CTDOT_RDOT")
    public String getSat2CtdotRdot() {
        return sat2CtdotRdot;
    }

    @JsonProperty("SAT2_CTDOT_RDOT")
    public void setSat2CtdotRdot(String sat2CtdotRdot) {
        this.sat2CtdotRdot = sat2CtdotRdot;
    }

    @JsonProperty("SAT2_CTDOT_RDOT_UNIT")
    public String getSat2CtdotRdotUnit() {
        return sat2CtdotRdotUnit;
    }

    @JsonProperty("SAT2_CTDOT_RDOT_UNIT")
    public void setSat2CtdotRdotUnit(String sat2CtdotRdotUnit) {
        this.sat2CtdotRdotUnit = sat2CtdotRdotUnit;
    }

    @JsonProperty("SAT2_CTDOT_TDOT")
    public String getSat2CtdotTdot() {
        return sat2CtdotTdot;
    }

    @JsonProperty("SAT2_CTDOT_TDOT")
    public void setSat2CtdotTdot(String sat2CtdotTdot) {
        this.sat2CtdotTdot = sat2CtdotTdot;
    }

    @JsonProperty("SAT2_CTDOT_TDOT_UNIT")
    public String getSat2CtdotTdotUnit() {
        return sat2CtdotTdotUnit;
    }

    @JsonProperty("SAT2_CTDOT_TDOT_UNIT")
    public void setSat2CtdotTdotUnit(String sat2CtdotTdotUnit) {
        this.sat2CtdotTdotUnit = sat2CtdotTdotUnit;
    }

    @JsonProperty("SAT2_CNDOT_R")
    public String getSat2CndotR() {
        return sat2CndotR;
    }

    @JsonProperty("SAT2_CNDOT_R")
    public void setSat2CndotR(String sat2CndotR) {
        this.sat2CndotR = sat2CndotR;
    }

    @JsonProperty("SAT2_CNDOT_R_UNIT")
    public String getSat2CndotRUnit() {
        return sat2CndotRUnit;
    }

    @JsonProperty("SAT2_CNDOT_R_UNIT")
    public void setSat2CndotRUnit(String sat2CndotRUnit) {
        this.sat2CndotRUnit = sat2CndotRUnit;
    }

    @JsonProperty("SAT2_CNDOT_T")
    public String getSat2CndotT() {
        return sat2CndotT;
    }

    @JsonProperty("SAT2_CNDOT_T")
    public void setSat2CndotT(String sat2CndotT) {
        this.sat2CndotT = sat2CndotT;
    }

    @JsonProperty("SAT2_CNDOT_T_UNIT")
    public String getSat2CndotTUnit() {
        return sat2CndotTUnit;
    }

    @JsonProperty("SAT2_CNDOT_T_UNIT")
    public void setSat2CndotTUnit(String sat2CndotTUnit) {
        this.sat2CndotTUnit = sat2CndotTUnit;
    }

    @JsonProperty("SAT2_CNDOT_N")
    public String getSat2CndotN() {
        return sat2CndotN;
    }

    @JsonProperty("SAT2_CNDOT_N")
    public void setSat2CndotN(String sat2CndotN) {
        this.sat2CndotN = sat2CndotN;
    }

    @JsonProperty("SAT2_CNDOT_N_UNIT")
    public String getSat2CndotNUnit() {
        return sat2CndotNUnit;
    }

    @JsonProperty("SAT2_CNDOT_N_UNIT")
    public void setSat2CndotNUnit(String sat2CndotNUnit) {
        this.sat2CndotNUnit = sat2CndotNUnit;
    }

    @JsonProperty("SAT2_CNDOT_RDOT")
    public String getSat2CndotRdot() {
        return sat2CndotRdot;
    }

    @JsonProperty("SAT2_CNDOT_RDOT")
    public void setSat2CndotRdot(String sat2CndotRdot) {
        this.sat2CndotRdot = sat2CndotRdot;
    }

    @JsonProperty("SAT2_CNDOT_RDOT_UNIT")
    public String getSat2CndotRdotUnit() {
        return sat2CndotRdotUnit;
    }

    @JsonProperty("SAT2_CNDOT_RDOT_UNIT")
    public void setSat2CndotRdotUnit(String sat2CndotRdotUnit) {
        this.sat2CndotRdotUnit = sat2CndotRdotUnit;
    }

    @JsonProperty("SAT2_CNDOT_TDOT")
    public String getSat2CndotTdot() {
        return sat2CndotTdot;
    }

    @JsonProperty("SAT2_CNDOT_TDOT")
    public void setSat2CndotTdot(String sat2CndotTdot) {
        this.sat2CndotTdot = sat2CndotTdot;
    }

    @JsonProperty("SAT2_CNDOT_TDOT_UNIT")
    public String getSat2CndotTdotUnit() {
        return sat2CndotTdotUnit;
    }

    @JsonProperty("SAT2_CNDOT_TDOT_UNIT")
    public void setSat2CndotTdotUnit(String sat2CndotTdotUnit) {
        this.sat2CndotTdotUnit = sat2CndotTdotUnit;
    }

    @JsonProperty("SAT2_CNDOT_NDOT")
    public String getSat2CndotNdot() {
        return sat2CndotNdot;
    }

    @JsonProperty("SAT2_CNDOT_NDOT")
    public void setSat2CndotNdot(String sat2CndotNdot) {
        this.sat2CndotNdot = sat2CndotNdot;
    }

    @JsonProperty("SAT2_CNDOT_NDOT_UNIT")
    public String getSat2CndotNdotUnit() {
        return sat2CndotNdotUnit;
    }

    @JsonProperty("SAT2_CNDOT_NDOT_UNIT")
    public void setSat2CndotNdotUnit(String sat2CndotNdotUnit) {
        this.sat2CndotNdotUnit = sat2CndotNdotUnit;
    }

    @JsonProperty("SAT2_CDRG_R")
    public String getSat2CdrgR() {
        return sat2CdrgR;
    }

    @JsonProperty("SAT2_CDRG_R")
    public void setSat2CdrgR(String sat2CdrgR) {
        this.sat2CdrgR = sat2CdrgR;
    }

    @JsonProperty("SAT2_CDRG_R_UNIT")
    public String getSat2CdrgRUnit() {
        return sat2CdrgRUnit;
    }

    @JsonProperty("SAT2_CDRG_R_UNIT")
    public void setSat2CdrgRUnit(String sat2CdrgRUnit) {
        this.sat2CdrgRUnit = sat2CdrgRUnit;
    }

    @JsonProperty("SAT2_CDRG_T")
    public String getSat2CdrgT() {
        return sat2CdrgT;
    }

    @JsonProperty("SAT2_CDRG_T")
    public void setSat2CdrgT(String sat2CdrgT) {
        this.sat2CdrgT = sat2CdrgT;
    }

    @JsonProperty("SAT2_CDRG_T_UNIT")
    public String getSat2CdrgTUnit() {
        return sat2CdrgTUnit;
    }

    @JsonProperty("SAT2_CDRG_T_UNIT")
    public void setSat2CdrgTUnit(String sat2CdrgTUnit) {
        this.sat2CdrgTUnit = sat2CdrgTUnit;
    }

    @JsonProperty("SAT2_CDRG_N")
    public String getSat2CdrgN() {
        return sat2CdrgN;
    }

    @JsonProperty("SAT2_CDRG_N")
    public void setSat2CdrgN(String sat2CdrgN) {
        this.sat2CdrgN = sat2CdrgN;
    }

    @JsonProperty("SAT2_CDRG_N_UNIT")
    public String getSat2CdrgNUnit() {
        return sat2CdrgNUnit;
    }

    @JsonProperty("SAT2_CDRG_N_UNIT")
    public void setSat2CdrgNUnit(String sat2CdrgNUnit) {
        this.sat2CdrgNUnit = sat2CdrgNUnit;
    }

    @JsonProperty("SAT2_CDRG_RDOT")
    public String getSat2CdrgRdot() {
        return sat2CdrgRdot;
    }

    @JsonProperty("SAT2_CDRG_RDOT")
    public void setSat2CdrgRdot(String sat2CdrgRdot) {
        this.sat2CdrgRdot = sat2CdrgRdot;
    }

    @JsonProperty("SAT2_CDRG_RDOT_UNIT")
    public String getSat2CdrgRdotUnit() {
        return sat2CdrgRdotUnit;
    }

    @JsonProperty("SAT2_CDRG_RDOT_UNIT")
    public void setSat2CdrgRdotUnit(String sat2CdrgRdotUnit) {
        this.sat2CdrgRdotUnit = sat2CdrgRdotUnit;
    }

    @JsonProperty("SAT2_CDRG_TDOT")
    public String getSat2CdrgTdot() {
        return sat2CdrgTdot;
    }

    @JsonProperty("SAT2_CDRG_TDOT")
    public void setSat2CdrgTdot(String sat2CdrgTdot) {
        this.sat2CdrgTdot = sat2CdrgTdot;
    }

    @JsonProperty("SAT2_CDRG_TDOT_UNIT")
    public String getSat2CdrgTdotUnit() {
        return sat2CdrgTdotUnit;
    }

    @JsonProperty("SAT2_CDRG_TDOT_UNIT")
    public void setSat2CdrgTdotUnit(String sat2CdrgTdotUnit) {
        this.sat2CdrgTdotUnit = sat2CdrgTdotUnit;
    }

    @JsonProperty("SAT2_CDRG_NDOT")
    public String getSat2CdrgNdot() {
        return sat2CdrgNdot;
    }

    @JsonProperty("SAT2_CDRG_NDOT")
    public void setSat2CdrgNdot(String sat2CdrgNdot) {
        this.sat2CdrgNdot = sat2CdrgNdot;
    }

    @JsonProperty("SAT2_CDRG_NDOT_UNIT")
    public String getSat2CdrgNdotUnit() {
        return sat2CdrgNdotUnit;
    }

    @JsonProperty("SAT2_CDRG_NDOT_UNIT")
    public void setSat2CdrgNdotUnit(String sat2CdrgNdotUnit) {
        this.sat2CdrgNdotUnit = sat2CdrgNdotUnit;
    }

    @JsonProperty("SAT2_CDRG_DRG")
    public String getSat2CdrgDrg() {
        return sat2CdrgDrg;
    }

    @JsonProperty("SAT2_CDRG_DRG")
    public void setSat2CdrgDrg(String sat2CdrgDrg) {
        this.sat2CdrgDrg = sat2CdrgDrg;
    }

    @JsonProperty("SAT2_CDRG_DRG_UNIT")
    public String getSat2CdrgDrgUnit() {
        return sat2CdrgDrgUnit;
    }

    @JsonProperty("SAT2_CDRG_DRG_UNIT")
    public void setSat2CdrgDrgUnit(String sat2CdrgDrgUnit) {
        this.sat2CdrgDrgUnit = sat2CdrgDrgUnit;
    }

    @JsonProperty("SAT2_CSRP_R")
    public String getSat2CsrpR() {
        return sat2CsrpR;
    }

    @JsonProperty("SAT2_CSRP_R")
    public void setSat2CsrpR(String sat2CsrpR) {
        this.sat2CsrpR = sat2CsrpR;
    }

    @JsonProperty("SAT2_CSRP_R_UNIT")
    public String getSat2CsrpRUnit() {
        return sat2CsrpRUnit;
    }

    @JsonProperty("SAT2_CSRP_R_UNIT")
    public void setSat2CsrpRUnit(String sat2CsrpRUnit) {
        this.sat2CsrpRUnit = sat2CsrpRUnit;
    }

    @JsonProperty("SAT2_CSRP_T")
    public String getSat2CsrpT() {
        return sat2CsrpT;
    }

    @JsonProperty("SAT2_CSRP_T")
    public void setSat2CsrpT(String sat2CsrpT) {
        this.sat2CsrpT = sat2CsrpT;
    }

    @JsonProperty("SAT2_CSRP_T_UNIT")
    public String getSat2CsrpTUnit() {
        return sat2CsrpTUnit;
    }

    @JsonProperty("SAT2_CSRP_T_UNIT")
    public void setSat2CsrpTUnit(String sat2CsrpTUnit) {
        this.sat2CsrpTUnit = sat2CsrpTUnit;
    }

    @JsonProperty("SAT2_CSRP_N")
    public String getSat2CsrpN() {
        return sat2CsrpN;
    }

    @JsonProperty("SAT2_CSRP_N")
    public void setSat2CsrpN(String sat2CsrpN) {
        this.sat2CsrpN = sat2CsrpN;
    }

    @JsonProperty("SAT2_CSRP_N_UNIT")
    public String getSat2CsrpNUnit() {
        return sat2CsrpNUnit;
    }

    @JsonProperty("SAT2_CSRP_N_UNIT")
    public void setSat2CsrpNUnit(String sat2CsrpNUnit) {
        this.sat2CsrpNUnit = sat2CsrpNUnit;
    }

    @JsonProperty("SAT2_CSRP_RDOT")
    public String getSat2CsrpRdot() {
        return sat2CsrpRdot;
    }

    @JsonProperty("SAT2_CSRP_RDOT")
    public void setSat2CsrpRdot(String sat2CsrpRdot) {
        this.sat2CsrpRdot = sat2CsrpRdot;
    }

    @JsonProperty("SAT2_CSRP_RDOT_UNIT")
    public String getSat2CsrpRdotUnit() {
        return sat2CsrpRdotUnit;
    }

    @JsonProperty("SAT2_CSRP_RDOT_UNIT")
    public void setSat2CsrpRdotUnit(String sat2CsrpRdotUnit) {
        this.sat2CsrpRdotUnit = sat2CsrpRdotUnit;
    }

    @JsonProperty("SAT2_CSRP_TDOT")
    public String getSat2CsrpTdot() {
        return sat2CsrpTdot;
    }

    @JsonProperty("SAT2_CSRP_TDOT")
    public void setSat2CsrpTdot(String sat2CsrpTdot) {
        this.sat2CsrpTdot = sat2CsrpTdot;
    }

    @JsonProperty("SAT2_CSRP_TDOT_UNIT")
    public String getSat2CsrpTdotUnit() {
        return sat2CsrpTdotUnit;
    }

    @JsonProperty("SAT2_CSRP_TDOT_UNIT")
    public void setSat2CsrpTdotUnit(String sat2CsrpTdotUnit) {
        this.sat2CsrpTdotUnit = sat2CsrpTdotUnit;
    }

    @JsonProperty("SAT2_CSRP_NDOT")
    public String getSat2CsrpNdot() {
        return sat2CsrpNdot;
    }

    @JsonProperty("SAT2_CSRP_NDOT")
    public void setSat2CsrpNdot(String sat2CsrpNdot) {
        this.sat2CsrpNdot = sat2CsrpNdot;
    }

    @JsonProperty("SAT2_CSRP_NDOT_UNIT")
    public String getSat2CsrpNdotUnit() {
        return sat2CsrpNdotUnit;
    }

    @JsonProperty("SAT2_CSRP_NDOT_UNIT")
    public void setSat2CsrpNdotUnit(String sat2CsrpNdotUnit) {
        this.sat2CsrpNdotUnit = sat2CsrpNdotUnit;
    }

    @JsonProperty("SAT2_CSRP_DRG")
    public String getSat2CsrpDrg() {
        return sat2CsrpDrg;
    }

    @JsonProperty("SAT2_CSRP_DRG")
    public void setSat2CsrpDrg(String sat2CsrpDrg) {
        this.sat2CsrpDrg = sat2CsrpDrg;
    }

    @JsonProperty("SAT2_CSRP_DRG_UNIT")
    public String getSat2CsrpDrgUnit() {
        return sat2CsrpDrgUnit;
    }

    @JsonProperty("SAT2_CSRP_DRG_UNIT")
    public void setSat2CsrpDrgUnit(String sat2CsrpDrgUnit) {
        this.sat2CsrpDrgUnit = sat2CsrpDrgUnit;
    }

    @JsonProperty("SAT2_CSRP_SRP")
    public String getSat2CsrpSrp() {
        return sat2CsrpSrp;
    }

    @JsonProperty("SAT2_CSRP_SRP")
    public void setSat2CsrpSrp(String sat2CsrpSrp) {
        this.sat2CsrpSrp = sat2CsrpSrp;
    }

    @JsonProperty("SAT2_CSRP_SRP_UNIT")
    public String getSat2CsrpSrpUnit() {
        return sat2CsrpSrpUnit;
    }

    @JsonProperty("SAT2_CSRP_SRP_UNIT")
    public void setSat2CsrpSrpUnit(String sat2CsrpSrpUnit) {
        this.sat2CsrpSrpUnit = sat2CsrpSrpUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("GID")
    public String getGid() {
        return gid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("GID")
    public void setGid(String gid) {
        this.gid = gid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpaceTrackCdm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("constellation");
        sb.append('=');
        sb.append(((this.constellation == null)?"<null>":this.constellation));
        sb.append(',');
        sb.append("cdmId");
        sb.append('=');
        sb.append(((this.cdmId == null)?"<null>":this.cdmId));
        sb.append(',');
        sb.append("filename");
        sb.append('=');
        sb.append(((this.filename == null)?"<null>":this.filename));
        sb.append(',');
        sb.append("insertEpoch");
        sb.append('=');
        sb.append(((this.insertEpoch == null)?"<null>":this.insertEpoch));
        sb.append(',');
        sb.append("ccsdsCdmVers");
        sb.append('=');
        sb.append(((this.ccsdsCdmVers == null)?"<null>":this.ccsdsCdmVers));
        sb.append(',');
        sb.append("creationDate");
        sb.append('=');
        sb.append(((this.creationDate == null)?"<null>":this.creationDate));
        sb.append(',');
        sb.append("creationDateFraction");
        sb.append('=');
        sb.append(((this.creationDateFraction == null)?"<null>":this.creationDateFraction));
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
        sb.append("commentEmergencyReportable");
        sb.append('=');
        sb.append(((this.commentEmergencyReportable == null)?"<null>":this.commentEmergencyReportable));
        sb.append(',');
        sb.append("tca");
        sb.append('=');
        sb.append(((this.tca == null)?"<null>":this.tca));
        sb.append(',');
        sb.append("tcaFraction");
        sb.append('=');
        sb.append(((this.tcaFraction == null)?"<null>":this.tcaFraction));
        sb.append(',');
        sb.append("missDistance");
        sb.append('=');
        sb.append(((this.missDistance == null)?"<null>":this.missDistance));
        sb.append(',');
        sb.append("missDistanceUnit");
        sb.append('=');
        sb.append(((this.missDistanceUnit == null)?"<null>":this.missDistanceUnit));
        sb.append(',');
        sb.append("relativeSpeed");
        sb.append('=');
        sb.append(((this.relativeSpeed == null)?"<null>":this.relativeSpeed));
        sb.append(',');
        sb.append("relativeSpeedUnit");
        sb.append('=');
        sb.append(((this.relativeSpeedUnit == null)?"<null>":this.relativeSpeedUnit));
        sb.append(',');
        sb.append("relativePositionR");
        sb.append('=');
        sb.append(((this.relativePositionR == null)?"<null>":this.relativePositionR));
        sb.append(',');
        sb.append("relativePositionRUnit");
        sb.append('=');
        sb.append(((this.relativePositionRUnit == null)?"<null>":this.relativePositionRUnit));
        sb.append(',');
        sb.append("relativePositionT");
        sb.append('=');
        sb.append(((this.relativePositionT == null)?"<null>":this.relativePositionT));
        sb.append(',');
        sb.append("relativePositionTUnit");
        sb.append('=');
        sb.append(((this.relativePositionTUnit == null)?"<null>":this.relativePositionTUnit));
        sb.append(',');
        sb.append("relativePositionN");
        sb.append('=');
        sb.append(((this.relativePositionN == null)?"<null>":this.relativePositionN));
        sb.append(',');
        sb.append("relativePositionNUnit");
        sb.append('=');
        sb.append(((this.relativePositionNUnit == null)?"<null>":this.relativePositionNUnit));
        sb.append(',');
        sb.append("relativeVelocityR");
        sb.append('=');
        sb.append(((this.relativeVelocityR == null)?"<null>":this.relativeVelocityR));
        sb.append(',');
        sb.append("relativeVelocityRUnit");
        sb.append('=');
        sb.append(((this.relativeVelocityRUnit == null)?"<null>":this.relativeVelocityRUnit));
        sb.append(',');
        sb.append("relativeVelocityT");
        sb.append('=');
        sb.append(((this.relativeVelocityT == null)?"<null>":this.relativeVelocityT));
        sb.append(',');
        sb.append("relativeVelocityTUnit");
        sb.append('=');
        sb.append(((this.relativeVelocityTUnit == null)?"<null>":this.relativeVelocityTUnit));
        sb.append(',');
        sb.append("relativeVelocityN");
        sb.append('=');
        sb.append(((this.relativeVelocityN == null)?"<null>":this.relativeVelocityN));
        sb.append(',');
        sb.append("relativeVelocityNUnit");
        sb.append('=');
        sb.append(((this.relativeVelocityNUnit == null)?"<null>":this.relativeVelocityNUnit));
        sb.append(',');
        sb.append("commentScreeningOption");
        sb.append('=');
        sb.append(((this.commentScreeningOption == null)?"<null>":this.commentScreeningOption));
        sb.append(',');
        sb.append("collisionProbability");
        sb.append('=');
        sb.append(((this.collisionProbability == null)?"<null>":this.collisionProbability));
        sb.append(',');
        sb.append("collisionProbabilityMethod");
        sb.append('=');
        sb.append(((this.collisionProbabilityMethod == null)?"<null>":this.collisionProbabilityMethod));
        sb.append(',');
        sb.append("sat1CommentScreeningDataSource");
        sb.append('=');
        sb.append(((this.sat1CommentScreeningDataSource == null)?"<null>":this.sat1CommentScreeningDataSource));
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
        sb.append("sat1OperatorContactPosition");
        sb.append('=');
        sb.append(((this.sat1OperatorContactPosition == null)?"<null>":this.sat1OperatorContactPosition));
        sb.append(',');
        sb.append("sat1OperatorOrganization");
        sb.append('=');
        sb.append(((this.sat1OperatorOrganization == null)?"<null>":this.sat1OperatorOrganization));
        sb.append(',');
        sb.append("sat1OperatorPhone");
        sb.append('=');
        sb.append(((this.sat1OperatorPhone == null)?"<null>":this.sat1OperatorPhone));
        sb.append(',');
        sb.append("sat1OperatorEmail");
        sb.append('=');
        sb.append(((this.sat1OperatorEmail == null)?"<null>":this.sat1OperatorEmail));
        sb.append(',');
        sb.append("sat1EphemerisName");
        sb.append('=');
        sb.append(((this.sat1EphemerisName == null)?"<null>":this.sat1EphemerisName));
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
        sb.append("sat1CommentCovarianceScaleFactor");
        sb.append('=');
        sb.append(((this.sat1CommentCovarianceScaleFactor == null)?"<null>":this.sat1CommentCovarianceScaleFactor));
        sb.append(',');
        sb.append("sat1CommentExclusionVolumeRadius");
        sb.append('=');
        sb.append(((this.sat1CommentExclusionVolumeRadius == null)?"<null>":this.sat1CommentExclusionVolumeRadius));
        sb.append(',');
        sb.append("sat1TimeLastobStart");
        sb.append('=');
        sb.append(((this.sat1TimeLastobStart == null)?"<null>":this.sat1TimeLastobStart));
        sb.append(',');
        sb.append("sat1TimeLastobStartFraction");
        sb.append('=');
        sb.append(((this.sat1TimeLastobStartFraction == null)?"<null>":this.sat1TimeLastobStartFraction));
        sb.append(',');
        sb.append("sat1TimeLastobEnd");
        sb.append('=');
        sb.append(((this.sat1TimeLastobEnd == null)?"<null>":this.sat1TimeLastobEnd));
        sb.append(',');
        sb.append("sat1TimeLastobEndFraction");
        sb.append('=');
        sb.append(((this.sat1TimeLastobEndFraction == null)?"<null>":this.sat1TimeLastobEndFraction));
        sb.append(',');
        sb.append("sat1RecommendedOdSpan");
        sb.append('=');
        sb.append(((this.sat1RecommendedOdSpan == null)?"<null>":this.sat1RecommendedOdSpan));
        sb.append(',');
        sb.append("sat1RecommendedOdSpanUnit");
        sb.append('=');
        sb.append(((this.sat1RecommendedOdSpanUnit == null)?"<null>":this.sat1RecommendedOdSpanUnit));
        sb.append(',');
        sb.append("sat1ActualOdSpan");
        sb.append('=');
        sb.append(((this.sat1ActualOdSpan == null)?"<null>":this.sat1ActualOdSpan));
        sb.append(',');
        sb.append("sat1ActualOdSpanUnit");
        sb.append('=');
        sb.append(((this.sat1ActualOdSpanUnit == null)?"<null>":this.sat1ActualOdSpanUnit));
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
        sb.append("sat1ResidualsAcceptedUnit");
        sb.append('=');
        sb.append(((this.sat1ResidualsAcceptedUnit == null)?"<null>":this.sat1ResidualsAcceptedUnit));
        sb.append(',');
        sb.append("sat1WeightedRms");
        sb.append('=');
        sb.append(((this.sat1WeightedRms == null)?"<null>":this.sat1WeightedRms));
        sb.append(',');
        sb.append("sat1CommentApogee");
        sb.append('=');
        sb.append(((this.sat1CommentApogee == null)?"<null>":this.sat1CommentApogee));
        sb.append(',');
        sb.append("sat1CommentPerigee");
        sb.append('=');
        sb.append(((this.sat1CommentPerigee == null)?"<null>":this.sat1CommentPerigee));
        sb.append(',');
        sb.append("sat1CommentInclination");
        sb.append('=');
        sb.append(((this.sat1CommentInclination == null)?"<null>":this.sat1CommentInclination));
        sb.append(',');
        sb.append("sat1CommentOperatorHardBodyRadius");
        sb.append('=');
        sb.append(((this.sat1CommentOperatorHardBodyRadius == null)?"<null>":this.sat1CommentOperatorHardBodyRadius));
        sb.append(',');
        sb.append("sat1AreaPc");
        sb.append('=');
        sb.append(((this.sat1AreaPc == null)?"<null>":this.sat1AreaPc));
        sb.append(',');
        sb.append("sat1AreaPcUnit");
        sb.append('=');
        sb.append(((this.sat1AreaPcUnit == null)?"<null>":this.sat1AreaPcUnit));
        sb.append(',');
        sb.append("sat1CdAreaOverMass");
        sb.append('=');
        sb.append(((this.sat1CdAreaOverMass == null)?"<null>":this.sat1CdAreaOverMass));
        sb.append(',');
        sb.append("sat1CdAreaOverMassUnit");
        sb.append('=');
        sb.append(((this.sat1CdAreaOverMassUnit == null)?"<null>":this.sat1CdAreaOverMassUnit));
        sb.append(',');
        sb.append("sat1CrAreaOverMass");
        sb.append('=');
        sb.append(((this.sat1CrAreaOverMass == null)?"<null>":this.sat1CrAreaOverMass));
        sb.append(',');
        sb.append("sat1CrAreaOverMassUnit");
        sb.append('=');
        sb.append(((this.sat1CrAreaOverMassUnit == null)?"<null>":this.sat1CrAreaOverMassUnit));
        sb.append(',');
        sb.append("sat1ThrustAcceleration");
        sb.append('=');
        sb.append(((this.sat1ThrustAcceleration == null)?"<null>":this.sat1ThrustAcceleration));
        sb.append(',');
        sb.append("sat1ThrustAccelerationUnit");
        sb.append('=');
        sb.append(((this.sat1ThrustAccelerationUnit == null)?"<null>":this.sat1ThrustAccelerationUnit));
        sb.append(',');
        sb.append("sat1Sedr");
        sb.append('=');
        sb.append(((this.sat1Sedr == null)?"<null>":this.sat1Sedr));
        sb.append(',');
        sb.append("sat1SedrUnit");
        sb.append('=');
        sb.append(((this.sat1SedrUnit == null)?"<null>":this.sat1SedrUnit));
        sb.append(',');
        sb.append("sat1X");
        sb.append('=');
        sb.append(((this.sat1X == null)?"<null>":this.sat1X));
        sb.append(',');
        sb.append("sat1XUnit");
        sb.append('=');
        sb.append(((this.sat1XUnit == null)?"<null>":this.sat1XUnit));
        sb.append(',');
        sb.append("sat1Y");
        sb.append('=');
        sb.append(((this.sat1Y == null)?"<null>":this.sat1Y));
        sb.append(',');
        sb.append("sat1YUnit");
        sb.append('=');
        sb.append(((this.sat1YUnit == null)?"<null>":this.sat1YUnit));
        sb.append(',');
        sb.append("sat1Z");
        sb.append('=');
        sb.append(((this.sat1Z == null)?"<null>":this.sat1Z));
        sb.append(',');
        sb.append("sat1ZUnit");
        sb.append('=');
        sb.append(((this.sat1ZUnit == null)?"<null>":this.sat1ZUnit));
        sb.append(',');
        sb.append("sat1XDot");
        sb.append('=');
        sb.append(((this.sat1XDot == null)?"<null>":this.sat1XDot));
        sb.append(',');
        sb.append("sat1XDotUnit");
        sb.append('=');
        sb.append(((this.sat1XDotUnit == null)?"<null>":this.sat1XDotUnit));
        sb.append(',');
        sb.append("sat1YDot");
        sb.append('=');
        sb.append(((this.sat1YDot == null)?"<null>":this.sat1YDot));
        sb.append(',');
        sb.append("sat1YDotUnit");
        sb.append('=');
        sb.append(((this.sat1YDotUnit == null)?"<null>":this.sat1YDotUnit));
        sb.append(',');
        sb.append("sat1ZDot");
        sb.append('=');
        sb.append(((this.sat1ZDot == null)?"<null>":this.sat1ZDot));
        sb.append(',');
        sb.append("sat1ZDotUnit");
        sb.append('=');
        sb.append(((this.sat1ZDotUnit == null)?"<null>":this.sat1ZDotUnit));
        sb.append(',');
        sb.append("sat1CommentDcpDensityForecastUncertainty");
        sb.append('=');
        sb.append(((this.sat1CommentDcpDensityForecastUncertainty == null)?"<null>":this.sat1CommentDcpDensityForecastUncertainty));
        sb.append(',');
        sb.append("sat1CommentDcpSensitivityVectorPosition");
        sb.append('=');
        sb.append(((this.sat1CommentDcpSensitivityVectorPosition == null)?"<null>":this.sat1CommentDcpSensitivityVectorPosition));
        sb.append(',');
        sb.append("sat1CommentDcpSensitivityVectorVelocity");
        sb.append('=');
        sb.append(((this.sat1CommentDcpSensitivityVectorVelocity == null)?"<null>":this.sat1CommentDcpSensitivityVectorVelocity));
        sb.append(',');
        sb.append("sat1CrR");
        sb.append('=');
        sb.append(((this.sat1CrR == null)?"<null>":this.sat1CrR));
        sb.append(',');
        sb.append("sat1CrRUnit");
        sb.append('=');
        sb.append(((this.sat1CrRUnit == null)?"<null>":this.sat1CrRUnit));
        sb.append(',');
        sb.append("sat1CtR");
        sb.append('=');
        sb.append(((this.sat1CtR == null)?"<null>":this.sat1CtR));
        sb.append(',');
        sb.append("sat1CtRUnit");
        sb.append('=');
        sb.append(((this.sat1CtRUnit == null)?"<null>":this.sat1CtRUnit));
        sb.append(',');
        sb.append("sat1CtT");
        sb.append('=');
        sb.append(((this.sat1CtT == null)?"<null>":this.sat1CtT));
        sb.append(',');
        sb.append("sat1CtTUnit");
        sb.append('=');
        sb.append(((this.sat1CtTUnit == null)?"<null>":this.sat1CtTUnit));
        sb.append(',');
        sb.append("sat1CnR");
        sb.append('=');
        sb.append(((this.sat1CnR == null)?"<null>":this.sat1CnR));
        sb.append(',');
        sb.append("sat1CnRUnit");
        sb.append('=');
        sb.append(((this.sat1CnRUnit == null)?"<null>":this.sat1CnRUnit));
        sb.append(',');
        sb.append("sat1CnT");
        sb.append('=');
        sb.append(((this.sat1CnT == null)?"<null>":this.sat1CnT));
        sb.append(',');
        sb.append("sat1CnTUnit");
        sb.append('=');
        sb.append(((this.sat1CnTUnit == null)?"<null>":this.sat1CnTUnit));
        sb.append(',');
        sb.append("sat1CnN");
        sb.append('=');
        sb.append(((this.sat1CnN == null)?"<null>":this.sat1CnN));
        sb.append(',');
        sb.append("sat1CnNUnit");
        sb.append('=');
        sb.append(((this.sat1CnNUnit == null)?"<null>":this.sat1CnNUnit));
        sb.append(',');
        sb.append("sat1CrdotR");
        sb.append('=');
        sb.append(((this.sat1CrdotR == null)?"<null>":this.sat1CrdotR));
        sb.append(',');
        sb.append("sat1CrdotRUnit");
        sb.append('=');
        sb.append(((this.sat1CrdotRUnit == null)?"<null>":this.sat1CrdotRUnit));
        sb.append(',');
        sb.append("sat1CrdotT");
        sb.append('=');
        sb.append(((this.sat1CrdotT == null)?"<null>":this.sat1CrdotT));
        sb.append(',');
        sb.append("sat1CrdotTUnit");
        sb.append('=');
        sb.append(((this.sat1CrdotTUnit == null)?"<null>":this.sat1CrdotTUnit));
        sb.append(',');
        sb.append("sat1CrdotN");
        sb.append('=');
        sb.append(((this.sat1CrdotN == null)?"<null>":this.sat1CrdotN));
        sb.append(',');
        sb.append("sat1CrdotNUnit");
        sb.append('=');
        sb.append(((this.sat1CrdotNUnit == null)?"<null>":this.sat1CrdotNUnit));
        sb.append(',');
        sb.append("sat1CrdotRdot");
        sb.append('=');
        sb.append(((this.sat1CrdotRdot == null)?"<null>":this.sat1CrdotRdot));
        sb.append(',');
        sb.append("sat1CrdotRdotUnit");
        sb.append('=');
        sb.append(((this.sat1CrdotRdotUnit == null)?"<null>":this.sat1CrdotRdotUnit));
        sb.append(',');
        sb.append("sat1CtdotR");
        sb.append('=');
        sb.append(((this.sat1CtdotR == null)?"<null>":this.sat1CtdotR));
        sb.append(',');
        sb.append("sat1CtdotRUnit");
        sb.append('=');
        sb.append(((this.sat1CtdotRUnit == null)?"<null>":this.sat1CtdotRUnit));
        sb.append(',');
        sb.append("sat1CtdotT");
        sb.append('=');
        sb.append(((this.sat1CtdotT == null)?"<null>":this.sat1CtdotT));
        sb.append(',');
        sb.append("sat1CtdotTUnit");
        sb.append('=');
        sb.append(((this.sat1CtdotTUnit == null)?"<null>":this.sat1CtdotTUnit));
        sb.append(',');
        sb.append("sat1CtdotN");
        sb.append('=');
        sb.append(((this.sat1CtdotN == null)?"<null>":this.sat1CtdotN));
        sb.append(',');
        sb.append("sat1CtdotNUnit");
        sb.append('=');
        sb.append(((this.sat1CtdotNUnit == null)?"<null>":this.sat1CtdotNUnit));
        sb.append(',');
        sb.append("sat1CtdotRdot");
        sb.append('=');
        sb.append(((this.sat1CtdotRdot == null)?"<null>":this.sat1CtdotRdot));
        sb.append(',');
        sb.append("sat1CtdotRdotUnit");
        sb.append('=');
        sb.append(((this.sat1CtdotRdotUnit == null)?"<null>":this.sat1CtdotRdotUnit));
        sb.append(',');
        sb.append("sat1CtdotTdot");
        sb.append('=');
        sb.append(((this.sat1CtdotTdot == null)?"<null>":this.sat1CtdotTdot));
        sb.append(',');
        sb.append("sat1CtdotTdotUnit");
        sb.append('=');
        sb.append(((this.sat1CtdotTdotUnit == null)?"<null>":this.sat1CtdotTdotUnit));
        sb.append(',');
        sb.append("sat1CndotR");
        sb.append('=');
        sb.append(((this.sat1CndotR == null)?"<null>":this.sat1CndotR));
        sb.append(',');
        sb.append("sat1CndotRUnit");
        sb.append('=');
        sb.append(((this.sat1CndotRUnit == null)?"<null>":this.sat1CndotRUnit));
        sb.append(',');
        sb.append("sat1CndotT");
        sb.append('=');
        sb.append(((this.sat1CndotT == null)?"<null>":this.sat1CndotT));
        sb.append(',');
        sb.append("sat1CndotTUnit");
        sb.append('=');
        sb.append(((this.sat1CndotTUnit == null)?"<null>":this.sat1CndotTUnit));
        sb.append(',');
        sb.append("sat1CndotN");
        sb.append('=');
        sb.append(((this.sat1CndotN == null)?"<null>":this.sat1CndotN));
        sb.append(',');
        sb.append("sat1CndotNUnit");
        sb.append('=');
        sb.append(((this.sat1CndotNUnit == null)?"<null>":this.sat1CndotNUnit));
        sb.append(',');
        sb.append("sat1CndotRdot");
        sb.append('=');
        sb.append(((this.sat1CndotRdot == null)?"<null>":this.sat1CndotRdot));
        sb.append(',');
        sb.append("sat1CndotRdotUnit");
        sb.append('=');
        sb.append(((this.sat1CndotRdotUnit == null)?"<null>":this.sat1CndotRdotUnit));
        sb.append(',');
        sb.append("sat1CndotTdot");
        sb.append('=');
        sb.append(((this.sat1CndotTdot == null)?"<null>":this.sat1CndotTdot));
        sb.append(',');
        sb.append("sat1CndotTdotUnit");
        sb.append('=');
        sb.append(((this.sat1CndotTdotUnit == null)?"<null>":this.sat1CndotTdotUnit));
        sb.append(',');
        sb.append("sat1CndotNdot");
        sb.append('=');
        sb.append(((this.sat1CndotNdot == null)?"<null>":this.sat1CndotNdot));
        sb.append(',');
        sb.append("sat1CndotNdotUnit");
        sb.append('=');
        sb.append(((this.sat1CndotNdotUnit == null)?"<null>":this.sat1CndotNdotUnit));
        sb.append(',');
        sb.append("sat1CdrgR");
        sb.append('=');
        sb.append(((this.sat1CdrgR == null)?"<null>":this.sat1CdrgR));
        sb.append(',');
        sb.append("sat1CdrgRUnit");
        sb.append('=');
        sb.append(((this.sat1CdrgRUnit == null)?"<null>":this.sat1CdrgRUnit));
        sb.append(',');
        sb.append("sat1CdrgT");
        sb.append('=');
        sb.append(((this.sat1CdrgT == null)?"<null>":this.sat1CdrgT));
        sb.append(',');
        sb.append("sat1CdrgTUnit");
        sb.append('=');
        sb.append(((this.sat1CdrgTUnit == null)?"<null>":this.sat1CdrgTUnit));
        sb.append(',');
        sb.append("sat1CdrgN");
        sb.append('=');
        sb.append(((this.sat1CdrgN == null)?"<null>":this.sat1CdrgN));
        sb.append(',');
        sb.append("sat1CdrgNUnit");
        sb.append('=');
        sb.append(((this.sat1CdrgNUnit == null)?"<null>":this.sat1CdrgNUnit));
        sb.append(',');
        sb.append("sat1CdrgRdot");
        sb.append('=');
        sb.append(((this.sat1CdrgRdot == null)?"<null>":this.sat1CdrgRdot));
        sb.append(',');
        sb.append("sat1CdrgRdotUnit");
        sb.append('=');
        sb.append(((this.sat1CdrgRdotUnit == null)?"<null>":this.sat1CdrgRdotUnit));
        sb.append(',');
        sb.append("sat1CdrgTdot");
        sb.append('=');
        sb.append(((this.sat1CdrgTdot == null)?"<null>":this.sat1CdrgTdot));
        sb.append(',');
        sb.append("sat1CdrgTdotUnit");
        sb.append('=');
        sb.append(((this.sat1CdrgTdotUnit == null)?"<null>":this.sat1CdrgTdotUnit));
        sb.append(',');
        sb.append("sat1CdrgNdot");
        sb.append('=');
        sb.append(((this.sat1CdrgNdot == null)?"<null>":this.sat1CdrgNdot));
        sb.append(',');
        sb.append("sat1CdrgNdotUnit");
        sb.append('=');
        sb.append(((this.sat1CdrgNdotUnit == null)?"<null>":this.sat1CdrgNdotUnit));
        sb.append(',');
        sb.append("sat1CdrgDrg");
        sb.append('=');
        sb.append(((this.sat1CdrgDrg == null)?"<null>":this.sat1CdrgDrg));
        sb.append(',');
        sb.append("sat1CdrgDrgUnit");
        sb.append('=');
        sb.append(((this.sat1CdrgDrgUnit == null)?"<null>":this.sat1CdrgDrgUnit));
        sb.append(',');
        sb.append("sat1CsrpR");
        sb.append('=');
        sb.append(((this.sat1CsrpR == null)?"<null>":this.sat1CsrpR));
        sb.append(',');
        sb.append("sat1CsrpRUnit");
        sb.append('=');
        sb.append(((this.sat1CsrpRUnit == null)?"<null>":this.sat1CsrpRUnit));
        sb.append(',');
        sb.append("sat1CsrpT");
        sb.append('=');
        sb.append(((this.sat1CsrpT == null)?"<null>":this.sat1CsrpT));
        sb.append(',');
        sb.append("sat1CsrpTUnit");
        sb.append('=');
        sb.append(((this.sat1CsrpTUnit == null)?"<null>":this.sat1CsrpTUnit));
        sb.append(',');
        sb.append("sat1CsrpN");
        sb.append('=');
        sb.append(((this.sat1CsrpN == null)?"<null>":this.sat1CsrpN));
        sb.append(',');
        sb.append("sat1CsrpNUnit");
        sb.append('=');
        sb.append(((this.sat1CsrpNUnit == null)?"<null>":this.sat1CsrpNUnit));
        sb.append(',');
        sb.append("sat1CsrpRdot");
        sb.append('=');
        sb.append(((this.sat1CsrpRdot == null)?"<null>":this.sat1CsrpRdot));
        sb.append(',');
        sb.append("sat1CsrpRdotUnit");
        sb.append('=');
        sb.append(((this.sat1CsrpRdotUnit == null)?"<null>":this.sat1CsrpRdotUnit));
        sb.append(',');
        sb.append("sat1CsrpTdot");
        sb.append('=');
        sb.append(((this.sat1CsrpTdot == null)?"<null>":this.sat1CsrpTdot));
        sb.append(',');
        sb.append("sat1CsrpTdotUnit");
        sb.append('=');
        sb.append(((this.sat1CsrpTdotUnit == null)?"<null>":this.sat1CsrpTdotUnit));
        sb.append(',');
        sb.append("sat1CsrpNdot");
        sb.append('=');
        sb.append(((this.sat1CsrpNdot == null)?"<null>":this.sat1CsrpNdot));
        sb.append(',');
        sb.append("sat1CsrpNdotUnit");
        sb.append('=');
        sb.append(((this.sat1CsrpNdotUnit == null)?"<null>":this.sat1CsrpNdotUnit));
        sb.append(',');
        sb.append("sat1CsrpDrg");
        sb.append('=');
        sb.append(((this.sat1CsrpDrg == null)?"<null>":this.sat1CsrpDrg));
        sb.append(',');
        sb.append("sat1CsrpDrgUnit");
        sb.append('=');
        sb.append(((this.sat1CsrpDrgUnit == null)?"<null>":this.sat1CsrpDrgUnit));
        sb.append(',');
        sb.append("sat1CsrpSrp");
        sb.append('=');
        sb.append(((this.sat1CsrpSrp == null)?"<null>":this.sat1CsrpSrp));
        sb.append(',');
        sb.append("sat1CsrpSrpUnit");
        sb.append('=');
        sb.append(((this.sat1CsrpSrpUnit == null)?"<null>":this.sat1CsrpSrpUnit));
        sb.append(',');
        sb.append("sat2CommentScreeningDataSource");
        sb.append('=');
        sb.append(((this.sat2CommentScreeningDataSource == null)?"<null>":this.sat2CommentScreeningDataSource));
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
        sb.append("sat2OperatorContactPosition");
        sb.append('=');
        sb.append(((this.sat2OperatorContactPosition == null)?"<null>":this.sat2OperatorContactPosition));
        sb.append(',');
        sb.append("sat2OperatorOrganization");
        sb.append('=');
        sb.append(((this.sat2OperatorOrganization == null)?"<null>":this.sat2OperatorOrganization));
        sb.append(',');
        sb.append("sat2OperatorPhone");
        sb.append('=');
        sb.append(((this.sat2OperatorPhone == null)?"<null>":this.sat2OperatorPhone));
        sb.append(',');
        sb.append("sat2OperatorEmail");
        sb.append('=');
        sb.append(((this.sat2OperatorEmail == null)?"<null>":this.sat2OperatorEmail));
        sb.append(',');
        sb.append("sat2EphemerisName");
        sb.append('=');
        sb.append(((this.sat2EphemerisName == null)?"<null>":this.sat2EphemerisName));
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
        sb.append("sat2CommentCovarianceScaleFactor");
        sb.append('=');
        sb.append(((this.sat2CommentCovarianceScaleFactor == null)?"<null>":this.sat2CommentCovarianceScaleFactor));
        sb.append(',');
        sb.append("sat2CommentExclusionVolumeRadius");
        sb.append('=');
        sb.append(((this.sat2CommentExclusionVolumeRadius == null)?"<null>":this.sat2CommentExclusionVolumeRadius));
        sb.append(',');
        sb.append("sat2TimeLastobStart");
        sb.append('=');
        sb.append(((this.sat2TimeLastobStart == null)?"<null>":this.sat2TimeLastobStart));
        sb.append(',');
        sb.append("sat2TimeLastobStartFraction");
        sb.append('=');
        sb.append(((this.sat2TimeLastobStartFraction == null)?"<null>":this.sat2TimeLastobStartFraction));
        sb.append(',');
        sb.append("sat2TimeLastobEnd");
        sb.append('=');
        sb.append(((this.sat2TimeLastobEnd == null)?"<null>":this.sat2TimeLastobEnd));
        sb.append(',');
        sb.append("sat2TimeLastobEndFraction");
        sb.append('=');
        sb.append(((this.sat2TimeLastobEndFraction == null)?"<null>":this.sat2TimeLastobEndFraction));
        sb.append(',');
        sb.append("sat2RecommendedOdSpan");
        sb.append('=');
        sb.append(((this.sat2RecommendedOdSpan == null)?"<null>":this.sat2RecommendedOdSpan));
        sb.append(',');
        sb.append("sat2RecommendedOdSpanUnit");
        sb.append('=');
        sb.append(((this.sat2RecommendedOdSpanUnit == null)?"<null>":this.sat2RecommendedOdSpanUnit));
        sb.append(',');
        sb.append("sat2ActualOdSpan");
        sb.append('=');
        sb.append(((this.sat2ActualOdSpan == null)?"<null>":this.sat2ActualOdSpan));
        sb.append(',');
        sb.append("sat2ActualOdSpanUnit");
        sb.append('=');
        sb.append(((this.sat2ActualOdSpanUnit == null)?"<null>":this.sat2ActualOdSpanUnit));
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
        sb.append("sat2ResidualsAcceptedUnit");
        sb.append('=');
        sb.append(((this.sat2ResidualsAcceptedUnit == null)?"<null>":this.sat2ResidualsAcceptedUnit));
        sb.append(',');
        sb.append("sat2WeightedRms");
        sb.append('=');
        sb.append(((this.sat2WeightedRms == null)?"<null>":this.sat2WeightedRms));
        sb.append(',');
        sb.append("sat2CommentApogee");
        sb.append('=');
        sb.append(((this.sat2CommentApogee == null)?"<null>":this.sat2CommentApogee));
        sb.append(',');
        sb.append("sat2CommentPerigee");
        sb.append('=');
        sb.append(((this.sat2CommentPerigee == null)?"<null>":this.sat2CommentPerigee));
        sb.append(',');
        sb.append("sat2CommentInclination");
        sb.append('=');
        sb.append(((this.sat2CommentInclination == null)?"<null>":this.sat2CommentInclination));
        sb.append(',');
        sb.append("sat2CommentOperatorHardBodyRadius");
        sb.append('=');
        sb.append(((this.sat2CommentOperatorHardBodyRadius == null)?"<null>":this.sat2CommentOperatorHardBodyRadius));
        sb.append(',');
        sb.append("sat2AreaPc");
        sb.append('=');
        sb.append(((this.sat2AreaPc == null)?"<null>":this.sat2AreaPc));
        sb.append(',');
        sb.append("sat2AreaPcUnit");
        sb.append('=');
        sb.append(((this.sat2AreaPcUnit == null)?"<null>":this.sat2AreaPcUnit));
        sb.append(',');
        sb.append("sat2CdAreaOverMass");
        sb.append('=');
        sb.append(((this.sat2CdAreaOverMass == null)?"<null>":this.sat2CdAreaOverMass));
        sb.append(',');
        sb.append("sat2CdAreaOverMassUnit");
        sb.append('=');
        sb.append(((this.sat2CdAreaOverMassUnit == null)?"<null>":this.sat2CdAreaOverMassUnit));
        sb.append(',');
        sb.append("sat2CrAreaOverMass");
        sb.append('=');
        sb.append(((this.sat2CrAreaOverMass == null)?"<null>":this.sat2CrAreaOverMass));
        sb.append(',');
        sb.append("sat2CrAreaOverMassUnit");
        sb.append('=');
        sb.append(((this.sat2CrAreaOverMassUnit == null)?"<null>":this.sat2CrAreaOverMassUnit));
        sb.append(',');
        sb.append("sat2ThrustAcceleration");
        sb.append('=');
        sb.append(((this.sat2ThrustAcceleration == null)?"<null>":this.sat2ThrustAcceleration));
        sb.append(',');
        sb.append("sat2ThrustAccelerationUnit");
        sb.append('=');
        sb.append(((this.sat2ThrustAccelerationUnit == null)?"<null>":this.sat2ThrustAccelerationUnit));
        sb.append(',');
        sb.append("sat2Sedr");
        sb.append('=');
        sb.append(((this.sat2Sedr == null)?"<null>":this.sat2Sedr));
        sb.append(',');
        sb.append("sat2SedrUnit");
        sb.append('=');
        sb.append(((this.sat2SedrUnit == null)?"<null>":this.sat2SedrUnit));
        sb.append(',');
        sb.append("sat2X");
        sb.append('=');
        sb.append(((this.sat2X == null)?"<null>":this.sat2X));
        sb.append(',');
        sb.append("sat2XUnit");
        sb.append('=');
        sb.append(((this.sat2XUnit == null)?"<null>":this.sat2XUnit));
        sb.append(',');
        sb.append("sat2Y");
        sb.append('=');
        sb.append(((this.sat2Y == null)?"<null>":this.sat2Y));
        sb.append(',');
        sb.append("sat2YUnit");
        sb.append('=');
        sb.append(((this.sat2YUnit == null)?"<null>":this.sat2YUnit));
        sb.append(',');
        sb.append("sat2Z");
        sb.append('=');
        sb.append(((this.sat2Z == null)?"<null>":this.sat2Z));
        sb.append(',');
        sb.append("sat2ZUnit");
        sb.append('=');
        sb.append(((this.sat2ZUnit == null)?"<null>":this.sat2ZUnit));
        sb.append(',');
        sb.append("sat2XDot");
        sb.append('=');
        sb.append(((this.sat2XDot == null)?"<null>":this.sat2XDot));
        sb.append(',');
        sb.append("sat2XDotUnit");
        sb.append('=');
        sb.append(((this.sat2XDotUnit == null)?"<null>":this.sat2XDotUnit));
        sb.append(',');
        sb.append("sat2YDot");
        sb.append('=');
        sb.append(((this.sat2YDot == null)?"<null>":this.sat2YDot));
        sb.append(',');
        sb.append("sat2YDotUnit");
        sb.append('=');
        sb.append(((this.sat2YDotUnit == null)?"<null>":this.sat2YDotUnit));
        sb.append(',');
        sb.append("sat2ZDot");
        sb.append('=');
        sb.append(((this.sat2ZDot == null)?"<null>":this.sat2ZDot));
        sb.append(',');
        sb.append("sat2ZDotUnit");
        sb.append('=');
        sb.append(((this.sat2ZDotUnit == null)?"<null>":this.sat2ZDotUnit));
        sb.append(',');
        sb.append("sat2CommentDcpDensityForecastUncertainty");
        sb.append('=');
        sb.append(((this.sat2CommentDcpDensityForecastUncertainty == null)?"<null>":this.sat2CommentDcpDensityForecastUncertainty));
        sb.append(',');
        sb.append("sat2CommentDcpSensitivityVectorPosition");
        sb.append('=');
        sb.append(((this.sat2CommentDcpSensitivityVectorPosition == null)?"<null>":this.sat2CommentDcpSensitivityVectorPosition));
        sb.append(',');
        sb.append("sat2CommentDcpSensitivityVectorVelocity");
        sb.append('=');
        sb.append(((this.sat2CommentDcpSensitivityVectorVelocity == null)?"<null>":this.sat2CommentDcpSensitivityVectorVelocity));
        sb.append(',');
        sb.append("sat2CrR");
        sb.append('=');
        sb.append(((this.sat2CrR == null)?"<null>":this.sat2CrR));
        sb.append(',');
        sb.append("sat2CrRUnit");
        sb.append('=');
        sb.append(((this.sat2CrRUnit == null)?"<null>":this.sat2CrRUnit));
        sb.append(',');
        sb.append("sat2CtR");
        sb.append('=');
        sb.append(((this.sat2CtR == null)?"<null>":this.sat2CtR));
        sb.append(',');
        sb.append("sat2CtRUnit");
        sb.append('=');
        sb.append(((this.sat2CtRUnit == null)?"<null>":this.sat2CtRUnit));
        sb.append(',');
        sb.append("sat2CtT");
        sb.append('=');
        sb.append(((this.sat2CtT == null)?"<null>":this.sat2CtT));
        sb.append(',');
        sb.append("sat2CtTUnit");
        sb.append('=');
        sb.append(((this.sat2CtTUnit == null)?"<null>":this.sat2CtTUnit));
        sb.append(',');
        sb.append("sat2CnR");
        sb.append('=');
        sb.append(((this.sat2CnR == null)?"<null>":this.sat2CnR));
        sb.append(',');
        sb.append("sat2CnRUnit");
        sb.append('=');
        sb.append(((this.sat2CnRUnit == null)?"<null>":this.sat2CnRUnit));
        sb.append(',');
        sb.append("sat2CnT");
        sb.append('=');
        sb.append(((this.sat2CnT == null)?"<null>":this.sat2CnT));
        sb.append(',');
        sb.append("sat2CnTUnit");
        sb.append('=');
        sb.append(((this.sat2CnTUnit == null)?"<null>":this.sat2CnTUnit));
        sb.append(',');
        sb.append("sat2CnN");
        sb.append('=');
        sb.append(((this.sat2CnN == null)?"<null>":this.sat2CnN));
        sb.append(',');
        sb.append("sat2CnNUnit");
        sb.append('=');
        sb.append(((this.sat2CnNUnit == null)?"<null>":this.sat2CnNUnit));
        sb.append(',');
        sb.append("sat2CrdotR");
        sb.append('=');
        sb.append(((this.sat2CrdotR == null)?"<null>":this.sat2CrdotR));
        sb.append(',');
        sb.append("sat2CrdotRUnit");
        sb.append('=');
        sb.append(((this.sat2CrdotRUnit == null)?"<null>":this.sat2CrdotRUnit));
        sb.append(',');
        sb.append("sat2CrdotT");
        sb.append('=');
        sb.append(((this.sat2CrdotT == null)?"<null>":this.sat2CrdotT));
        sb.append(',');
        sb.append("sat2CrdotTUnit");
        sb.append('=');
        sb.append(((this.sat2CrdotTUnit == null)?"<null>":this.sat2CrdotTUnit));
        sb.append(',');
        sb.append("sat2CrdotN");
        sb.append('=');
        sb.append(((this.sat2CrdotN == null)?"<null>":this.sat2CrdotN));
        sb.append(',');
        sb.append("sat2CrdotNUnit");
        sb.append('=');
        sb.append(((this.sat2CrdotNUnit == null)?"<null>":this.sat2CrdotNUnit));
        sb.append(',');
        sb.append("sat2CrdotRdot");
        sb.append('=');
        sb.append(((this.sat2CrdotRdot == null)?"<null>":this.sat2CrdotRdot));
        sb.append(',');
        sb.append("sat2CrdotRdotUnit");
        sb.append('=');
        sb.append(((this.sat2CrdotRdotUnit == null)?"<null>":this.sat2CrdotRdotUnit));
        sb.append(',');
        sb.append("sat2CtdotR");
        sb.append('=');
        sb.append(((this.sat2CtdotR == null)?"<null>":this.sat2CtdotR));
        sb.append(',');
        sb.append("sat2CtdotRUnit");
        sb.append('=');
        sb.append(((this.sat2CtdotRUnit == null)?"<null>":this.sat2CtdotRUnit));
        sb.append(',');
        sb.append("sat2CtdotT");
        sb.append('=');
        sb.append(((this.sat2CtdotT == null)?"<null>":this.sat2CtdotT));
        sb.append(',');
        sb.append("sat2CtdotTUnit");
        sb.append('=');
        sb.append(((this.sat2CtdotTUnit == null)?"<null>":this.sat2CtdotTUnit));
        sb.append(',');
        sb.append("sat2CtdotN");
        sb.append('=');
        sb.append(((this.sat2CtdotN == null)?"<null>":this.sat2CtdotN));
        sb.append(',');
        sb.append("sat2CtdotNUnit");
        sb.append('=');
        sb.append(((this.sat2CtdotNUnit == null)?"<null>":this.sat2CtdotNUnit));
        sb.append(',');
        sb.append("sat2CtdotRdot");
        sb.append('=');
        sb.append(((this.sat2CtdotRdot == null)?"<null>":this.sat2CtdotRdot));
        sb.append(',');
        sb.append("sat2CtdotRdotUnit");
        sb.append('=');
        sb.append(((this.sat2CtdotRdotUnit == null)?"<null>":this.sat2CtdotRdotUnit));
        sb.append(',');
        sb.append("sat2CtdotTdot");
        sb.append('=');
        sb.append(((this.sat2CtdotTdot == null)?"<null>":this.sat2CtdotTdot));
        sb.append(',');
        sb.append("sat2CtdotTdotUnit");
        sb.append('=');
        sb.append(((this.sat2CtdotTdotUnit == null)?"<null>":this.sat2CtdotTdotUnit));
        sb.append(',');
        sb.append("sat2CndotR");
        sb.append('=');
        sb.append(((this.sat2CndotR == null)?"<null>":this.sat2CndotR));
        sb.append(',');
        sb.append("sat2CndotRUnit");
        sb.append('=');
        sb.append(((this.sat2CndotRUnit == null)?"<null>":this.sat2CndotRUnit));
        sb.append(',');
        sb.append("sat2CndotT");
        sb.append('=');
        sb.append(((this.sat2CndotT == null)?"<null>":this.sat2CndotT));
        sb.append(',');
        sb.append("sat2CndotTUnit");
        sb.append('=');
        sb.append(((this.sat2CndotTUnit == null)?"<null>":this.sat2CndotTUnit));
        sb.append(',');
        sb.append("sat2CndotN");
        sb.append('=');
        sb.append(((this.sat2CndotN == null)?"<null>":this.sat2CndotN));
        sb.append(',');
        sb.append("sat2CndotNUnit");
        sb.append('=');
        sb.append(((this.sat2CndotNUnit == null)?"<null>":this.sat2CndotNUnit));
        sb.append(',');
        sb.append("sat2CndotRdot");
        sb.append('=');
        sb.append(((this.sat2CndotRdot == null)?"<null>":this.sat2CndotRdot));
        sb.append(',');
        sb.append("sat2CndotRdotUnit");
        sb.append('=');
        sb.append(((this.sat2CndotRdotUnit == null)?"<null>":this.sat2CndotRdotUnit));
        sb.append(',');
        sb.append("sat2CndotTdot");
        sb.append('=');
        sb.append(((this.sat2CndotTdot == null)?"<null>":this.sat2CndotTdot));
        sb.append(',');
        sb.append("sat2CndotTdotUnit");
        sb.append('=');
        sb.append(((this.sat2CndotTdotUnit == null)?"<null>":this.sat2CndotTdotUnit));
        sb.append(',');
        sb.append("sat2CndotNdot");
        sb.append('=');
        sb.append(((this.sat2CndotNdot == null)?"<null>":this.sat2CndotNdot));
        sb.append(',');
        sb.append("sat2CndotNdotUnit");
        sb.append('=');
        sb.append(((this.sat2CndotNdotUnit == null)?"<null>":this.sat2CndotNdotUnit));
        sb.append(',');
        sb.append("sat2CdrgR");
        sb.append('=');
        sb.append(((this.sat2CdrgR == null)?"<null>":this.sat2CdrgR));
        sb.append(',');
        sb.append("sat2CdrgRUnit");
        sb.append('=');
        sb.append(((this.sat2CdrgRUnit == null)?"<null>":this.sat2CdrgRUnit));
        sb.append(',');
        sb.append("sat2CdrgT");
        sb.append('=');
        sb.append(((this.sat2CdrgT == null)?"<null>":this.sat2CdrgT));
        sb.append(',');
        sb.append("sat2CdrgTUnit");
        sb.append('=');
        sb.append(((this.sat2CdrgTUnit == null)?"<null>":this.sat2CdrgTUnit));
        sb.append(',');
        sb.append("sat2CdrgN");
        sb.append('=');
        sb.append(((this.sat2CdrgN == null)?"<null>":this.sat2CdrgN));
        sb.append(',');
        sb.append("sat2CdrgNUnit");
        sb.append('=');
        sb.append(((this.sat2CdrgNUnit == null)?"<null>":this.sat2CdrgNUnit));
        sb.append(',');
        sb.append("sat2CdrgRdot");
        sb.append('=');
        sb.append(((this.sat2CdrgRdot == null)?"<null>":this.sat2CdrgRdot));
        sb.append(',');
        sb.append("sat2CdrgRdotUnit");
        sb.append('=');
        sb.append(((this.sat2CdrgRdotUnit == null)?"<null>":this.sat2CdrgRdotUnit));
        sb.append(',');
        sb.append("sat2CdrgTdot");
        sb.append('=');
        sb.append(((this.sat2CdrgTdot == null)?"<null>":this.sat2CdrgTdot));
        sb.append(',');
        sb.append("sat2CdrgTdotUnit");
        sb.append('=');
        sb.append(((this.sat2CdrgTdotUnit == null)?"<null>":this.sat2CdrgTdotUnit));
        sb.append(',');
        sb.append("sat2CdrgNdot");
        sb.append('=');
        sb.append(((this.sat2CdrgNdot == null)?"<null>":this.sat2CdrgNdot));
        sb.append(',');
        sb.append("sat2CdrgNdotUnit");
        sb.append('=');
        sb.append(((this.sat2CdrgNdotUnit == null)?"<null>":this.sat2CdrgNdotUnit));
        sb.append(',');
        sb.append("sat2CdrgDrg");
        sb.append('=');
        sb.append(((this.sat2CdrgDrg == null)?"<null>":this.sat2CdrgDrg));
        sb.append(',');
        sb.append("sat2CdrgDrgUnit");
        sb.append('=');
        sb.append(((this.sat2CdrgDrgUnit == null)?"<null>":this.sat2CdrgDrgUnit));
        sb.append(',');
        sb.append("sat2CsrpR");
        sb.append('=');
        sb.append(((this.sat2CsrpR == null)?"<null>":this.sat2CsrpR));
        sb.append(',');
        sb.append("sat2CsrpRUnit");
        sb.append('=');
        sb.append(((this.sat2CsrpRUnit == null)?"<null>":this.sat2CsrpRUnit));
        sb.append(',');
        sb.append("sat2CsrpT");
        sb.append('=');
        sb.append(((this.sat2CsrpT == null)?"<null>":this.sat2CsrpT));
        sb.append(',');
        sb.append("sat2CsrpTUnit");
        sb.append('=');
        sb.append(((this.sat2CsrpTUnit == null)?"<null>":this.sat2CsrpTUnit));
        sb.append(',');
        sb.append("sat2CsrpN");
        sb.append('=');
        sb.append(((this.sat2CsrpN == null)?"<null>":this.sat2CsrpN));
        sb.append(',');
        sb.append("sat2CsrpNUnit");
        sb.append('=');
        sb.append(((this.sat2CsrpNUnit == null)?"<null>":this.sat2CsrpNUnit));
        sb.append(',');
        sb.append("sat2CsrpRdot");
        sb.append('=');
        sb.append(((this.sat2CsrpRdot == null)?"<null>":this.sat2CsrpRdot));
        sb.append(',');
        sb.append("sat2CsrpRdotUnit");
        sb.append('=');
        sb.append(((this.sat2CsrpRdotUnit == null)?"<null>":this.sat2CsrpRdotUnit));
        sb.append(',');
        sb.append("sat2CsrpTdot");
        sb.append('=');
        sb.append(((this.sat2CsrpTdot == null)?"<null>":this.sat2CsrpTdot));
        sb.append(',');
        sb.append("sat2CsrpTdotUnit");
        sb.append('=');
        sb.append(((this.sat2CsrpTdotUnit == null)?"<null>":this.sat2CsrpTdotUnit));
        sb.append(',');
        sb.append("sat2CsrpNdot");
        sb.append('=');
        sb.append(((this.sat2CsrpNdot == null)?"<null>":this.sat2CsrpNdot));
        sb.append(',');
        sb.append("sat2CsrpNdotUnit");
        sb.append('=');
        sb.append(((this.sat2CsrpNdotUnit == null)?"<null>":this.sat2CsrpNdotUnit));
        sb.append(',');
        sb.append("sat2CsrpDrg");
        sb.append('=');
        sb.append(((this.sat2CsrpDrg == null)?"<null>":this.sat2CsrpDrg));
        sb.append(',');
        sb.append("sat2CsrpDrgUnit");
        sb.append('=');
        sb.append(((this.sat2CsrpDrgUnit == null)?"<null>":this.sat2CsrpDrgUnit));
        sb.append(',');
        sb.append("sat2CsrpSrp");
        sb.append('=');
        sb.append(((this.sat2CsrpSrp == null)?"<null>":this.sat2CsrpSrp));
        sb.append(',');
        sb.append("sat2CsrpSrpUnit");
        sb.append('=');
        sb.append(((this.sat2CsrpSrpUnit == null)?"<null>":this.sat2CsrpSrpUnit));
        sb.append(',');
        sb.append("gid");
        sb.append('=');
        sb.append(((this.gid == null)?"<null>":this.gid));
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
        result = ((result* 31)+((this.sat1CrdotRdotUnit == null)? 0 :this.sat1CrdotRdotUnit.hashCode()));
        result = ((result* 31)+((this.sat2ObsAvailable == null)? 0 :this.sat2ObsAvailable.hashCode()));
        result = ((result* 31)+((this.relativeSpeedUnit == null)? 0 :this.relativeSpeedUnit.hashCode()));
        result = ((result* 31)+((this.sat1CndotNdot == null)? 0 :this.sat1CndotNdot.hashCode()));
        result = ((result* 31)+((this.collisionProbability == null)? 0 :this.collisionProbability.hashCode()));
        result = ((result* 31)+((this.sat2TimeLastobEndFraction == null)? 0 :this.sat2TimeLastobEndFraction.hashCode()));
        result = ((result* 31)+((this.sat1ObjectDesignator == null)? 0 :this.sat1ObjectDesignator.hashCode()));
        result = ((result* 31)+((this.sat2CommentScreeningDataSource == null)? 0 :this.sat2CommentScreeningDataSource.hashCode()));
        result = ((result* 31)+((this.sat1CsrpTdotUnit == null)? 0 :this.sat1CsrpTdotUnit.hashCode()));
        result = ((result* 31)+((this.sat2CsrpRdotUnit == null)? 0 :this.sat2CsrpRdotUnit.hashCode()));
        result = ((result* 31)+((this.sat2NBodyPerturbations == null)? 0 :this.sat2NBodyPerturbations.hashCode()));
        result = ((result* 31)+((this.constellation == null)? 0 :this.constellation.hashCode()));
        result = ((result* 31)+((this.sat1CsrpRdotUnit == null)? 0 :this.sat1CsrpRdotUnit.hashCode()));
        result = ((result* 31)+((this.sat2WeightedRms == null)? 0 :this.sat2WeightedRms.hashCode()));
        result = ((result* 31)+((this.sat2CtRUnit == null)? 0 :this.sat2CtRUnit.hashCode()));
        result = ((result* 31)+((this.sat2CsrpNUnit == null)? 0 :this.sat2CsrpNUnit.hashCode()));
        result = ((result* 31)+((this.sat2CsrpTdotUnit == null)? 0 :this.sat2CsrpTdotUnit.hashCode()));
        result = ((result* 31)+((this.sat2CommentInclination == null)? 0 :this.sat2CommentInclination.hashCode()));
        result = ((result* 31)+((this.sat2CdrgDrgUnit == null)? 0 :this.sat2CdrgDrgUnit.hashCode()));
        result = ((result* 31)+((this.sat1ObsAvailable == null)? 0 :this.sat1ObsAvailable.hashCode()));
        result = ((result* 31)+((this.sat1CsrpNdot == null)? 0 :this.sat1CsrpNdot.hashCode()));
        result = ((result* 31)+((this.sat1SolarRadPressure == null)? 0 :this.sat1SolarRadPressure.hashCode()));
        result = ((result* 31)+((this.sat1Sedr == null)? 0 :this.sat1Sedr.hashCode()));
        result = ((result* 31)+((this.sat1CsrpNdotUnit == null)? 0 :this.sat1CsrpNdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1CsrpDrg == null)? 0 :this.sat1CsrpDrg.hashCode()));
        result = ((result* 31)+((this.sat2CsrpNdotUnit == null)? 0 :this.sat2CsrpNdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1ZDot == null)? 0 :this.sat1ZDot.hashCode()));
        result = ((result* 31)+((this.ccsdsCdmVers == null)? 0 :this.ccsdsCdmVers.hashCode()));
        result = ((result* 31)+((this.missDistance == null)? 0 :this.missDistance.hashCode()));
        result = ((result* 31)+((this.sat1RefFrame == null)? 0 :this.sat1RefFrame.hashCode()));
        result = ((result* 31)+((this.sat1Y == null)? 0 :this.sat1Y.hashCode()));
        result = ((result* 31)+((this.sat2OperatorPhone == null)? 0 :this.sat2OperatorPhone.hashCode()));
        result = ((result* 31)+((this.sat1AreaPc == null)? 0 :this.sat1AreaPc.hashCode()));
        result = ((result* 31)+((this.sat1Z == null)? 0 :this.sat1Z.hashCode()));
        result = ((result* 31)+((this.sat1X == null)? 0 :this.sat1X.hashCode()));
        result = ((result* 31)+((this.sat1CrdotN == null)? 0 :this.sat1CrdotN.hashCode()));
        result = ((result* 31)+((this.sat2TimeLastobStart == null)? 0 :this.sat2TimeLastobStart.hashCode()));
        result = ((result* 31)+((this.sat2YUnit == null)? 0 :this.sat2YUnit.hashCode()));
        result = ((result* 31)+((this.filename == null)? 0 :this.filename.hashCode()));
        result = ((result* 31)+((this.sat1CsrpSrpUnit == null)? 0 :this.sat1CsrpSrpUnit.hashCode()));
        result = ((result* 31)+((this.sat1NBodyPerturbations == null)? 0 :this.sat1NBodyPerturbations.hashCode()));
        result = ((result* 31)+((this.sat2CrRUnit == null)? 0 :this.sat2CrRUnit.hashCode()));
        result = ((result* 31)+((this.sat2CtR == null)? 0 :this.sat2CtR.hashCode()));
        result = ((result* 31)+((this.sat1CdrgRUnit == null)? 0 :this.sat1CdrgRUnit.hashCode()));
        result = ((result* 31)+((this.sat2CtT == null)? 0 :this.sat2CtT.hashCode()));
        result = ((result* 31)+((this.sat1CtTUnit == null)? 0 :this.sat1CtTUnit.hashCode()));
        result = ((result* 31)+((this.relativePositionNUnit == null)? 0 :this.relativePositionNUnit.hashCode()));
        result = ((result* 31)+((this.relativePositionT == null)? 0 :this.relativePositionT.hashCode()));
        result = ((result* 31)+((this.relativePositionR == null)? 0 :this.relativePositionR.hashCode()));
        result = ((result* 31)+((this.sat1CsrpTdot == null)? 0 :this.sat1CsrpTdot.hashCode()));
        result = ((result* 31)+((this.sat2CrdotRdotUnit == null)? 0 :this.sat2CrdotRdotUnit.hashCode()));
        result = ((result* 31)+((this.relativePositionN == null)? 0 :this.relativePositionN.hashCode()));
        result = ((result* 31)+((this.sat2Z == null)? 0 :this.sat2Z.hashCode()));
        result = ((result* 31)+((this.sat2CrdotTUnit == null)? 0 :this.sat2CrdotTUnit.hashCode()));
        result = ((result* 31)+((this.sat2CommentPerigee == null)? 0 :this.sat2CommentPerigee.hashCode()));
        result = ((result* 31)+((this.missDistanceUnit == null)? 0 :this.missDistanceUnit.hashCode()));
        result = ((result* 31)+((this.sat1CrdotNUnit == null)? 0 :this.sat1CrdotNUnit.hashCode()));
        result = ((result* 31)+((this.sat2X == null)? 0 :this.sat2X.hashCode()));
        result = ((result* 31)+((this.commentEmergencyReportable == null)? 0 :this.commentEmergencyReportable.hashCode()));
        result = ((result* 31)+((this.sat2Y == null)? 0 :this.sat2Y.hashCode()));
        result = ((result* 31)+((this.sat1CtdotTdot == null)? 0 :this.sat1CtdotTdot.hashCode()));
        result = ((result* 31)+((this.sat2AtmosphericModel == null)? 0 :this.sat2AtmosphericModel.hashCode()));
        result = ((result* 31)+((this.sat2CdrgDrg == null)? 0 :this.sat2CdrgDrg.hashCode()));
        result = ((result* 31)+((this.sat2CommentDcpSensitivityVectorPosition == null)? 0 :this.sat2CommentDcpSensitivityVectorPosition.hashCode()));
        result = ((result* 31)+((this.sat2ObsUsed == null)? 0 :this.sat2ObsUsed.hashCode()));
        result = ((result* 31)+((this.sat1CtdotTUnit == null)? 0 :this.sat1CtdotTUnit.hashCode()));
        result = ((result* 31)+((this.sat1CdrgDrgUnit == null)? 0 :this.sat1CdrgDrgUnit.hashCode()));
        result = ((result* 31)+((this.sat1CsrpTUnit == null)? 0 :this.sat1CsrpTUnit.hashCode()));
        result = ((result* 31)+((this.sat1CndotR == null)? 0 :this.sat1CndotR.hashCode()));
        result = ((result* 31)+((this.sat2CdrgRdot == null)? 0 :this.sat2CdrgRdot.hashCode()));
        result = ((result* 31)+((this.sat1CndotN == null)? 0 :this.sat1CndotN.hashCode()));
        result = ((result* 31)+((this.sat1TimeLastobEndFraction == null)? 0 :this.sat1TimeLastobEndFraction.hashCode()));
        result = ((result* 31)+((this.sat1CatalogName == null)? 0 :this.sat1CatalogName.hashCode()));
        result = ((result* 31)+((this.sat1ObjectType == null)? 0 :this.sat1ObjectType.hashCode()));
        result = ((result* 31)+((this.sat1CommentCovarianceScaleFactor == null)? 0 :this.sat1CommentCovarianceScaleFactor.hashCode()));
        result = ((result* 31)+((this.sat2GravityModel == null)? 0 :this.sat2GravityModel.hashCode()));
        result = ((result* 31)+((this.sat1GravityModel == null)? 0 :this.sat1GravityModel.hashCode()));
        result = ((result* 31)+((this.sat1CsrpDrgUnit == null)? 0 :this.sat1CsrpDrgUnit.hashCode()));
        result = ((result* 31)+((this.sat1WeightedRms == null)? 0 :this.sat1WeightedRms.hashCode()));
        result = ((result* 31)+((this.sat1EphemerisName == null)? 0 :this.sat1EphemerisName.hashCode()));
        result = ((result* 31)+((this.sat2CrR == null)? 0 :this.sat2CrR.hashCode()));
        result = ((result* 31)+((this.messageFor == null)? 0 :this.messageFor.hashCode()));
        result = ((result* 31)+((this.sat1RecommendedOdSpan == null)? 0 :this.sat1RecommendedOdSpan.hashCode()));
        result = ((result* 31)+((this.sat1CsrpSrp == null)? 0 :this.sat1CsrpSrp.hashCode()));
        result = ((result* 31)+((this.sat1TimeLastobStart == null)? 0 :this.sat1TimeLastobStart.hashCode()));
        result = ((result* 31)+((this.sat1CrdotRUnit == null)? 0 :this.sat1CrdotRUnit.hashCode()));
        result = ((result* 31)+((this.sat2CdrgTdotUnit == null)? 0 :this.sat2CdrgTdotUnit.hashCode()));
        result = ((result* 31)+((this.relativeVelocityRUnit == null)? 0 :this.relativeVelocityRUnit.hashCode()));
        result = ((result* 31)+((this.sat2InternationalDesignator == null)? 0 :this.sat2InternationalDesignator.hashCode()));
        result = ((result* 31)+((this.sat1CnTUnit == null)? 0 :this.sat1CnTUnit.hashCode()));
        result = ((result* 31)+((this.sat1CrdotRdot == null)? 0 :this.sat1CrdotRdot.hashCode()));
        result = ((result* 31)+((this.sat1CndotTUnit == null)? 0 :this.sat1CndotTUnit.hashCode()));
        result = ((result* 31)+((this.sat1CtdotRdot == null)? 0 :this.sat1CtdotRdot.hashCode()));
        result = ((result* 31)+((this.sat2CdrgRdotUnit == null)? 0 :this.sat2CdrgRdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1CommentExclusionVolumeRadius == null)? 0 :this.sat1CommentExclusionVolumeRadius.hashCode()));
        result = ((result* 31)+((this.sat1ThrustAcceleration == null)? 0 :this.sat1ThrustAcceleration.hashCode()));
        result = ((result* 31)+((this.sat2CnRUnit == null)? 0 :this.sat2CnRUnit.hashCode()));
        result = ((result* 31)+((this.sat2CtdotN == null)? 0 :this.sat2CtdotN.hashCode()));
        result = ((result* 31)+((this.sat2CtdotR == null)? 0 :this.sat2CtdotR.hashCode()));
        result = ((result* 31)+((this.sat2TimeLastobStartFraction == null)? 0 :this.sat2TimeLastobStartFraction.hashCode()));
        result = ((result* 31)+((this.sat2CtdotT == null)? 0 :this.sat2CtdotT.hashCode()));
        result = ((result* 31)+((this.sat2ObjectType == null)? 0 :this.sat2ObjectType.hashCode()));
        result = ((result* 31)+((this.sat2CndotRUnit == null)? 0 :this.sat2CndotRUnit.hashCode()));
        result = ((result* 31)+((this.sat2XDotUnit == null)? 0 :this.sat2XDotUnit.hashCode()));
        result = ((result* 31)+((this.sat2YDotUnit == null)? 0 :this.sat2YDotUnit.hashCode()));
        result = ((result* 31)+((this.sat2CndotNUnit == null)? 0 :this.sat2CndotNUnit.hashCode()));
        result = ((result* 31)+((this.sat2ZUnit == null)? 0 :this.sat2ZUnit.hashCode()));
        result = ((result* 31)+((this.sat2CdrgTdot == null)? 0 :this.sat2CdrgTdot.hashCode()));
        result = ((result* 31)+((this.sat1ZDotUnit == null)? 0 :this.sat1ZDotUnit.hashCode()));
        result = ((result* 31)+((this.sat2RecommendedOdSpan == null)? 0 :this.sat2RecommendedOdSpan.hashCode()));
        result = ((result* 31)+((this.sat1OperatorPhone == null)? 0 :this.sat1OperatorPhone.hashCode()));
        result = ((result* 31)+((this.sat1CdrgT == null)? 0 :this.sat1CdrgT.hashCode()));
        result = ((result* 31)+((this.sat1CdrgR == null)? 0 :this.sat1CdrgR.hashCode()));
        result = ((result* 31)+((this.sat1CdrgNdotUnit == null)? 0 :this.sat1CdrgNdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1AreaPcUnit == null)? 0 :this.sat1AreaPcUnit.hashCode()));
        result = ((result* 31)+((this.sat1CdrgN == null)? 0 :this.sat1CdrgN.hashCode()));
        result = ((result* 31)+((this.sat2CrdotRdot == null)? 0 :this.sat2CrdotRdot.hashCode()));
        result = ((result* 31)+((this.sat2CovarianceMethod == null)? 0 :this.sat2CovarianceMethod.hashCode()));
        result = ((result* 31)+((this.sat2ThrustAcceleration == null)? 0 :this.sat2ThrustAcceleration.hashCode()));
        result = ((result* 31)+((this.sat1CommentDcpSensitivityVectorPosition == null)? 0 :this.sat1CommentDcpSensitivityVectorPosition.hashCode()));
        result = ((result* 31)+((this.sat1CndotTdot == null)? 0 :this.sat1CndotTdot.hashCode()));
        result = ((result* 31)+((this.sat2AreaPc == null)? 0 :this.sat2AreaPc.hashCode()));
        result = ((result* 31)+((this.relativeVelocityNUnit == null)? 0 :this.relativeVelocityNUnit.hashCode()));
        result = ((result* 31)+((this.sat2SolarRadPressure == null)? 0 :this.sat2SolarRadPressure.hashCode()));
        result = ((result* 31)+((this.sat1OperatorContactPosition == null)? 0 :this.sat1OperatorContactPosition.hashCode()));
        result = ((result* 31)+((this.sat2CrAreaOverMassUnit == null)? 0 :this.sat2CrAreaOverMassUnit.hashCode()));
        result = ((result* 31)+((this.tcaFraction == null)? 0 :this.tcaFraction.hashCode()));
        result = ((result* 31)+((this.sat2OperatorOrganization == null)? 0 :this.sat2OperatorOrganization.hashCode()));
        result = ((result* 31)+((this.originator == null)? 0 :this.originator.hashCode()));
        result = ((result* 31)+((this.sat1ZUnit == null)? 0 :this.sat1ZUnit.hashCode()));
        result = ((result* 31)+((this.sat1CtdotNUnit == null)? 0 :this.sat1CtdotNUnit.hashCode()));
        result = ((result* 31)+((this.sat1CdrgDrg == null)? 0 :this.sat1CdrgDrg.hashCode()));
        result = ((result* 31)+((this.sat2CommentDcpDensityForecastUncertainty == null)? 0 :this.sat2CommentDcpDensityForecastUncertainty.hashCode()));
        result = ((result* 31)+((this.sat1CndotNdotUnit == null)? 0 :this.sat1CndotNdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1CommentDcpSensitivityVectorVelocity == null)? 0 :this.sat1CommentDcpSensitivityVectorVelocity.hashCode()));
        result = ((result* 31)+((this.sat1OperatorEmail == null)? 0 :this.sat1OperatorEmail.hashCode()));
        result = ((result* 31)+((this.sat2CsrpRUnit == null)? 0 :this.sat2CsrpRUnit.hashCode()));
        result = ((result* 31)+((this.sat1CommentApogee == null)? 0 :this.sat1CommentApogee.hashCode()));
        result = ((result* 31)+((this.sat2ActualOdSpan == null)? 0 :this.sat2ActualOdSpan.hashCode()));
        result = ((result* 31)+((this.sat2CommentExclusionVolumeRadius == null)? 0 :this.sat2CommentExclusionVolumeRadius.hashCode()));
        result = ((result* 31)+((this.sat2CsrpRdot == null)? 0 :this.sat2CsrpRdot.hashCode()));
        result = ((result* 31)+((this.sat1CommentInclination == null)? 0 :this.sat1CommentInclination.hashCode()));
        result = ((result* 31)+((this.sat2XDot == null)? 0 :this.sat2XDot.hashCode()));
        result = ((result* 31)+((this.sat2Maneuverable == null)? 0 :this.sat2Maneuverable.hashCode()));
        result = ((result* 31)+((this.sat1CdrgNUnit == null)? 0 :this.sat1CdrgNUnit.hashCode()));
        result = ((result* 31)+((this.sat1CtdotR == null)? 0 :this.sat1CtdotR.hashCode()));
        result = ((result* 31)+((this.sat1CtdotT == null)? 0 :this.sat1CtdotT.hashCode()));
        result = ((result* 31)+((this.sat2RefFrame == null)? 0 :this.sat2RefFrame.hashCode()));
        result = ((result* 31)+((this.sat1CtdotN == null)? 0 :this.sat1CtdotN.hashCode()));
        result = ((result* 31)+((this.sat2CommentOperatorHardBodyRadius == null)? 0 :this.sat2CommentOperatorHardBodyRadius.hashCode()));
        result = ((result* 31)+((this.sat2CdrgNdot == null)? 0 :this.sat2CdrgNdot.hashCode()));
        result = ((result* 31)+((this.sat1ActualOdSpanUnit == null)? 0 :this.sat1ActualOdSpanUnit.hashCode()));
        result = ((result* 31)+((this.sat2AreaPcUnit == null)? 0 :this.sat2AreaPcUnit.hashCode()));
        result = ((result* 31)+((this.sat1OperatorOrganization == null)? 0 :this.sat1OperatorOrganization.hashCode()));
        result = ((result* 31)+((this.sat2EphemerisName == null)? 0 :this.sat2EphemerisName.hashCode()));
        result = ((result* 31)+((this.sat2CtdotRUnit == null)? 0 :this.sat2CtdotRUnit.hashCode()));
        result = ((result* 31)+((this.sat2CtdotTdot == null)? 0 :this.sat2CtdotTdot.hashCode()));
        result = ((result* 31)+((this.sat2CommentCovarianceScaleFactor == null)? 0 :this.sat2CommentCovarianceScaleFactor.hashCode()));
        result = ((result* 31)+((this.sat2CsrpTdot == null)? 0 :this.sat2CsrpTdot.hashCode()));
        result = ((result* 31)+((this.sat1CsrpRUnit == null)? 0 :this.sat1CsrpRUnit.hashCode()));
        result = ((result* 31)+((this.sat2YDot == null)? 0 :this.sat2YDot.hashCode()));
        result = ((result* 31)+((this.sat2CndotTdotUnit == null)? 0 :this.sat2CndotTdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1CtdotRUnit == null)? 0 :this.sat1CtdotRUnit.hashCode()));
        result = ((result* 31)+((this.sat2CndotRdotUnit == null)? 0 :this.sat2CndotRdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1AtmosphericModel == null)? 0 :this.sat1AtmosphericModel.hashCode()));
        result = ((result* 31)+((this.sat1IntrackThrust == null)? 0 :this.sat1IntrackThrust.hashCode()));
        result = ((result* 31)+((this.sat1CtRUnit == null)? 0 :this.sat1CtRUnit.hashCode()));
        result = ((result* 31)+((this.sat2CndotNdotUnit == null)? 0 :this.sat2CndotNdotUnit.hashCode()));
        result = ((result* 31)+((this.relativePositionTUnit == null)? 0 :this.relativePositionTUnit.hashCode()));
        result = ((result* 31)+((this.sat1CrAreaOverMass == null)? 0 :this.sat1CrAreaOverMass.hashCode()));
        result = ((result* 31)+((this.sat2CdAreaOverMassUnit == null)? 0 :this.sat2CdAreaOverMassUnit.hashCode()));
        result = ((result* 31)+((this.sat2OperatorEmail == null)? 0 :this.sat2OperatorEmail.hashCode()));
        result = ((result* 31)+((this.creationDateFraction == null)? 0 :this.creationDateFraction.hashCode()));
        result = ((result* 31)+((this.sat1ResidualsAccepted == null)? 0 :this.sat1ResidualsAccepted.hashCode()));
        result = ((result* 31)+((this.sat1ResidualsAcceptedUnit == null)? 0 :this.sat1ResidualsAcceptedUnit.hashCode()));
        result = ((result* 31)+((this.sat2CommentApogee == null)? 0 :this.sat2CommentApogee.hashCode()));
        result = ((result* 31)+((this.sat2CsrpT == null)? 0 :this.sat2CsrpT.hashCode()));
        result = ((result* 31)+((this.sat1ObsUsed == null)? 0 :this.sat1ObsUsed.hashCode()));
        result = ((result* 31)+((this.sat2CndotNdot == null)? 0 :this.sat2CndotNdot.hashCode()));
        result = ((result* 31)+((this.sat2CsrpR == null)? 0 :this.sat2CsrpR.hashCode()));
        result = ((result* 31)+((this.sat1ObjectName == null)? 0 :this.sat1ObjectName.hashCode()));
        result = ((result* 31)+((this.sat2CtdotRdotUnit == null)? 0 :this.sat2CtdotRdotUnit.hashCode()));
        result = ((result* 31)+((this.sat2OperatorContactPosition == null)? 0 :this.sat2OperatorContactPosition.hashCode()));
        result = ((result* 31)+((this.sat2CsrpN == null)? 0 :this.sat2CsrpN.hashCode()));
        result = ((result* 31)+((this.sat2CsrpSrp == null)? 0 :this.sat2CsrpSrp.hashCode()));
        result = ((result* 31)+((this.sat2SedrUnit == null)? 0 :this.sat2SedrUnit.hashCode()));
        result = ((result* 31)+((this.sat2CtdotTdotUnit == null)? 0 :this.sat2CtdotTdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1CdrgRdot == null)? 0 :this.sat1CdrgRdot.hashCode()));
        result = ((result* 31)+((this.sat2CommentDcpSensitivityVectorVelocity == null)? 0 :this.sat2CommentDcpSensitivityVectorVelocity.hashCode()));
        result = ((result* 31)+((this.insertEpoch == null)? 0 :this.insertEpoch.hashCode()));
        result = ((result* 31)+((this.sat1CommentOperatorHardBodyRadius == null)? 0 :this.sat1CommentOperatorHardBodyRadius.hashCode()));
        result = ((result* 31)+((this.sat2Object == null)? 0 :this.sat2Object.hashCode()));
        result = ((result* 31)+((this.sat2CtdotNUnit == null)? 0 :this.sat2CtdotNUnit.hashCode()));
        result = ((result* 31)+((this.sat1CsrpNUnit == null)? 0 :this.sat1CsrpNUnit.hashCode()));
        result = ((result* 31)+((this.sat2CndotR == null)? 0 :this.sat2CndotR.hashCode()));
        result = ((result* 31)+((this.sat2CndotT == null)? 0 :this.sat2CndotT.hashCode()));
        result = ((result* 31)+((this.sat2ObjectName == null)? 0 :this.sat2ObjectName.hashCode()));
        result = ((result* 31)+((this.sat1Object == null)? 0 :this.sat1Object.hashCode()));
        result = ((result* 31)+((this.sat2CndotN == null)? 0 :this.sat2CndotN.hashCode()));
        result = ((result* 31)+((this.sat1CndotNUnit == null)? 0 :this.sat1CndotNUnit.hashCode()));
        result = ((result* 31)+((this.sat1CndotTdotUnit == null)? 0 :this.sat1CndotTdotUnit.hashCode()));
        result = ((result* 31)+((this.commentScreeningOption == null)? 0 :this.commentScreeningOption.hashCode()));
        result = ((result* 31)+((this.sat2ActualOdSpanUnit == null)? 0 :this.sat2ActualOdSpanUnit.hashCode()));
        result = ((result* 31)+((this.sat2CnNUnit == null)? 0 :this.sat2CnNUnit.hashCode()));
        result = ((result* 31)+((this.sat2CdrgRUnit == null)? 0 :this.sat2CdrgRUnit.hashCode()));
        result = ((result* 31)+((this.sat1RecommendedOdSpanUnit == null)? 0 :this.sat1RecommendedOdSpanUnit.hashCode()));
        result = ((result* 31)+((this.sat2IntrackThrust == null)? 0 :this.sat2IntrackThrust.hashCode()));
        result = ((result* 31)+((this.sat1CnR == null)? 0 :this.sat1CnR.hashCode()));
        result = ((result* 31)+((this.sat1ThrustAccelerationUnit == null)? 0 :this.sat1ThrustAccelerationUnit.hashCode()));
        result = ((result* 31)+((this.sat2RecommendedOdSpanUnit == null)? 0 :this.sat2RecommendedOdSpanUnit.hashCode()));
        result = ((result* 31)+((this.sat1CnT == null)? 0 :this.sat1CnT.hashCode()));
        result = ((result* 31)+((this.sat1CnN == null)? 0 :this.sat1CnN.hashCode()));
        result = ((result* 31)+((this.sat2CsrpNdot == null)? 0 :this.sat2CsrpNdot.hashCode()));
        result = ((result* 31)+((this.sat1XDotUnit == null)? 0 :this.sat1XDotUnit.hashCode()));
        result = ((result* 31)+((this.sat1YUnit == null)? 0 :this.sat1YUnit.hashCode()));
        result = ((result* 31)+((this.sat1CdrgTUnit == null)? 0 :this.sat1CdrgTUnit.hashCode()));
        result = ((result* 31)+((this.sat1CdAreaOverMassUnit == null)? 0 :this.sat1CdAreaOverMassUnit.hashCode()));
        result = ((result* 31)+((this.sat2CrdotRUnit == null)? 0 :this.sat2CrdotRUnit.hashCode()));
        result = ((result* 31)+((this.sat1TimeLastobEnd == null)? 0 :this.sat1TimeLastobEnd.hashCode()));
        result = ((result* 31)+((this.sat1CommentPerigee == null)? 0 :this.sat1CommentPerigee.hashCode()));
        result = ((result* 31)+((this.sat1XDot == null)? 0 :this.sat1XDot.hashCode()));
        result = ((result* 31)+((this.sat2CdrgNUnit == null)? 0 :this.sat2CdrgNUnit.hashCode()));
        result = ((result* 31)+((this.sat1CommentScreeningDataSource == null)? 0 :this.sat1CommentScreeningDataSource.hashCode()));
        result = ((result* 31)+((this.sat2CndotTUnit == null)? 0 :this.sat2CndotTUnit.hashCode()));
        result = ((result* 31)+((this.sat2EarthTides == null)? 0 :this.sat2EarthTides.hashCode()));
        result = ((result* 31)+((this.sat2CndotTdot == null)? 0 :this.sat2CndotTdot.hashCode()));
        result = ((result* 31)+((this.sat1TimeLastobStartFraction == null)? 0 :this.sat1TimeLastobStartFraction.hashCode()));
        result = ((result* 31)+((this.sat1CrRUnit == null)? 0 :this.sat1CrRUnit.hashCode()));
        result = ((result* 31)+((this.relativeSpeed == null)? 0 :this.relativeSpeed.hashCode()));
        result = ((result* 31)+((this.sat1CndotRdot == null)? 0 :this.sat1CndotRdot.hashCode()));
        result = ((result* 31)+((this.sat2CdrgR == null)? 0 :this.sat2CdrgR.hashCode()));
        result = ((result* 31)+((this.sat2CdrgT == null)? 0 :this.sat2CdrgT.hashCode()));
        result = ((result* 31)+((this.sat2CsrpDrgUnit == null)? 0 :this.sat2CsrpDrgUnit.hashCode()));
        result = ((result* 31)+((this.sat1YDot == null)? 0 :this.sat1YDot.hashCode()));
        result = ((result* 31)+((this.sat2CnTUnit == null)? 0 :this.sat2CnTUnit.hashCode()));
        result = ((result* 31)+((this.sat2ResidualsAccepted == null)? 0 :this.sat2ResidualsAccepted.hashCode()));
        result = ((result* 31)+((this.sat2CdAreaOverMass == null)? 0 :this.sat2CdAreaOverMass.hashCode()));
        result = ((result* 31)+((this.sat1CdrgRdotUnit == null)? 0 :this.sat1CdrgRdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1CdrgTdotUnit == null)? 0 :this.sat1CdrgTdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1SedrUnit == null)? 0 :this.sat1SedrUnit.hashCode()));
        result = ((result* 31)+((this.sat2CatalogName == null)? 0 :this.sat2CatalogName.hashCode()));
        result = ((result* 31)+((this.sat1CtT == null)? 0 :this.sat1CtT.hashCode()));
        result = ((result* 31)+((this.sat1CndotT == null)? 0 :this.sat1CndotT.hashCode()));
        result = ((result* 31)+((this.sat2CdrgN == null)? 0 :this.sat2CdrgN.hashCode()));
        result = ((result* 31)+((this.sat1EarthTides == null)? 0 :this.sat1EarthTides.hashCode()));
        result = ((result* 31)+((this.sat1CtR == null)? 0 :this.sat1CtR.hashCode()));
        result = ((result* 31)+((this.sat1CsrpRdot == null)? 0 :this.sat1CsrpRdot.hashCode()));
        result = ((result* 31)+((this.sat1CrAreaOverMassUnit == null)? 0 :this.sat1CrAreaOverMassUnit.hashCode()));
        result = ((result* 31)+((this.sat2ObjectDesignator == null)? 0 :this.sat2ObjectDesignator.hashCode()));
        result = ((result* 31)+((this.sat2CdrgTUnit == null)? 0 :this.sat2CdrgTUnit.hashCode()));
        result = ((result* 31)+((this.sat1InternationalDesignator == null)? 0 :this.sat1InternationalDesignator.hashCode()));
        result = ((result* 31)+((this.sat2CrAreaOverMass == null)? 0 :this.sat2CrAreaOverMass.hashCode()));
        result = ((result* 31)+((this.messageId == null)? 0 :this.messageId.hashCode()));
        result = ((result* 31)+((this.relativeVelocityTUnit == null)? 0 :this.relativeVelocityTUnit.hashCode()));
        result = ((result* 31)+((this.creationDate == null)? 0 :this.creationDate.hashCode()));
        result = ((result* 31)+((this.sat1CnRUnit == null)? 0 :this.sat1CnRUnit.hashCode()));
        result = ((result* 31)+((this.sat1CndotRUnit == null)? 0 :this.sat1CndotRUnit.hashCode()));
        result = ((result* 31)+((this.sat1CdrgNdot == null)? 0 :this.sat1CdrgNdot.hashCode()));
        result = ((result* 31)+((this.sat2CdrgNdotUnit == null)? 0 :this.sat2CdrgNdotUnit.hashCode()));
        result = ((result* 31)+((this.sat2Sedr == null)? 0 :this.sat2Sedr.hashCode()));
        result = ((result* 31)+((this.sat1CtdotTdotUnit == null)? 0 :this.sat1CtdotTdotUnit.hashCode()));
        result = ((result* 31)+((this.sat2CrdotNUnit == null)? 0 :this.sat2CrdotNUnit.hashCode()));
        result = ((result* 31)+((this.sat2CndotRdot == null)? 0 :this.sat2CndotRdot.hashCode()));
        result = ((result* 31)+((this.sat1CtdotRdotUnit == null)? 0 :this.sat1CtdotRdotUnit.hashCode()));
        result = ((result* 31)+((this.sat2CtdotRdot == null)? 0 :this.sat2CtdotRdot.hashCode()));
        result = ((result* 31)+((this.sat2ThrustAccelerationUnit == null)? 0 :this.sat2ThrustAccelerationUnit.hashCode()));
        result = ((result* 31)+((this.sat2CtdotTUnit == null)? 0 :this.sat2CtdotTUnit.hashCode()));
        result = ((result* 31)+((this.gid == null)? 0 :this.gid.hashCode()));
        result = ((result* 31)+((this.cdmId == null)? 0 :this.cdmId.hashCode()));
        result = ((result* 31)+((this.relativeVelocityT == null)? 0 :this.relativeVelocityT.hashCode()));
        result = ((result* 31)+((this.sat2XUnit == null)? 0 :this.sat2XUnit.hashCode()));
        result = ((result* 31)+((this.relativeVelocityR == null)? 0 :this.relativeVelocityR.hashCode()));
        result = ((result* 31)+((this.collisionProbabilityMethod == null)? 0 :this.collisionProbabilityMethod.hashCode()));
        result = ((result* 31)+((this.sat1CndotRdotUnit == null)? 0 :this.sat1CndotRdotUnit.hashCode()));
        result = ((result* 31)+((this.sat1CnNUnit == null)? 0 :this.sat1CnNUnit.hashCode()));
        result = ((result* 31)+((this.sat1CrdotT == null)? 0 :this.sat1CrdotT.hashCode()));
        result = ((result* 31)+((this.relativeVelocityN == null)? 0 :this.relativeVelocityN.hashCode()));
        result = ((result* 31)+((this.sat1CrdotR == null)? 0 :this.sat1CrdotR.hashCode()));
        result = ((result* 31)+((this.sat1XUnit == null)? 0 :this.sat1XUnit.hashCode()));
        result = ((result* 31)+((this.tca == null)? 0 :this.tca.hashCode()));
        result = ((result* 31)+((this.sat1CrR == null)? 0 :this.sat1CrR.hashCode()));
        result = ((result* 31)+((this.sat2CsrpDrg == null)? 0 :this.sat2CsrpDrg.hashCode()));
        result = ((result* 31)+((this.sat1ActualOdSpan == null)? 0 :this.sat1ActualOdSpan.hashCode()));
        result = ((result* 31)+((this.sat2CsrpSrpUnit == null)? 0 :this.sat2CsrpSrpUnit.hashCode()));
        result = ((result* 31)+((this.sat2ZDot == null)? 0 :this.sat2ZDot.hashCode()));
        result = ((result* 31)+((this.sat2ZDotUnit == null)? 0 :this.sat2ZDotUnit.hashCode()));
        result = ((result* 31)+((this.sat1YDotUnit == null)? 0 :this.sat1YDotUnit.hashCode()));
        result = ((result* 31)+((this.sat1Maneuverable == null)? 0 :this.sat1Maneuverable.hashCode()));
        result = ((result* 31)+((this.sat1CrdotTUnit == null)? 0 :this.sat1CrdotTUnit.hashCode()));
        result = ((result* 31)+((this.sat2TimeLastobEnd == null)? 0 :this.sat2TimeLastobEnd.hashCode()));
        result = ((result* 31)+((this.sat2CnT == null)? 0 :this.sat2CnT.hashCode()));
        result = ((result* 31)+((this.sat2CrdotT == null)? 0 :this.sat2CrdotT.hashCode()));
        result = ((result* 31)+((this.sat2CrdotR == null)? 0 :this.sat2CrdotR.hashCode()));
        result = ((result* 31)+((this.sat1CdAreaOverMass == null)? 0 :this.sat1CdAreaOverMass.hashCode()));
        result = ((result* 31)+((this.sat1CsrpN == null)? 0 :this.sat1CsrpN.hashCode()));
        result = ((result* 31)+((this.sat2CtTUnit == null)? 0 :this.sat2CtTUnit.hashCode()));
        result = ((result* 31)+((this.relativePositionRUnit == null)? 0 :this.relativePositionRUnit.hashCode()));
        result = ((result* 31)+((this.sat2CnR == null)? 0 :this.sat2CnR.hashCode()));
        result = ((result* 31)+((this.sat2CrdotN == null)? 0 :this.sat2CrdotN.hashCode()));
        result = ((result* 31)+((this.sat2ResidualsAcceptedUnit == null)? 0 :this.sat2ResidualsAcceptedUnit.hashCode()));
        result = ((result* 31)+((this.sat1CommentDcpDensityForecastUncertainty == null)? 0 :this.sat1CommentDcpDensityForecastUncertainty.hashCode()));
        result = ((result* 31)+((this.sat1CdrgTdot == null)? 0 :this.sat1CdrgTdot.hashCode()));
        result = ((result* 31)+((this.sat2CnN == null)? 0 :this.sat2CnN.hashCode()));
        result = ((result* 31)+((this.sat2CsrpTUnit == null)? 0 :this.sat2CsrpTUnit.hashCode()));
        result = ((result* 31)+((this.sat1CsrpT == null)? 0 :this.sat1CsrpT.hashCode()));
        result = ((result* 31)+((this.sat1CsrpR == null)? 0 :this.sat1CsrpR.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpaceTrackCdm) == false) {
            return false;
        }
        SpaceTrackCdm rhs = ((SpaceTrackCdm) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.sat1CovarianceMethod == rhs.sat1CovarianceMethod)||((this.sat1CovarianceMethod!= null)&&this.sat1CovarianceMethod.equals(rhs.sat1CovarianceMethod)))&&((this.sat1CrdotRdotUnit == rhs.sat1CrdotRdotUnit)||((this.sat1CrdotRdotUnit!= null)&&this.sat1CrdotRdotUnit.equals(rhs.sat1CrdotRdotUnit))))&&((this.sat2ObsAvailable == rhs.sat2ObsAvailable)||((this.sat2ObsAvailable!= null)&&this.sat2ObsAvailable.equals(rhs.sat2ObsAvailable))))&&((this.relativeSpeedUnit == rhs.relativeSpeedUnit)||((this.relativeSpeedUnit!= null)&&this.relativeSpeedUnit.equals(rhs.relativeSpeedUnit))))&&((this.sat1CndotNdot == rhs.sat1CndotNdot)||((this.sat1CndotNdot!= null)&&this.sat1CndotNdot.equals(rhs.sat1CndotNdot))))&&((this.collisionProbability == rhs.collisionProbability)||((this.collisionProbability!= null)&&this.collisionProbability.equals(rhs.collisionProbability))))&&((this.sat2TimeLastobEndFraction == rhs.sat2TimeLastobEndFraction)||((this.sat2TimeLastobEndFraction!= null)&&this.sat2TimeLastobEndFraction.equals(rhs.sat2TimeLastobEndFraction))))&&((this.sat1ObjectDesignator == rhs.sat1ObjectDesignator)||((this.sat1ObjectDesignator!= null)&&this.sat1ObjectDesignator.equals(rhs.sat1ObjectDesignator))))&&((this.sat2CommentScreeningDataSource == rhs.sat2CommentScreeningDataSource)||((this.sat2CommentScreeningDataSource!= null)&&this.sat2CommentScreeningDataSource.equals(rhs.sat2CommentScreeningDataSource))))&&((this.sat1CsrpTdotUnit == rhs.sat1CsrpTdotUnit)||((this.sat1CsrpTdotUnit!= null)&&this.sat1CsrpTdotUnit.equals(rhs.sat1CsrpTdotUnit))))&&((this.sat2CsrpRdotUnit == rhs.sat2CsrpRdotUnit)||((this.sat2CsrpRdotUnit!= null)&&this.sat2CsrpRdotUnit.equals(rhs.sat2CsrpRdotUnit))))&&((this.sat2NBodyPerturbations == rhs.sat2NBodyPerturbations)||((this.sat2NBodyPerturbations!= null)&&this.sat2NBodyPerturbations.equals(rhs.sat2NBodyPerturbations))))&&((this.constellation == rhs.constellation)||((this.constellation!= null)&&this.constellation.equals(rhs.constellation))))&&((this.sat1CsrpRdotUnit == rhs.sat1CsrpRdotUnit)||((this.sat1CsrpRdotUnit!= null)&&this.sat1CsrpRdotUnit.equals(rhs.sat1CsrpRdotUnit))))&&((this.sat2WeightedRms == rhs.sat2WeightedRms)||((this.sat2WeightedRms!= null)&&this.sat2WeightedRms.equals(rhs.sat2WeightedRms))))&&((this.sat2CtRUnit == rhs.sat2CtRUnit)||((this.sat2CtRUnit!= null)&&this.sat2CtRUnit.equals(rhs.sat2CtRUnit))))&&((this.sat2CsrpNUnit == rhs.sat2CsrpNUnit)||((this.sat2CsrpNUnit!= null)&&this.sat2CsrpNUnit.equals(rhs.sat2CsrpNUnit))))&&((this.sat2CsrpTdotUnit == rhs.sat2CsrpTdotUnit)||((this.sat2CsrpTdotUnit!= null)&&this.sat2CsrpTdotUnit.equals(rhs.sat2CsrpTdotUnit))))&&((this.sat2CommentInclination == rhs.sat2CommentInclination)||((this.sat2CommentInclination!= null)&&this.sat2CommentInclination.equals(rhs.sat2CommentInclination))))&&((this.sat2CdrgDrgUnit == rhs.sat2CdrgDrgUnit)||((this.sat2CdrgDrgUnit!= null)&&this.sat2CdrgDrgUnit.equals(rhs.sat2CdrgDrgUnit))))&&((this.sat1ObsAvailable == rhs.sat1ObsAvailable)||((this.sat1ObsAvailable!= null)&&this.sat1ObsAvailable.equals(rhs.sat1ObsAvailable))))&&((this.sat1CsrpNdot == rhs.sat1CsrpNdot)||((this.sat1CsrpNdot!= null)&&this.sat1CsrpNdot.equals(rhs.sat1CsrpNdot))))&&((this.sat1SolarRadPressure == rhs.sat1SolarRadPressure)||((this.sat1SolarRadPressure!= null)&&this.sat1SolarRadPressure.equals(rhs.sat1SolarRadPressure))))&&((this.sat1Sedr == rhs.sat1Sedr)||((this.sat1Sedr!= null)&&this.sat1Sedr.equals(rhs.sat1Sedr))))&&((this.sat1CsrpNdotUnit == rhs.sat1CsrpNdotUnit)||((this.sat1CsrpNdotUnit!= null)&&this.sat1CsrpNdotUnit.equals(rhs.sat1CsrpNdotUnit))))&&((this.sat1CsrpDrg == rhs.sat1CsrpDrg)||((this.sat1CsrpDrg!= null)&&this.sat1CsrpDrg.equals(rhs.sat1CsrpDrg))))&&((this.sat2CsrpNdotUnit == rhs.sat2CsrpNdotUnit)||((this.sat2CsrpNdotUnit!= null)&&this.sat2CsrpNdotUnit.equals(rhs.sat2CsrpNdotUnit))))&&((this.sat1ZDot == rhs.sat1ZDot)||((this.sat1ZDot!= null)&&this.sat1ZDot.equals(rhs.sat1ZDot))))&&((this.ccsdsCdmVers == rhs.ccsdsCdmVers)||((this.ccsdsCdmVers!= null)&&this.ccsdsCdmVers.equals(rhs.ccsdsCdmVers))))&&((this.missDistance == rhs.missDistance)||((this.missDistance!= null)&&this.missDistance.equals(rhs.missDistance))))&&((this.sat1RefFrame == rhs.sat1RefFrame)||((this.sat1RefFrame!= null)&&this.sat1RefFrame.equals(rhs.sat1RefFrame))))&&((this.sat1Y == rhs.sat1Y)||((this.sat1Y!= null)&&this.sat1Y.equals(rhs.sat1Y))))&&((this.sat2OperatorPhone == rhs.sat2OperatorPhone)||((this.sat2OperatorPhone!= null)&&this.sat2OperatorPhone.equals(rhs.sat2OperatorPhone))))&&((this.sat1AreaPc == rhs.sat1AreaPc)||((this.sat1AreaPc!= null)&&this.sat1AreaPc.equals(rhs.sat1AreaPc))))&&((this.sat1Z == rhs.sat1Z)||((this.sat1Z!= null)&&this.sat1Z.equals(rhs.sat1Z))))&&((this.sat1X == rhs.sat1X)||((this.sat1X!= null)&&this.sat1X.equals(rhs.sat1X))))&&((this.sat1CrdotN == rhs.sat1CrdotN)||((this.sat1CrdotN!= null)&&this.sat1CrdotN.equals(rhs.sat1CrdotN))))&&((this.sat2TimeLastobStart == rhs.sat2TimeLastobStart)||((this.sat2TimeLastobStart!= null)&&this.sat2TimeLastobStart.equals(rhs.sat2TimeLastobStart))))&&((this.sat2YUnit == rhs.sat2YUnit)||((this.sat2YUnit!= null)&&this.sat2YUnit.equals(rhs.sat2YUnit))))&&((this.filename == rhs.filename)||((this.filename!= null)&&this.filename.equals(rhs.filename))))&&((this.sat1CsrpSrpUnit == rhs.sat1CsrpSrpUnit)||((this.sat1CsrpSrpUnit!= null)&&this.sat1CsrpSrpUnit.equals(rhs.sat1CsrpSrpUnit))))&&((this.sat1NBodyPerturbations == rhs.sat1NBodyPerturbations)||((this.sat1NBodyPerturbations!= null)&&this.sat1NBodyPerturbations.equals(rhs.sat1NBodyPerturbations))))&&((this.sat2CrRUnit == rhs.sat2CrRUnit)||((this.sat2CrRUnit!= null)&&this.sat2CrRUnit.equals(rhs.sat2CrRUnit))))&&((this.sat2CtR == rhs.sat2CtR)||((this.sat2CtR!= null)&&this.sat2CtR.equals(rhs.sat2CtR))))&&((this.sat1CdrgRUnit == rhs.sat1CdrgRUnit)||((this.sat1CdrgRUnit!= null)&&this.sat1CdrgRUnit.equals(rhs.sat1CdrgRUnit))))&&((this.sat2CtT == rhs.sat2CtT)||((this.sat2CtT!= null)&&this.sat2CtT.equals(rhs.sat2CtT))))&&((this.sat1CtTUnit == rhs.sat1CtTUnit)||((this.sat1CtTUnit!= null)&&this.sat1CtTUnit.equals(rhs.sat1CtTUnit))))&&((this.relativePositionNUnit == rhs.relativePositionNUnit)||((this.relativePositionNUnit!= null)&&this.relativePositionNUnit.equals(rhs.relativePositionNUnit))))&&((this.relativePositionT == rhs.relativePositionT)||((this.relativePositionT!= null)&&this.relativePositionT.equals(rhs.relativePositionT))))&&((this.relativePositionR == rhs.relativePositionR)||((this.relativePositionR!= null)&&this.relativePositionR.equals(rhs.relativePositionR))))&&((this.sat1CsrpTdot == rhs.sat1CsrpTdot)||((this.sat1CsrpTdot!= null)&&this.sat1CsrpTdot.equals(rhs.sat1CsrpTdot))))&&((this.sat2CrdotRdotUnit == rhs.sat2CrdotRdotUnit)||((this.sat2CrdotRdotUnit!= null)&&this.sat2CrdotRdotUnit.equals(rhs.sat2CrdotRdotUnit))))&&((this.relativePositionN == rhs.relativePositionN)||((this.relativePositionN!= null)&&this.relativePositionN.equals(rhs.relativePositionN))))&&((this.sat2Z == rhs.sat2Z)||((this.sat2Z!= null)&&this.sat2Z.equals(rhs.sat2Z))))&&((this.sat2CrdotTUnit == rhs.sat2CrdotTUnit)||((this.sat2CrdotTUnit!= null)&&this.sat2CrdotTUnit.equals(rhs.sat2CrdotTUnit))))&&((this.sat2CommentPerigee == rhs.sat2CommentPerigee)||((this.sat2CommentPerigee!= null)&&this.sat2CommentPerigee.equals(rhs.sat2CommentPerigee))))&&((this.missDistanceUnit == rhs.missDistanceUnit)||((this.missDistanceUnit!= null)&&this.missDistanceUnit.equals(rhs.missDistanceUnit))))&&((this.sat1CrdotNUnit == rhs.sat1CrdotNUnit)||((this.sat1CrdotNUnit!= null)&&this.sat1CrdotNUnit.equals(rhs.sat1CrdotNUnit))))&&((this.sat2X == rhs.sat2X)||((this.sat2X!= null)&&this.sat2X.equals(rhs.sat2X))))&&((this.commentEmergencyReportable == rhs.commentEmergencyReportable)||((this.commentEmergencyReportable!= null)&&this.commentEmergencyReportable.equals(rhs.commentEmergencyReportable))))&&((this.sat2Y == rhs.sat2Y)||((this.sat2Y!= null)&&this.sat2Y.equals(rhs.sat2Y))))&&((this.sat1CtdotTdot == rhs.sat1CtdotTdot)||((this.sat1CtdotTdot!= null)&&this.sat1CtdotTdot.equals(rhs.sat1CtdotTdot))))&&((this.sat2AtmosphericModel == rhs.sat2AtmosphericModel)||((this.sat2AtmosphericModel!= null)&&this.sat2AtmosphericModel.equals(rhs.sat2AtmosphericModel))))&&((this.sat2CdrgDrg == rhs.sat2CdrgDrg)||((this.sat2CdrgDrg!= null)&&this.sat2CdrgDrg.equals(rhs.sat2CdrgDrg))))&&((this.sat2CommentDcpSensitivityVectorPosition == rhs.sat2CommentDcpSensitivityVectorPosition)||((this.sat2CommentDcpSensitivityVectorPosition!= null)&&this.sat2CommentDcpSensitivityVectorPosition.equals(rhs.sat2CommentDcpSensitivityVectorPosition))))&&((this.sat2ObsUsed == rhs.sat2ObsUsed)||((this.sat2ObsUsed!= null)&&this.sat2ObsUsed.equals(rhs.sat2ObsUsed))))&&((this.sat1CtdotTUnit == rhs.sat1CtdotTUnit)||((this.sat1CtdotTUnit!= null)&&this.sat1CtdotTUnit.equals(rhs.sat1CtdotTUnit))))&&((this.sat1CdrgDrgUnit == rhs.sat1CdrgDrgUnit)||((this.sat1CdrgDrgUnit!= null)&&this.sat1CdrgDrgUnit.equals(rhs.sat1CdrgDrgUnit))))&&((this.sat1CsrpTUnit == rhs.sat1CsrpTUnit)||((this.sat1CsrpTUnit!= null)&&this.sat1CsrpTUnit.equals(rhs.sat1CsrpTUnit))))&&((this.sat1CndotR == rhs.sat1CndotR)||((this.sat1CndotR!= null)&&this.sat1CndotR.equals(rhs.sat1CndotR))))&&((this.sat2CdrgRdot == rhs.sat2CdrgRdot)||((this.sat2CdrgRdot!= null)&&this.sat2CdrgRdot.equals(rhs.sat2CdrgRdot))))&&((this.sat1CndotN == rhs.sat1CndotN)||((this.sat1CndotN!= null)&&this.sat1CndotN.equals(rhs.sat1CndotN))))&&((this.sat1TimeLastobEndFraction == rhs.sat1TimeLastobEndFraction)||((this.sat1TimeLastobEndFraction!= null)&&this.sat1TimeLastobEndFraction.equals(rhs.sat1TimeLastobEndFraction))))&&((this.sat1CatalogName == rhs.sat1CatalogName)||((this.sat1CatalogName!= null)&&this.sat1CatalogName.equals(rhs.sat1CatalogName))))&&((this.sat1ObjectType == rhs.sat1ObjectType)||((this.sat1ObjectType!= null)&&this.sat1ObjectType.equals(rhs.sat1ObjectType))))&&((this.sat1CommentCovarianceScaleFactor == rhs.sat1CommentCovarianceScaleFactor)||((this.sat1CommentCovarianceScaleFactor!= null)&&this.sat1CommentCovarianceScaleFactor.equals(rhs.sat1CommentCovarianceScaleFactor))))&&((this.sat2GravityModel == rhs.sat2GravityModel)||((this.sat2GravityModel!= null)&&this.sat2GravityModel.equals(rhs.sat2GravityModel))))&&((this.sat1GravityModel == rhs.sat1GravityModel)||((this.sat1GravityModel!= null)&&this.sat1GravityModel.equals(rhs.sat1GravityModel))))&&((this.sat1CsrpDrgUnit == rhs.sat1CsrpDrgUnit)||((this.sat1CsrpDrgUnit!= null)&&this.sat1CsrpDrgUnit.equals(rhs.sat1CsrpDrgUnit))))&&((this.sat1WeightedRms == rhs.sat1WeightedRms)||((this.sat1WeightedRms!= null)&&this.sat1WeightedRms.equals(rhs.sat1WeightedRms))))&&((this.sat1EphemerisName == rhs.sat1EphemerisName)||((this.sat1EphemerisName!= null)&&this.sat1EphemerisName.equals(rhs.sat1EphemerisName))))&&((this.sat2CrR == rhs.sat2CrR)||((this.sat2CrR!= null)&&this.sat2CrR.equals(rhs.sat2CrR))))&&((this.messageFor == rhs.messageFor)||((this.messageFor!= null)&&this.messageFor.equals(rhs.messageFor))))&&((this.sat1RecommendedOdSpan == rhs.sat1RecommendedOdSpan)||((this.sat1RecommendedOdSpan!= null)&&this.sat1RecommendedOdSpan.equals(rhs.sat1RecommendedOdSpan))))&&((this.sat1CsrpSrp == rhs.sat1CsrpSrp)||((this.sat1CsrpSrp!= null)&&this.sat1CsrpSrp.equals(rhs.sat1CsrpSrp))))&&((this.sat1TimeLastobStart == rhs.sat1TimeLastobStart)||((this.sat1TimeLastobStart!= null)&&this.sat1TimeLastobStart.equals(rhs.sat1TimeLastobStart))))&&((this.sat1CrdotRUnit == rhs.sat1CrdotRUnit)||((this.sat1CrdotRUnit!= null)&&this.sat1CrdotRUnit.equals(rhs.sat1CrdotRUnit))))&&((this.sat2CdrgTdotUnit == rhs.sat2CdrgTdotUnit)||((this.sat2CdrgTdotUnit!= null)&&this.sat2CdrgTdotUnit.equals(rhs.sat2CdrgTdotUnit))))&&((this.relativeVelocityRUnit == rhs.relativeVelocityRUnit)||((this.relativeVelocityRUnit!= null)&&this.relativeVelocityRUnit.equals(rhs.relativeVelocityRUnit))))&&((this.sat2InternationalDesignator == rhs.sat2InternationalDesignator)||((this.sat2InternationalDesignator!= null)&&this.sat2InternationalDesignator.equals(rhs.sat2InternationalDesignator))))&&((this.sat1CnTUnit == rhs.sat1CnTUnit)||((this.sat1CnTUnit!= null)&&this.sat1CnTUnit.equals(rhs.sat1CnTUnit))))&&((this.sat1CrdotRdot == rhs.sat1CrdotRdot)||((this.sat1CrdotRdot!= null)&&this.sat1CrdotRdot.equals(rhs.sat1CrdotRdot))))&&((this.sat1CndotTUnit == rhs.sat1CndotTUnit)||((this.sat1CndotTUnit!= null)&&this.sat1CndotTUnit.equals(rhs.sat1CndotTUnit))))&&((this.sat1CtdotRdot == rhs.sat1CtdotRdot)||((this.sat1CtdotRdot!= null)&&this.sat1CtdotRdot.equals(rhs.sat1CtdotRdot))))&&((this.sat2CdrgRdotUnit == rhs.sat2CdrgRdotUnit)||((this.sat2CdrgRdotUnit!= null)&&this.sat2CdrgRdotUnit.equals(rhs.sat2CdrgRdotUnit))))&&((this.sat1CommentExclusionVolumeRadius == rhs.sat1CommentExclusionVolumeRadius)||((this.sat1CommentExclusionVolumeRadius!= null)&&this.sat1CommentExclusionVolumeRadius.equals(rhs.sat1CommentExclusionVolumeRadius))))&&((this.sat1ThrustAcceleration == rhs.sat1ThrustAcceleration)||((this.sat1ThrustAcceleration!= null)&&this.sat1ThrustAcceleration.equals(rhs.sat1ThrustAcceleration))))&&((this.sat2CnRUnit == rhs.sat2CnRUnit)||((this.sat2CnRUnit!= null)&&this.sat2CnRUnit.equals(rhs.sat2CnRUnit))))&&((this.sat2CtdotN == rhs.sat2CtdotN)||((this.sat2CtdotN!= null)&&this.sat2CtdotN.equals(rhs.sat2CtdotN))))&&((this.sat2CtdotR == rhs.sat2CtdotR)||((this.sat2CtdotR!= null)&&this.sat2CtdotR.equals(rhs.sat2CtdotR))))&&((this.sat2TimeLastobStartFraction == rhs.sat2TimeLastobStartFraction)||((this.sat2TimeLastobStartFraction!= null)&&this.sat2TimeLastobStartFraction.equals(rhs.sat2TimeLastobStartFraction))))&&((this.sat2CtdotT == rhs.sat2CtdotT)||((this.sat2CtdotT!= null)&&this.sat2CtdotT.equals(rhs.sat2CtdotT))))&&((this.sat2ObjectType == rhs.sat2ObjectType)||((this.sat2ObjectType!= null)&&this.sat2ObjectType.equals(rhs.sat2ObjectType))))&&((this.sat2CndotRUnit == rhs.sat2CndotRUnit)||((this.sat2CndotRUnit!= null)&&this.sat2CndotRUnit.equals(rhs.sat2CndotRUnit))))&&((this.sat2XDotUnit == rhs.sat2XDotUnit)||((this.sat2XDotUnit!= null)&&this.sat2XDotUnit.equals(rhs.sat2XDotUnit))))&&((this.sat2YDotUnit == rhs.sat2YDotUnit)||((this.sat2YDotUnit!= null)&&this.sat2YDotUnit.equals(rhs.sat2YDotUnit))))&&((this.sat2CndotNUnit == rhs.sat2CndotNUnit)||((this.sat2CndotNUnit!= null)&&this.sat2CndotNUnit.equals(rhs.sat2CndotNUnit))))&&((this.sat2ZUnit == rhs.sat2ZUnit)||((this.sat2ZUnit!= null)&&this.sat2ZUnit.equals(rhs.sat2ZUnit))))&&((this.sat2CdrgTdot == rhs.sat2CdrgTdot)||((this.sat2CdrgTdot!= null)&&this.sat2CdrgTdot.equals(rhs.sat2CdrgTdot))))&&((this.sat1ZDotUnit == rhs.sat1ZDotUnit)||((this.sat1ZDotUnit!= null)&&this.sat1ZDotUnit.equals(rhs.sat1ZDotUnit))))&&((this.sat2RecommendedOdSpan == rhs.sat2RecommendedOdSpan)||((this.sat2RecommendedOdSpan!= null)&&this.sat2RecommendedOdSpan.equals(rhs.sat2RecommendedOdSpan))))&&((this.sat1OperatorPhone == rhs.sat1OperatorPhone)||((this.sat1OperatorPhone!= null)&&this.sat1OperatorPhone.equals(rhs.sat1OperatorPhone))))&&((this.sat1CdrgT == rhs.sat1CdrgT)||((this.sat1CdrgT!= null)&&this.sat1CdrgT.equals(rhs.sat1CdrgT))))&&((this.sat1CdrgR == rhs.sat1CdrgR)||((this.sat1CdrgR!= null)&&this.sat1CdrgR.equals(rhs.sat1CdrgR))))&&((this.sat1CdrgNdotUnit == rhs.sat1CdrgNdotUnit)||((this.sat1CdrgNdotUnit!= null)&&this.sat1CdrgNdotUnit.equals(rhs.sat1CdrgNdotUnit))))&&((this.sat1AreaPcUnit == rhs.sat1AreaPcUnit)||((this.sat1AreaPcUnit!= null)&&this.sat1AreaPcUnit.equals(rhs.sat1AreaPcUnit))))&&((this.sat1CdrgN == rhs.sat1CdrgN)||((this.sat1CdrgN!= null)&&this.sat1CdrgN.equals(rhs.sat1CdrgN))))&&((this.sat2CrdotRdot == rhs.sat2CrdotRdot)||((this.sat2CrdotRdot!= null)&&this.sat2CrdotRdot.equals(rhs.sat2CrdotRdot))))&&((this.sat2CovarianceMethod == rhs.sat2CovarianceMethod)||((this.sat2CovarianceMethod!= null)&&this.sat2CovarianceMethod.equals(rhs.sat2CovarianceMethod))))&&((this.sat2ThrustAcceleration == rhs.sat2ThrustAcceleration)||((this.sat2ThrustAcceleration!= null)&&this.sat2ThrustAcceleration.equals(rhs.sat2ThrustAcceleration))))&&((this.sat1CommentDcpSensitivityVectorPosition == rhs.sat1CommentDcpSensitivityVectorPosition)||((this.sat1CommentDcpSensitivityVectorPosition!= null)&&this.sat1CommentDcpSensitivityVectorPosition.equals(rhs.sat1CommentDcpSensitivityVectorPosition))))&&((this.sat1CndotTdot == rhs.sat1CndotTdot)||((this.sat1CndotTdot!= null)&&this.sat1CndotTdot.equals(rhs.sat1CndotTdot))))&&((this.sat2AreaPc == rhs.sat2AreaPc)||((this.sat2AreaPc!= null)&&this.sat2AreaPc.equals(rhs.sat2AreaPc))))&&((this.relativeVelocityNUnit == rhs.relativeVelocityNUnit)||((this.relativeVelocityNUnit!= null)&&this.relativeVelocityNUnit.equals(rhs.relativeVelocityNUnit))))&&((this.sat2SolarRadPressure == rhs.sat2SolarRadPressure)||((this.sat2SolarRadPressure!= null)&&this.sat2SolarRadPressure.equals(rhs.sat2SolarRadPressure))))&&((this.sat1OperatorContactPosition == rhs.sat1OperatorContactPosition)||((this.sat1OperatorContactPosition!= null)&&this.sat1OperatorContactPosition.equals(rhs.sat1OperatorContactPosition))))&&((this.sat2CrAreaOverMassUnit == rhs.sat2CrAreaOverMassUnit)||((this.sat2CrAreaOverMassUnit!= null)&&this.sat2CrAreaOverMassUnit.equals(rhs.sat2CrAreaOverMassUnit))))&&((this.tcaFraction == rhs.tcaFraction)||((this.tcaFraction!= null)&&this.tcaFraction.equals(rhs.tcaFraction))))&&((this.sat2OperatorOrganization == rhs.sat2OperatorOrganization)||((this.sat2OperatorOrganization!= null)&&this.sat2OperatorOrganization.equals(rhs.sat2OperatorOrganization))))&&((this.originator == rhs.originator)||((this.originator!= null)&&this.originator.equals(rhs.originator))))&&((this.sat1ZUnit == rhs.sat1ZUnit)||((this.sat1ZUnit!= null)&&this.sat1ZUnit.equals(rhs.sat1ZUnit))))&&((this.sat1CtdotNUnit == rhs.sat1CtdotNUnit)||((this.sat1CtdotNUnit!= null)&&this.sat1CtdotNUnit.equals(rhs.sat1CtdotNUnit))))&&((this.sat1CdrgDrg == rhs.sat1CdrgDrg)||((this.sat1CdrgDrg!= null)&&this.sat1CdrgDrg.equals(rhs.sat1CdrgDrg))))&&((this.sat2CommentDcpDensityForecastUncertainty == rhs.sat2CommentDcpDensityForecastUncertainty)||((this.sat2CommentDcpDensityForecastUncertainty!= null)&&this.sat2CommentDcpDensityForecastUncertainty.equals(rhs.sat2CommentDcpDensityForecastUncertainty))))&&((this.sat1CndotNdotUnit == rhs.sat1CndotNdotUnit)||((this.sat1CndotNdotUnit!= null)&&this.sat1CndotNdotUnit.equals(rhs.sat1CndotNdotUnit))))&&((this.sat1CommentDcpSensitivityVectorVelocity == rhs.sat1CommentDcpSensitivityVectorVelocity)||((this.sat1CommentDcpSensitivityVectorVelocity!= null)&&this.sat1CommentDcpSensitivityVectorVelocity.equals(rhs.sat1CommentDcpSensitivityVectorVelocity))))&&((this.sat1OperatorEmail == rhs.sat1OperatorEmail)||((this.sat1OperatorEmail!= null)&&this.sat1OperatorEmail.equals(rhs.sat1OperatorEmail))))&&((this.sat2CsrpRUnit == rhs.sat2CsrpRUnit)||((this.sat2CsrpRUnit!= null)&&this.sat2CsrpRUnit.equals(rhs.sat2CsrpRUnit))))&&((this.sat1CommentApogee == rhs.sat1CommentApogee)||((this.sat1CommentApogee!= null)&&this.sat1CommentApogee.equals(rhs.sat1CommentApogee))))&&((this.sat2ActualOdSpan == rhs.sat2ActualOdSpan)||((this.sat2ActualOdSpan!= null)&&this.sat2ActualOdSpan.equals(rhs.sat2ActualOdSpan))))&&((this.sat2CommentExclusionVolumeRadius == rhs.sat2CommentExclusionVolumeRadius)||((this.sat2CommentExclusionVolumeRadius!= null)&&this.sat2CommentExclusionVolumeRadius.equals(rhs.sat2CommentExclusionVolumeRadius))))&&((this.sat2CsrpRdot == rhs.sat2CsrpRdot)||((this.sat2CsrpRdot!= null)&&this.sat2CsrpRdot.equals(rhs.sat2CsrpRdot))))&&((this.sat1CommentInclination == rhs.sat1CommentInclination)||((this.sat1CommentInclination!= null)&&this.sat1CommentInclination.equals(rhs.sat1CommentInclination))))&&((this.sat2XDot == rhs.sat2XDot)||((this.sat2XDot!= null)&&this.sat2XDot.equals(rhs.sat2XDot))))&&((this.sat2Maneuverable == rhs.sat2Maneuverable)||((this.sat2Maneuverable!= null)&&this.sat2Maneuverable.equals(rhs.sat2Maneuverable))))&&((this.sat1CdrgNUnit == rhs.sat1CdrgNUnit)||((this.sat1CdrgNUnit!= null)&&this.sat1CdrgNUnit.equals(rhs.sat1CdrgNUnit))))&&((this.sat1CtdotR == rhs.sat1CtdotR)||((this.sat1CtdotR!= null)&&this.sat1CtdotR.equals(rhs.sat1CtdotR))))&&((this.sat1CtdotT == rhs.sat1CtdotT)||((this.sat1CtdotT!= null)&&this.sat1CtdotT.equals(rhs.sat1CtdotT))))&&((this.sat2RefFrame == rhs.sat2RefFrame)||((this.sat2RefFrame!= null)&&this.sat2RefFrame.equals(rhs.sat2RefFrame))))&&((this.sat1CtdotN == rhs.sat1CtdotN)||((this.sat1CtdotN!= null)&&this.sat1CtdotN.equals(rhs.sat1CtdotN))))&&((this.sat2CommentOperatorHardBodyRadius == rhs.sat2CommentOperatorHardBodyRadius)||((this.sat2CommentOperatorHardBodyRadius!= null)&&this.sat2CommentOperatorHardBodyRadius.equals(rhs.sat2CommentOperatorHardBodyRadius))))&&((this.sat2CdrgNdot == rhs.sat2CdrgNdot)||((this.sat2CdrgNdot!= null)&&this.sat2CdrgNdot.equals(rhs.sat2CdrgNdot))))&&((this.sat1ActualOdSpanUnit == rhs.sat1ActualOdSpanUnit)||((this.sat1ActualOdSpanUnit!= null)&&this.sat1ActualOdSpanUnit.equals(rhs.sat1ActualOdSpanUnit))))&&((this.sat2AreaPcUnit == rhs.sat2AreaPcUnit)||((this.sat2AreaPcUnit!= null)&&this.sat2AreaPcUnit.equals(rhs.sat2AreaPcUnit))))&&((this.sat1OperatorOrganization == rhs.sat1OperatorOrganization)||((this.sat1OperatorOrganization!= null)&&this.sat1OperatorOrganization.equals(rhs.sat1OperatorOrganization))))&&((this.sat2EphemerisName == rhs.sat2EphemerisName)||((this.sat2EphemerisName!= null)&&this.sat2EphemerisName.equals(rhs.sat2EphemerisName))))&&((this.sat2CtdotRUnit == rhs.sat2CtdotRUnit)||((this.sat2CtdotRUnit!= null)&&this.sat2CtdotRUnit.equals(rhs.sat2CtdotRUnit))))&&((this.sat2CtdotTdot == rhs.sat2CtdotTdot)||((this.sat2CtdotTdot!= null)&&this.sat2CtdotTdot.equals(rhs.sat2CtdotTdot))))&&((this.sat2CommentCovarianceScaleFactor == rhs.sat2CommentCovarianceScaleFactor)||((this.sat2CommentCovarianceScaleFactor!= null)&&this.sat2CommentCovarianceScaleFactor.equals(rhs.sat2CommentCovarianceScaleFactor))))&&((this.sat2CsrpTdot == rhs.sat2CsrpTdot)||((this.sat2CsrpTdot!= null)&&this.sat2CsrpTdot.equals(rhs.sat2CsrpTdot))))&&((this.sat1CsrpRUnit == rhs.sat1CsrpRUnit)||((this.sat1CsrpRUnit!= null)&&this.sat1CsrpRUnit.equals(rhs.sat1CsrpRUnit))))&&((this.sat2YDot == rhs.sat2YDot)||((this.sat2YDot!= null)&&this.sat2YDot.equals(rhs.sat2YDot))))&&((this.sat2CndotTdotUnit == rhs.sat2CndotTdotUnit)||((this.sat2CndotTdotUnit!= null)&&this.sat2CndotTdotUnit.equals(rhs.sat2CndotTdotUnit))))&&((this.sat1CtdotRUnit == rhs.sat1CtdotRUnit)||((this.sat1CtdotRUnit!= null)&&this.sat1CtdotRUnit.equals(rhs.sat1CtdotRUnit))))&&((this.sat2CndotRdotUnit == rhs.sat2CndotRdotUnit)||((this.sat2CndotRdotUnit!= null)&&this.sat2CndotRdotUnit.equals(rhs.sat2CndotRdotUnit))))&&((this.sat1AtmosphericModel == rhs.sat1AtmosphericModel)||((this.sat1AtmosphericModel!= null)&&this.sat1AtmosphericModel.equals(rhs.sat1AtmosphericModel))))&&((this.sat1IntrackThrust == rhs.sat1IntrackThrust)||((this.sat1IntrackThrust!= null)&&this.sat1IntrackThrust.equals(rhs.sat1IntrackThrust))))&&((this.sat1CtRUnit == rhs.sat1CtRUnit)||((this.sat1CtRUnit!= null)&&this.sat1CtRUnit.equals(rhs.sat1CtRUnit))))&&((this.sat2CndotNdotUnit == rhs.sat2CndotNdotUnit)||((this.sat2CndotNdotUnit!= null)&&this.sat2CndotNdotUnit.equals(rhs.sat2CndotNdotUnit))))&&((this.relativePositionTUnit == rhs.relativePositionTUnit)||((this.relativePositionTUnit!= null)&&this.relativePositionTUnit.equals(rhs.relativePositionTUnit))))&&((this.sat1CrAreaOverMass == rhs.sat1CrAreaOverMass)||((this.sat1CrAreaOverMass!= null)&&this.sat1CrAreaOverMass.equals(rhs.sat1CrAreaOverMass))))&&((this.sat2CdAreaOverMassUnit == rhs.sat2CdAreaOverMassUnit)||((this.sat2CdAreaOverMassUnit!= null)&&this.sat2CdAreaOverMassUnit.equals(rhs.sat2CdAreaOverMassUnit))))&&((this.sat2OperatorEmail == rhs.sat2OperatorEmail)||((this.sat2OperatorEmail!= null)&&this.sat2OperatorEmail.equals(rhs.sat2OperatorEmail))))&&((this.creationDateFraction == rhs.creationDateFraction)||((this.creationDateFraction!= null)&&this.creationDateFraction.equals(rhs.creationDateFraction))))&&((this.sat1ResidualsAccepted == rhs.sat1ResidualsAccepted)||((this.sat1ResidualsAccepted!= null)&&this.sat1ResidualsAccepted.equals(rhs.sat1ResidualsAccepted))))&&((this.sat1ResidualsAcceptedUnit == rhs.sat1ResidualsAcceptedUnit)||((this.sat1ResidualsAcceptedUnit!= null)&&this.sat1ResidualsAcceptedUnit.equals(rhs.sat1ResidualsAcceptedUnit))))&&((this.sat2CommentApogee == rhs.sat2CommentApogee)||((this.sat2CommentApogee!= null)&&this.sat2CommentApogee.equals(rhs.sat2CommentApogee))))&&((this.sat2CsrpT == rhs.sat2CsrpT)||((this.sat2CsrpT!= null)&&this.sat2CsrpT.equals(rhs.sat2CsrpT))))&&((this.sat1ObsUsed == rhs.sat1ObsUsed)||((this.sat1ObsUsed!= null)&&this.sat1ObsUsed.equals(rhs.sat1ObsUsed))))&&((this.sat2CndotNdot == rhs.sat2CndotNdot)||((this.sat2CndotNdot!= null)&&this.sat2CndotNdot.equals(rhs.sat2CndotNdot))))&&((this.sat2CsrpR == rhs.sat2CsrpR)||((this.sat2CsrpR!= null)&&this.sat2CsrpR.equals(rhs.sat2CsrpR))))&&((this.sat1ObjectName == rhs.sat1ObjectName)||((this.sat1ObjectName!= null)&&this.sat1ObjectName.equals(rhs.sat1ObjectName))))&&((this.sat2CtdotRdotUnit == rhs.sat2CtdotRdotUnit)||((this.sat2CtdotRdotUnit!= null)&&this.sat2CtdotRdotUnit.equals(rhs.sat2CtdotRdotUnit))))&&((this.sat2OperatorContactPosition == rhs.sat2OperatorContactPosition)||((this.sat2OperatorContactPosition!= null)&&this.sat2OperatorContactPosition.equals(rhs.sat2OperatorContactPosition))))&&((this.sat2CsrpN == rhs.sat2CsrpN)||((this.sat2CsrpN!= null)&&this.sat2CsrpN.equals(rhs.sat2CsrpN))))&&((this.sat2CsrpSrp == rhs.sat2CsrpSrp)||((this.sat2CsrpSrp!= null)&&this.sat2CsrpSrp.equals(rhs.sat2CsrpSrp))))&&((this.sat2SedrUnit == rhs.sat2SedrUnit)||((this.sat2SedrUnit!= null)&&this.sat2SedrUnit.equals(rhs.sat2SedrUnit))))&&((this.sat2CtdotTdotUnit == rhs.sat2CtdotTdotUnit)||((this.sat2CtdotTdotUnit!= null)&&this.sat2CtdotTdotUnit.equals(rhs.sat2CtdotTdotUnit))))&&((this.sat1CdrgRdot == rhs.sat1CdrgRdot)||((this.sat1CdrgRdot!= null)&&this.sat1CdrgRdot.equals(rhs.sat1CdrgRdot))))&&((this.sat2CommentDcpSensitivityVectorVelocity == rhs.sat2CommentDcpSensitivityVectorVelocity)||((this.sat2CommentDcpSensitivityVectorVelocity!= null)&&this.sat2CommentDcpSensitivityVectorVelocity.equals(rhs.sat2CommentDcpSensitivityVectorVelocity))))&&((this.insertEpoch == rhs.insertEpoch)||((this.insertEpoch!= null)&&this.insertEpoch.equals(rhs.insertEpoch))))&&((this.sat1CommentOperatorHardBodyRadius == rhs.sat1CommentOperatorHardBodyRadius)||((this.sat1CommentOperatorHardBodyRadius!= null)&&this.sat1CommentOperatorHardBodyRadius.equals(rhs.sat1CommentOperatorHardBodyRadius))))&&((this.sat2Object == rhs.sat2Object)||((this.sat2Object!= null)&&this.sat2Object.equals(rhs.sat2Object))))&&((this.sat2CtdotNUnit == rhs.sat2CtdotNUnit)||((this.sat2CtdotNUnit!= null)&&this.sat2CtdotNUnit.equals(rhs.sat2CtdotNUnit))))&&((this.sat1CsrpNUnit == rhs.sat1CsrpNUnit)||((this.sat1CsrpNUnit!= null)&&this.sat1CsrpNUnit.equals(rhs.sat1CsrpNUnit))))&&((this.sat2CndotR == rhs.sat2CndotR)||((this.sat2CndotR!= null)&&this.sat2CndotR.equals(rhs.sat2CndotR))))&&((this.sat2CndotT == rhs.sat2CndotT)||((this.sat2CndotT!= null)&&this.sat2CndotT.equals(rhs.sat2CndotT))))&&((this.sat2ObjectName == rhs.sat2ObjectName)||((this.sat2ObjectName!= null)&&this.sat2ObjectName.equals(rhs.sat2ObjectName))))&&((this.sat1Object == rhs.sat1Object)||((this.sat1Object!= null)&&this.sat1Object.equals(rhs.sat1Object))))&&((this.sat2CndotN == rhs.sat2CndotN)||((this.sat2CndotN!= null)&&this.sat2CndotN.equals(rhs.sat2CndotN))))&&((this.sat1CndotNUnit == rhs.sat1CndotNUnit)||((this.sat1CndotNUnit!= null)&&this.sat1CndotNUnit.equals(rhs.sat1CndotNUnit))))&&((this.sat1CndotTdotUnit == rhs.sat1CndotTdotUnit)||((this.sat1CndotTdotUnit!= null)&&this.sat1CndotTdotUnit.equals(rhs.sat1CndotTdotUnit))))&&((this.commentScreeningOption == rhs.commentScreeningOption)||((this.commentScreeningOption!= null)&&this.commentScreeningOption.equals(rhs.commentScreeningOption))))&&((this.sat2ActualOdSpanUnit == rhs.sat2ActualOdSpanUnit)||((this.sat2ActualOdSpanUnit!= null)&&this.sat2ActualOdSpanUnit.equals(rhs.sat2ActualOdSpanUnit))))&&((this.sat2CnNUnit == rhs.sat2CnNUnit)||((this.sat2CnNUnit!= null)&&this.sat2CnNUnit.equals(rhs.sat2CnNUnit))))&&((this.sat2CdrgRUnit == rhs.sat2CdrgRUnit)||((this.sat2CdrgRUnit!= null)&&this.sat2CdrgRUnit.equals(rhs.sat2CdrgRUnit))))&&((this.sat1RecommendedOdSpanUnit == rhs.sat1RecommendedOdSpanUnit)||((this.sat1RecommendedOdSpanUnit!= null)&&this.sat1RecommendedOdSpanUnit.equals(rhs.sat1RecommendedOdSpanUnit))))&&((this.sat2IntrackThrust == rhs.sat2IntrackThrust)||((this.sat2IntrackThrust!= null)&&this.sat2IntrackThrust.equals(rhs.sat2IntrackThrust))))&&((this.sat1CnR == rhs.sat1CnR)||((this.sat1CnR!= null)&&this.sat1CnR.equals(rhs.sat1CnR))))&&((this.sat1ThrustAccelerationUnit == rhs.sat1ThrustAccelerationUnit)||((this.sat1ThrustAccelerationUnit!= null)&&this.sat1ThrustAccelerationUnit.equals(rhs.sat1ThrustAccelerationUnit))))&&((this.sat2RecommendedOdSpanUnit == rhs.sat2RecommendedOdSpanUnit)||((this.sat2RecommendedOdSpanUnit!= null)&&this.sat2RecommendedOdSpanUnit.equals(rhs.sat2RecommendedOdSpanUnit))))&&((this.sat1CnT == rhs.sat1CnT)||((this.sat1CnT!= null)&&this.sat1CnT.equals(rhs.sat1CnT))))&&((this.sat1CnN == rhs.sat1CnN)||((this.sat1CnN!= null)&&this.sat1CnN.equals(rhs.sat1CnN))))&&((this.sat2CsrpNdot == rhs.sat2CsrpNdot)||((this.sat2CsrpNdot!= null)&&this.sat2CsrpNdot.equals(rhs.sat2CsrpNdot))))&&((this.sat1XDotUnit == rhs.sat1XDotUnit)||((this.sat1XDotUnit!= null)&&this.sat1XDotUnit.equals(rhs.sat1XDotUnit))))&&((this.sat1YUnit == rhs.sat1YUnit)||((this.sat1YUnit!= null)&&this.sat1YUnit.equals(rhs.sat1YUnit))))&&((this.sat1CdrgTUnit == rhs.sat1CdrgTUnit)||((this.sat1CdrgTUnit!= null)&&this.sat1CdrgTUnit.equals(rhs.sat1CdrgTUnit))))&&((this.sat1CdAreaOverMassUnit == rhs.sat1CdAreaOverMassUnit)||((this.sat1CdAreaOverMassUnit!= null)&&this.sat1CdAreaOverMassUnit.equals(rhs.sat1CdAreaOverMassUnit))))&&((this.sat2CrdotRUnit == rhs.sat2CrdotRUnit)||((this.sat2CrdotRUnit!= null)&&this.sat2CrdotRUnit.equals(rhs.sat2CrdotRUnit))))&&((this.sat1TimeLastobEnd == rhs.sat1TimeLastobEnd)||((this.sat1TimeLastobEnd!= null)&&this.sat1TimeLastobEnd.equals(rhs.sat1TimeLastobEnd))))&&((this.sat1CommentPerigee == rhs.sat1CommentPerigee)||((this.sat1CommentPerigee!= null)&&this.sat1CommentPerigee.equals(rhs.sat1CommentPerigee))))&&((this.sat1XDot == rhs.sat1XDot)||((this.sat1XDot!= null)&&this.sat1XDot.equals(rhs.sat1XDot))))&&((this.sat2CdrgNUnit == rhs.sat2CdrgNUnit)||((this.sat2CdrgNUnit!= null)&&this.sat2CdrgNUnit.equals(rhs.sat2CdrgNUnit))))&&((this.sat1CommentScreeningDataSource == rhs.sat1CommentScreeningDataSource)||((this.sat1CommentScreeningDataSource!= null)&&this.sat1CommentScreeningDataSource.equals(rhs.sat1CommentScreeningDataSource))))&&((this.sat2CndotTUnit == rhs.sat2CndotTUnit)||((this.sat2CndotTUnit!= null)&&this.sat2CndotTUnit.equals(rhs.sat2CndotTUnit))))&&((this.sat2EarthTides == rhs.sat2EarthTides)||((this.sat2EarthTides!= null)&&this.sat2EarthTides.equals(rhs.sat2EarthTides))))&&((this.sat2CndotTdot == rhs.sat2CndotTdot)||((this.sat2CndotTdot!= null)&&this.sat2CndotTdot.equals(rhs.sat2CndotTdot))))&&((this.sat1TimeLastobStartFraction == rhs.sat1TimeLastobStartFraction)||((this.sat1TimeLastobStartFraction!= null)&&this.sat1TimeLastobStartFraction.equals(rhs.sat1TimeLastobStartFraction))))&&((this.sat1CrRUnit == rhs.sat1CrRUnit)||((this.sat1CrRUnit!= null)&&this.sat1CrRUnit.equals(rhs.sat1CrRUnit))))&&((this.relativeSpeed == rhs.relativeSpeed)||((this.relativeSpeed!= null)&&this.relativeSpeed.equals(rhs.relativeSpeed))))&&((this.sat1CndotRdot == rhs.sat1CndotRdot)||((this.sat1CndotRdot!= null)&&this.sat1CndotRdot.equals(rhs.sat1CndotRdot))))&&((this.sat2CdrgR == rhs.sat2CdrgR)||((this.sat2CdrgR!= null)&&this.sat2CdrgR.equals(rhs.sat2CdrgR))))&&((this.sat2CdrgT == rhs.sat2CdrgT)||((this.sat2CdrgT!= null)&&this.sat2CdrgT.equals(rhs.sat2CdrgT))))&&((this.sat2CsrpDrgUnit == rhs.sat2CsrpDrgUnit)||((this.sat2CsrpDrgUnit!= null)&&this.sat2CsrpDrgUnit.equals(rhs.sat2CsrpDrgUnit))))&&((this.sat1YDot == rhs.sat1YDot)||((this.sat1YDot!= null)&&this.sat1YDot.equals(rhs.sat1YDot))))&&((this.sat2CnTUnit == rhs.sat2CnTUnit)||((this.sat2CnTUnit!= null)&&this.sat2CnTUnit.equals(rhs.sat2CnTUnit))))&&((this.sat2ResidualsAccepted == rhs.sat2ResidualsAccepted)||((this.sat2ResidualsAccepted!= null)&&this.sat2ResidualsAccepted.equals(rhs.sat2ResidualsAccepted))))&&((this.sat2CdAreaOverMass == rhs.sat2CdAreaOverMass)||((this.sat2CdAreaOverMass!= null)&&this.sat2CdAreaOverMass.equals(rhs.sat2CdAreaOverMass))))&&((this.sat1CdrgRdotUnit == rhs.sat1CdrgRdotUnit)||((this.sat1CdrgRdotUnit!= null)&&this.sat1CdrgRdotUnit.equals(rhs.sat1CdrgRdotUnit))))&&((this.sat1CdrgTdotUnit == rhs.sat1CdrgTdotUnit)||((this.sat1CdrgTdotUnit!= null)&&this.sat1CdrgTdotUnit.equals(rhs.sat1CdrgTdotUnit))))&&((this.sat1SedrUnit == rhs.sat1SedrUnit)||((this.sat1SedrUnit!= null)&&this.sat1SedrUnit.equals(rhs.sat1SedrUnit))))&&((this.sat2CatalogName == rhs.sat2CatalogName)||((this.sat2CatalogName!= null)&&this.sat2CatalogName.equals(rhs.sat2CatalogName))))&&((this.sat1CtT == rhs.sat1CtT)||((this.sat1CtT!= null)&&this.sat1CtT.equals(rhs.sat1CtT))))&&((this.sat1CndotT == rhs.sat1CndotT)||((this.sat1CndotT!= null)&&this.sat1CndotT.equals(rhs.sat1CndotT))))&&((this.sat2CdrgN == rhs.sat2CdrgN)||((this.sat2CdrgN!= null)&&this.sat2CdrgN.equals(rhs.sat2CdrgN))))&&((this.sat1EarthTides == rhs.sat1EarthTides)||((this.sat1EarthTides!= null)&&this.sat1EarthTides.equals(rhs.sat1EarthTides))))&&((this.sat1CtR == rhs.sat1CtR)||((this.sat1CtR!= null)&&this.sat1CtR.equals(rhs.sat1CtR))))&&((this.sat1CsrpRdot == rhs.sat1CsrpRdot)||((this.sat1CsrpRdot!= null)&&this.sat1CsrpRdot.equals(rhs.sat1CsrpRdot))))&&((this.sat1CrAreaOverMassUnit == rhs.sat1CrAreaOverMassUnit)||((this.sat1CrAreaOverMassUnit!= null)&&this.sat1CrAreaOverMassUnit.equals(rhs.sat1CrAreaOverMassUnit))))&&((this.sat2ObjectDesignator == rhs.sat2ObjectDesignator)||((this.sat2ObjectDesignator!= null)&&this.sat2ObjectDesignator.equals(rhs.sat2ObjectDesignator))))&&((this.sat2CdrgTUnit == rhs.sat2CdrgTUnit)||((this.sat2CdrgTUnit!= null)&&this.sat2CdrgTUnit.equals(rhs.sat2CdrgTUnit))))&&((this.sat1InternationalDesignator == rhs.sat1InternationalDesignator)||((this.sat1InternationalDesignator!= null)&&this.sat1InternationalDesignator.equals(rhs.sat1InternationalDesignator))))&&((this.sat2CrAreaOverMass == rhs.sat2CrAreaOverMass)||((this.sat2CrAreaOverMass!= null)&&this.sat2CrAreaOverMass.equals(rhs.sat2CrAreaOverMass))))&&((this.messageId == rhs.messageId)||((this.messageId!= null)&&this.messageId.equals(rhs.messageId))))&&((this.relativeVelocityTUnit == rhs.relativeVelocityTUnit)||((this.relativeVelocityTUnit!= null)&&this.relativeVelocityTUnit.equals(rhs.relativeVelocityTUnit))))&&((this.creationDate == rhs.creationDate)||((this.creationDate!= null)&&this.creationDate.equals(rhs.creationDate))))&&((this.sat1CnRUnit == rhs.sat1CnRUnit)||((this.sat1CnRUnit!= null)&&this.sat1CnRUnit.equals(rhs.sat1CnRUnit))))&&((this.sat1CndotRUnit == rhs.sat1CndotRUnit)||((this.sat1CndotRUnit!= null)&&this.sat1CndotRUnit.equals(rhs.sat1CndotRUnit))))&&((this.sat1CdrgNdot == rhs.sat1CdrgNdot)||((this.sat1CdrgNdot!= null)&&this.sat1CdrgNdot.equals(rhs.sat1CdrgNdot))))&&((this.sat2CdrgNdotUnit == rhs.sat2CdrgNdotUnit)||((this.sat2CdrgNdotUnit!= null)&&this.sat2CdrgNdotUnit.equals(rhs.sat2CdrgNdotUnit))))&&((this.sat2Sedr == rhs.sat2Sedr)||((this.sat2Sedr!= null)&&this.sat2Sedr.equals(rhs.sat2Sedr))))&&((this.sat1CtdotTdotUnit == rhs.sat1CtdotTdotUnit)||((this.sat1CtdotTdotUnit!= null)&&this.sat1CtdotTdotUnit.equals(rhs.sat1CtdotTdotUnit))))&&((this.sat2CrdotNUnit == rhs.sat2CrdotNUnit)||((this.sat2CrdotNUnit!= null)&&this.sat2CrdotNUnit.equals(rhs.sat2CrdotNUnit))))&&((this.sat2CndotRdot == rhs.sat2CndotRdot)||((this.sat2CndotRdot!= null)&&this.sat2CndotRdot.equals(rhs.sat2CndotRdot))))&&((this.sat1CtdotRdotUnit == rhs.sat1CtdotRdotUnit)||((this.sat1CtdotRdotUnit!= null)&&this.sat1CtdotRdotUnit.equals(rhs.sat1CtdotRdotUnit))))&&((this.sat2CtdotRdot == rhs.sat2CtdotRdot)||((this.sat2CtdotRdot!= null)&&this.sat2CtdotRdot.equals(rhs.sat2CtdotRdot))))&&((this.sat2ThrustAccelerationUnit == rhs.sat2ThrustAccelerationUnit)||((this.sat2ThrustAccelerationUnit!= null)&&this.sat2ThrustAccelerationUnit.equals(rhs.sat2ThrustAccelerationUnit))))&&((this.sat2CtdotTUnit == rhs.sat2CtdotTUnit)||((this.sat2CtdotTUnit!= null)&&this.sat2CtdotTUnit.equals(rhs.sat2CtdotTUnit))))&&((this.gid == rhs.gid)||((this.gid!= null)&&this.gid.equals(rhs.gid))))&&((this.cdmId == rhs.cdmId)||((this.cdmId!= null)&&this.cdmId.equals(rhs.cdmId))))&&((this.relativeVelocityT == rhs.relativeVelocityT)||((this.relativeVelocityT!= null)&&this.relativeVelocityT.equals(rhs.relativeVelocityT))))&&((this.sat2XUnit == rhs.sat2XUnit)||((this.sat2XUnit!= null)&&this.sat2XUnit.equals(rhs.sat2XUnit))))&&((this.relativeVelocityR == rhs.relativeVelocityR)||((this.relativeVelocityR!= null)&&this.relativeVelocityR.equals(rhs.relativeVelocityR))))&&((this.collisionProbabilityMethod == rhs.collisionProbabilityMethod)||((this.collisionProbabilityMethod!= null)&&this.collisionProbabilityMethod.equals(rhs.collisionProbabilityMethod))))&&((this.sat1CndotRdotUnit == rhs.sat1CndotRdotUnit)||((this.sat1CndotRdotUnit!= null)&&this.sat1CndotRdotUnit.equals(rhs.sat1CndotRdotUnit))))&&((this.sat1CnNUnit == rhs.sat1CnNUnit)||((this.sat1CnNUnit!= null)&&this.sat1CnNUnit.equals(rhs.sat1CnNUnit))))&&((this.sat1CrdotT == rhs.sat1CrdotT)||((this.sat1CrdotT!= null)&&this.sat1CrdotT.equals(rhs.sat1CrdotT))))&&((this.relativeVelocityN == rhs.relativeVelocityN)||((this.relativeVelocityN!= null)&&this.relativeVelocityN.equals(rhs.relativeVelocityN))))&&((this.sat1CrdotR == rhs.sat1CrdotR)||((this.sat1CrdotR!= null)&&this.sat1CrdotR.equals(rhs.sat1CrdotR))))&&((this.sat1XUnit == rhs.sat1XUnit)||((this.sat1XUnit!= null)&&this.sat1XUnit.equals(rhs.sat1XUnit))))&&((this.tca == rhs.tca)||((this.tca!= null)&&this.tca.equals(rhs.tca))))&&((this.sat1CrR == rhs.sat1CrR)||((this.sat1CrR!= null)&&this.sat1CrR.equals(rhs.sat1CrR))))&&((this.sat2CsrpDrg == rhs.sat2CsrpDrg)||((this.sat2CsrpDrg!= null)&&this.sat2CsrpDrg.equals(rhs.sat2CsrpDrg))))&&((this.sat1ActualOdSpan == rhs.sat1ActualOdSpan)||((this.sat1ActualOdSpan!= null)&&this.sat1ActualOdSpan.equals(rhs.sat1ActualOdSpan))))&&((this.sat2CsrpSrpUnit == rhs.sat2CsrpSrpUnit)||((this.sat2CsrpSrpUnit!= null)&&this.sat2CsrpSrpUnit.equals(rhs.sat2CsrpSrpUnit))))&&((this.sat2ZDot == rhs.sat2ZDot)||((this.sat2ZDot!= null)&&this.sat2ZDot.equals(rhs.sat2ZDot))))&&((this.sat2ZDotUnit == rhs.sat2ZDotUnit)||((this.sat2ZDotUnit!= null)&&this.sat2ZDotUnit.equals(rhs.sat2ZDotUnit))))&&((this.sat1YDotUnit == rhs.sat1YDotUnit)||((this.sat1YDotUnit!= null)&&this.sat1YDotUnit.equals(rhs.sat1YDotUnit))))&&((this.sat1Maneuverable == rhs.sat1Maneuverable)||((this.sat1Maneuverable!= null)&&this.sat1Maneuverable.equals(rhs.sat1Maneuverable))))&&((this.sat1CrdotTUnit == rhs.sat1CrdotTUnit)||((this.sat1CrdotTUnit!= null)&&this.sat1CrdotTUnit.equals(rhs.sat1CrdotTUnit))))&&((this.sat2TimeLastobEnd == rhs.sat2TimeLastobEnd)||((this.sat2TimeLastobEnd!= null)&&this.sat2TimeLastobEnd.equals(rhs.sat2TimeLastobEnd))))&&((this.sat2CnT == rhs.sat2CnT)||((this.sat2CnT!= null)&&this.sat2CnT.equals(rhs.sat2CnT))))&&((this.sat2CrdotT == rhs.sat2CrdotT)||((this.sat2CrdotT!= null)&&this.sat2CrdotT.equals(rhs.sat2CrdotT))))&&((this.sat2CrdotR == rhs.sat2CrdotR)||((this.sat2CrdotR!= null)&&this.sat2CrdotR.equals(rhs.sat2CrdotR))))&&((this.sat1CdAreaOverMass == rhs.sat1CdAreaOverMass)||((this.sat1CdAreaOverMass!= null)&&this.sat1CdAreaOverMass.equals(rhs.sat1CdAreaOverMass))))&&((this.sat1CsrpN == rhs.sat1CsrpN)||((this.sat1CsrpN!= null)&&this.sat1CsrpN.equals(rhs.sat1CsrpN))))&&((this.sat2CtTUnit == rhs.sat2CtTUnit)||((this.sat2CtTUnit!= null)&&this.sat2CtTUnit.equals(rhs.sat2CtTUnit))))&&((this.relativePositionRUnit == rhs.relativePositionRUnit)||((this.relativePositionRUnit!= null)&&this.relativePositionRUnit.equals(rhs.relativePositionRUnit))))&&((this.sat2CnR == rhs.sat2CnR)||((this.sat2CnR!= null)&&this.sat2CnR.equals(rhs.sat2CnR))))&&((this.sat2CrdotN == rhs.sat2CrdotN)||((this.sat2CrdotN!= null)&&this.sat2CrdotN.equals(rhs.sat2CrdotN))))&&((this.sat2ResidualsAcceptedUnit == rhs.sat2ResidualsAcceptedUnit)||((this.sat2ResidualsAcceptedUnit!= null)&&this.sat2ResidualsAcceptedUnit.equals(rhs.sat2ResidualsAcceptedUnit))))&&((this.sat1CommentDcpDensityForecastUncertainty == rhs.sat1CommentDcpDensityForecastUncertainty)||((this.sat1CommentDcpDensityForecastUncertainty!= null)&&this.sat1CommentDcpDensityForecastUncertainty.equals(rhs.sat1CommentDcpDensityForecastUncertainty))))&&((this.sat1CdrgTdot == rhs.sat1CdrgTdot)||((this.sat1CdrgTdot!= null)&&this.sat1CdrgTdot.equals(rhs.sat1CdrgTdot))))&&((this.sat2CnN == rhs.sat2CnN)||((this.sat2CnN!= null)&&this.sat2CnN.equals(rhs.sat2CnN))))&&((this.sat2CsrpTUnit == rhs.sat2CsrpTUnit)||((this.sat2CsrpTUnit!= null)&&this.sat2CsrpTUnit.equals(rhs.sat2CsrpTUnit))))&&((this.sat1CsrpT == rhs.sat1CsrpT)||((this.sat1CsrpT!= null)&&this.sat1CsrpT.equals(rhs.sat1CsrpT))))&&((this.sat1CsrpR == rhs.sat1CsrpR)||((this.sat1CsrpR!= null)&&this.sat1CsrpR.equals(rhs.sat1CsrpR))));
    }

}
