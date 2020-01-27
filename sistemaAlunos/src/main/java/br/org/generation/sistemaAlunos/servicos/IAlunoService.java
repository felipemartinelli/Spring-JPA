package br.org.generation.sistemaAlunos.servicos;

import br.org.generation.sistemaAlunos.model.Aluno;

public interface IAlunoService {
	
	public void gravarAlunoNoBanco(Aluno aluno);
	public void atualizarAlunoNoBanco(Aluno aluno);
	public Aluno recuperarAlunoPorId(int id);

}
