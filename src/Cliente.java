import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente("Luiz", "Corrente", 0);

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Saldo atual: R$ " + cliente.getSaldo());
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    cliente.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    cliente.sacar(saque);
                    break;

                case 4:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
