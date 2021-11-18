package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generico {

    public static int MenuBase(List<String> opcoes){

        cls();
        Scanner scanner = new Scanner(System.in);
        boolean opcaoValida = false;
        String opcao = "";
        List<String> opcoesValidas = new ArrayList<>();

        do {
            if(!opcao.equals(""))
                cls();
            Cabecalho();
            for (String opt: opcoes
            ) {
                opcoesValidas.add(Character.toString(opt.charAt(0)));
                System.out.println("                 " + opt);
            }

            System.out.println();

            if(!opcao.equals("")) {
                System.out.println("                OPÇÃO INVÁLIDA                        ");
                System.out.println();
            }


            opcao = scanner.next();

            if (opcoesValidas.contains(opcao)) {
                opcaoValida = true;
            }

        }while (!opcaoValida);

        return Integer.parseInt(opcao);
    }


    public static void cls(){
        for(int i = 0; i < 100; i++){
            System.out.println();
        }
    }

    public static void Cabecalho(){
        System.out.println("█▀▄▀█ ░▀░ █▀▀▄ ░▀░ 　 █▀▄▀█ █▀▀ █▀▀█ █▀▀ █▀▀█ █▀▀▄ █▀▀█");
        System.out.println("█░▀░█ ▀█▀ █░░█ ▀█▀ 　 █░▀░█ █▀▀ █▄▄▀ █░░ █▄▄█ █░░█ █░░█");
        System.out.println("▀░░░▀ ▀▀▀ ▀░░▀ ▀▀▀ 　 ▀░░░▀ ▀▀▀ ▀░▀▀ ▀▀▀ ▀░░▀ ▀▀▀░ ▀▀▀▀");
        System.out.println();
        System.out.println("▒█▀▀▀ ▒█▀▀▀ ▒█░░░ ▀█▀ ▒█▀▀█ ▀█▀ ▒█▀▀▄ ░█▀▀█ ▒█▀▀▄ ▒█▀▀▀ ");
        System.out.println("▒█▀▀▀ ▒█▀▀▀ ▒█░░░ ▒█░ ▒█░░░ ▒█░ ▒█░▒█ ▒█▄▄█ ▒█░▒█ ▒█▀▀▀");
        System.out.println("▒█░░░ ▒█▄▄▄ ▒█▄▄█ ▄█▄ ▒█▄▄█ ▄█▄ ▒█▄▄▀ ▒█░▒█ ▒█▄▄▀ ▒█▄▄▄");
        System.out.println();
        System.out.println("#######################################################");
        System.out.println();
        System.out.println();
    }

}
