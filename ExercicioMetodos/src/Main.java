import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero1 = 10;
        double numero2 = 5;

        Calculadora.somar(numero1, numero2);
        Calculadora.subtrair(numero1, numero2);
        Calculadora.multiplicar(numero1, numero2);
        Calculadora.dividir(numero1, numero2);

        int hora = 8;

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12: MensagemHorario.saudacaoDia();
            break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18: MensagemHorario.saudacaoTarde();
            break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4: MensagemHorario.saudacaoNoite();
            break;
            default: System.out.println("horario inválido!");
            break;
        }

        double valor;
        int parcelas;
        System.out.print("Qual o valor que deseja parcelar: ");
        valor = scan.nextDouble();
        System.out.print("Em quantas deseja parcelar: ");
        parcelas = scan.nextInt();

        Parcelas.emprestimo(valor, parcelas);

        scan.close();
    }
}
