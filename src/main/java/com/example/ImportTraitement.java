
package com.example;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import org.springframework.data.annotation.Id;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "values")
public class ImportTraitement {
    @Id
    private Integer IDN;
    @JsonProperty("sys_Title")
    private String sysTitle;
    @JsonProperty("GDPR_TREATMENT_DATE_IMPLEMENTATION")
    private Date gdprTreatmentDate;
    @JsonProperty("RGPD_ORGANIZATION")
    private MoovappsResponse rgpdOrganization;
    @JsonProperty("OrganisationAssociee")
    private MoovappsResponse rgpdOrganizationAssociee;
    @JsonProperty("GDPR_ORGA_LABEL")
    private String gdprOrgaLabel;
    @JsonProperty("lst_entite")
    private String gdprLstEntite;
    @JsonProperty("GDPR_FORM_DISPLAY")
    private String gdpFormDisplay="avance";
    @JsonProperty("GDPR_DATA_BUSINESS_PROCESS")
    private List<MoovappsResponse> gdprDataBusinessProcess;
    @JsonProperty("GDPR_DATA_PROTECTION_OFFICER")
    private MoovappsResponse gdprDataProtectionOfficer;
    @JsonProperty("GDPR_TREATMENT_RESPONSIBLE")
    private MoovappsResponse gdprTreatmentResponsible;
    @JsonProperty("GDPR_TREATMENT_RESPONSIBLE_MANAGER")
    private MoovappsResponse gdprTreatmentResponsibleManager;
    @JsonProperty("ROLE_REQUESTER")
    private List<MoovappsResponse> requesterRole = new ArrayList<>();
    @JsonProperty("GDPR_DATA_CO_CONTROLLER")
    private List<MoovappsResponse> gdprDataCoController;
    @JsonProperty("GDPR_DATA_POPULATIONS")
    private List<MoovappsResponse> gdprDataPopulations = null;
    @JsonProperty("GDPR_OTHER_TARGET_POPULATION")
    private String gdprOtherTargetPopulations = null;
    @JsonProperty("GDPR_PURPOSE_TREATMENT")
    private String gdprPurposeTreatment;
    @JsonProperty("GDPR_UNDER_PURPOSE_TREATMENT")
    private String gdprUnderPurposeTreatment;
    @JsonProperty("GDPR_TREATMENT_CRITERIA")
    private List<String> gdprTreamentCriteria;
    @JsonProperty("GDPR_DATA_INTERNAL_SERVICES")
    private List<MoovappsResponse> gdprDataInternalServices;
    @JsonProperty("GDPR_DATA_SUBCONTRACTORS")
    private List<MoovappsResponse> gdprSubcontractors;
    @JsonProperty("GDPR_SUBCONTRACTORS")
    private String gdprSubcontractor;
    @JsonProperty("GDPR_DATA_INTERNAL_RECIPIENTS")
    private List<MoovappsResponse> gdprDataInternalRecipients;
    @JsonProperty("GDPR_DATA_EXTERNAL_RECIPIENTS")
    private List<MoovappsResponse> gdprDataExternalRecipients;
    @JsonProperty("GDPR_TREATMENT_SUPPORT")
    private List<String> gdprTreatmentSupport;
    @JsonProperty("GDPR_PAPER_DESC")
    private String gdprPaperDesc;
    @JsonProperty("GDPR_AUTOMATISED_TREATMENT_PRECISION")
    private String gdprAutomatisedTreatmentPrecision;
    @JsonProperty("GDPR_SOFTWARE_USE")
    private String gdprSoftwareUse;
    @JsonProperty("GDPR_DATA_TECHNICAL_SOLUTIONS")
    private List<MoovappsResponse> gdprDataTechnicalSolution;
    @JsonProperty("GDPR_IMPLEMENTATION_CONTEXT")
    private List<String> gdprImplementationContext = null;
    @JsonProperty("GDPR_HOW_SECURE_DATA")
    private List<String> gdprHowSecureData = null;
    @JsonProperty("GDPR_OTHER_HOW_SECURE_DATA")
    private String gdprOtherHowSecureData = null;
    @JsonProperty("GDPR_CONCERNED_DATA")
    private List<MoovappsResponse> gdprConcernedData = null;
    @JsonProperty("GDPR_EXISTING_TREATMENT")
    private String gdprExistingTreatment;
    @JsonProperty("GDPR_SEND_DATE")
    private String gdprSendDate;
    @JsonProperty("GDPR_ORGANIZATIONAL_MANAGER")
    private MoovappsResponse gdprOrganizationalManager;
    @JsonProperty("GDPR_TRANSFERT_OUTSIDE_EU")
    private String gdprTransfertOutsideEu;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public ImportTraitement() {
    }

