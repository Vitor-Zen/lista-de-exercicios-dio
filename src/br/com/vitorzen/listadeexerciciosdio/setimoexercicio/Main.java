package br.com.vitorzen.listadeexerciciosdio.setimoexercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Digite true ou falso para a comparação");
        boolean firstValue = value.nextBoolean();

        System.out.println("Digite true ou falso para a comparação");
        boolean secondValue = value.nextBoolean();

        if (firstValue && secondValue){
            System.out.println("Ambos os valores são verdadeiros");
        } else if (!firstValue && !secondValue) {
            System.out.println("Ambos os valores são falsos");
        } else {
            System.out.println("Os valores são diferentes");
        }
    }
}
