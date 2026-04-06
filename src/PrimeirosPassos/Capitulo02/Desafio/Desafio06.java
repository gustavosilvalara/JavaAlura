package PrimeirosPassos.Capitulo02.Desafio;

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Valor da roupa: ");
        double precoOriginal = input.nextDouble();
        System.out.print("Porcentagem de desconto: ");
        double porcentagem =  input.nextInt();
        double desconto =  precoOriginal * (porcentagem / 100);
        double precoComDesconto = precoOriginal - desconto;
        System.out.printf("Valor com desconto: %.2f", precoComDesconto);
    }
}
