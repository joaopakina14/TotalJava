package ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio11 {

    // Classe para armazenar as informações do evento
    static class Evento {
        String nome;
        String dia;
        String mes;
        String ano;
        String lotacao;

        Evento(String nome, String dia, String mes, String ano, String lotacao) {
            this.nome = nome;
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.lotacao = lotacao;
        }

        // Método para exibir as informações do evento
        public void imprimir() {
            System.out.println("Nome: " + nome);
            System.out.println("Dia: " + dia);
            System.out.println("Mês: " + mes);
            System.out.println("Ano: " + ano);
            System.out.println("Lotação: " + lotacao);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        // Caminho do arquivo CSV
        File ex11 = new File("Ficheiros07/FichaPratica07/exercicio_11.csv");
        Scanner sc = new Scanner(ex11);

        // Lista para armazenar os eventos
        List<Evento> eventos = new ArrayList<>();

        // Ignorar a primeira linha (cabeçalho)
        if (sc.hasNextLine()) {
            sc.nextLine(); // Lê o cabeçalho
        }

        // Ler as linhas do arquivo e armazenar os dados dos eventos
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] dados = linha.split(",");

            // Verifica se a linha contém 5 dados (nome, dia, mês, ano, lotação)
            if (dados.length == 5) {
                String nome = dados[0].trim();
                String dia = dados[1].trim();
                String mes = dados[2].trim();
                String ano = dados[3].trim();
                String lotacao = dados[4].trim();

                // Adiciona o evento à lista
                eventos.add(new Evento(nome, dia, mes, ano, lotacao));
            }
        }

        // Solicita ao usuário o mês que ele quer filtrar
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o mês (nome completo, por exemplo: Setembro): ");
        String mesDesejado = input.nextLine().trim();

        // Filtra e imprime os eventos que ocorrerão no mês desejado
        boolean encontrouEvento = false;
        for (Evento evento : eventos) {
            // Compara o mês (ignorando maiúsculas/minúsculas)
            if (evento.mes.equalsIgnoreCase(mesDesejado)) {
                evento.imprimir();
                encontrouEvento = true;
            }
        }

        // Se não encontrar eventos no mês desejado
        if (!encontrouEvento) {
            System.out.println("Nenhum evento encontrado para o mês " + mesDesejado);
        }

        input.close();
    }
}
