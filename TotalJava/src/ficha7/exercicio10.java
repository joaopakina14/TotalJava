package ficha7;

import java.io.*;
import java.util.*;

public class exercicio10 {

    // Estrutura para armazenar informações de um formando
    static class Formando {
        String nome;
        String matricula;
        String curso;
        String email;
        int idade;

        Formando(String nome, String matricula, String curso, String email, int idade) {
            this.nome = nome;
            this.matricula = matricula;
            this.curso = curso;
            this.email = email;
            this.idade = idade;
        }

        // Método para exibir as informações do formando
        public void imprimir() {
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Curso: " + curso);
            System.out.println("Email: " + email);
            System.out.println("Idade: " + idade);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Caminho do arquivo CSV
        File ex10 = new File("Ficheiros07/FichaPratica07/exercicio_10.csv");
        Scanner sc = new Scanner(ex10);

        // Lista para armazenar os formandos
        List<Formando> formandos = new ArrayList<>();

        // Ignorar a primeira linha (cabeçalho)
        if (sc.hasNextLine()) {
            sc.nextLine(); // Lê o cabeçalho
        }

        // Ler o conteúdo do arquivo CSV e adicionar à lista de formandos
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] dados = linha.split(",");

            if (dados.length == 5) {
                String nome = dados[0].trim();
                String matricula = dados[1].trim();
                String curso = dados[2].trim();
                String email = dados[3].trim();
                int idade = Integer.parseInt(dados[4].trim());

                formandos.add(new Formando(nome, matricula, curso, email, idade));
            }
        }

        // Scanner para o menu de opções
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Pesquisas");
            System.out.println("2. Criar Formando");
            System.out.println("3. Editar Formando");
            System.out.println("4. Eliminar Formando");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();
            input.nextLine();  // Limpar o buffer do Scanner

            switch (opcao) {
                case 1:
                    // Pesquisas
                    menuPesquisas(formandos, input);
                    break;
                case 2:
                    // Criar Formando
                    criarFormando(formandos, input);
                    break;
                case 3:
                    // Editar Formando
                    editarFormando(formandos, input);
                    break;
                case 4:
                    // Eliminar Formando
                    eliminarFormando(formandos, input);
                    break;
                case 5:
                    // Sair
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        input.close();
    }

    // Menu de Pesquisas
    private static void menuPesquisas(List<Formando> formandos, Scanner input) {
        System.out.println("Menu de Pesquisas:");
        System.out.println("1. Imprimir todos os formandos");
        System.out.println("2. Buscar por matrícula");
        System.out.println("3. Buscar por curso");
        System.out.println("4. Imprimir o aluno mais velho");
        System.out.println("5. Imprimir alunos em mais de um curso");
        System.out.println("6. Número de formandos");
        System.out.print("Escolha uma opção: ");
        int opcaoPesquisa = input.nextInt();
        input.nextLine();  // Limpar o buffer do Scanner

        switch (opcaoPesquisa) {
            case 1:
                imprimirTodosFormandos(formandos);
                break;
            case 2:
                buscarPorMatricula(formandos, input);
                break;
            case 3:
                buscarPorCurso(formandos, input);
                break;
            case 4:
                imprimirAlunoMaisVelho(formandos);
                break;
            case 5:
                imprimirAlunosMultiplosCursos(formandos);
                break;
            case 6:
                System.out.println("Número total de formandos: " + formandos.size());
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    // Função para imprimir todos os formandos
    private static void imprimirTodosFormandos(List<Formando> formandos) {
        for (Formando formando : formandos) {
            formando.imprimir();
        }
    }

    // Função para buscar formando por matrícula
    private static void buscarPorMatricula(List<Formando> formandos, Scanner input) {
        System.out.print("Digite a matrícula: ");
        String matricula = input.nextLine();

        for (Formando formando : formandos) {
            if (formando.matricula.equals(matricula)) {
                formando.imprimir();
                return;
            }
        }
        System.out.println("Formando não encontrado!");
    }

    // Função para buscar formando por curso
    private static void buscarPorCurso(List<Formando> formandos, Scanner input) {
        System.out.print("Digite o curso: ");
        String curso = input.nextLine();
        int count = 0;

        for (Formando formando : formandos) {
            if (formando.curso.equals(curso)) {
                System.out.println("Nome: " + formando.nome + ", Matrícula: " + formando.matricula);
                count++;
            }
        }

        System.out.println("Total de formandos no curso " + curso + ": " + count);
    }

    // Função para imprimir o aluno mais velho
    private static void imprimirAlunoMaisVelho(List<Formando> formandos) {
        Formando maisVelho = null;
        for (Formando formando : formandos) {
            if (maisVelho == null || formando.idade > maisVelho.idade) {
                maisVelho = formando;
            }
        }

        if (maisVelho != null) {
            System.out.println("O aluno mais velho é:");
            maisVelho.imprimir();
        }
    }

    // Função para imprimir alunos matriculados em mais de um curso
    private static void imprimirAlunosMultiplosCursos(List<Formando> formandos) {
        Map<String, Set<String>> matriculasPorCurso = new HashMap<>();

        // Preencher o mapa
        for (Formando formando : formandos) {
            matriculasPorCurso
                    .computeIfAbsent(formando.matricula, k -> new HashSet<>())
                    .add(formando.curso);
        }

        // Imprimir alunos matriculados em mais de um curso
        for (Map.Entry<String, Set<String>> entry : matriculasPorCurso.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Aluno: " + entry.getKey() + " matriculado nos cursos: " + entry.getValue());
            }
        }
    }

    // Função para criar um formando
    private static void criarFormando(List<Formando> formandos, Scanner input) {
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Matrícula: ");
        String matricula = input.nextLine();
        System.out.print("Curso: ");
        String curso = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        input.nextLine();  // Limpar buffer

        formandos.add(new Formando(nome, matricula, curso, email, idade));
        System.out.println("Formando adicionado com sucesso!");
    }

    // Função para editar um formando
    private static void editarFormando(List<Formando> formandos, Scanner input) {
        System.out.print("Digite a matrícula do formando a editar: ");
        String matricula = input.nextLine();

        for (Formando formando : formandos) {
            if (formando.matricula.equals(matricula)) {
                System.out.println("Editar dados do formando: ");
                System.out.print("Novo Nome: ");
                formando.nome = input.nextLine();
                System.out.print("Novo Curso: ");
                formando.curso = input.nextLine();
                System.out.print("Novo Email: ");
                formando.email = input.nextLine();
                System.out.print("Nova Idade: ");
                formando.idade = input.nextInt();
                input.nextLine();  // Limpar buffer
                System.out.println("Formando editado com sucesso!");
                return;
            }
        }

        System.out.println("Formando não encontrado!");
    }

    // Função para eliminar um formando
    private static void eliminarFormando(List<Formando> formandos, Scanner input) {
        System.out.print("Digite a matrícula do formando a eliminar: ");
        String matricula = input.nextLine();

        formandos.removeIf(formando -> formando.matricula.equals(matricula));
        System.out.println("Formando eliminado com sucesso!");
    }
}
