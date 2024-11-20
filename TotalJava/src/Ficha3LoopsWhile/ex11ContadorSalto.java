package Ficha3LoopsWhile;
import java.util.Scanner;

public class ex11ContadorSalto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os
        //números inteiros de 0 até limite inclusive, com incremento de salto. Suponha que limite e salto são maiores que
        //zero.

        int i=0, num, salto;

        System.out.println("Introduza um número: ");
        num= input.nextInt();

        System.out.println("Introduza o salto pretendido: ");
        salto= input.nextInt();

        while (i<num){
            System.out.println(i);
            i=i+salto;
        }
    }
}
