package Ficha1OperacoesBásicas;
import java.util.Scanner;

public class ex7PercentagemSobreValorFinal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos. Apresente o valor
        //a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos.

        double num1, num2, num3, total, percentual;

        System.out.println("Insira o numero: ");
        num1= input.nextInt();

        System.out.println("Insira o numero: ");
        num2= input.nextInt();

        System.out.println("Insira o numero: ");
        num3= input.nextInt();

        total=num1+ num2+num3;

        System.out.println("O preço total dos produtos sem desconto é: " + total + " €");

        percentual=total*0.9;

        System.out.println("O preço total dos produtos com o desconto aplicado é: " + percentual + " €");
    }
}
