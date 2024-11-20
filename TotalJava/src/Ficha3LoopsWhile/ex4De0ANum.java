package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex4De0ANum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.

        int i=0, num;

        System.out.println("Introduza um numero: ");
        num= input.nextInt();

        while (i<=num){
            System.out.println(i);
            i++;
        }
    }
}
