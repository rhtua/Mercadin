package com.company.Venda;
import com.company.Produto.Produto;
import java.util.List;

public class Venda {

    private List<Produto> produtos;
    private double valorTotal;

    public Venda(List<Produto> produtos, double valorTotal) {

        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}


