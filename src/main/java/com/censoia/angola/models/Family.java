package com.censoia.angola.models;

import jakarta.persistence.*;

@Entity
@Table(name = "family")
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "family_id")
    private Long familyId;

    @Column(name = "address", nullable = false)
    private String residenceType;

    @Column(name = "number_of_members", nullable = false)
    private int numberOfMembers;

    @Column(name = "total_income", nullable = false)
    private double totalIncome;

    @Column(name = "number_of_pets", nullable = false)
    private int numberOfPets;


    public Family() {}

    public Family(Long familyId, String residenceType, int numberOfMembers, double totalIncome, int numberOfPets) {
        this.familyId = familyId;
        this.residenceType = residenceType;
        this.numberOfMembers = numberOfMembers;
        this.totalIncome = totalIncome;
        this.numberOfPets = numberOfPets;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }
}
