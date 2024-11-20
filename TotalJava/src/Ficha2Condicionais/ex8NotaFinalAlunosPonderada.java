package Ficha2Condicionais;

import java.util.Scanner;

public class ex8NotaFinalAlunosPonderada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //. Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
        //se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%

        // Declarar as Variáveis
        double nota1, nota2, nota3, mediaPonderada;

        // Ler notas
        System.out.print("Nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = input.nextDouble();

        System.out.print("Nota 3: ");
        nota3 = input.nextDouble();

        mediaPonderada = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4);

        // System.out.println("Média Ponderada: " + mediaPonderada);

        if (mediaPonderada >= 9.5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Não Aprovado");
        }
    }
}
