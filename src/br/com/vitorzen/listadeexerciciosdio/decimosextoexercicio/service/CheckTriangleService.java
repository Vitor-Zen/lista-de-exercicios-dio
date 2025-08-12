package br.com.vitorzen.listadeexerciciosdio.decimosextoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.decimosextoexercicio.dominio.ReceiveValues;
import br.com.vitorzen.listadeexerciciosdio.decimosextoexercicio.dominio.Triangles;

public class CheckTriangleService extends ReceiveValues implements Triangles {
    public CheckTriangleService(int firstAngle, int secondAngle, int thirdAngle) {
        super(firstAngle, secondAngle, thirdAngle);
    }

    @Override
    public void checkTriangle() {
        if(firstAngle == secondAngle && firstAngle == thirdAngle){
            System.out.println("Triângulo Equilátero");
        } else if (firstAngle == secondAngle || firstAngle == thirdAngle || secondAngle == thirdAngle) {
            System.out.println("Triângulo Isósceles");
        } else System.out.println("Triângulo Escaleno");
    }
}
