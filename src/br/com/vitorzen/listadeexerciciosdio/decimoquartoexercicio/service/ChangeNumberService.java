package br.com.vitorzen.listadeexerciciosdio.decimoquartoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.decimoquartoexercicio.dominio.ChangeNumber;
import br.com.vitorzen.listadeexerciciosdio.decimoquartoexercicio.dominio.ReceiveNumbers;

public class ChangeNumberService extends ReceiveNumbers implements ChangeNumber {
    public ChangeNumberService(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    protected int aux;

    @Override
    public void changeNumber() {
        System.out.println("Primeiro valor recebido: " + firstNumber);
        System.out.println("Segundo valor recebido: " + secondNumber);
        System.out.println("----------------------------------------");
        System.out.println("Invertendo posição...");
        System.out.println("----------------------------------------");

        aux = firstNumber;
        firstNumber = secondNumber;
        secondNumber = aux;

        System.out.println("Primeiro valor invertido: " + firstNumber);
        System.out.println("Segundo valor invertido: " + secondNumber);
    }
}
