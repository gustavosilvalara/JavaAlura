package PrimeirosPassos.Capitulo03.Desafio;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Verificação de número ímpar e número par");

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número %s é par", numero);
        }else {
            System.out.printf("O número %s é ímpar", numero);
        }
    }
}
