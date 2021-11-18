package com.company.Produto;

import java.util.List;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getnome() { return this.nome; }

    public void setnome(String nome) { this.nome = nome; }

    public double getpreco() { return this.preco; }

    public void setpreco(double preco) { this.preco = preco; }

    public int getcodigo() {  return this.codigo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }
}


