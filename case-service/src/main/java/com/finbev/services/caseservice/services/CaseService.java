package com.finbev.services.caseservice.services;

import com.finbev.services.caseservice.models.Case;
import com.finbev.services.caseservice.repos.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CaseService {

    @Autowired
    CaseRepository caseRepository;

    public List<Case> findAllCases(){
        return caseRepository.findAll();
    }
}
