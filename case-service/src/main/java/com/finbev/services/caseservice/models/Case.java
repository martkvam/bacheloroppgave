package com.finbev.services.caseservice.models;

import java.util.Date;
import java.util.List;

public class Case {
    private int caseId;
    private long amount;
    private String status;
    private Date date;
    private Product product;
    private List<Participant> participants;

    public Case(int caseId, long amount, String status, Date date, Product product, List<Participant> participants) {
        this.caseId = caseId;
        this.amount = amount;
        this.status = status;
        this.date = date;
        this.product = product;
        this.participants = participants;
    }

    public Case() {
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}