package com.finbev.services.caseservice.models;

public class Product {
    private int Id;
    private String type;
    private String name;
    private String description;

    public Product(int id, String type, String name, String description) {
        Id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public Product() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
