package com.api.trabalho_final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.api.trabalho_final")
public class TrabalhoFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoFinalApplication.class, args);
	}

}


/*  === COMANDOS PARA TEST ===

Listar todas as tarefas:
> curl http://localhost:8080/tarefas

Obter uma tarefa por ID:
> curl http://localhost:8080/tarefas/1

Criar uma nova tarefa:
> curl -X POST -H "Content-Type: application/json" -d '{"descricao": "Minha nova tarefa"}' http://localhost:8080/tarefas

Atualizar uma tarefa existente:
> curl -X PUT -H "Content-Type: application/json" -d '{"id": 1, "descricao": "Tarefa atualizada"}' http://localhost:8080/tarefas/1

Excluir uma tarefa por ID:
> curl -X DELETE http://localhost:8080/tarefas/1

***** */