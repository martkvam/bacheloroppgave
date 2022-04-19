package com.finbev.services.caseservice.models;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("2")
public class HouseLoan extends Product{

    @Basic(optional = true)
    private Double interestRate;

    public HouseLoan(int id, String type, String name, String description, Double interestRate) {
        super(id, type, name, description);
        this.interestRate = interestRate;
    }

    public HouseLoan() {
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
