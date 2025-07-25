package br.com.vitorzen.listadeexerciciosdio.quintoexercicio.service;

import br.com.vitorzen.listadeexerciciosdio.quintoexercicio.dominio.AnalyseSalary;
import br.com.vitorzen.listadeexerciciosdio.quintoexercicio.dominio.SalaryOperations;

public class AnalyseSalaryService implements SalaryOperations {
    AnalyseSalary analyseSalary;

    public AnalyseSalaryService(AnalyseSalary analyseSalary) {
        this.analyseSalary = analyseSalary;
    }

    @Override
    public void minimumWageEquivalent() {
        analyseSalary.minimumWageEquivalent();
    }
}
