import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome completo: ");
        String cliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Por favor, digite o valor do depósito: ");
        float saldo = scanner.nextFloat();

        // Exibindo uma mensagem de confirmação com os dados fornecidos
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        
        // Fechando o objeto Scanner
        scanner.close();
    }
}