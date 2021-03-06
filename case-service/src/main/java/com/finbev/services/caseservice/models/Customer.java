package com.finbev.services.caseservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
    @Id
    private int Id;
    @Column
    private String role;
    @Column
    private String customerFirstName;
    @Column
    private String customerLastName;

    public Customer(int id, String role, String customerFirstName, String customerLastName) {
        Id = id;
        this.role = role;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }

    public Customer() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
