package br.com.vitorzen.listadeexerciciosdio.decimoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.decimoexercicio.service.MediaNotasService;

public class Main {
    public static void main(String[] args) {
        MediaNotasService media = new MediaNotasService(10, 6, 7);
        media.calculateMedia();
    }
}
