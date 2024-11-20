

package Ficha4CiclosMenus;
import java.util.Scanner;

public class ex1OperacoesESimOuNao {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro
        //operações aritméticas (+, -, *, /). Apresente o resultado de aplicar a operação correspondente aos valores. No
        //final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos.
        //Exemplo: Deseja continuar? (introduza s/n).

        // Declarar variáveis
        double num1, num2, resultado;
        String operacao, repeticao; // + - / *

        do {

            // Ler valor
            System.out.print("Insira o numero 1: ");
            num1 = input.nextDouble();

            System.out.print("Insira o numero 2: ");
            num2 = input.nextDouble();

            // Ler operacao
            System.out.print("Operação desejada ( + - * / ): ");
            operacao = input.next();

            switch (operacao) {
                case "+": // Soma
                    resultado = num1 + num2;
                    System.out.println("Soma: " + resultado);
                    break;

                case "-": // Subtracao
                    resultado = num1 - num2;
                    System.out.println("Subtração: " + resultado);
                    break;

                case "*": // Multiplicação
                    resultado = num1 * num2;
                    System.out.println("Multiplicação: " + resultado);
                    break;

                case "/": // Divisão
                    resultado = num1 / num2;
                    System.out.println("Divisão: " + resultado);
                    break;

                default: // Operação inválida
                    System.out.println("Operação não suportada");
            }

            // Perceber se o utilizador quer continuar
            do {
                System.out.print("Deseja continuar (s/n): ");
                repeticao = input.next();
            }while (!repeticao.equals("n") && !repeticao.equals("s"));

            // Se a resposta do utilizador for diferente do "n", então repete
        } while (!repeticao.equals("n")); // repeticao != "n"
    }
}
