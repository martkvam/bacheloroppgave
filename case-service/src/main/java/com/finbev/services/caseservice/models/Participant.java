package com.finbev.services.caseservice.models;

public class Participant {
    private int participantId;
    private String role;
    private Customer customer;

    public Participant(int participantId, String role, Customer customer) {
        this.participantId = participantId;
        this.role = role;
        this.customer = customer;
    }

    public Participant() {
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
