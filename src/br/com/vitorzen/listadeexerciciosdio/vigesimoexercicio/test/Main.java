package br.com.vitorzen.listadeexerciciosdio.vigesimoexercicio.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para ver sua tabuada até o 10 elemento");
        int valor = sc.nextInt();

        // Limpa console
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.println("Tabuada do " + valor);
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(valor * i);
        }
    }
}
