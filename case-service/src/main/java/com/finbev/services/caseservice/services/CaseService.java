package com.finbev.services.caseservice.services;

import com.finbev.services.caseservice.models.Case;
import com.finbev.services.caseservice.models.HouseLoan;
import com.finbev.services.caseservice.models.Product;
import com.finbev.services.caseservice.repos.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class CaseService {

    @Autowired
    CaseRepository caseRepository;

    @Autowired
    ProductService productService;

    public List<Case> findAllCases(){
        return caseRepository.findAll();
    }

    public Case getCaseById(int id) throws Exception {
        List<Case> list = findAllCases();
        for (Case aCase : list){
            if(aCase.getCaseId() == id){
                return aCase;
            }
        }
        throw new Exception("Could not find a case with id: " + id);
    }

    public String updateStatusFinished(int id) {
        try {
            Case aCase = getCaseById(id);
            aCase.setStatus("Finished");
            return "OK";
        }
        catch (Exception e){
            return e.getMessage();
        }
    }

    public String createHouseLoanApplication(int id){
        try{
            Case aCase = getCaseById(id);
            Case newCase = createApplicationFromPreapproval(aCase);
            updateStatusFinished(id);
            caseRepository.saveAndFlush(aCase);
            caseRepository.saveAndFlush(newCase);
            return "OK";

        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public Case createApplicationFromPreapproval(Case aCase){
        Case newCase = new Case();
        Product application = productService.findApplication();
        newCase.setProduct(application);
        newCase.setStatus("Application in progress");
        newCase.setAmount(aCase.getAmount());
        newCase.setDate(aCase.getDate());
        newCase.setCustomer(aCase.getCustomer());
        return newCase;
    }

    public String createHouseLoan(Case aCase, String type){
        try {
            Product houseLoanType = productService.findLoanType(type);
            if(houseLoanType == null){
                return "Could not find loan type";
            }
            aCase.setProduct(houseLoanType);
            aCase.setStatus("Finished");
            caseRepository.saveAndFlush(aCase);
            return "OK";
        } catch (Exception e){
            return e.getMessage();
        }
    }
}
