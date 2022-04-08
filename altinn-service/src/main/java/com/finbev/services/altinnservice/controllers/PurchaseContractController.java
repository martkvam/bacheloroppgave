package com.finbev.services.altinnservice.controllers;

import com.finbev.services.altinnservice.models.PurchaseContract;
import com.finbev.services.altinnservice.services.PurchaseContractService;
/*
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation; */
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Handles all queries related to purchase contracts")
public class PurchaseContractController {

    @Autowired
    PurchaseContractService purchaseContractService;

    //Returns all contracts
    @GetMapping("/contracts")
    @Operation(summary = "Find all contracts", description = "Returns all purchase contracts")
    public List<PurchaseContract> findAllContracts(){
        return purchaseContractService.findAllContracts();
    }

    //Returns all contracts for given broker and social sec nr
    @GetMapping("/contracts/broker/{brokerId}/socialSecNumber/{socialSecNumber}")
    @Operation(summary = "Find all contracts for broker and social", description = "Returns all purchase contracts associated with a certain broker and social sec number")
    public List<PurchaseContract> findContractsByBrokerAndSocial(@PathVariable int brokerId, @PathVariable long socialSecNumber) throws Exception {
       return purchaseContractService.findByBrokerAndSocial(brokerId, socialSecNumber);
    }

    //Returns the newest contract for given broker and social sec
    @GetMapping("/contract/broker/{brokerId}/socialSecNumber/{socialSecNumber}")
    @Operation(summary = "Find last contract for broker and social", description = "Returns the last contract associated with a certain broker and social sec number")
    public PurchaseContract findContractByBrokerAndSocial(@PathVariable int brokerId, @PathVariable long socialSecNumber) throws Exception {
        return purchaseContractService.findSingleContract(brokerId, socialSecNumber);
    }}
