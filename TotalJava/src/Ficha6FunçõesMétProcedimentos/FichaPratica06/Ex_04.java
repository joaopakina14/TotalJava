package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_03.*;

public class Ex_04 {

    // Implemente o programa “Análise de um Número” que pergunte um número ao utilizador e, de seguida, 
//apresente um menu de opções ao utilizador, que permitem analisar o número inserido. Esse menu de opções 
//deve ter o seguinte aspeto: 
//1. Par ou Ímpar 
//2. Positivo ou Negativo 
//3. Primo ou Não Primo 
//4. Perfeito ou Não Perfeito 
//5. Triangular ou Não Triangular 
//6. Trocar de Número
    
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, opcao;

        System.out.print("Insira um número: ");
        numero = input.nextInt();


        do {

            System.out.println("\n\n**** Análise de um Número " + numero + " *****");
            System.out.println("1. Par ou Impar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("7. Sair");
            System.out.print("\nEscolha a opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Par ou Impar
                    if (parImpar(numero)) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Impar");
                    }
                    break;

                case 2: // Positivo ou Negativo
                    if (positivoNegativo(numero)) {
                        System.out.println("Positivo");
                    } else {
                        System.out.println("Negativo");
                    }
                    break;

                case 3: // Primo ou Não Primo
                    if (primo(numero)) {
                        System.out.println("Primo");
                    } else {
                        System.out.println("Não Primo");
                    }
                    break;

                case 4: // Perfeito ou Não Perfeito

                    if(perfeito(numero)){
                        System.out.println("Perfeito");
                    }else{
                        System.out.println("Não perfeito");
                    }

                    break;

                case 5: // Triangular ou Não Triangular

                    if(triangular(numero)){
                        System.out.println("Triangular");
                    }else{
                        System.out.println("Não Triangular");
                    }
                    break;

                case 6: // Trocar de Número
                    System.out.print("Insira um número: ");
                    numero = input.nextInt();
                    break;

                case 7: // Sair
                    System.out.println("Obrigado!!");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (opcao != 7);
    }
}
