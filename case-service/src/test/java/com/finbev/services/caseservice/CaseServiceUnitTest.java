package com.finbev.services.caseservice;

import com.finbev.services.caseservice.models.Case;
import com.finbev.services.caseservice.models.Customer;
import com.finbev.services.caseservice.models.Product;
import com.finbev.services.caseservice.repos.CaseRepository;
import com.finbev.services.caseservice.services.CaseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CaseServiceUnitTest {

    //Skal testes
    @InjectMocks
    private CaseService caseService;

    //Skal mockes
    @Mock
    private CaseRepository caseRepository;

    @Test
    void justAnExample() {

    }


    @Test
    void getCaseById_OK() throws Exception {
        Product product = new Product();
        Customer customer = new Customer();
        Case case1 = new Case(1, 5000000, "Finished", new Date(), product, customer);
        Case case2 = new Case(2, 30000000, "Waiting for approval", new Date(), product, customer);
        List<Case> caseList = new ArrayList<>();
        caseList.add(case1);
        caseList.add(case2);

        when(caseRepository.findAll()).thenReturn(caseList);
        Case findCase = caseService.getCaseById(1);
        assertEquals(case1, findCase);
    }
}
