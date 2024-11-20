package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex5ContadorMensagem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e, de seguida, leia uma mensagem. Depois imprima a mensagem
        //x vezes, sendo x o número inteiro lido.

        int i=0, num;
        String frase;

        System.out.println("Introduza a frase que pretende ver: ");
        frase = input.nextLine();
        System.out.println("Introduza quantas vezes pretende ver a seguinte mensagem: ");
        num= input.nextInt();

        while (i<num){
            System.out.println(frase);
            i++;
        }
    }
}
