import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int media = 0;
        int maior = 0;
        int count = 0;
        
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            media += numero;
            count++;
            
            if (numero > maior) {
                maior = numero;
            }
        } while (count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média entre os números é: " + (media/5));
    }
}
