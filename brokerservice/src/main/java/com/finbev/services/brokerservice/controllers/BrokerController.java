package com.finbev.services.brokerservice.controllers;

import com.finbev.services.brokerservice.models.Broker;
import com.finbev.services.brokerservice.services.BrokerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Broker APIs", description = "Handles all queries related to brokers")
public class BrokerController {

    @Autowired
    BrokerService brokerService;

    @GetMapping("/brokers")
    @CrossOrigin("http://localhost:4200")
    @Operation(description = "Returns list of all brokers")
    public List<Broker> retrieveBrokers(){
        return brokerService.retrieveAllBrokers();
    }
}
