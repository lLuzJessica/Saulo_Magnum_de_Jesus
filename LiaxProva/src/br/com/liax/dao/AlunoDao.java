package br.com.liax.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.liax.conexao.Conection;
import br.com.liax.model.Alunos;

public class AlunoDao {
	private Connection con = null;
	private PreparedStatement stmt = null;

	public void create(Alunos aluno) throws SQLException {

		con = new Conection().getConexao();
		String query = " insert into alunos (contrato,nome,pai,mae,idade,disciplinas) value (?,?,?,?,?,?)";
		stmt = con.prepareStatement(query);
		stmt.setString(1, aluno.getContrato());
		stmt.setString(2, aluno.getNome());
		stmt.setString(3, aluno.getPai());
		stmt.setString(4, aluno.getMae());
		stmt.setInt(5, aluno.getIdade());
		stmt.setObject(6, aluno.getDisciplinas());
		stmt.execute();
		stmt.close();
		con.close();
	}

	public Alunos getAlunos(int id) {
		try {
			con = new Conection().getConexao();
			String query = " select * from alunos where contrato = ?";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			stmt.close();
			con.close();
			return populaPessoa(rs);
		} catch (Exception e) {
			System.out.println("Erro ao pesquisar por id");
		}
		return null;
	}

	public void update(Alunos aluno) {
		
	}

	public void delete(Alunos aluno) {
		
	}

	private Alunos populaAlunos(ResultSet rs) throws SQLException {
		Alunos aluno = new Alunos();
		aluno.setContrato(rs.getString("contrato"));
		aluno.setNome(rs.getString("nome"));
		aluno.setPai(rs.getString("pai"));
		aluno.setMae(rs.getString("mae"));
		aluno.setIdade(rs.getInt("idade"));
		//aluno.setDisciplinas((rs.get);

		return aluno;

	}
}
