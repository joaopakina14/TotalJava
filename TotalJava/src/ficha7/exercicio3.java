package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class exercicio3 {

    //Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro.

    public static void main(String[] args) throws FileNotFoundException {

        //Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro.

        File ex3 = new File("Ficheiros07/FichaPratica07/exercicio_03.txt");

        Scanner sc = new Scanner(ex3);

        File destino = new File("Ficheiros07/FichaPratica07/exercicio_03_Alternativa01.txt");

        PrintWriter printWriter = new PrintWriter(destino);

        while (sc.hasNextLine()){

            String linha = sc.nextLine();
            printWriter.println(linha);

        }

        sc.close();
        printWriter.close();

        System.out.println("Conteúdo copiado com sucesso para o arquivo de destino.");
    }
}

