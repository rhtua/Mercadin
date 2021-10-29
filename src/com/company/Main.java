package com.company;

import com.company.Pessoas.Admin;
import com.company.Pessoas.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> bancoPessoa = new ArrayList<Pessoa>();
        Admin adminPrincipal = new Admin(1, "Joao", "123", "123");

        bancoPessoa.add(adminPrincipal);

        var usuarioLogin = "";
        var senhaLogin = "";

        System.out.println("█▀▄▀█ ░▀░ █▀▀▄ ░▀░ 　 █▀▄▀█ █▀▀ █▀▀█ █▀▀ █▀▀█ █▀▀▄ █▀▀█");
        System.out.println("█░▀░█ ▀█▀ █░░█ ▀█▀ 　 █░▀░█ █▀▀ █▄▄▀ █░░ █▄▄█ █░░█ █░░█");
        System.out.println("▀░░░▀ ▀▀▀ ▀░░▀ ▀▀▀ 　 ▀░░░▀ ▀▀▀ ▀░▀▀ ▀▀▀ ▀░░▀ ▀▀▀░ ▀▀▀▀");
        System.out.println();
        System.out.println("▒█▀▀▀ ▒█▀▀▀ ▒█░░░ ▀█▀ ▒█▀▀█ ▀█▀ ▒█▀▀▄ ░█▀▀█ ▒█▀▀▄ ▒█▀▀▀ ");
        System.out.println("▒█▀▀▀ ▒█▀▀▀ ▒█░░░ ▒█░ ▒█░░░ ▒█░ ▒█░▒█ ▒█▄▄█ ▒█░▒█ ▒█▀▀▀");
        System.out.println("▒█░░░ ▒█▄▄▄ ▒█▄▄█ ▄█▄ ▒█▄▄█ ▄█▄ ▒█▄▄▀ ▒█░▒█ ▒█▄▄▀ ▒█▄▄▄");
        System.out.println();
        System.out.println("                        LOGIN                          ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                       USUÁRIO:                          ");
        System.out.println();
        usuarioLogin = scanner.nextLine();
        System.out.println("                        SENHA:                          ");
        senhaLogin = scanner.nextLine();

        var userExists = false;

        for(int i = 0; i < bancoPessoa.size(); i++){
            var pessoa = bancoPessoa.get(i);
            if(pessoa.getCpf().equals(usuarioLogin)  && pessoa.getSenha().equals(senhaLogin))
                userExists = true;
        }

        if(userExists){
            System.out.println("USUARIO LOGADO");
        }else
        {
            System.out.println("USUARIO NÃO EXISTE");
        }



    }
}
