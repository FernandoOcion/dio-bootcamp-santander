import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Crie um loop 'for' para iterar sobre os saques:
        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            // Solicite ao usuário o valor do saque:
            double valorSaque = scanner.nextDouble();

            // Verifique se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (valorSaque > limiteDiario) {
                // Se o valor do saque ultrapassar o limite diário
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                // Se o valor do saque não ultrapassar o limite diário
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}