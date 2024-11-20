package Ficha2Condicionais;
import java.util.Scanner;
public class ex13Sistema24Horas12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.

        // Declarar as Variáveis
        int horas, minutos;

        // Ler horas e minutos
        System.out.print("Insira as horas: ");
        horas = input.nextInt();

        System.out.print("Insira os minutos: ");
        minutos = input.nextInt();

        if (horas < 12) { // AM - Manhã
            System.out.println(horas + ":" + minutos + " AM");
        }

        if (horas > 12) { // PM - Tarde
            horas = horas - 12;
            System.out.println(horas + ":" + minutos + " PM");
        }

        if (horas == 12) { // PM - Meio-dia
            System.out.println(horas + ":" + minutos + " PM");
        }

    }
}
