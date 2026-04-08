package PrimeirosPassos.Capitulo04;

import java.util.Scanner;

public class BancoBasico {
    public static void main(String[] args) {
        String nomeCliente = "Gustavo Silva Lara";
        String tipoDeConta = "Conta corrente";
        double saldoConta = 2500.00;
        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                **********************************************
                Dados inicias do cliente:
                \s
                Nome: %s
                Tipo Conta: %s
                saldo inicial: %.2f
                **********************************************
                """,nomeCliente,tipoDeConta,saldoConta);

        while(true){
            System.out.println("""
                    \s
                    Operações
                    
                    1 - Consultar saldo
                    2 - Depositar valor
                    3 - Transferir valor
                    4 - sair
                    """);
            System.out.print("Opção desejada: ");
            int opcao = sc.nextInt();
            if(opcao == 4){
                System.out.println("Encerrando o programa...");
                break;
            }else {
                switch (opcao) {
                    case 1:
                        System.out.printf("Saldo atual: %.2f\n", saldoConta);
                        break;

                    case 2:
                        System.out.print("Informe o valor para depositar: ");
                        double deposito = sc.nextDouble();
                        if (deposito < 0) {
                            System.out.println("Não é possível depositar valores negativos!!!");
                        } else {
                            saldoConta += deposito;
                            System.out.printf("Saldo atualizado: %.2f\n", saldoConta);
                        }
                        break;

                    case 3:
                        System.out.print("Informe o valor para transferir: ");
                        double transferir = sc.nextDouble();
                        if (transferir > saldoConta) {
                            System.out.println("Saldo insuficiente!!!");
                        } else {
                            saldoConta -= transferir;
                            System.out.println("Transferido com sucesso!!");
                            System.out.printf("Saldo atual: %.2f\n", saldoConta);
                        }
                        break;

                    default:
                        System.out.println("Opção inválida! Digite uma das opções do menu.");
                        break;
                }
            }
        }
    }
}
