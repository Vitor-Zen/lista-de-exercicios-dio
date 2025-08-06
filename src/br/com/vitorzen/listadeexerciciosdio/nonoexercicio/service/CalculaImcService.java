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

        if (resultIMC < 18.5) {
            System.out.printf("IMC abaixo do peso %.2f\n", resultIMC);
        } else if (resultIMC >= 18.5 && resultIMC <= 24.9) {
            System.out.printf("IMC peso ideal: %.2f\n", resultIMC);
        } else if (resultIMC >= 25 && resultIMC <= 29.9) {
            System.out.printf("IMC levemente acima do peso %.2f\n", resultIMC);
        } else if (resultIMC >= 30 && resultIMC <= 34.9) {
            System.out.printf("IMC obesidade grau 1 %.2f\n", resultIMC);
        } else if (resultIMC >= 35 && resultIMC <= 39.9) {
            System.out.printf("IMC obesidade grau 2 %.2f\n", resultIMC);
        } else {
            System.out.printf("IMC obesidade grau 3 %.2f\n", resultIMC);
        }
    }
}
