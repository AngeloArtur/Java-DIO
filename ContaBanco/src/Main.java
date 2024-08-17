import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numConta = scan.nextInt();
        System.out.println("Digite a agência: ");
        String agencia = scan.next();
        System.out.println("Digite o seu nome");
        String nome = scan.next();
        System.out.println("Digite o seu saldo");
        float saldo = scan.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque");

        scan.close();
    }
}