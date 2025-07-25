package br.com.vitorzen.listadeexerciciosdio.quintoexercicio.dominio;

public class AnalyseSalary extends ReceiveSalary implements SalaryOperations {
    protected double minimumSalary = 1293.20;

    public AnalyseSalary(double receivedSalary) {
        super(receivedSalary);
    }

    @Override
    public void minimumWageEquivalent() {
        System.out.println("Quantiadde de salários mínimos equivalente ao recebido: " + (int) (receivedSalary / minimumSalary));
    }
}
