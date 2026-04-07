package PrimeirosPassos.Capitulo03;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = new Random().nextInt(100);
        int contador = 1;

        System.out.println("Adivinhe o valor pensado em 5 chances");

        while(true) {

            System.out.print("Digite o valor para adivinhar: ");
            int valor = input.nextInt();
            contador++;

            if (contador == 5 && valor != random) {
                System.out.println("Você acabou não adivinhando, o valor é " + random);
                break;
            }

            if (valor == random) {
                System.out.println("Valor digitado: " + valor);
                System.out.println("Você acertou o valor, em " + contador + "tentativas");
                break;
            }else if (valor < random) {
                System.out.println("Valor digitado: " + valor + " é menor que o valor pensado");
            }else {
                System.out.println("Valor digitado: " + valor + " e maior que o valor pensado");
            }
        }
    }
}
