package com.api.trabalho_final.controller;

import com.api.trabalho_final.model.Tarefa;
import com.api.trabalho_final.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public ResponseEntity<List<Tarefa>> listarTodasTarefas() {
        List<Tarefa> tarefas = tarefaService.listarTodas();
        return ResponseEntity.ok(tarefas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> obterTarefaPorId(@PathVariable Long id) {
        Optional<Tarefa> tarefa = tarefaService.obterPorId(id);
        return tarefa.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa) {
        Tarefa tarefaSalva = tarefaService.salvar(tarefa);
        return ResponseEntity.ok(tarefaSalva);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        Optional<Tarefa> tarefaExistente = tarefaService.obterPorId(id);
        if (tarefaExistente.isPresent()) {
            tarefa.setId(id);
            Tarefa tarefaAtualizada = tarefaService.salvar(tarefa);
            return ResponseEntity.ok(tarefaAtualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable Long id) {
        Optional<Tarefa> tarefaExistente = tarefaService.obterPorId(id);
        if (tarefaExistente.isPresent()) {
            tarefaService.deletar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
