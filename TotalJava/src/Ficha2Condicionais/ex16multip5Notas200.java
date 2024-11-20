package Ficha2Condicionais;
import java.util.Scanner;

public class ex16multip5Notas200 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um valor em euros (múltiplo de 5) e calcula qual o menor número possível de notas
        //de 200, 100, 50, 20, 10, 5 em que o valor pode ser decomposto. Escrever o valor lido e a relação de notas
        //necessárias.

        // Declarar as Variáveis
        int valor, notas;

        // Ler valor
        System.out.print("Insira o valor em €: ");
        valor = input.nextInt();


        if (valor % 5 == 0) { // Valor múltiplo de 5 - válido

            // Notas de 200
            notas = valor / 200;
            System.out.println(notas + " notas de 200€");
            valor = valor % 200;

            // Notas de 100
            notas = valor / 100;
            System.out.println(notas + " notas de 100€");
            valor = valor % 100;

            // Notas de 50
            notas = valor / 50;
            System.out.println(notas + " notas de 50€");
            valor = valor % 50;

            // Notas de 20
            notas = valor / 20;
            System.out.println(notas + " notas de 20€");
            valor = valor % 20;

            // Notas de 10
            notas = valor / 10;
            System.out.println(notas + " notas de 10€");
            valor = valor % 10;

            // Notas de 5
            notas = valor / 5;
            System.out.println(notas + " notas de 5€");

        } else { // inválido
            System.out.println("Valor tem de ser múltiplo de 5. Este MB não dá troco :)");
        }

    }
}
