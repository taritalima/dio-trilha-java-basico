
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("informe o seu nome: ");
        nomeCliente = input.nextLine();

        System.out.println("informe sua agencia: ");
        agencia = input.nextLine();

        System.out.println("informe o numero da conta: ");
        numeroConta = input.nextInt();
        input.nextLine();
        
        System.out.println("infome o saldo: ");
        saldo = input.nextDouble();
        input.nextLine();

        System.out.printf("Olá %s, obrigada por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia,numeroConta, saldo);

        input.close();
    }
}
