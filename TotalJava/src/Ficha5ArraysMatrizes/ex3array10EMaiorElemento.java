package Ficha5ArraysMatrizes;
import java.util.Scanner;
public class ex3array10EMaiorElemento {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento.

        // Declarar variáveis
        int[] vetor = new int[10];
        int maior;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Inicializar o maior
        maior = vetor[0];

        // Encontrar o maior elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Maior: " + maior);

    }
}

