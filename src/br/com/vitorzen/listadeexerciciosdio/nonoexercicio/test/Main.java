package br.com.vitorzen.listadeexerciciosdio.nonoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.nonoexercicio.service.CalculaImcService;

public class Main {
    public static void main(String[] args) {
        CalculaImcService imc = new CalculaImcService(89, 1.81);
        imc.calculaImc();
    }
}
