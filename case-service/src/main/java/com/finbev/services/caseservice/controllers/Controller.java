package com.finbev.services.caseservice.controllers;

import com.finbev.services.caseservice.models.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/case")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Case> getCases(){
       return opprettListe();
    }

    //For å teste API, skal erstattes med databasekall
    public List<Case> opprettListe(){

        Customer kunde1 = new Customer(1, "Applicant", "Martin", "Kvam");
        Customer kunde2 = new Customer(2, "Applicant", "Adrian", "Nilsen");
        Customer kunde3 = new Customer(3, "Applicant", "Trym", "Stenberg");

        Product produkt1 = new Finbev(1, "FinBev", "Finansieringsbevis", "Finansieringbevis for boligkjøp");
        Product produkt2 = new HouseLoan(1, "Boliglån", "Grønt boliglån", "Boliglån med gunstig rente");

        Case case1 = new Case(1, 2000000, "Ferdig", new Date(), produkt2.getId(), kunde1.getId());
        Case case2 = new Case(2, 3000000, "Klar til å ferdigstilles", new Date(), produkt1.getId(), kunde2.getId());
        Case case3 = new Case(3, 4500000, "Klar for signering", new Date(), produkt2.getId(), kunde3.getId());

        List<Case> liste = new ArrayList<>();
        liste.add(case1);
        liste.add(case2);
        liste.add(case3);

        return liste;
    }
}
