package br.com.vitorzen.listadeexerciciosdio.quintoexercicio.test;

import br.com.vitorzen.listadeexerciciosdio.quintoexercicio.dominio.AnalyseSalary;
import br.com.vitorzen.listadeexerciciosdio.quintoexercicio.service.AnalyseSalaryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double salarioUsuario;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        salarioUsuario = scanner.nextDouble();

        AnalyseSalaryService analyseSalaryService = new AnalyseSalaryService(new AnalyseSalary(salarioUsuario));
        analyseSalaryService.minimumWageEquivalent();
    }
}
