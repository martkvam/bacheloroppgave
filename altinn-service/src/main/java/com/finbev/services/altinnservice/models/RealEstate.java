package com.finbev.services.altinnservice.models;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name="product_type",
        discriminatorType = DiscriminatorType.INTEGER)
public class RealEstate {
    @Id
    private int id;
    @Column
    private String address;
    @Column
    private int postalCode;
    @Column
    private String type;
    @Column
    private String energyClass;

    public RealEstate() {
    }

    public RealEstate(int id, String address, int postalCode, String type, String energyClass) {
        this.id = id;
        this.address = address;
        this.postalCode = postalCode;
        this.type = type;
        this.energyClass = energyClass;
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

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }
}
