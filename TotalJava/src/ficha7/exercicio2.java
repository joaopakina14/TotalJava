package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exercicio2 {

    //Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.

    public static void main(String[] args) throws FileNotFoundException {
        usingPrintWriter();
    }

    public static void usingPrintWriter() throws FileNotFoundException {

        String fileContent = "Hello! O meu nome é João!";

        File ex2 = new File("Ficheiros07/FichaPratica07/ex2.txt");
        PrintWriter printWriter = new PrintWriter(ex2);

        printWriter.println(fileContent);
        printWriter.println("Gosto muito deste curso.");
        printWriter.println("Hello.");


        printWriter.close();
    }
}

