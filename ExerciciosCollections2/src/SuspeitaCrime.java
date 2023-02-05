import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class SuspeitaCrime {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> respostas = new ArrayList<>();
        
        String respostasRecebida;
        
        System.out.println("Responda com S para Sim e N para Não\n");
        System.out.println("Telefonou para a vítima?");
        respostasRecebida = scan.next();
        respostas.add(0, respostasRecebida);
        
        System.out.println("Esteve no local do crime?");
        respostasRecebida = scan.next();
        respostas.add(1, respostasRecebida);
        
        System.out.println("Mora perto da vítima?");
        respostasRecebida = scan.next();
        respostas.add(2, respostasRecebida);
        
        System.out.println("Devia para a vítima?");
        respostasRecebida = scan.next();
        respostas.add(3, respostasRecebida);
        
        System.out.println("Já trabalhou com a vítima?");
        respostasRecebida = scan.next();
        respostas.add(4, respostasRecebida);

        System.out.println(respostas);

        Iterator<String> iterator = respostas.iterator();

        int quantidadeRespostas = 0;
        while(iterator.hasNext()) {
            String simENao = iterator.next();
            if (simENao.equalsIgnoreCase("S")){
                quantidadeRespostas++;
            }
        }
        
        switch (quantidadeRespostas){
            case (2):
            System.out.println("SUSPEITA");
            break;
            case (3):
            case (4):
            System.out.println("CÚMPLICE");
            break;
            case (5):
            System.out.println("ASSASSINO");
            break;
            default:
            System.out.println("INOCENTE");
            break; 
        }
        scan.close();
    }
}
