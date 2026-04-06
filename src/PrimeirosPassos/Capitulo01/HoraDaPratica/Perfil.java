package PrimeirosPassos.HoraDaPratica;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome);
        System.out.println("Tudo bem?");
    }
}
