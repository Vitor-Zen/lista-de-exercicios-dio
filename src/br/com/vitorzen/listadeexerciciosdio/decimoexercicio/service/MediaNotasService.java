package br.com.vitorzen.listadeexerciciosdio.decimoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.decimoexercicio.dominio.MediaNotas;
import br.com.vitorzen.listadeexerciciosdio.decimoexercicio.dominio.ReceiveGrade;

public class MediaNotasService extends ReceiveGrade implements MediaNotas {
    public MediaNotasService(double n1, double n2, double n3) {
        super(n1, n2, n3);
    }

    @Override
    public void calculateMedia() {
        double result = (n1 + n2 + n3) / 3;
        System.out.printf("Média do aluno %.1f\n", result);
    }
}
