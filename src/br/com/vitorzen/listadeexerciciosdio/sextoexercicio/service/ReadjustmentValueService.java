package br.com.vitorzen.listadeexerciciosdio.sextoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.sextoexercicio.dominio.Readjustment;
import br.com.vitorzen.listadeexerciciosdio.sextoexercicio.dominio.ReadjustmentValue;

public class ReadjustmentValueService implements Readjustment {
    ReadjustmentValue readjustmentValue;

    public ReadjustmentValueService(ReadjustmentValue readjustmentValue) {
        this.readjustmentValue = readjustmentValue;
    }

    @Override
    public void readjustmentReceivedValue() {
        readjustmentValue.readjustmentReceivedValue();
    }
}
