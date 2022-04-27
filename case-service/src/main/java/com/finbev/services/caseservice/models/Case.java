package com.finbev.services.caseservice.models;

import org.hibernate.annotations.GenericGenerator;

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
    private long purchaseAmount;
    @Column
    private long loanAmount;
    @Column
    private long equity;
    @Column
    private long income;
    @Column
    private long debt;
    @Column
    @Basic(optional = true)
    private int downpaymentPeriod;
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

    public Case(int caseId, long purchaseAmount, long loanAmount, long equity, long income, long debt, int downpaymentPeriod, String status, Date date, Product product, Customer customer) {
        this.caseId = caseId;
        this.purchaseAmount = purchaseAmount;
        this.loanAmount = loanAmount;
        this.equity = equity;
        this.income = income;
        this.debt = debt;
        this.downpaymentPeriod = downpaymentPeriod;
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

    public long getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(long amount) {
        this.purchaseAmount = amount;
    }

    public long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public long getEquity() {
        return equity;
    }

    public void setEquity(long equity) {
        this.equity = equity;
    }

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    public long getDebt() {
        return debt;
    }

    public void setDebt(long debt) {
        this.debt = debt;
    }

    public int getDownpaymentPeriod() {
        return downpaymentPeriod;
    }

    public void setDownpaymentPeriod(int downpaymentPeriod) {
        this.downpaymentPeriod = downpaymentPeriod;
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