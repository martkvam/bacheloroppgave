package com.finbev.services.caseservice.models;

import javax.persistence.Column;
import java.util.Date;

public class Finbev extends Product{

    public Finbev(int id, String type, String name, String description, long income) {
        super(id, type, name, description);
    }

    public Finbev() {
    }
}
