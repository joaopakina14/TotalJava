package Ficha2Condicionais;
import java.util.Scanner;

public class ex2SalariosDifPercent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
        //a. Salário até 15.000€ inclusive paga taxa de 20%
        //b. Salário superior a 15.000€ paga taxa de 30%

        double salario;

        System.out.println("Introduza o seu rendimento anual: ");
        salario = input.nextDouble();

        if (salario>0 && salario<=15000){
            salario=salario*0.2;
            System.out.println("O montante de impostos a pagar será de: " + salario);
        }else if (salario>15000) {
            salario=salario*0.3;
            System.out.println("O montante de impostos a pagar será de: " + salario);
        }else{
            System.out.println("Por favor introduza um valor válido.");
        }
    }
}