    /**
     *
     * @param sysTitle
     * @param gdprTreatmentDate
     * @param rgpdOrganization
     * @param gdprDataProtectionOfficer
     * @param gdprTreatmentResponsible
     * @param gdprTreatmentResponsibleManager
     * @param gdprDataCoController
     * @param gdprDataPopulations
     * @param gdprPurposeTreatment
     * @param gdprUnderPurposeTreatment
     * @param gdprTreamentCriteria
     * @param gdprDataInternalServices
     * @param gdprSubcontractors
     * @param gdprDataInternalRecipients
     * @param gdprDataExternalRecipients
     * @param gdprTreatmentSupport
     * @param gdprPaperDesc
     * @param gdprAutomatisedTreatmentPrecision
     * @param gdprSoftwareUse
     * @param gdprDataTechnicalSolution
     * @param gdprImplementationContext
     * @param gdprConcernedData
     */
    public ImportTraitement( Integer IDN,
            String sysTitle,
                            Date gdprTreatmentDate,
                            MoovappsResponse rgpdOrganization,
                            List<MoovappsResponse> gdprDataBusinessProcess,
                            MoovappsResponse gdprDataProtectionOfficer,
                            MoovappsResponse gdprTreatmentResponsible,
                            MoovappsResponse gdprTreatmentResponsibleManager,
                            List<MoovappsResponse> gdprDataCoController,
                            List<MoovappsResponse> gdprDataPopulations,
                            String gdprOtherTargetPopulations,
                            String gdprPurposeTreatment,
                            String gdprUnderPurposeTreatment,
                            List<String> gdprTreamentCriteria,
                            List<String> gdprHowSecureData,
                            String gdprOtherHowSecureData,
                            List<MoovappsResponse> gdprDataInternalServices,
                            List<MoovappsResponse> gdprSubcontractors,
                            String gdprSubcontractor,
                            List<MoovappsResponse> gdprDataInternalRecipients,
                            List<MoovappsResponse> gdprDataExternalRecipients,
                            List<String> gdprTreatmentSupport,
                            String gdprPaperDesc,
                            String gdprAutomatisedTreatmentPrecision,
                            String gdprSoftwareUse,
                            List<MoovappsResponse> gdprDataTechnicalSolution,
                            List<String> gdprImplementationContext,
                            List<MoovappsResponse> gdprConcernedData) {
        this.IDN = IDN;
        this.sysTitle = sysTitle;
        this.gdprTreatmentDate = gdprTreatmentDate;
        this.rgpdOrganization = rgpdOrganization;
        this.rgpdOrganizationAssociee = rgpdOrganization;
        this.gdprDataBusinessProcess = gdprDataBusinessProcess;
        this.gdprDataProtectionOfficer = gdprDataProtectionOfficer;
        this.gdprTreatmentResponsible = gdprTreatmentResponsible;
        this.gdprTreatmentResponsibleManager = gdprTreatmentResponsibleManager;
        this.gdprDataCoController = gdprDataCoController;
        this.gdprDataPopulations = gdprDataPopulations;
        this.gdprOtherTargetPopulations = gdprOtherTargetPopulations;
        this.gdprPurposeTreatment = gdprPurposeTreatment;
        this.gdprUnderPurposeTreatment = gdprUnderPurposeTreatment;
        this.gdprTreamentCriteria = gdprTreamentCriteria;
        this.gdprHowSecureData = gdprHowSecureData;
        this.gdprOtherHowSecureData = gdprOtherHowSecureData;
        this.gdprDataInternalServices = gdprDataInternalServices;
        this.gdprSubcontractors = gdprSubcontractors;
        this.gdprSubcontractor = gdprSubcontractor;
        this.gdprDataInternalRecipients = gdprDataInternalRecipients;
        this.gdprDataExternalRecipients = gdprDataExternalRecipients;
        this.gdprTreatmentSupport = gdprTreatmentSupport;
        this.gdprPaperDesc = gdprPaperDesc;
        this.gdprAutomatisedTreatmentPrecision = gdprAutomatisedTreatmentPrecision;
        this.gdprSoftwareUse = gdprSoftwareUse;
        this.gdprDataTechnicalSolution = gdprDataTechnicalSolution;
        this.gdprImplementationContext = gdprImplementationContext;
        this.gdprConcernedData = gdprConcernedData;
        // Ajout des acteurs dans ROLE_REQUESTER
        this.requesterRole.add(gdprTreatmentResponsible);
        this.requesterRole.add(gdprTreatmentResponsibleManager);
        this.requesterRole.add(gdprDataProtectionOfficer);
    }

