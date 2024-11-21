package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) throws FileNotFoundException {

        //Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género,
        //duração) para uma matriz.

        // Caminho para o ficheiro CSV
        File ex9 = new File("Ficheiros07/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(ex9);

        // Matriz para armazenar as informações das músicas
        String[][] musicas = new String[100][4];  // Vamos assumir que teremos no máximo 100 músicas

        int contador = 0;

        // Ignorar a primeira linha (cabeçalho)
        if (sc.hasNextLine()) {
            sc.nextLine(); // Lê o cabeçalho
        }

        // Ler as linhas do arquivo
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();

            // Dividir a linha pelos separadores de vírgula
            String[] dados = linha.split(",");

            // Armazenar as informações na matriz
            if (dados.length == 4) {
                String nome = dados[0].trim();
                String artista = dados[1].trim();
                String genero = dados[2].trim();
                String duracao = dados[3].trim();

                // Dividir a duração no formato minutos:segundos
                String[] tempo = duracao.split(":");
                int minutos = Integer.parseInt(tempo[0].trim());
                int segundos = Integer.parseInt(tempo[1].trim());

                // Armazenar na matriz
                musicas[contador][0] = nome;
                musicas[contador][1] = artista;
                musicas[contador][2] = genero;
                musicas[contador][3] = minutos + ":" + segundos; // Podemos armazenar o tempo no formato minutos:segundos ou em segundos

                contador++;
            }
        }

        // Exibir as músicas armazenadas
        System.out.println("Músicas carregadas:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Nome: " + musicas[i][0]);
            System.out.println("Artista: " + musicas[i][1]);
            System.out.println("Gênero: " + musicas[i][2]);
            System.out.println("Duração: " + musicas[i][3]);
            System.out.println("----------------------");
        }

        // Fechar o scanner
        sc.close();
    }
}
