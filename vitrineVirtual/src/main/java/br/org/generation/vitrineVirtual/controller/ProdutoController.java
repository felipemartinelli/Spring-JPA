package br.org.generation.vitrineVirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.vitrineVirtual.model.Produto;
import br.org.generation.vitrineVirtual.services.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private IProdutoService servico;
	
	@GetMapping("/produto")
	public ResponseEntity<List<Produto>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
		
	}
	
	@GetMapping("/produto/{id}")
	public ResponseEntity<Produto> mostrarPeloId(@PathVariable int id){
		Produto p = servico.recuperarPorId(id);
		if(p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	

}
