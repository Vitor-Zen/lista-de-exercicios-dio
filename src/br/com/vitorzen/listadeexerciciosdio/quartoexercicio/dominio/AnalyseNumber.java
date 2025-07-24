package br.com.vitorzen.listadeexerciciosdio.quartoexercicio.dominio;

public class AnalyseNumber extends ReceiveNumber implements OperationNumbers{
    public AnalyseNumber(int receivedNumber) {
        super(receivedNumber);
    }

    @Override
    public void analyseNumbers() {
        predecessor();
        System.out.println("######################################");
        successor();
    }

    @Override
    public void predecessor() {
        System.out.println("Número recebido: " + receivedNumber + " ; Valor antecessor: " + (receivedNumber - 1));
    }

    @Override
    public void successor() {
        System.out.println("Número recebido: " + receivedNumber + "; Valor sucessor: " + (receivedNumber + 1));
    }
}
