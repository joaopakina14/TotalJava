package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex6ScannerDoContadorEFim {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
        //imprima os números inteiros neste intervalo.

        int i, num;

        System.out.println("Introduza um numero: ");
        i = input.nextInt();

        System.out.println("Introduza um numero: ");
        num= input.nextInt();

        while (i<=num){
            System.out.println(i);
            i++;
        }
    }
}
