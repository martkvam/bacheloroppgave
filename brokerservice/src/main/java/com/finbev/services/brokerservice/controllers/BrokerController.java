package com.finbev.services.brokerservice.controllers;

import com.finbev.services.brokerservice.models.Broker;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BrokerController {

    @GetMapping("/brokers")
    @CrossOrigin("http://localhost:4200")
    public List<Broker> retrieveBrokers(){
        return createList();
    }

    public List<Broker> createList(){
        List<Broker> brokerList = new ArrayList<>();
        Broker broker1 = new Broker(1, "Krogsveen");
        Broker broker2 = new Broker(2, "Privatmegleren");
        Broker broker3 = new Broker(3, "Aktiv Eiendomsmegling");
        Broker broker4 = new Broker(4, "DnB Eiendom");
        Broker broker5 = new Broker(5, "Eiendomsmegler 1");
        Broker broker6 = new Broker(6, "Eiendomsmegler Vest");
        Broker broker7 = new Broker(7, "Nordvik");
        brokerList.add(broker1);
        brokerList.add(broker2);
        brokerList.add(broker3);
        brokerList.add(broker4);
        brokerList.add(broker5);
        brokerList.add(broker6);
        brokerList.add(broker7);
        return brokerList;
    }
}
