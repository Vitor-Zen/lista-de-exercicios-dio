package br.com.vitorzen.listadeexerciciosdio.decimosetimoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.decimosetimoexercicio.dominio.ConvertFarenheitToCelsius;
import br.com.vitorzen.listadeexerciciosdio.decimosetimoexercicio.dominio.ReceiveFahrenheit;

public class ConvertTemperatureService extends ReceiveFahrenheit implements ConvertFarenheitToCelsius {
    public ConvertTemperatureService(int fahrenheit) {
        super(fahrenheit);
    }

    @Override
    public void convertTemperature() {
        int celsius = (5 * (fahrenheit - 32) / 9);
        System.out.println("Temperatura recebida em Fahrenheit: " + fahrenheit + "\n Temperatura convertida para Celsius: " + celsius);
    }
}
