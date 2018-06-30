package br.com.liax.main;

import java.sql.SQLException;

import br.com.liax.conexao.Conection;

public class Main {

	public static void main(String[] args) throws SQLException {
		Conection con = new Conection();
		con.getConexao();
		con.close();

	}

}
