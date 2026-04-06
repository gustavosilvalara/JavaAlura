package PrimeirosPassos.Capitulo02.Desafio;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = input.nextLine().charAt(0);
        System.out.print("Digite uma frase: ");
        String frase = input.next();
        System.out.println("A letra concatenada com a frase: " + frase + letra);
    }
}
