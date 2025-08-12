package br.com.vitorzen.listadeexerciciosdio.vigesimosegundoexercicio.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int firstValue = sc.nextInt();

        System.out.println("Digite o segundo valor");
        int secondValue = sc.nextInt();

        int quociente = firstValue / secondValue;
        int resto = firstValue % secondValue;

        System.out.println("Quociente do primeiro valor pelo segundo valor: " + quociente);
        System.out.println("Resto do primeiro valor pelo segundo valor: " + resto);
    }
}
