package com.api.trabalho_final.repository;

import com.api.trabalho_final.model.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TarefaRepositoryImpl implements TarefaRepository {

    private final List<Tarefa> tarefas = new ArrayList<>();

    @Override
    public List<Tarefa> findAll() {
        return tarefas;
    }

    @Override
    public Optional<Tarefa> findById(Long id) {
        return tarefas.stream()
                .filter(tarefa -> tarefa.getId().equals(id))
                .findFirst();
    }

    @Override
    public Tarefa save(Tarefa tarefa) {
        if (tarefa.getId() == null) {
            tarefa.setId(generateId());
            tarefas.add(tarefa);
        } else {
            int index = indexOf(tarefa.getId());
            if (index != -1) {
                tarefas.set(index, tarefa);
            }
        }
        return tarefa;
    }

    @Override
    public void deleteById(Long id) {
        int index = indexOf(id);
        if (index != -1) {
            tarefas.remove(index);
        }
    }

    private Long generateId() {
        return tarefas.isEmpty() ? 1L : tarefas.get(tarefas.size() - 1).getId() + 1;
    }

    private int indexOf(Long id) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
