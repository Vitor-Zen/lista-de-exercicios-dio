package br.com.vitorzen.listadeexerciciosdio.decimosegundoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.decimosegundoexercicio.service.PagamentoService;

public class Main {
    public static void main(String[] args) {
        PagamentoService pgService = new PagamentoService("Carne moida", 50);
        pgService.aVistaCredito();
    }
}
