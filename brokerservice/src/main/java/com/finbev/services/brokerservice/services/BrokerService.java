package com.finbev.services.brokerservice.services;

import com.finbev.services.brokerservice.models.Broker;
import com.finbev.services.brokerservice.repo.BrokerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BrokerService {
    @Autowired
    BrokerRepository brokerRepository;

    public List<Broker> retrieveAllBrokers(){
        return brokerRepository.findAll();
    }
}
