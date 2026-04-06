package PrimeirosPassos.Capitulo02.Desafio;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor decimal: ");
        double valor = input.nextDouble();
        int valorSemDecimal = (int) valor;
        System.out.println("Valor sem a casa flutuante: " +  valorSemDecimal);
    }
}
