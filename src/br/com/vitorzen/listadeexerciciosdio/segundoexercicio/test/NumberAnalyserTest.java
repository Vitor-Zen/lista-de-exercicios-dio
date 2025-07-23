package br.com.vitorzen.listadeexerciciosdio.segundoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.segundoexercicio.dominio.AnalyseNumber;
import br.com.vitorzen.listadeexerciciosdio.segundoexercicio.service.NumberAnalyseService;

public class NumberAnalyserTest {
    public static void main(String[] args) {
        NumberAnalyseService service1 = new NumberAnalyseService(new AnalyseNumber(2));
        NumberAnalyseService service2 = new NumberAnalyseService(new AnalyseNumber(23));
        NumberAnalyseService service3 = new NumberAnalyseService(new AnalyseNumber(-10));
        NumberAnalyseService service4 = new NumberAnalyseService(new AnalyseNumber(-13));

        service1.analyseNumber();
        service2.analyseNumber();
        service3.analyseNumber();
        service4.analyseNumber();
    }
}
