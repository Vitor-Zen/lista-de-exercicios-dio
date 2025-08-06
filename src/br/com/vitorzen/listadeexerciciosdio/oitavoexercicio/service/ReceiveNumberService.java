package br.com.vitorzen.listadeexerciciosdio.oitavoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.oitavoexercicio.controller.ReceiveNumber;

import java.util.Arrays;

public class ReceiveNumberService extends ReceiveNumber implements ResultArray {
    public ReceiveNumberService() {}

    // Ordenar
    @Override
    public void resultArray() {
        System.out.println("-----------------------");
        Arrays.sort(this.receivedNumbers);
        for (int i = this.receivedNumbers.length - 1; i >= 0; i--) {
            System.out.println(this.receivedNumbers[i]);
        }
    }
}
