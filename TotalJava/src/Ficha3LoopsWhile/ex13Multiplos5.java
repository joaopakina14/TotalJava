package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex13Multiplos5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e
        //imprima os múltiplos de 5 entre eles.

        int i, num;

        System.out.println("Introduza um numero: ");
        i= input.nextInt();

        System.out.println("Introduza um numero: ");
        num= input.nextInt();

        while (i<=num){
            if (i%5==0){
                System.out.println(i);
            }i++;
        }
    }
}
