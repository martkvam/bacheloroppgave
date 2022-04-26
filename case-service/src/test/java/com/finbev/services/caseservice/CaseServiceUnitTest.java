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
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
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
    void getCaseById_OK() throws Exception {
        Product product = new Product();
        Customer customer = new Customer();
        Case case1 = new Case(1, 5_000_000, 3_000_000, 2_000_000, 500_000, 200_000, "Finished", new Date(), product, customer);
        Case case2 = new Case(2, 3_000_000, 2_000_000, 1_000_000, 500_000, 200_000, "Waiting for approval", new Date(), product, customer);
        List<Case> caseList = new ArrayList<>();
        caseList.add(case1);
        caseList.add(case2);

        when(caseRepository.findAll()).thenReturn(caseList);
        Case findCase = caseService.getCaseById(1);
        assertEquals(case1, findCase);
    }

    @Test
    void getCaseById_NoSuchID() throws Exception{
        Product product = new Product();
        Customer customer = new Customer();
        Case case1 = new Case(1, 5_000_000, 3_000_000, 2_000_000, 500_000, 200_000, "Finished", new Date(), product, customer);
        Case case2 = new Case(2, 3_000_000, 1_000_000, 2_000_000, 500_000, 200_000, "Waiting for approval", new Date(), product, customer);
        List<Case> caseList = new ArrayList<>();
        caseList.add(case1);
        caseList.add(case2);
        when(caseRepository.findAll()).thenReturn(caseList);
        Exception exception = assertThrows(Exception.class, () -> {
            Case findCase = caseService.getCaseById(3);
        } );
        String expectedError = "Could not find a case with id: " + 3;
        String actualError = exception.getMessage();
        assertEquals(expectedError, actualError);
    }

    @Test
    void getCaseById_WrongInput(){
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Case findCase = caseService.getCaseById(Integer.parseInt("abc"));
        } );
        String expectedError = "For input string";
        String actualError = exception.getMessage();
        assertTrue(actualError.contains(expectedError));
    }
}
