package Ficha2Condicionais;
import java.util.Scanner;
public class ex12SwitchCaseMenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Implemente um programa de menu (opções do menu: 1. Criar 2. Atualizar 3. Eliminar 4. Sair). Se uma das opções
        //1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada. Caso a opção for
        //inválida, deve informar o utilizador.

        // Declarar as Variáveis
        int opcao;

        // Apresentar as opções
        System.out.println("********** Selecione uma opção **********");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.print("\nSelecione uma opção: ");
        opcao = input.nextInt();

        switch (opcao){
            case 1: // Criar
                System.out.println("___ Criar ___");
                break;

            case 2: // Atualizar
                System.out.println("___ Atualizar ___");
                break;

            case 3: // Eliminar
                System.out.println("___ Eliminar ___");
                break;

            case 4: // Sair
                break;

            default: // Opção Inválida
                System.out.println("!!! Opção Inválida !!!");
                break;
        }

    }
}
