package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex3ImparesDe531A750 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que imprima os números ímpares no intervalo de 531 a 750 inclusive. (Não necessita de
        //Scanner ou input do utilizador).

        int i=531, num=750;

        while (i<num){
            if (i%2!=0){
                System.out.println(i);

            }i++;
        }
    }
}
