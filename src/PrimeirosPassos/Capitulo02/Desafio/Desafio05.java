package PrimeirosPassos.Capitulo02.Desafio;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dólares: ");
        double valorEmDolares = input.nextDouble();
        double valorEmReais = valorEmDolares * 4.94;
        System.out.printf("Valor convetido: %.2f", valorEmReais);
    }
}
