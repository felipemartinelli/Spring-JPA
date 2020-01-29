package br.org.generation.vitrineVirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.vitrineVirtual.dao.ProdutoRepo;
import br.org.generation.vitrineVirtual.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService{
	
	@Autowired
	private ProdutoRepo repo;

	@Override
	public List<Produto> recuperarTodos() {
		return (List<Produto>)repo.findAll();
	}

	@Override
	public Produto recuperarPorId(int id) {
		return repo.findById(id).get();
	}

	
}
