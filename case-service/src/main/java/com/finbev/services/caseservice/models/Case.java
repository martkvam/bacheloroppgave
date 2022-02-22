package com.finbev.services.caseservice.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "cases")
public class Case {

    @Id
    @SequenceGenerator(name="cases_case_id_seq",
            sequenceName="cases_case_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="cases_case_id_seq")
    @Column(name = "case_id")
    private int caseId;

    @Column(name = "amount")
    private long amount;
    private String status;
    private Date date;
    private int product;
    private int customer;

    public Case(int caseId, long amount, String status, Date date, int product, int customer) {
        this.caseId = caseId;
        this.amount = amount;
        this.status = status;
        this.date = date;
        this.product = product;
        this.customer = customer;
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

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }
}