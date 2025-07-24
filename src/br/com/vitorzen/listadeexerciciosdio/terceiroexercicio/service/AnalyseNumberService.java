package br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.dominio.AnalyseNumber;
import br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.dominio.NumberChecker;

public class AnalyseNumberService implements NumberChecker {
    private final AnalyseNumber analyseNumber;

    public AnalyseNumberService(AnalyseNumber analyseNumber) {
        this.analyseNumber = analyseNumber;
    }

    @Override
    public void sumValues() {
        analyseNumber.sumValues();
    }

    @Override
    public void comparateNumbers() {
        analyseNumber.comparateNumbers();
    }
}
