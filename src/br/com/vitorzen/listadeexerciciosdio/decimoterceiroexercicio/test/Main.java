package br.com.vitorzen.listadeexerciciosdio.decimoterceiroexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.decimoterceiroexercicio.service.PessoaService;

public class Main {
    public static void main(String[] args) {
        PessoaService pessoa1 = new PessoaService("Vitor", 23);
        PessoaService pessoa2 = new PessoaService("Akemi", 16);

        pessoa1.imprime();
        pessoa2.imprime();
    }
}
