package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex10De2AtéNumPrintPares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
        //Suponha que o número lido da entrada será maior que 2.

        int i=2, num;

        System.out.println("Introduza um numero: ");
        num= input.nextInt();

        while (i<=num){
            if (i%2==0){
                System.out.println(i);
            }i++;
        }
    }
}
