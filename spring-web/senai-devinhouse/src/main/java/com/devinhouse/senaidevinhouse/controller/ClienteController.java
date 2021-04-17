package com.devinhouse.senaidevinhouse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devinhouse.senaidevinhouse.parametro.Parametros;
import com.devinhouse.senaidevinhouse.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @Autowired
    private Parametros parametros;

    @GetMapping(value="/imprime-nome/{nome}/{idade}")
    public String imprimirNome(@PathVariable String nome, @PathVariable Integer idade) {
        return parametros.getPrimeiroParametro() + " - " +
        parametros.getSegundoParametro() + " - " +
        parametros.getTerceiroParametro() + " - " +
        service.formatarNomeIdade(nome,idade);
    }
    
}
