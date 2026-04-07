package PrimeirosPassos.Capitulo03.Desafio;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        System.out.println("Calculador da área de um quadrado ou a área do círculo");

        Scanner input = new Scanner(System.in);
        int escolhaMenu = -1;
        while (true) {

            System.out.println("Escolha um calculo");
            System.out.println("1 - Calculo da área de um quadrado");
            System.out.println("2 - Calculo da área de um círculo");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha: ");
            escolhaMenu = input.nextInt();

            if (escolhaMenu == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }
            if (escolhaMenu == 1) {
                System.out.print("Informe o valor de um dos lados do quadrado: ");
                int valorLado = input.nextInt();
                int resultado = valorLado * valorLado;
                System.out.println("A área do quadrado é " + resultado);
            }else if (escolhaMenu == 2) {
                System.out.print("Informe o valor do raio de um círculo: ");
                double valorRaio = input.nextDouble();
                double resultado = 3.14 * (valorRaio * valorRaio);
                System.out.printf("A área do círculo é %.2f ",  resultado);
            }
        }
    }
}
