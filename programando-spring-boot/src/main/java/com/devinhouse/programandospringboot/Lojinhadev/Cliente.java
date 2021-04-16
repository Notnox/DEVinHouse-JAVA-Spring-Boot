package com.devinhouse.programandospringboot.Lojinhadev;

import java.util.List;

import javax.xml.crypto.Data;

public class Cliente {
    private long id;
    private String nome;
    private String endereco;
    private List<Pedido> pedidos ;
    
    public Cliente(long id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void addCarrinho(long id, Cliente cliente){
        Pedido novoPedido = new Pedido(id, cliente);
        pedidos.add(novoPedido);
    }

    public String carrinho(){
        return "" + pedidos.size();
    }
    
}
