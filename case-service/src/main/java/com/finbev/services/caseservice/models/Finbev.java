package com.finbev.services.caseservice.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("1")
public class Finbev extends Product{

    public Finbev(int id, String type, String name, String description, long income) {
        super(id, type, name, description);
    }

    public Finbev() {
    }
}
