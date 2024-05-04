import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        while (true) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Solicita ao usuário o valor a ser depositado
                    double valorDeposito = scanner.nextDouble();

                    // Adiciona o valor depositado ao saldo
                    saldo += valorDeposito;

                    // Exibe uma mensagem de saldo atual
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    // Solicita ao usuário o valor a ser sacado
                    double valorSaque = scanner.nextDouble();

                    // Verifica se há saldo suficiente para o saque
                    if (valorSaque <= saldo) {

                        // Subtrai o valor sacado do saldo
                        saldo -= valorSaque;

                        // Exibe uma mensagem de saldo atual
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        // Exibe uma mensagem de erro
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    // Exibe o saldo atual
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    // Exibe uma mensagem de encerramento e fecha o Scanner
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;

                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
