package com.finbev.services.brokerservice.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "broker")
public class Broker {
    @Id
    private int id;
    @Column(name = "broker_name")
    private String name;

    public Broker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Broker() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
