package com.company;  //caminho do arquivo

import java.util.Scanner;
public class Main {  //classe
    public static void main(String[] args)  //método(ação)
    {
        System.out.println("Olá Mundo!! ");   //comando do sistema //saída do sistema //imprimir saída do sistema
        System.out.println("ESTE É O MEU PRIMEIRO CÓDIGO EM JAVA!!!");

        String olaMundo = "Olá mundo, esta mensagem está dentro da variável.";
        System.out.println(olaMundo);  //imprimir variável  //sout

        String nome = "Dryelle";
        String sobrenome = "Ebelin";
        System.out.println(nome);
        System.out.println(sobrenome);

        System.out.println(nome + " " + sobrenome);  //concatenação
        System.out.println(18);
        System.out.println(2022 - 2004);
        System.out.println(3 * 5);

        int x = 5;
        int y = 7;
        System.out.println(x + y);

        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);

        int f, e, d;
        f = e = d = 50;
        System.out.println(f + e + d);

        String retornoMetodo = buscarSobrenome();
        System.out.println(retornoMetodo);

        String retornoMetodo2 = inserirNome();
        System.out.println(retornoMetodo2);
    }

    //tipo de acesso: (public ou private) (tipo de retorno) (nome do método) (parâmetros)
    public static String buscarSobrenome(String nome)  //parâmetro
    {
        String sobrenome = "Ebelin";
        return sobrenome;
    }

    public static String inserirNome()
    {
        Scanner ler = new Scanner(System.in);  //variável de leitura, interação com o usuário
        System.out.printf("Digite seu nome: ");
        String nome = ler.next();
        System.out.printf("Digite seu sobrenome: ");
        String sobrenome = ler.next();

        System.out.println(nome + " " + sobrenome);

        String nomeCompleto = nome + " " + sobrenome;

        return nomeCompleto;
    }
}
