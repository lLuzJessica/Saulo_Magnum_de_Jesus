package br.com.liax.model;

import java.util.List;

//@Entity
public class Disciplinas {
	// @Id
	private String codigo;
	// @NotNull
	private String disciplina;
	// @NotNull
	private String dataIniciio;
	private String dataFinal;
	// @NotNull
	private String ementa;
	private List<Alunos> alunos;

	public List<Alunos> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Alunos> alunos) {
		this.alunos = alunos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getDataIniciio() {
		return dataIniciio;
	}

	public void setDataIniciio(String dataIniciio) {
		this.dataIniciio = dataIniciio;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

}
