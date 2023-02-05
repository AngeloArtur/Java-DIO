import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator; 

/*
    Dada uma lista com 7 notas de um aluno [7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6] faça:
    1 - Crie uma lista e adicione 7 notas
    2 - Exiba a posição da nota 5
    3 - Adicione na lista a nota 8 na posição 4
    4 - Substitua a nota 5 pela nota 6
    5 - Confira se a nota 5 está na lista
    6 - Exiba todas as notas na ordem que foram informadas
    7 - Exiba a terceira nota adicionada
    8 - Exiba a menor nota
    9 - Exiba a maior nota
    10 - Exiba a soma das notas
    11 - Exiba a média das notas
    12 - Remova a nota 0
    13 - Remova a nota da posição 0
    14 - Remova as notas menores que 7
    15 - Apague toda a lista
    16 - confira se a lista está vazia
 */

public class Notas {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Adicionando as notas:");
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Posição da nota 5: " + notas.indexOf(5d));
        
        notas.add(4, 8d);
        System.out.println(notas.toString());

        notas.set(3, 6d);
        System.out.println("Mudando a nota 5 por 6: ");
        System.out.println(notas.toString());

        System.out.println("A nota 5 está na lista? " + notas.contains(5d));

        System.out.println(notas);

        System.out.println("A terceira nota adicionada foi: " + notas.get(2));

        System.out.println("A menor nota foi: " + Collections.min(notas));

        System.out.println("A maior nota foi: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas é: " + soma); 

        System.out.println("A média das notas é: " + (soma/notas.size()));

        System.out.println("Removendo a nota 0:");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Removendo a nota da posição 0:");
        notas.remove(0);
        System.out.println(notas);

        Iterator<Double> menorNotas = notas.iterator();

        while(menorNotas.hasNext()){
            Double next = menorNotas.next();
            if(next < 7){
                menorNotas.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Removendo a lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println("Conferindo se a lista está vazia: " + notas.isEmpty());
        
    }
}
