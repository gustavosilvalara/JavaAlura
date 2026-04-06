package PrimeirosPassos.Capitulo02.Desafio;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Celsius: ");
        double celsius = input.nextDouble();
        System.out.println(celsius + "ºC");
        double farenheit = celsius * 1.8 + 32;
        System.out.println(farenheit + "ºF");

        int farenheitSemDouble = (int) farenheit;
        System.out.println(farenheitSemDouble + "ºF");
    }
}
