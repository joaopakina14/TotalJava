package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) throws FileNotFoundException {

        //Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o conteúdo na
        //consola.

        File ex4 = new File("Ficheiros07/FichaPratica07/exercicio_04.csv");
        Scanner sc = new Scanner(ex4);

        // Imprime o conteúdo linha por linha
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }

        // Fecha o Scanner
        sc.close();


    }
}
