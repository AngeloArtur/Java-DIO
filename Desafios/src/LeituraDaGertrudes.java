import java.util.Scanner;

public class LeituraDaGertrudes {

/* Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. Como você está aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento. */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int dias = paginas/paginasLidas;

        System.out.println(dias + " dias");
        leitor.close();
    }
}
