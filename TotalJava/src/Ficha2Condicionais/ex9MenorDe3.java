package Ficha2Condicionais;
import java.util.Scanner;
public class ex9MenorDe3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Crie um programa que mostre o menor de três números inteiros lidos.

        int a, b, c;

        // Ler numeros
        System.out.print("Insira a: ");
        a = input.nextInt();

        System.out.print("Insira b: ");
        b = input.nextInt();

        System.out.print("Insira c: ");
        c = input.nextInt();

        // Avaliar o menor
        if (a < b && a < c) {
            System.out.println("Menor: " + a);
        }

        if (b < a && b < c) {
            System.out.println("Menor: " + b);
        }

        if (c < a && c < b) {
            System.out.println("Menor: " + c);
        }

    }
}
