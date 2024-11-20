package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex14CrescenteouDecrescente {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia uma sequência de números inteiros do utilizador e determine se a sequência
        //está em ordem crescente.

        // Declarar variáveis
        int quantidadeNumeros, contador = 1, numAnt, numAtual;
        boolean crescente = true;

        // Ler quantidade
        System.out.print("Quantos números deseja inserir: ");
        quantidadeNumeros = input.nextInt();

        System.out.print("Insira um numero: ");
        numAnt = input.nextInt();

        while (contador < quantidadeNumeros) {
            System.out.print("Insira um número: ");
            numAtual = input.nextInt();

            if (numAtual <= numAnt) { // Sequência deixa de ser crescente
                crescente = false;
            }

            numAnt = numAtual;
            contador++;
        }

        if (crescente) {  // a mesma coisa que: crescente == true
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }

    }
}
