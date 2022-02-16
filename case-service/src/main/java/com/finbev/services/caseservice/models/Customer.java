package com.finbev.services.caseservice.models;

public class Customer {
    private int customerId;
    private String customerFirstName;
    private String customerLastName;

    public Customer(int id, String customerFirstName, String customerLastName) {
        this.customerId = id;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int id) {
        customerId = id;
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
