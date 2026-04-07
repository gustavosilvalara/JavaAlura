package PrimeirosPassos.Capitulo03.Desafio;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        System.out.println("Tabuada");

        Scanner input = new Scanner(System.in);

        System.out.print("Insira qual tábuada deseja verificar: ");
        int tabuada = input.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + tabuada * i);
        }
    }
}
