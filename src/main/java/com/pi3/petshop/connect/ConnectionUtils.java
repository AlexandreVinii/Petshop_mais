/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi3.petshop.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtils {
	// Armazena o objeto de conexão
	private static Connection connection = null;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	// Obtém uma conexão com o banco de dados
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(DRIVER);
		// Só tenta abrir uma conexão se esta já não
		// existir ou estiver fechada
		if (connection == null || connection.isClosed()) {

			// Declaração de endereço de conexão com o banco de dados
			String dbUrl = "jdbc:mysql://localhost:3306/petshop_database?user=root";

			// Propriedades para armazenamento do usuário e da senh a do banco
			Properties properties = new Properties();
//                   properties.put("user", "root");
			properties.put("password", "alexandre22");

			// Realiza a conexão com o banco
			connection = DriverManager.getConnection(dbUrl, properties);
		}

		// Retorna a conexão a quem chamou
		return connection;
	}

//	public static void main(String[] args) {
//		String USERNAME = "root";
//		String PASSWORD = "alexandre22";
//		String url = "jdbc:mysql://localhost:3306/petshop_database?user=root";
//
//
//		try {
//			
//			connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
//			System.out.println("Connected");
//		} catch (SQLException e) {
//			System.err.println(e);
//		}
//	}
}