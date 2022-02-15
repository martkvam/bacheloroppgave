package com.finbev.services.caseservice.models;

import java.util.Date;

public class Case {
    private int caseId;
    private String type;
    private long amount;
    private boolean finished;
    private Date date;
    private String name;
    private String customerFirstName;
    private String customerLastName;

    public Case(int caseId, String type, long amount, boolean finished, Date date, String name, String customerFirstName, String customerLastName) {
        this.caseId = caseId;
        this.type = type;
        this.amount = amount;
        this.finished = finished;
        this.date = date;
        this.name = name;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }

    public Case() {
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }
}
