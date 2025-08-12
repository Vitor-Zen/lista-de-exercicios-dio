package br.com.vitorzen.listadeexerciciosdio.decimooitavoexercicio.test;

public class Main {
    public static void main(String[] args) {
        double Francisco = 1.10; // Cresce 3cm por ano
        double Sara = 1.50; // Cresce 2cm por ano

        int ano = 0;

        for (; Francisco < Sara; ano++) {
            Francisco += 0.03;
            Sara += 0.02;
        }

        System.out.println("Anos necessários para Francisco ultrapassar Sara em altura: " + ano);
    }
}
