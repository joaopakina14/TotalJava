package Ficha1OperacoesBásicas;
import java.util.Scanner;


public class ex3AreaPerimetro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que calcule e apresente a área e o perímetro de um retângulo.
        // As dimensões devem ser requisitadas ao utilizador.

        // Declarar as Variáveis
        int comprimento, largura, perimetro, area;

        // Ler dimensões
        System.out.print("Insira o comprimento: ");
        comprimento = input.nextInt();

        System.out.print("Insira a largura: ");
        largura = input.nextInt();

        // Calcular o perimetro
        perimetro = comprimento + comprimento + largura + largura;

        // Calcular o area
        area = comprimento * largura;

        // Apresentar os resultados
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
