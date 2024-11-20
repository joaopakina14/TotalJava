package Ficha5ArraysMatrizes;
import java.util.Scanner;
public class ex9Matriz5x5Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê uma matriz de tamanho 5x5 e imprima a soma de todos os elementos.


        // Declarar variáveis
        int[][] matriz = new int[2][2];
        int somatorio = 0;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        // Calcular a soma
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                somatorio += matriz[linha][coluna]; // somatorio = somatorio + matriz[linha][coluna];
            }
        }

        System.out.println("Soma de todos os elementos: " + somatorio);


    }
}

