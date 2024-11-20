package Ficha5ArraysMatrizes;
import java.util.Scanner;
public class ex11Matriz3x3MaiorEMenor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //. Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido
        //pelo utilizador. Deverá indicar qual o maior e qual o menor dos valores guardados na matriz, e deverá imprimir
        //todo o conteúdo da matriz de forma semelhante ao exercício 8.

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int menor, maior;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        // Inicializar o maior e o menor
        menor = matriz[0][0];
        maior = matriz[0][0];

        // Encontrar o maior e o menor elemento
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                // Avaliar o maior
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }

                // Avaliar o menor
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }

            }
        }

        System.out.println("Menor Elemento: "+menor);
        System.out.println("Maior Elemento: "+maior);
    }
}
