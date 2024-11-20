package Ficha2Condicionais;
import java.util.Scanner;
public class ex14NumOrdemCrescente {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //. Escreva um programa que leia 3 números, seguidamente deve colocar os números no ecrã por ordem crescente.

        // Declarar as Variáveis
        int a, b, c;

        // Ler numeros
        System.out.print("Insira a: ");
        a = input.nextInt();

        System.out.print("Insira b: ");
        b = input.nextInt();

        System.out.print("Insira c: ");
        c = input.nextInt();

        // Ordenar os números - CRESCENTE

        if (a < b && a < c) { // a ... ...

            if (b < c) { // a b c
                System.out.println(a + "\t" + b + "\t" + c);
            } else { // a c b
                System.out.println(a + "\t" + c + "\t" + b);
            }
        }

        if (b < a && b < c) { // b ... ...

            if (a < c) { // b a c
                System.out.println(b + "\t" + a + "\t" + c);
            } else { // b c a
                System.out.println(b + "\t" + c + "\t" + a);
            }
        }

        if (c < a && c < b) { // c ... ...

            if (a < b) { // c a b
                System.out.println(c + "\t" + a + "\t" + b);
            } else { // c b a
                System.out.println(c + "\t" + b + "\t" + a);
            }
        }

    }
}
