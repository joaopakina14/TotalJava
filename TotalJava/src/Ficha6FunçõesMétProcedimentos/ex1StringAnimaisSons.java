package Ficha6FunçõesMétProcedimentos;

import java.util.Scanner;

public class ex1StringAnimaisSons {

    /**
     * solicita ao usuário um animal e imprime o som correspondente.
     * @param args
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Introduza o animal:");
        String animal = input.next();

        fazerBarulho(animal);
    }
        public static void fazerBarulho(String animal){

            if(animal.equals("Cão")){
                System.out.println("Au au au");
            }
            if(animal.equals("Gato")){
                System.out.println("Miau");
            }
            if(animal.equals("Peixe")){
                System.out.println("Glub Glub");
            }
            if(animal.equals("Vaca")){
                System.out.println("Muuuu");
            }
            if (animal.equals("Porco")){
                System.out.println("Oinc Oinc");
            }
        }

    }

