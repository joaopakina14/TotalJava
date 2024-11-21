package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_02.lerInteiroPositivo;

public class Ex_05 {

    //5. O exercício deve ser resolvido na mesma classe (por exemplo: Ex_05), deve acrescentar as funções conforme 
//solicitado. No início não conseguirá testar se as funções funcionam ou não (uma vez que não é pedido para 
//desenvolver nada no main), considere fazer o exercício 6 em concorrente para conseguir perceber se está 
//tudo como esperado. 
//a) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array. 
//Exemplo de Código:
//b) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o menor valor do array. 
//c) Escreva uma função que recebe um array de inteiros como parâmetro e retorna se o array está crescente. 

    public static int[] preencherVetor(int tamanho){

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[tamanho];

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }


    public static void imprimirVetor(int[] vetor){

        System.out.print("[\t");
        for(int i =0; i< vetor.length; i++){
            if(i== vetor.length-1){
                System.out.print(vetor[i]+"\t");
            }else{
                System.out.print(vetor[i]+"\t|\t");
            }

        }
        System.out.print("]");
    }

    public static void limparConsola(){
        for(int i =0; i<500; i++){
            System.out.println();
        }
    }

    public static void primaEnter(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n[Prima Enter para Continuar]");
        input.nextLine();
    }

    public static int maiorElementoVetor(int[] vetor){
        int maior;

        // Inicializar o maior
        maior = vetor[0];

        // Encontrar o maior elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int menorElementoVetor(int[] vetor){
        int menor;

        // Inicializar o maior
        menor = vetor[0];

        // Encontrar o maior elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    public static boolean vetorCrescente(int[] vetor){

        // Descobrir se é crescente
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) { // Deixa de ser crescente
                return false;
            }

        }

        return true;
    }
}
