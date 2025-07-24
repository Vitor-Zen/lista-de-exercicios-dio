package br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.dominio;

public class AnalyseNumber extends ReceiveNumbers implements NumberChecker {
    public AnalyseNumber(int firstValue, int secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void sumValues() {
        System.out.println("Números iguais, resultado da soma: " + (firstValue + secondValue));
    }

    @Override
    public void comparateNumbers() {
        if (firstValue == secondValue) {
            sumValues();
        } else {
            System.out.println("Sem soma, números diferentes: " + firstValue + ", " + secondValue);
        }
    }


}
