package br.org.generation.sistemaAlunos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaAlunos.dao.IAlunoBD;
import br.org.generation.sistemaAlunos.model.Aluno;

@Component
public class ServicosAlunos implements IAlunoService {

	@Autowired
	IAlunoBD repo;

	public void gravarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao inserir novo aluno!");
		}
	}

	public void atualizarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao atualizar aluno!");
		}
	}

	public Aluno recuperarAlunoPorId(int id) {
		return repo.findById(id).get();

	}

}
