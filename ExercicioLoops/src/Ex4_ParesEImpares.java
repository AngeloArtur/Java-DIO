import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParesEImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumero;
        int count = 0;
        int numero;
        int pares = 0;
        int impares = 0;
        
        System.out.println("Digite a quantidade de números desejados: ");
        quantidadeNumero = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            
            if(numero%2 == 0) {
                pares++;
            } else{
                impares++;
            }
            count++;
        } while(count < quantidadeNumero);

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números impares: " + impares);

    }
}
