package com.finbev.services.altinnservice.services;

import com.finbev.services.altinnservice.models.RealEstate;
import com.finbev.services.altinnservice.repos.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RealEstateService {

    @Autowired
    RealEstateRepository realEstateRepository;

    public List<RealEstate> findAllRealEstates(){
        return realEstateRepository.findAll();
    }
}
