package br.org.generation.sistemaAlunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.sistemaAlunos.model.Aluno;
import br.org.generation.sistemaAlunos.servicos.IAlunoService;

@RestController
@CrossOrigin("*")
public class AlunosController {
	
	@Autowired
	private IAlunoService servico;
	
	
	@PostMapping("/aluno/novo")
	public ResponseEntity<Aluno> inserirNovoAluno(@RequestBody Aluno aluno) {
		try {
			servico.gravarAlunoNoBanco(aluno);
			return ResponseEntity.ok(aluno);
			
		}catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> buscarAlunoPeloId(@PathVariable int id){
			return null;
		
	}

	@PutMapping("/aluno/alterar")
	public ResponseEntity<Aluno> atualizarDados(@RequestBody Aluno aluno){
		return ResponseEntity.ok(aluno);
	}

}
