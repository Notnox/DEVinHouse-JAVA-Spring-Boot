package br.com.devinhouse.demoapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.devinhouse.demoapi.model.Processo;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {
    

    List<Processo> findByNomeContains(String nome);
    List<Processo> findByCodigoContains(String codigo);
}
