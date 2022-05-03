package com.finbev.services.altinnservice.models;


import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class HousingCooperative extends RealEstate{
    @Basic(optional=true)
    private int unitNumber;
    @Basic(optional=true)
    private String cooperativeName;
    @Basic(optional=true)
    private double sharedDebt;

    public HousingCooperative() {
    }

    public HousingCooperative(int id, String address, String postalCode, String type, String energyClass, int unitNumber, String cooperativeName, double sharedDebt) {
        super(id, address, postalCode, type, energyClass);
        this.unitNumber = unitNumber;
        this.cooperativeName = cooperativeName;
        this.sharedDebt = sharedDebt;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getCooperativeName() {
        return cooperativeName;
    }

    public void setCooperativeName(String cooperativeName) {
        this.cooperativeName = cooperativeName;
    }

    public double getSharedDebt() {
        return sharedDebt;
    }

    public void setSharedDebt(double sharedDebt) {
        this.sharedDebt = sharedDebt;
    }
}
