package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) throws FileNotFoundException {

        // Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
        // calcule a soma desses números.

        File ex5 = new File("Ficheiros07/FichaPratica07/exercicio_05_31.txt");
        Scanner sc = new Scanner(ex5);

        int soma = 0;  // Variável para armazenar a soma dos números

        while (sc.hasNextInt()) {
            int linha = sc.nextInt();  // Lê o próximo número inteiro
            soma += linha;  // Adiciona o número à soma
            System.out.println("Número lido: " + linha);
        }

        // Exibe a soma total
        System.out.println("Soma dos números: " + soma);

        // Fecha o Scanner
        sc.close();
    }
}
