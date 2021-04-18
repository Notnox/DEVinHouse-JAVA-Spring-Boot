package com.calculadora.calculator.service;

import org.springframework.stereotype.Service;

/**
 * CalculatorService
 */

@Service
public class CalculatorService {

    public double calcular(Integer operacao, Integer num1, Integer num2) {
        if (operacao == 1){
            return num1 + num2;
        } else if (operacao == 2) {
            return num1 * num2;
        }

        return 0;
    }
    
}