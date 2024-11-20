package Ficha3LoopsWhile;
import java.util.Scanner;
public class ex7ZeroA100ESomatorio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i=1, num=100, soma=0;



        while (i<=num){

            System.out.println("O valor do contador é: " + i + " e o valor do somatorio é " + soma);
            soma=i+soma;
            i++;

        }
    }
}
