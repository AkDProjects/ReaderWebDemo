package com.example.readerwebdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.poiji.annotation.ExcelCellName;

import java.text.SimpleDateFormat;
import java.util.Date;

@JacksonXmlRootElement(
        localName = "Submit_Referral"
)
public class PatientInfo {
    @ExcelCellName("Referring MTF")
    private String mtf_name;
    @ExcelCellName("DMIS")
    private String dmis_id_Code;
    private String referral_date = "08 JUL 2016@09:40";
    @ExcelCellName("Clinic Specialty")
    private String clinic_Specialty;
    private String ancillary_procedure_name;
    private String referring_hcp = "JOHNSON,ELIZABETH A.";
    private String requesting_clinic = "AMHF01DRESPCT";
    @ExcelCellName("Order Number")
    private String order_id_Number;
    private String mcp_referral_number = "20130081806";
    @ExcelCellName("Number of visits")
    private String number_Visits;
    private String authorized_until = "05 DEC 2021";
    @ExcelCellName("Priority")
    private String priority;
    @ExcelCellName("Chief Complaint (reason)")
    private String reason_for_Consult;
    private String hcdp = "ENROLLED ACTIVE DUTY";
    private String provider_specialty;
    @ExcelCellName("Provisional Diagnosis")
    private String provisional_Prognosis;
    private String additional_comments = "";
    private String reviews;
    private String review;
    private String reviewed_date;
    private String reviewer;
    private String appointment_status;
    private String appointment_review_comment;
    private String provider_referral_to;
    @ExcelCellName("Sponsor SSN")
    private String patient_fmp_Ssn;
    @JsonIgnore
    @ExcelCellName("Patient Last Name")
    private String patient_Lname;
    @ExcelCellName("Patient First Name")
    @JsonIgnore
    private String patient_Fname;
    @JsonIgnore
    @ExcelCellName("DOB")
    private Date patient_Dob1;
    private String patient_Dob;
    @ExcelCellName("Gender")
    private String patient_Gender;
    @ExcelCellName("DEERS ID")
    private String edipn;
    private String sponsor;
    private String patient_unit = "WOU9 HHC 1-210 AVN";
    @ExcelCellName("Patient Address")
    private String patient_Street;
    @ExcelCellName("City")
    private String patient_City;
    @ExcelCellName("State")
    private String patient_State;
    @ExcelCellName("Zip")
    private String patient_zipcode;
    @ExcelCellName("Beneficiary Type")
    private String patient_Category;
    private String patient_home;
    private String patient_work;
    private String patient_rank = "AW5";
    private String patient_file_room;
    private String sender_name;
    private String fax_group;
    private String alternative_fax_number;
    private String appointment_date = "08 JUL 2016@09:40 ";
    private String enrolled_to;
    @ExcelCellName("Evaluation Only or Evaluate and Treat")
    private String evaluation_Type;
    private String provider_author_name = "JOHNSON,ELIZABETH A.";
    private String provider_npi;
    @ExcelCellName("NPI")
    private String referring_mtf_Npi;
    private String other_comments;
    private String patient_name;
    private String signature_block = "This is an approved electronically signed document by JOHNSON,ELIZABETH A.";
    private int referral_id;

    public PatientInfo() {
    }

    public Date getPatient_Dob1() {
        return this.patient_Dob1;
    }

    public void setPatient_Dob1(Date patient_Dob1) {
        this.patient_Dob1 = patient_Dob1;
    }

    public String getSignature_block() {
        return this.signature_block;
    }

    public void setSignature_block(String signature_block) {
        this.signature_block = signature_block;
    }

    public int getReferral_id() {
        return this.referral_id;
    }

    public void setReferral_id(int referral_id) {
        this.referral_id = referral_id;
    }

