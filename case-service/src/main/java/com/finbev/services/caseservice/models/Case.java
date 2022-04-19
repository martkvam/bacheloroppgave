package com.finbev.services.caseservice.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.engine.internal.Cascade;


import javax.persistence.*;


import java.util.Date;

@Entity
@Table(name = "case_table")
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    @Column
    private int caseId;
    @Column
    private long amount;
    @Column
    private String status;
    @Column
    private Date date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Product product;
    @ManyToOne(cascade = CascadeType.ALL)
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