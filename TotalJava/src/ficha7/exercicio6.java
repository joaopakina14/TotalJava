package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) throws FileNotFoundException {

        //Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
        //imprima o nome da pessoa mais velha na consola.

        File ex6 = new File("Ficheiros07/FichaPratica07/exercicio_06.txt");
        Scanner sc = new Scanner(ex6);

        String nomes=" ";
        int idade=0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();

            String []linhaSeparada = linha.split(",");

            if (Integer.parseInt(linhaSeparada[1])>idade){
                idade=Integer.parseInt(linhaSeparada[1]);
                nomes = linhaSeparada[0];


            }
        }System.out.println("****Idade da Pessoa mais velha****");
        System.out.println(nomes + " com " + idade + " anos.");


    }
}
