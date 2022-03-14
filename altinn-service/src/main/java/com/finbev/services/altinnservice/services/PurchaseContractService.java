package com.finbev.services.altinnservice.services;

import com.finbev.services.altinnservice.models.PurchaseContract;
import com.finbev.services.altinnservice.repos.PurchaseContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PurchaseContractService {

    @Autowired
    PurchaseContractRepository purchaseContractRepository;

    public List<PurchaseContract> findAllContracts(){
        return purchaseContractRepository.findAll();
    }

    public List<PurchaseContract> findByBrokerAndSocial(int brokerId, long socialSecNr) throws Exception {
        List<PurchaseContract> contractList = purchaseContractRepository.findAll();
        List<PurchaseContract> outList = new ArrayList<>();
        for (PurchaseContract contract : contractList){
            if (contract.getBrokerId() == brokerId && contract.getSocialSecurityNr() == socialSecNr){
                outList.add(contract);
            }
        }
        if(outList.isEmpty()) {
            throw new Exception("Finner ikke kjøpskontrakt fra denne megleren");
        }
        else return outList;
    }

    public PurchaseContract findSingleContract(int brokerId, long socialSecNr) throws Exception {
        List<PurchaseContract> contractList = findByBrokerAndSocial(brokerId, socialSecNr);
        Collections.sort(contractList, new Comparator<PurchaseContract>() {
            @Override
            public int compare(PurchaseContract o1, PurchaseContract o2) {
                return o1.getPurchaseDate().compareTo(o2.getPurchaseDate());
            }
        });
        return contractList.get(contractList.size() - 1);
    }
}
