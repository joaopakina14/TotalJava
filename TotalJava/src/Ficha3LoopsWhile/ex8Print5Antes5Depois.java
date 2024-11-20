package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex8Print5Antes5Depois {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
        //a. Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14 16 17 18 19 20.

        // Declarar variáveis
        int num, antecessor;

        // Ler num
        System.out.print("Insira o número: ");
        num = input.nextInt();

        antecessor = num - 5;

        while (antecessor <= num + 5) {
            if(antecessor!=num){
                System.out.println(antecessor);
            }
            antecessor++;
        }
    }
}
