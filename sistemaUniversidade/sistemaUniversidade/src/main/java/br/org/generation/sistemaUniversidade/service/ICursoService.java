package br.org.generation.sistemaUniversidade.service;

import java.util.List;

import br.org.generation.sistemaUniversidade.model.Curso;

public interface ICursoService {
	
	public void adicionarNovoCurso(Curso curso);
	public Curso recuperarDetalhes(int id);
	public List<Curso> recuperarTodos();

}
