package com.company.Produto;

import com.company.Generico;

import java.util.List;
import java.util.Scanner;

public class ControleEstoque {

    public static void MenuControleEstoque( List<Produto> bancoProduto){
        Scanner scanner = new Scanner(System.in);
        List<String> menu = List.of("0 - CADASTRO PRODUTO", "1 - EXCLUIR PRODUTO", "2 - LISTAR PRODUTOS", "3 - VOLTAR" );

        boolean continuar = true;

        do{
            Generico.cls();

            switch (Generico.MenuBase(menu)) {
                case 0 -> CadastroProduto( bancoProduto, scanner);
                case 1 -> {
                    ExcluirProduto( bancoProduto, scanner);
                }
                case 2 -> {
                    ListarProdutos( bancoProduto);
                    System.out.println();
                    System.out.println("             PRESSIONE ENTER PARA CONTINUAR                    ");
                    scanner.nextLine();
                }
                case 3 -> continuar = false;
            }
        }
        while (continuar);
    }

    private static void CadastroProduto( List<Produto> bancoProduto, Scanner scanner){
        Generico.cls();
        Generico.Cabecalho();

        String novoNome;
        int novoCodigo;

        System.out.println();
        System.out.println("                       NOME:                          ");
        System.out.println();
        novoNome = scanner.nextLine();
        System.out.println("                      CODIGO:                          ");
        novoCodigo = scanner.nextInt();
        System.out.println("                       PREÇO:                          ");
        double novoPreço = scanner.nextDouble();
        scanner.nextLine();

        var novoProduto = new Produto(novoCodigo, novoNome, novoPreço);
        bancoProduto.add(novoProduto);

        Generico.cls();
        Generico.Cabecalho();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                 CADASTRO REALIZADO!                    ");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            ////queria esperar
        }

    }

    private static void ListarProdutos(List<Produto> baseProduto){

        Generico.cls();
        Generico.Cabecalho();
        System.out.println();
        System.out.println();

        for (int i = 0; i < baseProduto.size(); i++){
            System.out.println(i + " - " + baseProduto.get(i).getnome());
        }
    }

    private static void ExcluirProduto( List<Produto> baseProduto, Scanner scanner) {
        ListarProdutos( baseProduto);

        System.out.println();
        System.out.println("           DIGITE O NUMERO DO PRODUTO PARA EXCLUIR:               ");

        int excluir = scanner.nextInt();
        scanner.nextLine();

        while(baseProduto.size() < excluir + 1 ){
            System.out.println();
            System.out.println("                OPÇÃO INVÁLIDA, TENTE NOVAMENTE:               ");
            excluir = scanner.nextInt();
            scanner.nextLine();
        }

        baseProduto.remove(excluir);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                 PRODUTO REMOVIDO!                    ");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            ////queria esperar
        }
    }
}
