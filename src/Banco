import java.util.Scanner;

public class BANCO {
    public static void main(String[] args) {
        String nome = "Edson Da Silva";
        String tipoConta = "Corrente";
        double saldo = 0;
        int opcao = 0;
        System.out.println("**********************************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n**********************************************************");

        String menu = """
                ** Digite sua opção**
                1 - Consultar Saldo
                2 - Sacar
                3 - Depositar
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {

            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(" O Saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                    System.out.println("Qual o valor que deseja sacar");
                    double valor = leitura.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Saldo Insuficiente");
                    } else {
                        saldo -= valor;
                        System.out.println("Novo saldo: " + saldo);

                        if (valor <= 0) {
                            System.out.println("Valor inválido");
                        }
                    }
                } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao !=4) {
                System.out.println("Opcão inválida");
            }
            }
        }
    }

Atualizando sistema bancário - versão 2.0
