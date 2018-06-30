package br.com.liax.model;

import java.util.ArrayList;
import java.util.List;

//@Entity
public class Alunos {
	//@Id
	private String contrato;
	//@NotNull
	private String nome;
	private String pai;
	//@NotNull
	private String mae;
	//@NotNull
	private int idade;
    
	private List<Disciplinas> disciplinas;
	
	

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
