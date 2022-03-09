package com.finbev.services.altinnservice.controllers;

import com.finbev.services.altinnservice.models.PurchaseContract;
import com.finbev.services.altinnservice.services.PurchaseContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseContractController {

    @Autowired
    PurchaseContractService purchaseContractService;

    //Returns all contracts
    @GetMapping("/contracts")
    public List<PurchaseContract> findAllContracts(){
        return purchaseContractService.findAllContracts();
    }

    //Returns all contracts for given broker and social sec nr
    @GetMapping("/contracts/broker/{brokerId}/socialSecNumber/{socialSecNumber}")
    public List<PurchaseContract> findContractsByBrokerAndSocial(@PathVariable int brokerId, @PathVariable long socialSecNumber) throws Exception {
       return purchaseContractService.findByBrokerAndSocial(brokerId, socialSecNumber);
    }

    //Returns the newest contract for given broker and social sec
    @GetMapping("/contract/broker/{brokerId}/socialSecNumber/{socialSecNumber}")
    public PurchaseContract findContractByBrokerAndSocial(@PathVariable int brokerId, @PathVariable long socialSecNumber) throws Exception {
        return purchaseContractService.findSingleContract(brokerId, socialSecNumber);
    }}
