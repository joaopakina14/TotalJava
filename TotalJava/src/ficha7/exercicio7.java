
package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) throws FileNotFoundException {

        //Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
        //número de palavras presentes nesse ficheiro.

        // Caminho para o ficheiro de texto
        File ex7 = new File("Ficheiros07/FichaPratica07/exercicio_07.txt");
        Scanner sc = new Scanner(ex7);

        // Variáveis para contar as linhas e palavras
        int palavras = 0;
        int linhas = 0;

        // Ler cada linha do arquivo
        while (sc.hasNextLine()) {
            // Ler a linha
            String linha = sc.nextLine();

            // Contar uma nova linha
            linhas++;

            // Contar palavras na linha usando split (divide por espaços em branco)
            String[] palavrasNaLinha = linha.split("\\s+"); // O padrão "\\s+" lida com qualquer espaço em branco
            palavras += palavrasNaLinha.length;
        }

        // Exibir o resultado
        System.out.println("Número de linhas: " + linhas);
        System.out.println("Número de palavras: " + palavras);

        // Fechar o Scanner
        sc.close();
    }
}

