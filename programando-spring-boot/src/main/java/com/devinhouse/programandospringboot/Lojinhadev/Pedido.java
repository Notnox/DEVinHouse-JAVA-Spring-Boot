package com.devinhouse.programandospringboot.Lojinhadev;

import java.sql.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class Pedido {
    private long id;
    private Cliente cliente;
    private List<Item> itens;
    private double valorTotal;

    public Pedido(long id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    
    
}
