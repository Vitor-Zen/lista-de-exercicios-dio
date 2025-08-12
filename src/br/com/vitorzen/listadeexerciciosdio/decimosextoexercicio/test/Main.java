package br.com.vitorzen.listadeexerciciosdio.decimosextoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.decimosextoexercicio.service.CheckTriangleService;

public class Main {
    public static void main(String[] args) {
        CheckTriangleService checkTriangle = new CheckTriangleService(12,12,12);
        CheckTriangleService checkTriangle1 = new CheckTriangleService(12,15,12);
        CheckTriangleService checkTriangle2 = new CheckTriangleService(12,11,10);

        checkTriangle.checkTriangle();
        checkTriangle1.checkTriangle();
        checkTriangle2.checkTriangle();
    }
}
