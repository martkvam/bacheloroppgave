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
    private String energyClass;

    public RealEstate() {
    }

    public RealEstate(int id, String address, String type, String energyClass) {
        this.id = id;
        this.address = address;
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
