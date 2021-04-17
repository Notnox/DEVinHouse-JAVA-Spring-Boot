package com.devinhouse.senaidevinhouse.service;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.scheduling.annotation.Scheduled;
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

  @Scheduled(cron = "${cron.devinhouse}")
  public void imprimeConsole(){
      System.out.println(LocalDate.now() + " - " + LocalTime.now());
  }
}
