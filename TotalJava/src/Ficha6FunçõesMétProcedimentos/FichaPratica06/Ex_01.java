package FichaPratica06;

import java.util.Locale;
import java.util.Scanner;

public class Ex_01 {

    //Implemente uma função void fazerBarulho( ) que receba um animal (String) como argumento. De seguida, de 
//acordo com o animal deve fazer o barulho característico (Ex.: Cão – “Au au au” | Gato – “Miau” | Peixe - “Glub 
//Glub” | Vaca – “Muuuu” | Porco – “Oinc oinc”). 

    public static void fazerBarulho(String animal) {

        animal=animal.toLowerCase();

        switch (animal) {
            case "cao":
            case "cão":
                System.out.println("Au au au ");
                break;

            case "gato":
                System.out.println("Miau");
                break;

            case "peixe":
                System.out.println("Glub glub glub");
                break;

            case "vaca":
                System.out.println("Muuuuu");
                break;

            case "porco":
                System.out.println("Oinc oinc");
                break;

            default:
                System.out.println("Barulho estranho");
                break;
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String animalEscolhido;

        while (true) {
            System.out.print("Introduz um animal: ");
            animalEscolhido = input.next();

            fazerBarulho(animalEscolhido);
        }


    }
}
