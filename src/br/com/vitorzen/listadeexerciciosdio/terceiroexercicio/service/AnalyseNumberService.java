package br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.dominio.AnalyseNumber;
import br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.dominio.NumberChecker;

public class AnalyseNumberService implements NumberChecker {
    private final AnalyseNumber analyseNumber;

    public AnalyseNumberService(AnalyseNumber analyseNumber) {
        this.analyseNumber = analyseNumber;
    }

    @Override
    public void comparateNumbers() {
        analyseNumber.comparateNumbers();
    }

    @Override
    public int sumValues() {
        return analyseNumber.sumValues();
    }

    @Override
    public int multiplyValues() {
        return analyseNumber.multiplyValues();
    }
}
