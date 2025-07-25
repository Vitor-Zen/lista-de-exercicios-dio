package br.com.vitorzen.listadeexerciciosdio.sextoexercicio.dominio;

public class ReadjustmentValue extends ReceivedValue implements Readjustment{
    public ReadjustmentValue(int receveidValue) {
        super(receveidValue);
    }

    @Override
    public void readjustmentReceivedValue() {
        double result = receveidValue + (receveidValue * 0.05);
        System.out.println("Valore recebido: " + receveidValue + " Valor reajustado em 5%: " + result);
    }
}
