package com.client.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {
    @GetMapping("yo")
    public String getString(){
        return "yo";
    }
}
