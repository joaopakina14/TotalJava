package Ficha5ArraysMatrizes;
import java.util.Scanner;
public class ex4Array10MenorElemento {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento.

        // Declarar variáveis
        int[] vetor = new int[10];
        int menor;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Inicializar o menor
        menor = vetor[0];

        // Encontrar o menor elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Menor: " + menor);

    }
}

