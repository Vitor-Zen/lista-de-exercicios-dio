package br.com.vitorzen.listadeexerciciosdio.decimosetimoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.decimosetimoexercicio.service.ConvertTemperatureService;

public class Main {
    public static void main(String[] args) {
        ConvertTemperatureService convertTemperatureService = new ConvertTemperatureService(77);
        convertTemperatureService.convertTemperature();
    }
}
