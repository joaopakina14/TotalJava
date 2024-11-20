package Ficha2Condicionais;
import java.util.Scanner;
public class ex7IfParOuImpar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //. Escreva um programa que leia um número, depois apresente se é par ou ímpar.

        int num;

        System.out.println("Introduza um numero: ");
        num= input.nextInt();

        if (num%2==0){
            System.out.println("O número é par!");
        }else{
            System.out.println("O número é impar!");
        }
    }
}
