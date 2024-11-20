package Ficha4CiclosMenus;
import java.util.Scanner;
public class ex3jogode0A100 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100. De seguida, deverá permitir ao jogador 2 tentar
        //acertar no valor inserido pelo jogador 1. A cada iteração, enquanto o valor não for descoberto, deverá informar
        //se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1. No final (quando o
        //valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.

        // Declarar variáveis
        int numSecreto, palpite, contadorTentativas = 0;

        System.out.print("Jogador 1, insira o número secreto ( 0 - 100 ): ");
        numSecreto = input.nextInt();

        // Ciclo para imprimir 50 enters "limpar a consola"
        for(int i = 0; i<200; i++){
            System.out.println();
        }

        do {
            // Ler palpite
            System.out.print("Jogador 2, tenta adivinhar: ");
            palpite = input.nextInt();

            contadorTentativas++;

            if (palpite < numSecreto) {
                System.out.println("Está muito baixo");
            }

            if (palpite > numSecreto) {
                System.out.println("Está muito alto");
            }

        } while (palpite != numSecreto);

        System.out.println("Parabéns! Adivinhaste!");
        System.out.println("Foram precisas " + contadorTentativas + " tentativas");


    }
}
