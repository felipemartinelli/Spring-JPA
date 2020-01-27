package br.org.generation.sistemaAlunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaAlunos.model.Aluno;

public interface IAlunoBD extends CrudRepository<Aluno, Integer>{

}
