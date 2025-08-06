package br.com.vitorzen.listadeexerciciosdio.decimoprimeiroexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.decimoprimeiroexercicio.service.CalculaMediaAluno;

public class Main {
    public static void main(String[] args) {
        CalculaMediaAluno media = new CalculaMediaAluno(10,7,5,7);
        media.calculaMedia();
    }
}
