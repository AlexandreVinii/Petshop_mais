package com.pi3.petshop.model;

public class Categoria {
    
    private long id; 
    private String nome;
    private String descricao;

    public void setId(long id) {
        this.id = id;
    }
    

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
