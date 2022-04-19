package com.finbev.services.caseservice.controllers;

import com.finbev.services.caseservice.models.*;
import com.finbev.services.caseservice.repos.CaseRepository;
import com.finbev.services.caseservice.services.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CaseController {

    @Autowired
    CaseService caseService;

    @GetMapping("/cases")
    //@CrossOrigin(origins = "http://localhost:4200") DENNE MÅ LEGGES TIL HVIS IKKE GATEWAY KJØRES
    public List<Case> getCases(){
        return caseService.findAllCases();
    }

    @GetMapping("/cases/{id}")
    //@CrossOrigin(origins = "http://localhost:4200")
    public Case getCaseById(@PathVariable int id) throws Exception {
        return caseService.getCaseById(id);
    }

    @PostMapping("/updateApplication/{type}")
    public String finishHouseLoan(@RequestBody Case aCase, @PathVariable String type){
        System.out.println(aCase);
        System.out.println(type);
        return caseService.createHouseLoan(aCase, type);
    }

    @PostMapping("/cases/{id}")
    public String createHouseLoanApplication(@PathVariable int id){
       return caseService.createHouseLoanApplication(id);
    }
}
