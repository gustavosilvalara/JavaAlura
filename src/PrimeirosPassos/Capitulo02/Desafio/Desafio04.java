package PrimeirosPassos.Capitulo02.Desafio;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Valor do produto: ");
        Double precoProduto = input.nextDouble();
        System.out.print("Quantidade do produto: ");
        int quantidade = input.nextInt();

        double valorTotal = precoProduto * quantidade;

        System.out.println("Valor total do(s) produto(s): " + valorTotal);
    }
}
