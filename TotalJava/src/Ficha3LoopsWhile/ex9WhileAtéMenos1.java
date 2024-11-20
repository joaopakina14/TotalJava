package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex9WhileAtéMenos1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
        //deve dizer a média dos números introduzidos (excluindo o -1).

        // Declarar variáveis
        double num = 0, soma = 1, media, contador = -1;

        // Ciclo que executa até o utilizador introduzir o -1
        while (num != -1) {

            // Ler num
            System.out.print("Insira um número: ");
            num = input.nextDouble();

            // Acumular na soma
            soma = soma + num;

            // Contar os números
            contador++;
        }

//        System.out.println("Soma: " + soma);
//        System.out.println("Contador: " + contador);

        // Calcular e apresentar a media
        media = soma / contador;

        System.out.println("Média: " + media);
    }
}
