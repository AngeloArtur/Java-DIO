import exceptions.ParamtroInvalidoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParamtroInvalidoException e) {
            System.err.println("O parâmetro 2 precisa ser maior que o parâmetro 1\n" + e);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParamtroInvalidoException {
        if(parametroUm > parametroDois) {
            throw new ParamtroInvalidoException();
        } else {
            int contagem = parametroDois - parametroUm;

            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i+1));
            }
        }
    }
}