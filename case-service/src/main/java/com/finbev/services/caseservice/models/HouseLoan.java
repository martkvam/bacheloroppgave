package com.finbev.services.caseservice.models;

import java.util.Date;

public class HouseLoan extends Product{

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
