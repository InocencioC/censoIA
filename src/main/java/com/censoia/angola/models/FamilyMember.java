package com.censoia.angola.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "familymembers")
public class FamilyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "family_id", nullable = false)
    private Long familyId;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "relationship_to_head", nullable = false)
    private String relationshipToHead;

    @Column(name = "marital_status", nullable = false)
    private String maritalStatus;

    @Column(name = "education_level", nullable = false)
    private String educationLevel;

    @Column(name = "profession", nullable = false)
    private String profession;

    @Column(name = "monthly_income", nullable = false)
    private double monthlyIncome;

    @Column(name = "employment_status", nullable = false)
    private String employmentStatus;

    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Column(name = "residence_country", nullable = false)
    private String residenceCountry;

    @Column(name = "disability")
    private String disability;

    public FamilyMember() {}

    public FamilyMember(Long memberId, Long familyId, String fullName, LocalDate birthDate, String gender, String relationshipToHead, String maritalStatus, String educationLevel, String profession, double monthlyIncome, String employmentStatus, String nationality, String residenceCountry, String disability) {
        this.memberId = memberId;
        this.familyId = familyId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.relationshipToHead = relationshipToHead;
        this.maritalStatus = maritalStatus;
        this.educationLevel = educationLevel;
        this.profession = profession;
        this.monthlyIncome = monthlyIncome;
        this.employmentStatus = employmentStatus;
        this.nationality = nationality;
        this.residenceCountry = residenceCountry;
        this.disability = disability;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRelationshipToHead() {
        return relationshipToHead;
    }

    public void setRelationshipToHead(String relationshipToHead) {
        this.relationshipToHead = relationshipToHead;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getResidenceCountry() {
        return residenceCountry;
    }

    public void setResidenceCountry(String residenceCountry) {
        this.residenceCountry = residenceCountry;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }
}
