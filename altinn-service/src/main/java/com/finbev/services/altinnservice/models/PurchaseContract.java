package com.finbev.services.altinnservice.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PurchaseContract {
    @Id
    private int id;
    @Column
    private int brokerId;
    @Column
    private double purchaseAmount;
    @Column
    private long socialSecurityNr;
    @Column
    private Date purchaseDate;
    @JoinColumn
    @OneToOne
    private RealEstate realEstate;

    public PurchaseContract() {
    }

    public PurchaseContract(int id, int brokerId, double purchaseAmount, long socialSecurityNr, Date purchaseDate, RealEstate realEstate) {
        this.id = id;
        this.brokerId = brokerId;
        this.purchaseAmount = purchaseAmount;
        this.socialSecurityNr = socialSecurityNr;
        this.purchaseDate = purchaseDate;
        this.realEstate = realEstate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(int brokerId) {
        this.brokerId = brokerId;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public long getSocialSecurityNr() {
        return socialSecurityNr;
    }

    public void setSocialSecurityNr(long socialSecurityNr) {
        this.socialSecurityNr = socialSecurityNr;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public RealEstate getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(RealEstate realEstate) {
        this.realEstate = realEstate;
    }
}
