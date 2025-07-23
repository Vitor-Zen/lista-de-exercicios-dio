package br.com.vitorzen.listadeexerciciosdio.segundoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.segundoexercicio.dominio.AnalyseNumber;
import br.com.vitorzen.listadeexerciciosdio.segundoexercicio.dominio.NumberChecker;

public class NumberAnalyseService implements NumberChecker {
    private final AnalyseNumber analyseNumber;

    public NumberAnalyseService(AnalyseNumber analyseNumber) {
        this.analyseNumber = analyseNumber;
    }

    @Override
    public void analyseNumber() {
        analyseNumber.analyseNumber();
    }

    @Override
    public void checkEvenOrOdd() {
        analyseNumber.checkEvenOrOdd();
    }

    @Override
    public void positiveNegativeChecker() {
        analyseNumber.positiveNegativeChecker();
    }
}
