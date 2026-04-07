package PrimeirosPassos.Capitulo03.Desafio;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Comparador de números inteiros");

        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        System.out.print("Digite outro numero: ");
        int numero2 = input.nextInt();

        if (numero == numero2) {
            System.out.println("Os números são iguais");
        }else{
            System.out.println("Os números são diferentes");
            if (numero > numero2) {
                System.out.println("O primeiro número digitado é maior que o " +
                        "segundo: 1º= " + numero + ", 2º= " + numero2);
            }else {
                System.out.println("O segundo número digitado é maior que o " +
                        "primeiro: 1º= " + numero + ", 2º= " + numero2);
            }
        }
    }
}
