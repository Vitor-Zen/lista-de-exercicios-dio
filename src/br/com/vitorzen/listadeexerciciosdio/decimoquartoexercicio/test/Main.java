package br.com.vitorzen.listadeexerciciosdio.decimoquartoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.decimoquartoexercicio.service.ChangeNumberService;

public class Main {
    public static void main(String[] args) {
        ChangeNumberService change = new ChangeNumberService(10,20);
        change.changeNumber();
    }
}
