package Ficha2Condicionais;
import java.util.Scanner;

public class ex6PrimeiroMaiorDepoisMenor {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        //Escreva um programa que leia dois valores numéricos e apresente o maior e depois o menor

        // Declarar as Variáveis
        int num1, num2;

        // Ler num1 e num2
        System.out.print("Insira o num1: ");
        num1 = input.nextInt();

        System.out.print("Insira o num2: ");
        num2 = input.nextInt();

        // Perceber qual o num maior
        if (num1 < num2) {
            System.out.println(num2 + "\t" + num1);
        }else{
            System.out.println(num1 + "\t" + num2);
        }
    }
}
