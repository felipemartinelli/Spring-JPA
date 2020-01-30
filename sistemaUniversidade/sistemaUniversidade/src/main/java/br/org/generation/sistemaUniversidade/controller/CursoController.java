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

import br.org.generation.sistemaUniversidade.model.Curso;
import br.org.generation.sistemaUniversidade.service.ICursoService;

@RestController
@CrossOrigin("*")
public class CursoController {
	
	@Autowired
	private ICursoService servico;
	
	@PostMapping("/cursos/novo")
	public ResponseEntity<Curso> incluirNovo(@RequestBody Curso curso){
	servico.adicionarNovoCurso(curso);
	return ResponseEntity.ok(curso);
	}
	
	@GetMapping("/cursos")
	public ResponseEntity<List<Curso>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
		
	}
	
	@GetMapping("/cursos/{id}")
	public ResponseEntity<Curso> mostrarPeloId(@PathVariable int id){
		Curso c = servico.recuperarDetalhes(id);
		if(c != null) {
			return ResponseEntity.ok(c);
		}
		return ResponseEntity.notFound().build();
	}

}
