package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex12Intervalos25A50 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
        //utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de
        //dados deve terminar quando for lido um número negativo.

        // Declarar variáveis
        int num = 0, cont_0_25 = 0, cont_26_50 = 0, cont_51_75 = 0, cont_76_100 = 0;

        // Ciclo que executa enquanto o numero introduzido pelo utilizador for positivo
        while (num >= 0) {

            // Ler num
            System.out.print("Insira um número (negativo para sair): ");
            num = input.nextInt();

            // Avaliar em que intervalo é que se encaixa
            if (num >= 0 && num <= 25) {
                cont_0_25++;
            }

            if (num >= 26 && num <= 50) {
                cont_26_50++;
            }

            if (num >= 51 && num <= 75) {
                cont_51_75++;
            }

            if (num >= 76 && num <= 100) {
                cont_76_100++;
            }
        }

        System.out.println(" [00,25]: " + cont_0_25);
        System.out.println(" [26,50]: " + cont_26_50);
        System.out.println(" [51,75]: " + cont_51_75);
        System.out.println("[76,100]: " + cont_76_100);

    }
}
