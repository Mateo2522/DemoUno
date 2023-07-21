package com.demo.demoUno.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {

    @GetMapping("/version")
    public String getVersionInfo(){
        return "Version Contratos - V1";
    }
}
