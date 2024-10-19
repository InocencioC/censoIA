package com.censoia.angola.models;

import jakarta.persistence.*;

@Entity
@Table(name = "residence")
public class Residence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "residence_id")
    private Long residenceId;

    @Column(name = "family_id", nullable = false)
    private Long familyId; // Referência para a família

    @Column(name = "type_of_housing", nullable = false)
    private String typeOfHousing;

    @Column(name = "number_of_rooms", nullable = false)
    private int numberOfRooms;

    @Column(name = "access_to_sanitation", nullable = false)
    private boolean accessToSanitation;

    @Column(name = "access_to_drinking_water", nullable = false)
    private boolean accessToDrinkingWater;

    @Column(name = "energy_source", nullable = false)
    private String energySource;

    public Residence() {}

    public Residence(Long residenceId, Long familyId, String typeOfHousing, int numberOfRooms, boolean accessToSanitation, boolean accessToDrinkingWater, String energySource) {
        this.residenceId = residenceId;
        this.familyId = familyId;
        this.typeOfHousing = typeOfHousing;
        this.numberOfRooms = numberOfRooms;
        this.accessToSanitation = accessToSanitation;
        this.accessToDrinkingWater = accessToDrinkingWater;
        this.energySource = energySource;
    }

    public Long getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(Long residenceId) {
        this.residenceId = residenceId;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getTypeOfHousing() {
        return typeOfHousing;
    }

    public void setTypeOfHousing(String typeOfHousing) {
        this.typeOfHousing = typeOfHousing;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isAccessToSanitation() {
        return accessToSanitation;
    }

    public void setAccessToSanitation(boolean accessToSanitation) {
        this.accessToSanitation = accessToSanitation;
    }

    public boolean isAccessToDrinkingWater() {
        return accessToDrinkingWater;
    }

    public void setAccessToDrinkingWater(boolean accessToDrinkingWater) {
        this.accessToDrinkingWater = accessToDrinkingWater;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }
}
