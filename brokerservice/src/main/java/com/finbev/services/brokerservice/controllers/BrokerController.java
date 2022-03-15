package com.finbev.services.brokerservice.controllers;

import com.finbev.services.brokerservice.models.Broker;
import com.finbev.services.brokerservice.services.BrokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrokerController {

    @Autowired
    BrokerService brokerService;

    @GetMapping("/brokers")
    @CrossOrigin("http://localhost:4200")
    public List<Broker> retrieveBrokers(){
        return brokerService.retrieveAllBrokers();
    }
}
