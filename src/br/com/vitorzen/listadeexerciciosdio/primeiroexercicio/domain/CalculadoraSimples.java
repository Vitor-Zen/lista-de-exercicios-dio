package br.com.vitorzen.listadeexerciciosdio.primeiroexercicio.domain;

public class CalculadoraSimples implements Calculadora {
    @Override
    public double soma(double a, double b) {
        return a + b;
    }

    @Override
    public boolean resultadoFinal(double soma, double valorComparacao) {
        if (soma > valorComparacao) {
            System.out.println("Valor da soma maior que o valor comparado.");
            return true;
        } else {
            System.out.println("Valor da soma menor do que o valor comparado.");
            return false;
        }
    }
}
