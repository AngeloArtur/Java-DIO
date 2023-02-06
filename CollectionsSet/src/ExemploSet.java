import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* 
Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
1 - Confira se a nota 5 está no conjunto
2 - Exiba a menor nota
3 - Exiba a maior nota
4 - Exiba a soma das notas
5 - Exiba a média das notas
6 - Remova a nota 0
7 - Remova as notas menores que 7
8 - Exiba as notas na ordem que foram informadas
9 - Exibas as notas em ordem crescente
10 - Apague todo o conjunto
11 - Confira se está vazio
*/ 

public class ExemploSet {
    public static void main(String[] args) throws Exception {
        Set<Double> notas = new HashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Soma das notas com um foreach:");
        Double soma = 0d;
        for (Double double1 : notas) {
            soma += double1;
        }
        System.out.println(soma);
        
        System.out.println("Soma das notas com um iterator:");
        Iterator<Double> iterator = notas.iterator();
        Double soma2 = 0d;
        while(iterator.hasNext()){
            Double next =iterator.next();
            soma2 += next;
        }
        System.out.println(soma2);

        System.out.println("A média das notas é: " + (soma2/notas.size()));
    
        System.out.println("Removendo a nota 0:");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Removendo notas menores que 7:");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }

        System.out.println(notas);
    
        System.out.println("Exiba as notas na ordem que foram informadas:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exibas as notas em ordem crescente:");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3); 
    
        System.out.println("Apague todo o conjunto:");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}