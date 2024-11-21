package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercicio1 {

    //Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima na consola.

    public static void main(String[] args) throws FileNotFoundException {

        File ex1 = new File("Ficheiros07/FichaPratica07/exercicio_01.txt");

        Scanner sc = new Scanner(ex1);

        System.out.println(sc.nextLine());


    }
}
