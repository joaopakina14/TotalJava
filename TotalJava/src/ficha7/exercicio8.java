package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) throws FileNotFoundException {


        //Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
        //quantidade vendida, valor unitario) e calcule o valor total das vendas.

        // Caminho para o ficheiro CSV
        File ex8 = new File("Ficheiros07/FichaPratica07/exercicio_08.csv");
        Scanner sc = new Scanner(ex8);

        // Variável para acumular o valor total das vendas
        double totalVendas = 0;

        // Pular a primeira linha (cabeçalho)
        if (sc.hasNextLine()) {
            sc.nextLine(); // Lê a linha do cabeçalho
        }

        // Ler cada linha do arquivo
        while (sc.hasNextLine()) {
            // Lê a linha do CSV
            String linha = sc.nextLine();

            // Divida a linha pelos separadores de vírgula (CSV)
            String[] dados = linha.split(",");

            // Certificar-se de que a linha contém 4 dados esperados
            if (dados.length == 4) {
                try {
                    // Obter os dados necessários: quantidade e valor unitário
                    int quantidade = Integer.parseInt(dados[2].trim()); // Quantidade vendida
                    double valorUnitario = Double.parseDouble(dados[3].trim()); // Valor unitário

                    // Calcular o valor da venda desta linha
                    double valorVenda = quantidade * valorUnitario;

                    // Acumular no total
                    totalVendas += valorVenda;
                } catch (NumberFormatException e) {
                    System.out.println("Erro ao ler dados numéricos na linha: " + linha);
                }
            }
        }

        // Exibir o total das vendas
        System.out.println("Valor total das vendas: " + totalVendas + " €");

        // Fechar o scanner
        sc.close();
    }
}
