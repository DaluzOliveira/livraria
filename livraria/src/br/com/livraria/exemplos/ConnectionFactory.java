package br.com.livraria.exemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/livraria","postgres",
				"gle102030");
	}
	
}
