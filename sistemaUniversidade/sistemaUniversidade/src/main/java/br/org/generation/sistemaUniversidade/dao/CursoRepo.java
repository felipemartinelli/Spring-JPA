package br.org.generation.sistemaUniversidade.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaUniversidade.model.Curso;

public interface CursoRepo extends CrudRepository<Curso, Integer> { 

}
