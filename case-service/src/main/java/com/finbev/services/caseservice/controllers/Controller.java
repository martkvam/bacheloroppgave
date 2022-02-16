package com.finbev.services.caseservice.controllers;

import com.finbev.services.caseservice.models.Case;
import com.finbev.services.caseservice.models.Finbev;
import com.finbev.services.caseservice.models.HouseLoan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/case")
    public List<Case> test(){
       Finbev finbev = new Finbev(1, "Finansieringsbevis", 200000, false, new Date(), "Test", "Martin", "Kvam");
       HouseLoan houseLoan = new HouseLoan(2, "Lån", 300000, true, new Date(), "Grønt boliglån", "Martin", "Kvam");
       List<Case> liste = new ArrayList<>();
       liste.add(finbev);
       liste.add(houseLoan);
       return liste;
    }
}
