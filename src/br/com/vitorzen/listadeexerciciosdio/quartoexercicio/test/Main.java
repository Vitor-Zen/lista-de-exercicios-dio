package br.com.vitorzen.listadeexerciciosdio.quartoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.quartoexercicio.dominio.AnalyseNumber;
import br.com.vitorzen.listadeexerciciosdio.quartoexercicio.service.AnalyseNumberService;

public class Main {
    public static void main(String[] args) {
        AnalyseNumberService analyseNumberService = new AnalyseNumberService(new AnalyseNumber(10));
        analyseNumberService.analyseNumbers();
    }
}
