package br.com.liax.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
	private Connection con = null;

	public Connection getConexao() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/prova?user=root&password=root&useSSL=false&useTimezone=true&serverTimezone=UTC");

			System.out.println("Conectado");
			return con;
		} catch (Exception e) {
			System.out.println("não conectou");
			System.out.println("Erro : " + e);
		}
		return null;
	}

	public void close() throws SQLException {
		this.con.close();
	}

}
