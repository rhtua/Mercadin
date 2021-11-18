package com.company.Pessoas;

import com.company.Generico;

import java.util.List;
import java.util.Scanner;

import static com.company.Generico.Cabecalho;

public class Cadastro {

    public static void MenuCadastro( List<Pessoa> bancoPessoa){
        Scanner scanner = new Scanner(System.in);
        List<String> menu = List.of("0 - CADASTRO PESSOA", "1 - EXCLUIR PESSOA", "2 - LISTAR PESSOAS", "3 - VOLTAR" );

        boolean continuar = true;

        do{
            Generico.cls();

            switch (Generico.MenuBase(menu)) {
                case 0 -> CadastroPessoa(bancoPessoa, scanner);
                case 1 -> ExcluirPessoa(bancoPessoa, scanner);
                case 2 -> {
                    ListarPessoas(bancoPessoa);
                    System.out.println();
                    System.out.println("             PRESSIONE ENTER PARA CONTINUAR                    ");
                    scanner.nextLine();
                }
                case 3 -> continuar = false;
            }
        }
        while (continuar);
    }

    private static void CadastroPessoa(List<Pessoa> bancoPessoa, Scanner scanner){
        Generico.cls();
        Cabecalho();

        int posicao;
        String nome;
        String cpf;
        String senha;

        System.out.println();
        System.out.println("               0 - FUNCIONARIO                          ");
        System.out.println("               1 - CLIENTE                          ");
        System.out.println();
        posicao = scanner.nextInt();
        while(posicao > 1 || posicao < 0){
            System.out.println();
            System.out.println("                OPÇÃO INVÁLIDA, TENTE NOVAMENTE:               ");
            posicao = scanner.nextInt();
            System.out.println();
        }
        scanner.nextLine();
        System.out.println("                 NOME:                         ");
        System.out.println();
        nome = scanner.nextLine();
        System.out.println("                 CPF:                         ");
        System.out.println();
        cpf = scanner.nextLine();
        System.out.println("                 SENHA:                         ");
        System.out.println();
        senha = scanner.nextLine();

        Pessoa novaPessoa;

        if (posicao == 0) {
            novaPessoa = new Funcionario(bancoPessoa.size(), cpf, nome, senha);
        } else {
            novaPessoa = new Cliente(bancoPessoa.size(), cpf, nome, senha);
        }

        bancoPessoa.add(novaPessoa);


        Generico.cls();
        Cabecalho();

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

    private static void ListarPessoas( List<Pessoa> bancoPessoa){
        Generico.cls();
        Cabecalho();
        System.out.println();
        System.out.println();

        for (int i = 0; i < bancoPessoa.size(); i++){
            System.out.println(i + " - " + bancoPessoa.get(i).getNome() + "(" + bancoPessoa.get(i).getClass().getSimpleName() + ")");
        }
    }

    private static void ExcluirPessoa( List<Pessoa> bancoPessoa, Scanner scanner) {
        ListarPessoas( bancoPessoa);

        System.out.println();
        System.out.println("           DIGITE O NUMERO DO PRODUTO PARA EXCLUIR:               ");

        int excluir = scanner.nextInt();
        scanner.nextLine();

        while(bancoPessoa.size() < excluir + 1 ){
            System.out.println();
            System.out.println("                OPÇÃO INVÁLIDA, TENTE NOVAMENTE:               ");
            excluir = scanner.nextInt();
            scanner.nextLine();
        }

        bancoPessoa.remove(excluir);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                 PESSOA REMOVIDA!                    ");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            ////queria esperar
        }
    }
}
