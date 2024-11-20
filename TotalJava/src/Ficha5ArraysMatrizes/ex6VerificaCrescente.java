package Ficha5ArraysMatrizes;
import java.util.Scanner;
public class ex6VerificaCrescente {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.

        // Declarar variáveis
        double[] vetor = new double[10];
        boolean crescente = true;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextDouble();
        }

        // Descobrir se é crescente
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) { // Deixa de ser crescente
                crescente = false;
            }

        }

        if(crescente){ // crescente == true
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }
    }
}
