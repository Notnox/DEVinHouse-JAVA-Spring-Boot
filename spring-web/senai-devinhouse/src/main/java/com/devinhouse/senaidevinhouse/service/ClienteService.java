package com.devinhouse.senaidevinhouse.service;

import org.springframework.stereotype.Service;

@Service
public class ClienteService extends PedidoService {


    public String formatarNomeIdade(String nome, Integer idade) {
        return "Nome: " + nome + " sua idade é " + idade;
    }
    
  @Override
  public String pedido() {
      return "nome";
  }
}
