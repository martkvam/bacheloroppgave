package com.finbev.services.caseservice.controllers;

import com.finbev.services.caseservice.models.*;
import com.finbev.services.caseservice.repos.CaseRepository;
import com.finbev.services.caseservice.services.CaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/cases/{id}")
    @Operation(description = "Retrieves a single case by for given ID")
    //@CrossOrigin(origins = "http://localhost:4200")
    public Case getCaseById(@PathVariable int id) throws Exception {
        return caseService.getCaseById(id);
    }

    /*For å teste API, skal erstattes med databasekall
    public List<Case> opprettListe(){



        /*
        Customer kunde1 = new Customer(1, "Applicant", "Martin", "Kvam");
        Customer kunde2 = new Customer(2, "Applicant", "Adrian", "Nilsen");
        Customer kunde3 = new Customer(3, "Applicant", "Trym", "Stenberg");

        Product produkt1 = new Finbev(1, "FinBev", "Finansieringsbevis", "Finansieringbevis for boligkjøp");
        Product produkt2 = new HouseLoan(1, "Boliglån", "Grønt boliglån", "Boliglån med gunstig rente");

        Case case1 = new Case(1, 2000000, "Ferdig", new Date(), produkt1, kunde1);
        Case case2 = new Case(2, 3000000, "Klar til å ferdigstilles", new Date(), produkt1, kunde2);
        Case case3 = new Case(3, 4500000, "Klar for signering", new Date(), produkt2, kunde3);

        List<Case> liste = new ArrayList<>();
        liste.add(case1);
        liste.add(case2);
        liste.add(case3);

        return liste;


    }
    */
}
