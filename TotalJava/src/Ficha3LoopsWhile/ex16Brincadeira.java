package Ficha3LoopsWhile;
import java.util.Scanner;

public class ex16Brincadeira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra = "Juízo";
        String palavraSecreta;

        System.out.println("Juízo!");
        System.out.println("Introduza a palavra secreta: ");
        palavraSecreta = input.next();

        while (!palavraSecreta.equals("desculpa")) { // Verifica se a palavra não é "desculpa"
            System.out.println(palavra);
            System.out.println("Introduza a palavra secreta: ");
            palavraSecreta = input.next(); // Lê novamente a palavra secreta
        }

        System.out.println("Obrigado por pedir desculpa!");
    }
}
