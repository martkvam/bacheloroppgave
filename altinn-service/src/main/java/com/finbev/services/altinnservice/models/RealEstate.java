package com.finbev.services.altinnservice.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorColumn(name="product_type",
        discriminatorType = DiscriminatorType.INTEGER)
public class RealEstate {
    @Id
    private int id;
    private String address;
    private String type;
    private double purchaseAmount;

    public RealEstate() {
    }

    public RealEstate(int id, String address, String type, double purchaseAmount) {
        this.id = id;
        this.address = address;
        this.type = type;
        this.purchaseAmount = purchaseAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
