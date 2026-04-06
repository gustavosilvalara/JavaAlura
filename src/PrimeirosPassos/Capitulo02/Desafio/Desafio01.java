package PrimeirosPassos.Capitulo02.Desafio;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("A primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("A segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("A média é: "+ media);
    }
}
