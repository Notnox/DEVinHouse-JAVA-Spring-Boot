package br.com.devinhouse.demoapi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.devinhouse.demoapi.model.Processo;
import br.com.devinhouse.demoapi.repository.ProcessoRepository;
import lombok.var;

/**
 * ProcessoController
 */
@RestController
@RequestMapping(path = "/processos")
public class ProcessoController {

    @Autowired
    private ProcessoRepository repository;

    @GetMapping(path = "/")
    public List<Processo> listar(){
        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Processo getPorId(@PathVariable("id") Long id){
        var busca = repository.getOne(id);
        return Processo.converter(busca);
    }

    @GetMapping(path = "/codigo")
    public List<Processo> getPorCodigo(@RequestParam("codigo") String codigo){
        return this.repository.findByCodigoContains(codigo)
            .stream()
            .map(Processo::converter)
            .collect(Collectors.toList());
    }

    @GetMapping(path = "/filtro")
    public List<Processo> getProcessoPorNome(@RequestParam("nome") String nome){
        return this.repository.findByNomeContains(nome)
            .stream()
            .map(Processo::converter)
            .collect(Collectors.toList());
    }

    @PostMapping
    public Processo adicionar(@RequestBody Processo processo){
        return repository.save(processo);
    }
}