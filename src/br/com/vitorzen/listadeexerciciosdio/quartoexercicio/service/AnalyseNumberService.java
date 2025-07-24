package br.com.vitorzen.listadeexerciciosdio.quartoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.quartoexercicio.dominio.AnalyseNumber;
import br.com.vitorzen.listadeexerciciosdio.quartoexercicio.dominio.OperationNumbers;

public class AnalyseNumberService implements OperationNumbers {
    AnalyseNumber analyseNumber;

    public AnalyseNumberService(AnalyseNumber analyseNumber) {
        this.analyseNumber = analyseNumber;
    }

    @Override
    public void analyseNumbers() {
        analyseNumber.analyseNumbers();
    }

    @Override
    public void predecessor() {
        analyseNumber.predecessor();
    }

    @Override
    public void successor() {
        analyseNumber.successor();
    }
}
