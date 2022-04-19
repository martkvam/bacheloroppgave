package com.finbev.services.altinnservice.controllers;

import com.finbev.services.altinnservice.models.PurchaseContract;
import com.finbev.services.altinnservice.models.RealEstate;
import com.finbev.services.altinnservice.services.RealEstateService;
/*
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

 */
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Handles all queries related to real estates")
public class RealEstateController {

    @Autowired
    RealEstateService realEstateService;

    @GetMapping("/realestates")
    @Operation(summary = "Returns all real estates", description = "Returns all realestates")
    public List<RealEstate> findAllRealEstate(){
        return realEstateService.findAllRealEstates();
    }
}
