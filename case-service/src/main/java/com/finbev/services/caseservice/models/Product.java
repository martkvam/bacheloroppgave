package com.finbev.services.caseservice.models;

public class Product {
    private int productId;
    private String type;
    private String name;
    private String description;

    public Product(int id, String type, String name, String description) {
        productId = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int id) {
        productId = id;
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
