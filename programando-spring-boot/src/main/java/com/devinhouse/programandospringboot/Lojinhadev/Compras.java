package com.devinhouse.programandospringboot.Lojinhadev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Compras {
    
    @GetMapping(value="/")
    public String getMethodName() {
        Cliente novoCliente = new Cliente(12312,"Lucas","baba");
        return novoCliente.getNome();
    }
}
