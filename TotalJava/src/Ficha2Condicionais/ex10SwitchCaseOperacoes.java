package Ficha2Condicionais;
import java.util.Scanner;
public class ex10SwitchCaseOperacoes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //. Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
        //realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
        //a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro.

        // Declarar as Variáveis
        double num1, num2, resultado;
        String operacao;

        // Ler numeros
        System.out.print("Insira o num1: ");
        num1 = input.nextDouble();

        System.out.print("Insira o num2: ");
        num2 = input.nextDouble();

        // Ler operacao
        System.out.print("Operação desejada ( + - * / ): ");
        operacao = input.next();

        switch (operacao) {
            case "+": // Soma
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                break;

            case "-": // Subtração
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                break;

            case "*": // Multiplicação
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                break;

            case "/": // Divisão
                resultado = num1 / num2;
                System.out.println("Divisão: " + resultado);
                break;

            default:
                System.out.println("Operação Inválida");
                break;
        }
    }
}
