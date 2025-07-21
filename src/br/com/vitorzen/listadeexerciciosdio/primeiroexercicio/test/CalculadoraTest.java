package br.com.vitorzen.listadeexerciciosdio.primeiroexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.primeiroexercicio.domain.CalculadoraSimples;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois valores para serem somados");

        double valor1 = scanner.nextDouble();
        double valor2 = scanner.nextDouble();

        double resultado = calculadoraSimples.soma(valor1, valor2);

        System.out.println("Digite um terceiro valor para ser comparado com o resultado da soma");
        double valor3 = scanner.nextDouble();

        calculadoraSimples.resultadoFinal(resultado, valor3);

        scanner.close();
    }
}
