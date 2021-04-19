package br.com.devinhouse.demoapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.var;

/**
 * Processo
 */
@Data
@Entity
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer ano;
    @Column(nullable = false)
    private String codigo;
    @Column(nullable = false)
    private String nome;

    public static Processo converter(Processo p){
        var processo = new Processo();

        processo.setId(p.getId());
        processo.setAno(p.getAno());
        processo.setCodigo(p.getCodigo());
        processo.setNome(p.getNome());

        return processo;
    }
    
}