package com.finbev.services.caseservice.controllers;

import com.finbev.services.caseservice.models.*;
import com.finbev.services.caseservice.repos.CaseRepository;
import com.finbev.services.caseservice.services.CaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Case APIs", description = "Handles all queries related to cases")
public class CaseController {

    @Autowired
    CaseService caseService;

    @GetMapping("/cases")
    @Operation(description = "Returns all cases")
    //@CrossOrigin(origins = "http://localhost:4200") DENNE MÅ LEGGES TIL HVIS IKKE GATEWAY KJØRES
    public List<Case> getCases(){
        return caseService.findAllCases();
    }


    @PostMapping("/cases/updateApplication/{type}")
    @Operation(description = "finishes a house loan application")
    public String finishHouseLoan(@RequestBody Case aCase, @PathVariable String type){
        System.out.println(aCase);
        System.out.println(type);
        return caseService.createHouseLoan(aCase, type);
    }

    @GetMapping("/cases/{id}")
    @Operation(description = "creates a new house loan application from an existing preapproval letter")
    public Case createHouseLoanApplication(@PathVariable int id){
       return caseService.createHouseLoanApplication(id);
    }
}
