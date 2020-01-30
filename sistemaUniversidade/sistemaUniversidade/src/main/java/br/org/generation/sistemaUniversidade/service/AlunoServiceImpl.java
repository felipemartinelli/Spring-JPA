package br.org.generation.sistemaUniversidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaUniversidade.dao.AlunoRepo;
import br.org.generation.sistemaUniversidade.model.Aluno;

@Component
public class AlunoServiceImpl implements IAlunoService{
	
	@Autowired
	AlunoRepo repo;

	@Override
	public List<Aluno> recuperarTodos() {
		return (List<Aluno>)repo.findAll();
	}

	@Override
	public Aluno recuperarPorId(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void novoAluno(Aluno aluno) {
		repo.save(aluno);
	}
	
	
	
	

}