    public String getPatient_name() {
        return this.patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getReferral_date() {
        return this.referral_date;
    }

    public void setReferral_date(String referral_date) {
        this.referral_date = referral_date;
    }

    public String getAncillary_procedure_name() {
        return this.ancillary_procedure_name;
    }

    public void setAncillary_procedure_name(String ancillary_procedure_name) {
        this.ancillary_procedure_name = ancillary_procedure_name;
    }

    public String getReferring_hcp() {
        return this.referring_hcp;
    }

    public void setReferring_hcp(String referring_hcp) {
        this.referring_hcp = referring_hcp;
    }

    public String getRequesting_clinic() {
        return this.requesting_clinic;
    }

    public void setRequesting_clinic(String requesting_clinic) {
        this.requesting_clinic = requesting_clinic;
    }

    public String getAuthorized_until() {
        return this.authorized_until;
    }

    public void setAuthorized_until(String authorized_until) {
        this.authorized_until = authorized_until;
    }

    public String getHcdp() {
        return this.hcdp;
    }

    public void setHcdp(String hcdp) {
        this.hcdp = hcdp;
    }

    public String getProvider_specialty() {
        return this.provider_specialty;
    }

    public void setProvider_specialty(String provider_specialty) {
        this.provider_specialty = provider_specialty;
    }

    public String getAdditional_comments() {
        return this.additional_comments;
    }

    public void setAdditional_comments(String additional_comments) {
        this.additional_comments = additional_comments;
    }

    public String getReviews() {
        return this.reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getReviewed_date() {
        return this.reviewed_date;
    }

    public void setReviewed_date(String reviewed_date) {
        this.reviewed_date = reviewed_date;
    }

    public String getReviewer() {
        return this.reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getAppointment_status() {
        return this.appointment_status;
    }

    public void setAppointment_status(String appointment_status) {
        this.appointment_status = appointment_status;
    }

    public String getAppointment_review_comment() {
        return this.appointment_review_comment;
    }

    public void setAppointment_review_comment(String appointment_review_comment) {
        this.appointment_review_comment = appointment_review_comment;
    }

    public String getProvider_referral_to() {
        return this.provider_referral_to;
    }

    public void setProvider_referral_to(String provider_referral_to) {
        this.provider_referral_to = provider_referral_to;
    }

    public String getSponsor() {
        return this.sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getPatient_unit() {
        return this.patient_unit;
    }

    public void setPatient_unit(String patient_unit) {
        this.patient_unit = patient_unit;
    }

    public String getPatient_home() {
        return this.patient_home;
    }

    public void setPatient_home(String patient_home) {
        this.patient_home = patient_home;
    }

    public String getPatient_work() {
        return this.patient_work;
    }

    public void setPatient_work(String patient_work) {
        this.patient_work = patient_work;
    }

    public String getPatient_rank() {
        return this.patient_rank;
    }

    public void setPatient_rank(String patient_rank) {
        this.patient_rank = patient_rank;
    }

    public String getPatient_file_room() {
        return this.patient_file_room;
    }

    public void setPatient_file_room(String patient_file_room) {
        this.patient_file_room = patient_file_room;
    }

    public String getSender_name() {
        return this.sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    public String getFax_group() {
        return this.fax_group;
    }

    public void setFax_group(String fax_group) {
        this.fax_group = fax_group;
    }

    public String getAlternative_fax_number() {
        return this.alternative_fax_number;
    }

    public void setAlternative_fax_number(String alternative_fax_number) {
        this.alternative_fax_number = alternative_fax_number;
    }

    public String getAppointment_date() {
        return this.appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getEnrolled_to() {
        return this.enrolled_to;
    }

    public void setEnrolled_to(String enrolled_to) {
        this.enrolled_to = enrolled_to;
    }

    public String getProvider_author_name() {
        return this.provider_author_name;
    }

    public void setProvider_author_name(String provider_author_name) {
        this.provider_author_name = provider_author_name;
    }

    public String getProvider_npi() {
        return this.provider_npi;
    }

    public void setProvider_npi(String provider_npi) {
        this.provider_npi = provider_npi;
    }

    public String getOther_comments() {
        return this.other_comments;
    }

    public void setOther_comments(String other_comments) {
        this.other_comments = other_comments;
    }

    public String getPatient_Category() {
        return this.patient_Category;
    }

    public void setPatient_Category(String patient_Category) {
        this.patient_Category = patient_Category;
    }

    public String getMtf_name() {
        return this.mtf_name;
    }

    public void setMtf_name(String mtf_name) {
        this.mtf_name = mtf_name;
    }

    public String getDmis_id_Code() {
        return this.dmis_id_Code;
    }

    public void setDmis_id_Code(String dmis_id_Code) {
        this.dmis_id_Code = dmis_id_Code;
    }

    public String getReferring_mtf_Npi() {
        return this.referring_mtf_Npi;
    }

    public void setReferring_mtf_Npi(String referring_mtf_Npi) {
        this.referring_mtf_Npi = referring_mtf_Npi;
    }

    public String getOrder_id_Number() {
        return this.order_id_Number;
    }

    public void setOrder_id_Number(String order_id_Number) {
        this.order_id_Number = order_id_Number;
    }

    public String getReason_for_Consult() {
        return this.reason_for_Consult;
    }

    public void setReason_for_Consult(String reason_for_Consult) {
        this.reason_for_Consult = reason_for_Consult;
    }

    public String getProvisional_Prognosis() {
        return this.provisional_Prognosis;
    }

    public void setProvisional_Prognosis(String provisional_Prognosis) {
        this.provisional_Prognosis = provisional_Prognosis;
    }

    public String getEvaluation_Type() {
        return this.evaluation_Type;
    }

    public void setEvaluation_Type(String evaluation_Type) {
        this.evaluation_Type = evaluation_Type;
    }

    public String getClinic_Specialty() {
        return this.clinic_Specialty;
    }

    public void setClinic_Specialty(String clinic_Specialty) {
        this.clinic_Specialty = clinic_Specialty;
    }

    public String getNumber_Visits() {
        return this.number_Visits;
    }

    public void setNumber_Visits(String number_Visits) {
        this.number_Visits = number_Visits;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getEdipn() {
        return this.edipn;
    }

    public void setEdipn(String edipn) {
        this.edipn = edipn;
    }

    public String getPatient_fmp_Ssn() {
        return this.patient_fmp_Ssn;
    }

    public void setPatient_fmp_Ssn(String patient_fmp_Ssn) {
        this.patient_fmp_Ssn = patient_fmp_Ssn;
    }

    public String getPatient_Lname() {
        return this.patient_Lname;
    }

    public void setPatient_Lname(String patient_Lname) {
        this.patient_Lname = patient_Lname;
    }

    public String getPatient_Fname() {
        return this.patient_Fname;
    }

    public void setPatient_Fname(String patient_Fname) {
        this.patient_Fname = patient_Fname;
    }

    public String getPatient_Dob() {
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yy");
        return format1.format(this.patient_Dob1).toUpperCase();
    }

    public void setPatient_Dob(String patient_Dob) {
        this.patient_Dob = patient_Dob;
    }

    public String getPatient_Gender() {
        return this.patient_Gender;
    }

    public void setPatient_Gender(String patient_Gender) {
        this.patient_Gender = patient_Gender;
    }

    public String getPatient_Street() {
        return this.patient_Street;
    }

    public void setPatient_Street(String patient_Street) {
        this.patient_Street = patient_Street;
    }

    public String getPatient_City() {
        return this.patient_City;
    }

    public void setPatient_City(String patient_City) {
        this.patient_City = patient_City;
    }

    public String getPatient_State() {
        return this.patient_State;
    }

    public void setPatient_State(String patient_State) {
        this.patient_State = patient_State;
    }

    public String getPatient_zipcode() {
        return this.patient_zipcode;
    }

    public void setPatient_zipcode(String patient_zipcode) {
        this.patient_zipcode = patient_zipcode;
    }

    public String getMcp_referral_number() {
        return this.mcp_referral_number;
    }

    public void setMcp_referral_number(String mcp_referral_number) {
        this.mcp_referral_number = mcp_referral_number;
    }

}
