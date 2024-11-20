package Ficha1OperacoesBásicas;
import java.util.Scanner;

public class ex1SomaBásica {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       //Escreva um programa que faça a soma de dois números introduzidos pelo utilizador. Apresente o
        //resultado da operação


        int num1, num2, total;

        System.out.println("Introduza o numero 1: ");
        num1= input.nextInt();

        System.out.println("Introduza o numero 2: ");
        num2= input.nextInt();

        total=num1+num2;

        System.out.println("O resultado é: " + total);

    }
}
