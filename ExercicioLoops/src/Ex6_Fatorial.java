import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial;
        int multiplica = 1;
        System.out.println("Digite um número para obter o seu fatorial: ");
        fatorial = scan.nextInt();

        for (int i=fatorial; i >= 1; i--) {
            multiplica *= i;
        }
        System.out.println(fatorial + "!" + " = " + (multiplica));
    }
}