    public Integer getIDN() {
        return IDN;
    }

    public void setIDN(Integer IDN) {
        this.IDN = IDN;
    }

    @JsonProperty("GDPR_ORGA_LABEL")
    public String getGdprOrgaLabel() {
        return gdprOrgaLabel;
    }

    @JsonProperty("GDPR_ORGA_LABEL")
    public void setGdprOrgaLabel(String gdprOrgaLabel) {
        this.gdprOrgaLabel = gdprOrgaLabel;
    }

    @JsonProperty("lst_entite")
    public String getGdprLstEntite() {
        return gdprLstEntite;
    }

    @JsonProperty("lst_entite")
    public void setGdprLstEntite(String gdprLstEntite) {
        this.gdprLstEntite = gdprLstEntite;
    }

    @JsonProperty("GDPR_FORM_DISPLAY")
    public String getGdpFormDisplay() {
        return gdpFormDisplay;
    }

    @JsonProperty("GDPR_FORM_DISPLAY")
    public void setGdpFormDisplay(String gdpFormDisplay) {
        this.gdpFormDisplay = gdpFormDisplay;
    }

    @JsonProperty("OrganisationAssociee")
    public MoovappsResponse getRgpdOrganizationAssociee() {
        return rgpdOrganizationAssociee;
    }

    @JsonProperty("OrganisationAssociee")
    public void setRgpdOrganizationAssociee(MoovappsResponse rgpdOrganizationAssociee) {
        this.rgpdOrganizationAssociee = rgpdOrganizationAssociee;
    }

    @JsonProperty("GDPR_HOW_SECURE_DATA")
    public List<String> getGdprHowSecureData() {
        return gdprHowSecureData;
    }

    @JsonProperty("GDPR_HOW_SECURE_DATA")
    public void setGdprHowSecureData(List<String> gdprHowSecureData) {
        this.gdprHowSecureData = gdprHowSecureData;
    }

    @JsonProperty("GDPR_TREATMENT_RESPONSIBLE")
    public MoovappsResponse getGdprTreatmentResponsible() {
        return gdprTreatmentResponsible;
    }

    @JsonProperty("GDPR_TREATMENT_RESPONSIBLE")
    public void setGdprTreatmentResponsible(MoovappsResponse gdprTreatmentResponsible) {
        this.gdprTreatmentResponsible = gdprTreatmentResponsible;
    }

    @JsonProperty("GDPR_DATA_PROTECTION_OFFICER")
    public MoovappsResponse getGdprDataProtectionOfficer() {
        return gdprDataProtectionOfficer;
    }

    @JsonProperty("GDPR_DATA_PROTECTION_OFFICER")
    public void setGdprDataProtectionOfficer(MoovappsResponse gdprDataProtectionOfficer) {
        this.gdprDataProtectionOfficer = gdprDataProtectionOfficer;
    }

    @JsonProperty("GDPR_UNDER_PURPOSE_TREATMENT")
    public String getGdprUnderPurposeTreatment() {
        return gdprUnderPurposeTreatment;
    }

    @JsonProperty("GDPR_UNDER_PURPOSE_TREATMENT")
    public void setGdprUnderPurposeTreatment(String gdprUnderPurposeTreatment) {
        this.gdprUnderPurposeTreatment = gdprUnderPurposeTreatment;
    }

    @JsonProperty("RGPD_ORGANIZATION")
    public MoovappsResponse getRgpdOrganization() {
        return rgpdOrganization;
    }

    @JsonProperty("RGPD_ORGANIZATION")
    public void setRgpdOrganization(MoovappsResponse rgpdOrganization) {
        this.rgpdOrganization = rgpdOrganization;
    }

    @JsonProperty("GDPR_TREATMENT_RESPONSIBLE_MANAGER")
    public MoovappsResponse getGdprTreatmentResponsibleManager() {
        return gdprTreatmentResponsibleManager;
    }

    @JsonProperty("GDPR_TREATMENT_RESPONSIBLE_MANAGER")
    public void setGdprTreatmentResponsibleManager(MoovappsResponse gdprTreatmentResponsibleManager) {
        this.gdprTreatmentResponsibleManager = gdprTreatmentResponsibleManager;
    }

