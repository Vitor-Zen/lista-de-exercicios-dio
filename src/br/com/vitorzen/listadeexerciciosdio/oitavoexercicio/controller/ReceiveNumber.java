package br.com.vitorzen.listadeexerciciosdio.oitavoexercicio.controller;

import java.util.Scanner;

public class ReceiveNumber {
    protected int[] receivedNumbers;

    public ReceiveNumber() {
        this.receivedNumbers = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < receivedNumbers.length; i++) {
            System.out.println("Digite o " + (i + 1)  + " número aleatório");
            this.receivedNumbers[i] = sc.nextInt();
        }
    }
}
