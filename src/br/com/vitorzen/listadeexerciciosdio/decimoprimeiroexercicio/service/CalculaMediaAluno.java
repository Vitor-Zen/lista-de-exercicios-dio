package br.com.vitorzen.listadeexerciciosdio.decimoprimeiroexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.decimoprimeiroexercicio.dominio.MediaNotas;
import br.com.vitorzen.listadeexerciciosdio.decimoprimeiroexercicio.dominio.ReceiveGrade;

public class CalculaMediaAluno extends ReceiveGrade implements MediaNotas {
    public CalculaMediaAluno(double n1, double n2, double n3, double n4) {
        super(n1, n2, n3, n4);
    }

    @Override
    public void calculaMedia() {
        double result = (n1 + n2 + n3 + n4) / 4;
        if (result >= 7) {
            System.out.printf("Aluno aprovado %.1f\n", result);
        } else {
            System.out.printf("Aluno reprovado %.1f\n", result);
        }
    }
}
