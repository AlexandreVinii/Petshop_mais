package com.pi3.petshop.model;

public class Produto {
	private String nome;
	private double valor;
    private String peso;
    private String descricao;
    private Categoria categoria;
    private long id;
    
    public Produto(String nome, String descricao, String peso, Double valor, Categoria categoria) {
		// TODO Auto-generated constructor stub
    	this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return this.id;
    }

}
