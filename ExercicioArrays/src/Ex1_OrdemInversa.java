/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) throws Exception {
        int[] vetor = {10, 20, 5, -8, 12, 42};
        int count = 0;
        
        System.out.println("O vetor é: ");
        while(count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor invertido: ");
        for(int i = (vetor.length-1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
