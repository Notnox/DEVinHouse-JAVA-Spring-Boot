package com.devinhouse.senaidevinhouse.parametro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parametros {
    
    @Value("${primeiroparametro.devinhouse}")
    private String primeiroParametro;
    
    @Value("${segundoparametro.devinhouse}")
    private String segundoParametro;

    @Value("${terceiroparametro.devinhouse}")
    private String terceiroParametro;

    public String getPrimeiroParametro() {
        return primeiroParametro;
    }

    public void setPrimeiroParametro(String primeiroParametro) {
        this.primeiroParametro = primeiroParametro;
    }

    public String getSegundoParametro() {
        return segundoParametro;
    }

    public void setSegundoParametro(String segundoParametro) {
        this.segundoParametro = segundoParametro;
    }

    public String getTerceiroParametro() {
        return terceiroParametro;
    }

    public void setTerceiroParametro(String terceiroParametro) {
        this.terceiroParametro = terceiroParametro;
    }

    
}
