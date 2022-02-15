package com.finbev.services.caseservice.models;

import java.util.Date;

public class HouseLoan extends Case{

    public HouseLoan(int caseId, String type, long amount, boolean finished, Date date, String name, String customerFirstName, String customerLastName) {
        super(caseId, type, amount, finished, date, name, customerFirstName, customerLastName);
    }

    public HouseLoan() {
    }
}
