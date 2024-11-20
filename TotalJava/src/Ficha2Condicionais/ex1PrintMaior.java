package Ficha2Condicionais;
import java.util.Scanner;
public class ex1PrintMaior {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Leia dois números inteiros e escreva na consola o maior deles.

        int num1, num2;

        System.out.println("Introduza o numero 1: ");
        num1= input.nextInt();

        System.out.println("Introduza o numero 2: ");
        num2= input.nextInt();

        if (num1>num2){
            System.out.println("O número maior é o: " + num1);
        }else{
            System.out.println("O número maior é: " + num2);
        }


    }
}
