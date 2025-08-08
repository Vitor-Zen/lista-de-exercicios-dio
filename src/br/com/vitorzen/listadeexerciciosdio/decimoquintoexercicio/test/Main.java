package br.com.vitorzen.listadeexerciciosdio.decimoquintoexercicio.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia de nascimento: ");
        int diaNasc = scanner.nextInt();

        System.out.print("Digite o mês de nascimento: ");
        int mesNasc = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNasc = scanner.nextInt();

        System.out.print("Digite o dia atual: ");
        int diaAtual = scanner.nextInt();

        System.out.print("Digite o mês atual: ");
        int mesAtual = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int diasNascimento = (anoNasc * 365) + (mesNasc * 30) + diaNasc;
        int diasHoje = (anoAtual * 365) + (mesAtual * 30) + diaAtual;

        int totalDias = diasHoje - diasNascimento;

        int anos = totalDias / 365;
        int meses = (totalDias % 365) / 30;
        int dias = (totalDias % 365) % 30;

        System.out.printf("Você viveu aproximadamente %d anos, %d meses e %d dias.\n", anos, meses, dias);

        scanner.close();
    }
}
