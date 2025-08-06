package br.com.vitorzen.listadeexerciciosdio.nonoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.nonoexercicio.dominio.ImcCalculator;
import br.com.vitorzen.listadeexerciciosdio.nonoexercicio.dominio.ReceiveImc;

public class CalculaImcService extends ReceiveImc implements ImcCalculator {
    public CalculaImcService(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public void calculaImc() {
        double resultIMC = (peso / (altura * altura));
        System.out.printf("IMC: %.2f\n", resultIMC);
    }
}
