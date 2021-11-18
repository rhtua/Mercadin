package com.company.Pessoas;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String senha;

    public Pessoa(int id, String nome, String cpf, String senha){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public int getID(){
        return this.id;
    }


    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSenha(String senha){ this.senha = senha; }

    public void setId(int id){
        this.id = id;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

}
