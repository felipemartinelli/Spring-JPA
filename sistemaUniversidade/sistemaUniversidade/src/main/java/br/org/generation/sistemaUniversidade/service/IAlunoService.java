package br.org.generation.sistemaUniversidade.service;

import java.util.List;

import br.org.generation.sistemaUniversidade.model.Aluno;

public interface IAlunoService {
	
	public List<Aluno> recuperarTodos();
	public Aluno recuperarPorId(int id);
	public void novoAluno(Aluno aluno);

}
