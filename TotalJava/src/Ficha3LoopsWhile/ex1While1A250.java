package Ficha3LoopsWhile;
import java.util.Scanner;

public class ex1While1A250 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que imprima os números no intervalo de 1 a 250 inclusive. (Não necessita de Scanner ou
        //input do utilizador).

        int i = 0, num = 250;

        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}
