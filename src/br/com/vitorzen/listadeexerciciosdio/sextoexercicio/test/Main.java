package br.com.vitorzen.listadeexerciciosdio.sextoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.sextoexercicio.dominio.ReadjustmentValue;
import br.com.vitorzen.listadeexerciciosdio.sextoexercicio.service.ReadjustmentValueService;

public class Main {
    public static void main(String[] args) {
        ReadjustmentValueService readjustmentValueService = new ReadjustmentValueService(new ReadjustmentValue(100));
        readjustmentValueService.readjustmentReceivedValue();
    }
}
