package Ficha2Condicionais;
import java.util.Scanner;

public class ex4PontosCorrida {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        //Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.

        int lugar;

        // Ler lugar
        System.out.print("Insira o seu lugar na corrida: ");
        lugar = input.nextInt();

        switch (lugar) {
            case 1:
                System.out.println("Ganhou 10 pontos");
                break;

            case 2:
                System.out.println("Ganhou 8 pontos");
                break;

            case 3:
                System.out.println("Ganhou 6 pontos");
                break;

            case 4:
                System.out.println("Ganhou 5 pontos");
                break;

            case 5:
                System.out.println("Ganhou 4 pontos");
                break;

            case 6:
                System.out.println("Ganhou 3 pontos");
                break;

            case 7:
                System.out.println("Ganhou 2 pontos");
                break;

            case 8:
                System.out.println("Ganhou 1 ponto");
                break;

            default:
                System.out.println("Não ganhou pontos!");
                break;

        }

    }
}
