package com.pi3.petshop.dao;

import com.pi3.petshop.connect.ConnectionUtils;
import com.pi3.petshop.model.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;

public class CategoriaDao {
	public static void inserirCategoria(Categoria categoria) throws SQLException {

		String query = "INSERT INTO categoria (nome, descricao) VALUES (?,?)";

		long id_categoria = 0;

		try (Connection conn = ConnectionUtils.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

			stmt.setString(1, categoria.getNome());
			stmt.setString(2, categoria.getDescricao());

			stmt.executeUpdate();

			ResultSet generatedKeys = stmt.getGeneratedKeys();
			if (generatedKeys.next()) {
				id_categoria = (generatedKeys.getInt(1));
			}
		}
		categoria.setId(id_categoria);

		// return categoria;
	}
	
	
	public static Categoria obterCategoria(Long id) throws SQLException{
        Categoria categoria = new Categoria();
        
        String query = "SELECT * FROM categoria WHERE (id = ?)";
        
        try (Connection conn = ConnectionUtils.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setLong(1, id);
            
            try (ResultSet resultados = stmt.executeQuery()) {
                
                while(resultados.next()){
                    categoria.setId(resultados.getLong("id"));
                    categoria.setNome(resultados.getString("nome"));
                    categoria.setDescricao(resultados.getString("descricao"));
                }
            }
        }
        return categoria;
    }
}
