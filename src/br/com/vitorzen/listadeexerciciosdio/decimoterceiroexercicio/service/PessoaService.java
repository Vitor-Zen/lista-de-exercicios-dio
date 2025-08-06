package br.com.vitorzen.listadeexerciciosdio.decimoterceiroexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.decimoterceiroexercicio.dominio.ImprimePessoa;
import br.com.vitorzen.listadeexerciciosdio.decimoterceiroexercicio.dominio.ReceivePerson;

public class PessoaService extends ReceivePerson implements ImprimePessoa {
    public PessoaService(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void imprime() {
        System.out.println(nome);
        checkIdade();
    }

    @Override
    public void checkIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade: " + idade);
        } else System.out.println("Menor de idade: " + idade);
    }
}
