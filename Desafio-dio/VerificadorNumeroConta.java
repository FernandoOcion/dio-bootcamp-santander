import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa um bloco try-catch para capturar exceções
        try {
            // Lê a entrada do usuário como uma string representando o número da conta
            String numeroConta = scanner.nextLine();

            // Chama o método verificarNumeroConta, passando o número da conta como argumento
            verificarNumeroConta(numeroConta);

            // Imprime que o número da conta é válido
            System.out.println("Numero de conta valido.");
            // Captura a exceção do tipo IllegalArgumentException lançada pelo método verificarNumeroConta
        } catch (IllegalArgumentException e) {
            // Imprime uma mensagem de erro, mostrando a mensagem associada à exceção
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o Scanner
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos
    private static void verificarNumeroConta(String numeroConta) {
        // Verifica se o número da conta tem exatamente 8 dígitos
        if (numeroConta.length() != 8) {
            // Lança uma exceção do tipo IllegalArgumentException se o número da conta não tiver 8 dígitos
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
