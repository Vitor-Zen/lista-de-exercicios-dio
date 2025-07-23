package br.com.vitorzen.listadeexerciciosdio.segundoexercicio.dominio;

public class AnalyseNumber extends ReceiveNumber implements NumberChecker {
    public AnalyseNumber(double number) {
        super(number);
    }

    @Override
    public void analyseNumber() {
        System.out.println("############# RESULTADO DO NÚMERO ANALISADO #############");
        checkEvenOrOdd();
        positiveNegativeChecker();
    }

    @Override
    public void checkEvenOrOdd() {
        if (number % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
    }

    @Override
    public void positiveNegativeChecker() {
        if (number >= 0) {
            System.out.println("Número positivo: " + (int) getNumber());
        } else {
            System.out.println("Número negativo " + (int) getNumber());
        }
    }
}
