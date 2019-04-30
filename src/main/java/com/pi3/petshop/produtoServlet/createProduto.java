package com.pi3.petshop.produtoServlet;

import com.pi3.petshop.model.Produto;
import com.pi3.petshop.model.Categoria;
import com.pi3.petshop.dao.ProdutoDao;
import com.pi3.petshop.dao.CategoriaDao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */

@WebServlet(name = "create_produto", urlPatterns = { "/create_produto" })
public class createProduto extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public createProduto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/create_produto.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Double valor = null;
		try {
			valor = Double.parseDouble(request.getParameter("valor"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String peso = request.getParameter("peso");

		Long idCategoria = Long.parseLong(request.getParameter("categoria"));

		Categoria categoria = new Categoria();

		String message = "";
		try {
			categoria = CategoriaDao.obterCategoria(idCategoria);
		} catch (SQLException ex) {
			Logger.getLogger(createProduto.class.getName()).log(Level.SEVERE, null, ex);
			message = "Falha ao localizar categoria selecionada";
		}

		Produto produto = new Produto(nome, descricao, peso, valor, categoria);
		try {
			ProdutoDao.inserirProduto(produto);

			message = "Produto cadastrado com sucesso";
		} catch (SQLException ex) {
			Logger.getLogger(createProduto.class.getName()).log(Level.SEVERE, null, ex);
			message = "Falha ao cadastrar Produto";
		}

		// Armazena uma mensagem com o que ocorreu no ultimo evento
		// em uma Session HTTP
		HttpSession session = request.getSession();
		session.setAttribute("message", message);

		response.sendRedirect(request.getContextPath() + "/create_produto");
	}

}
