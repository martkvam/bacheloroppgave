package com.finbev.services.caseservice.services;

import com.finbev.services.caseservice.models.Case;
import com.finbev.services.caseservice.models.Product;
import com.finbev.services.caseservice.repos.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
public class CaseService {

    @Autowired
    CaseRepository caseRepository;

    @Autowired
    ProductService productService;

    public List<Case> findAllCases(){
        List<Case> caseList = caseRepository.findAll();
        caseList.sort(Comparator.comparing(Case::getCaseId, Comparator.reverseOrder()));
        return caseList;
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
            aCase.setStatus("Fullført");
            return "OK";
        }
        catch (Exception e){
            return e.getMessage();
        }
    }

    public Case createHouseLoanApplication(int id){
        try{
            Case aCase = getCaseById(id);
            Case newCase = createApplicationFromPreapproval(aCase);
            updateStatusFinished(id);
            caseRepository.saveAndFlush(aCase);
            return caseRepository.saveAndFlush(newCase);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Case createApplicationFromPreapproval(Case aCase){
        Case newCase = new Case();
        Product application = productService.findApplication();
        newCase.setProduct(application);
        newCase.setStatus("Fortsett søknad");
        newCase.setPurchaseAmount(aCase.getPurchaseAmount());
        newCase.setLoanAmount(aCase.getLoanAmount());
        newCase.setDebt(aCase.getDebt());
        newCase.setEquity(aCase.getEquity());
        newCase.setIncome(aCase.getIncome());
        newCase.setDate(aCase.getDate());
        newCase.setCustomer(aCase.getCustomer());
        return newCase;
    }

    public Case createHouseLoan(Case aCase, String type){
        try {
            Product houseLoanType = productService.findLoanType(type);
            aCase.setProduct(houseLoanType);
            aCase.setStatus("Fullført");
            caseRepository.saveAndFlush(aCase);
            return aCase;
        } catch (Exception e){
            return null;
        }
    }
}