    @JsonProperty("GDPR_IMPLEMENTATION_CONTEXT")
    public List<String> getGdprImplementationContext() {
        return gdprImplementationContext;
    }

    @JsonProperty("GDPR_IMPLEMENTATION_CONTEXT")
    public void setGdprImplementationContext(List<String> gdprImplementationContext) {
        this.gdprImplementationContext = gdprImplementationContext;
    }

    @JsonProperty("GDPR_CONCERNED_DATA")
    public List<MoovappsResponse> getGdprConcernedData() {
        return gdprConcernedData;
    }

    @JsonProperty("GDPR_CONCERNED_DATA")
    public void setGdprConcernedData(List<MoovappsResponse> gdprConcernedData) {
        this.gdprConcernedData = gdprConcernedData;
    }

    @JsonProperty("GDPR_EXISTING_TREATMENT")
    public String getGdprExistingTreatment() {
        return gdprExistingTreatment;
    }

    @JsonProperty("GDPR_EXISTING_TREATMENT")
    public void setGdprExistingTreatment(String gdprExistingTreatment) {
        this.gdprExistingTreatment = gdprExistingTreatment;
    }

    @JsonProperty("GDPR_SEND_DATE")
    public String getGdprSendDate() {
        return gdprSendDate;
    }

    @JsonProperty("GDPR_SEND_DATE")
    public void setGdprSendDate(String gdprSendDate) {
        this.gdprSendDate = gdprSendDate;
    }

    @JsonProperty("GDPR_ORGANIZATIONAL_MANAGER")
    public MoovappsResponse getGdprOrganizationalManager() {
        return gdprOrganizationalManager;
    }

    @JsonProperty("GDPR_ORGANIZATIONAL_MANAGER")
    public void setGdprOrganizationalManager(MoovappsResponse gdprOrganizationalManager) {
        this.gdprOrganizationalManager = gdprOrganizationalManager;
    }

    @JsonProperty("sys_Title")
    public String getSysTitle() {
        return sysTitle;
    }

    @JsonProperty("sys_Title")
    public void setSysTitle(String sysTitle) {
        this.sysTitle = sysTitle;
    }


    @JsonProperty("GDPR_DATA_SUBCONTRACTORS")
    public List<MoovappsResponse> getGdprSubcontractors() {
        return gdprSubcontractors;
    }

    @JsonProperty("GDPR_DATA_SUBCONTRACTORS")
    public void setGdprSubcontractors(List<MoovappsResponse> gdprSubcontractors) {
        this.gdprSubcontractors = gdprSubcontractors;
    }

    @JsonProperty("GDPR_SUBCONTRACTORS")
    public String getGdprSubcontractor() {
        return gdprSubcontractor;
    }

    @JsonProperty("GDPR_SUBCONTRACTORS")
    public void setGdprSubcontractors(String gdprSubcontractor) {
        this.gdprSubcontractor = gdprSubcontractor;
    }

    @JsonProperty("GDPR_PURPOSE_TREATMENT")
    public String getGdprPurposeTreatment() {
        return gdprPurposeTreatment;
    }

    @JsonProperty("GDPR_PURPOSE_TREATMENT")
    public void setGdprPurposeTreatment(String gdprPurposeTreatment) {
        this.gdprPurposeTreatment = gdprPurposeTreatment;
    }

    @JsonProperty("GDPR_TRANSFERT_OUTSIDE_EU")
    public String getGdprTransfertOutsideEu() {
        return gdprTransfertOutsideEu;
    }

