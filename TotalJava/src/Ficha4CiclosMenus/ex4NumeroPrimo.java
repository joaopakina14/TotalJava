package Ficha4CiclosMenus;
import java.util.Scanner;
public class ex4NumeroPrimo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    //Escreva um programa que indique se um número pedido ao utilizador é primo. (Chamamos de número primo um
    //número natural que só possui dois divisores: 1 e ele mesmo). (Por exemplo: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, etc…)


        // Declarar variáveis
        int num;
        boolean primo = true;

        // Ler num
        System.out.print("Insira um numero: ");
        num = input.nextInt();

        // Avaliar se o número é ou não primo
        for (int i = 2; i < num; i++) {

            if (num % i == 0) { // O num conseguiu dividir por um numero, deixa de ser primo
                primo = false;
            }
        }

        if(primo){ // primo == true
            System.out.println("Primo");
        }else{
            System.out.println("Não Primo");
        }

    }

}
