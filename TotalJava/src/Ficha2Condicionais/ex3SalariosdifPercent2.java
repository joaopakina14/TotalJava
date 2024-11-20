package Ficha2Condicionais;

import java.util.Scanner;

public class ex3SalariosdifPercent2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
        //a. Salário até 15.000€ inclusive paga taxa de 20%
        //b. Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
        //c. Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
        //d. Salário superior a 25.000€ paga taxa de 40%

        // Declarar as Variáveis
        double salario, taxa;

        // Ler o salário
        System.out.print("Insira o salário anual: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            taxa = salario * 0.2;
            System.out.println("Taxa de 20%: " + taxa);
        }

        if (salario > 15000 && salario <= 20000) {
            taxa = salario * 0.3;
            System.out.println("Taxa de 30%: " + taxa);
        }

        if (salario > 20000 && salario <= 25000) {
            taxa = salario * 0.35;
            System.out.println("Taxa de 35%: " + taxa);
        }

        if (salario > 25000) {
            taxa = salario * 0.4;
            System.out.println("Taxa de 40%: " + taxa);
        }

    }
}
