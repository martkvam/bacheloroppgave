package com.finbev.services.altinnservice.controllers;

import com.finbev.services.altinnservice.models.RealEstate;
import com.finbev.services.altinnservice.services.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RealEstateController {

    @Autowired
    RealEstateService realEstateService;

    @GetMapping("/realestates")
    public List<RealEstate> findAllRealEstate(){
        return realEstateService.findAllRealEstates();
    }
}
