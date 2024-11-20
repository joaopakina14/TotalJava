package Ficha2Condicionais;
import java.util.Scanner;
public class ex11OperacaoBancaria {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        //. Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
        //(montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
        //mantém positivo depois da operação. Finalmente, mostre o novo saldo.

        // Declarar as Variáveis
        double saldo, movimento;

        // Ler saldo
        System.out.print("Insira o saldo: ");
        saldo = input.nextDouble();

        // Ler movimento
        System.out.print("Insira o valor a movimentar: ");
        movimento = input.nextDouble();

        // Avaliar se o movimento é válido
        if (saldo + movimento >= 0) { // Movimento válido

            // Atualizamos o saldo
            saldo = saldo + movimento;

        } else { // Movimento inválido

            System.out.println("Operação inválida. Saldo insuficiente.");

        }

        System.out.println("Saldo Atual: " + saldo);

    }
}
