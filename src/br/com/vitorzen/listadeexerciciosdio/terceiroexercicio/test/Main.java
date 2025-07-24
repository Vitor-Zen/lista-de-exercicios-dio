package br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.dominio.AnalyseNumber;
import br.com.vitorzen.listadeexerciciosdio.terceiroexercicio.service.AnalyseNumberService;

public class Main {
    public static void main(String[] args) {
        AnalyseNumberService analyseNumberService = new AnalyseNumberService(new AnalyseNumber(3, 3));
        AnalyseNumberService analyseNumberService2 = new AnalyseNumberService(new AnalyseNumber(3, 4));

        analyseNumberService.comparateNumbers();
        analyseNumberService2.comparateNumbers();
    }
}
