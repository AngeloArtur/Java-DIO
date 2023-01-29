import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;
        
        do {
            System.out.print("Digite uma letra: ");
            String letras;
            letras = scan.next();

            if(!(letras.equalsIgnoreCase("a") ||
            letras.equalsIgnoreCase("e") ||
            letras.equalsIgnoreCase("i") ||
            letras.equalsIgnoreCase("o") ||
            letras.equalsIgnoreCase("u"))) {
                consoantes[count] = letras;
                quantidadeConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

        System.out.print("As consoantes são: ");
        for (String consoante : consoantes) {
            if(consoante != null){
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\na quantidade de consoantes é: " + quantidadeConsoantes);

    }
}
