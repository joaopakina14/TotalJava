package Ficha1OperacoesBásicas;
import java.util.Scanner;

public class ex4Circunferencia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa para calcular a área da circunferência.
        // As dimensões devem ser requisitadas ao utilizador.

        // Declarar as Variáveis
        double raio, area, pi = 3.1415;

        // Ler raio
        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        // Calcular a área
        area = pi * raio * raio;

        // Apresentar o resultado
        System.out.println("Área da Circunferência: " + area);
    }
}
