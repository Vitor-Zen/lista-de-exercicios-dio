package br.com.vitorzen.listadeexerciciosdio.decimosegundoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.decimosegundoexercicio.dominio.Pagamentos;
import br.com.vitorzen.listadeexerciciosdio.decimosegundoexercicio.dominio.Produto;

public class PagamentoService extends Produto implements Pagamentos {
    public PagamentoService(String nome, double valor) {
        super(nome, valor);
    }

    private double result;

    @Override
    public void dinheiroOuPix() {
        result = valor - (valor * 0.15);
        System.out.println("Pagamento a vista ou pix. Valor bruto do produto: " + valor);
        System.out.println("Valor com 15% de desconto: " + result);
    }

    @Override
    public void aVistaCredito() {
        result = valor - (valor * 0.10);
        System.out.println("Pagamento a vista crédito. Valor bruto do produto: " + valor);
        System.out.println("Valor com 10% de desconto: " + result);
    }

    @Override
    public void parceladoDuasVezes() {
        System.out.println("Pagamento duas vezes crédito. Valor bruto do produto: " + valor);
    }

    @Override
    public void parceladoTresVezesMais() {
        result = valor + (valor * 0.10);
        System.out.println("Pagamento parcelado 3x ou mais. Valor bruto do produto: " + valor);
        System.out.println("Valor com 10% de juros: " + result);
    }
}
