package PrimeirosPassos.Capitulo03.Desafio;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        System.out.println("Verificação de número positivo ou negativo");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (numero > 0){
            System.out.println("O número " + numero + " é positivo");
        }else {
            System.out.println("O número " + numero + " é negativo");
        }
    }
}
