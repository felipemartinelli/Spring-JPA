package br.org.generation.sistemaUniversidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaUniversidade.dao.CursoRepo;
import br.org.generation.sistemaUniversidade.model.Curso;

@Component
public class CursoServiceImpl implements ICursoService {
	
	@Autowired
	CursoRepo repo;

	@Override
	public void adicionarNovoCurso(Curso curso) {
		repo.save(curso);
		
	}

	@Override
	public Curso recuperarDetalhes(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Curso> recuperarTodos() {
		return (List<Curso>)repo.findAll();
	}

}
