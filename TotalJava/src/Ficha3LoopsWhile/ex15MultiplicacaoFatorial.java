package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex15MultiplicacaoFatorial {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


//Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo
//while.
//Exemplo de Fatorial de 5: 5x4x3x2x1=120
//Exemplo de Fatorial de 8: 8x7x6x5x4x3x2x1=40320

        // Declarar variáveis
        int num, fatorial = 1, contador = 1;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        // Calcular o fatorial
        while (contador <= num) {
            fatorial = fatorial * contador;
            contador++;
        }

        System.out.println("Fatorial de " + num + ": " + fatorial);

    }
}

