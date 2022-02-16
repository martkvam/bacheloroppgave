package com.finbev.services.caseservice.controllers;

import com.finbev.services.caseservice.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/case")
    public List<Case> getCases(){
       return opprettListe();
    }

    @GetMapping("/case/{id}")
    public Case getCaseById(@PathVariable int id) throws Exception {
        List<Case> alleCaser = opprettListe();

        for (Case etCase : alleCaser){
            if (etCase.getCaseId() == id){
                return etCase;
            }
        }

        throw new Exception("Fant ingen case med denne ID'en");
    }

    //For å teste API, skal erstattes med databasekall
    public List<Case> opprettListe(){
        Customer kunde1 = new Customer(1, "Martin", "Kvam");
        Customer kunde2 = new Customer(2, "Adrian", "Nilsen");
        Customer kunde3 = new Customer(3, "Trym", "Stenberg");

        Participant participant = new Participant(1, "Applicant", kunde1);
        Participant participant2 = new Participant(2, "Co_Applicant", kunde2);
        Participant participant3 = new Participant(3, "Applicant", kunde2);
        Participant participant4 = new Participant(4,"Applicant", kunde3);


        List<Participant> participantList = new ArrayList<>();
        List<Participant> participantList2 = new ArrayList<>();
        List<Participant> participantList3 = new ArrayList<>();

        participantList.add(participant);
        participantList.add(participant2);
        participantList2.add(participant3);
        participantList3.add(participant4);

        Product produkt1 = new Finbev(1, "FinBev", "Finansieringsbevis", "Finansieringbevis for boligkjøp");
        Product produkt2 = new HouseLoan(1, "Boliglån", "Grønt boliglån", "Boliglån med gunstig rente", 2.25);

        Case case1 = new Case(1, 2000000, "Ferdig", new Date(), produkt2, participantList);
        Case case2 = new Case(2, 3000000, "Klar til å ferdigstilles", new Date(), produkt1, participantList2);
        Case case3 = new Case(3, 4500000, "Klar for signering", new Date(), produkt2, participantList3);

        List<Case> liste = new ArrayList<>();
        liste.add(case1);
        liste.add(case2);
        liste.add(case3);

        return liste;
    }


}
