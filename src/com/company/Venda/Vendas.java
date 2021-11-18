package com.company.Venda;

import com.company.Generico;
import com.company.Produto.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendas {

    public static void MenuVenda( List<Venda> bancoVendas, List<Produto> bancoProduto){
        Scanner scanner = new Scanner(System.in);
        List<String> menu = List.of("0 - INSERIR PRODUTO", "1 - GRAVAR VENDA", "2 - CANCELAR VENDA", "3 - LISTAR VENDAS", "4 - VOLTAR" );
        List<Produto> produtosVendidos = new ArrayList<>();
        boolean continuar = true;

        do{
            Generico.cls();

            switch (Generico.MenuBase(menu)) {
                case 0: VenderProduto(bancoProduto, scanner, produtosVendidos); break;
                case 1:  {
                    GravarVenda(bancoVendas, produtosVendidos);
                    break;
                }
                case 2: return;
                case 3: {
                    ListarVendas( bancoVendas);
                    System.out.println();
                    System.out.println("             PRESSIONE ENTER PARA CONTINUAR                    ");
                    scanner.nextLine();
                    break;
                }
                case 4: continuar = false; break;
            }
        }
        while (continuar);
    }

    private static void VenderProduto( List<Produto> bancoProduto, Scanner scanner, List<Produto> produtosVendidos){
        Generico.cls();
        Generico.Cabecalho();

        int produto;

        System.out.println();
        System.out.println("                CODIGO DO PRODUTO:                          ");
        System.out.println();
        produto = scanner.nextInt();
        scanner.nextLine();

        int finalProduto = produto;
        var buscaProduto = bancoProduto.stream().filter(x -> x.getcodigo() == finalProduto).toList();

        while(buscaProduto.isEmpty()){
            System.out.println();
            System.out.println("                PRODUTO INVÁLIDO, TENTE NOVAMENTE:               ");
            produto = scanner.nextInt();
            scanner.nextLine();
            buscaProduto = bancoProduto.stream().filter(x -> x.getcodigo() == finalProduto).toList();
        }

        produtosVendidos.add(buscaProduto.get(0));

        Generico.cls();
        Generico.Cabecalho();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                  CADASTRADO!                    ");

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            ////queria esperar
        }

    }

    private static void ListarVendas( List<Venda> baseVendas){
        Generico.cls();
        Generico.Cabecalho();
        System.out.println();
        System.out.println();
        
        for (int i = 0; i < baseVendas.size(); i++){
            System.out.println("Venda " + i);
        }
    }

    public static void GravarVenda(List<Venda> bancoVenda, List<Produto> produtosVendidos){
        bancoVenda.add(new Venda(produtosVendidos, produtosVendidos.stream().map(x -> x.getpreco()).reduce(0.0, (subtotal, elemento) -> subtotal + elemento)));
    }
}
