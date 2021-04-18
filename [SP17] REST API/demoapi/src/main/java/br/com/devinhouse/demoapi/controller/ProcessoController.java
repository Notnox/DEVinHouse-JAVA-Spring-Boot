package br.com.devinhouse.demoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProcessoController
 */
@RestController
@RequestMapping(path = "/imprimir")
public class ProcessoController {

    @GetMapping
    public String ola(){
        return "Olá Mundo!";
    }
}