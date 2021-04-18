package com.calculadora.calculator.controller;

import com.calculadora.calculator.service.CalculatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calcular")
public class CalculatorController {

    @Autowired
    private CalculatorService service;

    @GetMapping(value = "/{operacao}/{primeiro}/{segundo}")
    public String calcular(@PathVariable Integer operacao, 
                            @PathVariable Integer primeiro, 
                            @PathVariable Integer segundo) {
        return "Resultado: " + service.calcular(operacao, primeiro, segundo);
    }

}
