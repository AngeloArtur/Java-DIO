import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];
        int line = 0;
        int collumn = 0;
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);
            
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                    line = i;
                    collumn = j;
                }
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        System.out.println("\nMenor numero: " + menor);
        System.out.println("Sua posição: [" + line + "] [" + collumn + "]");

        
    }
}