package br.org.generation.sistemaUniversidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.sistemaUniversidade.model.Aluno;
import br.org.generation.sistemaUniversidade.service.IAlunoService;

@RestController
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private IAlunoService servico;
	
	@GetMapping("/alunos")
	public ResponseEntity<List<Aluno>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
		
	}
	
	@GetMapping("/alunos/{id}")
	public ResponseEntity<Aluno> mostrarPeloId(@PathVariable int id){
		Aluno a = servico.recuperarPorId(id);
		if(a != null) {
			return ResponseEntity.ok(a);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/alunos/novo")
	public ResponseEntity<Aluno> novoProduto(@RequestBody Aluno aluno){
		servico.novoAluno(aluno);
		return ResponseEntity.ok(aluno);
	}
	
	

}
