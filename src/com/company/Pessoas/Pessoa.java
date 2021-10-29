package com.company.Pessoas;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String cpf;

    public Pessoa(int id, String nome, String obs){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
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

    public void setPessoa(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

}
