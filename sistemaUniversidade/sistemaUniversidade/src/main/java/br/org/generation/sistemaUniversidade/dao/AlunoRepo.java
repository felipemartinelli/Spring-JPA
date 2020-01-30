package br.org.generation.sistemaUniversidade.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaUniversidade.model.Aluno;

public interface AlunoRepo extends CrudRepository<Aluno, Integer>{

}
