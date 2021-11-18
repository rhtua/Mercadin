package com.company;
import com.company.Pessoas.Admin;
import com.company.Pessoas.Cadastro;
import com.company.Pessoas.Pessoa;
import com.company.Produto.ControleEstoque;
import com.company.Produto.Produto;
import com.company.Venda.Venda;
import com.company.Venda.Vendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Generico base = new Generico();
    static ControleEstoque controleEstoque = new ControleEstoque();
    static Cadastro cadastro = new Cadastro();
    static Vendas vendas = new Vendas();

    public static void main(String[] args) {

        List<Pessoa> bancoPessoa = new ArrayList<>();
        List<Produto> bancoProduto = new ArrayList<>();
        List<Venda> bancoVendas = new ArrayList<>();

        Admin adminPrincipal = new Admin(1, "Joao", "123", "123");
        bancoPessoa.add(adminPrincipal);

        Login(bancoPessoa);

        var opcaoMenu = MenuPrincipal();

        switch (opcaoMenu) {
            case 0 -> Vendas.MenuVenda( bancoVendas, bancoProduto);
            case 1 -> {
                ControleEstoque.MenuControleEstoque( bancoProduto);
            }
            case 2 -> Cadastro.MenuCadastro( bancoPessoa);
        }
    }

    public static int MenuPrincipal(){
        List<String> menu = List.of("0 - VENDA", "1 - CONTROLE DE ESTOQUE", "2 - CADASTRO" );
        Generico.cls();
        return Generico.MenuBase(menu);
    }


    public static void Login( List<Pessoa> bancoPessoa){
        Scanner scanner = new Scanner(System.in);

        var usuarioLogin = "";
        var senhaLogin = "";
        var userExists = false;
        do {
            Generico.Cabecalho();
            System.out.println(); if(!usuarioLogin.equals(""))
                System.out.println("      USUÁRIO OU SENHA INVÁLIDOS. TENTE NOVAMENTE");
            System.out.println("                       USUÁRIO:                          ");
            System.out.println();
            usuarioLogin = scanner.nextLine();
            System.out.println("                        SENHA:                          ");
            senhaLogin = scanner.nextLine();

            userExists = bancoPessoa.get(0).getCpf().equals(usuarioLogin) && bancoPessoa.get(0).getSenha().equals(senhaLogin);

        }while (!userExists);
    }

}
