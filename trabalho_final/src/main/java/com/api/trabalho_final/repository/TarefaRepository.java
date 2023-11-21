package com.api.trabalho_final.repository;

import com.api.trabalho_final.model.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TarefaRepository {

    List<Tarefa> findAll();

    Optional<Tarefa> findById(Long id);

    Tarefa save(Tarefa tarefa);

    void deleteById(Long id);
}
