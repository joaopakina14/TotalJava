package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex2Pares1A400 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que imprima os números pares no intervalo de 1 a 400 inclusive. (Não necessita de Scanner
        //ou input do utilizador).

        int i=0, num=400;

        while (i<=num){
            if (i%2==0){
                System.out.println(i);
            }i++;




        }
    }
}