    @JsonProperty("GDPR_TRANSFERT_OUTSIDE_EU")
    public void setGdprTransfertOutsideEu(String gdprTransfertOutsideEu) {
        this.gdprTransfertOutsideEu = gdprTransfertOutsideEu;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImportTraitement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gdprTreatmentResponsible");
        sb.append('=');
        sb.append(((this.gdprTreatmentResponsible == null)?"<null>":this.gdprTreatmentResponsible));
        sb.append(',');
        sb.append("gdprDataProtectionOfficer");
        sb.append('=');
        sb.append(((this.gdprDataProtectionOfficer == null)?"<null>":this.gdprDataProtectionOfficer));
        sb.append(',');
        sb.append("gdprUnderPurposeTreatment");
        sb.append('=');
        sb.append(((this.gdprUnderPurposeTreatment == null)?"<null>":this.gdprUnderPurposeTreatment));
        sb.append(',');
        sb.append("rgpdOrganization");
        sb.append('=');
        sb.append(((this.rgpdOrganization == null)?"<null>":this.rgpdOrganization));
        sb.append(',');
        sb.append("gdprTreatmentResponsibleManager");
        sb.append('=');
        sb.append(((this.gdprTreatmentResponsibleManager == null)?"<null>":this.gdprTreatmentResponsibleManager));
        sb.append(',');
        sb.append("gdprImplementationContext");
        sb.append('=');
        sb.append(((this.gdprImplementationContext == null)?"<null>":this.gdprImplementationContext));
        sb.append(',');
        sb.append("gdprConcernedData");
        sb.append('=');
        sb.append(((this.gdprConcernedData == null)?"<null>":this.gdprConcernedData));
        sb.append(',');
        sb.append("gdprExistingTreatment");
        sb.append('=');
        sb.append(((this.gdprExistingTreatment == null)?"<null>":this.gdprExistingTreatment));
        sb.append(',');
        sb.append("gdprSendDate");
        sb.append('=');
        sb.append(((this.gdprSendDate == null)?"<null>":this.gdprSendDate));
        sb.append(',');
        sb.append("gdprOrganizationalManager");
        sb.append('=');
        sb.append(((this.gdprOrganizationalManager == null)?"<null>":this.gdprOrganizationalManager));
        sb.append(',');
        sb.append("sysTitle");
        sb.append('=');
        sb.append(((this.sysTitle == null)?"<null>":this.sysTitle));
        sb.append(',');
        sb.append("gdprSubcontractors");
        sb.append('=');
        sb.append(((this.gdprSubcontractors == null)?"<null>":this.gdprSubcontractors));
        sb.append(',');
        sb.append("gdprPurposeTreatment");
        sb.append('=');
        sb.append(((this.gdprPurposeTreatment == null)?"<null>":this.gdprPurposeTreatment));
        sb.append(',');
        sb.append("gdprTransfertOutsideEu");
        sb.append('=');
        sb.append(((this.gdprTransfertOutsideEu == null)?"<null>":this.gdprTransfertOutsideEu));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.gdprSendDate == null)? 0 :this.gdprSendDate.hashCode()));
        result = ((result* 31)+((this.gdprTreatmentResponsibleManager == null)? 0 :this.gdprTreatmentResponsibleManager.hashCode()));
        result = ((result* 31)+((this.gdprExistingTreatment == null)? 0 :this.gdprExistingTreatment.hashCode()));
        result = ((result* 31)+((this.sysTitle == null)? 0 :this.sysTitle.hashCode()));
        result = ((result* 31)+((this.gdprImplementationContext == null)? 0 :this.gdprImplementationContext.hashCode()));
        result = ((result* 31)+((this.gdprSubcontractors == null)? 0 :this.gdprSubcontractors.hashCode()));
        result = ((result* 31)+((this.gdprUnderPurposeTreatment == null)? 0 :this.gdprUnderPurposeTreatment.hashCode()));
        result = ((result* 31)+((this.gdprTransfertOutsideEu == null)? 0 :this.gdprTransfertOutsideEu.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rgpdOrganization == null)? 0 :this.rgpdOrganization.hashCode()));
        result = ((result* 31)+((this.gdprPurposeTreatment == null)? 0 :this.gdprPurposeTreatment.hashCode()));
        result = ((result* 31)+((this.gdprDataProtectionOfficer == null)? 0 :this.gdprDataProtectionOfficer.hashCode()));
        result = ((result* 31)+((this.gdprOrganizationalManager == null)? 0 :this.gdprOrganizationalManager.hashCode()));
        result = ((result* 31)+((this.gdprConcernedData == null)? 0 :this.gdprConcernedData.hashCode()));
        result = ((result* 31)+((this.gdprTreatmentResponsible == null)? 0 :this.gdprTreatmentResponsible.hashCode()));
        return result;
    }

    public String toJSON(){
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.registerModule(new JodaModule());
        objectMapper.setTimeZone(TimeZone.getDefault());
        //objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        //objectMapper.disable(SerializationFeature.WRITE_DATES_WITH_CONTEXT_TIME_ZONE);
        //objectMapper.disable(SerializationFeature.WRITE_DATES_WITH_ZONE_ID);
        objectMapper.setDateFormat(new StdDateFormat().withColonInTimeZone(false));
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    public String toJSONPretty(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setTimeZone(TimeZone.getDefault());
        //objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        //objectMapper.disable(SerializationFeature.WRITE_DATES_WITH_CONTEXT_TIME_ZONE);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.setDateFormat(new StdDateFormat().withColonInTimeZone(false));
        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
