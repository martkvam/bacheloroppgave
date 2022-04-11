package com.finbev.services.caseservice.models;


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
    private long purchaseAmount;
    @Column
    private long loanAmount;
    @Column
    private long equity;
    @Column
    private long income;
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

    public Case(int caseId, long purchaseAmount, long loanAmount, long equity, long income, String status, Date date, Product product, Customer customer) {
        this.caseId = caseId;
        this.purchaseAmount = purchaseAmount;
        this.loanAmount = loanAmount;
        this.equity = equity;
        this.income = income;
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