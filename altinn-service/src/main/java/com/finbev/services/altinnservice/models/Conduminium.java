package com.finbev.services.altinnservice.models;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Conduminium extends RealEstate{
    @Basic(optional=true)
    private int postalCode;
    @Basic(optional=true)
    private int cadastralNumber;
    @Basic(optional=true)
    private int titleNumber;
    @Basic(optional=true)
    private int sectionNumber;
    @Basic(optional=true)
    private int leaseNumber;

    public Conduminium() {
    }

    public Conduminium(int id, String address, String type, String energyClass, int postalCode, int cadastralNumber, int titleNumber, int sectionNumber, int leaseNumber) {
        super(id, address, type, energyClass);
        this.postalCode = postalCode;
        this.cadastralNumber = cadastralNumber;
        this.titleNumber = titleNumber;
        this.sectionNumber = sectionNumber;
        this.leaseNumber = leaseNumber;
    }


    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(int cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public int getTitleNumber() {
        return titleNumber;
    }

    public void setTitleNumber(int titleNumber) {
        this.titleNumber = titleNumber;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public int getLeaseNumber() {
        return leaseNumber;
    }

    public void setLeaseNumber(int leaseNumber) {
        this.leaseNumber = leaseNumber;
    }
}
