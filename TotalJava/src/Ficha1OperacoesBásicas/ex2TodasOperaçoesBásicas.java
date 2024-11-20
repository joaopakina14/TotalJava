package Ficha1OperacoesBásicas;
import java.util.Scanner;


public class ex2TodasOperaçoesBásicas {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Escreva um programa que requisite dois valores. O programa deverá utilizá-los
        //como operandos para as seguintes operações aritméticas: soma, subtração,
        //multiplicação e divisão. Apresente o resultado das operações e teste os resultados
        //obtidos com vários casos.

        double num1, num2, soma, subtracao, multiplicacao, divisao;

        System.out.println("Introduza um numero: ");
        num1= input.nextDouble();

        System.out.println("Introduza um numero: ");
        num2= input.nextDouble();

        soma=num1+num2;
        subtracao=num1-num2;
        multiplicacao=num1*num2;
        divisao=num1/num2;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da Subtração é: " + subtracao);
        System.out.println("O resultado da multiplicação: " + multiplicacao);
        System.out.println("O resultado da divisao é: " + divisao);
    }
}
