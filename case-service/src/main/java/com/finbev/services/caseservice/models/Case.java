package com.finbev.services.caseservice.models;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;




import java.util.Date;

@Entity
@Table(name = "case_table")
public class Case {

    @Id
    @SequenceGenerator(name="cases_case_id_seq",
            sequenceName="cases_case_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="cases_case_id_seq")
    @Column
    private int caseId;
    @Column
    private long amount;
    @Column
    private String status;
    @Column
    private Date date;
    @ManyToOne
    @JoinColumn
    private Product product;
    @ManyToOne
    @JoinColumn
    private Customer customer;

    public Case(int caseId, long amount, String status, Date date, Product product, Customer customer) {
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}