package com.pi3.petshop.dao;

import com.pi3.petshop.connect.ConnectionUtils;
//import com.pi3.petshop.model.Categoria;
import com.pi3.petshop.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;

public class ProdutoDao {

	public static void inserirProduto(Produto produto) throws SQLException {

		long id_produto = 0;

		String query = "INSERT INTO produto (nome,valor,descricao,peso)"
				+ " VALUES (?,?,?,?)";

		try (Connection conn = ConnectionUtils.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getValor());
			stmt.setString(3, produto.getDescricao());
			stmt.setString(4, produto.getPeso());
			stmt.setLong(5, produto.getCategoria().getId());

			stmt.executeUpdate();

			ResultSet generatedKeys = stmt.getGeneratedKeys();
			if (generatedKeys.next()) {
				id_produto = (generatedKeys.getInt(1));
			}

			produto.setId(id_produto);
		}
	}
}
