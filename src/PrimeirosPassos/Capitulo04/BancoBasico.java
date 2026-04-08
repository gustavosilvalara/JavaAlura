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
            switch (opcao){
                case 1:
                    System.out.printf("Saldo atual: %.2f\n", saldoConta);
                    continue;
                    case 2:
                        System.out.print("Informe o valor para depositar: ");
                        double deposito = sc.nextDouble();
                        if(deposito < 0) {
                            System.out.println("Não é possivel depositar valores negativos!!!");
                        }else{
                            saldoConta += deposito;
                            System.out.printf("Saldo atual: %.2f", saldoConta);
                        }
                        continue;
                        case 3:
                            System.out.print("Informe o valor para transferir: ");
                            double transferir = sc.nextDouble();
                            if(saldoConta < transferir) {
                                System.out.println("Saldo insuficiente!!!");
                            }else {
                                saldoConta -= transferir;
                                System.out.println("Transferido com sucesso!!");
                                System.out.printf("Saldo atual: %.2f", saldoConta);
                            }
                            continue;
                            case 4:
                                System.out.println("Encerrando o programa!!!");
                                break;
                                default:
                                    System.out.println("Digite uma das opções acima!!!");
            }
        }
    }
}
