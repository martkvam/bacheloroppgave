package com.finbev.services.caseservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public String test(){
        return "Dette funker ja!";
    }
}
