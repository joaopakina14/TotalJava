package Ficha5ArraysMatrizes;
import java.util.Scanner;
public class ex1Arrays10 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        //Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
        //de inserção.

        int vetor[] = new int [10];

        for (int i=0; i<10; i++){
            System.out.println("Insira no vetor[" + i + "]: ");
            vetor [i] = input.nextInt();
        }

        for (int i=0; i<10; i++){
            System.out.println("Vetor [" + i + "]" + vetor[i]);
        }
    }
}
