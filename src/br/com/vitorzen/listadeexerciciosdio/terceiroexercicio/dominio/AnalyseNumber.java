package br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.dominio;

public class AnalyseNumber extends ReceiveNumbers implements NumberChecker {
    private int result;

    public AnalyseNumber(int firstValue, int secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void comparateNumbers() {
        if (firstValue == secondValue) {
            System.out.println("Números iguais, resultado da soma: " + sumValues());
        } else {
            System.out.println("Número diferentes, resultado da multiplicação: " + multiplyValues());
        }
    }

    @Override
    public int sumValues() {
        return result = firstValue + secondValue;
    }

    @Override
    public int multiplyValues() {
        return result = firstValue * secondValue;
    }
}
