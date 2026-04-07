package PrimeirosPassos.Capitulo03.Desafio;

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        System.out.println("Calculo de Fatorial");

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor para calcular: ");
        int numeroFatorial =  input.nextInt();

            int fatorial = 1;
            for (int i = 1; i <= numeroFatorial; i++){
                fatorial *= i;
            System.out.println("O fatorial de " + numeroFatorial + " é: " + fatorial);
        }
    }
}
