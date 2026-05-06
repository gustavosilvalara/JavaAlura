package PrimeirosPassos.Capitulo05;

import java.util.Scanner;

public class SimuladorPedidosCafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double valor;
        double totalValor = 0;
        char cadastro;
        int quantidade;

        System.out.println("Digite a quantidade itens que deseja pedir: ");
        quantidade = sc.nextInt();

        int iterador = 0;
        while(iterador <= quantidade){
            System.out.print("Digite o nome do item: ");
            nome = sc.next();
            System.out.print("Digite o valor do item: ");
            valor = sc.nextDouble();
            totalValor += valor;
            iterador++;
        }

        System.out.println("Você é cadastrado? [S/N]");
        cadastro = sc.next().charAt(0);

        if(cadastro == 'S' ||  cadastro == 's'){
            double desconto = totalValor * 0.10;
            totalValor = totalValor - desconto;
            System.out.println("O valor a pagar é:  " + totalValor);
        }else {
            System.out.println("O valor a pagar é:  " + totalValor);
        }
    }
}
